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
package org.talend.repository.viewer.sorter;

import org.talend.repository.model.RepositoryNode;
import org.talend.repository.tester.CodeNodeTester;
import org.talend.repository.view.sorter.RepositoryNodeCompareSorter;

/**
 * DOC ggu class global comment. Detailled comment
 */
public class CodeRepositoryNodeSorter extends RepositoryNodeCompareSorter {

    protected CodeNodeTester codeTester = new CodeNodeTester();

    @Override
    protected void sortChildren(RepositoryNode parent, Object[] children) {
        if (codeTester.isCodeTopNode(parent)) {
            super.sortChildren(parent, children);
        }
    }

}
