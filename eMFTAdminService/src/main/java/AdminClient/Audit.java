/**
 * Audit.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 11, 2014 (12:11:36 EDT) WSDL2Java emitter.
 */

package AdminClient;

public class Audit  extends AdminClient.AuditBase  implements java.io.Serializable {
    private AdminClient.AS2Audit AS2AuditProxy;

    private AdminClient.AS2Audit AS2AuditServer;

    private java.lang.String CFClient_CR_LF;

    private java.lang.String CFClient_CheckPointCount;

    private java.lang.String CFClient_CheckPointInterval;

    private java.lang.String CFClient_CheckPointRestart;

    private java.lang.String CFClient_Compression;

    private java.lang.String CFClient_DataType;

    private java.lang.String CFClient_EncryptFlag;

    private java.lang.String CFClient_InitFileSpec;

    private java.lang.String CFClient_InitUserID;

    private java.lang.String CFClient_ProcessName;

    private java.lang.String CFClient_RemoteTransaction;

    private java.lang.String CFClient_RespFileSpec;

    private java.lang.String CFClient_StatusDiagCode;

    private java.lang.String CFClient_StatusMsg;

    private java.lang.String CFClient_StatusSeverity;

    private AdminClient.DateTime CFClient_TrEndTime;

    private AdminClient.DateTime CFClient_TrStartTime;

    private java.lang.String CFClient_TransactionNumber;

    private java.lang.String CFClient_TransferWork;

    private java.lang.String CFClient_UserData;

    private java.lang.String CFClient_Version;

    private java.lang.String FTPAlias;

    private java.lang.String JMSProperty;

    private java.lang.String JMSSelector;

    private java.lang.String PGPArmorFlag;

    private java.lang.String PGPClCompAlg;

    private java.lang.String PGPClEncKeyId;

    private java.lang.String PGPClEncryptAlg;

    private java.lang.String PGPClHashingAlg;

    private java.lang.String PGPClSignature;

    private java.lang.String PGPClSigned;

    private java.lang.String PGPClSignerId;

    private java.lang.String PGPClSigningKeyId;

    private java.lang.String PGPClVerified;

    private java.lang.String PGPCompAlg;

    private java.lang.String PGPEncryptAlg;

    private java.lang.String PGPHashingAlg;

    private java.lang.String PGPSrvEncKeyId;

    private java.lang.String PGPSrvSignature;

    private java.lang.String PGPSrvSigned;

    private java.lang.String PGPSrvSignerId;

    private java.lang.String PGPSrvSigningKeyId;

    private java.lang.String PGPSrvVerified;

    private java.lang.String PGPTextMode;

    private java.lang.String allowableProtocol;

    private java.lang.String authRoleId;

    private java.lang.String authUserId;

    private AdminClient.DateTime availableDate;

    private java.lang.String availableUpdatedBy;

    private java.lang.String chkptTryMaxCount;

    private java.lang.String ckPtTryMaxCount;

    private java.lang.String conversionFlag;

    private java.lang.String defaultNodePwd;

    private java.lang.String defaultNodeUserId;

    private java.lang.String directoryTransfer;

    private java.lang.String disableFlag;

    private java.lang.String emailFailureFlag;

    private java.lang.String emailFailureTemplate;

    private java.lang.String emailSuccessFlag;

    private java.lang.String emailSuccessTemplate;

    private AdminClient.DateTime expirationDate;

    private java.lang.String fileId;

    private java.lang.String fileShareFlag;

    private java.lang.String localHostName;

    private java.lang.String oneTimeFlag;

    private java.lang.String proxyByteCount;

    private java.lang.String proxyCompressedByteCount;

    private java.lang.String proxyRemoteNTDomain;

    private java.lang.String proxyRemotePassword;

    private java.lang.String proxyRemoteTransactionId;

    private java.lang.String proxyRemoteUserId;

    private java.lang.String proxyStatusDiagCode;

    private java.lang.String proxyStatusSeverity;

    private java.lang.String proxyTraceAppFileName;

    private java.lang.String proxyTraceCommFileName;

    private java.lang.String serverPhysicalFileName;

    private java.lang.String tokenData;

    private AdminClient.DateTime tokenDateSet;

    private java.lang.String tokenFlag;

    private java.lang.String traceAppFileName;

    private java.lang.String traceCommFileName;

    private java.lang.String traceFlag;

    private java.lang.String transferNotificationEmailAddress;

    private java.lang.String transferNotificationEmailTemplate;

    private java.lang.String unixPermissions;

    private java.lang.String validDays;

    private java.lang.String validEndTime;

    private java.lang.String validStartTime;

    private java.lang.String virusCheckFlag;

    public Audit() {
    }

    public Audit(
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
           AdminClient.AS2Audit AS2AuditProxy,
           AdminClient.AS2Audit AS2AuditServer,
           java.lang.String CFClient_CR_LF,
           java.lang.String CFClient_CheckPointCount,
           java.lang.String CFClient_CheckPointInterval,
           java.lang.String CFClient_CheckPointRestart,
           java.lang.String CFClient_Compression,
           java.lang.String CFClient_DataType,
           java.lang.String CFClient_EncryptFlag,
           java.lang.String CFClient_InitFileSpec,
           java.lang.String CFClient_InitUserID,
           java.lang.String CFClient_ProcessName,
           java.lang.String CFClient_RemoteTransaction,
           java.lang.String CFClient_RespFileSpec,
           java.lang.String CFClient_StatusDiagCode,
           java.lang.String CFClient_StatusMsg,
           java.lang.String CFClient_StatusSeverity,
           AdminClient.DateTime CFClient_TrEndTime,
           AdminClient.DateTime CFClient_TrStartTime,
           java.lang.String CFClient_TransactionNumber,
           java.lang.String CFClient_TransferWork,
           java.lang.String CFClient_UserData,
           java.lang.String CFClient_Version,
           java.lang.String FTPAlias,
           java.lang.String JMSProperty,
           java.lang.String JMSSelector,
           java.lang.String PGPArmorFlag,
           java.lang.String PGPClCompAlg,
           java.lang.String PGPClEncKeyId,
           java.lang.String PGPClEncryptAlg,
           java.lang.String PGPClHashingAlg,
           java.lang.String PGPClSignature,
           java.lang.String PGPClSigned,
           java.lang.String PGPClSignerId,
           java.lang.String PGPClSigningKeyId,
           java.lang.String PGPClVerified,
           java.lang.String PGPCompAlg,
           java.lang.String PGPEncryptAlg,
           java.lang.String PGPHashingAlg,
           java.lang.String PGPSrvEncKeyId,
           java.lang.String PGPSrvSignature,
           java.lang.String PGPSrvSigned,
           java.lang.String PGPSrvSignerId,
           java.lang.String PGPSrvSigningKeyId,
           java.lang.String PGPSrvVerified,
           java.lang.String PGPTextMode,
           java.lang.String allowableProtocol,
           java.lang.String authRoleId,
           java.lang.String authUserId,
           AdminClient.DateTime availableDate,
           java.lang.String availableUpdatedBy,
           java.lang.String chkptTryMaxCount,
           java.lang.String ckPtTryMaxCount,
           java.lang.String conversionFlag,
           java.lang.String defaultNodePwd,
           java.lang.String defaultNodeUserId,
           java.lang.String directoryTransfer,
           java.lang.String disableFlag,
           java.lang.String emailFailureFlag,
           java.lang.String emailFailureTemplate,
           java.lang.String emailSuccessFlag,
           java.lang.String emailSuccessTemplate,
           AdminClient.DateTime expirationDate,
           java.lang.String fileId,
           java.lang.String fileShareFlag,
           java.lang.String localHostName,
           java.lang.String oneTimeFlag,
           java.lang.String proxyByteCount,
           java.lang.String proxyCompressedByteCount,
           java.lang.String proxyRemoteNTDomain,
           java.lang.String proxyRemotePassword,
           java.lang.String proxyRemoteTransactionId,
           java.lang.String proxyRemoteUserId,
           java.lang.String proxyStatusDiagCode,
           java.lang.String proxyStatusSeverity,
           java.lang.String proxyTraceAppFileName,
           java.lang.String proxyTraceCommFileName,
           java.lang.String serverPhysicalFileName,
           java.lang.String tokenData,
           AdminClient.DateTime tokenDateSet,
           java.lang.String tokenFlag,
           java.lang.String traceAppFileName,
           java.lang.String traceCommFileName,
           java.lang.String traceFlag,
           java.lang.String transferNotificationEmailAddress,
           java.lang.String transferNotificationEmailTemplate,
           java.lang.String unixPermissions,
           java.lang.String validDays,
           java.lang.String validEndTime,
           java.lang.String validStartTime,
           java.lang.String virusCheckFlag) {
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
        this.AS2AuditProxy = AS2AuditProxy;
        this.AS2AuditServer = AS2AuditServer;
        this.CFClient_CR_LF = CFClient_CR_LF;
        this.CFClient_CheckPointCount = CFClient_CheckPointCount;
        this.CFClient_CheckPointInterval = CFClient_CheckPointInterval;
        this.CFClient_CheckPointRestart = CFClient_CheckPointRestart;
        this.CFClient_Compression = CFClient_Compression;
        this.CFClient_DataType = CFClient_DataType;
        this.CFClient_EncryptFlag = CFClient_EncryptFlag;
        this.CFClient_InitFileSpec = CFClient_InitFileSpec;
        this.CFClient_InitUserID = CFClient_InitUserID;
        this.CFClient_ProcessName = CFClient_ProcessName;
        this.CFClient_RemoteTransaction = CFClient_RemoteTransaction;
        this.CFClient_RespFileSpec = CFClient_RespFileSpec;
        this.CFClient_StatusDiagCode = CFClient_StatusDiagCode;
        this.CFClient_StatusMsg = CFClient_StatusMsg;
        this.CFClient_StatusSeverity = CFClient_StatusSeverity;
        this.CFClient_TrEndTime = CFClient_TrEndTime;
        this.CFClient_TrStartTime = CFClient_TrStartTime;
        this.CFClient_TransactionNumber = CFClient_TransactionNumber;
        this.CFClient_TransferWork = CFClient_TransferWork;
        this.CFClient_UserData = CFClient_UserData;
        this.CFClient_Version = CFClient_Version;
        this.FTPAlias = FTPAlias;
        this.JMSProperty = JMSProperty;
        this.JMSSelector = JMSSelector;
        this.PGPArmorFlag = PGPArmorFlag;
        this.PGPClCompAlg = PGPClCompAlg;
        this.PGPClEncKeyId = PGPClEncKeyId;
        this.PGPClEncryptAlg = PGPClEncryptAlg;
        this.PGPClHashingAlg = PGPClHashingAlg;
        this.PGPClSignature = PGPClSignature;
        this.PGPClSigned = PGPClSigned;
        this.PGPClSignerId = PGPClSignerId;
        this.PGPClSigningKeyId = PGPClSigningKeyId;
        this.PGPClVerified = PGPClVerified;
        this.PGPCompAlg = PGPCompAlg;
        this.PGPEncryptAlg = PGPEncryptAlg;
        this.PGPHashingAlg = PGPHashingAlg;
        this.PGPSrvEncKeyId = PGPSrvEncKeyId;
        this.PGPSrvSignature = PGPSrvSignature;
        this.PGPSrvSigned = PGPSrvSigned;
        this.PGPSrvSignerId = PGPSrvSignerId;
        this.PGPSrvSigningKeyId = PGPSrvSigningKeyId;
        this.PGPSrvVerified = PGPSrvVerified;
        this.PGPTextMode = PGPTextMode;
        this.allowableProtocol = allowableProtocol;
        this.authRoleId = authRoleId;
        this.authUserId = authUserId;
        this.availableDate = availableDate;
        this.availableUpdatedBy = availableUpdatedBy;
        this.chkptTryMaxCount = chkptTryMaxCount;
        this.ckPtTryMaxCount = ckPtTryMaxCount;
        this.conversionFlag = conversionFlag;
        this.defaultNodePwd = defaultNodePwd;
        this.defaultNodeUserId = defaultNodeUserId;
        this.directoryTransfer = directoryTransfer;
        this.disableFlag = disableFlag;
        this.emailFailureFlag = emailFailureFlag;
        this.emailFailureTemplate = emailFailureTemplate;
        this.emailSuccessFlag = emailSuccessFlag;
        this.emailSuccessTemplate = emailSuccessTemplate;
        this.expirationDate = expirationDate;
        this.fileId = fileId;
        this.fileShareFlag = fileShareFlag;
        this.localHostName = localHostName;
        this.oneTimeFlag = oneTimeFlag;
        this.proxyByteCount = proxyByteCount;
        this.proxyCompressedByteCount = proxyCompressedByteCount;
        this.proxyRemoteNTDomain = proxyRemoteNTDomain;
        this.proxyRemotePassword = proxyRemotePassword;
        this.proxyRemoteTransactionId = proxyRemoteTransactionId;
        this.proxyRemoteUserId = proxyRemoteUserId;
        this.proxyStatusDiagCode = proxyStatusDiagCode;
        this.proxyStatusSeverity = proxyStatusSeverity;
        this.proxyTraceAppFileName = proxyTraceAppFileName;
        this.proxyTraceCommFileName = proxyTraceCommFileName;
        this.serverPhysicalFileName = serverPhysicalFileName;
        this.tokenData = tokenData;
        this.tokenDateSet = tokenDateSet;
        this.tokenFlag = tokenFlag;
        this.traceAppFileName = traceAppFileName;
        this.traceCommFileName = traceCommFileName;
        this.traceFlag = traceFlag;
        this.transferNotificationEmailAddress = transferNotificationEmailAddress;
        this.transferNotificationEmailTemplate = transferNotificationEmailTemplate;
        this.unixPermissions = unixPermissions;
        this.validDays = validDays;
        this.validEndTime = validEndTime;
        this.validStartTime = validStartTime;
        this.virusCheckFlag = virusCheckFlag;
    }


