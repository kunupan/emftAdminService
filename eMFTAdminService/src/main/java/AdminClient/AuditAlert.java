/**
 * AuditAlert.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 11, 2014 (12:11:36 EDT) WSDL2Java emitter.
 */

package AdminClient;

public class AuditAlert  extends AdminClient.AuditBase  implements java.io.Serializable {
    private java.lang.String JAVAStatus;

    private java.lang.String JMSComment;

    private java.lang.String JMSStatus;

    private java.lang.String JMSType;

    private java.lang.String SNMPAgentIP;

    private java.lang.String SNMPMessage;

    private java.lang.String SNMPServerIP;

    private java.lang.String actionName;

    private java.lang.String alertAuditID;

    private java.lang.String alertDescription;

    private java.lang.String alertID;

    private java.lang.String alertName;

    private java.lang.String alertSeverity;

    private java.lang.String alertSystem;

    private AdminClient.DateTime alertTime;

    private java.lang.String auditID;

    private java.lang.String cmdParameters;

    private java.lang.String cmdPath;

    private java.lang.String cmdRunAs;

    private java.lang.String cmdServerName;

    private java.lang.String cmdType;

    private java.lang.String cmdUserId;

    private java.lang.String commandStatus;

    private java.lang.String communityName;

    private java.lang.String emailComment;

    private java.lang.String emailRecipient;

    private java.lang.String emailStatus;

    private java.lang.String emailTemplate;

    private java.lang.String enterpriseOID;

    private java.lang.String genericTrapId;

    private java.lang.String javaClassName;

    private java.lang.String javaParameters;

    private java.lang.String[] managedDepts;

    private java.lang.String message;

    private java.lang.String messageOID;

    private AdminClient.Alert myAlert;

    private AdminClient.AuditBase myAudit;

    private java.lang.String protocol;

    private java.lang.String specificTrapId;

    private java.lang.String transferType;

    private java.lang.String trapPort;

    private java.lang.String trapStatus;

    private java.lang.String type;

    private java.lang.String typeUserLogon;

    private java.lang.String userId;

    private java.lang.String version;

    public AuditAlert() {
    }

