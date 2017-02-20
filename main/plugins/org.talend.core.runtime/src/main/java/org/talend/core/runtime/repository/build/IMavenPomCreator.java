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
package org.talend.core.runtime.repository.build;

import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;

/**
 * DOC ggu class global comment. Detailled comment
 */
public interface IMavenPomCreator {

    void setOverwrite(boolean overwrite);

    void setArgumentsMap(Map<String, Object> argumentsMap);

    void create(IProgressMonitor monitor) throws Exception;
}