    /**
     * Gets the AS2AuditProxy value for this Audit.
     * 
     * @return AS2AuditProxy
     */
    public AdminClient.AS2Audit getAS2AuditProxy() {
        return AS2AuditProxy;
    }


    /**
     * Sets the AS2AuditProxy value for this Audit.
     * 
     * @param AS2AuditProxy
     */
    public void setAS2AuditProxy(AdminClient.AS2Audit AS2AuditProxy) {
        this.AS2AuditProxy = AS2AuditProxy;
    }


    /**
     * Gets the AS2AuditServer value for this Audit.
     * 
     * @return AS2AuditServer
     */
    public AdminClient.AS2Audit getAS2AuditServer() {
        return AS2AuditServer;
    }


    /**
     * Sets the AS2AuditServer value for this Audit.
     * 
     * @param AS2AuditServer
     */
    public void setAS2AuditServer(AdminClient.AS2Audit AS2AuditServer) {
        this.AS2AuditServer = AS2AuditServer;
    }


    /**
     * Gets the CFClient_CR_LF value for this Audit.
     * 
     * @return CFClient_CR_LF
     */
    public java.lang.String getCFClient_CR_LF() {
        return CFClient_CR_LF;
    }


    /**
     * Sets the CFClient_CR_LF value for this Audit.
     * 
     * @param CFClient_CR_LF
     */
    public void setCFClient_CR_LF(java.lang.String CFClient_CR_LF) {
        this.CFClient_CR_LF = CFClient_CR_LF;
    }


    /**
     * Gets the CFClient_CheckPointCount value for this Audit.
     * 
     * @return CFClient_CheckPointCount
     */
    public java.lang.String getCFClient_CheckPointCount() {
        return CFClient_CheckPointCount;
    }


    /**
     * Sets the CFClient_CheckPointCount value for this Audit.
     * 
     * @param CFClient_CheckPointCount
     */
    public void setCFClient_CheckPointCount(java.lang.String CFClient_CheckPointCount) {
        this.CFClient_CheckPointCount = CFClient_CheckPointCount;
    }


    /**
     * Gets the CFClient_CheckPointInterval value for this Audit.
     * 
     * @return CFClient_CheckPointInterval
     */
    public java.lang.String getCFClient_CheckPointInterval() {
        return CFClient_CheckPointInterval;
    }


    /**
     * Sets the CFClient_CheckPointInterval value for this Audit.
     * 
     * @param CFClient_CheckPointInterval
     */
    public void setCFClient_CheckPointInterval(java.lang.String CFClient_CheckPointInterval) {
        this.CFClient_CheckPointInterval = CFClient_CheckPointInterval;
    }


    /**
     * Gets the CFClient_CheckPointRestart value for this Audit.
     * 
     * @return CFClient_CheckPointRestart
     */
    public java.lang.String getCFClient_CheckPointRestart() {
        return CFClient_CheckPointRestart;
    }


    /**
     * Sets the CFClient_CheckPointRestart value for this Audit.
     * 
     * @param CFClient_CheckPointRestart
     */
    public void setCFClient_CheckPointRestart(java.lang.String CFClient_CheckPointRestart) {
        this.CFClient_CheckPointRestart = CFClient_CheckPointRestart;
    }


    /**
     * Gets the CFClient_Compression value for this Audit.
     * 
     * @return CFClient_Compression
     */
    public java.lang.String getCFClient_Compression() {
        return CFClient_Compression;
    }


    /**
     * Sets the CFClient_Compression value for this Audit.
     * 
     * @param CFClient_Compression
     */
    public void setCFClient_Compression(java.lang.String CFClient_Compression) {
        this.CFClient_Compression = CFClient_Compression;
    }


    /**
     * Gets the CFClient_DataType value for this Audit.
     * 
     * @return CFClient_DataType
     */
    public java.lang.String getCFClient_DataType() {
        return CFClient_DataType;
    }


    /**
     * Sets the CFClient_DataType value for this Audit.
     * 
     * @param CFClient_DataType
     */
    public void setCFClient_DataType(java.lang.String CFClient_DataType) {
        this.CFClient_DataType = CFClient_DataType;
    }


    /**
     * Gets the CFClient_EncryptFlag value for this Audit.
     * 
     * @return CFClient_EncryptFlag
     */
    public java.lang.String getCFClient_EncryptFlag() {
        return CFClient_EncryptFlag;
    }


    /**
     * Sets the CFClient_EncryptFlag value for this Audit.
     * 
     * @param CFClient_EncryptFlag
     */
    public void setCFClient_EncryptFlag(java.lang.String CFClient_EncryptFlag) {
        this.CFClient_EncryptFlag = CFClient_EncryptFlag;
    }


    /**
     * Gets the CFClient_InitFileSpec value for this Audit.
     * 
     * @return CFClient_InitFileSpec
     */
    public java.lang.String getCFClient_InitFileSpec() {
        return CFClient_InitFileSpec;
    }


    /**
     * Sets the CFClient_InitFileSpec value for this Audit.
     * 
     * @param CFClient_InitFileSpec
     */
    public void setCFClient_InitFileSpec(java.lang.String CFClient_InitFileSpec) {
        this.CFClient_InitFileSpec = CFClient_InitFileSpec;
    }


    /**
     * Gets the CFClient_InitUserID value for this Audit.
     * 
     * @return CFClient_InitUserID
     */
    public java.lang.String getCFClient_InitUserID() {
        return CFClient_InitUserID;
    }


    /**
     * Sets the CFClient_InitUserID value for this Audit.
     * 
     * @param CFClient_InitUserID
     */
    public void setCFClient_InitUserID(java.lang.String CFClient_InitUserID) {
        this.CFClient_InitUserID = CFClient_InitUserID;
    }


    /**
     * Gets the CFClient_ProcessName value for this Audit.
     * 
     * @return CFClient_ProcessName
     */
    public java.lang.String getCFClient_ProcessName() {
        return CFClient_ProcessName;
    }


    /**
     * Sets the CFClient_ProcessName value for this Audit.
     * 
     * @param CFClient_ProcessName
     */
    public void setCFClient_ProcessName(java.lang.String CFClient_ProcessName) {
        this.CFClient_ProcessName = CFClient_ProcessName;
    }


    /**
     * Gets the CFClient_RemoteTransaction value for this Audit.
     * 
     * @return CFClient_RemoteTransaction
     */
    public java.lang.String getCFClient_RemoteTransaction() {
        return CFClient_RemoteTransaction;
    }


    /**
     * Sets the CFClient_RemoteTransaction value for this Audit.
     * 
     * @param CFClient_RemoteTransaction
     */
    public void setCFClient_RemoteTransaction(java.lang.String CFClient_RemoteTransaction) {
        this.CFClient_RemoteTransaction = CFClient_RemoteTransaction;
    }


    /**
     * Gets the CFClient_RespFileSpec value for this Audit.
     * 
     * @return CFClient_RespFileSpec
     */
    public java.lang.String getCFClient_RespFileSpec() {
        return CFClient_RespFileSpec;
    }


    /**
     * Sets the CFClient_RespFileSpec value for this Audit.
     * 
     * @param CFClient_RespFileSpec
     */
    public void setCFClient_RespFileSpec(java.lang.String CFClient_RespFileSpec) {
        this.CFClient_RespFileSpec = CFClient_RespFileSpec;
    }


    /**
     * Gets the CFClient_StatusDiagCode value for this Audit.
     * 
     * @return CFClient_StatusDiagCode
     */
    public java.lang.String getCFClient_StatusDiagCode() {
        return CFClient_StatusDiagCode;
    }


    /**
     * Sets the CFClient_StatusDiagCode value for this Audit.
     * 
     * @param CFClient_StatusDiagCode
     */
    public void setCFClient_StatusDiagCode(java.lang.String CFClient_StatusDiagCode) {
        this.CFClient_StatusDiagCode = CFClient_StatusDiagCode;
    }


    /**
     * Gets the CFClient_StatusMsg value for this Audit.
     * 
     * @return CFClient_StatusMsg
     */
    public java.lang.String getCFClient_StatusMsg() {
        return CFClient_StatusMsg;
    }


    /**
     * Sets the CFClient_StatusMsg value for this Audit.
     * 
     * @param CFClient_StatusMsg
     */
    public void setCFClient_StatusMsg(java.lang.String CFClient_StatusMsg) {
        this.CFClient_StatusMsg = CFClient_StatusMsg;
    }


    /**
     * Gets the CFClient_StatusSeverity value for this Audit.
     * 
     * @return CFClient_StatusSeverity
     */
    public java.lang.String getCFClient_StatusSeverity() {
        return CFClient_StatusSeverity;
    }


    /**
     * Sets the CFClient_StatusSeverity value for this Audit.
     * 
     * @param CFClient_StatusSeverity
     */
    public void setCFClient_StatusSeverity(java.lang.String CFClient_StatusSeverity) {
        this.CFClient_StatusSeverity = CFClient_StatusSeverity;
    }


    /**
     * Gets the CFClient_TrEndTime value for this Audit.
     * 
     * @return CFClient_TrEndTime
     */
    public AdminClient.DateTime getCFClient_TrEndTime() {
        return CFClient_TrEndTime;
    }