    public AuditAlert(
           java.lang.String AS2MDNStatus,
           java.lang.String CRLF,
           java.lang.String LRECL,
           java.lang.String OS390AllocPri,
           java.lang.String OS390AllocSec,
           java.lang.String OS390AllocType,
           java.lang.String OS390BlockSize,
           java.lang.String OS390DataClass,
           java.lang.String OS390MgtClass,
           java.lang.String OS390StorClass,
           java.lang.String OS390Unit,
           java.lang.String OS390Volume,
           java.lang.String RECFM,
           java.lang.String auditId,
           java.lang.String chkptCount,
           java.lang.String chkptInterval,
           java.lang.String chkptRestartFlag,
           java.lang.String clientCompressFlag,
           java.lang.String clientFileName,
           java.lang.String clientIPAddr,
           java.lang.String dataType,
           AdminClient.DateTime dateCreated,
           java.lang.String department,
           java.lang.String description,
           java.lang.String encryptFlag,
           java.lang.String fileOption,
           java.lang.String localTransactionId,
           java.lang.String localTranslationTable,
           java.lang.String[] manangedDepts,
           java.lang.String nodeName,
           java.lang.String nodeNameCF,
           java.lang.String numberOfDays,
           java.lang.String postActionData1,
           java.lang.String postActionData2,
           java.lang.String postActionData3,
           java.lang.String postActionData4,
           java.lang.String postActionFlag1,
           java.lang.String postActionFlag2,
           java.lang.String postActionFlag3,
           java.lang.String postActionFlag4,
           java.lang.String postActionReturn1,
           java.lang.String postActionReturn2,
           java.lang.String postActionReturn3,
           java.lang.String postActionReturn4,
           java.lang.String postActionType1,
           java.lang.String postActionType2,
           java.lang.String postActionType3,
           java.lang.String postActionType4,
           java.lang.String processName,
           java.lang.String proxyStatusMsg,
           java.lang.String proxyTrFlag,
           java.lang.String remoteTranslationTable,
           java.lang.String remoteUserIdJPA,
           java.lang.String requestID,
           java.lang.String sendRecvFlag,
           java.lang.String serverFileName,
           java.lang.String toEmailAddrFailure,
           java.lang.String toEmailAddrSuccess,
           java.lang.String transferByteCount,
           java.lang.String transferCompressedByteCount,
           AdminClient.DateTime transferEndTime,
           java.lang.String transferProtocol,
           AdminClient.DateTime transferStartTime,
           java.lang.String transferStatus,
           java.lang.String transferStatusMsgId,
           java.lang.String transferUserId,
           java.lang.String transferWork,
           java.lang.String userData,
           java.lang.String writeMode,
           java.lang.String JAVAStatus,
           java.lang.String JMSComment,
           java.lang.String JMSStatus,
           java.lang.String JMSType,
           java.lang.String SNMPAgentIP,
           java.lang.String SNMPMessage,
           java.lang.String SNMPServerIP,
           java.lang.String actionName,
           java.lang.String alertAuditID,
           java.lang.String alertDescription,
           java.lang.String alertID,
           java.lang.String alertName,
           java.lang.String alertSeverity,
           java.lang.String alertSystem,
           AdminClient.DateTime alertTime,
           java.lang.String auditID,
           java.lang.String cmdParameters,
           java.lang.String cmdPath,
           java.lang.String cmdRunAs,
           java.lang.String cmdServerName,
           java.lang.String cmdType,
           java.lang.String cmdUserId,
           java.lang.String commandStatus,
           java.lang.String communityName,
           java.lang.String emailComment,
           java.lang.String emailRecipient,
           java.lang.String emailStatus,
           java.lang.String emailTemplate,
           java.lang.String enterpriseOID,
           java.lang.String genericTrapId,
           java.lang.String javaClassName,
           java.lang.String javaParameters,
           java.lang.String[] managedDepts,
           java.lang.String message,
           java.lang.String messageOID,
           AdminClient.Alert myAlert,
           AdminClient.AuditBase myAudit,
           java.lang.String protocol,
           java.lang.String specificTrapId,
           java.lang.String transferType,
           java.lang.String trapPort,
           java.lang.String trapStatus,
           java.lang.String type,
           java.lang.String typeUserLogon,
           java.lang.String userId,
           java.lang.String version) {
        super(
            AS2MDNStatus,
            CRLF,
            LRECL,
            OS390AllocPri,
            OS390AllocSec,
            OS390AllocType,
            OS390BlockSize,
            OS390DataClass,
            OS390MgtClass,
            OS390StorClass,
            OS390Unit,
            OS390Volume,
            RECFM,
            auditId,
            chkptCount,
            chkptInterval,
            chkptRestartFlag,
            clientCompressFlag,
            clientFileName,
            clientIPAddr,
            dataType,
            dateCreated,
            department,
            description,
            encryptFlag,
            fileOption,
            localTransactionId,
            localTranslationTable,
            manangedDepts,
            nodeName,
            nodeNameCF,
            numberOfDays,
            postActionData1,
            postActionData2,
            postActionData3,
            postActionData4,
            postActionFlag1,
            postActionFlag2,
            postActionFlag3,
            postActionFlag4,
            postActionReturn1,
            postActionReturn2,
            postActionReturn3,
            postActionReturn4,
            postActionType1,
            postActionType2,
            postActionType3,
            postActionType4,
            processName,
            proxyStatusMsg,
            proxyTrFlag,
            remoteTranslationTable,
            remoteUserIdJPA,
            requestID,
            sendRecvFlag,
            serverFileName,
            toEmailAddrFailure,
            toEmailAddrSuccess,
            transferByteCount,
            transferCompressedByteCount,
            transferEndTime,
            transferProtocol,
            transferStartTime,
            transferStatus,
            transferStatusMsgId,
            transferUserId,
            transferWork,
            userData,
            writeMode);
        this.JAVAStatus = JAVAStatus;
        this.JMSComment = JMSComment;
        this.JMSStatus = JMSStatus;
        this.JMSType = JMSType;
        this.SNMPAgentIP = SNMPAgentIP;
        this.SNMPMessage = SNMPMessage;
        this.SNMPServerIP = SNMPServerIP;
        this.actionName = actionName;
        this.alertAuditID = alertAuditID;
        this.alertDescription = alertDescription;
        this.alertID = alertID;
        this.alertName = alertName;
        this.alertSeverity = alertSeverity;
        this.alertSystem = alertSystem;
        this.alertTime = alertTime;
        this.auditID = auditID;
        this.cmdParameters = cmdParameters;
        this.cmdPath = cmdPath;
        this.cmdRunAs = cmdRunAs;
        this.cmdServerName = cmdServerName;
        this.cmdType = cmdType;
        this.cmdUserId = cmdUserId;
        this.commandStatus = commandStatus;
        this.communityName = communityName;
        this.emailComment = emailComment;
        this.emailRecipient = emailRecipient;
        this.emailStatus = emailStatus;
        this.emailTemplate = emailTemplate;
        this.enterpriseOID = enterpriseOID;
        this.genericTrapId = genericTrapId;
        this.javaClassName = javaClassName;
        this.javaParameters = javaParameters;
        this.managedDepts = managedDepts;
        this.message = message;
        this.messageOID = messageOID;
        this.myAlert = myAlert;
        this.myAudit = myAudit;
        this.protocol = protocol;
        this.specificTrapId = specificTrapId;
        this.transferType = transferType;
        this.trapPort = trapPort;
        this.trapStatus = trapStatus;
        this.type = type;
        this.typeUserLogon = typeUserLogon;
        this.userId = userId;
        this.version = version;
    }


    /**
     * Gets the JAVAStatus value for this AuditAlert.
     * 
     * @return JAVAStatus
     */
    public java.lang.String getJAVAStatus() {
        return JAVAStatus;
    }


    /**
     * Sets the JAVAStatus value for this AuditAlert.
     * 
     * @param JAVAStatus
     */
    public void setJAVAStatus(java.lang.String JAVAStatus) {
        this.JAVAStatus = JAVAStatus;
    }


