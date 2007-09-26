// ============================================================================
//
// Talend Community Edition
//
// Copyright (C) 2006-2007 Talend - www.talend.com
//
// This library is free software; you can redistribute it and/or
// modify it under the terms of the GNU Lesser General Public
// License as published by the Free Software Foundation; either
// version 2.1 of the License.
//
// This library is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
// Lesser General Public License for more details.
//
// You should have received a copy of the GNU General Public License
// along with this program; if not, write to the Free Software
// Foundation, Inc., 675 Mass Ave, Cambridge, MA 02139, USA.
//
// ============================================================================
package org.talend.core.ui.viewer.java;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.jdt.internal.ui.JavaPlugin;
import org.eclipse.jdt.internal.ui.javaeditor.CompilationUnitEditor;
import org.eclipse.jdt.internal.ui.javaeditor.JavaSourceViewer;
import org.eclipse.jdt.ui.PreferenceConstants;
import org.eclipse.jdt.ui.text.IJavaPartitions;
import org.eclipse.jdt.ui.text.JavaTextTools;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.jface.text.Document;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.source.IOverviewRuler;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.jface.text.source.IVerticalRuler;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.internal.texteditor.LineNumberColumn;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.texteditor.rulers.IColumnSupport;
import org.eclipse.ui.texteditor.rulers.RulerColumnDescriptor;
import org.eclipse.ui.texteditor.rulers.RulerColumnRegistry;
import org.talend.core.CorePlugin;
import org.talend.core.language.LanguageManager;

/**
 * DOC nrousseau class global comment. Detailled comment <br/>
 * 
 */
/**
 * DOC nrousseau class global comment. Detailled comment <br/>
 * 
 */
public class TalendJavaSourceViewer extends JavaSourceViewer {

    public static final String VIEWER_CLASS_NAME = "TalendJavaSourceViewer";

    private TalendJavaSourceViewer(Composite parent, IVerticalRuler verticalRuler, IOverviewRuler overviewRuler,
            boolean showAnnotationsOverview, int styles, IPreferenceStore store) {
        super(parent, verticalRuler, overviewRuler, showAnnotationsOverview, styles, store);
    }

    /**
     * This viewer is for test only.
     * 
     * @param composite
     * @param text
     * @param styles
     * @return
     */
    public static ISourceViewer createViewer2(Composite composite, String text, int styles) {
        CompilationUnitEditor editor = new HiddenJavaEditor();
        StringBuffer buff = new StringBuffer();
        buff.append("package internal;\n\n");
        buff.append("public class " + VIEWER_CLASS_NAME + " {\n");
        buff.append("private static final java.util.Map<String, Object> globalMap = new java.util.HashMap<String, Object>();\n");
        buff.append("public Object myFunction(){\n");
        buff.append("return ");
        int length = buff.toString().length();
        buff.append(text);
        Document doc = new Document(buff.toString());
        editor.setInput(createFileEditorInput(doc));
        composite.setLayout(new FillLayout());
        editor.createPartControl(composite);
        IColumnSupport columnSupport = (IColumnSupport) editor.getAdapter(IColumnSupport.class);
        RulerColumnDescriptor lineNumberColumnDescriptor = RulerColumnRegistry.getDefault().getColumnDescriptor(
                LineNumberColumn.ID);
        if (lineNumberColumnDescriptor != null)
            columnSupport.setColumnVisible(lineNumberColumnDescriptor, false);

        editor.getViewer().setVisibleRegion(length, text.length());
        final JavaSourceViewer viewer = (JavaSourceViewer) editor.getViewer();

        viewer.enableOperation(ISourceViewer.CONTENTASSIST_PROPOSALS, true);
        viewer.enableOperation(ISourceViewer.QUICK_ASSIST, false);

        viewer.getTextWidget().addKeyListener(new KeyAdapter() {

            /*
             * (non-Javadoc)
             * 
             * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
             */
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.stateMask == SWT.CTRL && e.keyCode == 32) {
                    viewer.doOperation(ISourceViewer.CONTENTASSIST_PROPOSALS);
                } else if (e.stateMask == SWT.CTRL && e.stateMask == SWT.SHIFT && e.keyCode == 'F') {
                    viewer.doOperation(ISourceViewer.FORMAT);
                }
            }
        });

        return viewer;
    }

    public static ISourceViewer createViewer(Composite composite, String text, int styles) {
        IPreferenceStore store = JavaPlugin.getDefault().getCombinedPreferenceStore();
        final TalendJavaSourceViewer viewer = new TalendJavaSourceViewer(composite, null, null, false, styles, store);
        StringBuffer buff = new StringBuffer();
        buff.append("package internal;\n\n");
        buff.append("public class " + VIEWER_CLASS_NAME + " {\n");
        buff.append("public void myFunction(){\n");
        buff.append(text);
        Document doc = new Document(buff.toString());

        viewer.setDocument(doc, buff.toString().length() - text.length(), text.length());

        JavaTextTools tools = JavaPlugin.getDefault().getJavaTextTools();
        tools.setupJavaDocumentPartitioner(viewer.getDocument(), IJavaPartitions.JAVA_PARTITIONING);
        CompilationUnitEditor editor = new HiddenJavaEditor(viewer);
        TalendJavaViewerConfiguration config = new TalendJavaViewerConfiguration(tools.getColorManager(), store, editor);
        viewer.configure(config);

        viewer.getTextWidget().setFont(JFaceResources.getFont(PreferenceConstants.EDITOR_TEXT_FONT));

        viewer.enableOperation(ISourceViewer.CONTENTASSIST_PROPOSALS, true);
        viewer.setEditable(true);
        viewer.getControl().setLayoutData(new GridData(GridData.FILL_BOTH));

        viewer.getTextWidget().addKeyListener(new KeyAdapter() {

            /*
             * (non-Javadoc)
             * 
             * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
             */
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.stateMask == SWT.CTRL && e.keyCode == 32) {
                    viewer.doOperation(ISourceViewer.CONTENTASSIST_PROPOSALS);
                } else if (e.stateMask == SWT.CTRL && e.stateMask == SWT.SHIFT && e.keyCode == 'F') {
                    viewer.doOperation(ISourceViewer.FORMAT);
                }
            }
        });

        return viewer;
    }

    private static FileEditorInput createFileEditorInput(IDocument doc) {
        FileEditorInput input = null;
        IPath path = new Path("src/internal/" + TalendJavaSourceViewer.VIEWER_CLASS_NAME + ".java");

        IFile file = null;
        try {

            file = CorePlugin.getDefault().getRunProcessService().getProject(LanguageManager.getCurrentLanguage()).getFile(path);
            String newCode = doc.get() + ";\n}\n}";
            InputStream codeStream = new ByteArrayInputStream(newCode.getBytes());
            if (!file.exists()) {
                file.create(codeStream, true, null);
            } else {
                file.setContents(codeStream, true, false, null);
            }
            input = new FileEditorInput(file);
        } catch (CoreException e) {
            e.printStackTrace();
        }
        return input;
    }
}