    /**
     * Sets the CFClient_TrEndTime value for this Audit.
     * 
     * @param CFClient_TrEndTime
     */
    public void setCFClient_TrEndTime(AdminClient.DateTime CFClient_TrEndTime) {
        this.CFClient_TrEndTime = CFClient_TrEndTime;
    }


    /**
     * Gets the CFClient_TrStartTime value for this Audit.
     * 
     * @return CFClient_TrStartTime
     */
    public AdminClient.DateTime getCFClient_TrStartTime() {
        return CFClient_TrStartTime;
    }


    /**
     * Sets the CFClient_TrStartTime value for this Audit.
     * 
     * @param CFClient_TrStartTime
     */
    public void setCFClient_TrStartTime(AdminClient.DateTime CFClient_TrStartTime) {
        this.CFClient_TrStartTime = CFClient_TrStartTime;
    }


    /**
     * Gets the CFClient_TransactionNumber value for this Audit.
     * 
     * @return CFClient_TransactionNumber
     */
    public java.lang.String getCFClient_TransactionNumber() {
        return CFClient_TransactionNumber;
    }


    /**
     * Sets the CFClient_TransactionNumber value for this Audit.
     * 
     * @param CFClient_TransactionNumber
     */
    public void setCFClient_TransactionNumber(java.lang.String CFClient_TransactionNumber) {
        this.CFClient_TransactionNumber = CFClient_TransactionNumber;
    }


    /**
     * Gets the CFClient_TransferWork value for this Audit.
     * 
     * @return CFClient_TransferWork
     */
    public java.lang.String getCFClient_TransferWork() {
        return CFClient_TransferWork;
    }


    /**
     * Sets the CFClient_TransferWork value for this Audit.
     * 
     * @param CFClient_TransferWork
     */
    public void setCFClient_TransferWork(java.lang.String CFClient_TransferWork) {
        this.CFClient_TransferWork = CFClient_TransferWork;
    }


    /**
     * Gets the CFClient_UserData value for this Audit.
     * 
     * @return CFClient_UserData
     */
    public java.lang.String getCFClient_UserData() {
        return CFClient_UserData;
    }


    /**
     * Sets the CFClient_UserData value for this Audit.
     * 
     * @param CFClient_UserData
     */
    public void setCFClient_UserData(java.lang.String CFClient_UserData) {
        this.CFClient_UserData = CFClient_UserData;
    }


    /**
     * Gets the CFClient_Version value for this Audit.
     * 
     * @return CFClient_Version
     */
    public java.lang.String getCFClient_Version() {
        return CFClient_Version;
    }


    /**
     * Sets the CFClient_Version value for this Audit.
     * 
     * @param CFClient_Version
     */
    public void setCFClient_Version(java.lang.String CFClient_Version) {
        this.CFClient_Version = CFClient_Version;
    }


    /**
     * Gets the FTPAlias value for this Audit.
     * 
     * @return FTPAlias
     */
    public java.lang.String getFTPAlias() {
        return FTPAlias;
    }


    /**
     * Sets the FTPAlias value for this Audit.
     * 
     * @param FTPAlias
     */
    public void setFTPAlias(java.lang.String FTPAlias) {
        this.FTPAlias = FTPAlias;
    }


    /**
     * Gets the JMSProperty value for this Audit.
     * 
     * @return JMSProperty
     */
    public java.lang.String getJMSProperty() {
        return JMSProperty;
    }


    /**
     * Sets the JMSProperty value for this Audit.
     * 
     * @param JMSProperty
     */
    public void setJMSProperty(java.lang.String JMSProperty) {
        this.JMSProperty = JMSProperty;
    }


    /**
     * Gets the JMSSelector value for this Audit.
     * 
     * @return JMSSelector
     */
    public java.lang.String getJMSSelector() {
        return JMSSelector;
    }


    /**
     * Sets the JMSSelector value for this Audit.
     * 
     * @param JMSSelector
     */
    public void setJMSSelector(java.lang.String JMSSelector) {
        this.JMSSelector = JMSSelector;
    }


    /**
     * Gets the PGPArmorFlag value for this Audit.
     * 
     * @return PGPArmorFlag
     */
    public java.lang.String getPGPArmorFlag() {
        return PGPArmorFlag;
    }


    /**
     * Sets the PGPArmorFlag value for this Audit.
     * 
     * @param PGPArmorFlag
     */
    public void setPGPArmorFlag(java.lang.String PGPArmorFlag) {
        this.PGPArmorFlag = PGPArmorFlag;
    }


    /**
     * Gets the PGPClCompAlg value for this Audit.
     * 
     * @return PGPClCompAlg
     */
    public java.lang.String getPGPClCompAlg() {
        return PGPClCompAlg;
    }


    /**
     * Sets the PGPClCompAlg value for this Audit.
     * 
     * @param PGPClCompAlg
     */
    public void setPGPClCompAlg(java.lang.String PGPClCompAlg) {
        this.PGPClCompAlg = PGPClCompAlg;
    }


    /**
     * Gets the PGPClEncKeyId value for this Audit.
     * 
     * @return PGPClEncKeyId
     */
    public java.lang.String getPGPClEncKeyId() {
        return PGPClEncKeyId;
    }


    /**
     * Sets the PGPClEncKeyId value for this Audit.
     * 
     * @param PGPClEncKeyId
     */
    public void setPGPClEncKeyId(java.lang.String PGPClEncKeyId) {
        this.PGPClEncKeyId = PGPClEncKeyId;
    }


    /**
     * Gets the PGPClEncryptAlg value for this Audit.
     * 
     * @return PGPClEncryptAlg
     */
    public java.lang.String getPGPClEncryptAlg() {
        return PGPClEncryptAlg;
    }


    /**
     * Sets the PGPClEncryptAlg value for this Audit.
     * 
     * @param PGPClEncryptAlg
     */
    public void setPGPClEncryptAlg(java.lang.String PGPClEncryptAlg) {
        this.PGPClEncryptAlg = PGPClEncryptAlg;
    }


    /**
     * Gets the PGPClHashingAlg value for this Audit.
     * 
     * @return PGPClHashingAlg
     */
    public java.lang.String getPGPClHashingAlg() {
        return PGPClHashingAlg;
    }


    /**
     * Sets the PGPClHashingAlg value for this Audit.
     * 
     * @param PGPClHashingAlg
     */
    public void setPGPClHashingAlg(java.lang.String PGPClHashingAlg) {
        this.PGPClHashingAlg = PGPClHashingAlg;
    }


    /**
     * Gets the PGPClSignature value for this Audit.
     * 
     * @return PGPClSignature
     */
    public java.lang.String getPGPClSignature() {
        return PGPClSignature;
    }


    /**
     * Sets the PGPClSignature value for this Audit.
     * 
     * @param PGPClSignature
     */
    public void setPGPClSignature(java.lang.String PGPClSignature) {
        this.PGPClSignature = PGPClSignature;
    }


    /**
     * Gets the PGPClSigned value for this Audit.
     * 
     * @return PGPClSigned
     */
    public java.lang.String getPGPClSigned() {
        return PGPClSigned;
    }


    /**
     * Sets the PGPClSigned value for this Audit.
     * 
     * @param PGPClSigned
     */
    public void setPGPClSigned(java.lang.String PGPClSigned) {
        this.PGPClSigned = PGPClSigned;
    }


    /**
     * Gets the PGPClSignerId value for this Audit.
     * 
     * @return PGPClSignerId
     */
    public java.lang.String getPGPClSignerId() {
        return PGPClSignerId;
    }


    /**
     * Sets the PGPClSignerId value for this Audit.
     * 
     * @param PGPClSignerId
     */
    public void setPGPClSignerId(java.lang.String PGPClSignerId) {
        this.PGPClSignerId = PGPClSignerId;
    }


    /**
     * Gets the PGPClSigningKeyId value for this Audit.
     * 
     * @return PGPClSigningKeyId
     */
    public java.lang.String getPGPClSigningKeyId() {
        return PGPClSigningKeyId;
    }


    /**
     * Sets the PGPClSigningKeyId value for this Audit.
     * 
     * @param PGPClSigningKeyId
     */
    public void setPGPClSigningKeyId(java.lang.String PGPClSigningKeyId) {
        this.PGPClSigningKeyId = PGPClSigningKeyId;
    }


    /**
     * Gets the PGPClVerified value for this Audit.
     * 
     * @return PGPClVerified
     */
    public java.lang.String getPGPClVerified() {
        return PGPClVerified;
    }


    /**
     * Sets the PGPClVerified value for this Audit.
     * 
     * @param PGPClVerified
     */
    public void setPGPClVerified(java.lang.String PGPClVerified) {
        this.PGPClVerified = PGPClVerified;
    }


    /**
     * Gets the PGPCompAlg value for this Audit.
     * 
     * @return PGPCompAlg
     */
    public java.lang.String getPGPCompAlg() {
        return PGPCompAlg;
    }


    /**
     * Sets the PGPCompAlg value for this Audit.
     * 
     * @param PGPCompAlg
     */
    public void setPGPCompAlg(java.lang.String PGPCompAlg) {
        this.PGPCompAlg = PGPCompAlg;
    }


    /**
     * Gets the PGPEncryptAlg value for this Audit.
     * 
     * @return PGPEncryptAlg
     */
    public java.lang.String getPGPEncryptAlg() {
        return PGPEncryptAlg;
    }


    /**
     * Sets the PGPEncryptAlg value for this Audit.
     * 
     * @param PGPEncryptAlg
     */
    public void setPGPEncryptAlg(java.lang.String PGPEncryptAlg) {
        this.PGPEncryptAlg = PGPEncryptAlg;
    }


    /**
     * Gets the PGPHashingAlg value for this Audit.
     * 
     * @return PGPHashingAlg
     */
    public java.lang.String getPGPHashingAlg() {
        return PGPHashingAlg;
    }


    /**
     * Sets the PGPHashingAlg value for this Audit.
     * 
     * @param PGPHashingAlg
     */
    public void setPGPHashingAlg(java.lang.String PGPHashingAlg) {
        this.PGPHashingAlg = PGPHashingAlg;
    }


    /**
     * Gets the PGPSrvEncKeyId value for this Audit.
     * 
     * @return PGPSrvEncKeyId
     */
    public java.lang.String getPGPSrvEncKeyId() {
        return PGPSrvEncKeyId;
    }


    /**
     * Sets the PGPSrvEncKeyId value for this Audit.
     * 
     * @param PGPSrvEncKeyId
     */
    public void setPGPSrvEncKeyId(java.lang.String PGPSrvEncKeyId) {
        this.PGPSrvEncKeyId = PGPSrvEncKeyId;
    }


    /**
     * Gets the PGPSrvSignature value for this Audit.
     * 
     * @return PGPSrvSignature
     */
    public java.lang.String getPGPSrvSignature() {
        return PGPSrvSignature;
    }


    /**
     * Sets the PGPSrvSignature value for this Audit.
     * 
     * @param PGPSrvSignature
     */
    public void setPGPSrvSignature(java.lang.String PGPSrvSignature) {
        this.PGPSrvSignature = PGPSrvSignature;
    }


    /**
     * Gets the PGPSrvSigned value for this Audit.
     * 
     * @return PGPSrvSigned
     */
    public java.lang.String getPGPSrvSigned() {
        return PGPSrvSigned;
    }


    /**
     * Sets the PGPSrvSigned value for this Audit.
     * 
     * @param PGPSrvSigned
     */
    public void setPGPSrvSigned(java.lang.String PGPSrvSigned) {
        this.PGPSrvSigned = PGPSrvSigned;
    }


