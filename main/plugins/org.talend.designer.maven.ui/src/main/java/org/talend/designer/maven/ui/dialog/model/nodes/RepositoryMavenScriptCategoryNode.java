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
package org.talend.designer.maven.ui.dialog.model.nodes;

import org.talend.designer.maven.ui.dialog.model.EMavenScriptCategory;

/**
 * DOC ggu class global comment. Detailled comment
 */
public class RepositoryMavenScriptCategoryNode extends RepositoryPreferenceNode {

    public RepositoryMavenScriptCategoryNode(String id, EMavenScriptCategory category) {
        super(id, category.getLabel(), category.getImageDesc(), null);
    }

}
