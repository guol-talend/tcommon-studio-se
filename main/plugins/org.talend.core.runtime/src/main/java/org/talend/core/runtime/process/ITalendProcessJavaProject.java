// ============================================================================
//
// Copyright (C) 2006-2015 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.core.runtime.process;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jdt.core.IJavaProject;

/**
 * created by ggu on 26 Jan 2015 Detailled comment
 *
 */
public interface ITalendProcessJavaProject {

    IJavaProject getJavaProject();

    IProject getProject();

    /**
     * src/main/java
     */
    IFolder getSrcFolder();

    /**
     * src/test/java
     */
    IFolder getTestSrcFolder();

    /**
     * src/main/resources
     */
    IFolder getResourcesFolder();

    /**
     * src/test/resources
     */
    IFolder getTestResourcesFolder();

    /**
     * lib
     */
    IFolder getLibFolder();

    /**
     * target/classes
     */
    IFolder getOutputFolder();

    /**
     * 
     * create sub folder under src/main/java.
     */
    IFolder getSrcSubFolder(IProgressMonitor monitor, String path);

    /**
     * 
     * create sub folder under src/main/resources.
     */
    IFolder getResourceSubFolder(IProgressMonitor monitor, String path);

    /**
     * will clean the files or folders under this folder.
     */
    boolean cleanFolder(IProgressMonitor monitor, IFolder folder) throws CoreException;

}
