/**
 * Alert.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 11, 2014 (12:11:36 EDT) WSDL2Java emitter.
 */

package AdminClient;

public class Alert  implements java.io.Serializable {
    private java.lang.String JMSComment;

    private java.lang.String JMSMsgType;

    private java.lang.String actionType;

    private java.lang.String agentAddr;

    private java.lang.String alertID;

    private java.lang.String auditType;

    private java.lang.String calendarName;

    private java.lang.String className;

    private java.lang.String classParameter;

    private java.lang.String clientFileName;

    private java.lang.String cmdInitUserID;

    private java.lang.String cmdInitUserPass;

    private java.lang.String cmdRunAs;

    private java.lang.String cmdServerName;

    private java.lang.String cmdType;

    private java.lang.String communityName;

    private java.lang.String createdBy;

    private AdminClient.DateTime createdTime;

    private AdminClient.DateTime dateChecked;

    private AdminClient.DateTime dateUpdated;

    private java.lang.String department;

    private java.lang.String description;

    private java.lang.String elapsedTime;

    private java.lang.String emailComment;

    private java.lang.String emailTemplate;

    private java.lang.String enabled;

    private java.lang.String endTime;

    private java.lang.String enterpriseOID;

    private java.lang.String genericTID;

    private java.lang.String hostAddr;

    private java.lang.String message;

    private java.lang.String messageOID;

    private java.lang.String numFiles;

    private java.lang.String parameter;

    private java.lang.String path;

    private java.lang.String processName;

    private java.lang.String protocol;

    private java.lang.String recurring;

    private java.lang.String sendReceiveFlag;

    private java.lang.String serverFileName;

    private java.lang.String serverName;

    private java.lang.String serverNodeName;

    private java.lang.String severity;

    private java.lang.String specificTID;

    private java.lang.String startTime;

    private java.lang.String templateFile;

    private java.lang.String to;

    private java.lang.String transferStatus;

    private java.lang.String transferUserID;

    private java.lang.String trapPort;

    private java.lang.String type;

    private java.lang.String typeUserLogon;

    private AdminClient.DateTime updateTime;

    private java.lang.String updatedBy;

    private java.lang.String userData;

    private java.lang.String userLogonProtocol;

    private java.lang.String userTypeDept;

    private java.lang.String version;

    public Alert() {
    }

    public Alert(
           java.lang.String JMSComment,
           java.lang.String JMSMsgType,
           java.lang.String actionType,
           java.lang.String agentAddr,
           java.lang.String alertID,
           java.lang.String auditType,
           java.lang.String calendarName,
           java.lang.String className,
           java.lang.String classParameter,
           java.lang.String clientFileName,
           java.lang.String cmdInitUserID,
           java.lang.String cmdInitUserPass,
           java.lang.String cmdRunAs,
           java.lang.String cmdServerName,
           java.lang.String cmdType,
           java.lang.String communityName,
           java.lang.String createdBy,
           AdminClient.DateTime createdTime,
           AdminClient.DateTime dateChecked,
           AdminClient.DateTime dateUpdated,
           java.lang.String department,
           java.lang.String description,
           java.lang.String elapsedTime,
           java.lang.String emailComment,
           java.lang.String emailTemplate,
           java.lang.String enabled,
           java.lang.String endTime,
           java.lang.String enterpriseOID,
           java.lang.String genericTID,
           java.lang.String hostAddr,
           java.lang.String message,
           java.lang.String messageOID,
           java.lang.String numFiles,
           java.lang.String parameter,
           java.lang.String path,
           java.lang.String processName,
           java.lang.String protocol,
           java.lang.String recurring,
           java.lang.String sendReceiveFlag,
           java.lang.String serverFileName,
           java.lang.String serverName,
           java.lang.String serverNodeName,
           java.lang.String severity,
           java.lang.String specificTID,
           java.lang.String startTime,
           java.lang.String templateFile,
           java.lang.String to,
           java.lang.String transferStatus,
           java.lang.String transferUserID,
           java.lang.String trapPort,
           java.lang.String type,
           java.lang.String typeUserLogon,
           AdminClient.DateTime updateTime,
           java.lang.String updatedBy,
           java.lang.String userData,
           java.lang.String userLogonProtocol,
           java.lang.String userTypeDept,
           java.lang.String version) {
           this.JMSComment = JMSComment;
           this.JMSMsgType = JMSMsgType;
           this.actionType = actionType;
           this.agentAddr = agentAddr;
           this.alertID = alertID;
           this.auditType = auditType;
           this.calendarName = calendarName;
           this.className = className;
           this.classParameter = classParameter;
           this.clientFileName = clientFileName;
           this.cmdInitUserID = cmdInitUserID;
           this.cmdInitUserPass = cmdInitUserPass;
           this.cmdRunAs = cmdRunAs;
           this.cmdServerName = cmdServerName;
           this.cmdType = cmdType;
           this.communityName = communityName;
           this.createdBy = createdBy;
           this.createdTime = createdTime;
           this.dateChecked = dateChecked;
           this.dateUpdated = dateUpdated;
           this.department = department;
           this.description = description;
           this.elapsedTime = elapsedTime;
           this.emailComment = emailComment;
           this.emailTemplate = emailTemplate;
           this.enabled = enabled;
           this.endTime = endTime;
           this.enterpriseOID = enterpriseOID;
           this.genericTID = genericTID;
           this.hostAddr = hostAddr;
           this.message = message;
           this.messageOID = messageOID;
           this.numFiles = numFiles;
           this.parameter = parameter;
           this.path = path;
           this.processName = processName;
           this.protocol = protocol;
           this.recurring = recurring;
           this.sendReceiveFlag = sendReceiveFlag;
           this.serverFileName = serverFileName;
           this.serverName = serverName;
           this.serverNodeName = serverNodeName;
           this.severity = severity;
           this.specificTID = specificTID;
           this.startTime = startTime;
           this.templateFile = templateFile;
           this.to = to;
           this.transferStatus = transferStatus;
           this.transferUserID = transferUserID;
           this.trapPort = trapPort;
           this.type = type;
           this.typeUserLogon = typeUserLogon;
           this.updateTime = updateTime;
           this.updatedBy = updatedBy;
           this.userData = userData;
           this.userLogonProtocol = userLogonProtocol;
           this.userTypeDept = userTypeDept;
           this.version = version;
    }