    /**
     * Gets the JMSComment value for this AuditAlert.
     * 
     * @return JMSComment
     */
    public java.lang.String getJMSComment() {
        return JMSComment;
    }


    /**
     * Sets the JMSComment value for this AuditAlert.
     * 
     * @param JMSComment
     */
    public void setJMSComment(java.lang.String JMSComment) {
        this.JMSComment = JMSComment;
    }


    /**
     * Gets the JMSStatus value for this AuditAlert.
     * 
     * @return JMSStatus
     */
    public java.lang.String getJMSStatus() {
        return JMSStatus;
    }


    /**
     * Sets the JMSStatus value for this AuditAlert.
     * 
     * @param JMSStatus
     */
    public void setJMSStatus(java.lang.String JMSStatus) {
        this.JMSStatus = JMSStatus;
    }


    /**
     * Gets the JMSType value for this AuditAlert.
     * 
     * @return JMSType
     */
    public java.lang.String getJMSType() {
        return JMSType;
    }


    /**
     * Sets the JMSType value for this AuditAlert.
     * 
     * @param JMSType
     */
    public void setJMSType(java.lang.String JMSType) {
        this.JMSType = JMSType;
    }


    /**
     * Gets the SNMPAgentIP value for this AuditAlert.
     * 
     * @return SNMPAgentIP
     */
    public java.lang.String getSNMPAgentIP() {
        return SNMPAgentIP;
    }


    /**
     * Sets the SNMPAgentIP value for this AuditAlert.
     * 
     * @param SNMPAgentIP
     */
    public void setSNMPAgentIP(java.lang.String SNMPAgentIP) {
        this.SNMPAgentIP = SNMPAgentIP;
    }


    /**
     * Gets the SNMPMessage value for this AuditAlert.
     * 
     * @return SNMPMessage
     */
    public java.lang.String getSNMPMessage() {
        return SNMPMessage;
    }


    /**
     * Sets the SNMPMessage value for this AuditAlert.
     * 
     * @param SNMPMessage
     */
    public void setSNMPMessage(java.lang.String SNMPMessage) {
        this.SNMPMessage = SNMPMessage;
    }


    /**
     * Gets the SNMPServerIP value for this AuditAlert.
     * 
     * @return SNMPServerIP
     */
    public java.lang.String getSNMPServerIP() {
        return SNMPServerIP;
    }


    /**
     * Sets the SNMPServerIP value for this AuditAlert.
     * 
     * @param SNMPServerIP
     */
    public void setSNMPServerIP(java.lang.String SNMPServerIP) {
        this.SNMPServerIP = SNMPServerIP;
    }


    /**
     * Gets the actionName value for this AuditAlert.
     * 
     * @return actionName
     */
    public java.lang.String getActionName() {
        return actionName;
    }


    /**
     * Sets the actionName value for this AuditAlert.
     * 
     * @param actionName
     */
    public void setActionName(java.lang.String actionName) {
        this.actionName = actionName;
    }


    /**
     * Gets the alertAuditID value for this AuditAlert.
     * 
     * @return alertAuditID
     */
    public java.lang.String getAlertAuditID() {
        return alertAuditID;
    }


    /**
     * Sets the alertAuditID value for this AuditAlert.
     * 
     * @param alertAuditID
     */
    public void setAlertAuditID(java.lang.String alertAuditID) {
        this.alertAuditID = alertAuditID;
    }


    /**
     * Gets the alertDescription value for this AuditAlert.
     * 
     * @return alertDescription
     */
    public java.lang.String getAlertDescription() {
        return alertDescription;
    }


    /**
     * Sets the alertDescription value for this AuditAlert.
     * 
     * @param alertDescription
     */
    public void setAlertDescription(java.lang.String alertDescription) {
        this.alertDescription = alertDescription;
    }


    /**
     * Gets the alertID value for this AuditAlert.
     * 
     * @return alertID
     */
    public java.lang.String getAlertID() {
        return alertID;
    }


    /**
     * Sets the alertID value for this AuditAlert.
     * 
     * @param alertID
     */
    public void setAlertID(java.lang.String alertID) {
        this.alertID = alertID;
    }


    /**
     * Gets the alertName value for this AuditAlert.
     * 
     * @return alertName
     */
    public java.lang.String getAlertName() {
        return alertName;
    }


    /**
     * Sets the alertName value for this AuditAlert.
     * 
     * @param alertName
     */
    public void setAlertName(java.lang.String alertName) {
        this.alertName = alertName;
    }


    /**
     * Gets the alertSeverity value for this AuditAlert.
     * 
     * @return alertSeverity
     */
    public java.lang.String getAlertSeverity() {
        return alertSeverity;
    }


    /**
     * Sets the alertSeverity value for this AuditAlert.
     * 
     * @param alertSeverity
     */
    public void setAlertSeverity(java.lang.String alertSeverity) {
        this.alertSeverity = alertSeverity;
    }


    /**
     * Gets the alertSystem value for this AuditAlert.
     * 
     * @return alertSystem
     */
    public java.lang.String getAlertSystem() {
        return alertSystem;
    }


    /**
     * Sets the alertSystem value for this AuditAlert.
     * 
     * @param alertSystem
     */
    public void setAlertSystem(java.lang.String alertSystem) {
        this.alertSystem = alertSystem;
    }


