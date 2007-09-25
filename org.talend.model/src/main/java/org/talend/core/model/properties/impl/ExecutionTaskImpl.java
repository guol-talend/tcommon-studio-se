/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.core.model.properties.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.talend.core.model.properties.ExecutionServer;
import org.talend.core.model.properties.ExecutionTask;
import org.talend.core.model.properties.ProcessItem;
import org.talend.core.model.properties.Project;
import org.talend.core.model.properties.PropertiesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Execution Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.talend.core.model.properties.impl.ExecutionTaskImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ExecutionTaskImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ExecutionTaskImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ExecutionTaskImpl#getExecutionServer <em>Execution Server</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ExecutionTaskImpl#getProject <em>Project</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ExecutionTaskImpl#getProcessItem <em>Process Item</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ExecutionTaskImpl#getContext <em>Context</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ExecutionTaskImpl#getJobVersion <em>Job Version</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ExecutionTaskImpl#isActive <em>Active</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ExecutionTaskImpl#getIdQuartzJob <em>Id Quartz Job</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ExecutionTaskImpl#getLastScriptGenerationDate <em>Last Script Generation Date</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ExecutionTaskImpl#getIdRemoteJob <em>Id Remote Job</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ExecutionTaskImpl#getIdRemoteJobExecution <em>Id Remote Job Execution</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ExecutionTaskImpl#getChecksumArchive <em>Checksum Archive</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ExecutionTaskImpl#getJobScriptArchive <em>Job Script Archive</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ExecutionTaskImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ExecutionTaskImpl#isProcessingState <em>Processing State</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.ExecutionTaskImpl#getErrorStatus <em>Error Status</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExecutionTaskImpl extends EObjectImpl implements ExecutionTask {
    /**
     * The default value of the '{@link #getId() <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getId()
     * @generated
     * @ordered
     */
    protected static final int ID_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getId()
     * @generated
     * @ordered
     */
    protected int id = ID_EDEFAULT;

    /**
     * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLabel()
     * @generated
     * @ordered
     */
    protected static final String LABEL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLabel()
     * @generated
     * @ordered
     */
    protected String label = LABEL_EDEFAULT;

    /**
     * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDescription()
     * @generated
     * @ordered
     */
    protected static final String DESCRIPTION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDescription()
     * @generated
     * @ordered
     */
    protected String description = DESCRIPTION_EDEFAULT;

    /**
     * The cached value of the '{@link #getExecutionServer() <em>Execution Server</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExecutionServer()
     * @generated
     * @ordered
     */
    protected ExecutionServer executionServer;

    /**
     * The cached value of the '{@link #getProject() <em>Project</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProject()
     * @generated
     * @ordered
     */
    protected Project project;

    /**
     * The cached value of the '{@link #getProcessItem() <em>Process Item</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProcessItem()
     * @generated
     * @ordered
     */
    protected ProcessItem processItem;

    /**
     * The default value of the '{@link #getContext() <em>Context</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getContext()
     * @generated
     * @ordered
     */
    protected static final String CONTEXT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getContext() <em>Context</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getContext()
     * @generated
     * @ordered
     */
    protected String context = CONTEXT_EDEFAULT;

    /**
     * The default value of the '{@link #getJobVersion() <em>Job Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getJobVersion()
     * @generated
     * @ordered
     */
    protected static final String JOB_VERSION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getJobVersion() <em>Job Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getJobVersion()
     * @generated
     * @ordered
     */
    protected String jobVersion = JOB_VERSION_EDEFAULT;

    /**
     * The default value of the '{@link #isActive() <em>Active</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isActive()
     * @generated
     * @ordered
     */
    protected static final boolean ACTIVE_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isActive() <em>Active</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isActive()
     * @generated
     * @ordered
     */
    protected boolean active = ACTIVE_EDEFAULT;

    /**
     * The default value of the '{@link #getIdQuartzJob() <em>Id Quartz Job</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIdQuartzJob()
     * @generated
     * @ordered
     */
    protected static final int ID_QUARTZ_JOB_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getIdQuartzJob() <em>Id Quartz Job</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIdQuartzJob()
     * @generated
     * @ordered
     */
    protected int idQuartzJob = ID_QUARTZ_JOB_EDEFAULT;

    /**
     * The default value of the '{@link #getLastScriptGenerationDate() <em>Last Script Generation Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLastScriptGenerationDate()
     * @generated
     * @ordered
     */
    protected static final Date LAST_SCRIPT_GENERATION_DATE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLastScriptGenerationDate() <em>Last Script Generation Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLastScriptGenerationDate()
     * @generated
     * @ordered
     */
    protected Date lastScriptGenerationDate = LAST_SCRIPT_GENERATION_DATE_EDEFAULT;

    /**
     * The default value of the '{@link #getIdRemoteJob() <em>Id Remote Job</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIdRemoteJob()
     * @generated
     * @ordered
     */
    protected static final String ID_REMOTE_JOB_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getIdRemoteJob() <em>Id Remote Job</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIdRemoteJob()
     * @generated
     * @ordered
     */
    protected String idRemoteJob = ID_REMOTE_JOB_EDEFAULT;

    /**
     * The default value of the '{@link #getIdRemoteJobExecution() <em>Id Remote Job Execution</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIdRemoteJobExecution()
     * @generated
     * @ordered
     */
    protected static final String ID_REMOTE_JOB_EXECUTION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getIdRemoteJobExecution() <em>Id Remote Job Execution</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIdRemoteJobExecution()
     * @generated
     * @ordered
     */
    protected String idRemoteJobExecution = ID_REMOTE_JOB_EXECUTION_EDEFAULT;

    /**
     * The default value of the '{@link #getChecksumArchive() <em>Checksum Archive</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getChecksumArchive()
     * @generated
     * @ordered
     */
    protected static final String CHECKSUM_ARCHIVE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getChecksumArchive() <em>Checksum Archive</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getChecksumArchive()
     * @generated
     * @ordered
     */
    protected String checksumArchive = CHECKSUM_ARCHIVE_EDEFAULT;

    /**
     * The default value of the '{@link #getJobScriptArchive() <em>Job Script Archive</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getJobScriptArchive()
     * @generated
     * @ordered
     */
    protected static final byte[] JOB_SCRIPT_ARCHIVE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getJobScriptArchive() <em>Job Script Archive</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getJobScriptArchive()
     * @generated
     * @ordered
     */
    protected byte[] jobScriptArchive = JOB_SCRIPT_ARCHIVE_EDEFAULT;

    /**
     * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStatus()
     * @generated
     * @ordered
     */
    protected static final String STATUS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStatus()
     * @generated
     * @ordered
     */
    protected String status = STATUS_EDEFAULT;

    /**
     * The default value of the '{@link #isProcessingState() <em>Processing State</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isProcessingState()
     * @generated
     * @ordered
     */
    protected static final boolean PROCESSING_STATE_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isProcessingState() <em>Processing State</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isProcessingState()
     * @generated
     * @ordered
     */
    protected boolean processingState = PROCESSING_STATE_EDEFAULT;

    /**
     * The default value of the '{@link #getErrorStatus() <em>Error Status</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getErrorStatus()
     * @generated
     * @ordered
     */
    protected static final String ERROR_STATUS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getErrorStatus() <em>Error Status</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getErrorStatus()
     * @generated
     * @ordered
     */
    protected String errorStatus = ERROR_STATUS_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ExecutionTaskImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EClass eStaticClass() {
        return PropertiesPackage.Literals.EXECUTION_TASK;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getId() {
        return id;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setId(int newId) {
        int oldId = id;
        id = newId;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.EXECUTION_TASK__ID, oldId, id));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getLabel() {
        return label;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLabel(String newLabel) {
        String oldLabel = label;
        label = newLabel;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.EXECUTION_TASK__LABEL, oldLabel, label));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getDescription() {
        return description;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDescription(String newDescription) {
        String oldDescription = description;
        description = newDescription;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.EXECUTION_TASK__DESCRIPTION, oldDescription, description));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExecutionServer getExecutionServer() {
        if (executionServer != null && executionServer.eIsProxy()) {
            InternalEObject oldExecutionServer = (InternalEObject)executionServer;
            executionServer = (ExecutionServer)eResolveProxy(oldExecutionServer);
            if (executionServer != oldExecutionServer) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, PropertiesPackage.EXECUTION_TASK__EXECUTION_SERVER, oldExecutionServer, executionServer));
            }
        }
        return executionServer;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExecutionServer basicGetExecutionServer() {
        return executionServer;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setExecutionServer(ExecutionServer newExecutionServer) {
        ExecutionServer oldExecutionServer = executionServer;
        executionServer = newExecutionServer;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.EXECUTION_TASK__EXECUTION_SERVER, oldExecutionServer, executionServer));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Project getProject() {
        if (project != null && project.eIsProxy()) {
            InternalEObject oldProject = (InternalEObject)project;
            project = (Project)eResolveProxy(oldProject);
            if (project != oldProject) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, PropertiesPackage.EXECUTION_TASK__PROJECT, oldProject, project));
            }
        }
        return project;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Project basicGetProject() {
        return project;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setProject(Project newProject) {
        Project oldProject = project;
        project = newProject;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.EXECUTION_TASK__PROJECT, oldProject, project));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ProcessItem getProcessItem() {
        if (processItem != null && processItem.eIsProxy()) {
            InternalEObject oldProcessItem = (InternalEObject)processItem;
            processItem = (ProcessItem)eResolveProxy(oldProcessItem);
            if (processItem != oldProcessItem) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, PropertiesPackage.EXECUTION_TASK__PROCESS_ITEM, oldProcessItem, processItem));
            }
        }
        return processItem;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ProcessItem basicGetProcessItem() {
        return processItem;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setProcessItem(ProcessItem newProcessItem) {
        ProcessItem oldProcessItem = processItem;
        processItem = newProcessItem;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.EXECUTION_TASK__PROCESS_ITEM, oldProcessItem, processItem));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getContext() {
        return context;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setContext(String newContext) {
        String oldContext = context;
        context = newContext;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.EXECUTION_TASK__CONTEXT, oldContext, context));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getJobVersion() {
        return jobVersion;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setJobVersion(String newJobVersion) {
        String oldJobVersion = jobVersion;
        jobVersion = newJobVersion;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.EXECUTION_TASK__JOB_VERSION, oldJobVersion, jobVersion));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isActive() {
        return active;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setActive(boolean newActive) {
        boolean oldActive = active;
        active = newActive;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.EXECUTION_TASK__ACTIVE, oldActive, active));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getIdQuartzJob() {
        return idQuartzJob;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIdQuartzJob(int newIdQuartzJob) {
        int oldIdQuartzJob = idQuartzJob;
        idQuartzJob = newIdQuartzJob;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.EXECUTION_TASK__ID_QUARTZ_JOB, oldIdQuartzJob, idQuartzJob));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Date getLastScriptGenerationDate() {
        return lastScriptGenerationDate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLastScriptGenerationDate(Date newLastScriptGenerationDate) {
        Date oldLastScriptGenerationDate = lastScriptGenerationDate;
        lastScriptGenerationDate = newLastScriptGenerationDate;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.EXECUTION_TASK__LAST_SCRIPT_GENERATION_DATE, oldLastScriptGenerationDate, lastScriptGenerationDate));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getIdRemoteJob() {
        return idRemoteJob;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIdRemoteJob(String newIdRemoteJob) {
        String oldIdRemoteJob = idRemoteJob;
        idRemoteJob = newIdRemoteJob;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.EXECUTION_TASK__ID_REMOTE_JOB, oldIdRemoteJob, idRemoteJob));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getIdRemoteJobExecution() {
        return idRemoteJobExecution;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIdRemoteJobExecution(String newIdRemoteJobExecution) {
        String oldIdRemoteJobExecution = idRemoteJobExecution;
        idRemoteJobExecution = newIdRemoteJobExecution;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.EXECUTION_TASK__ID_REMOTE_JOB_EXECUTION, oldIdRemoteJobExecution, idRemoteJobExecution));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getChecksumArchive() {
        return checksumArchive;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setChecksumArchive(String newChecksumArchive) {
        String oldChecksumArchive = checksumArchive;
        checksumArchive = newChecksumArchive;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.EXECUTION_TASK__CHECKSUM_ARCHIVE, oldChecksumArchive, checksumArchive));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public byte[] getJobScriptArchive() {
        return jobScriptArchive;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setJobScriptArchive(byte[] newJobScriptArchive) {
        byte[] oldJobScriptArchive = jobScriptArchive;
        jobScriptArchive = newJobScriptArchive;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.EXECUTION_TASK__JOB_SCRIPT_ARCHIVE, oldJobScriptArchive, jobScriptArchive));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getStatus() {
        return status;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setStatus(String newStatus) {
        String oldStatus = status;
        status = newStatus;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.EXECUTION_TASK__STATUS, oldStatus, status));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isProcessingState() {
        return processingState;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setProcessingState(boolean newProcessingState) {
        boolean oldProcessingState = processingState;
        processingState = newProcessingState;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.EXECUTION_TASK__PROCESSING_STATE, oldProcessingState, processingState));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getErrorStatus() {
        return errorStatus;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setErrorStatus(String newErrorStatus) {
        String oldErrorStatus = errorStatus;
        errorStatus = newErrorStatus;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.EXECUTION_TASK__ERROR_STATUS, oldErrorStatus, errorStatus));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case PropertiesPackage.EXECUTION_TASK__ID:
                return new Integer(getId());
            case PropertiesPackage.EXECUTION_TASK__LABEL:
                return getLabel();
            case PropertiesPackage.EXECUTION_TASK__DESCRIPTION:
                return getDescription();
            case PropertiesPackage.EXECUTION_TASK__EXECUTION_SERVER:
                if (resolve) return getExecutionServer();
                return basicGetExecutionServer();
            case PropertiesPackage.EXECUTION_TASK__PROJECT:
                if (resolve) return getProject();
                return basicGetProject();
            case PropertiesPackage.EXECUTION_TASK__PROCESS_ITEM:
                if (resolve) return getProcessItem();
                return basicGetProcessItem();
            case PropertiesPackage.EXECUTION_TASK__CONTEXT:
                return getContext();
            case PropertiesPackage.EXECUTION_TASK__JOB_VERSION:
                return getJobVersion();
            case PropertiesPackage.EXECUTION_TASK__ACTIVE:
                return isActive() ? Boolean.TRUE : Boolean.FALSE;
            case PropertiesPackage.EXECUTION_TASK__ID_QUARTZ_JOB:
                return new Integer(getIdQuartzJob());
            case PropertiesPackage.EXECUTION_TASK__LAST_SCRIPT_GENERATION_DATE:
                return getLastScriptGenerationDate();
            case PropertiesPackage.EXECUTION_TASK__ID_REMOTE_JOB:
                return getIdRemoteJob();
            case PropertiesPackage.EXECUTION_TASK__ID_REMOTE_JOB_EXECUTION:
                return getIdRemoteJobExecution();
            case PropertiesPackage.EXECUTION_TASK__CHECKSUM_ARCHIVE:
                return getChecksumArchive();
            case PropertiesPackage.EXECUTION_TASK__JOB_SCRIPT_ARCHIVE:
                return getJobScriptArchive();
            case PropertiesPackage.EXECUTION_TASK__STATUS:
                return getStatus();
            case PropertiesPackage.EXECUTION_TASK__PROCESSING_STATE:
                return isProcessingState() ? Boolean.TRUE : Boolean.FALSE;
            case PropertiesPackage.EXECUTION_TASK__ERROR_STATUS:
                return getErrorStatus();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case PropertiesPackage.EXECUTION_TASK__ID:
                setId(((Integer)newValue).intValue());
                return;
            case PropertiesPackage.EXECUTION_TASK__LABEL:
                setLabel((String)newValue);
                return;
            case PropertiesPackage.EXECUTION_TASK__DESCRIPTION:
                setDescription((String)newValue);
                return;
            case PropertiesPackage.EXECUTION_TASK__EXECUTION_SERVER:
                setExecutionServer((ExecutionServer)newValue);
                return;
            case PropertiesPackage.EXECUTION_TASK__PROJECT:
                setProject((Project)newValue);
                return;
            case PropertiesPackage.EXECUTION_TASK__PROCESS_ITEM:
                setProcessItem((ProcessItem)newValue);
                return;
            case PropertiesPackage.EXECUTION_TASK__CONTEXT:
                setContext((String)newValue);
                return;
            case PropertiesPackage.EXECUTION_TASK__JOB_VERSION:
                setJobVersion((String)newValue);
                return;
            case PropertiesPackage.EXECUTION_TASK__ACTIVE:
                setActive(((Boolean)newValue).booleanValue());
                return;
            case PropertiesPackage.EXECUTION_TASK__ID_QUARTZ_JOB:
                setIdQuartzJob(((Integer)newValue).intValue());
                return;
            case PropertiesPackage.EXECUTION_TASK__LAST_SCRIPT_GENERATION_DATE:
                setLastScriptGenerationDate((Date)newValue);
                return;
            case PropertiesPackage.EXECUTION_TASK__ID_REMOTE_JOB:
                setIdRemoteJob((String)newValue);
                return;
            case PropertiesPackage.EXECUTION_TASK__ID_REMOTE_JOB_EXECUTION:
                setIdRemoteJobExecution((String)newValue);
                return;
            case PropertiesPackage.EXECUTION_TASK__CHECKSUM_ARCHIVE:
                setChecksumArchive((String)newValue);
                return;
            case PropertiesPackage.EXECUTION_TASK__JOB_SCRIPT_ARCHIVE:
                setJobScriptArchive((byte[])newValue);
                return;
            case PropertiesPackage.EXECUTION_TASK__STATUS:
                setStatus((String)newValue);
                return;
            case PropertiesPackage.EXECUTION_TASK__PROCESSING_STATE:
                setProcessingState(((Boolean)newValue).booleanValue());
                return;
            case PropertiesPackage.EXECUTION_TASK__ERROR_STATUS:
                setErrorStatus((String)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void eUnset(int featureID) {
        switch (featureID) {
            case PropertiesPackage.EXECUTION_TASK__ID:
                setId(ID_EDEFAULT);
                return;
            case PropertiesPackage.EXECUTION_TASK__LABEL:
                setLabel(LABEL_EDEFAULT);
                return;
            case PropertiesPackage.EXECUTION_TASK__DESCRIPTION:
                setDescription(DESCRIPTION_EDEFAULT);
                return;
            case PropertiesPackage.EXECUTION_TASK__EXECUTION_SERVER:
                setExecutionServer((ExecutionServer)null);
                return;
            case PropertiesPackage.EXECUTION_TASK__PROJECT:
                setProject((Project)null);
                return;
            case PropertiesPackage.EXECUTION_TASK__PROCESS_ITEM:
                setProcessItem((ProcessItem)null);
                return;
            case PropertiesPackage.EXECUTION_TASK__CONTEXT:
                setContext(CONTEXT_EDEFAULT);
                return;
            case PropertiesPackage.EXECUTION_TASK__JOB_VERSION:
                setJobVersion(JOB_VERSION_EDEFAULT);
                return;
            case PropertiesPackage.EXECUTION_TASK__ACTIVE:
                setActive(ACTIVE_EDEFAULT);
                return;
            case PropertiesPackage.EXECUTION_TASK__ID_QUARTZ_JOB:
                setIdQuartzJob(ID_QUARTZ_JOB_EDEFAULT);
                return;
            case PropertiesPackage.EXECUTION_TASK__LAST_SCRIPT_GENERATION_DATE:
                setLastScriptGenerationDate(LAST_SCRIPT_GENERATION_DATE_EDEFAULT);
                return;
            case PropertiesPackage.EXECUTION_TASK__ID_REMOTE_JOB:
                setIdRemoteJob(ID_REMOTE_JOB_EDEFAULT);
                return;
            case PropertiesPackage.EXECUTION_TASK__ID_REMOTE_JOB_EXECUTION:
                setIdRemoteJobExecution(ID_REMOTE_JOB_EXECUTION_EDEFAULT);
                return;
            case PropertiesPackage.EXECUTION_TASK__CHECKSUM_ARCHIVE:
                setChecksumArchive(CHECKSUM_ARCHIVE_EDEFAULT);
                return;
            case PropertiesPackage.EXECUTION_TASK__JOB_SCRIPT_ARCHIVE:
                setJobScriptArchive(JOB_SCRIPT_ARCHIVE_EDEFAULT);
                return;
            case PropertiesPackage.EXECUTION_TASK__STATUS:
                setStatus(STATUS_EDEFAULT);
                return;
            case PropertiesPackage.EXECUTION_TASK__PROCESSING_STATE:
                setProcessingState(PROCESSING_STATE_EDEFAULT);
                return;
            case PropertiesPackage.EXECUTION_TASK__ERROR_STATUS:
                setErrorStatus(ERROR_STATUS_EDEFAULT);
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case PropertiesPackage.EXECUTION_TASK__ID:
                return id != ID_EDEFAULT;
            case PropertiesPackage.EXECUTION_TASK__LABEL:
                return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
            case PropertiesPackage.EXECUTION_TASK__DESCRIPTION:
                return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
            case PropertiesPackage.EXECUTION_TASK__EXECUTION_SERVER:
                return executionServer != null;
            case PropertiesPackage.EXECUTION_TASK__PROJECT:
                return project != null;
            case PropertiesPackage.EXECUTION_TASK__PROCESS_ITEM:
                return processItem != null;
            case PropertiesPackage.EXECUTION_TASK__CONTEXT:
                return CONTEXT_EDEFAULT == null ? context != null : !CONTEXT_EDEFAULT.equals(context);
            case PropertiesPackage.EXECUTION_TASK__JOB_VERSION:
                return JOB_VERSION_EDEFAULT == null ? jobVersion != null : !JOB_VERSION_EDEFAULT.equals(jobVersion);
            case PropertiesPackage.EXECUTION_TASK__ACTIVE:
                return active != ACTIVE_EDEFAULT;
            case PropertiesPackage.EXECUTION_TASK__ID_QUARTZ_JOB:
                return idQuartzJob != ID_QUARTZ_JOB_EDEFAULT;
            case PropertiesPackage.EXECUTION_TASK__LAST_SCRIPT_GENERATION_DATE:
                return LAST_SCRIPT_GENERATION_DATE_EDEFAULT == null ? lastScriptGenerationDate != null : !LAST_SCRIPT_GENERATION_DATE_EDEFAULT.equals(lastScriptGenerationDate);
            case PropertiesPackage.EXECUTION_TASK__ID_REMOTE_JOB:
                return ID_REMOTE_JOB_EDEFAULT == null ? idRemoteJob != null : !ID_REMOTE_JOB_EDEFAULT.equals(idRemoteJob);
            case PropertiesPackage.EXECUTION_TASK__ID_REMOTE_JOB_EXECUTION:
                return ID_REMOTE_JOB_EXECUTION_EDEFAULT == null ? idRemoteJobExecution != null : !ID_REMOTE_JOB_EXECUTION_EDEFAULT.equals(idRemoteJobExecution);
            case PropertiesPackage.EXECUTION_TASK__CHECKSUM_ARCHIVE:
                return CHECKSUM_ARCHIVE_EDEFAULT == null ? checksumArchive != null : !CHECKSUM_ARCHIVE_EDEFAULT.equals(checksumArchive);
            case PropertiesPackage.EXECUTION_TASK__JOB_SCRIPT_ARCHIVE:
                return JOB_SCRIPT_ARCHIVE_EDEFAULT == null ? jobScriptArchive != null : !JOB_SCRIPT_ARCHIVE_EDEFAULT.equals(jobScriptArchive);
            case PropertiesPackage.EXECUTION_TASK__STATUS:
                return STATUS_EDEFAULT == null ? status != null : !STATUS_EDEFAULT.equals(status);
            case PropertiesPackage.EXECUTION_TASK__PROCESSING_STATE:
                return processingState != PROCESSING_STATE_EDEFAULT;
            case PropertiesPackage.EXECUTION_TASK__ERROR_STATUS:
                return ERROR_STATUS_EDEFAULT == null ? errorStatus != null : !ERROR_STATUS_EDEFAULT.equals(errorStatus);
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (id: ");
        result.append(id);
        result.append(", label: ");
        result.append(label);
        result.append(", description: ");
        result.append(description);
        result.append(", context: ");
        result.append(context);
        result.append(", jobVersion: ");
        result.append(jobVersion);
        result.append(", active: ");
        result.append(active);
        result.append(", idQuartzJob: ");
        result.append(idQuartzJob);
        result.append(", lastScriptGenerationDate: ");
        result.append(lastScriptGenerationDate);
        result.append(", idRemoteJob: ");
        result.append(idRemoteJob);
        result.append(", idRemoteJobExecution: ");
        result.append(idRemoteJobExecution);
        result.append(", checksumArchive: ");
        result.append(checksumArchive);
        result.append(", jobScriptArchive: ");
        result.append(jobScriptArchive);
        result.append(", status: ");
        result.append(status);
        result.append(", processingState: ");
        result.append(processingState);
        result.append(", errorStatus: ");
        result.append(errorStatus);
        result.append(')');
        return result.toString();
    }

} //ExecutionTaskImpl