    /**
     * Gets the JMSComment value for this Alert.
     * 
     * @return JMSComment
     */
    public java.lang.String getJMSComment() {
        return JMSComment;
    }


    /**
     * Sets the JMSComment value for this Alert.
     * 
     * @param JMSComment
     */
    public void setJMSComment(java.lang.String JMSComment) {
        this.JMSComment = JMSComment;
    }


    /**
     * Gets the JMSMsgType value for this Alert.
     * 
     * @return JMSMsgType
     */
    public java.lang.String getJMSMsgType() {
        return JMSMsgType;
    }


    /**
     * Sets the JMSMsgType value for this Alert.
     * 
     * @param JMSMsgType
     */
    public void setJMSMsgType(java.lang.String JMSMsgType) {
        this.JMSMsgType = JMSMsgType;
    }


    /**
     * Gets the actionType value for this Alert.
     * 
     * @return actionType
     */
    public java.lang.String getActionType() {
        return actionType;
    }


    /**
     * Sets the actionType value for this Alert.
     * 
     * @param actionType
     */
    public void setActionType(java.lang.String actionType) {
        this.actionType = actionType;
    }


    /**
     * Gets the agentAddr value for this Alert.
     * 
     * @return agentAddr
     */
    public java.lang.String getAgentAddr() {
        return agentAddr;
    }


    /**
     * Sets the agentAddr value for this Alert.
     * 
     * @param agentAddr
     */
    public void setAgentAddr(java.lang.String agentAddr) {
        this.agentAddr = agentAddr;
    }


    /**
     * Gets the alertID value for this Alert.
     * 
     * @return alertID
     */
    public java.lang.String getAlertID() {
        return alertID;
    }


    /**
     * Sets the alertID value for this Alert.
     * 
     * @param alertID
     */
    public void setAlertID(java.lang.String alertID) {
        this.alertID = alertID;
    }


    /**
     * Gets the auditType value for this Alert.
     * 
     * @return auditType
     */
    public java.lang.String getAuditType() {
        return auditType;
    }


    /**
     * Sets the auditType value for this Alert.
     * 
     * @param auditType
     */
    public void setAuditType(java.lang.String auditType) {
        this.auditType = auditType;
    }


    /**
     * Gets the calendarName value for this Alert.
     * 
     * @return calendarName
     */
    public java.lang.String getCalendarName() {
        return calendarName;
    }


    /**
     * Sets the calendarName value for this Alert.
     * 
     * @param calendarName
     */
    public void setCalendarName(java.lang.String calendarName) {
        this.calendarName = calendarName;
    }


    /**
     * Gets the className value for this Alert.
     * 
     * @return className
     */
    public java.lang.String getClassName() {
        return className;
    }


    /**
     * Sets the className value for this Alert.
     * 
     * @param className
     */
    public void setClassName(java.lang.String className) {
        this.className = className;
    }


    /**
     * Gets the classParameter value for this Alert.
     * 
     * @return classParameter
     */
    public java.lang.String getClassParameter() {
        return classParameter;
    }


    /**
     * Sets the classParameter value for this Alert.
     * 
     * @param classParameter
     */
    public void setClassParameter(java.lang.String classParameter) {
        this.classParameter = classParameter;
    }


    /**
     * Gets the clientFileName value for this Alert.
     * 
     * @return clientFileName
     */
    public java.lang.String getClientFileName() {
        return clientFileName;
    }


    /**
     * Sets the clientFileName value for this Alert.
     * 
     * @param clientFileName
     */
    public void setClientFileName(java.lang.String clientFileName) {
        this.clientFileName = clientFileName;
    }


    /**
     * Gets the cmdInitUserID value for this Alert.
     * 
     * @return cmdInitUserID
     */
    public java.lang.String getCmdInitUserID() {
        return cmdInitUserID;
    }


    /**
     * Sets the cmdInitUserID value for this Alert.
     * 
     * @param cmdInitUserID
     */
    public void setCmdInitUserID(java.lang.String cmdInitUserID) {
        this.cmdInitUserID = cmdInitUserID;
    }


    /**
     * Gets the cmdInitUserPass value for this Alert.
     * 
     * @return cmdInitUserPass
     */
    public java.lang.String getCmdInitUserPass() {
        return cmdInitUserPass;
    }


    /**
     * Sets the cmdInitUserPass value for this Alert.
     * 
     * @param cmdInitUserPass
     */
    public void setCmdInitUserPass(java.lang.String cmdInitUserPass) {
        this.cmdInitUserPass = cmdInitUserPass;
    }


    /**
     * Gets the cmdRunAs value for this Alert.
     * 
     * @return cmdRunAs
     */
    public java.lang.String getCmdRunAs() {
        return cmdRunAs;
    }