    /**
     * Gets the alertTime value for this AuditAlert.
     * 
     * @return alertTime
     */
    public AdminClient.DateTime getAlertTime() {
        return alertTime;
    }


    /**
     * Sets the alertTime value for this AuditAlert.
     * 
     * @param alertTime
     */
    public void setAlertTime(AdminClient.DateTime alertTime) {
        this.alertTime = alertTime;
    }


    /**
     * Gets the auditID value for this AuditAlert.
     * 
     * @return auditID
     */
    public java.lang.String getAuditID() {
        return auditID;
    }


    /**
     * Sets the auditID value for this AuditAlert.
     * 
     * @param auditID
     */
    public void setAuditID(java.lang.String auditID) {
        this.auditID = auditID;
    }


    /**
     * Gets the cmdParameters value for this AuditAlert.
     * 
     * @return cmdParameters
     */
    public java.lang.String getCmdParameters() {
        return cmdParameters;
    }


    /**
     * Sets the cmdParameters value for this AuditAlert.
     * 
     * @param cmdParameters
     */
    public void setCmdParameters(java.lang.String cmdParameters) {
        this.cmdParameters = cmdParameters;
    }


    /**
     * Gets the cmdPath value for this AuditAlert.
     * 
     * @return cmdPath
     */
    public java.lang.String getCmdPath() {
        return cmdPath;
    }


    /**
     * Sets the cmdPath value for this AuditAlert.
     * 
     * @param cmdPath
     */
    public void setCmdPath(java.lang.String cmdPath) {
        this.cmdPath = cmdPath;
    }


    /**
     * Gets the cmdRunAs value for this AuditAlert.
     * 
     * @return cmdRunAs
     */
    public java.lang.String getCmdRunAs() {
        return cmdRunAs;
    }


    /**
     * Sets the cmdRunAs value for this AuditAlert.
     * 
     * @param cmdRunAs
     */
    public void setCmdRunAs(java.lang.String cmdRunAs) {
        this.cmdRunAs = cmdRunAs;
    }


    /**
     * Gets the cmdServerName value for this AuditAlert.
     * 
     * @return cmdServerName
     */
    public java.lang.String getCmdServerName() {
        return cmdServerName;
    }


    /**
     * Sets the cmdServerName value for this AuditAlert.
     * 
     * @param cmdServerName
     */
    public void setCmdServerName(java.lang.String cmdServerName) {
        this.cmdServerName = cmdServerName;
    }


    /**
     * Gets the cmdType value for this AuditAlert.
     * 
     * @return cmdType
     */
    public java.lang.String getCmdType() {
        return cmdType;
    }


    /**
     * Sets the cmdType value for this AuditAlert.
     * 
     * @param cmdType
     */
    public void setCmdType(java.lang.String cmdType) {
        this.cmdType = cmdType;
    }


    /**
     * Gets the cmdUserId value for this AuditAlert.
     * 
     * @return cmdUserId
     */
    public java.lang.String getCmdUserId() {
        return cmdUserId;
    }


    /**
     * Sets the cmdUserId value for this AuditAlert.
     * 
     * @param cmdUserId
     */
    public void setCmdUserId(java.lang.String cmdUserId) {
        this.cmdUserId = cmdUserId;
    }


    /**
     * Gets the commandStatus value for this AuditAlert.
     * 
     * @return commandStatus
     */
    public java.lang.String getCommandStatus() {
        return commandStatus;
    }


    /**
     * Sets the commandStatus value for this AuditAlert.
     * 
     * @param commandStatus
     */
    public void setCommandStatus(java.lang.String commandStatus) {
        this.commandStatus = commandStatus;
    }


    /**
     * Gets the communityName value for this AuditAlert.
     * 
     * @return communityName
     */
    public java.lang.String getCommunityName() {
        return communityName;
    }


    /**
     * Sets the communityName value for this AuditAlert.
     * 
     * @param communityName
     */
    public void setCommunityName(java.lang.String communityName) {
        this.communityName = communityName;
    }


    /**
     * Gets the emailComment value for this AuditAlert.
     * 
     * @return emailComment
     */
    public java.lang.String getEmailComment() {
        return emailComment;
    }


    /**
     * Sets the emailComment value for this AuditAlert.
     * 
     * @param emailComment
     */
    public void setEmailComment(java.lang.String emailComment) {
        this.emailComment = emailComment;
    }


    /**
     * Gets the emailRecipient value for this AuditAlert.
     * 
     * @return emailRecipient
     */
    public java.lang.String getEmailRecipient() {
        return emailRecipient;
    }


    /**
     * Sets the emailRecipient value for this AuditAlert.
     * 
     * @param emailRecipient
     */
    public void setEmailRecipient(java.lang.String emailRecipient) {
        this.emailRecipient = emailRecipient;
    }


    /**
     * Gets the emailStatus value for this AuditAlert.
     * 
     * @return emailStatus
     */
    public java.lang.String getEmailStatus() {
        return emailStatus;
    }