    /**
     * Gets the PGPSrvSignerId value for this Audit.
     * 
     * @return PGPSrvSignerId
     */
    public java.lang.String getPGPSrvSignerId() {
        return PGPSrvSignerId;
    }


    /**
     * Sets the PGPSrvSignerId value for this Audit.
     * 
     * @param PGPSrvSignerId
     */
    public void setPGPSrvSignerId(java.lang.String PGPSrvSignerId) {
        this.PGPSrvSignerId = PGPSrvSignerId;
    }


    /**
     * Gets the PGPSrvSigningKeyId value for this Audit.
     * 
     * @return PGPSrvSigningKeyId
     */
    public java.lang.String getPGPSrvSigningKeyId() {
        return PGPSrvSigningKeyId;
    }


    /**
     * Sets the PGPSrvSigningKeyId value for this Audit.
     * 
     * @param PGPSrvSigningKeyId
     */
    public void setPGPSrvSigningKeyId(java.lang.String PGPSrvSigningKeyId) {
        this.PGPSrvSigningKeyId = PGPSrvSigningKeyId;
    }


    /**
     * Gets the PGPSrvVerified value for this Audit.
     * 
     * @return PGPSrvVerified
     */
    public java.lang.String getPGPSrvVerified() {
        return PGPSrvVerified;
    }


    /**
     * Sets the PGPSrvVerified value for this Audit.
     * 
     * @param PGPSrvVerified
     */
    public void setPGPSrvVerified(java.lang.String PGPSrvVerified) {
        this.PGPSrvVerified = PGPSrvVerified;
    }


    /**
     * Gets the PGPTextMode value for this Audit.
     * 
     * @return PGPTextMode
     */
    public java.lang.String getPGPTextMode() {
        return PGPTextMode;
    }


    /**
     * Sets the PGPTextMode value for this Audit.
     * 
     * @param PGPTextMode
     */
    public void setPGPTextMode(java.lang.String PGPTextMode) {
        this.PGPTextMode = PGPTextMode;
    }


    /**
     * Gets the allowableProtocol value for this Audit.
     * 
     * @return allowableProtocol
     */
    public java.lang.String getAllowableProtocol() {
        return allowableProtocol;
    }


    /**
     * Sets the allowableProtocol value for this Audit.
     * 
     * @param allowableProtocol
     */
    public void setAllowableProtocol(java.lang.String allowableProtocol) {
        this.allowableProtocol = allowableProtocol;
    }


    /**
     * Gets the authRoleId value for this Audit.
     * 
     * @return authRoleId
     */
    public java.lang.String getAuthRoleId() {
        return authRoleId;
    }


    /**
     * Sets the authRoleId value for this Audit.
     * 
     * @param authRoleId
     */
    public void setAuthRoleId(java.lang.String authRoleId) {
        this.authRoleId = authRoleId;
    }


    /**
     * Gets the authUserId value for this Audit.
     * 
     * @return authUserId
     */
    public java.lang.String getAuthUserId() {
        return authUserId;
    }


    /**
     * Sets the authUserId value for this Audit.
     * 
     * @param authUserId
     */
    public void setAuthUserId(java.lang.String authUserId) {
        this.authUserId = authUserId;
    }


    /**
     * Gets the availableDate value for this Audit.
     * 
     * @return availableDate
     */
    public AdminClient.DateTime getAvailableDate() {
        return availableDate;
    }


    /**
     * Sets the availableDate value for this Audit.
     * 
     * @param availableDate
     */
    public void setAvailableDate(AdminClient.DateTime availableDate) {
        this.availableDate = availableDate;
    }


    /**
     * Gets the availableUpdatedBy value for this Audit.
     * 
     * @return availableUpdatedBy
     */
    public java.lang.String getAvailableUpdatedBy() {
        return availableUpdatedBy;
    }


    /**
     * Sets the availableUpdatedBy value for this Audit.
     * 
     * @param availableUpdatedBy
     */
    public void setAvailableUpdatedBy(java.lang.String availableUpdatedBy) {
        this.availableUpdatedBy = availableUpdatedBy;
    }


    /**
     * Gets the chkptTryMaxCount value for this Audit.
     * 
     * @return chkptTryMaxCount
     */
    public java.lang.String getChkptTryMaxCount() {
        return chkptTryMaxCount;
    }


    /**
     * Sets the chkptTryMaxCount value for this Audit.
     * 
     * @param chkptTryMaxCount
     */
    public void setChkptTryMaxCount(java.lang.String chkptTryMaxCount) {
        this.chkptTryMaxCount = chkptTryMaxCount;
    }


    /**
     * Gets the ckPtTryMaxCount value for this Audit.
     * 
     * @return ckPtTryMaxCount
     */
    public java.lang.String getCkPtTryMaxCount() {
        return ckPtTryMaxCount;
    }


    /**
     * Sets the ckPtTryMaxCount value for this Audit.
     * 
     * @param ckPtTryMaxCount
     */
    public void setCkPtTryMaxCount(java.lang.String ckPtTryMaxCount) {
        this.ckPtTryMaxCount = ckPtTryMaxCount;
    }


    /**
     * Gets the conversionFlag value for this Audit.
     * 
     * @return conversionFlag
     */
    public java.lang.String getConversionFlag() {
        return conversionFlag;
    }


    /**
     * Sets the conversionFlag value for this Audit.
     * 
     * @param conversionFlag
     */
    public void setConversionFlag(java.lang.String conversionFlag) {
        this.conversionFlag = conversionFlag;
    }


    /**
     * Gets the defaultNodePwd value for this Audit.
     * 
     * @return defaultNodePwd
     */
    public java.lang.String getDefaultNodePwd() {
        return defaultNodePwd;
    }


    /**
     * Sets the defaultNodePwd value for this Audit.
     * 
     * @param defaultNodePwd
     */
    public void setDefaultNodePwd(java.lang.String defaultNodePwd) {
        this.defaultNodePwd = defaultNodePwd;
    }


    /**
     * Gets the defaultNodeUserId value for this Audit.
     * 
     * @return defaultNodeUserId
     */
    public java.lang.String getDefaultNodeUserId() {
        return defaultNodeUserId;
    }


    /**
     * Sets the defaultNodeUserId value for this Audit.
     * 
     * @param defaultNodeUserId
     */
    public void setDefaultNodeUserId(java.lang.String defaultNodeUserId) {
        this.defaultNodeUserId = defaultNodeUserId;
    }


    /**
     * Gets the directoryTransfer value for this Audit.
     * 
     * @return directoryTransfer
     */
    public java.lang.String getDirectoryTransfer() {
        return directoryTransfer;
    }


    /**
     * Sets the directoryTransfer value for this Audit.
     * 
     * @param directoryTransfer
     */
    public void setDirectoryTransfer(java.lang.String directoryTransfer) {
        this.directoryTransfer = directoryTransfer;
    }


    /**
     * Gets the disableFlag value for this Audit.
     * 
     * @return disableFlag
     */
    public java.lang.String getDisableFlag() {
        return disableFlag;
    }


    /**
     * Sets the disableFlag value for this Audit.
     * 
     * @param disableFlag
     */
    public void setDisableFlag(java.lang.String disableFlag) {
        this.disableFlag = disableFlag;
    }


    /**
     * Gets the emailFailureFlag value for this Audit.
     * 
     * @return emailFailureFlag
     */
    public java.lang.String getEmailFailureFlag() {
        return emailFailureFlag;
    }


    /**
     * Sets the emailFailureFlag value for this Audit.
     * 
     * @param emailFailureFlag
     */
    public void setEmailFailureFlag(java.lang.String emailFailureFlag) {
        this.emailFailureFlag = emailFailureFlag;
    }


    /**
     * Gets the emailFailureTemplate value for this Audit.
     * 
     * @return emailFailureTemplate
     */
    public java.lang.String getEmailFailureTemplate() {
        return emailFailureTemplate;
    }


    /**
     * Sets the emailFailureTemplate value for this Audit.
     * 
     * @param emailFailureTemplate
     */
    public void setEmailFailureTemplate(java.lang.String emailFailureTemplate) {
        this.emailFailureTemplate = emailFailureTemplate;
    }


    /**
     * Gets the emailSuccessFlag value for this Audit.
     * 
     * @return emailSuccessFlag
     */
    public java.lang.String getEmailSuccessFlag() {
        return emailSuccessFlag;
    }


    /**
     * Sets the emailSuccessFlag value for this Audit.
     * 
     * @param emailSuccessFlag
     */
    public void setEmailSuccessFlag(java.lang.String emailSuccessFlag) {
        this.emailSuccessFlag = emailSuccessFlag;
    }


    /**
     * Gets the emailSuccessTemplate value for this Audit.
     * 
     * @return emailSuccessTemplate
     */
    public java.lang.String getEmailSuccessTemplate() {
        return emailSuccessTemplate;
    }


    /**
     * Sets the emailSuccessTemplate value for this Audit.
     * 
     * @param emailSuccessTemplate
     */
    public void setEmailSuccessTemplate(java.lang.String emailSuccessTemplate) {
        this.emailSuccessTemplate = emailSuccessTemplate;
    }


    /**
     * Gets the expirationDate value for this Audit.
     * 
     * @return expirationDate
     */
    public AdminClient.DateTime getExpirationDate() {
        return expirationDate;
    }


    /**
     * Sets the expirationDate value for this Audit.
     * 
     * @param expirationDate
     */
    public void setExpirationDate(AdminClient.DateTime expirationDate) {
        this.expirationDate = expirationDate;
    }


    /**
     * Gets the fileId value for this Audit.
     * 
     * @return fileId
     */
    public java.lang.String getFileId() {
        return fileId;
    }


    /**
     * Sets the fileId value for this Audit.
     * 
     * @param fileId
     */
    public void setFileId(java.lang.String fileId) {
        this.fileId = fileId;
    }


    /**
     * Gets the fileShareFlag value for this Audit.
     * 
     * @return fileShareFlag
     */
    public java.lang.String getFileShareFlag() {
        return fileShareFlag;
    }


    /**
     * Sets the fileShareFlag value for this Audit.
     * 
     * @param fileShareFlag
     */
    public void setFileShareFlag(java.lang.String fileShareFlag) {
        this.fileShareFlag = fileShareFlag;
    }


    /**
     * Gets the localHostName value for this Audit.
     * 
     * @return localHostName
     */
    public java.lang.String getLocalHostName() {
        return localHostName;
    }


    /**
     * Sets the localHostName value for this Audit.
     * 
     * @param localHostName
     */
    public void setLocalHostName(java.lang.String localHostName) {
        this.localHostName = localHostName;
    }


    /**
     * Gets the oneTimeFlag value for this Audit.
     * 
     * @return oneTimeFlag
     */
    public java.lang.String getOneTimeFlag() {
        return oneTimeFlag;
    }


    /**
     * Sets the oneTimeFlag value for this Audit.
     * 
     * @param oneTimeFlag
     */
    public void setOneTimeFlag(java.lang.String oneTimeFlag) {
        this.oneTimeFlag = oneTimeFlag;
    }


    /**
     * Gets the proxyByteCount value for this Audit.
     * 
     * @return proxyByteCount
     */
    public java.lang.String getProxyByteCount() {
        return proxyByteCount;
    }


    /**
     * Sets the proxyByteCount value for this Audit.
     * 
     * @param proxyByteCount
     */
    public void setProxyByteCount(java.lang.String proxyByteCount) {
        this.proxyByteCount = proxyByteCount;
    }


