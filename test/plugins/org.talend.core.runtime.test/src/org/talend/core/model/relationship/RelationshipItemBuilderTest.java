// ============================================================================
//
// Copyright (C) 2006-2016 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.core.model.relationship;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.talend.core.model.general.Project;
import org.talend.core.model.properties.ProcessItem;
import org.talend.core.model.properties.PropertiesFactory;
import org.talend.core.model.properties.Property;
import org.talend.core.runtime.CoreRuntimePlugin;
import org.talend.designer.core.model.utils.emf.talendfile.ContextParameterType;
import org.talend.designer.core.model.utils.emf.talendfile.ContextType;
import org.talend.designer.core.model.utils.emf.talendfile.ProcessType;
import org.talend.designer.core.model.utils.emf.talendfile.TalendFileFactory;
import org.talend.repository.ProjectManager;
import org.talend.repository.model.IProxyRepositoryFactory;

/**
 * created by cmeng on May 10, 2016
 * Detailled comment
 *
 */
public class RelationshipItemBuilderTest {
    
    /**
     * For TUP-4175
     */
    @Test
    public void testSaveRelations() {
        IProxyRepositoryFactory proxyRepositoryFactory = CoreRuntimePlugin.getInstance().getProxyRepositoryFactory();
        Property property = PropertiesFactory.eINSTANCE.createProperty();
        ProcessItem item = PropertiesFactory.eINSTANCE.createProcessItem();
        ProcessType process = TalendFileFactory.eINSTANCE.createProcessType();
        item.setProperty(property);
        item.setProcess(process);
        property.setId(proxyRepositoryFactory.getNextId());
        property.setLabel("job1");
        property.setVersion("0.1");

        List<ContextType> contexts = new ArrayList<ContextType>();

        ContextType ct = TalendFileFactory.eINSTANCE.createContextType();
        ct.setName("default"); //$NON-NLS-1$

        ContextParameterType cpt = TalendFileFactory.eINSTANCE.createContextParameterType();
        cpt.setName("abc"); //$NON-NLS-1$
        cpt.setValue("123"); //$NON-NLS-1$

        ct.getContextParameter().add(cpt);
        contexts.add(ct);
        process.getContext().addAll(contexts);
        
        
        Property property2 = PropertiesFactory.eINSTANCE.createProperty();
        ProcessItem item2 = PropertiesFactory.eINSTANCE.createProcessItem();
        ProcessType process2 = TalendFileFactory.eINSTANCE.createProcessType();
        item2.setProperty(property2);
        item2.setProcess(process2);
        property2.setId(proxyRepositoryFactory.getNextId());
        property2.setLabel("job2");
        property2.setVersion("0.1");

        List<ContextType> contexts2 = new ArrayList<ContextType>();

        ContextType ct2 = TalendFileFactory.eINSTANCE.createContextType();
        ct2.setName("default"); //$NON-NLS-1$

        ContextParameterType cpt2 = TalendFileFactory.eINSTANCE.createContextParameterType();
        cpt2.setName("abc"); //$NON-NLS-1$
        cpt2.setValue("123"); //$NON-NLS-1$

        ct2.getContextParameter().add(cpt2);
        contexts.add(ct2);
        process2.getContext().addAll(contexts2);
        
        Project currentProject = ProjectManager.getInstance().getCurrentProject();
        
        RelationshipItemBuilder relationBuilder = RelationshipItemBuilder.getInstance(currentProject,true);
        relationBuilder.addOrUpdateItem(item);
        relationBuilder.addOrUpdateItem(item2);
        relationBuilder.saveRelations();
        currentProject = relationBuilder.getAimProject();
        int shouldBeSize = relationBuilder.getCurrentProjectItemsRelations().size();
        int currentSize = currentProject.getEmfProject().getItemsRelations().size();
        assert(shouldBeSize==currentSize);
        
        relationBuilder.removeItemRelations(item2);
        relationBuilder.saveRelations();
        shouldBeSize = relationBuilder.getCurrentProjectItemsRelations().size();
        currentSize = currentProject.getEmfProject().getItemsRelations().size();
        assert(shouldBeSize==currentSize);
    }

    /**
     * For TDI-36019
     */
    @Test
    public void testGetInstance() {
        String projectName = "MAIN"; //$NON-NLS-1$
        Project project = new Project(projectName);
        project.setTechnicalLabel(projectName);
        RelationshipItemBuilder relationshipItemBuilder = RelationshipItemBuilder.getInstance(project, true);

        assert (project == relationshipItemBuilder.getAimProject());

        Project project2 = new Project(projectName);
        project2.setTechnicalLabel(projectName);
        assert (relationshipItemBuilder == RelationshipItemBuilder.getInstance(project2, true));
        assert (relationshipItemBuilder.getAimProject() == project2);

        assert (ProjectManager.getInstance().getCurrentProject() == RelationshipItemBuilder.getInstance().getAimProject());

    }
}