    /**
     * Sets the emailStatus value for this AuditAlert.
     * 
     * @param emailStatus
     */
    public void setEmailStatus(java.lang.String emailStatus) {
        this.emailStatus = emailStatus;
    }


    /**
     * Gets the emailTemplate value for this AuditAlert.
     * 
     * @return emailTemplate
     */
    public java.lang.String getEmailTemplate() {
        return emailTemplate;
    }


    /**
     * Sets the emailTemplate value for this AuditAlert.
     * 
     * @param emailTemplate
     */
    public void setEmailTemplate(java.lang.String emailTemplate) {
        this.emailTemplate = emailTemplate;
    }


    /**
     * Gets the enterpriseOID value for this AuditAlert.
     * 
     * @return enterpriseOID
     */
    public java.lang.String getEnterpriseOID() {
        return enterpriseOID;
    }


    /**
     * Sets the enterpriseOID value for this AuditAlert.
     * 
     * @param enterpriseOID
     */
    public void setEnterpriseOID(java.lang.String enterpriseOID) {
        this.enterpriseOID = enterpriseOID;
    }


    /**
     * Gets the genericTrapId value for this AuditAlert.
     * 
     * @return genericTrapId
     */
    public java.lang.String getGenericTrapId() {
        return genericTrapId;
    }


    /**
     * Sets the genericTrapId value for this AuditAlert.
     * 
     * @param genericTrapId
     */
    public void setGenericTrapId(java.lang.String genericTrapId) {
        this.genericTrapId = genericTrapId;
    }


    /**
     * Gets the javaClassName value for this AuditAlert.
     * 
     * @return javaClassName
     */
    public java.lang.String getJavaClassName() {
        return javaClassName;
    }


    /**
     * Sets the javaClassName value for this AuditAlert.
     * 
     * @param javaClassName
     */
    public void setJavaClassName(java.lang.String javaClassName) {
        this.javaClassName = javaClassName;
    }


    /**
     * Gets the javaParameters value for this AuditAlert.
     * 
     * @return javaParameters
     */
    public java.lang.String getJavaParameters() {
        return javaParameters;
    }


    /**
     * Sets the javaParameters value for this AuditAlert.
     * 
     * @param javaParameters
     */
    public void setJavaParameters(java.lang.String javaParameters) {
        this.javaParameters = javaParameters;
    }


    /**
     * Gets the managedDepts value for this AuditAlert.
     * 
     * @return managedDepts
     */
    public java.lang.String[] getManagedDepts() {
        return managedDepts;
    }


    /**
     * Sets the managedDepts value for this AuditAlert.
     * 
     * @param managedDepts
     */
    public void setManagedDepts(java.lang.String[] managedDepts) {
        this.managedDepts = managedDepts;
    }


    /**
     * Gets the message value for this AuditAlert.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this AuditAlert.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }


    /**
     * Gets the messageOID value for this AuditAlert.
     * 
     * @return messageOID
     */
    public java.lang.String getMessageOID() {
        return messageOID;
    }


    /**
     * Sets the messageOID value for this AuditAlert.
     * 
     * @param messageOID
     */
    public void setMessageOID(java.lang.String messageOID) {
        this.messageOID = messageOID;
    }


    /**
     * Gets the myAlert value for this AuditAlert.
     * 
     * @return myAlert
     */
    public AdminClient.Alert getMyAlert() {
        return myAlert;
    }


    /**
     * Sets the myAlert value for this AuditAlert.
     * 
     * @param myAlert
     */
    public void setMyAlert(AdminClient.Alert myAlert) {
        this.myAlert = myAlert;
    }


    /**
     * Gets the myAudit value for this AuditAlert.
     * 
     * @return myAudit
     */
    public AdminClient.AuditBase getMyAudit() {
        return myAudit;
    }


    /**
     * Sets the myAudit value for this AuditAlert.
     * 
     * @param myAudit
     */
    public void setMyAudit(AdminClient.AuditBase myAudit) {
        this.myAudit = myAudit;
    }


    /**
     * Gets the protocol value for this AuditAlert.
     * 
     * @return protocol
     */
    public java.lang.String getProtocol() {
        return protocol;
    }


    /**
     * Sets the protocol value for this AuditAlert.
     * 
     * @param protocol
     */
    public void setProtocol(java.lang.String protocol) {
        this.protocol = protocol;
    }


    /**
     * Gets the specificTrapId value for this AuditAlert.
     * 
     * @return specificTrapId
     */
    public java.lang.String getSpecificTrapId() {
        return specificTrapId;
    }


    /**
     * Sets the specificTrapId value for this AuditAlert.
     * 
     * @param specificTrapId
     */
    public void setSpecificTrapId(java.lang.String specificTrapId) {
        this.specificTrapId = specificTrapId;
    }


    /**
     * Gets the transferType value for this AuditAlert.
     * 
     * @return transferType
     */
    public java.lang.String getTransferType() {
        return transferType;
    }


    /**
     * Sets the transferType value for this AuditAlert.
     * 
     * @param transferType
     */
    public void setTransferType(java.lang.String transferType) {
        this.transferType = transferType;
    }


    /**
     * Gets the trapPort value for this AuditAlert.
     * 
     * @return trapPort
     */
    public java.lang.String getTrapPort() {
        return trapPort;
    }