    /**
     * Gets the proxyCompressedByteCount value for this Audit.
     * 
     * @return proxyCompressedByteCount
     */
    public java.lang.String getProxyCompressedByteCount() {
        return proxyCompressedByteCount;
    }


    /**
     * Sets the proxyCompressedByteCount value for this Audit.
     * 
     * @param proxyCompressedByteCount
     */
    public void setProxyCompressedByteCount(java.lang.String proxyCompressedByteCount) {
        this.proxyCompressedByteCount = proxyCompressedByteCount;
    }


    /**
     * Gets the proxyRemoteNTDomain value for this Audit.
     * 
     * @return proxyRemoteNTDomain
     */
    public java.lang.String getProxyRemoteNTDomain() {
        return proxyRemoteNTDomain;
    }


    /**
     * Sets the proxyRemoteNTDomain value for this Audit.
     * 
     * @param proxyRemoteNTDomain
     */
    public void setProxyRemoteNTDomain(java.lang.String proxyRemoteNTDomain) {
        this.proxyRemoteNTDomain = proxyRemoteNTDomain;
    }


    /**
     * Gets the proxyRemotePassword value for this Audit.
     * 
     * @return proxyRemotePassword
     */
    public java.lang.String getProxyRemotePassword() {
        return proxyRemotePassword;
    }


    /**
     * Sets the proxyRemotePassword value for this Audit.
     * 
     * @param proxyRemotePassword
     */
    public void setProxyRemotePassword(java.lang.String proxyRemotePassword) {
        this.proxyRemotePassword = proxyRemotePassword;
    }


    /**
     * Gets the proxyRemoteTransactionId value for this Audit.
     * 
     * @return proxyRemoteTransactionId
     */
    public java.lang.String getProxyRemoteTransactionId() {
        return proxyRemoteTransactionId;
    }


    /**
     * Sets the proxyRemoteTransactionId value for this Audit.
     * 
     * @param proxyRemoteTransactionId
     */
    public void setProxyRemoteTransactionId(java.lang.String proxyRemoteTransactionId) {
        this.proxyRemoteTransactionId = proxyRemoteTransactionId;
    }


    /**
     * Gets the proxyRemoteUserId value for this Audit.
     * 
     * @return proxyRemoteUserId
     */
    public java.lang.String getProxyRemoteUserId() {
        return proxyRemoteUserId;
    }


    /**
     * Sets the proxyRemoteUserId value for this Audit.
     * 
     * @param proxyRemoteUserId
     */
    public void setProxyRemoteUserId(java.lang.String proxyRemoteUserId) {
        this.proxyRemoteUserId = proxyRemoteUserId;
    }


    /**
     * Gets the proxyStatusDiagCode value for this Audit.
     * 
     * @return proxyStatusDiagCode
     */
    public java.lang.String getProxyStatusDiagCode() {
        return proxyStatusDiagCode;
    }


    /**
     * Sets the proxyStatusDiagCode value for this Audit.
     * 
     * @param proxyStatusDiagCode
     */
    public void setProxyStatusDiagCode(java.lang.String proxyStatusDiagCode) {
        this.proxyStatusDiagCode = proxyStatusDiagCode;
    }


    /**
     * Gets the proxyStatusSeverity value for this Audit.
     * 
     * @return proxyStatusSeverity
     */
    public java.lang.String getProxyStatusSeverity() {
        return proxyStatusSeverity;
    }


    /**
     * Sets the proxyStatusSeverity value for this Audit.
     * 
     * @param proxyStatusSeverity
     */
    public void setProxyStatusSeverity(java.lang.String proxyStatusSeverity) {
        this.proxyStatusSeverity = proxyStatusSeverity;
    }


    /**
     * Gets the proxyTraceAppFileName value for this Audit.
     * 
     * @return proxyTraceAppFileName
     */
    public java.lang.String getProxyTraceAppFileName() {
        return proxyTraceAppFileName;
    }


    /**
     * Sets the proxyTraceAppFileName value for this Audit.
     * 
     * @param proxyTraceAppFileName
     */
    public void setProxyTraceAppFileName(java.lang.String proxyTraceAppFileName) {
        this.proxyTraceAppFileName = proxyTraceAppFileName;
    }


    /**
     * Gets the proxyTraceCommFileName value for this Audit.
     * 
     * @return proxyTraceCommFileName
     */
    public java.lang.String getProxyTraceCommFileName() {
        return proxyTraceCommFileName;
    }


    /**
     * Sets the proxyTraceCommFileName value for this Audit.
     * 
     * @param proxyTraceCommFileName
     */
    public void setProxyTraceCommFileName(java.lang.String proxyTraceCommFileName) {
        this.proxyTraceCommFileName = proxyTraceCommFileName;
    }


    /**
     * Gets the serverPhysicalFileName value for this Audit.
     * 
     * @return serverPhysicalFileName
     */
    public java.lang.String getServerPhysicalFileName() {
        return serverPhysicalFileName;
    }


    /**
     * Sets the serverPhysicalFileName value for this Audit.
     * 
     * @param serverPhysicalFileName
     */
    public void setServerPhysicalFileName(java.lang.String serverPhysicalFileName) {
        this.serverPhysicalFileName = serverPhysicalFileName;
    }


    /**
     * Gets the tokenData value for this Audit.
     * 
     * @return tokenData
     */
    public java.lang.String getTokenData() {
        return tokenData;
    }


    /**
     * Sets the tokenData value for this Audit.
     * 
     * @param tokenData
     */
    public void setTokenData(java.lang.String tokenData) {
        this.tokenData = tokenData;
    }


    /**
     * Gets the tokenDateSet value for this Audit.
     * 
     * @return tokenDateSet
     */
    public AdminClient.DateTime getTokenDateSet() {
        return tokenDateSet;
    }


    /**
     * Sets the tokenDateSet value for this Audit.
     * 
     * @param tokenDateSet
     */
    public void setTokenDateSet(AdminClient.DateTime tokenDateSet) {
        this.tokenDateSet = tokenDateSet;
    }


    /**
     * Gets the tokenFlag value for this Audit.
     * 
     * @return tokenFlag
     */
    public java.lang.String getTokenFlag() {
        return tokenFlag;
    }


    /**
     * Sets the tokenFlag value for this Audit.
     * 
     * @param tokenFlag
     */
    public void setTokenFlag(java.lang.String tokenFlag) {
        this.tokenFlag = tokenFlag;
    }


    /**
     * Gets the traceAppFileName value for this Audit.
     * 
     * @return traceAppFileName
     */
    public java.lang.String getTraceAppFileName() {
        return traceAppFileName;
    }


    /**
     * Sets the traceAppFileName value for this Audit.
     * 
     * @param traceAppFileName
     */
    public void setTraceAppFileName(java.lang.String traceAppFileName) {
        this.traceAppFileName = traceAppFileName;
    }


    /**
     * Gets the traceCommFileName value for this Audit.
     * 
     * @return traceCommFileName
     */
    public java.lang.String getTraceCommFileName() {
        return traceCommFileName;
    }


    /**
     * Sets the traceCommFileName value for this Audit.
     * 
     * @param traceCommFileName
     */
    public void setTraceCommFileName(java.lang.String traceCommFileName) {
        this.traceCommFileName = traceCommFileName;
    }


    /**
     * Gets the traceFlag value for this Audit.
     * 
     * @return traceFlag
     */
    public java.lang.String getTraceFlag() {
        return traceFlag;
    }


    /**
     * Sets the traceFlag value for this Audit.
     * 
     * @param traceFlag
     */
    public void setTraceFlag(java.lang.String traceFlag) {
        this.traceFlag = traceFlag;
    }


    /**
     * Gets the transferNotificationEmailAddress value for this Audit.
     * 
     * @return transferNotificationEmailAddress
     */
    public java.lang.String getTransferNotificationEmailAddress() {
        return transferNotificationEmailAddress;
    }


    /**
     * Sets the transferNotificationEmailAddress value for this Audit.
     * 
     * @param transferNotificationEmailAddress
     */
    public void setTransferNotificationEmailAddress(java.lang.String transferNotificationEmailAddress) {
        this.transferNotificationEmailAddress = transferNotificationEmailAddress;
    }


    /**
     * Gets the transferNotificationEmailTemplate value for this Audit.
     * 
     * @return transferNotificationEmailTemplate
     */
    public java.lang.String getTransferNotificationEmailTemplate() {
        return transferNotificationEmailTemplate;
    }


    /**
     * Sets the transferNotificationEmailTemplate value for this Audit.
     * 
     * @param transferNotificationEmailTemplate
     */
    public void setTransferNotificationEmailTemplate(java.lang.String transferNotificationEmailTemplate) {
        this.transferNotificationEmailTemplate = transferNotificationEmailTemplate;
    }


    /**
     * Gets the unixPermissions value for this Audit.
     * 
     * @return unixPermissions
     */
    public java.lang.String getUnixPermissions() {
        return unixPermissions;
    }


    /**
     * Sets the unixPermissions value for this Audit.
     * 
     * @param unixPermissions
     */
    public void setUnixPermissions(java.lang.String unixPermissions) {
        this.unixPermissions = unixPermissions;
    }


    /**
     * Gets the validDays value for this Audit.
     * 
     * @return validDays
     */
    public java.lang.String getValidDays() {
        return validDays;
    }


    /**
     * Sets the validDays value for this Audit.
     * 
     * @param validDays
     */
    public void setValidDays(java.lang.String validDays) {
        this.validDays = validDays;
    }


    /**
     * Gets the validEndTime value for this Audit.
     * 
     * @return validEndTime
     */
    public java.lang.String getValidEndTime() {
        return validEndTime;
    }


    /**
     * Sets the validEndTime value for this Audit.
     * 
     * @param validEndTime
     */
    public void setValidEndTime(java.lang.String validEndTime) {
        this.validEndTime = validEndTime;
    }


    /**
     * Gets the validStartTime value for this Audit.
     * 
     * @return validStartTime
     */
    public java.lang.String getValidStartTime() {
        return validStartTime;
    }


    /**
     * Sets the validStartTime value for this Audit.
     * 
     * @param validStartTime
     */
    public void setValidStartTime(java.lang.String validStartTime) {
        this.validStartTime = validStartTime;
    }


    /**
     * Gets the virusCheckFlag value for this Audit.
     * 
     * @return virusCheckFlag
     */
    public java.lang.String getVirusCheckFlag() {
        return virusCheckFlag;
    }


