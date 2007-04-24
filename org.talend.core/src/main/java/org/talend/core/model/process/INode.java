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
package org.talend.core.model.process;

import java.util.List;

import org.eclipse.draw2d.geometry.Point;
import org.talend.core.model.components.IComponent;
import org.talend.core.model.components.IODataComponent;
import org.talend.core.model.metadata.IMetadataTable;

/**
 * DOC nrousseau class global comment. Detailled comment <br/>
 * 
 * $Id$
 */
public interface INode extends IElement {

    /**
     * Gives the unique name of the node.
     * 
     * @return unique name
     */
    public String getUniqueName();

    /**
     * Return the start status of this node.
     * 
     * @return
     */
    public boolean isStart();

    /**
     * Return the activate status of this node.
     * 
     * @return
     */
    public boolean isActivate();

    /**
     * Return true if the node is the start of a sub process.
     * 
     * @return
     */
    public boolean isSubProcessStart();

    /**
     * Gives all incoming connections (only).
     * 
     * @return List of Connection
     */
    public List<? extends IConnection> getIncomingConnections();

    /**
     * Gives all outgoing connections (only).
     * 
     * @return List of Connection
     */
    public List<? extends IConnection> getOutgoingConnections();

    public String getPluginFullName();

    public Boolean hasConditionalOutputs();
    
    /**
     * Set performance data on this node.
     * 
     * @param perfData Performance data (string to be parsed).
     */
    void setPerformanceData(String perfData);

    /**
     * Return list of Metadatas.
     * 
     * @return
     */
    public List<IMetadataTable> getMetadataList();

    List<? extends INodeReturn> getReturns();

    public IProcess getProcess();

    public void setProcess(IProcess process);

    public IComponent getComponent();

    public void setComponent(IComponent component);

    public IExternalNode getExternalNode();

    public void metadataInputChanged(IODataComponent dataComponent, String connectionToApply);

    public void metadataOutputChanged(IODataComponent dataComponent, String connectionToApply);
    
    /**
     * Will return the first item of the subprocess. If "withCondition" is true, if there is links from type RunIf /
     * RunAfter / RunBefore, it will return the first element found. If "withCondition" is false, it will return the
     * first element with no active link from type Main/Ref/Iterate.<br>
     * 
     * @param withCondition
     * @return Start Node found.
     */
    public INode getSubProcessStartNode(boolean withConditions);
    
    /**
     * Gets current node's position.
     * @return
     */
    public Point getLocation();
    
    public boolean isThereLinkWithHash();
    
    public List<? extends IConnection> getOutgoingSortedConnections();
    
    public List<? extends IConnection> getMainOutgoingConnections();
}