    /**
     * Sets the trapPort value for this AuditAlert.
     * 
     * @param trapPort
     */
    public void setTrapPort(java.lang.String trapPort) {
        this.trapPort = trapPort;
    }


    /**
     * Gets the trapStatus value for this AuditAlert.
     * 
     * @return trapStatus
     */
    public java.lang.String getTrapStatus() {
        return trapStatus;
    }


    /**
     * Sets the trapStatus value for this AuditAlert.
     * 
     * @param trapStatus
     */
    public void setTrapStatus(java.lang.String trapStatus) {
        this.trapStatus = trapStatus;
    }


    /**
     * Gets the type value for this AuditAlert.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this AuditAlert.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the typeUserLogon value for this AuditAlert.
     * 
     * @return typeUserLogon
     */
    public java.lang.String getTypeUserLogon() {
        return typeUserLogon;
    }


    /**
     * Sets the typeUserLogon value for this AuditAlert.
     * 
     * @param typeUserLogon
     */
    public void setTypeUserLogon(java.lang.String typeUserLogon) {
        this.typeUserLogon = typeUserLogon;
    }


    /**
     * Gets the userId value for this AuditAlert.
     * 
     * @return userId
     */
    public java.lang.String getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this AuditAlert.
     * 
     * @param userId
     */
    public void setUserId(java.lang.String userId) {
        this.userId = userId;
    }


    /**
     * Gets the version value for this AuditAlert.
     * 
     * @return version
     */
    public java.lang.String getVersion() {
        return version;
    }