    /**
     * Sets the cmdRunAs value for this Alert.
     * 
     * @param cmdRunAs
     */
    public void setCmdRunAs(java.lang.String cmdRunAs) {
        this.cmdRunAs = cmdRunAs;
    }


    /**
     * Gets the cmdServerName value for this Alert.
     * 
     * @return cmdServerName
     */
    public java.lang.String getCmdServerName() {
        return cmdServerName;
    }


    /**
     * Sets the cmdServerName value for this Alert.
     * 
     * @param cmdServerName
     */
    public void setCmdServerName(java.lang.String cmdServerName) {
        this.cmdServerName = cmdServerName;
    }


    /**
     * Gets the cmdType value for this Alert.
     * 
     * @return cmdType
     */
    public java.lang.String getCmdType() {
        return cmdType;
    }


    /**
     * Sets the cmdType value for this Alert.
     * 
     * @param cmdType
     */
    public void setCmdType(java.lang.String cmdType) {
        this.cmdType = cmdType;
    }


    /**
     * Gets the communityName value for this Alert.
     * 
     * @return communityName
     */
    public java.lang.String getCommunityName() {
        return communityName;
    }


    /**
     * Sets the communityName value for this Alert.
     * 
     * @param communityName
     */
    public void setCommunityName(java.lang.String communityName) {
        this.communityName = communityName;
    }