    /**
     * Sets the virusCheckFlag value for this Audit.
     * 
     * @param virusCheckFlag
     */
    public void setVirusCheckFlag(java.lang.String virusCheckFlag) {
        this.virusCheckFlag = virusCheckFlag;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Audit)) return false;
        Audit other = (Audit) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.AS2AuditProxy==null && other.getAS2AuditProxy()==null) || 
             (this.AS2AuditProxy!=null &&
              this.AS2AuditProxy.equals(other.getAS2AuditProxy()))) &&
            ((this.AS2AuditServer==null && other.getAS2AuditServer()==null) || 
             (this.AS2AuditServer!=null &&
              this.AS2AuditServer.equals(other.getAS2AuditServer()))) &&
            ((this.CFClient_CR_LF==null && other.getCFClient_CR_LF()==null) || 
             (this.CFClient_CR_LF!=null &&
              this.CFClient_CR_LF.equals(other.getCFClient_CR_LF()))) &&
            ((this.CFClient_CheckPointCount==null && other.getCFClient_CheckPointCount()==null) || 
             (this.CFClient_CheckPointCount!=null &&
              this.CFClient_CheckPointCount.equals(other.getCFClient_CheckPointCount()))) &&
            ((this.CFClient_CheckPointInterval==null && other.getCFClient_CheckPointInterval()==null) || 
             (this.CFClient_CheckPointInterval!=null &&
              this.CFClient_CheckPointInterval.equals(other.getCFClient_CheckPointInterval()))) &&
            ((this.CFClient_CheckPointRestart==null && other.getCFClient_CheckPointRestart()==null) || 
             (this.CFClient_CheckPointRestart!=null &&
              this.CFClient_CheckPointRestart.equals(other.getCFClient_CheckPointRestart()))) &&
            ((this.CFClient_Compression==null && other.getCFClient_Compression()==null) || 
             (this.CFClient_Compression!=null &&
              this.CFClient_Compression.equals(other.getCFClient_Compression()))) &&
            ((this.CFClient_DataType==null && other.getCFClient_DataType()==null) || 
             (this.CFClient_DataType!=null &&
              this.CFClient_DataType.equals(other.getCFClient_DataType()))) &&
            ((this.CFClient_EncryptFlag==null && other.getCFClient_EncryptFlag()==null) || 
             (this.CFClient_EncryptFlag!=null &&
              this.CFClient_EncryptFlag.equals(other.getCFClient_EncryptFlag()))) &&
            ((this.CFClient_InitFileSpec==null && other.getCFClient_InitFileSpec()==null) || 
             (this.CFClient_InitFileSpec!=null &&
              this.CFClient_InitFileSpec.equals(other.getCFClient_InitFileSpec()))) &&
            ((this.CFClient_InitUserID==null && other.getCFClient_InitUserID()==null) || 
             (this.CFClient_InitUserID!=null &&
              this.CFClient_InitUserID.equals(other.getCFClient_InitUserID()))) &&
            ((this.CFClient_ProcessName==null && other.getCFClient_ProcessName()==null) || 
             (this.CFClient_ProcessName!=null &&
              this.CFClient_ProcessName.equals(other.getCFClient_ProcessName()))) &&
            ((this.CFClient_RemoteTransaction==null && other.getCFClient_RemoteTransaction()==null) || 
             (this.CFClient_RemoteTransaction!=null &&
              this.CFClient_RemoteTransaction.equals(other.getCFClient_RemoteTransaction()))) &&
            ((this.CFClient_RespFileSpec==null && other.getCFClient_RespFileSpec()==null) || 
             (this.CFClient_RespFileSpec!=null &&
              this.CFClient_RespFileSpec.equals(other.getCFClient_RespFileSpec()))) &&
            ((this.CFClient_StatusDiagCode==null && other.getCFClient_StatusDiagCode()==null) || 
             (this.CFClient_StatusDiagCode!=null &&
              this.CFClient_StatusDiagCode.equals(other.getCFClient_StatusDiagCode()))) &&
            ((this.CFClient_StatusMsg==null && other.getCFClient_StatusMsg()==null) || 
             (this.CFClient_StatusMsg!=null &&
              this.CFClient_StatusMsg.equals(other.getCFClient_StatusMsg()))) &&
            ((this.CFClient_StatusSeverity==null && other.getCFClient_StatusSeverity()==null) || 
             (this.CFClient_StatusSeverity!=null &&
              this.CFClient_StatusSeverity.equals(other.getCFClient_StatusSeverity()))) &&
            ((this.CFClient_TrEndTime==null && other.getCFClient_TrEndTime()==null) || 
             (this.CFClient_TrEndTime!=null &&
              this.CFClient_TrEndTime.equals(other.getCFClient_TrEndTime()))) &&
            ((this.CFClient_TrStartTime==null && other.getCFClient_TrStartTime()==null) || 
             (this.CFClient_TrStartTime!=null &&
              this.CFClient_TrStartTime.equals(other.getCFClient_TrStartTime()))) &&
            ((this.CFClient_TransactionNumber==null && other.getCFClient_TransactionNumber()==null) || 
             (this.CFClient_TransactionNumber!=null &&
              this.CFClient_TransactionNumber.equals(other.getCFClient_TransactionNumber()))) &&
            ((this.CFClient_TransferWork==null && other.getCFClient_TransferWork()==null) || 
             (this.CFClient_TransferWork!=null &&
              this.CFClient_TransferWork.equals(other.getCFClient_TransferWork()))) &&
            ((this.CFClient_UserData==null && other.getCFClient_UserData()==null) || 
             (this.CFClient_UserData!=null &&
              this.CFClient_UserData.equals(other.getCFClient_UserData()))) &&
            ((this.CFClient_Version==null && other.getCFClient_Version()==null) || 
             (this.CFClient_Version!=null &&
              this.CFClient_Version.equals(other.getCFClient_Version()))) &&
            ((this.FTPAlias==null && other.getFTPAlias()==null) || 
             (this.FTPAlias!=null &&
              this.FTPAlias.equals(other.getFTPAlias()))) &&
            ((this.JMSProperty==null && other.getJMSProperty()==null) || 
             (this.JMSProperty!=null &&
              this.JMSProperty.equals(other.getJMSProperty()))) &&
            ((this.JMSSelector==null && other.getJMSSelector()==null) || 
             (this.JMSSelector!=null &&
              this.JMSSelector.equals(other.getJMSSelector()))) &&
            ((this.PGPArmorFlag==null && other.getPGPArmorFlag()==null) || 
             (this.PGPArmorFlag!=null &&
              this.PGPArmorFlag.equals(other.getPGPArmorFlag()))) &&
            ((this.PGPClCompAlg==null && other.getPGPClCompAlg()==null) || 
             (this.PGPClCompAlg!=null &&
              this.PGPClCompAlg.equals(other.getPGPClCompAlg()))) &&
            ((this.PGPClEncKeyId==null && other.getPGPClEncKeyId()==null) || 
             (this.PGPClEncKeyId!=null &&
              this.PGPClEncKeyId.equals(other.getPGPClEncKeyId()))) &&
            ((this.PGPClEncryptAlg==null && other.getPGPClEncryptAlg()==null) || 
             (this.PGPClEncryptAlg!=null &&
              this.PGPClEncryptAlg.equals(other.getPGPClEncryptAlg()))) &&
            ((this.PGPClHashingAlg==null && other.getPGPClHashingAlg()==null) || 
             (this.PGPClHashingAlg!=null &&
              this.PGPClHashingAlg.equals(other.getPGPClHashingAlg()))) &&
            ((this.PGPClSignature==null && other.getPGPClSignature()==null) || 
             (this.PGPClSignature!=null &&
              this.PGPClSignature.equals(other.getPGPClSignature()))) &&
            ((this.PGPClSigned==null && other.getPGPClSigned()==null) || 
             (this.PGPClSigned!=null &&
              this.PGPClSigned.equals(other.getPGPClSigned()))) &&
            ((this.PGPClSignerId==null && other.getPGPClSignerId()==null) || 
             (this.PGPClSignerId!=null &&
              this.PGPClSignerId.equals(other.getPGPClSignerId()))) &&
            ((this.PGPClSigningKeyId==null && other.getPGPClSigningKeyId()==null) || 
             (this.PGPClSigningKeyId!=null &&
              this.PGPClSigningKeyId.equals(other.getPGPClSigningKeyId()))) &&
            ((this.PGPClVerified==null && other.getPGPClVerified()==null) || 
             (this.PGPClVerified!=null &&
              this.PGPClVerified.equals(other.getPGPClVerified()))) &&
            ((this.PGPCompAlg==null && other.getPGPCompAlg()==null) || 
             (this.PGPCompAlg!=null &&
              this.PGPCompAlg.equals(other.getPGPCompAlg()))) &&
            ((this.PGPEncryptAlg==null && other.getPGPEncryptAlg()==null) || 
             (this.PGPEncryptAlg!=null &&
              this.PGPEncryptAlg.equals(other.getPGPEncryptAlg()))) &&
            ((this.PGPHashingAlg==null && other.getPGPHashingAlg()==null) || 
             (this.PGPHashingAlg!=null &&
              this.PGPHashingAlg.equals(other.getPGPHashingAlg()))) &&
            ((this.PGPSrvEncKeyId==null && other.getPGPSrvEncKeyId()==null) || 
             (this.PGPSrvEncKeyId!=null &&
              this.PGPSrvEncKeyId.equals(other.getPGPSrvEncKeyId()))) &&
            ((this.PGPSrvSignature==null && other.getPGPSrvSignature()==null) || 
             (this.PGPSrvSignature!=null &&
              this.PGPSrvSignature.equals(other.getPGPSrvSignature()))) &&
            ((this.PGPSrvSigned==null && other.getPGPSrvSigned()==null) || 
             (this.PGPSrvSigned!=null &&
              this.PGPSrvSigned.equals(other.getPGPSrvSigned()))) &&
            ((this.PGPSrvSignerId==null && other.getPGPSrvSignerId()==null) || 
             (this.PGPSrvSignerId!=null &&
              this.PGPSrvSignerId.equals(other.getPGPSrvSignerId()))) &&
            ((this.PGPSrvSigningKeyId==null && other.getPGPSrvSigningKeyId()==null) || 
             (this.PGPSrvSigningKeyId!=null &&
              this.PGPSrvSigningKeyId.equals(other.getPGPSrvSigningKeyId()))) &&
            ((this.PGPSrvVerified==null && other.getPGPSrvVerified()==null) || 
             (this.PGPSrvVerified!=null &&
              this.PGPSrvVerified.equals(other.getPGPSrvVerified()))) &&
            ((this.PGPTextMode==null && other.getPGPTextMode()==null) || 
             (this.PGPTextMode!=null &&
              this.PGPTextMode.equals(other.getPGPTextMode()))) &&
            ((this.allowableProtocol==null && other.getAllowableProtocol()==null) || 
             (this.allowableProtocol!=null &&
              this.allowableProtocol.equals(other.getAllowableProtocol()))) &&
            ((this.authRoleId==null && other.getAuthRoleId()==null) || 
             (this.authRoleId!=null &&
              this.authRoleId.equals(other.getAuthRoleId()))) &&
            ((this.authUserId==null && other.getAuthUserId()==null) || 
             (this.authUserId!=null &&
              this.authUserId.equals(other.getAuthUserId()))) &&
            ((this.availableDate==null && other.getAvailableDate()==null) || 
             (this.availableDate!=null &&
              this.availableDate.equals(other.getAvailableDate()))) &&
            ((this.availableUpdatedBy==null && other.getAvailableUpdatedBy()==null) || 
             (this.availableUpdatedBy!=null &&
              this.availableUpdatedBy.equals(other.getAvailableUpdatedBy()))) &&
            ((this.chkptTryMaxCount==null && other.getChkptTryMaxCount()==null) || 
             (this.chkptTryMaxCount!=null &&
              this.chkptTryMaxCount.equals(other.getChkptTryMaxCount()))) &&
            ((this.ckPtTryMaxCount==null && other.getCkPtTryMaxCount()==null) || 
             (this.ckPtTryMaxCount!=null &&
              this.ckPtTryMaxCount.equals(other.getCkPtTryMaxCount()))) &&
            ((this.conversionFlag==null && other.getConversionFlag()==null) || 
             (this.conversionFlag!=null &&
              this.conversionFlag.equals(other.getConversionFlag()))) &&
            ((this.defaultNodePwd==null && other.getDefaultNodePwd()==null) || 
             (this.defaultNodePwd!=null &&
              this.defaultNodePwd.equals(other.getDefaultNodePwd()))) &&
            ((this.defaultNodeUserId==null && other.getDefaultNodeUserId()==null) || 
             (this.defaultNodeUserId!=null &&
              this.defaultNodeUserId.equals(other.getDefaultNodeUserId()))) &&
            ((this.directoryTransfer==null && other.getDirectoryTransfer()==null) || 
             (this.directoryTransfer!=null &&
              this.directoryTransfer.equals(other.getDirectoryTransfer()))) &&
            ((this.disableFlag==null && other.getDisableFlag()==null) || 
             (this.disableFlag!=null &&
              this.disableFlag.equals(other.getDisableFlag()))) &&
            ((this.emailFailureFlag==null && other.getEmailFailureFlag()==null) || 
             (this.emailFailureFlag!=null &&
              this.emailFailureFlag.equals(other.getEmailFailureFlag()))) &&
            ((this.emailFailureTemplate==null && other.getEmailFailureTemplate()==null) || 
             (this.emailFailureTemplate!=null &&
              this.emailFailureTemplate.equals(other.getEmailFailureTemplate()))) &&
            ((this.emailSuccessFlag==null && other.getEmailSuccessFlag()==null) || 
             (this.emailSuccessFlag!=null &&
              this.emailSuccessFlag.equals(other.getEmailSuccessFlag()))) &&
            ((this.emailSuccessTemplate==null && other.getEmailSuccessTemplate()==null) || 
             (this.emailSuccessTemplate!=null &&
              this.emailSuccessTemplate.equals(other.getEmailSuccessTemplate()))) &&
            ((this.expirationDate==null && other.getExpirationDate()==null) || 
             (this.expirationDate!=null &&
              this.expirationDate.equals(other.getExpirationDate()))) &&
            ((this.fileId==null && other.getFileId()==null) || 
             (this.fileId!=null &&
              this.fileId.equals(other.getFileId()))) &&
            ((this.fileShareFlag==null && other.getFileShareFlag()==null) || 
             (this.fileShareFlag!=null &&
              this.fileShareFlag.equals(other.getFileShareFlag()))) &&
            ((this.localHostName==null && other.getLocalHostName()==null) || 
             (this.localHostName!=null &&
              this.localHostName.equals(other.getLocalHostName()))) &&
            ((this.oneTimeFlag==null && other.getOneTimeFlag()==null) || 
             (this.oneTimeFlag!=null &&
              this.oneTimeFlag.equals(other.getOneTimeFlag()))) &&
            ((this.proxyByteCount==null && other.getProxyByteCount()==null) || 
             (this.proxyByteCount!=null &&
              this.proxyByteCount.equals(other.getProxyByteCount()))) &&
            ((this.proxyCompressedByteCount==null && other.getProxyCompressedByteCount()==null) || 
             (this.proxyCompressedByteCount!=null &&
              this.proxyCompressedByteCount.equals(other.getProxyCompressedByteCount()))) &&
            ((this.proxyRemoteNTDomain==null && other.getProxyRemoteNTDomain()==null) || 
             (this.proxyRemoteNTDomain!=null &&
              this.proxyRemoteNTDomain.equals(other.getProxyRemoteNTDomain()))) &&
            ((this.proxyRemotePassword==null && other.getProxyRemotePassword()==null) || 
             (this.proxyRemotePassword!=null &&
              this.proxyRemotePassword.equals(other.getProxyRemotePassword()))) &&
            ((this.proxyRemoteTransactionId==null && other.getProxyRemoteTransactionId()==null) || 
             (this.proxyRemoteTransactionId!=null &&
              this.proxyRemoteTransactionId.equals(other.getProxyRemoteTransactionId()))) &&
            ((this.proxyRemoteUserId==null && other.getProxyRemoteUserId()==null) || 
             (this.proxyRemoteUserId!=null &&
              this.proxyRemoteUserId.equals(other.getProxyRemoteUserId()))) &&
            ((this.proxyStatusDiagCode==null && other.getProxyStatusDiagCode()==null) || 
             (this.proxyStatusDiagCode!=null &&
              this.proxyStatusDiagCode.equals(other.getProxyStatusDiagCode()))) &&
            ((this.proxyStatusSeverity==null && other.getProxyStatusSeverity()==null) || 
             (this.proxyStatusSeverity!=null &&
              this.proxyStatusSeverity.equals(other.getProxyStatusSeverity()))) &&
            ((this.proxyTraceAppFileName==null && other.getProxyTraceAppFileName()==null) || 
             (this.proxyTraceAppFileName!=null &&
              this.proxyTraceAppFileName.equals(other.getProxyTraceAppFileName()))) &&
            ((this.proxyTraceCommFileName==null && other.getProxyTraceCommFileName()==null) || 
             (this.proxyTraceCommFileName!=null &&
              this.proxyTraceCommFileName.equals(other.getProxyTraceCommFileName()))) &&
            ((this.serverPhysicalFileName==null && other.getServerPhysicalFileName()==null) || 
             (this.serverPhysicalFileName!=null &&
              this.serverPhysicalFileName.equals(other.getServerPhysicalFileName()))) &&
            ((this.tokenData==null && other.getTokenData()==null) || 
             (this.tokenData!=null &&
              this.tokenData.equals(other.getTokenData()))) &&
            ((this.tokenDateSet==null && other.getTokenDateSet()==null) || 
             (this.tokenDateSet!=null &&
              this.tokenDateSet.equals(other.getTokenDateSet()))) &&
            ((this.tokenFlag==null && other.getTokenFlag()==null) || 
             (this.tokenFlag!=null &&
              this.tokenFlag.equals(other.getTokenFlag()))) &&
            ((this.traceAppFileName==null && other.getTraceAppFileName()==null) || 
             (this.traceAppFileName!=null &&
              this.traceAppFileName.equals(other.getTraceAppFileName()))) &&
            ((this.traceCommFileName==null && other.getTraceCommFileName()==null) || 
             (this.traceCommFileName!=null &&
              this.traceCommFileName.equals(other.getTraceCommFileName()))) &&
            ((this.traceFlag==null && other.getTraceFlag()==null) || 
             (this.traceFlag!=null &&
              this.traceFlag.equals(other.getTraceFlag()))) &&
            ((this.transferNotificationEmailAddress==null && other.getTransferNotificationEmailAddress()==null) || 
             (this.transferNotificationEmailAddress!=null &&
              this.transferNotificationEmailAddress.equals(other.getTransferNotificationEmailAddress()))) &&
            ((this.transferNotificationEmailTemplate==null && other.getTransferNotificationEmailTemplate()==null) || 
             (this.transferNotificationEmailTemplate!=null &&
              this.transferNotificationEmailTemplate.equals(other.getTransferNotificationEmailTemplate()))) &&
            ((this.unixPermissions==null && other.getUnixPermissions()==null) || 
             (this.unixPermissions!=null &&
              this.unixPermissions.equals(other.getUnixPermissions()))) &&
            ((this.validDays==null && other.getValidDays()==null) || 
             (this.validDays!=null &&
              this.validDays.equals(other.getValidDays()))) &&
            ((this.validEndTime==null && other.getValidEndTime()==null) || 
             (this.validEndTime!=null &&
              this.validEndTime.equals(other.getValidEndTime()))) &&
            ((this.validStartTime==null && other.getValidStartTime()==null) || 
             (this.validStartTime!=null &&
              this.validStartTime.equals(other.getValidStartTime()))) &&
            ((this.virusCheckFlag==null && other.getVirusCheckFlag()==null) || 
             (this.virusCheckFlag!=null &&
              this.virusCheckFlag.equals(other.getVirusCheckFlag())));
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
        if (getAS2AuditProxy() != null) {
            _hashCode += getAS2AuditProxy().hashCode();
        }
        if (getAS2AuditServer() != null) {
            _hashCode += getAS2AuditServer().hashCode();
        }
        if (getCFClient_CR_LF() != null) {
            _hashCode += getCFClient_CR_LF().hashCode();
        }
        if (getCFClient_CheckPointCount() != null) {
            _hashCode += getCFClient_CheckPointCount().hashCode();
        }
        if (getCFClient_CheckPointInterval() != null) {
            _hashCode += getCFClient_CheckPointInterval().hashCode();
        }
        if (getCFClient_CheckPointRestart() != null) {
            _hashCode += getCFClient_CheckPointRestart().hashCode();
        }
        if (getCFClient_Compression() != null) {
            _hashCode += getCFClient_Compression().hashCode();
        }
        if (getCFClient_DataType() != null) {
            _hashCode += getCFClient_DataType().hashCode();
        }
        if (getCFClient_EncryptFlag() != null) {
            _hashCode += getCFClient_EncryptFlag().hashCode();
        }
        if (getCFClient_InitFileSpec() != null) {
            _hashCode += getCFClient_InitFileSpec().hashCode();
        }
        if (getCFClient_InitUserID() != null) {
            _hashCode += getCFClient_InitUserID().hashCode();
        }
        if (getCFClient_ProcessName() != null) {
            _hashCode += getCFClient_ProcessName().hashCode();
        }
        if (getCFClient_RemoteTransaction() != null) {
            _hashCode += getCFClient_RemoteTransaction().hashCode();
        }
        if (getCFClient_RespFileSpec() != null) {
            _hashCode += getCFClient_RespFileSpec().hashCode();
        }
        if (getCFClient_StatusDiagCode() != null) {
            _hashCode += getCFClient_StatusDiagCode().hashCode();
        }
        if (getCFClient_StatusMsg() != null) {
            _hashCode += getCFClient_StatusMsg().hashCode();
        }
        if (getCFClient_StatusSeverity() != null) {
            _hashCode += getCFClient_StatusSeverity().hashCode();
        }
        if (getCFClient_TrEndTime() != null) {
            _hashCode += getCFClient_TrEndTime().hashCode();
        }
        if (getCFClient_TrStartTime() != null) {
            _hashCode += getCFClient_TrStartTime().hashCode();
        }
        if (getCFClient_TransactionNumber() != null) {
            _hashCode += getCFClient_TransactionNumber().hashCode();
        }
        if (getCFClient_TransferWork() != null) {
            _hashCode += getCFClient_TransferWork().hashCode();
        }
        if (getCFClient_UserData() != null) {
            _hashCode += getCFClient_UserData().hashCode();
        }
        if (getCFClient_Version() != null) {
            _hashCode += getCFClient_Version().hashCode();
        }
        if (getFTPAlias() != null) {
            _hashCode += getFTPAlias().hashCode();
        }
        if (getJMSProperty() != null) {
            _hashCode += getJMSProperty().hashCode();
        }
        if (getJMSSelector() != null) {
            _hashCode += getJMSSelector().hashCode();
        }
        if (getPGPArmorFlag() != null) {
            _hashCode += getPGPArmorFlag().hashCode();
        }
        if (getPGPClCompAlg() != null) {
            _hashCode += getPGPClCompAlg().hashCode();
        }
        if (getPGPClEncKeyId() != null) {
            _hashCode += getPGPClEncKeyId().hashCode();
        }
        if (getPGPClEncryptAlg() != null) {
            _hashCode += getPGPClEncryptAlg().hashCode();
        }
        if (getPGPClHashingAlg() != null) {
            _hashCode += getPGPClHashingAlg().hashCode();
        }
        if (getPGPClSignature() != null) {
            _hashCode += getPGPClSignature().hashCode();
        }
        if (getPGPClSigned() != null) {
            _hashCode += getPGPClSigned().hashCode();
        }
        if (getPGPClSignerId() != null) {
            _hashCode += getPGPClSignerId().hashCode();
        }
        if (getPGPClSigningKeyId() != null) {
            _hashCode += getPGPClSigningKeyId().hashCode();
        }
        if (getPGPClVerified() != null) {
            _hashCode += getPGPClVerified().hashCode();
        }
        if (getPGPCompAlg() != null) {
            _hashCode += getPGPCompAlg().hashCode();
        }
        if (getPGPEncryptAlg() != null) {
            _hashCode += getPGPEncryptAlg().hashCode();
        }
        if (getPGPHashingAlg() != null) {
            _hashCode += getPGPHashingAlg().hashCode();
        }
        if (getPGPSrvEncKeyId() != null) {
            _hashCode += getPGPSrvEncKeyId().hashCode();
        }
        if (getPGPSrvSignature() != null) {
            _hashCode += getPGPSrvSignature().hashCode();
        }
        if (getPGPSrvSigned() != null) {
            _hashCode += getPGPSrvSigned().hashCode();
        }
        if (getPGPSrvSignerId() != null) {
            _hashCode += getPGPSrvSignerId().hashCode();
        }
        if (getPGPSrvSigningKeyId() != null) {
            _hashCode += getPGPSrvSigningKeyId().hashCode();
        }
        if (getPGPSrvVerified() != null) {
            _hashCode += getPGPSrvVerified().hashCode();
        }
        if (getPGPTextMode() != null) {
            _hashCode += getPGPTextMode().hashCode();
        }
        if (getAllowableProtocol() != null) {
            _hashCode += getAllowableProtocol().hashCode();
        }
        if (getAuthRoleId() != null) {
            _hashCode += getAuthRoleId().hashCode();
        }
        if (getAuthUserId() != null) {
            _hashCode += getAuthUserId().hashCode();
        }
        if (getAvailableDate() != null) {
            _hashCode += getAvailableDate().hashCode();
        }
        if (getAvailableUpdatedBy() != null) {
            _hashCode += getAvailableUpdatedBy().hashCode();
        }
        if (getChkptTryMaxCount() != null) {
            _hashCode += getChkptTryMaxCount().hashCode();
        }
        if (getCkPtTryMaxCount() != null) {
            _hashCode += getCkPtTryMaxCount().hashCode();
        }
        if (getConversionFlag() != null) {
            _hashCode += getConversionFlag().hashCode();
        }
        if (getDefaultNodePwd() != null) {
            _hashCode += getDefaultNodePwd().hashCode();
        }
        if (getDefaultNodeUserId() != null) {
            _hashCode += getDefaultNodeUserId().hashCode();
        }
        if (getDirectoryTransfer() != null) {
            _hashCode += getDirectoryTransfer().hashCode();
        }
        if (getDisableFlag() != null) {
            _hashCode += getDisableFlag().hashCode();
        }
        if (getEmailFailureFlag() != null) {
            _hashCode += getEmailFailureFlag().hashCode();
        }
        if (getEmailFailureTemplate() != null) {
            _hashCode += getEmailFailureTemplate().hashCode();
        }
        if (getEmailSuccessFlag() != null) {
            _hashCode += getEmailSuccessFlag().hashCode();
        }
        if (getEmailSuccessTemplate() != null) {
            _hashCode += getEmailSuccessTemplate().hashCode();
        }
        if (getExpirationDate() != null) {
            _hashCode += getExpirationDate().hashCode();
        }
        if (getFileId() != null) {
            _hashCode += getFileId().hashCode();
        }
        if (getFileShareFlag() != null) {
            _hashCode += getFileShareFlag().hashCode();
        }
        if (getLocalHostName() != null) {
            _hashCode += getLocalHostName().hashCode();
        }
        if (getOneTimeFlag() != null) {
            _hashCode += getOneTimeFlag().hashCode();
        }
        if (getProxyByteCount() != null) {
            _hashCode += getProxyByteCount().hashCode();
        }
        if (getProxyCompressedByteCount() != null) {
            _hashCode += getProxyCompressedByteCount().hashCode();
        }
        if (getProxyRemoteNTDomain() != null) {
            _hashCode += getProxyRemoteNTDomain().hashCode();
        }
        if (getProxyRemotePassword() != null) {
            _hashCode += getProxyRemotePassword().hashCode();
        }
        if (getProxyRemoteTransactionId() != null) {
            _hashCode += getProxyRemoteTransactionId().hashCode();
        }
        if (getProxyRemoteUserId() != null) {
            _hashCode += getProxyRemoteUserId().hashCode();
        }
        if (getProxyStatusDiagCode() != null) {
            _hashCode += getProxyStatusDiagCode().hashCode();
        }
        if (getProxyStatusSeverity() != null) {
            _hashCode += getProxyStatusSeverity().hashCode();
        }
        if (getProxyTraceAppFileName() != null) {
            _hashCode += getProxyTraceAppFileName().hashCode();
        }
        if (getProxyTraceCommFileName() != null) {
            _hashCode += getProxyTraceCommFileName().hashCode();
        }
        if (getServerPhysicalFileName() != null) {
            _hashCode += getServerPhysicalFileName().hashCode();
        }
        if (getTokenData() != null) {
            _hashCode += getTokenData().hashCode();
        }
        if (getTokenDateSet() != null) {
            _hashCode += getTokenDateSet().hashCode();
        }
        if (getTokenFlag() != null) {
            _hashCode += getTokenFlag().hashCode();
        }
        if (getTraceAppFileName() != null) {
            _hashCode += getTraceAppFileName().hashCode();
        }
        if (getTraceCommFileName() != null) {
            _hashCode += getTraceCommFileName().hashCode();
        }
        if (getTraceFlag() != null) {
            _hashCode += getTraceFlag().hashCode();
        }
        if (getTransferNotificationEmailAddress() != null) {
            _hashCode += getTransferNotificationEmailAddress().hashCode();
        }
        if (getTransferNotificationEmailTemplate() != null) {
            _hashCode += getTransferNotificationEmailTemplate().hashCode();
        }
        if (getUnixPermissions() != null) {
            _hashCode += getUnixPermissions().hashCode();
        }
        if (getValidDays() != null) {
            _hashCode += getValidDays().hashCode();
        }
        if (getValidEndTime() != null) {
            _hashCode += getValidEndTime().hashCode();
        }
        if (getValidStartTime() != null) {
            _hashCode += getValidStartTime().hashCode();
        }
        if (getVirusCheckFlag() != null) {
            _hashCode += getVirusCheckFlag().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Audit.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:AdministratorService", "Audit"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("AS2AuditProxy");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AS2AuditProxy"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:AdministratorService", "AS2Audit"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("AS2AuditServer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AS2AuditServer"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:AdministratorService", "AS2Audit"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CFClient_CR_LF");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CFClient_CR_LF"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CFClient_CheckPointCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CFClient_CheckPointCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CFClient_CheckPointInterval");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CFClient_CheckPointInterval"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CFClient_CheckPointRestart");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CFClient_CheckPointRestart"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CFClient_Compression");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CFClient_Compression"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CFClient_DataType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CFClient_DataType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CFClient_EncryptFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CFClient_EncryptFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CFClient_InitFileSpec");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CFClient_InitFileSpec"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CFClient_InitUserID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CFClient_InitUserID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CFClient_ProcessName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CFClient_ProcessName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CFClient_RemoteTransaction");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CFClient_RemoteTransaction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CFClient_RespFileSpec");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CFClient_RespFileSpec"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CFClient_StatusDiagCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CFClient_StatusDiagCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CFClient_StatusMsg");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CFClient_StatusMsg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CFClient_StatusSeverity");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CFClient_StatusSeverity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CFClient_TrEndTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CFClient_TrEndTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:AdministratorService", "DateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CFClient_TrStartTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CFClient_TrStartTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:AdministratorService", "DateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CFClient_TransactionNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CFClient_TransactionNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CFClient_TransferWork");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CFClient_TransferWork"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CFClient_UserData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CFClient_UserData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CFClient_Version");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CFClient_Version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FTPAlias");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FTPAlias"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("JMSProperty");
        elemField.setXmlName(new javax.xml.namespace.QName("", "JMSProperty"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("JMSSelector");
        elemField.setXmlName(new javax.xml.namespace.QName("", "JMSSelector"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PGPArmorFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PGPArmorFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PGPClCompAlg");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PGPClCompAlg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PGPClEncKeyId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PGPClEncKeyId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PGPClEncryptAlg");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PGPClEncryptAlg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PGPClHashingAlg");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PGPClHashingAlg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PGPClSignature");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PGPClSignature"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PGPClSigned");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PGPClSigned"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PGPClSignerId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PGPClSignerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PGPClSigningKeyId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PGPClSigningKeyId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PGPClVerified");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PGPClVerified"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PGPCompAlg");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PGPCompAlg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PGPEncryptAlg");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PGPEncryptAlg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PGPHashingAlg");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PGPHashingAlg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PGPSrvEncKeyId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PGPSrvEncKeyId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PGPSrvSignature");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PGPSrvSignature"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PGPSrvSigned");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PGPSrvSigned"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PGPSrvSignerId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PGPSrvSignerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PGPSrvSigningKeyId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PGPSrvSigningKeyId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PGPSrvVerified");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PGPSrvVerified"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PGPTextMode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PGPTextMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowableProtocol");
        elemField.setXmlName(new javax.xml.namespace.QName("", "allowableProtocol"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authRoleId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "authRoleId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authUserId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "authUserId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("availableDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "availableDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:AdministratorService", "DateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("availableUpdatedBy");
        elemField.setXmlName(new javax.xml.namespace.QName("", "availableUpdatedBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chkptTryMaxCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "chkptTryMaxCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ckPtTryMaxCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ckPtTryMaxCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conversionFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "conversionFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultNodePwd");
        elemField.setXmlName(new javax.xml.namespace.QName("", "defaultNodePwd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultNodeUserId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "defaultNodeUserId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("directoryTransfer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "directoryTransfer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disableFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "disableFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailFailureFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "emailFailureFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailFailureTemplate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "emailFailureTemplate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailSuccessFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "emailSuccessFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailSuccessTemplate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "emailSuccessTemplate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expirationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "expirationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:AdministratorService", "DateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileShareFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fileShareFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localHostName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "localHostName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oneTimeFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "oneTimeFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("proxyByteCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "proxyByteCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("proxyCompressedByteCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "proxyCompressedByteCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("proxyRemoteNTDomain");
        elemField.setXmlName(new javax.xml.namespace.QName("", "proxyRemoteNTDomain"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("proxyRemotePassword");
        elemField.setXmlName(new javax.xml.namespace.QName("", "proxyRemotePassword"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("proxyRemoteTransactionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "proxyRemoteTransactionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("proxyRemoteUserId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "proxyRemoteUserId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("proxyStatusDiagCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "proxyStatusDiagCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("proxyStatusSeverity");
        elemField.setXmlName(new javax.xml.namespace.QName("", "proxyStatusSeverity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("proxyTraceAppFileName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "proxyTraceAppFileName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("proxyTraceCommFileName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "proxyTraceCommFileName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serverPhysicalFileName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serverPhysicalFileName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tokenData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tokenData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tokenDateSet");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tokenDateSet"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:AdministratorService", "DateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tokenFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tokenFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("traceAppFileName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "traceAppFileName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("traceCommFileName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "traceCommFileName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("traceFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "traceFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferNotificationEmailAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transferNotificationEmailAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferNotificationEmailTemplate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transferNotificationEmailTemplate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unixPermissions");
        elemField.setXmlName(new javax.xml.namespace.QName("", "unixPermissions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validDays");
        elemField.setXmlName(new javax.xml.namespace.QName("", "validDays"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validEndTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "validEndTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validStartTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "validStartTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("virusCheckFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "virusCheckFlag"));
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