    /**
     * Sets the version value for this AuditAlert.
     * 
     * @param version
     */
    public void setVersion(java.lang.String version) {
        this.version = version;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AuditAlert)) return false;
        AuditAlert other = (AuditAlert) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.JAVAStatus==null && other.getJAVAStatus()==null) || 
             (this.JAVAStatus!=null &&
              this.JAVAStatus.equals(other.getJAVAStatus()))) &&
            ((this.JMSComment==null && other.getJMSComment()==null) || 
             (this.JMSComment!=null &&
              this.JMSComment.equals(other.getJMSComment()))) &&
            ((this.JMSStatus==null && other.getJMSStatus()==null) || 
             (this.JMSStatus!=null &&
              this.JMSStatus.equals(other.getJMSStatus()))) &&
            ((this.JMSType==null && other.getJMSType()==null) || 
             (this.JMSType!=null &&
              this.JMSType.equals(other.getJMSType()))) &&
            ((this.SNMPAgentIP==null && other.getSNMPAgentIP()==null) || 
             (this.SNMPAgentIP!=null &&
              this.SNMPAgentIP.equals(other.getSNMPAgentIP()))) &&
            ((this.SNMPMessage==null && other.getSNMPMessage()==null) || 
             (this.SNMPMessage!=null &&
              this.SNMPMessage.equals(other.getSNMPMessage()))) &&
            ((this.SNMPServerIP==null && other.getSNMPServerIP()==null) || 
             (this.SNMPServerIP!=null &&
              this.SNMPServerIP.equals(other.getSNMPServerIP()))) &&
            ((this.actionName==null && other.getActionName()==null) || 
             (this.actionName!=null &&
              this.actionName.equals(other.getActionName()))) &&
            ((this.alertAuditID==null && other.getAlertAuditID()==null) || 
             (this.alertAuditID!=null &&
              this.alertAuditID.equals(other.getAlertAuditID()))) &&
            ((this.alertDescription==null && other.getAlertDescription()==null) || 
             (this.alertDescription!=null &&
              this.alertDescription.equals(other.getAlertDescription()))) &&
            ((this.alertID==null && other.getAlertID()==null) || 
             (this.alertID!=null &&
              this.alertID.equals(other.getAlertID()))) &&
            ((this.alertName==null && other.getAlertName()==null) || 
             (this.alertName!=null &&
              this.alertName.equals(other.getAlertName()))) &&
            ((this.alertSeverity==null && other.getAlertSeverity()==null) || 
             (this.alertSeverity!=null &&
              this.alertSeverity.equals(other.getAlertSeverity()))) &&
            ((this.alertSystem==null && other.getAlertSystem()==null) || 
             (this.alertSystem!=null &&
              this.alertSystem.equals(other.getAlertSystem()))) &&
            ((this.alertTime==null && other.getAlertTime()==null) || 
             (this.alertTime!=null &&
              this.alertTime.equals(other.getAlertTime()))) &&
            ((this.auditID==null && other.getAuditID()==null) || 
             (this.auditID!=null &&
              this.auditID.equals(other.getAuditID()))) &&
            ((this.cmdParameters==null && other.getCmdParameters()==null) || 
             (this.cmdParameters!=null &&
              this.cmdParameters.equals(other.getCmdParameters()))) &&
            ((this.cmdPath==null && other.getCmdPath()==null) || 
             (this.cmdPath!=null &&
              this.cmdPath.equals(other.getCmdPath()))) &&
            ((this.cmdRunAs==null && other.getCmdRunAs()==null) || 
             (this.cmdRunAs!=null &&
              this.cmdRunAs.equals(other.getCmdRunAs()))) &&
            ((this.cmdServerName==null && other.getCmdServerName()==null) || 
             (this.cmdServerName!=null &&
              this.cmdServerName.equals(other.getCmdServerName()))) &&
            ((this.cmdType==null && other.getCmdType()==null) || 
             (this.cmdType!=null &&
              this.cmdType.equals(other.getCmdType()))) &&
            ((this.cmdUserId==null && other.getCmdUserId()==null) || 
             (this.cmdUserId!=null &&
              this.cmdUserId.equals(other.getCmdUserId()))) &&
            ((this.commandStatus==null && other.getCommandStatus()==null) || 
             (this.commandStatus!=null &&
              this.commandStatus.equals(other.getCommandStatus()))) &&
            ((this.communityName==null && other.getCommunityName()==null) || 
             (this.communityName!=null &&
              this.communityName.equals(other.getCommunityName()))) &&
            ((this.emailComment==null && other.getEmailComment()==null) || 
             (this.emailComment!=null &&
              this.emailComment.equals(other.getEmailComment()))) &&
            ((this.emailRecipient==null && other.getEmailRecipient()==null) || 
             (this.emailRecipient!=null &&
              this.emailRecipient.equals(other.getEmailRecipient()))) &&
            ((this.emailStatus==null && other.getEmailStatus()==null) || 
             (this.emailStatus!=null &&
              this.emailStatus.equals(other.getEmailStatus()))) &&
            ((this.emailTemplate==null && other.getEmailTemplate()==null) || 
             (this.emailTemplate!=null &&
              this.emailTemplate.equals(other.getEmailTemplate()))) &&
            ((this.enterpriseOID==null && other.getEnterpriseOID()==null) || 
             (this.enterpriseOID!=null &&
              this.enterpriseOID.equals(other.getEnterpriseOID()))) &&
            ((this.genericTrapId==null && other.getGenericTrapId()==null) || 
             (this.genericTrapId!=null &&
              this.genericTrapId.equals(other.getGenericTrapId()))) &&
            ((this.javaClassName==null && other.getJavaClassName()==null) || 
             (this.javaClassName!=null &&
              this.javaClassName.equals(other.getJavaClassName()))) &&
            ((this.javaParameters==null && other.getJavaParameters()==null) || 
             (this.javaParameters!=null &&
              this.javaParameters.equals(other.getJavaParameters()))) &&
            ((this.managedDepts==null && other.getManagedDepts()==null) || 
             (this.managedDepts!=null &&
              java.util.Arrays.equals(this.managedDepts, other.getManagedDepts()))) &&
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage()))) &&
            ((this.messageOID==null && other.getMessageOID()==null) || 
             (this.messageOID!=null &&
              this.messageOID.equals(other.getMessageOID()))) &&
            ((this.myAlert==null && other.getMyAlert()==null) || 
             (this.myAlert!=null &&
              this.myAlert.equals(other.getMyAlert()))) &&
            ((this.myAudit==null && other.getMyAudit()==null) || 
             (this.myAudit!=null &&
              this.myAudit.equals(other.getMyAudit()))) &&
            ((this.protocol==null && other.getProtocol()==null) || 
             (this.protocol!=null &&
              this.protocol.equals(other.getProtocol()))) &&
            ((this.specificTrapId==null && other.getSpecificTrapId()==null) || 
             (this.specificTrapId!=null &&
              this.specificTrapId.equals(other.getSpecificTrapId()))) &&
            ((this.transferType==null && other.getTransferType()==null) || 
             (this.transferType!=null &&
              this.transferType.equals(other.getTransferType()))) &&
            ((this.trapPort==null && other.getTrapPort()==null) || 
             (this.trapPort!=null &&
              this.trapPort.equals(other.getTrapPort()))) &&
            ((this.trapStatus==null && other.getTrapStatus()==null) || 
             (this.trapStatus!=null &&
              this.trapStatus.equals(other.getTrapStatus()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.typeUserLogon==null && other.getTypeUserLogon()==null) || 
             (this.typeUserLogon!=null &&
              this.typeUserLogon.equals(other.getTypeUserLogon()))) &&
            ((this.userId==null && other.getUserId()==null) || 
             (this.userId!=null &&
              this.userId.equals(other.getUserId()))) &&
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
        int _hashCode = super.hashCode();
        if (getJAVAStatus() != null) {
            _hashCode += getJAVAStatus().hashCode();
        }
        if (getJMSComment() != null) {
            _hashCode += getJMSComment().hashCode();
        }
        if (getJMSStatus() != null) {
            _hashCode += getJMSStatus().hashCode();
        }
        if (getJMSType() != null) {
            _hashCode += getJMSType().hashCode();
        }
        if (getSNMPAgentIP() != null) {
            _hashCode += getSNMPAgentIP().hashCode();
        }
        if (getSNMPMessage() != null) {
            _hashCode += getSNMPMessage().hashCode();
        }
        if (getSNMPServerIP() != null) {
            _hashCode += getSNMPServerIP().hashCode();
        }
        if (getActionName() != null) {
            _hashCode += getActionName().hashCode();
        }
        if (getAlertAuditID() != null) {
            _hashCode += getAlertAuditID().hashCode();
        }
        if (getAlertDescription() != null) {
            _hashCode += getAlertDescription().hashCode();
        }
        if (getAlertID() != null) {
            _hashCode += getAlertID().hashCode();
        }
        if (getAlertName() != null) {
            _hashCode += getAlertName().hashCode();
        }
        if (getAlertSeverity() != null) {
            _hashCode += getAlertSeverity().hashCode();
        }
        if (getAlertSystem() != null) {
            _hashCode += getAlertSystem().hashCode();
        }
        if (getAlertTime() != null) {
            _hashCode += getAlertTime().hashCode();
        }
        if (getAuditID() != null) {
            _hashCode += getAuditID().hashCode();
        }
        if (getCmdParameters() != null) {
            _hashCode += getCmdParameters().hashCode();
        }
        if (getCmdPath() != null) {
            _hashCode += getCmdPath().hashCode();
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
        if (getCmdUserId() != null) {
            _hashCode += getCmdUserId().hashCode();
        }
        if (getCommandStatus() != null) {
            _hashCode += getCommandStatus().hashCode();
        }
        if (getCommunityName() != null) {
            _hashCode += getCommunityName().hashCode();
        }
        if (getEmailComment() != null) {
            _hashCode += getEmailComment().hashCode();
        }
        if (getEmailRecipient() != null) {
            _hashCode += getEmailRecipient().hashCode();
        }
        if (getEmailStatus() != null) {
            _hashCode += getEmailStatus().hashCode();
        }
        if (getEmailTemplate() != null) {
            _hashCode += getEmailTemplate().hashCode();
        }
        if (getEnterpriseOID() != null) {
            _hashCode += getEnterpriseOID().hashCode();
        }
        if (getGenericTrapId() != null) {
            _hashCode += getGenericTrapId().hashCode();
        }
        if (getJavaClassName() != null) {
            _hashCode += getJavaClassName().hashCode();
        }
        if (getJavaParameters() != null) {
            _hashCode += getJavaParameters().hashCode();
        }
        if (getManagedDepts() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getManagedDepts());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getManagedDepts(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        if (getMessageOID() != null) {
            _hashCode += getMessageOID().hashCode();
        }
        if (getMyAlert() != null) {
            _hashCode += getMyAlert().hashCode();
        }
        if (getMyAudit() != null) {
            _hashCode += getMyAudit().hashCode();
        }
        if (getProtocol() != null) {
            _hashCode += getProtocol().hashCode();
        }
        if (getSpecificTrapId() != null) {
            _hashCode += getSpecificTrapId().hashCode();
        }
        if (getTransferType() != null) {
            _hashCode += getTransferType().hashCode();
        }
        if (getTrapPort() != null) {
            _hashCode += getTrapPort().hashCode();
        }
        if (getTrapStatus() != null) {
            _hashCode += getTrapStatus().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getTypeUserLogon() != null) {
            _hashCode += getTypeUserLogon().hashCode();
        }
        if (getUserId() != null) {
            _hashCode += getUserId().hashCode();
        }
        if (getVersion() != null) {
            _hashCode += getVersion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AuditAlert.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:AdministratorService", "AuditAlert"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("JAVAStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "JAVAStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("JMSComment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "JMSComment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("JMSStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "JMSStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("JMSType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "JMSType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SNMPAgentIP");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SNMPAgentIP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SNMPMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SNMPMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SNMPServerIP");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SNMPServerIP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actionName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "actionName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alertAuditID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "alertAuditID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alertDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("", "alertDescription"));
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
        elemField.setFieldName("alertName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "alertName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alertSeverity");
        elemField.setXmlName(new javax.xml.namespace.QName("", "alertSeverity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alertSystem");
        elemField.setXmlName(new javax.xml.namespace.QName("", "alertSystem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alertTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "alertTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:AdministratorService", "DateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("auditID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "auditID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cmdParameters");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cmdParameters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cmdPath");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cmdPath"));
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
        elemField.setFieldName("cmdUserId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cmdUserId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commandStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "commandStatus"));
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
        elemField.setFieldName("emailComment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "emailComment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailRecipient");
        elemField.setXmlName(new javax.xml.namespace.QName("", "emailRecipient"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "emailStatus"));
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
        elemField.setFieldName("enterpriseOID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "enterpriseOID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("genericTrapId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "genericTrapId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("javaClassName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "javaClassName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("javaParameters");
        elemField.setXmlName(new javax.xml.namespace.QName("", "javaParameters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("managedDepts");
        elemField.setXmlName(new javax.xml.namespace.QName("", "managedDepts"));
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
        elemField.setFieldName("myAlert");
        elemField.setXmlName(new javax.xml.namespace.QName("", "myAlert"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:AdministratorService", "Alert"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("myAudit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "myAudit"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:AdministratorService", "AuditBase"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("protocol");
        elemField.setXmlName(new javax.xml.namespace.QName("", "protocol"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("specificTrapId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "specificTrapId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transferType"));
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
        elemField.setFieldName("trapStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "trapStatus"));
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
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userId"));
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