    /**
     * Gets the createdBy value for this Alert.
     * 
     * @return createdBy
     */
    public java.lang.String getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this Alert.
     * 
     * @param createdBy
     */
    public void setCreatedBy(java.lang.String createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdTime value for this Alert.
     * 
     * @return createdTime
     */
    public AdminClient.DateTime getCreatedTime() {
        return createdTime;
    }


    /**
     * Sets the createdTime value for this Alert.
     * 
     * @param createdTime
     */
    public void setCreatedTime(AdminClient.DateTime createdTime) {
        this.createdTime = createdTime;
    }


    /**
     * Gets the dateChecked value for this Alert.
     * 
     * @return dateChecked
     */
    public AdminClient.DateTime getDateChecked() {
        return dateChecked;
    }


    /**
     * Sets the dateChecked value for this Alert.
     * 
     * @param dateChecked
     */
    public void setDateChecked(AdminClient.DateTime dateChecked) {
        this.dateChecked = dateChecked;
    }


    /**
     * Gets the dateUpdated value for this Alert.
     * 
     * @return dateUpdated
     */
    public AdminClient.DateTime getDateUpdated() {
        return dateUpdated;
    }


    /**
     * Sets the dateUpdated value for this Alert.
     * 
     * @param dateUpdated
     */
    public void setDateUpdated(AdminClient.DateTime dateUpdated) {
        this.dateUpdated = dateUpdated;
    }


    /**
     * Gets the department value for this Alert.
     * 
     * @return department
     */
    public java.lang.String getDepartment() {
        return department;
    }


    /**
     * Sets the department value for this Alert.
     * 
     * @param department
     */
    public void setDepartment(java.lang.String department) {
        this.department = department;
    }


    /**
     * Gets the description value for this Alert.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Alert.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the elapsedTime value for this Alert.
     * 
     * @return elapsedTime
     */
    public java.lang.String getElapsedTime() {
        return elapsedTime;
    }


    /**
     * Sets the elapsedTime value for this Alert.
     * 
     * @param elapsedTime
     */
    public void setElapsedTime(java.lang.String elapsedTime) {
        this.elapsedTime = elapsedTime;
    }


    /**
     * Gets the emailComment value for this Alert.
     * 
     * @return emailComment
     */
    public java.lang.String getEmailComment() {
        return emailComment;
    }


    /**
     * Sets the emailComment value for this Alert.
     * 
     * @param emailComment
     */
    public void setEmailComment(java.lang.String emailComment) {
        this.emailComment = emailComment;
    }


    /**
     * Gets the emailTemplate value for this Alert.
     * 
     * @return emailTemplate
     */
    public java.lang.String getEmailTemplate() {
        return emailTemplate;
    }


    /**
     * Sets the emailTemplate value for this Alert.
     * 
     * @param emailTemplate
     */
    public void setEmailTemplate(java.lang.String emailTemplate) {
        this.emailTemplate = emailTemplate;
    }


    /**
     * Gets the enabled value for this Alert.
     * 
     * @return enabled
     */
    public java.lang.String getEnabled() {
        return enabled;
    }


    /**
     * Sets the enabled value for this Alert.
     * 
     * @param enabled
     */
    public void setEnabled(java.lang.String enabled) {
        this.enabled = enabled;
    }


    /**
     * Gets the endTime value for this Alert.
     * 
     * @return endTime
     */
    public java.lang.String getEndTime() {
        return endTime;
    }


    /**
     * Sets the endTime value for this Alert.
     * 
     * @param endTime
     */
    public void setEndTime(java.lang.String endTime) {
        this.endTime = endTime;
    }


    /**
     * Gets the enterpriseOID value for this Alert.
     * 
     * @return enterpriseOID
     */
    public java.lang.String getEnterpriseOID() {
        return enterpriseOID;
    }


    /**
     * Sets the enterpriseOID value for this Alert.
     * 
     * @param enterpriseOID
     */
    public void setEnterpriseOID(java.lang.String enterpriseOID) {
        this.enterpriseOID = enterpriseOID;
    }


    /**
     * Gets the genericTID value for this Alert.
     * 
     * @return genericTID
     */
    public java.lang.String getGenericTID() {
        return genericTID;
    }


    /**
     * Sets the genericTID value for this Alert.
     * 
     * @param genericTID
     */
    public void setGenericTID(java.lang.String genericTID) {
        this.genericTID = genericTID;
    }


    /**
     * Gets the hostAddr value for this Alert.
     * 
     * @return hostAddr
     */
    public java.lang.String getHostAddr() {
        return hostAddr;
    }


    /**
     * Sets the hostAddr value for this Alert.
     * 
     * @param hostAddr
     */
    public void setHostAddr(java.lang.String hostAddr) {
        this.hostAddr = hostAddr;
    }


    /**
     * Gets the message value for this Alert.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this Alert.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }


    /**
     * Gets the messageOID value for this Alert.
     * 
     * @return messageOID
     */
    public java.lang.String getMessageOID() {
        return messageOID;
    }


    /**
     * Sets the messageOID value for this Alert.
     * 
     * @param messageOID
     */
    public void setMessageOID(java.lang.String messageOID) {
        this.messageOID = messageOID;
    }


    /**
     * Gets the numFiles value for this Alert.
     * 
     * @return numFiles
     */
    public java.lang.String getNumFiles() {
        return numFiles;
    }


    /**
     * Sets the numFiles value for this Alert.
     * 
     * @param numFiles
     */
    public void setNumFiles(java.lang.String numFiles) {
        this.numFiles = numFiles;
    }


    /**
     * Gets the parameter value for this Alert.
     * 
     * @return parameter
     */
    public java.lang.String getParameter() {
        return parameter;
    }


    /**
     * Sets the parameter value for this Alert.
     * 
     * @param parameter
     */
    public void setParameter(java.lang.String parameter) {
        this.parameter = parameter;
    }


    /**
     * Gets the path value for this Alert.
     * 
     * @return path
     */
    public java.lang.String getPath() {
        return path;
    }


    /**
     * Sets the path value for this Alert.
     * 
     * @param path
     */
    public void setPath(java.lang.String path) {
        this.path = path;
    }


    /**
     * Gets the processName value for this Alert.
     * 
     * @return processName
     */
    public java.lang.String getProcessName() {
        return processName;
    }


    /**
     * Sets the processName value for this Alert.
     * 
     * @param processName
     */
    public void setProcessName(java.lang.String processName) {
        this.processName = processName;
    }


    /**
     * Gets the protocol value for this Alert.
     * 
     * @return protocol
     */
    public java.lang.String getProtocol() {
        return protocol;
    }


    /**
     * Sets the protocol value for this Alert.
     * 
     * @param protocol
     */
    public void setProtocol(java.lang.String protocol) {
        this.protocol = protocol;
    }


    /**
     * Gets the recurring value for this Alert.
     * 
     * @return recurring
     */
    public java.lang.String getRecurring() {
        return recurring;
    }


    /**
     * Sets the recurring value for this Alert.
     * 
     * @param recurring
     */
    public void setRecurring(java.lang.String recurring) {
        this.recurring = recurring;
    }


    /**
     * Gets the sendReceiveFlag value for this Alert.
     * 
     * @return sendReceiveFlag
     */
    public java.lang.String getSendReceiveFlag() {
        return sendReceiveFlag;
    }


    /**
     * Sets the sendReceiveFlag value for this Alert.
     * 
     * @param sendReceiveFlag
     */
    public void setSendReceiveFlag(java.lang.String sendReceiveFlag) {
        this.sendReceiveFlag = sendReceiveFlag;
    }


    /**
     * Gets the serverFileName value for this Alert.
     * 
     * @return serverFileName
     */
    public java.lang.String getServerFileName() {
        return serverFileName;
    }


    /**
     * Sets the serverFileName value for this Alert.
     * 
     * @param serverFileName
     */
    public void setServerFileName(java.lang.String serverFileName) {
        this.serverFileName = serverFileName;
    }


    /**
     * Gets the serverName value for this Alert.
     * 
     * @return serverName
     */
    public java.lang.String getServerName() {
        return serverName;
    }


    /**
     * Sets the serverName value for this Alert.
     * 
     * @param serverName
     */
    public void setServerName(java.lang.String serverName) {
        this.serverName = serverName;
    }


    /**
     * Gets the serverNodeName value for this Alert.
     * 
     * @return serverNodeName
     */
    public java.lang.String getServerNodeName() {
        return serverNodeName;
    }


    /**
     * Sets the serverNodeName value for this Alert.
     * 
     * @param serverNodeName
     */
    public void setServerNodeName(java.lang.String serverNodeName) {
        this.serverNodeName = serverNodeName;
    }


    /**
     * Gets the severity value for this Alert.
     * 
     * @return severity
     */
    public java.lang.String getSeverity() {
        return severity;
    }


    /**
     * Sets the severity value for this Alert.
     * 
     * @param severity
     */
    public void setSeverity(java.lang.String severity) {
        this.severity = severity;
    }


    /**
     * Gets the specificTID value for this Alert.
     * 
     * @return specificTID
     */
    public java.lang.String getSpecificTID() {
        return specificTID;
    }


    /**
     * Sets the specificTID value for this Alert.
     * 
     * @param specificTID
     */
    public void setSpecificTID(java.lang.String specificTID) {
        this.specificTID = specificTID;
    }


    /**
     * Gets the startTime value for this Alert.
     * 
     * @return startTime
     */
    public java.lang.String getStartTime() {
        return startTime;
    }


    /**
     * Sets the startTime value for this Alert.
     * 
     * @param startTime
     */
    public void setStartTime(java.lang.String startTime) {
        this.startTime = startTime;
    }


    /**
     * Gets the templateFile value for this Alert.
     * 
     * @return templateFile
     */
    public java.lang.String getTemplateFile() {
        return templateFile;
    }


    /**
     * Sets the templateFile value for this Alert.
     * 
     * @param templateFile
     */
    public void setTemplateFile(java.lang.String templateFile) {
        this.templateFile = templateFile;
    }


    /**
     * Gets the to value for this Alert.
     * 
     * @return to
     */
    public java.lang.String getTo() {
        return to;
    }


    /**
     * Sets the to value for this Alert.
     * 
     * @param to
     */
    public void setTo(java.lang.String to) {
        this.to = to;
    }


    /**
     * Gets the transferStatus value for this Alert.
     * 
     * @return transferStatus
     */
    public java.lang.String getTransferStatus() {
        return transferStatus;
    }


    /**
     * Sets the transferStatus value for this Alert.
     * 
     * @param transferStatus
     */
    public void setTransferStatus(java.lang.String transferStatus) {
        this.transferStatus = transferStatus;
    }


    /**
     * Gets the transferUserID value for this Alert.
     * 
     * @return transferUserID
     */
    public java.lang.String getTransferUserID() {
        return transferUserID;
    }


    /**
     * Sets the transferUserID value for this Alert.
     * 
     * @param transferUserID
     */
    public void setTransferUserID(java.lang.String transferUserID) {
        this.transferUserID = transferUserID;
    }


    /**
     * Gets the trapPort value for this Alert.
     * 
     * @return trapPort
     */
    public java.lang.String getTrapPort() {
        return trapPort;
    }


    /**
     * Sets the trapPort value for this Alert.
     * 
     * @param trapPort
     */
    public void setTrapPort(java.lang.String trapPort) {
        this.trapPort = trapPort;
    }


    /**
     * Gets the type value for this Alert.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this Alert.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the typeUserLogon value for this Alert.
     * 
     * @return typeUserLogon
     */
    public java.lang.String getTypeUserLogon() {
        return typeUserLogon;
    }


    /**
     * Sets the typeUserLogon value for this Alert.
     * 
     * @param typeUserLogon
     */
    public void setTypeUserLogon(java.lang.String typeUserLogon) {
        this.typeUserLogon = typeUserLogon;
    }


    /**
     * Gets the updateTime value for this Alert.
     * 
     * @return updateTime
     */
    public AdminClient.DateTime getUpdateTime() {
        return updateTime;
    }


    /**
     * Sets the updateTime value for this Alert.
     * 
     * @param updateTime
     */
    public void setUpdateTime(AdminClient.DateTime updateTime) {
        this.updateTime = updateTime;
    }


    /**
     * Gets the updatedBy value for this Alert.
     * 
     * @return updatedBy
     */
    public java.lang.String getUpdatedBy() {
        return updatedBy;
    }


    /**
     * Sets the updatedBy value for this Alert.
     * 
     * @param updatedBy
     */
    public void setUpdatedBy(java.lang.String updatedBy) {
        this.updatedBy = updatedBy;
    }


    /**
     * Gets the userData value for this Alert.
     * 
     * @return userData
     */
    public java.lang.String getUserData() {
        return userData;
    }


    /**
     * Sets the userData value for this Alert.
     * 
     * @param userData
     */
    public void setUserData(java.lang.String userData) {
        this.userData = userData;
    }


    /**
     * Gets the userLogonProtocol value for this Alert.
     * 
     * @return userLogonProtocol
     */
    public java.lang.String getUserLogonProtocol() {
        return userLogonProtocol;
    }


    /**
     * Sets the userLogonProtocol value for this Alert.
     * 
     * @param userLogonProtocol
     */
    public void setUserLogonProtocol(java.lang.String userLogonProtocol) {
        this.userLogonProtocol = userLogonProtocol;
    }


    /**
     * Gets the userTypeDept value for this Alert.
     * 
     * @return userTypeDept
     */
    public java.lang.String getUserTypeDept() {
        return userTypeDept;
    }


    /**
     * Sets the userTypeDept value for this Alert.
     * 
     * @param userTypeDept
     */
    public void setUserTypeDept(java.lang.String userTypeDept) {
        this.userTypeDept = userTypeDept;
    }


    /**
     * Gets the version value for this Alert.
     * 
     * @return version
     */
    public java.lang.String getVersion() {
        return version;
    }


    /**
     * Sets the version value for this Alert.
     * 
     * @param version
     */
    public void setVersion(java.lang.String version) {
        this.version = version;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Alert)) return false;
        Alert other = (Alert) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.JMSComment==null && other.getJMSComment()==null) || 
             (this.JMSComment!=null &&
              this.JMSComment.equals(other.getJMSComment()))) &&
            ((this.JMSMsgType==null && other.getJMSMsgType()==null) || 
             (this.JMSMsgType!=null &&
              this.JMSMsgType.equals(other.getJMSMsgType()))) &&
            ((this.actionType==null && other.getActionType()==null) || 
             (this.actionType!=null &&
              this.actionType.equals(other.getActionType()))) &&
            ((this.agentAddr==null && other.getAgentAddr()==null) || 
             (this.agentAddr!=null &&
              this.agentAddr.equals(other.getAgentAddr()))) &&
            ((this.alertID==null && other.getAlertID()==null) || 
             (this.alertID!=null &&
              this.alertID.equals(other.getAlertID()))) &&
            ((this.auditType==null && other.getAuditType()==null) || 
             (this.auditType!=null &&
              this.auditType.equals(other.getAuditType()))) &&
            ((this.calendarName==null && other.getCalendarName()==null) || 
             (this.calendarName!=null &&
              this.calendarName.equals(other.getCalendarName()))) &&
            ((this.className==null && other.getClassName()==null) || 
             (this.className!=null &&
              this.className.equals(other.getClassName()))) &&
            ((this.classParameter==null && other.getClassParameter()==null) || 
             (this.classParameter!=null &&
              this.classParameter.equals(other.getClassParameter()))) &&
            ((this.clientFileName==null && other.getClientFileName()==null) || 
             (this.clientFileName!=null &&
              this.clientFileName.equals(other.getClientFileName()))) &&
            ((this.cmdInitUserID==null && other.getCmdInitUserID()==null) || 
             (this.cmdInitUserID!=null &&
              this.cmdInitUserID.equals(other.getCmdInitUserID()))) &&
            ((this.cmdInitUserPass==null && other.getCmdInitUserPass()==null) || 
             (this.cmdInitUserPass!=null &&
              this.cmdInitUserPass.equals(other.getCmdInitUserPass()))) &&
            ((this.cmdRunAs==null && other.getCmdRunAs()==null) || 
             (this.cmdRunAs!=null &&
              this.cmdRunAs.equals(other.getCmdRunAs()))) &&
            ((this.cmdServerName==null && other.getCmdServerName()==null) || 
             (this.cmdServerName!=null &&
              this.cmdServerName.equals(other.getCmdServerName()))) &&
            ((this.cmdType==null && other.getCmdType()==null) || 
             (this.cmdType!=null &&
              this.cmdType.equals(other.getCmdType()))) &&
            ((this.communityName==null && other.getCommunityName()==null) || 
             (this.communityName!=null &&
              this.communityName.equals(other.getCommunityName()))) &&
            ((this.createdBy==null && other.getCreatedBy()==null) || 
             (this.createdBy!=null &&
              this.createdBy.equals(other.getCreatedBy()))) &&
            ((this.createdTime==null && other.getCreatedTime()==null) || 
             (this.createdTime!=null &&
              this.createdTime.equals(other.getCreatedTime()))) &&
            ((this.dateChecked==null && other.getDateChecked()==null) || 
             (this.dateChecked!=null &&
              this.dateChecked.equals(other.getDateChecked()))) &&
            ((this.dateUpdated==null && other.getDateUpdated()==null) || 
             (this.dateUpdated!=null &&
              this.dateUpdated.equals(other.getDateUpdated()))) &&
            ((this.department==null && other.getDepartment()==null) || 
             (this.department!=null &&
              this.department.equals(other.getDepartment()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.elapsedTime==null && other.getElapsedTime()==null) || 
             (this.elapsedTime!=null &&
              this.elapsedTime.equals(other.getElapsedTime()))) &&
            ((this.emailComment==null && other.getEmailComment()==null) || 
             (this.emailComment!=null &&
              this.emailComment.equals(other.getEmailComment()))) &&
            ((this.emailTemplate==null && other.getEmailTemplate()==null) || 
             (this.emailTemplate!=null &&
              this.emailTemplate.equals(other.getEmailTemplate()))) &&
            ((this.enabled==null && other.getEnabled()==null) || 
             (this.enabled!=null &&
              this.enabled.equals(other.getEnabled()))) &&
            ((this.endTime==null && other.getEndTime()==null) || 
             (this.endTime!=null &&
              this.endTime.equals(other.getEndTime()))) &&
            ((this.enterpriseOID==null && other.getEnterpriseOID()==null) || 
             (this.enterpriseOID!=null &&
              this.enterpriseOID.equals(other.getEnterpriseOID()))) &&
            ((this.genericTID==null && other.getGenericTID()==null) || 
             (this.genericTID!=null &&
              this.genericTID.equals(other.getGenericTID()))) &&
            ((this.hostAddr==null && other.getHostAddr()==null) || 
             (this.hostAddr!=null &&
              this.hostAddr.equals(other.getHostAddr()))) &&
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage()))) &&
            ((this.messageOID==null && other.getMessageOID()==null) || 
             (this.messageOID!=null &&
              this.messageOID.equals(other.getMessageOID()))) &&
            ((this.numFiles==null && other.getNumFiles()==null) || 
             (this.numFiles!=null &&
              this.numFiles.equals(other.getNumFiles()))) &&
            ((this.parameter==null && other.getParameter()==null) || 
             (this.parameter!=null &&
              this.parameter.equals(other.getParameter()))) &&
            ((this.path==null && other.getPath()==null) || 
             (this.path!=null &&
              this.path.equals(other.getPath()))) &&
            ((this.processName==null && other.getProcessName()==null) || 
             (this.processName!=null &&
              this.processName.equals(other.getProcessName()))) &&
            ((this.protocol==null && other.getProtocol()==null) || 
             (this.protocol!=null &&
              this.protocol.equals(other.getProtocol()))) &&
            ((this.recurring==null && other.getRecurring()==null) || 
             (this.recurring!=null &&
              this.recurring.equals(other.getRecurring()))) &&
            ((this.sendReceiveFlag==null && other.getSendReceiveFlag()==null) || 
             (this.sendReceiveFlag!=null &&
              this.sendReceiveFlag.equals(other.getSendReceiveFlag()))) &&
            ((this.serverFileName==null && other.getServerFileName()==null) || 
             (this.serverFileName!=null &&
              this.serverFileName.equals(other.getServerFileName()))) &&
            ((this.serverName==null && other.getServerName()==null) || 
             (this.serverName!=null &&
              this.serverName.equals(other.getServerName()))) &&
            ((this.serverNodeName==null && other.getServerNodeName()==null) || 
             (this.serverNodeName!=null &&
              this.serverNodeName.equals(other.getServerNodeName()))) &&
            ((this.severity==null && other.getSeverity()==null) || 
             (this.severity!=null &&
              this.severity.equals(other.getSeverity()))) &&
            ((this.specificTID==null && other.getSpecificTID()==null) || 
             (this.specificTID!=null &&
              this.specificTID.equals(other.getSpecificTID()))) &&
            ((this.startTime==null && other.getStartTime()==null) || 
             (this.startTime!=null &&
              this.startTime.equals(other.getStartTime()))) &&
            ((this.templateFile==null && other.getTemplateFile()==null) || 
             (this.templateFile!=null &&
              this.templateFile.equals(other.getTemplateFile()))) &&
            ((this.to==null && other.getTo()==null) || 
             (this.to!=null &&
              this.to.equals(other.getTo()))) &&
            ((this.transferStatus==null && other.getTransferStatus()==null) || 
             (this.transferStatus!=null &&
              this.transferStatus.equals(other.getTransferStatus()))) &&
            ((this.transferUserID==null && other.getTransferUserID()==null) || 
             (this.transferUserID!=null &&
              this.transferUserID.equals(other.getTransferUserID()))) &&
            ((this.trapPort==null && other.getTrapPort()==null) || 
             (this.trapPort!=null &&
              this.trapPort.equals(other.getTrapPort()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.typeUserLogon==null && other.getTypeUserLogon()==null) || 
             (this.typeUserLogon!=null &&
              this.typeUserLogon.equals(other.getTypeUserLogon()))) &&
            ((this.updateTime==null && other.getUpdateTime()==null) || 
             (this.updateTime!=null &&
              this.updateTime.equals(other.getUpdateTime()))) &&
            ((this.updatedBy==null && other.getUpdatedBy()==null) || 
             (this.updatedBy!=null &&
              this.updatedBy.equals(other.getUpdatedBy()))) &&
            ((this.userData==null && other.getUserData()==null) || 
             (this.userData!=null &&
              this.userData.equals(other.getUserData()))) &&
            ((this.userLogonProtocol==null && other.getUserLogonProtocol()==null) || 
             (this.userLogonProtocol!=null &&
              this.userLogonProtocol.equals(other.getUserLogonProtocol()))) &&
            ((this.userTypeDept==null && other.getUserTypeDept()==null) || 
             (this.userTypeDept!=null &&
              this.userTypeDept.equals(other.getUserTypeDept()))) &&
            ((this.version==null && other.getVersion()==null) || 
             (this.version!=null &&
              this.version.equals(other.getVersion())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getJMSComment() != null) {
            _hashCode += getJMSComment().hashCode();
        }
        if (getJMSMsgType() != null) {
            _hashCode += getJMSMsgType().hashCode();
        }
        if (getActionType() != null) {
            _hashCode += getActionType().hashCode();
        }
        if (getAgentAddr() != null) {
            _hashCode += getAgentAddr().hashCode();
        }
        if (getAlertID() != null) {
            _hashCode += getAlertID().hashCode();
        }
        if (getAuditType() != null) {
            _hashCode += getAuditType().hashCode();
        }
        if (getCalendarName() != null) {
            _hashCode += getCalendarName().hashCode();
        }
        if (getClassName() != null) {
            _hashCode += getClassName().hashCode();
        }
        if (getClassParameter() != null) {
            _hashCode += getClassParameter().hashCode();
        }
        if (getClientFileName() != null) {
            _hashCode += getClientFileName().hashCode();
        }
        if (getCmdInitUserID() != null) {
            _hashCode += getCmdInitUserID().hashCode();
        }
        if (getCmdInitUserPass() != null) {
            _hashCode += getCmdInitUserPass().hashCode();
        }
        if (getCmdRunAs() != null) {
            _hashCode += getCmdRunAs().hashCode();
        }
        if (getCmdServerName() != null) {
            _hashCode += getCmdServerName().hashCode();
        }
        if (getCmdType() != null) {
            _hashCode += getCmdType().hashCode();
        }
        if (getCommunityName() != null) {
            _hashCode += getCommunityName().hashCode();
        }
        if (getCreatedBy() != null) {
            _hashCode += getCreatedBy().hashCode();
        }
        if (getCreatedTime() != null) {
            _hashCode += getCreatedTime().hashCode();
        }
        if (getDateChecked() != null) {
            _hashCode += getDateChecked().hashCode();
        }
        if (getDateUpdated() != null) {
            _hashCode += getDateUpdated().hashCode();
        }
        if (getDepartment() != null) {
            _hashCode += getDepartment().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getElapsedTime() != null) {
            _hashCode += getElapsedTime().hashCode();
        }
        if (getEmailComment() != null) {
            _hashCode += getEmailComment().hashCode();
        }
        if (getEmailTemplate() != null) {
            _hashCode += getEmailTemplate().hashCode();
        }
        if (getEnabled() != null) {
            _hashCode += getEnabled().hashCode();
        }
        if (getEndTime() != null) {
            _hashCode += getEndTime().hashCode();
        }
        if (getEnterpriseOID() != null) {
            _hashCode += getEnterpriseOID().hashCode();
        }
        if (getGenericTID() != null) {
            _hashCode += getGenericTID().hashCode();
        }
        if (getHostAddr() != null) {
            _hashCode += getHostAddr().hashCode();
        }
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        if (getMessageOID() != null) {
            _hashCode += getMessageOID().hashCode();
        }
        if (getNumFiles() != null) {
            _hashCode += getNumFiles().hashCode();
        }
        if (getParameter() != null) {
            _hashCode += getParameter().hashCode();
        }
        if (getPath() != null) {
            _hashCode += getPath().hashCode();
        }
        if (getProcessName() != null) {
            _hashCode += getProcessName().hashCode();
        }
        if (getProtocol() != null) {
            _hashCode += getProtocol().hashCode();
        }
        if (getRecurring() != null) {
            _hashCode += getRecurring().hashCode();
        }
        if (getSendReceiveFlag() != null) {
            _hashCode += getSendReceiveFlag().hashCode();
        }
        if (getServerFileName() != null) {
            _hashCode += getServerFileName().hashCode();
        }
        if (getServerName() != null) {
            _hashCode += getServerName().hashCode();
        }
        if (getServerNodeName() != null) {
            _hashCode += getServerNodeName().hashCode();
        }
        if (getSeverity() != null) {
            _hashCode += getSeverity().hashCode();
        }
        if (getSpecificTID() != null) {
            _hashCode += getSpecificTID().hashCode();
        }
        if (getStartTime() != null) {
            _hashCode += getStartTime().hashCode();
        }
        if (getTemplateFile() != null) {
            _hashCode += getTemplateFile().hashCode();
        }
        if (getTo() != null) {
            _hashCode += getTo().hashCode();
        }
        if (getTransferStatus() != null) {
            _hashCode += getTransferStatus().hashCode();
        }
        if (getTransferUserID() != null) {
            _hashCode += getTransferUserID().hashCode();
        }
        if (getTrapPort() != null) {
            _hashCode += getTrapPort().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getTypeUserLogon() != null) {
            _hashCode += getTypeUserLogon().hashCode();
        }
        if (getUpdateTime() != null) {
            _hashCode += getUpdateTime().hashCode();
        }
        if (getUpdatedBy() != null) {
            _hashCode += getUpdatedBy().hashCode();
        }
        if (getUserData() != null) {
            _hashCode += getUserData().hashCode();
        }
        if (getUserLogonProtocol() != null) {
            _hashCode += getUserLogonProtocol().hashCode();
        }
        if (getUserTypeDept() != null) {
            _hashCode += getUserTypeDept().hashCode();
        }
        if (getVersion() != null) {
            _hashCode += getVersion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Alert.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:AdministratorService", "Alert"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("JMSComment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "JMSComment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("JMSMsgType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "JMSMsgType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actionType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "actionType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agentAddr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "agentAddr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alertID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "alertID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("auditType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "auditType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("calendarName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "calendarName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("className");
        elemField.setXmlName(new javax.xml.namespace.QName("", "className"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("classParameter");
        elemField.setXmlName(new javax.xml.namespace.QName("", "classParameter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientFileName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "clientFileName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cmdInitUserID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cmdInitUserID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cmdInitUserPass");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cmdInitUserPass"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cmdRunAs");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cmdRunAs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cmdServerName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cmdServerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cmdType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cmdType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("communityName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "communityName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdBy");
        elemField.setXmlName(new javax.xml.namespace.QName("", "createdBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "createdTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:AdministratorService", "DateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateChecked");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dateChecked"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:AdministratorService", "DateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateUpdated");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dateUpdated"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:AdministratorService", "DateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("department");
        elemField.setXmlName(new javax.xml.namespace.QName("", "department"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("elapsedTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "elapsedTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailComment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "emailComment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailTemplate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "emailTemplate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enabled");
        elemField.setXmlName(new javax.xml.namespace.QName("", "enabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "endTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enterpriseOID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "enterpriseOID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("genericTID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "genericTID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostAddr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hostAddr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("", "message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messageOID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "messageOID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numFiles");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numFiles"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parameter");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parameter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("path");
        elemField.setXmlName(new javax.xml.namespace.QName("", "path"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "processName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("protocol");
        elemField.setXmlName(new javax.xml.namespace.QName("", "protocol"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recurring");
        elemField.setXmlName(new javax.xml.namespace.QName("", "recurring"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sendReceiveFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sendReceiveFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serverFileName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serverFileName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serverName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serverName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serverNodeName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serverNodeName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("severity");
        elemField.setXmlName(new javax.xml.namespace.QName("", "severity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("specificTID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "specificTID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "startTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("templateFile");
        elemField.setXmlName(new javax.xml.namespace.QName("", "templateFile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("to");
        elemField.setXmlName(new javax.xml.namespace.QName("", "to"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transferStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferUserID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transferUserID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trapPort");
        elemField.setXmlName(new javax.xml.namespace.QName("", "trapPort"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("typeUserLogon");
        elemField.setXmlName(new javax.xml.namespace.QName("", "typeUserLogon"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "updateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:AdministratorService", "DateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updatedBy");
        elemField.setXmlName(new javax.xml.namespace.QName("", "updatedBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userLogonProtocol");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userLogonProtocol"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userTypeDept");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userTypeDept"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("version");
        elemField.setXmlName(new javax.xml.namespace.QName("", "version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
