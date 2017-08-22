/**
 * FileInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 11, 2014 (12:11:36 EDT) WSDL2Java emitter.
 */

package AdminClient;

public class FileInfo  implements java.io.Serializable {
    private java.lang.String CRLF;

    private java.lang.String FTPAlias;

    private java.lang.String FTPAllowClientTransMode;

    private java.lang.String FTPAllowCreateDir;

    private java.lang.String FTPAllowDelete;

    private java.lang.String FTPAllowRemoveDir;

    private java.lang.String FTPAllowRename;

    private java.lang.String FTPSiteCmdPassThrough;

    private java.lang.String ISServerName;

    private java.lang.String JMSMaxMsgSize;

    private java.lang.String JMSMessageID;

    private java.lang.String JMSNameOrFilePath;

    private java.lang.String JMSOrFile;

    private java.lang.String JMSProperty;

    private java.lang.String JMSSelector;

    private java.lang.String JMSTransferStatusCheck;

    private java.lang.String JMSTypeProperty;

    private java.lang.String JMSUserID;

    private java.lang.String JMSUserPwd;

    private java.lang.String JPAFullLocalFileName;

    private java.lang.String JPAFullRemoteFileName;

    private java.lang.String JPALocalTransactionNumber;

    private java.lang.String JPALocalUserId;

    private java.lang.String JPARemoteTransactionNumber;

    private java.lang.String JPARemoteUsrId;

    private java.lang.String LRECL;

    private java.lang.String OS390AllocPri;

    private java.lang.String OS390AllocSec;

    private java.lang.String OS390AllocType;

    private java.lang.String OS390BlockSize;

    private java.lang.String OS390DataClass;

    private java.lang.String OS390MgtClass;

    private java.lang.String OS390StorClass;

    private java.lang.String OS390Unit;

    private java.lang.String OS390Volume;

    private java.lang.String PGPArmorFile;

    private java.lang.String PGPCompressAlg;

    private java.lang.String PGPDecryptFile;

    private java.lang.String PGPEncryptAlg;

    private java.lang.String PGPEncryptFile;

    private java.lang.String PGPHashingAlg;

    private java.lang.String PGPPrivateKey;

    private java.lang.String PGPSignFile;

    private java.lang.String PGPStrictVerifySign;

    private java.lang.String PGPTextMode;

    private java.lang.String PGPVerifySign;

    private java.lang.String RECFM;

    private java.lang.String SSHPrivKey;

    private java.lang.String allowableProtocol;

    private java.lang.String auditId;

    private java.lang.String authRoleId;

    private java.lang.String authUserId;

    private AdminClient.DateTime availableDate;

    private java.lang.String availableUpdatedBy;

    private java.lang.String chkptCount;

    private java.lang.String chkptInterval;

    private java.lang.String chkptRestartFlag;

    private java.lang.String chkptTryMaxCount;

    private java.lang.String clientCompressFlag;

    private java.lang.String clientFileName;

    private java.lang.String conversionFlag;

    private java.lang.String createdBy;

    private java.lang.String credPassThruFlag;

    private java.lang.String dataType;

    private AdminClient.DateTime dateCreated;

    private AdminClient.DateTime dateLastProcessed;

    private AdminClient.DateTime dateUpdated;

    private java.lang.String defaultNTDomain;

    private java.lang.String defaultNodePwd;

    private java.lang.String defaultNodeUserId;

    private java.lang.String department;

    private java.lang.String description;

    private AdminClient.DirectoryElementList[] directoryFileList;

    private java.lang.String directoryTransfer;

    private java.lang.String disableFlag;

    private java.lang.String downloadRuleFileExtEnabled;

    private java.lang.String downloadRuleFileExts;

    private java.lang.String emailFailureFlag;

    private java.lang.String emailFailureTemplate;

    private java.lang.String emailSuccessFlag;

    private java.lang.String emailSuccessTemplate;

    private java.lang.String encryptFlag;

    private AdminClient.DateTime expirationDate;

    private java.lang.String fileOption;

    private java.lang.String httpBackendUploadFormPara;

    private java.lang.String httpBackendUploadFormat;

    private java.lang.String id;

    private java.lang.String keyFlag;

    private java.lang.String lastReturnCode;

    private java.lang.String localTransactionId;

    private java.lang.String localTranslationTable;

    private java.lang.String nodeName;

    private java.lang.String notifyEmailTemplate;

    private java.lang.String notifyFlag;

    private java.lang.String oneTimeFlag;

    private java.lang.String postActionData1;

    private java.lang.String postActionData2;

    private java.lang.String postActionData3;

    private java.lang.String postActionData4;

    private java.lang.String postActionFlag1;

    private java.lang.String postActionFlag2;

    private java.lang.String postActionFlag3;

    private java.lang.String postActionFlag4;

    private java.lang.String postActionType1;

    private java.lang.String postActionType2;

    private java.lang.String postActionType3;

    private java.lang.String postActionType4;

    private java.lang.String processName;

    private java.lang.String remoteTranslationTable;

    private java.lang.String requestID;

    private java.lang.String restartAvailable;

    private java.lang.String sendRecvFlag;

    private java.lang.String serverFileName;

    private java.lang.String toEmailAddrFailure;

    private java.lang.String toEmailAddrSuccess;

    private java.lang.String tokenData;

    private AdminClient.DateTime tokenDateSet;

    private java.lang.String tokenFlag;

    private java.lang.String traceFlag;

    private java.lang.String transferCompletionFlag;

    private java.lang.String transferID;

    private java.lang.String transferWork;

    private java.lang.String unixPermissions;

    private java.lang.String updatedBy;

    private java.lang.String uploadRuleFileExtEnabled;

    private java.lang.String uploadRuleFileExts;

    private java.lang.String uploadView;

    private java.lang.String userData;

    private java.lang.String validDays;

    private java.lang.String validEndTime;

    private java.lang.String validStartTime;

    private java.lang.String virusCheckFlag;

    private java.lang.String writeMode;

    public FileInfo() {
    }

    public FileInfo(
           java.lang.String CRLF,
           java.lang.String FTPAlias,
           java.lang.String FTPAllowClientTransMode,
           java.lang.String FTPAllowCreateDir,
           java.lang.String FTPAllowDelete,
           java.lang.String FTPAllowRemoveDir,
           java.lang.String FTPAllowRename,
           java.lang.String FTPSiteCmdPassThrough,
           java.lang.String ISServerName,
           java.lang.String JMSMaxMsgSize,
           java.lang.String JMSMessageID,
           java.lang.String JMSNameOrFilePath,
           java.lang.String JMSOrFile,
           java.lang.String JMSProperty,
           java.lang.String JMSSelector,
           java.lang.String JMSTransferStatusCheck,
           java.lang.String JMSTypeProperty,
           java.lang.String JMSUserID,
           java.lang.String JMSUserPwd,
           java.lang.String JPAFullLocalFileName,
           java.lang.String JPAFullRemoteFileName,
           java.lang.String JPALocalTransactionNumber,
           java.lang.String JPALocalUserId,
           java.lang.String JPARemoteTransactionNumber,
           java.lang.String JPARemoteUsrId,
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
           java.lang.String PGPArmorFile,
           java.lang.String PGPCompressAlg,
           java.lang.String PGPDecryptFile,
           java.lang.String PGPEncryptAlg,
           java.lang.String PGPEncryptFile,
           java.lang.String PGPHashingAlg,
           java.lang.String PGPPrivateKey,
           java.lang.String PGPSignFile,
           java.lang.String PGPStrictVerifySign,
           java.lang.String PGPTextMode,
           java.lang.String PGPVerifySign,
           java.lang.String RECFM,
           java.lang.String SSHPrivKey,
           java.lang.String allowableProtocol,
           java.lang.String auditId,
           java.lang.String authRoleId,
           java.lang.String authUserId,
           AdminClient.DateTime availableDate,
           java.lang.String availableUpdatedBy,
           java.lang.String chkptCount,
           java.lang.String chkptInterval,
           java.lang.String chkptRestartFlag,
           java.lang.String chkptTryMaxCount,
           java.lang.String clientCompressFlag,
           java.lang.String clientFileName,
           java.lang.String conversionFlag,
           java.lang.String createdBy,
           java.lang.String credPassThruFlag,
           java.lang.String dataType,
           AdminClient.DateTime dateCreated,
           AdminClient.DateTime dateLastProcessed,
           AdminClient.DateTime dateUpdated,
           java.lang.String defaultNTDomain,
           java.lang.String defaultNodePwd,
           java.lang.String defaultNodeUserId,
           java.lang.String department,
           java.lang.String description,
           AdminClient.DirectoryElementList[] directoryFileList,
           java.lang.String directoryTransfer,
           java.lang.String disableFlag,
           java.lang.String downloadRuleFileExtEnabled,
           java.lang.String downloadRuleFileExts,
           java.lang.String emailFailureFlag,
           java.lang.String emailFailureTemplate,
           java.lang.String emailSuccessFlag,
           java.lang.String emailSuccessTemplate,
           java.lang.String encryptFlag,
           AdminClient.DateTime expirationDate,
           java.lang.String fileOption,
           java.lang.String httpBackendUploadFormPara,
           java.lang.String httpBackendUploadFormat,
           java.lang.String id,
           java.lang.String keyFlag,
           java.lang.String lastReturnCode,
           java.lang.String localTransactionId,
           java.lang.String localTranslationTable,
           java.lang.String nodeName,
           java.lang.String notifyEmailTemplate,
           java.lang.String notifyFlag,
           java.lang.String oneTimeFlag,
           java.lang.String postActionData1,
           java.lang.String postActionData2,
           java.lang.String postActionData3,
           java.lang.String postActionData4,
           java.lang.String postActionFlag1,
           java.lang.String postActionFlag2,
           java.lang.String postActionFlag3,
           java.lang.String postActionFlag4,
           java.lang.String postActionType1,
           java.lang.String postActionType2,
           java.lang.String postActionType3,
           java.lang.String postActionType4,
           java.lang.String processName,
           java.lang.String remoteTranslationTable,
           java.lang.String requestID,
           java.lang.String restartAvailable,
           java.lang.String sendRecvFlag,
           java.lang.String serverFileName,
           java.lang.String toEmailAddrFailure,
           java.lang.String toEmailAddrSuccess,
           java.lang.String tokenData,
           AdminClient.DateTime tokenDateSet,
           java.lang.String tokenFlag,
           java.lang.String traceFlag,
           java.lang.String transferCompletionFlag,
           java.lang.String transferID,
           java.lang.String transferWork,
           java.lang.String unixPermissions,
           java.lang.String updatedBy,
           java.lang.String uploadRuleFileExtEnabled,
           java.lang.String uploadRuleFileExts,
           java.lang.String uploadView,
           java.lang.String userData,
           java.lang.String validDays,
           java.lang.String validEndTime,
           java.lang.String validStartTime,
           java.lang.String virusCheckFlag,
           java.lang.String writeMode) {
           this.CRLF = CRLF;
           this.FTPAlias = FTPAlias;
           this.FTPAllowClientTransMode = FTPAllowClientTransMode;
           this.FTPAllowCreateDir = FTPAllowCreateDir;
           this.FTPAllowDelete = FTPAllowDelete;
           this.FTPAllowRemoveDir = FTPAllowRemoveDir;
           this.FTPAllowRename = FTPAllowRename;
           this.FTPSiteCmdPassThrough = FTPSiteCmdPassThrough;
           this.ISServerName = ISServerName;
           this.JMSMaxMsgSize = JMSMaxMsgSize;
           this.JMSMessageID = JMSMessageID;
           this.JMSNameOrFilePath = JMSNameOrFilePath;
           this.JMSOrFile = JMSOrFile;
           this.JMSProperty = JMSProperty;
           this.JMSSelector = JMSSelector;
           this.JMSTransferStatusCheck = JMSTransferStatusCheck;
           this.JMSTypeProperty = JMSTypeProperty;
           this.JMSUserID = JMSUserID;
           this.JMSUserPwd = JMSUserPwd;
           this.JPAFullLocalFileName = JPAFullLocalFileName;
           this.JPAFullRemoteFileName = JPAFullRemoteFileName;
           this.JPALocalTransactionNumber = JPALocalTransactionNumber;
           this.JPALocalUserId = JPALocalUserId;
           this.JPARemoteTransactionNumber = JPARemoteTransactionNumber;
           this.JPARemoteUsrId = JPARemoteUsrId;
           this.LRECL = LRECL;
           this.OS390AllocPri = OS390AllocPri;
           this.OS390AllocSec = OS390AllocSec;
           this.OS390AllocType = OS390AllocType;
           this.OS390BlockSize = OS390BlockSize;
           this.OS390DataClass = OS390DataClass;
           this.OS390MgtClass = OS390MgtClass;
           this.OS390StorClass = OS390StorClass;
           this.OS390Unit = OS390Unit;
           this.OS390Volume = OS390Volume;
           this.PGPArmorFile = PGPArmorFile;
           this.PGPCompressAlg = PGPCompressAlg;
           this.PGPDecryptFile = PGPDecryptFile;
           this.PGPEncryptAlg = PGPEncryptAlg;
           this.PGPEncryptFile = PGPEncryptFile;
           this.PGPHashingAlg = PGPHashingAlg;
           this.PGPPrivateKey = PGPPrivateKey;
           this.PGPSignFile = PGPSignFile;
           this.PGPStrictVerifySign = PGPStrictVerifySign;
           this.PGPTextMode = PGPTextMode;
           this.PGPVerifySign = PGPVerifySign;
           this.RECFM = RECFM;
           this.SSHPrivKey = SSHPrivKey;
           this.allowableProtocol = allowableProtocol;
           this.auditId = auditId;
           this.authRoleId = authRoleId;
           this.authUserId = authUserId;
           this.availableDate = availableDate;
           this.availableUpdatedBy = availableUpdatedBy;
           this.chkptCount = chkptCount;
           this.chkptInterval = chkptInterval;
           this.chkptRestartFlag = chkptRestartFlag;
           this.chkptTryMaxCount = chkptTryMaxCount;
           this.clientCompressFlag = clientCompressFlag;
           this.clientFileName = clientFileName;
           this.conversionFlag = conversionFlag;
           this.createdBy = createdBy;
           this.credPassThruFlag = credPassThruFlag;
           this.dataType = dataType;
           this.dateCreated = dateCreated;
           this.dateLastProcessed = dateLastProcessed;
           this.dateUpdated = dateUpdated;
           this.defaultNTDomain = defaultNTDomain;
           this.defaultNodePwd = defaultNodePwd;
           this.defaultNodeUserId = defaultNodeUserId;
           this.department = department;
           this.description = description;
           this.directoryFileList = directoryFileList;
           this.directoryTransfer = directoryTransfer;
           this.disableFlag = disableFlag;
           this.downloadRuleFileExtEnabled = downloadRuleFileExtEnabled;
           this.downloadRuleFileExts = downloadRuleFileExts;
           this.emailFailureFlag = emailFailureFlag;
           this.emailFailureTemplate = emailFailureTemplate;
           this.emailSuccessFlag = emailSuccessFlag;
           this.emailSuccessTemplate = emailSuccessTemplate;
           this.encryptFlag = encryptFlag;
           this.expirationDate = expirationDate;
           this.fileOption = fileOption;
           this.httpBackendUploadFormPara = httpBackendUploadFormPara;
           this.httpBackendUploadFormat = httpBackendUploadFormat;
           this.id = id;
           this.keyFlag = keyFlag;
           this.lastReturnCode = lastReturnCode;
           this.localTransactionId = localTransactionId;
           this.localTranslationTable = localTranslationTable;
           this.nodeName = nodeName;
           this.notifyEmailTemplate = notifyEmailTemplate;
           this.notifyFlag = notifyFlag;
           this.oneTimeFlag = oneTimeFlag;
           this.postActionData1 = postActionData1;
           this.postActionData2 = postActionData2;
           this.postActionData3 = postActionData3;
           this.postActionData4 = postActionData4;
           this.postActionFlag1 = postActionFlag1;
           this.postActionFlag2 = postActionFlag2;
           this.postActionFlag3 = postActionFlag3;
           this.postActionFlag4 = postActionFlag4;
           this.postActionType1 = postActionType1;
           this.postActionType2 = postActionType2;
           this.postActionType3 = postActionType3;
           this.postActionType4 = postActionType4;
           this.processName = processName;
           this.remoteTranslationTable = remoteTranslationTable;
           this.requestID = requestID;
           this.restartAvailable = restartAvailable;
           this.sendRecvFlag = sendRecvFlag;
           this.serverFileName = serverFileName;
           this.toEmailAddrFailure = toEmailAddrFailure;
           this.toEmailAddrSuccess = toEmailAddrSuccess;
           this.tokenData = tokenData;
           this.tokenDateSet = tokenDateSet;
           this.tokenFlag = tokenFlag;
           this.traceFlag = traceFlag;
           this.transferCompletionFlag = transferCompletionFlag;
           this.transferID = transferID;
           this.transferWork = transferWork;
           this.unixPermissions = unixPermissions;
           this.updatedBy = updatedBy;
           this.uploadRuleFileExtEnabled = uploadRuleFileExtEnabled;
           this.uploadRuleFileExts = uploadRuleFileExts;
           this.uploadView = uploadView;
           this.userData = userData;
           this.validDays = validDays;
           this.validEndTime = validEndTime;
           this.validStartTime = validStartTime;
           this.virusCheckFlag = virusCheckFlag;
           this.writeMode = writeMode;
    }


    /**
     * Gets the CRLF value for this FileInfo.
     * 
     * @return CRLF
     */
    public java.lang.String getCRLF() {
        return CRLF;
    }


    /**
     * Sets the CRLF value for this FileInfo.
     * 
     * @param CRLF
     */
    public void setCRLF(java.lang.String CRLF) {
        this.CRLF = CRLF;
    }


    /**
     * Gets the FTPAlias value for this FileInfo.
     * 
     * @return FTPAlias
     */
    public java.lang.String getFTPAlias() {
        return FTPAlias;
    }


    /**
     * Sets the FTPAlias value for this FileInfo.
     * 
     * @param FTPAlias
     */
    public void setFTPAlias(java.lang.String FTPAlias) {
        this.FTPAlias = FTPAlias;
    }


    /**
     * Gets the FTPAllowClientTransMode value for this FileInfo.
     * 
     * @return FTPAllowClientTransMode
     */
    public java.lang.String getFTPAllowClientTransMode() {
        return FTPAllowClientTransMode;
    }


    /**
     * Sets the FTPAllowClientTransMode value for this FileInfo.
     * 
     * @param FTPAllowClientTransMode
     */
    public void setFTPAllowClientTransMode(java.lang.String FTPAllowClientTransMode) {
        this.FTPAllowClientTransMode = FTPAllowClientTransMode;
    }


    /**
     * Gets the FTPAllowCreateDir value for this FileInfo.
     * 
     * @return FTPAllowCreateDir
     */
    public java.lang.String getFTPAllowCreateDir() {
        return FTPAllowCreateDir;
    }


    /**
     * Sets the FTPAllowCreateDir value for this FileInfo.
     * 
     * @param FTPAllowCreateDir
     */
    public void setFTPAllowCreateDir(java.lang.String FTPAllowCreateDir) {
        this.FTPAllowCreateDir = FTPAllowCreateDir;
    }


    /**
     * Gets the FTPAllowDelete value for this FileInfo.
     * 
     * @return FTPAllowDelete
     */
    public java.lang.String getFTPAllowDelete() {
        return FTPAllowDelete;
    }


    /**
     * Sets the FTPAllowDelete value for this FileInfo.
     * 
     * @param FTPAllowDelete
     */
    public void setFTPAllowDelete(java.lang.String FTPAllowDelete) {
        this.FTPAllowDelete = FTPAllowDelete;
    }


    /**
     * Gets the FTPAllowRemoveDir value for this FileInfo.
     * 
     * @return FTPAllowRemoveDir
     */
    public java.lang.String getFTPAllowRemoveDir() {
        return FTPAllowRemoveDir;
    }


    /**
     * Sets the FTPAllowRemoveDir value for this FileInfo.
     * 
     * @param FTPAllowRemoveDir
     */
    public void setFTPAllowRemoveDir(java.lang.String FTPAllowRemoveDir) {
        this.FTPAllowRemoveDir = FTPAllowRemoveDir;
    }


    /**
     * Gets the FTPAllowRename value for this FileInfo.
     * 
     * @return FTPAllowRename
     */
    public java.lang.String getFTPAllowRename() {
        return FTPAllowRename;
    }


    /**
     * Sets the FTPAllowRename value for this FileInfo.
     * 
     * @param FTPAllowRename
     */
    public void setFTPAllowRename(java.lang.String FTPAllowRename) {
        this.FTPAllowRename = FTPAllowRename;
    }


    /**
     * Gets the FTPSiteCmdPassThrough value for this FileInfo.
     * 
     * @return FTPSiteCmdPassThrough
     */
    public java.lang.String getFTPSiteCmdPassThrough() {
        return FTPSiteCmdPassThrough;
    }


    /**
     * Sets the FTPSiteCmdPassThrough value for this FileInfo.
     * 
     * @param FTPSiteCmdPassThrough
     */
    public void setFTPSiteCmdPassThrough(java.lang.String FTPSiteCmdPassThrough) {
        this.FTPSiteCmdPassThrough = FTPSiteCmdPassThrough;
    }


    /**
     * Gets the ISServerName value for this FileInfo.
     * 
     * @return ISServerName
     */
    public java.lang.String getISServerName() {
        return ISServerName;
    }


    /**
     * Sets the ISServerName value for this FileInfo.
     * 
     * @param ISServerName
     */
    public void setISServerName(java.lang.String ISServerName) {
        this.ISServerName = ISServerName;
    }


    /**
     * Gets the JMSMaxMsgSize value for this FileInfo.
     * 
     * @return JMSMaxMsgSize
     */
    public java.lang.String getJMSMaxMsgSize() {
        return JMSMaxMsgSize;
    }


    /**
     * Sets the JMSMaxMsgSize value for this FileInfo.
     * 
     * @param JMSMaxMsgSize
     */
    public void setJMSMaxMsgSize(java.lang.String JMSMaxMsgSize) {
        this.JMSMaxMsgSize = JMSMaxMsgSize;
    }


    /**
     * Gets the JMSMessageID value for this FileInfo.
     * 
     * @return JMSMessageID
     */
    public java.lang.String getJMSMessageID() {
        return JMSMessageID;
    }


    /**
     * Sets the JMSMessageID value for this FileInfo.
     * 
     * @param JMSMessageID
     */
    public void setJMSMessageID(java.lang.String JMSMessageID) {
        this.JMSMessageID = JMSMessageID;
    }


    /**
     * Gets the JMSNameOrFilePath value for this FileInfo.
     * 
     * @return JMSNameOrFilePath
     */
    public java.lang.String getJMSNameOrFilePath() {
        return JMSNameOrFilePath;
    }


    /**
     * Sets the JMSNameOrFilePath value for this FileInfo.
     * 
     * @param JMSNameOrFilePath
     */
    public void setJMSNameOrFilePath(java.lang.String JMSNameOrFilePath) {
        this.JMSNameOrFilePath = JMSNameOrFilePath;
    }


    /**
     * Gets the JMSOrFile value for this FileInfo.
     * 
     * @return JMSOrFile
     */
    public java.lang.String getJMSOrFile() {
        return JMSOrFile;
    }


    /**
     * Sets the JMSOrFile value for this FileInfo.
     * 
     * @param JMSOrFile
     */
    public void setJMSOrFile(java.lang.String JMSOrFile) {
        this.JMSOrFile = JMSOrFile;
    }


    /**
     * Gets the JMSProperty value for this FileInfo.
     * 
     * @return JMSProperty
     */
    public java.lang.String getJMSProperty() {
        return JMSProperty;
    }


    /**
     * Sets the JMSProperty value for this FileInfo.
     * 
     * @param JMSProperty
     */
    public void setJMSProperty(java.lang.String JMSProperty) {
        this.JMSProperty = JMSProperty;
    }


    /**
     * Gets the JMSSelector value for this FileInfo.
     * 
     * @return JMSSelector
     */
    public java.lang.String getJMSSelector() {
        return JMSSelector;
    }


    /**
     * Sets the JMSSelector value for this FileInfo.
     * 
     * @param JMSSelector
     */
    public void setJMSSelector(java.lang.String JMSSelector) {
        this.JMSSelector = JMSSelector;
    }


    /**
     * Gets the JMSTransferStatusCheck value for this FileInfo.
     * 
     * @return JMSTransferStatusCheck
     */
    public java.lang.String getJMSTransferStatusCheck() {
        return JMSTransferStatusCheck;
    }


    /**
     * Sets the JMSTransferStatusCheck value for this FileInfo.
     * 
     * @param JMSTransferStatusCheck
     */
    public void setJMSTransferStatusCheck(java.lang.String JMSTransferStatusCheck) {
        this.JMSTransferStatusCheck = JMSTransferStatusCheck;
    }


    /**
     * Gets the JMSTypeProperty value for this FileInfo.
     * 
     * @return JMSTypeProperty
     */
    public java.lang.String getJMSTypeProperty() {
        return JMSTypeProperty;
    }


    /**
     * Sets the JMSTypeProperty value for this FileInfo.
     * 
     * @param JMSTypeProperty
     */
    public void setJMSTypeProperty(java.lang.String JMSTypeProperty) {
        this.JMSTypeProperty = JMSTypeProperty;
    }


    /**
     * Gets the JMSUserID value for this FileInfo.
     * 
     * @return JMSUserID
     */
    public java.lang.String getJMSUserID() {
        return JMSUserID;
    }


    /**
     * Sets the JMSUserID value for this FileInfo.
     * 
     * @param JMSUserID
     */
    public void setJMSUserID(java.lang.String JMSUserID) {
        this.JMSUserID = JMSUserID;
    }


    /**
     * Gets the JMSUserPwd value for this FileInfo.
     * 
     * @return JMSUserPwd
     */
    public java.lang.String getJMSUserPwd() {
        return JMSUserPwd;
    }


    /**
     * Sets the JMSUserPwd value for this FileInfo.
     * 
     * @param JMSUserPwd
     */
    public void setJMSUserPwd(java.lang.String JMSUserPwd) {
        this.JMSUserPwd = JMSUserPwd;
    }


    /**
     * Gets the JPAFullLocalFileName value for this FileInfo.
     * 
     * @return JPAFullLocalFileName
     */
    public java.lang.String getJPAFullLocalFileName() {
        return JPAFullLocalFileName;
    }


    /**
     * Sets the JPAFullLocalFileName value for this FileInfo.
     * 
     * @param JPAFullLocalFileName
     */
    public void setJPAFullLocalFileName(java.lang.String JPAFullLocalFileName) {
        this.JPAFullLocalFileName = JPAFullLocalFileName;
    }


    /**
     * Gets the JPAFullRemoteFileName value for this FileInfo.
     * 
     * @return JPAFullRemoteFileName
     */
    public java.lang.String getJPAFullRemoteFileName() {
        return JPAFullRemoteFileName;
    }


    /**
     * Sets the JPAFullRemoteFileName value for this FileInfo.
     * 
     * @param JPAFullRemoteFileName
     */
    public void setJPAFullRemoteFileName(java.lang.String JPAFullRemoteFileName) {
        this.JPAFullRemoteFileName = JPAFullRemoteFileName;
    }


    /**
     * Gets the JPALocalTransactionNumber value for this FileInfo.
     * 
     * @return JPALocalTransactionNumber
     */
    public java.lang.String getJPALocalTransactionNumber() {
        return JPALocalTransactionNumber;
    }


    /**
     * Sets the JPALocalTransactionNumber value for this FileInfo.
     * 
     * @param JPALocalTransactionNumber
     */
    public void setJPALocalTransactionNumber(java.lang.String JPALocalTransactionNumber) {
        this.JPALocalTransactionNumber = JPALocalTransactionNumber;
    }


    /**
     * Gets the JPALocalUserId value for this FileInfo.
     * 
     * @return JPALocalUserId
     */
    public java.lang.String getJPALocalUserId() {
        return JPALocalUserId;
    }


    /**
     * Sets the JPALocalUserId value for this FileInfo.
     * 
     * @param JPALocalUserId
     */
    public void setJPALocalUserId(java.lang.String JPALocalUserId) {
        this.JPALocalUserId = JPALocalUserId;
    }


    /**
     * Gets the JPARemoteTransactionNumber value for this FileInfo.
     * 
     * @return JPARemoteTransactionNumber
     */
    public java.lang.String getJPARemoteTransactionNumber() {
        return JPARemoteTransactionNumber;
    }


    /**
     * Sets the JPARemoteTransactionNumber value for this FileInfo.
     * 
     * @param JPARemoteTransactionNumber
     */
    public void setJPARemoteTransactionNumber(java.lang.String JPARemoteTransactionNumber) {
        this.JPARemoteTransactionNumber = JPARemoteTransactionNumber;
    }


    /**
     * Gets the JPARemoteUsrId value for this FileInfo.
     * 
     * @return JPARemoteUsrId
     */
    public java.lang.String getJPARemoteUsrId() {
        return JPARemoteUsrId;
    }


    /**
     * Sets the JPARemoteUsrId value for this FileInfo.
     * 
     * @param JPARemoteUsrId
     */
    public void setJPARemoteUsrId(java.lang.String JPARemoteUsrId) {
        this.JPARemoteUsrId = JPARemoteUsrId;
    }


    /**
     * Gets the LRECL value for this FileInfo.
     * 
     * @return LRECL
     */
    public java.lang.String getLRECL() {
        return LRECL;
    }


    /**
     * Sets the LRECL value for this FileInfo.
     * 
     * @param LRECL
     */
    public void setLRECL(java.lang.String LRECL) {
        this.LRECL = LRECL;
    }


    /**
     * Gets the OS390AllocPri value for this FileInfo.
     * 
     * @return OS390AllocPri
     */
    public java.lang.String getOS390AllocPri() {
        return OS390AllocPri;
    }


    /**
     * Sets the OS390AllocPri value for this FileInfo.
     * 
     * @param OS390AllocPri
     */
    public void setOS390AllocPri(java.lang.String OS390AllocPri) {
        this.OS390AllocPri = OS390AllocPri;
    }


    /**
     * Gets the OS390AllocSec value for this FileInfo.
     * 
     * @return OS390AllocSec
     */
    public java.lang.String getOS390AllocSec() {
        return OS390AllocSec;
    }


    /**
     * Sets the OS390AllocSec value for this FileInfo.
     * 
     * @param OS390AllocSec
     */
    public void setOS390AllocSec(java.lang.String OS390AllocSec) {
        this.OS390AllocSec = OS390AllocSec;
    }


    /**
     * Gets the OS390AllocType value for this FileInfo.
     * 
     * @return OS390AllocType
     */
    public java.lang.String getOS390AllocType() {
        return OS390AllocType;
    }


    /**
     * Sets the OS390AllocType value for this FileInfo.
     * 
     * @param OS390AllocType
     */
    public void setOS390AllocType(java.lang.String OS390AllocType) {
        this.OS390AllocType = OS390AllocType;
    }


    /**
     * Gets the OS390BlockSize value for this FileInfo.
     * 
     * @return OS390BlockSize
     */
    public java.lang.String getOS390BlockSize() {
        return OS390BlockSize;
    }


    /**
     * Sets the OS390BlockSize value for this FileInfo.
     * 
     * @param OS390BlockSize
     */
    public void setOS390BlockSize(java.lang.String OS390BlockSize) {
        this.OS390BlockSize = OS390BlockSize;
    }


    /**
     * Gets the OS390DataClass value for this FileInfo.
     * 
     * @return OS390DataClass
     */
    public java.lang.String getOS390DataClass() {
        return OS390DataClass;
    }


    /**
     * Sets the OS390DataClass value for this FileInfo.
     * 
     * @param OS390DataClass
     */
    public void setOS390DataClass(java.lang.String OS390DataClass) {
        this.OS390DataClass = OS390DataClass;
    }


    /**
     * Gets the OS390MgtClass value for this FileInfo.
     * 
     * @return OS390MgtClass
     */
    public java.lang.String getOS390MgtClass() {
        return OS390MgtClass;
    }


    /**
     * Sets the OS390MgtClass value for this FileInfo.
     * 
     * @param OS390MgtClass
     */
    public void setOS390MgtClass(java.lang.String OS390MgtClass) {
        this.OS390MgtClass = OS390MgtClass;
    }


    /**
     * Gets the OS390StorClass value for this FileInfo.
     * 
     * @return OS390StorClass
     */
    public java.lang.String getOS390StorClass() {
        return OS390StorClass;
    }


    /**
     * Sets the OS390StorClass value for this FileInfo.
     * 
     * @param OS390StorClass
     */
    public void setOS390StorClass(java.lang.String OS390StorClass) {
        this.OS390StorClass = OS390StorClass;
    }


    /**
     * Gets the OS390Unit value for this FileInfo.
     * 
     * @return OS390Unit
     */
    public java.lang.String getOS390Unit() {
        return OS390Unit;
    }


    /**
     * Sets the OS390Unit value for this FileInfo.
     * 
     * @param OS390Unit
     */
    public void setOS390Unit(java.lang.String OS390Unit) {
        this.OS390Unit = OS390Unit;
    }


    /**
     * Gets the OS390Volume value for this FileInfo.
     * 
     * @return OS390Volume
     */
    public java.lang.String getOS390Volume() {
        return OS390Volume;
    }


    /**
     * Sets the OS390Volume value for this FileInfo.
     * 
     * @param OS390Volume
     */
    public void setOS390Volume(java.lang.String OS390Volume) {
        this.OS390Volume = OS390Volume;
    }


    /**
     * Gets the PGPArmorFile value for this FileInfo.
     * 
     * @return PGPArmorFile
     */
    public java.lang.String getPGPArmorFile() {
        return PGPArmorFile;
    }


    /**
     * Sets the PGPArmorFile value for this FileInfo.
     * 
     * @param PGPArmorFile
     */
    public void setPGPArmorFile(java.lang.String PGPArmorFile) {
        this.PGPArmorFile = PGPArmorFile;
    }


    /**
     * Gets the PGPCompressAlg value for this FileInfo.
     * 
     * @return PGPCompressAlg
     */
    public java.lang.String getPGPCompressAlg() {
        return PGPCompressAlg;
    }


    /**
     * Sets the PGPCompressAlg value for this FileInfo.
     * 
     * @param PGPCompressAlg
     */
    public void setPGPCompressAlg(java.lang.String PGPCompressAlg) {
        this.PGPCompressAlg = PGPCompressAlg;
    }


    /**
     * Gets the PGPDecryptFile value for this FileInfo.
     * 
     * @return PGPDecryptFile
     */
    public java.lang.String getPGPDecryptFile() {
        return PGPDecryptFile;
    }


    /**
     * Sets the PGPDecryptFile value for this FileInfo.
     * 
     * @param PGPDecryptFile
     */
    public void setPGPDecryptFile(java.lang.String PGPDecryptFile) {
        this.PGPDecryptFile = PGPDecryptFile;
    }


    /**
     * Gets the PGPEncryptAlg value for this FileInfo.
     * 
     * @return PGPEncryptAlg
     */
    public java.lang.String getPGPEncryptAlg() {
        return PGPEncryptAlg;
    }


    /**
     * Sets the PGPEncryptAlg value for this FileInfo.
     * 
     * @param PGPEncryptAlg
     */
    public void setPGPEncryptAlg(java.lang.String PGPEncryptAlg) {
        this.PGPEncryptAlg = PGPEncryptAlg;
    }


    /**
     * Gets the PGPEncryptFile value for this FileInfo.
     * 
     * @return PGPEncryptFile
     */
    public java.lang.String getPGPEncryptFile() {
        return PGPEncryptFile;
    }


    /**
     * Sets the PGPEncryptFile value for this FileInfo.
     * 
     * @param PGPEncryptFile
     */
    public void setPGPEncryptFile(java.lang.String PGPEncryptFile) {
        this.PGPEncryptFile = PGPEncryptFile;
    }


    /**
     * Gets the PGPHashingAlg value for this FileInfo.
     * 
     * @return PGPHashingAlg
     */
    public java.lang.String getPGPHashingAlg() {
        return PGPHashingAlg;
    }


    /**
     * Sets the PGPHashingAlg value for this FileInfo.
     * 
     * @param PGPHashingAlg
     */
    public void setPGPHashingAlg(java.lang.String PGPHashingAlg) {
        this.PGPHashingAlg = PGPHashingAlg;
    }


    /**
     * Gets the PGPPrivateKey value for this FileInfo.
     * 
     * @return PGPPrivateKey
     */
    public java.lang.String getPGPPrivateKey() {
        return PGPPrivateKey;
    }


    /**
     * Sets the PGPPrivateKey value for this FileInfo.
     * 
     * @param PGPPrivateKey
     */
    public void setPGPPrivateKey(java.lang.String PGPPrivateKey) {
        this.PGPPrivateKey = PGPPrivateKey;
    }


    /**
     * Gets the PGPSignFile value for this FileInfo.
     * 
     * @return PGPSignFile
     */
    public java.lang.String getPGPSignFile() {
        return PGPSignFile;
    }


    /**
     * Sets the PGPSignFile value for this FileInfo.
     * 
     * @param PGPSignFile
     */
    public void setPGPSignFile(java.lang.String PGPSignFile) {
        this.PGPSignFile = PGPSignFile;
    }


    /**
     * Gets the PGPStrictVerifySign value for this FileInfo.
     * 
     * @return PGPStrictVerifySign
     */
    public java.lang.String getPGPStrictVerifySign() {
        return PGPStrictVerifySign;
    }


    /**
     * Sets the PGPStrictVerifySign value for this FileInfo.
     * 
     * @param PGPStrictVerifySign
     */
    public void setPGPStrictVerifySign(java.lang.String PGPStrictVerifySign) {
        this.PGPStrictVerifySign = PGPStrictVerifySign;
    }


    /**
     * Gets the PGPTextMode value for this FileInfo.
     * 
     * @return PGPTextMode
     */
    public java.lang.String getPGPTextMode() {
        return PGPTextMode;
    }


    /**
     * Sets the PGPTextMode value for this FileInfo.
     * 
     * @param PGPTextMode
     */
    public void setPGPTextMode(java.lang.String PGPTextMode) {
        this.PGPTextMode = PGPTextMode;
    }


    /**
     * Gets the PGPVerifySign value for this FileInfo.
     * 
     * @return PGPVerifySign
     */
    public java.lang.String getPGPVerifySign() {
        return PGPVerifySign;
    }


    /**
     * Sets the PGPVerifySign value for this FileInfo.
     * 
     * @param PGPVerifySign
     */
    public void setPGPVerifySign(java.lang.String PGPVerifySign) {
        this.PGPVerifySign = PGPVerifySign;
    }


    /**
     * Gets the RECFM value for this FileInfo.
     * 
     * @return RECFM
     */
    public java.lang.String getRECFM() {
        return RECFM;
    }


    /**
     * Sets the RECFM value for this FileInfo.
     * 
     * @param RECFM
     */
    public void setRECFM(java.lang.String RECFM) {
        this.RECFM = RECFM;
    }


    /**
     * Gets the SSHPrivKey value for this FileInfo.
     * 
     * @return SSHPrivKey
     */
    public java.lang.String getSSHPrivKey() {
        return SSHPrivKey;
    }


    /**
     * Sets the SSHPrivKey value for this FileInfo.
     * 
     * @param SSHPrivKey
     */
    public void setSSHPrivKey(java.lang.String SSHPrivKey) {
        this.SSHPrivKey = SSHPrivKey;
    }


    /**
     * Gets the allowableProtocol value for this FileInfo.
     * 
     * @return allowableProtocol
     */
    public java.lang.String getAllowableProtocol() {
        return allowableProtocol;
    }


    /**
     * Sets the allowableProtocol value for this FileInfo.
     * 
     * @param allowableProtocol
     */
    public void setAllowableProtocol(java.lang.String allowableProtocol) {
        this.allowableProtocol = allowableProtocol;
    }


    /**
     * Gets the auditId value for this FileInfo.
     * 
     * @return auditId
     */
    public java.lang.String getAuditId() {
        return auditId;
    }


    /**
     * Sets the auditId value for this FileInfo.
     * 
     * @param auditId
     */
    public void setAuditId(java.lang.String auditId) {
        this.auditId = auditId;
    }


    /**
     * Gets the authRoleId value for this FileInfo.
     * 
     * @return authRoleId
     */
    public java.lang.String getAuthRoleId() {
        return authRoleId;
    }


    /**
     * Sets the authRoleId value for this FileInfo.
     * 
     * @param authRoleId
     */
    public void setAuthRoleId(java.lang.String authRoleId) {
        this.authRoleId = authRoleId;
    }


    /**
     * Gets the authUserId value for this FileInfo.
     * 
     * @return authUserId
     */
    public java.lang.String getAuthUserId() {
        return authUserId;
    }


    /**
     * Sets the authUserId value for this FileInfo.
     * 
     * @param authUserId
     */
    public void setAuthUserId(java.lang.String authUserId) {
        this.authUserId = authUserId;
    }


    /**
     * Gets the availableDate value for this FileInfo.
     * 
     * @return availableDate
     */
    public AdminClient.DateTime getAvailableDate() {
        return availableDate;
    }


    /**
     * Sets the availableDate value for this FileInfo.
     * 
     * @param availableDate
     */
    public void setAvailableDate(AdminClient.DateTime availableDate) {
        this.availableDate = availableDate;
    }


    /**
     * Gets the availableUpdatedBy value for this FileInfo.
     * 
     * @return availableUpdatedBy
     */
    public java.lang.String getAvailableUpdatedBy() {
        return availableUpdatedBy;
    }


    /**
     * Sets the availableUpdatedBy value for this FileInfo.
     * 
     * @param availableUpdatedBy
     */
    public void setAvailableUpdatedBy(java.lang.String availableUpdatedBy) {
        this.availableUpdatedBy = availableUpdatedBy;
    }


    /**
     * Gets the chkptCount value for this FileInfo.
     * 
     * @return chkptCount
     */
    public java.lang.String getChkptCount() {
        return chkptCount;
    }


    /**
     * Sets the chkptCount value for this FileInfo.
     * 
     * @param chkptCount
     */
    public void setChkptCount(java.lang.String chkptCount) {
        this.chkptCount = chkptCount;
    }


    /**
     * Gets the chkptInterval value for this FileInfo.
     * 
     * @return chkptInterval
     */
    public java.lang.String getChkptInterval() {
        return chkptInterval;
    }


    /**
     * Sets the chkptInterval value for this FileInfo.
     * 
     * @param chkptInterval
     */
    public void setChkptInterval(java.lang.String chkptInterval) {
        this.chkptInterval = chkptInterval;
    }


    /**
     * Gets the chkptRestartFlag value for this FileInfo.
     * 
     * @return chkptRestartFlag
     */
    public java.lang.String getChkptRestartFlag() {
        return chkptRestartFlag;
    }


    /**
     * Sets the chkptRestartFlag value for this FileInfo.
     * 
     * @param chkptRestartFlag
     */
    public void setChkptRestartFlag(java.lang.String chkptRestartFlag) {
        this.chkptRestartFlag = chkptRestartFlag;
    }


    /**
     * Gets the chkptTryMaxCount value for this FileInfo.
     * 
     * @return chkptTryMaxCount
     */
    public java.lang.String getChkptTryMaxCount() {
        return chkptTryMaxCount;
    }


    /**
     * Sets the chkptTryMaxCount value for this FileInfo.
     * 
     * @param chkptTryMaxCount
     */
    public void setChkptTryMaxCount(java.lang.String chkptTryMaxCount) {
        this.chkptTryMaxCount = chkptTryMaxCount;
    }


    /**
     * Gets the clientCompressFlag value for this FileInfo.
     * 
     * @return clientCompressFlag
     */
    public java.lang.String getClientCompressFlag() {
        return clientCompressFlag;
    }


    /**
     * Sets the clientCompressFlag value for this FileInfo.
     * 
     * @param clientCompressFlag
     */
    public void setClientCompressFlag(java.lang.String clientCompressFlag) {
        this.clientCompressFlag = clientCompressFlag;
    }


    /**
     * Gets the clientFileName value for this FileInfo.
     * 
     * @return clientFileName
     */
    public java.lang.String getClientFileName() {
        return clientFileName;
    }


    /**
     * Sets the clientFileName value for this FileInfo.
     * 
     * @param clientFileName
     */
    public void setClientFileName(java.lang.String clientFileName) {
        this.clientFileName = clientFileName;
    }


    /**
     * Gets the conversionFlag value for this FileInfo.
     * 
     * @return conversionFlag
     */
    public java.lang.String getConversionFlag() {
        return conversionFlag;
    }


    /**
     * Sets the conversionFlag value for this FileInfo.
     * 
     * @param conversionFlag
     */
    public void setConversionFlag(java.lang.String conversionFlag) {
        this.conversionFlag = conversionFlag;
    }


    /**
     * Gets the createdBy value for this FileInfo.
     * 
     * @return createdBy
     */
    public java.lang.String getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this FileInfo.
     * 
     * @param createdBy
     */
    public void setCreatedBy(java.lang.String createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the credPassThruFlag value for this FileInfo.
     * 
     * @return credPassThruFlag
     */
    public java.lang.String getCredPassThruFlag() {
        return credPassThruFlag;
    }


    /**
     * Sets the credPassThruFlag value for this FileInfo.
     * 
     * @param credPassThruFlag
     */
    public void setCredPassThruFlag(java.lang.String credPassThruFlag) {
        this.credPassThruFlag = credPassThruFlag;
    }


    /**
     * Gets the dataType value for this FileInfo.
     * 
     * @return dataType
     */
    public java.lang.String getDataType() {
        return dataType;
    }


    /**
     * Sets the dataType value for this FileInfo.
     * 
     * @param dataType
     */
    public void setDataType(java.lang.String dataType) {
        this.dataType = dataType;
    }


    /**
     * Gets the dateCreated value for this FileInfo.
     * 
     * @return dateCreated
     */
    public AdminClient.DateTime getDateCreated() {
        return dateCreated;
    }


    /**
     * Sets the dateCreated value for this FileInfo.
     * 
     * @param dateCreated
     */
    public void setDateCreated(AdminClient.DateTime dateCreated) {
        this.dateCreated = dateCreated;
    }


    /**
     * Gets the dateLastProcessed value for this FileInfo.
     * 
     * @return dateLastProcessed
     */
    public AdminClient.DateTime getDateLastProcessed() {
        return dateLastProcessed;
    }


    /**
     * Sets the dateLastProcessed value for this FileInfo.
     * 
     * @param dateLastProcessed
     */
    public void setDateLastProcessed(AdminClient.DateTime dateLastProcessed) {
        this.dateLastProcessed = dateLastProcessed;
    }


    /**
     * Gets the dateUpdated value for this FileInfo.
     * 
     * @return dateUpdated
     */
    public AdminClient.DateTime getDateUpdated() {
        return dateUpdated;
    }


    /**
     * Sets the dateUpdated value for this FileInfo.
     * 
     * @param dateUpdated
     */
    public void setDateUpdated(AdminClient.DateTime dateUpdated) {
        this.dateUpdated = dateUpdated;
    }


    /**
     * Gets the defaultNTDomain value for this FileInfo.
     * 
     * @return defaultNTDomain
     */
    public java.lang.String getDefaultNTDomain() {
        return defaultNTDomain;
    }


    /**
     * Sets the defaultNTDomain value for this FileInfo.
     * 
     * @param defaultNTDomain
     */
    public void setDefaultNTDomain(java.lang.String defaultNTDomain) {
        this.defaultNTDomain = defaultNTDomain;
    }


    /**
     * Gets the defaultNodePwd value for this FileInfo.
     * 
     * @return defaultNodePwd
     */
    public java.lang.String getDefaultNodePwd() {
        return defaultNodePwd;
    }


    /**
     * Sets the defaultNodePwd value for this FileInfo.
     * 
     * @param defaultNodePwd
     */
    public void setDefaultNodePwd(java.lang.String defaultNodePwd) {
        this.defaultNodePwd = defaultNodePwd;
    }


    /**
     * Gets the defaultNodeUserId value for this FileInfo.
     * 
     * @return defaultNodeUserId
     */
    public java.lang.String getDefaultNodeUserId() {
        return defaultNodeUserId;
    }


    /**
     * Sets the defaultNodeUserId value for this FileInfo.
     * 
     * @param defaultNodeUserId
     */
    public void setDefaultNodeUserId(java.lang.String defaultNodeUserId) {
        this.defaultNodeUserId = defaultNodeUserId;
    }


    /**
     * Gets the department value for this FileInfo.
     * 
     * @return department
     */
    public java.lang.String getDepartment() {
        return department;
    }


    /**
     * Sets the department value for this FileInfo.
     * 
     * @param department
     */
    public void setDepartment(java.lang.String department) {
        this.department = department;
    }


    /**
     * Gets the description value for this FileInfo.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this FileInfo.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the directoryFileList value for this FileInfo.
     * 
     * @return directoryFileList
     */
    public AdminClient.DirectoryElementList[] getDirectoryFileList() {
        return directoryFileList;
    }


    /**
     * Sets the directoryFileList value for this FileInfo.
     * 
     * @param directoryFileList
     */
    public void setDirectoryFileList(AdminClient.DirectoryElementList[] directoryFileList) {
        this.directoryFileList = directoryFileList;
    }


    /**
     * Gets the directoryTransfer value for this FileInfo.
     * 
     * @return directoryTransfer
     */
    public java.lang.String getDirectoryTransfer() {
        return directoryTransfer;
    }


    /**
     * Sets the directoryTransfer value for this FileInfo.
     * 
     * @param directoryTransfer
     */
    public void setDirectoryTransfer(java.lang.String directoryTransfer) {
        this.directoryTransfer = directoryTransfer;
    }


    /**
     * Gets the disableFlag value for this FileInfo.
     * 
     * @return disableFlag
     */
    public java.lang.String getDisableFlag() {
        return disableFlag;
    }


    /**
     * Sets the disableFlag value for this FileInfo.
     * 
     * @param disableFlag
     */
    public void setDisableFlag(java.lang.String disableFlag) {
        this.disableFlag = disableFlag;
    }


    /**
     * Gets the downloadRuleFileExtEnabled value for this FileInfo.
     * 
     * @return downloadRuleFileExtEnabled
     */
    public java.lang.String getDownloadRuleFileExtEnabled() {
        return downloadRuleFileExtEnabled;
    }


    /**
     * Sets the downloadRuleFileExtEnabled value for this FileInfo.
     * 
     * @param downloadRuleFileExtEnabled
     */
    public void setDownloadRuleFileExtEnabled(java.lang.String downloadRuleFileExtEnabled) {
        this.downloadRuleFileExtEnabled = downloadRuleFileExtEnabled;
    }


    /**
     * Gets the downloadRuleFileExts value for this FileInfo.
     * 
     * @return downloadRuleFileExts
     */
    public java.lang.String getDownloadRuleFileExts() {
        return downloadRuleFileExts;
    }


    /**
     * Sets the downloadRuleFileExts value for this FileInfo.
     * 
     * @param downloadRuleFileExts
     */
    public void setDownloadRuleFileExts(java.lang.String downloadRuleFileExts) {
        this.downloadRuleFileExts = downloadRuleFileExts;
    }


    /**
     * Gets the emailFailureFlag value for this FileInfo.
     * 
     * @return emailFailureFlag
     */
    public java.lang.String getEmailFailureFlag() {
        return emailFailureFlag;
    }


    /**
     * Sets the emailFailureFlag value for this FileInfo.
     * 
     * @param emailFailureFlag
     */
    public void setEmailFailureFlag(java.lang.String emailFailureFlag) {
        this.emailFailureFlag = emailFailureFlag;
    }


    /**
     * Gets the emailFailureTemplate value for this FileInfo.
     * 
     * @return emailFailureTemplate
     */
    public java.lang.String getEmailFailureTemplate() {
        return emailFailureTemplate;
    }


    /**
     * Sets the emailFailureTemplate value for this FileInfo.
     * 
     * @param emailFailureTemplate
     */
    public void setEmailFailureTemplate(java.lang.String emailFailureTemplate) {
        this.emailFailureTemplate = emailFailureTemplate;
    }


    /**
     * Gets the emailSuccessFlag value for this FileInfo.
     * 
     * @return emailSuccessFlag
     */
    public java.lang.String getEmailSuccessFlag() {
        return emailSuccessFlag;
    }


    /**
     * Sets the emailSuccessFlag value for this FileInfo.
     * 
     * @param emailSuccessFlag
     */
    public void setEmailSuccessFlag(java.lang.String emailSuccessFlag) {
        this.emailSuccessFlag = emailSuccessFlag;
    }


    /**
     * Gets the emailSuccessTemplate value for this FileInfo.
     * 
     * @return emailSuccessTemplate
     */
    public java.lang.String getEmailSuccessTemplate() {
        return emailSuccessTemplate;
    }


    /**
     * Sets the emailSuccessTemplate value for this FileInfo.
     * 
     * @param emailSuccessTemplate
     */
    public void setEmailSuccessTemplate(java.lang.String emailSuccessTemplate) {
        this.emailSuccessTemplate = emailSuccessTemplate;
    }


    /**
     * Gets the encryptFlag value for this FileInfo.
     * 
     * @return encryptFlag
     */
    public java.lang.String getEncryptFlag() {
        return encryptFlag;
    }


    /**
     * Sets the encryptFlag value for this FileInfo.
     * 
     * @param encryptFlag
     */
    public void setEncryptFlag(java.lang.String encryptFlag) {
        this.encryptFlag = encryptFlag;
    }


    /**
     * Gets the expirationDate value for this FileInfo.
     * 
     * @return expirationDate
     */
    public AdminClient.DateTime getExpirationDate() {
        return expirationDate;
    }


    /**
     * Sets the expirationDate value for this FileInfo.
     * 
     * @param expirationDate
     */
    public void setExpirationDate(AdminClient.DateTime expirationDate) {
        this.expirationDate = expirationDate;
    }


    /**
     * Gets the fileOption value for this FileInfo.
     * 
     * @return fileOption
     */
    public java.lang.String getFileOption() {
        return fileOption;
    }


    /**
     * Sets the fileOption value for this FileInfo.
     * 
     * @param fileOption
     */
    public void setFileOption(java.lang.String fileOption) {
        this.fileOption = fileOption;
    }


    /**
     * Gets the httpBackendUploadFormPara value for this FileInfo.
     * 
     * @return httpBackendUploadFormPara
     */
    public java.lang.String getHttpBackendUploadFormPara() {
        return httpBackendUploadFormPara;
    }


    /**
     * Sets the httpBackendUploadFormPara value for this FileInfo.
     * 
     * @param httpBackendUploadFormPara
     */
    public void setHttpBackendUploadFormPara(java.lang.String httpBackendUploadFormPara) {
        this.httpBackendUploadFormPara = httpBackendUploadFormPara;
    }


    /**
     * Gets the httpBackendUploadFormat value for this FileInfo.
     * 
     * @return httpBackendUploadFormat
     */
    public java.lang.String getHttpBackendUploadFormat() {
        return httpBackendUploadFormat;
    }


    /**
     * Sets the httpBackendUploadFormat value for this FileInfo.
     * 
     * @param httpBackendUploadFormat
     */
    public void setHttpBackendUploadFormat(java.lang.String httpBackendUploadFormat) {
        this.httpBackendUploadFormat = httpBackendUploadFormat;
    }


    /**
     * Gets the id value for this FileInfo.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this FileInfo.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the keyFlag value for this FileInfo.
     * 
     * @return keyFlag
     */
    public java.lang.String getKeyFlag() {
        return keyFlag;
    }


    /**
     * Sets the keyFlag value for this FileInfo.
     * 
     * @param keyFlag
     */
    public void setKeyFlag(java.lang.String keyFlag) {
        this.keyFlag = keyFlag;
    }


    /**
     * Gets the lastReturnCode value for this FileInfo.
     * 
     * @return lastReturnCode
     */
    public java.lang.String getLastReturnCode() {
        return lastReturnCode;
    }


    /**
     * Sets the lastReturnCode value for this FileInfo.
     * 
     * @param lastReturnCode
     */
    public void setLastReturnCode(java.lang.String lastReturnCode) {
        this.lastReturnCode = lastReturnCode;
    }


    /**
     * Gets the localTransactionId value for this FileInfo.
     * 
     * @return localTransactionId
     */
    public java.lang.String getLocalTransactionId() {
        return localTransactionId;
    }


    /**
     * Sets the localTransactionId value for this FileInfo.
     * 
     * @param localTransactionId
     */
    public void setLocalTransactionId(java.lang.String localTransactionId) {
        this.localTransactionId = localTransactionId;
    }


    /**
     * Gets the localTranslationTable value for this FileInfo.
     * 
     * @return localTranslationTable
     */
    public java.lang.String getLocalTranslationTable() {
        return localTranslationTable;
    }


    /**
     * Sets the localTranslationTable value for this FileInfo.
     * 
     * @param localTranslationTable
     */
    public void setLocalTranslationTable(java.lang.String localTranslationTable) {
        this.localTranslationTable = localTranslationTable;
    }


    /**
     * Gets the nodeName value for this FileInfo.
     * 
     * @return nodeName
     */
    public java.lang.String getNodeName() {
        return nodeName;
    }


    /**
     * Sets the nodeName value for this FileInfo.
     * 
     * @param nodeName
     */
    public void setNodeName(java.lang.String nodeName) {
        this.nodeName = nodeName;
    }


    /**
     * Gets the notifyEmailTemplate value for this FileInfo.
     * 
     * @return notifyEmailTemplate
     */
    public java.lang.String getNotifyEmailTemplate() {
        return notifyEmailTemplate;
    }


    /**
     * Sets the notifyEmailTemplate value for this FileInfo.
     * 
     * @param notifyEmailTemplate
     */
    public void setNotifyEmailTemplate(java.lang.String notifyEmailTemplate) {
        this.notifyEmailTemplate = notifyEmailTemplate;
    }


    /**
     * Gets the notifyFlag value for this FileInfo.
     * 
     * @return notifyFlag
     */
    public java.lang.String getNotifyFlag() {
        return notifyFlag;
    }


    /**
     * Sets the notifyFlag value for this FileInfo.
     * 
     * @param notifyFlag
     */
    public void setNotifyFlag(java.lang.String notifyFlag) {
        this.notifyFlag = notifyFlag;
    }


    /**
     * Gets the oneTimeFlag value for this FileInfo.
     * 
     * @return oneTimeFlag
     */
    public java.lang.String getOneTimeFlag() {
        return oneTimeFlag;
    }


    /**
     * Sets the oneTimeFlag value for this FileInfo.
     * 
     * @param oneTimeFlag
     */
    public void setOneTimeFlag(java.lang.String oneTimeFlag) {
        this.oneTimeFlag = oneTimeFlag;
    }


    /**
     * Gets the postActionData1 value for this FileInfo.
     * 
     * @return postActionData1
     */
    public java.lang.String getPostActionData1() {
        return postActionData1;
    }


    /**
     * Sets the postActionData1 value for this FileInfo.
     * 
     * @param postActionData1
     */
    public void setPostActionData1(java.lang.String postActionData1) {
        this.postActionData1 = postActionData1;
    }


    /**
     * Gets the postActionData2 value for this FileInfo.
     * 
     * @return postActionData2
     */
    public java.lang.String getPostActionData2() {
        return postActionData2;
    }


    /**
     * Sets the postActionData2 value for this FileInfo.
     * 
     * @param postActionData2
     */
    public void setPostActionData2(java.lang.String postActionData2) {
        this.postActionData2 = postActionData2;
    }


    /**
     * Gets the postActionData3 value for this FileInfo.
     * 
     * @return postActionData3
     */
    public java.lang.String getPostActionData3() {
        return postActionData3;
    }


    /**
     * Sets the postActionData3 value for this FileInfo.
     * 
     * @param postActionData3
     */
    public void setPostActionData3(java.lang.String postActionData3) {
        this.postActionData3 = postActionData3;
    }


    /**
     * Gets the postActionData4 value for this FileInfo.
     * 
     * @return postActionData4
     */
    public java.lang.String getPostActionData4() {
        return postActionData4;
    }


    /**
     * Sets the postActionData4 value for this FileInfo.
     * 
     * @param postActionData4
     */
    public void setPostActionData4(java.lang.String postActionData4) {
        this.postActionData4 = postActionData4;
    }


    /**
     * Gets the postActionFlag1 value for this FileInfo.
     * 
     * @return postActionFlag1
     */
    public java.lang.String getPostActionFlag1() {
        return postActionFlag1;
    }


    /**
     * Sets the postActionFlag1 value for this FileInfo.
     * 
     * @param postActionFlag1
     */
    public void setPostActionFlag1(java.lang.String postActionFlag1) {
        this.postActionFlag1 = postActionFlag1;
    }


    /**
     * Gets the postActionFlag2 value for this FileInfo.
     * 
     * @return postActionFlag2
     */
    public java.lang.String getPostActionFlag2() {
        return postActionFlag2;
    }


    /**
     * Sets the postActionFlag2 value for this FileInfo.
     * 
     * @param postActionFlag2
     */
    public void setPostActionFlag2(java.lang.String postActionFlag2) {
        this.postActionFlag2 = postActionFlag2;
    }


    /**
     * Gets the postActionFlag3 value for this FileInfo.
     * 
     * @return postActionFlag3
     */
    public java.lang.String getPostActionFlag3() {
        return postActionFlag3;
    }


    /**
     * Sets the postActionFlag3 value for this FileInfo.
     * 
     * @param postActionFlag3
     */
    public void setPostActionFlag3(java.lang.String postActionFlag3) {
        this.postActionFlag3 = postActionFlag3;
    }


    /**
     * Gets the postActionFlag4 value for this FileInfo.
     * 
     * @return postActionFlag4
     */
    public java.lang.String getPostActionFlag4() {
        return postActionFlag4;
    }


    /**
     * Sets the postActionFlag4 value for this FileInfo.
     * 
     * @param postActionFlag4
     */
    public void setPostActionFlag4(java.lang.String postActionFlag4) {
        this.postActionFlag4 = postActionFlag4;
    }


    /**
     * Gets the postActionType1 value for this FileInfo.
     * 
     * @return postActionType1
     */
    public java.lang.String getPostActionType1() {
        return postActionType1;
    }


    /**
     * Sets the postActionType1 value for this FileInfo.
     * 
     * @param postActionType1
     */
    public void setPostActionType1(java.lang.String postActionType1) {
        this.postActionType1 = postActionType1;
    }


    /**
     * Gets the postActionType2 value for this FileInfo.
     * 
     * @return postActionType2
     */
    public java.lang.String getPostActionType2() {
        return postActionType2;
    }


    /**
     * Sets the postActionType2 value for this FileInfo.
     * 
     * @param postActionType2
     */
    public void setPostActionType2(java.lang.String postActionType2) {
        this.postActionType2 = postActionType2;
    }


    /**
     * Gets the postActionType3 value for this FileInfo.
     * 
     * @return postActionType3
     */
    public java.lang.String getPostActionType3() {
        return postActionType3;
    }


    /**
     * Sets the postActionType3 value for this FileInfo.
     * 
     * @param postActionType3
     */
    public void setPostActionType3(java.lang.String postActionType3) {
        this.postActionType3 = postActionType3;
    }


    /**
     * Gets the postActionType4 value for this FileInfo.
     * 
     * @return postActionType4
     */
    public java.lang.String getPostActionType4() {
        return postActionType4;
    }


    /**
     * Sets the postActionType4 value for this FileInfo.
     * 
     * @param postActionType4
     */
    public void setPostActionType4(java.lang.String postActionType4) {
        this.postActionType4 = postActionType4;
    }


    /**
     * Gets the processName value for this FileInfo.
     * 
     * @return processName
     */
    public java.lang.String getProcessName() {
        return processName;
    }


    /**
     * Sets the processName value for this FileInfo.
     * 
     * @param processName
     */
    public void setProcessName(java.lang.String processName) {
        this.processName = processName;
    }


    /**
     * Gets the remoteTranslationTable value for this FileInfo.
     * 
     * @return remoteTranslationTable
     */
    public java.lang.String getRemoteTranslationTable() {
        return remoteTranslationTable;
    }


    /**
     * Sets the remoteTranslationTable value for this FileInfo.
     * 
     * @param remoteTranslationTable
     */
    public void setRemoteTranslationTable(java.lang.String remoteTranslationTable) {
        this.remoteTranslationTable = remoteTranslationTable;
    }


    /**
     * Gets the requestID value for this FileInfo.
     * 
     * @return requestID
     */
    public java.lang.String getRequestID() {
        return requestID;
    }


    /**
     * Sets the requestID value for this FileInfo.
     * 
     * @param requestID
     */
    public void setRequestID(java.lang.String requestID) {
        this.requestID = requestID;
    }


    /**
     * Gets the restartAvailable value for this FileInfo.
     * 
     * @return restartAvailable
     */
    public java.lang.String getRestartAvailable() {
        return restartAvailable;
    }


    /**
     * Sets the restartAvailable value for this FileInfo.
     * 
     * @param restartAvailable
     */
    public void setRestartAvailable(java.lang.String restartAvailable) {
        this.restartAvailable = restartAvailable;
    }


    /**
     * Gets the sendRecvFlag value for this FileInfo.
     * 
     * @return sendRecvFlag
     */
    public java.lang.String getSendRecvFlag() {
        return sendRecvFlag;
    }


    /**
     * Sets the sendRecvFlag value for this FileInfo.
     * 
     * @param sendRecvFlag
     */
    public void setSendRecvFlag(java.lang.String sendRecvFlag) {
        this.sendRecvFlag = sendRecvFlag;
    }


    /**
     * Gets the serverFileName value for this FileInfo.
     * 
     * @return serverFileName
     */
    public java.lang.String getServerFileName() {
        return serverFileName;
    }


    /**
     * Sets the serverFileName value for this FileInfo.
     * 
     * @param serverFileName
     */
    public void setServerFileName(java.lang.String serverFileName) {
        this.serverFileName = serverFileName;
    }


    /**
     * Gets the toEmailAddrFailure value for this FileInfo.
     * 
     * @return toEmailAddrFailure
     */
    public java.lang.String getToEmailAddrFailure() {
        return toEmailAddrFailure;
    }


    /**
     * Sets the toEmailAddrFailure value for this FileInfo.
     * 
     * @param toEmailAddrFailure
     */
    public void setToEmailAddrFailure(java.lang.String toEmailAddrFailure) {
        this.toEmailAddrFailure = toEmailAddrFailure;
    }


    /**
     * Gets the toEmailAddrSuccess value for this FileInfo.
     * 
     * @return toEmailAddrSuccess
     */
    public java.lang.String getToEmailAddrSuccess() {
        return toEmailAddrSuccess;
    }


    /**
     * Sets the toEmailAddrSuccess value for this FileInfo.
     * 
     * @param toEmailAddrSuccess
     */
    public void setToEmailAddrSuccess(java.lang.String toEmailAddrSuccess) {
        this.toEmailAddrSuccess = toEmailAddrSuccess;
    }


    /**
     * Gets the tokenData value for this FileInfo.
     * 
     * @return tokenData
     */
    public java.lang.String getTokenData() {
        return tokenData;
    }


    /**
     * Sets the tokenData value for this FileInfo.
     * 
     * @param tokenData
     */
    public void setTokenData(java.lang.String tokenData) {
        this.tokenData = tokenData;
    }


    /**
     * Gets the tokenDateSet value for this FileInfo.
     * 
     * @return tokenDateSet
     */
    public AdminClient.DateTime getTokenDateSet() {
        return tokenDateSet;
    }


    /**
     * Sets the tokenDateSet value for this FileInfo.
     * 
     * @param tokenDateSet
     */
    public void setTokenDateSet(AdminClient.DateTime tokenDateSet) {
        this.tokenDateSet = tokenDateSet;
    }


    /**
     * Gets the tokenFlag value for this FileInfo.
     * 
     * @return tokenFlag
     */
    public java.lang.String getTokenFlag() {
        return tokenFlag;
    }


    /**
     * Sets the tokenFlag value for this FileInfo.
     * 
     * @param tokenFlag
     */
    public void setTokenFlag(java.lang.String tokenFlag) {
        this.tokenFlag = tokenFlag;
    }


    /**
     * Gets the traceFlag value for this FileInfo.
     * 
     * @return traceFlag
     */
    public java.lang.String getTraceFlag() {
        return traceFlag;
    }


    /**
     * Sets the traceFlag value for this FileInfo.
     * 
     * @param traceFlag
     */
    public void setTraceFlag(java.lang.String traceFlag) {
        this.traceFlag = traceFlag;
    }


    /**
     * Gets the transferCompletionFlag value for this FileInfo.
     * 
     * @return transferCompletionFlag
     */
    public java.lang.String getTransferCompletionFlag() {
        return transferCompletionFlag;
    }


    /**
     * Sets the transferCompletionFlag value for this FileInfo.
     * 
     * @param transferCompletionFlag
     */
    public void setTransferCompletionFlag(java.lang.String transferCompletionFlag) {
        this.transferCompletionFlag = transferCompletionFlag;
    }


    /**
     * Gets the transferID value for this FileInfo.
     * 
     * @return transferID
     */
    public java.lang.String getTransferID() {
        return transferID;
    }


    /**
     * Sets the transferID value for this FileInfo.
     * 
     * @param transferID
     */
    public void setTransferID(java.lang.String transferID) {
        this.transferID = transferID;
    }


    /**
     * Gets the transferWork value for this FileInfo.
     * 
     * @return transferWork
     */
    public java.lang.String getTransferWork() {
        return transferWork;
    }


    /**
     * Sets the transferWork value for this FileInfo.
     * 
     * @param transferWork
     */
    public void setTransferWork(java.lang.String transferWork) {
        this.transferWork = transferWork;
    }


    /**
     * Gets the unixPermissions value for this FileInfo.
     * 
     * @return unixPermissions
     */
    public java.lang.String getUnixPermissions() {
        return unixPermissions;
    }


    /**
     * Sets the unixPermissions value for this FileInfo.
     * 
     * @param unixPermissions
     */
    public void setUnixPermissions(java.lang.String unixPermissions) {
        this.unixPermissions = unixPermissions;
    }


    /**
     * Gets the updatedBy value for this FileInfo.
     * 
     * @return updatedBy
     */
    public java.lang.String getUpdatedBy() {
        return updatedBy;
    }


    /**
     * Sets the updatedBy value for this FileInfo.
     * 
     * @param updatedBy
     */
    public void setUpdatedBy(java.lang.String updatedBy) {
        this.updatedBy = updatedBy;
    }


    /**
     * Gets the uploadRuleFileExtEnabled value for this FileInfo.
     * 
     * @return uploadRuleFileExtEnabled
     */
    public java.lang.String getUploadRuleFileExtEnabled() {
        return uploadRuleFileExtEnabled;
    }


    /**
     * Sets the uploadRuleFileExtEnabled value for this FileInfo.
     * 
     * @param uploadRuleFileExtEnabled
     */
    public void setUploadRuleFileExtEnabled(java.lang.String uploadRuleFileExtEnabled) {
        this.uploadRuleFileExtEnabled = uploadRuleFileExtEnabled;
    }


    /**
     * Gets the uploadRuleFileExts value for this FileInfo.
     * 
     * @return uploadRuleFileExts
     */
    public java.lang.String getUploadRuleFileExts() {
        return uploadRuleFileExts;
    }


    /**
     * Sets the uploadRuleFileExts value for this FileInfo.
     * 
     * @param uploadRuleFileExts
     */
    public void setUploadRuleFileExts(java.lang.String uploadRuleFileExts) {
        this.uploadRuleFileExts = uploadRuleFileExts;
    }


    /**
     * Gets the uploadView value for this FileInfo.
     * 
     * @return uploadView
     */
    public java.lang.String getUploadView() {
        return uploadView;
    }


    /**
     * Sets the uploadView value for this FileInfo.
     * 
     * @param uploadView
     */
    public void setUploadView(java.lang.String uploadView) {
        this.uploadView = uploadView;
    }


    /**
     * Gets the userData value for this FileInfo.
     * 
     * @return userData
     */
    public java.lang.String getUserData() {
        return userData;
    }


    /**
     * Sets the userData value for this FileInfo.
     * 
     * @param userData
     */
    public void setUserData(java.lang.String userData) {
        this.userData = userData;
    }


    /**
     * Gets the validDays value for this FileInfo.
     * 
     * @return validDays
     */
    public java.lang.String getValidDays() {
        return validDays;
    }


    /**
     * Sets the validDays value for this FileInfo.
     * 
     * @param validDays
     */
    public void setValidDays(java.lang.String validDays) {
        this.validDays = validDays;
    }


    /**
     * Gets the validEndTime value for this FileInfo.
     * 
     * @return validEndTime
     */
    public java.lang.String getValidEndTime() {
        return validEndTime;
    }


    /**
     * Sets the validEndTime value for this FileInfo.
     * 
     * @param validEndTime
     */
    public void setValidEndTime(java.lang.String validEndTime) {
        this.validEndTime = validEndTime;
    }


    /**
     * Gets the validStartTime value for this FileInfo.
     * 
     * @return validStartTime
     */
    public java.lang.String getValidStartTime() {
        return validStartTime;
    }


    /**
     * Sets the validStartTime value for this FileInfo.
     * 
     * @param validStartTime
     */
    public void setValidStartTime(java.lang.String validStartTime) {
        this.validStartTime = validStartTime;
    }


    /**
     * Gets the virusCheckFlag value for this FileInfo.
     * 
     * @return virusCheckFlag
     */
    public java.lang.String getVirusCheckFlag() {
        return virusCheckFlag;
    }


    /**
     * Sets the virusCheckFlag value for this FileInfo.
     * 
     * @param virusCheckFlag
     */
    public void setVirusCheckFlag(java.lang.String virusCheckFlag) {
        this.virusCheckFlag = virusCheckFlag;
    }


    /**
     * Gets the writeMode value for this FileInfo.
     * 
     * @return writeMode
     */
    public java.lang.String getWriteMode() {
        return writeMode;
    }


    /**
     * Sets the writeMode value for this FileInfo.
     * 
     * @param writeMode
     */
    public void setWriteMode(java.lang.String writeMode) {
        this.writeMode = writeMode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FileInfo)) return false;
        FileInfo other = (FileInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.CRLF==null && other.getCRLF()==null) || 
             (this.CRLF!=null &&
              this.CRLF.equals(other.getCRLF()))) &&
            ((this.FTPAlias==null && other.getFTPAlias()==null) || 
             (this.FTPAlias!=null &&
              this.FTPAlias.equals(other.getFTPAlias()))) &&
            ((this.FTPAllowClientTransMode==null && other.getFTPAllowClientTransMode()==null) || 
             (this.FTPAllowClientTransMode!=null &&
              this.FTPAllowClientTransMode.equals(other.getFTPAllowClientTransMode()))) &&
            ((this.FTPAllowCreateDir==null && other.getFTPAllowCreateDir()==null) || 
             (this.FTPAllowCreateDir!=null &&
              this.FTPAllowCreateDir.equals(other.getFTPAllowCreateDir()))) &&
            ((this.FTPAllowDelete==null && other.getFTPAllowDelete()==null) || 
             (this.FTPAllowDelete!=null &&
              this.FTPAllowDelete.equals(other.getFTPAllowDelete()))) &&
            ((this.FTPAllowRemoveDir==null && other.getFTPAllowRemoveDir()==null) || 
             (this.FTPAllowRemoveDir!=null &&
              this.FTPAllowRemoveDir.equals(other.getFTPAllowRemoveDir()))) &&
            ((this.FTPAllowRename==null && other.getFTPAllowRename()==null) || 
             (this.FTPAllowRename!=null &&
              this.FTPAllowRename.equals(other.getFTPAllowRename()))) &&
            ((this.FTPSiteCmdPassThrough==null && other.getFTPSiteCmdPassThrough()==null) || 
             (this.FTPSiteCmdPassThrough!=null &&
              this.FTPSiteCmdPassThrough.equals(other.getFTPSiteCmdPassThrough()))) &&
            ((this.ISServerName==null && other.getISServerName()==null) || 
             (this.ISServerName!=null &&
              this.ISServerName.equals(other.getISServerName()))) &&
            ((this.JMSMaxMsgSize==null && other.getJMSMaxMsgSize()==null) || 
             (this.JMSMaxMsgSize!=null &&
              this.JMSMaxMsgSize.equals(other.getJMSMaxMsgSize()))) &&
            ((this.JMSMessageID==null && other.getJMSMessageID()==null) || 
             (this.JMSMessageID!=null &&
              this.JMSMessageID.equals(other.getJMSMessageID()))) &&
            ((this.JMSNameOrFilePath==null && other.getJMSNameOrFilePath()==null) || 
             (this.JMSNameOrFilePath!=null &&
              this.JMSNameOrFilePath.equals(other.getJMSNameOrFilePath()))) &&
            ((this.JMSOrFile==null && other.getJMSOrFile()==null) || 
             (this.JMSOrFile!=null &&
              this.JMSOrFile.equals(other.getJMSOrFile()))) &&
            ((this.JMSProperty==null && other.getJMSProperty()==null) || 
             (this.JMSProperty!=null &&
              this.JMSProperty.equals(other.getJMSProperty()))) &&
            ((this.JMSSelector==null && other.getJMSSelector()==null) || 
             (this.JMSSelector!=null &&
              this.JMSSelector.equals(other.getJMSSelector()))) &&
            ((this.JMSTransferStatusCheck==null && other.getJMSTransferStatusCheck()==null) || 
             (this.JMSTransferStatusCheck!=null &&
              this.JMSTransferStatusCheck.equals(other.getJMSTransferStatusCheck()))) &&
            ((this.JMSTypeProperty==null && other.getJMSTypeProperty()==null) || 
             (this.JMSTypeProperty!=null &&
              this.JMSTypeProperty.equals(other.getJMSTypeProperty()))) &&
            ((this.JMSUserID==null && other.getJMSUserID()==null) || 
             (this.JMSUserID!=null &&
              this.JMSUserID.equals(other.getJMSUserID()))) &&
            ((this.JMSUserPwd==null && other.getJMSUserPwd()==null) || 
             (this.JMSUserPwd!=null &&
              this.JMSUserPwd.equals(other.getJMSUserPwd()))) &&
            ((this.JPAFullLocalFileName==null && other.getJPAFullLocalFileName()==null) || 
             (this.JPAFullLocalFileName!=null &&
              this.JPAFullLocalFileName.equals(other.getJPAFullLocalFileName()))) &&
            ((this.JPAFullRemoteFileName==null && other.getJPAFullRemoteFileName()==null) || 
             (this.JPAFullRemoteFileName!=null &&
              this.JPAFullRemoteFileName.equals(other.getJPAFullRemoteFileName()))) &&
            ((this.JPALocalTransactionNumber==null && other.getJPALocalTransactionNumber()==null) || 
             (this.JPALocalTransactionNumber!=null &&
              this.JPALocalTransactionNumber.equals(other.getJPALocalTransactionNumber()))) &&
            ((this.JPALocalUserId==null && other.getJPALocalUserId()==null) || 
             (this.JPALocalUserId!=null &&
              this.JPALocalUserId.equals(other.getJPALocalUserId()))) &&
            ((this.JPARemoteTransactionNumber==null && other.getJPARemoteTransactionNumber()==null) || 
             (this.JPARemoteTransactionNumber!=null &&
              this.JPARemoteTransactionNumber.equals(other.getJPARemoteTransactionNumber()))) &&
            ((this.JPARemoteUsrId==null && other.getJPARemoteUsrId()==null) || 
             (this.JPARemoteUsrId!=null &&
              this.JPARemoteUsrId.equals(other.getJPARemoteUsrId()))) &&
            ((this.LRECL==null && other.getLRECL()==null) || 
             (this.LRECL!=null &&
              this.LRECL.equals(other.getLRECL()))) &&
            ((this.OS390AllocPri==null && other.getOS390AllocPri()==null) || 
             (this.OS390AllocPri!=null &&
              this.OS390AllocPri.equals(other.getOS390AllocPri()))) &&
            ((this.OS390AllocSec==null && other.getOS390AllocSec()==null) || 
             (this.OS390AllocSec!=null &&
              this.OS390AllocSec.equals(other.getOS390AllocSec()))) &&
            ((this.OS390AllocType==null && other.getOS390AllocType()==null) || 
             (this.OS390AllocType!=null &&
              this.OS390AllocType.equals(other.getOS390AllocType()))) &&
            ((this.OS390BlockSize==null && other.getOS390BlockSize()==null) || 
             (this.OS390BlockSize!=null &&
              this.OS390BlockSize.equals(other.getOS390BlockSize()))) &&
            ((this.OS390DataClass==null && other.getOS390DataClass()==null) || 
             (this.OS390DataClass!=null &&
              this.OS390DataClass.equals(other.getOS390DataClass()))) &&
            ((this.OS390MgtClass==null && other.getOS390MgtClass()==null) || 
             (this.OS390MgtClass!=null &&
              this.OS390MgtClass.equals(other.getOS390MgtClass()))) &&
            ((this.OS390StorClass==null && other.getOS390StorClass()==null) || 
             (this.OS390StorClass!=null &&
              this.OS390StorClass.equals(other.getOS390StorClass()))) &&
            ((this.OS390Unit==null && other.getOS390Unit()==null) || 
             (this.OS390Unit!=null &&
              this.OS390Unit.equals(other.getOS390Unit()))) &&
            ((this.OS390Volume==null && other.getOS390Volume()==null) || 
             (this.OS390Volume!=null &&
              this.OS390Volume.equals(other.getOS390Volume()))) &&
            ((this.PGPArmorFile==null && other.getPGPArmorFile()==null) || 
             (this.PGPArmorFile!=null &&
              this.PGPArmorFile.equals(other.getPGPArmorFile()))) &&
            ((this.PGPCompressAlg==null && other.getPGPCompressAlg()==null) || 
             (this.PGPCompressAlg!=null &&
              this.PGPCompressAlg.equals(other.getPGPCompressAlg()))) &&
            ((this.PGPDecryptFile==null && other.getPGPDecryptFile()==null) || 
             (this.PGPDecryptFile!=null &&
              this.PGPDecryptFile.equals(other.getPGPDecryptFile()))) &&
            ((this.PGPEncryptAlg==null && other.getPGPEncryptAlg()==null) || 
             (this.PGPEncryptAlg!=null &&
              this.PGPEncryptAlg.equals(other.getPGPEncryptAlg()))) &&
            ((this.PGPEncryptFile==null && other.getPGPEncryptFile()==null) || 
             (this.PGPEncryptFile!=null &&
              this.PGPEncryptFile.equals(other.getPGPEncryptFile()))) &&
            ((this.PGPHashingAlg==null && other.getPGPHashingAlg()==null) || 
             (this.PGPHashingAlg!=null &&
              this.PGPHashingAlg.equals(other.getPGPHashingAlg()))) &&
            ((this.PGPPrivateKey==null && other.getPGPPrivateKey()==null) || 
             (this.PGPPrivateKey!=null &&
              this.PGPPrivateKey.equals(other.getPGPPrivateKey()))) &&
            ((this.PGPSignFile==null && other.getPGPSignFile()==null) || 
             (this.PGPSignFile!=null &&
              this.PGPSignFile.equals(other.getPGPSignFile()))) &&
            ((this.PGPStrictVerifySign==null && other.getPGPStrictVerifySign()==null) || 
             (this.PGPStrictVerifySign!=null &&
              this.PGPStrictVerifySign.equals(other.getPGPStrictVerifySign()))) &&
            ((this.PGPTextMode==null && other.getPGPTextMode()==null) || 
             (this.PGPTextMode!=null &&
              this.PGPTextMode.equals(other.getPGPTextMode()))) &&
            ((this.PGPVerifySign==null && other.getPGPVerifySign()==null) || 
             (this.PGPVerifySign!=null &&
              this.PGPVerifySign.equals(other.getPGPVerifySign()))) &&
            ((this.RECFM==null && other.getRECFM()==null) || 
             (this.RECFM!=null &&
              this.RECFM.equals(other.getRECFM()))) &&
            ((this.SSHPrivKey==null && other.getSSHPrivKey()==null) || 
             (this.SSHPrivKey!=null &&
              this.SSHPrivKey.equals(other.getSSHPrivKey()))) &&
            ((this.allowableProtocol==null && other.getAllowableProtocol()==null) || 
             (this.allowableProtocol!=null &&
              this.allowableProtocol.equals(other.getAllowableProtocol()))) &&
            ((this.auditId==null && other.getAuditId()==null) || 
             (this.auditId!=null &&
              this.auditId.equals(other.getAuditId()))) &&
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
            ((this.chkptCount==null && other.getChkptCount()==null) || 
             (this.chkptCount!=null &&
              this.chkptCount.equals(other.getChkptCount()))) &&
            ((this.chkptInterval==null && other.getChkptInterval()==null) || 
             (this.chkptInterval!=null &&
              this.chkptInterval.equals(other.getChkptInterval()))) &&
            ((this.chkptRestartFlag==null && other.getChkptRestartFlag()==null) || 
             (this.chkptRestartFlag!=null &&
              this.chkptRestartFlag.equals(other.getChkptRestartFlag()))) &&
            ((this.chkptTryMaxCount==null && other.getChkptTryMaxCount()==null) || 
             (this.chkptTryMaxCount!=null &&
              this.chkptTryMaxCount.equals(other.getChkptTryMaxCount()))) &&
            ((this.clientCompressFlag==null && other.getClientCompressFlag()==null) || 
             (this.clientCompressFlag!=null &&
              this.clientCompressFlag.equals(other.getClientCompressFlag()))) &&
            ((this.clientFileName==null && other.getClientFileName()==null) || 
             (this.clientFileName!=null &&
              this.clientFileName.equals(other.getClientFileName()))) &&
            ((this.conversionFlag==null && other.getConversionFlag()==null) || 
             (this.conversionFlag!=null &&
              this.conversionFlag.equals(other.getConversionFlag()))) &&
            ((this.createdBy==null && other.getCreatedBy()==null) || 
             (this.createdBy!=null &&
              this.createdBy.equals(other.getCreatedBy()))) &&
            ((this.credPassThruFlag==null && other.getCredPassThruFlag()==null) || 
             (this.credPassThruFlag!=null &&
              this.credPassThruFlag.equals(other.getCredPassThruFlag()))) &&
            ((this.dataType==null && other.getDataType()==null) || 
             (this.dataType!=null &&
              this.dataType.equals(other.getDataType()))) &&
            ((this.dateCreated==null && other.getDateCreated()==null) || 
             (this.dateCreated!=null &&
              this.dateCreated.equals(other.getDateCreated()))) &&
            ((this.dateLastProcessed==null && other.getDateLastProcessed()==null) || 
             (this.dateLastProcessed!=null &&
              this.dateLastProcessed.equals(other.getDateLastProcessed()))) &&
            ((this.dateUpdated==null && other.getDateUpdated()==null) || 
             (this.dateUpdated!=null &&
              this.dateUpdated.equals(other.getDateUpdated()))) &&
            ((this.defaultNTDomain==null && other.getDefaultNTDomain()==null) || 
             (this.defaultNTDomain!=null &&
              this.defaultNTDomain.equals(other.getDefaultNTDomain()))) &&
            ((this.defaultNodePwd==null && other.getDefaultNodePwd()==null) || 
             (this.defaultNodePwd!=null &&
              this.defaultNodePwd.equals(other.getDefaultNodePwd()))) &&
            ((this.defaultNodeUserId==null && other.getDefaultNodeUserId()==null) || 
             (this.defaultNodeUserId!=null &&
              this.defaultNodeUserId.equals(other.getDefaultNodeUserId()))) &&
            ((this.department==null && other.getDepartment()==null) || 
             (this.department!=null &&
              this.department.equals(other.getDepartment()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.directoryFileList==null && other.getDirectoryFileList()==null) || 
             (this.directoryFileList!=null &&
              java.util.Arrays.equals(this.directoryFileList, other.getDirectoryFileList()))) &&
            ((this.directoryTransfer==null && other.getDirectoryTransfer()==null) || 
             (this.directoryTransfer!=null &&
              this.directoryTransfer.equals(other.getDirectoryTransfer()))) &&
            ((this.disableFlag==null && other.getDisableFlag()==null) || 
             (this.disableFlag!=null &&
              this.disableFlag.equals(other.getDisableFlag()))) &&
            ((this.downloadRuleFileExtEnabled==null && other.getDownloadRuleFileExtEnabled()==null) || 
             (this.downloadRuleFileExtEnabled!=null &&
              this.downloadRuleFileExtEnabled.equals(other.getDownloadRuleFileExtEnabled()))) &&
            ((this.downloadRuleFileExts==null && other.getDownloadRuleFileExts()==null) || 
             (this.downloadRuleFileExts!=null &&
              this.downloadRuleFileExts.equals(other.getDownloadRuleFileExts()))) &&
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
            ((this.encryptFlag==null && other.getEncryptFlag()==null) || 
             (this.encryptFlag!=null &&
              this.encryptFlag.equals(other.getEncryptFlag()))) &&
            ((this.expirationDate==null && other.getExpirationDate()==null) || 
             (this.expirationDate!=null &&
              this.expirationDate.equals(other.getExpirationDate()))) &&
            ((this.fileOption==null && other.getFileOption()==null) || 
             (this.fileOption!=null &&
              this.fileOption.equals(other.getFileOption()))) &&
            ((this.httpBackendUploadFormPara==null && other.getHttpBackendUploadFormPara()==null) || 
             (this.httpBackendUploadFormPara!=null &&
              this.httpBackendUploadFormPara.equals(other.getHttpBackendUploadFormPara()))) &&
            ((this.httpBackendUploadFormat==null && other.getHttpBackendUploadFormat()==null) || 
             (this.httpBackendUploadFormat!=null &&
              this.httpBackendUploadFormat.equals(other.getHttpBackendUploadFormat()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.keyFlag==null && other.getKeyFlag()==null) || 
             (this.keyFlag!=null &&
              this.keyFlag.equals(other.getKeyFlag()))) &&
            ((this.lastReturnCode==null && other.getLastReturnCode()==null) || 
             (this.lastReturnCode!=null &&
              this.lastReturnCode.equals(other.getLastReturnCode()))) &&
            ((this.localTransactionId==null && other.getLocalTransactionId()==null) || 
             (this.localTransactionId!=null &&
              this.localTransactionId.equals(other.getLocalTransactionId()))) &&
            ((this.localTranslationTable==null && other.getLocalTranslationTable()==null) || 
             (this.localTranslationTable!=null &&
              this.localTranslationTable.equals(other.getLocalTranslationTable()))) &&
            ((this.nodeName==null && other.getNodeName()==null) || 
             (this.nodeName!=null &&
              this.nodeName.equals(other.getNodeName()))) &&
            ((this.notifyEmailTemplate==null && other.getNotifyEmailTemplate()==null) || 
             (this.notifyEmailTemplate!=null &&
              this.notifyEmailTemplate.equals(other.getNotifyEmailTemplate()))) &&
            ((this.notifyFlag==null && other.getNotifyFlag()==null) || 
             (this.notifyFlag!=null &&
              this.notifyFlag.equals(other.getNotifyFlag()))) &&
            ((this.oneTimeFlag==null && other.getOneTimeFlag()==null) || 
             (this.oneTimeFlag!=null &&
              this.oneTimeFlag.equals(other.getOneTimeFlag()))) &&
            ((this.postActionData1==null && other.getPostActionData1()==null) || 
             (this.postActionData1!=null &&
              this.postActionData1.equals(other.getPostActionData1()))) &&
            ((this.postActionData2==null && other.getPostActionData2()==null) || 
             (this.postActionData2!=null &&
              this.postActionData2.equals(other.getPostActionData2()))) &&
            ((this.postActionData3==null && other.getPostActionData3()==null) || 
             (this.postActionData3!=null &&
              this.postActionData3.equals(other.getPostActionData3()))) &&
            ((this.postActionData4==null && other.getPostActionData4()==null) || 
             (this.postActionData4!=null &&
              this.postActionData4.equals(other.getPostActionData4()))) &&
            ((this.postActionFlag1==null && other.getPostActionFlag1()==null) || 
             (this.postActionFlag1!=null &&
              this.postActionFlag1.equals(other.getPostActionFlag1()))) &&
            ((this.postActionFlag2==null && other.getPostActionFlag2()==null) || 
             (this.postActionFlag2!=null &&
              this.postActionFlag2.equals(other.getPostActionFlag2()))) &&
            ((this.postActionFlag3==null && other.getPostActionFlag3()==null) || 
             (this.postActionFlag3!=null &&
              this.postActionFlag3.equals(other.getPostActionFlag3()))) &&
            ((this.postActionFlag4==null && other.getPostActionFlag4()==null) || 
             (this.postActionFlag4!=null &&
              this.postActionFlag4.equals(other.getPostActionFlag4()))) &&
            ((this.postActionType1==null && other.getPostActionType1()==null) || 
             (this.postActionType1!=null &&
              this.postActionType1.equals(other.getPostActionType1()))) &&
            ((this.postActionType2==null && other.getPostActionType2()==null) || 
             (this.postActionType2!=null &&
              this.postActionType2.equals(other.getPostActionType2()))) &&
            ((this.postActionType3==null && other.getPostActionType3()==null) || 
             (this.postActionType3!=null &&
              this.postActionType3.equals(other.getPostActionType3()))) &&
            ((this.postActionType4==null && other.getPostActionType4()==null) || 
             (this.postActionType4!=null &&
              this.postActionType4.equals(other.getPostActionType4()))) &&
            ((this.processName==null && other.getProcessName()==null) || 
             (this.processName!=null &&
              this.processName.equals(other.getProcessName()))) &&
            ((this.remoteTranslationTable==null && other.getRemoteTranslationTable()==null) || 
             (this.remoteTranslationTable!=null &&
              this.remoteTranslationTable.equals(other.getRemoteTranslationTable()))) &&
            ((this.requestID==null && other.getRequestID()==null) || 
             (this.requestID!=null &&
              this.requestID.equals(other.getRequestID()))) &&
            ((this.restartAvailable==null && other.getRestartAvailable()==null) || 
             (this.restartAvailable!=null &&
              this.restartAvailable.equals(other.getRestartAvailable()))) &&
            ((this.sendRecvFlag==null && other.getSendRecvFlag()==null) || 
             (this.sendRecvFlag!=null &&
              this.sendRecvFlag.equals(other.getSendRecvFlag()))) &&
            ((this.serverFileName==null && other.getServerFileName()==null) || 
             (this.serverFileName!=null &&
              this.serverFileName.equals(other.getServerFileName()))) &&
            ((this.toEmailAddrFailure==null && other.getToEmailAddrFailure()==null) || 
             (this.toEmailAddrFailure!=null &&
              this.toEmailAddrFailure.equals(other.getToEmailAddrFailure()))) &&
            ((this.toEmailAddrSuccess==null && other.getToEmailAddrSuccess()==null) || 
             (this.toEmailAddrSuccess!=null &&
              this.toEmailAddrSuccess.equals(other.getToEmailAddrSuccess()))) &&
            ((this.tokenData==null && other.getTokenData()==null) || 
             (this.tokenData!=null &&
              this.tokenData.equals(other.getTokenData()))) &&
            ((this.tokenDateSet==null && other.getTokenDateSet()==null) || 
             (this.tokenDateSet!=null &&
              this.tokenDateSet.equals(other.getTokenDateSet()))) &&
            ((this.tokenFlag==null && other.getTokenFlag()==null) || 
             (this.tokenFlag!=null &&
              this.tokenFlag.equals(other.getTokenFlag()))) &&
            ((this.traceFlag==null && other.getTraceFlag()==null) || 
             (this.traceFlag!=null &&
              this.traceFlag.equals(other.getTraceFlag()))) &&
            ((this.transferCompletionFlag==null && other.getTransferCompletionFlag()==null) || 
             (this.transferCompletionFlag!=null &&
              this.transferCompletionFlag.equals(other.getTransferCompletionFlag()))) &&
            ((this.transferID==null && other.getTransferID()==null) || 
             (this.transferID!=null &&
              this.transferID.equals(other.getTransferID()))) &&
            ((this.transferWork==null && other.getTransferWork()==null) || 
             (this.transferWork!=null &&
              this.transferWork.equals(other.getTransferWork()))) &&
            ((this.unixPermissions==null && other.getUnixPermissions()==null) || 
             (this.unixPermissions!=null &&
              this.unixPermissions.equals(other.getUnixPermissions()))) &&
            ((this.updatedBy==null && other.getUpdatedBy()==null) || 
             (this.updatedBy!=null &&
              this.updatedBy.equals(other.getUpdatedBy()))) &&
            ((this.uploadRuleFileExtEnabled==null && other.getUploadRuleFileExtEnabled()==null) || 
             (this.uploadRuleFileExtEnabled!=null &&
              this.uploadRuleFileExtEnabled.equals(other.getUploadRuleFileExtEnabled()))) &&
            ((this.uploadRuleFileExts==null && other.getUploadRuleFileExts()==null) || 
             (this.uploadRuleFileExts!=null &&
              this.uploadRuleFileExts.equals(other.getUploadRuleFileExts()))) &&
            ((this.uploadView==null && other.getUploadView()==null) || 
             (this.uploadView!=null &&
              this.uploadView.equals(other.getUploadView()))) &&
            ((this.userData==null && other.getUserData()==null) || 
             (this.userData!=null &&
              this.userData.equals(other.getUserData()))) &&
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
              this.virusCheckFlag.equals(other.getVirusCheckFlag()))) &&
            ((this.writeMode==null && other.getWriteMode()==null) || 
             (this.writeMode!=null &&
              this.writeMode.equals(other.getWriteMode())));
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
        if (getCRLF() != null) {
            _hashCode += getCRLF().hashCode();
        }
        if (getFTPAlias() != null) {
            _hashCode += getFTPAlias().hashCode();
        }
        if (getFTPAllowClientTransMode() != null) {
            _hashCode += getFTPAllowClientTransMode().hashCode();
        }
        if (getFTPAllowCreateDir() != null) {
            _hashCode += getFTPAllowCreateDir().hashCode();
        }
        if (getFTPAllowDelete() != null) {
            _hashCode += getFTPAllowDelete().hashCode();
        }
        if (getFTPAllowRemoveDir() != null) {
            _hashCode += getFTPAllowRemoveDir().hashCode();
        }
        if (getFTPAllowRename() != null) {
            _hashCode += getFTPAllowRename().hashCode();
        }
        if (getFTPSiteCmdPassThrough() != null) {
            _hashCode += getFTPSiteCmdPassThrough().hashCode();
        }
        if (getISServerName() != null) {
            _hashCode += getISServerName().hashCode();
        }
        if (getJMSMaxMsgSize() != null) {
            _hashCode += getJMSMaxMsgSize().hashCode();
        }
        if (getJMSMessageID() != null) {
            _hashCode += getJMSMessageID().hashCode();
        }
        if (getJMSNameOrFilePath() != null) {
            _hashCode += getJMSNameOrFilePath().hashCode();
        }
        if (getJMSOrFile() != null) {
            _hashCode += getJMSOrFile().hashCode();
        }
        if (getJMSProperty() != null) {
            _hashCode += getJMSProperty().hashCode();
        }
        if (getJMSSelector() != null) {
            _hashCode += getJMSSelector().hashCode();
        }
        if (getJMSTransferStatusCheck() != null) {
            _hashCode += getJMSTransferStatusCheck().hashCode();
        }
        if (getJMSTypeProperty() != null) {
            _hashCode += getJMSTypeProperty().hashCode();
        }
        if (getJMSUserID() != null) {
            _hashCode += getJMSUserID().hashCode();
        }
        if (getJMSUserPwd() != null) {
            _hashCode += getJMSUserPwd().hashCode();
        }
        if (getJPAFullLocalFileName() != null) {
            _hashCode += getJPAFullLocalFileName().hashCode();
        }
        if (getJPAFullRemoteFileName() != null) {
            _hashCode += getJPAFullRemoteFileName().hashCode();
        }
        if (getJPALocalTransactionNumber() != null) {
            _hashCode += getJPALocalTransactionNumber().hashCode();
        }
        if (getJPALocalUserId() != null) {
            _hashCode += getJPALocalUserId().hashCode();
        }
        if (getJPARemoteTransactionNumber() != null) {
            _hashCode += getJPARemoteTransactionNumber().hashCode();
        }
        if (getJPARemoteUsrId() != null) {
            _hashCode += getJPARemoteUsrId().hashCode();
        }
        if (getLRECL() != null) {
            _hashCode += getLRECL().hashCode();
        }
        if (getOS390AllocPri() != null) {
            _hashCode += getOS390AllocPri().hashCode();
        }
        if (getOS390AllocSec() != null) {
            _hashCode += getOS390AllocSec().hashCode();
        }
        if (getOS390AllocType() != null) {
            _hashCode += getOS390AllocType().hashCode();
        }
        if (getOS390BlockSize() != null) {
            _hashCode += getOS390BlockSize().hashCode();
        }
        if (getOS390DataClass() != null) {
            _hashCode += getOS390DataClass().hashCode();
        }
        if (getOS390MgtClass() != null) {
            _hashCode += getOS390MgtClass().hashCode();
        }
        if (getOS390StorClass() != null) {
            _hashCode += getOS390StorClass().hashCode();
        }
        if (getOS390Unit() != null) {
            _hashCode += getOS390Unit().hashCode();
        }
        if (getOS390Volume() != null) {
            _hashCode += getOS390Volume().hashCode();
        }
        if (getPGPArmorFile() != null) {
            _hashCode += getPGPArmorFile().hashCode();
        }
        if (getPGPCompressAlg() != null) {
            _hashCode += getPGPCompressAlg().hashCode();
        }
        if (getPGPDecryptFile() != null) {
            _hashCode += getPGPDecryptFile().hashCode();
        }
        if (getPGPEncryptAlg() != null) {
            _hashCode += getPGPEncryptAlg().hashCode();
        }
        if (getPGPEncryptFile() != null) {
            _hashCode += getPGPEncryptFile().hashCode();
        }
        if (getPGPHashingAlg() != null) {
            _hashCode += getPGPHashingAlg().hashCode();
        }
        if (getPGPPrivateKey() != null) {
            _hashCode += getPGPPrivateKey().hashCode();
        }
        if (getPGPSignFile() != null) {
            _hashCode += getPGPSignFile().hashCode();
        }
        if (getPGPStrictVerifySign() != null) {
            _hashCode += getPGPStrictVerifySign().hashCode();
        }
        if (getPGPTextMode() != null) {
            _hashCode += getPGPTextMode().hashCode();
        }
        if (getPGPVerifySign() != null) {
            _hashCode += getPGPVerifySign().hashCode();
        }
        if (getRECFM() != null) {
            _hashCode += getRECFM().hashCode();
        }
        if (getSSHPrivKey() != null) {
            _hashCode += getSSHPrivKey().hashCode();
        }
        if (getAllowableProtocol() != null) {
            _hashCode += getAllowableProtocol().hashCode();
        }
        if (getAuditId() != null) {
            _hashCode += getAuditId().hashCode();
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
        if (getChkptCount() != null) {
            _hashCode += getChkptCount().hashCode();
        }
        if (getChkptInterval() != null) {
            _hashCode += getChkptInterval().hashCode();
        }
        if (getChkptRestartFlag() != null) {
            _hashCode += getChkptRestartFlag().hashCode();
        }
        if (getChkptTryMaxCount() != null) {
            _hashCode += getChkptTryMaxCount().hashCode();
        }
        if (getClientCompressFlag() != null) {
            _hashCode += getClientCompressFlag().hashCode();
        }
        if (getClientFileName() != null) {
            _hashCode += getClientFileName().hashCode();
        }
        if (getConversionFlag() != null) {
            _hashCode += getConversionFlag().hashCode();
        }
        if (getCreatedBy() != null) {
            _hashCode += getCreatedBy().hashCode();
        }
        if (getCredPassThruFlag() != null) {
            _hashCode += getCredPassThruFlag().hashCode();
        }
        if (getDataType() != null) {
            _hashCode += getDataType().hashCode();
        }
        if (getDateCreated() != null) {
            _hashCode += getDateCreated().hashCode();
        }
        if (getDateLastProcessed() != null) {
            _hashCode += getDateLastProcessed().hashCode();
        }
        if (getDateUpdated() != null) {
            _hashCode += getDateUpdated().hashCode();
        }
        if (getDefaultNTDomain() != null) {
            _hashCode += getDefaultNTDomain().hashCode();
        }
        if (getDefaultNodePwd() != null) {
            _hashCode += getDefaultNodePwd().hashCode();
        }
        if (getDefaultNodeUserId() != null) {
            _hashCode += getDefaultNodeUserId().hashCode();
        }
        if (getDepartment() != null) {
            _hashCode += getDepartment().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getDirectoryFileList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDirectoryFileList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDirectoryFileList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDirectoryTransfer() != null) {
            _hashCode += getDirectoryTransfer().hashCode();
        }
        if (getDisableFlag() != null) {
            _hashCode += getDisableFlag().hashCode();
        }
        if (getDownloadRuleFileExtEnabled() != null) {
            _hashCode += getDownloadRuleFileExtEnabled().hashCode();
        }
        if (getDownloadRuleFileExts() != null) {
            _hashCode += getDownloadRuleFileExts().hashCode();
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
        if (getEncryptFlag() != null) {
            _hashCode += getEncryptFlag().hashCode();
        }
        if (getExpirationDate() != null) {
            _hashCode += getExpirationDate().hashCode();
        }
        if (getFileOption() != null) {
            _hashCode += getFileOption().hashCode();
        }
        if (getHttpBackendUploadFormPara() != null) {
            _hashCode += getHttpBackendUploadFormPara().hashCode();
        }
        if (getHttpBackendUploadFormat() != null) {
            _hashCode += getHttpBackendUploadFormat().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getKeyFlag() != null) {
            _hashCode += getKeyFlag().hashCode();
        }
        if (getLastReturnCode() != null) {
            _hashCode += getLastReturnCode().hashCode();
        }
        if (getLocalTransactionId() != null) {
            _hashCode += getLocalTransactionId().hashCode();
        }
        if (getLocalTranslationTable() != null) {
            _hashCode += getLocalTranslationTable().hashCode();
        }
        if (getNodeName() != null) {
            _hashCode += getNodeName().hashCode();
        }
        if (getNotifyEmailTemplate() != null) {
            _hashCode += getNotifyEmailTemplate().hashCode();
        }
        if (getNotifyFlag() != null) {
            _hashCode += getNotifyFlag().hashCode();
        }
        if (getOneTimeFlag() != null) {
            _hashCode += getOneTimeFlag().hashCode();
        }
        if (getPostActionData1() != null) {
            _hashCode += getPostActionData1().hashCode();
        }
        if (getPostActionData2() != null) {
            _hashCode += getPostActionData2().hashCode();
        }
        if (getPostActionData3() != null) {
            _hashCode += getPostActionData3().hashCode();
        }
        if (getPostActionData4() != null) {
            _hashCode += getPostActionData4().hashCode();
        }
        if (getPostActionFlag1() != null) {
            _hashCode += getPostActionFlag1().hashCode();
        }
        if (getPostActionFlag2() != null) {
            _hashCode += getPostActionFlag2().hashCode();
        }
        if (getPostActionFlag3() != null) {
            _hashCode += getPostActionFlag3().hashCode();
        }
        if (getPostActionFlag4() != null) {
            _hashCode += getPostActionFlag4().hashCode();
        }
        if (getPostActionType1() != null) {
            _hashCode += getPostActionType1().hashCode();
        }
        if (getPostActionType2() != null) {
            _hashCode += getPostActionType2().hashCode();
        }
        if (getPostActionType3() != null) {
            _hashCode += getPostActionType3().hashCode();
        }
        if (getPostActionType4() != null) {
            _hashCode += getPostActionType4().hashCode();
        }
        if (getProcessName() != null) {
            _hashCode += getProcessName().hashCode();
        }
        if (getRemoteTranslationTable() != null) {
            _hashCode += getRemoteTranslationTable().hashCode();
        }
        if (getRequestID() != null) {
            _hashCode += getRequestID().hashCode();
        }
        if (getRestartAvailable() != null) {
            _hashCode += getRestartAvailable().hashCode();
        }
        if (getSendRecvFlag() != null) {
            _hashCode += getSendRecvFlag().hashCode();
        }
        if (getServerFileName() != null) {
            _hashCode += getServerFileName().hashCode();
        }
        if (getToEmailAddrFailure() != null) {
            _hashCode += getToEmailAddrFailure().hashCode();
        }
        if (getToEmailAddrSuccess() != null) {
            _hashCode += getToEmailAddrSuccess().hashCode();
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
        if (getTraceFlag() != null) {
            _hashCode += getTraceFlag().hashCode();
        }
        if (getTransferCompletionFlag() != null) {
            _hashCode += getTransferCompletionFlag().hashCode();
        }
        if (getTransferID() != null) {
            _hashCode += getTransferID().hashCode();
        }
        if (getTransferWork() != null) {
            _hashCode += getTransferWork().hashCode();
        }
        if (getUnixPermissions() != null) {
            _hashCode += getUnixPermissions().hashCode();
        }
        if (getUpdatedBy() != null) {
            _hashCode += getUpdatedBy().hashCode();
        }
        if (getUploadRuleFileExtEnabled() != null) {
            _hashCode += getUploadRuleFileExtEnabled().hashCode();
        }
        if (getUploadRuleFileExts() != null) {
            _hashCode += getUploadRuleFileExts().hashCode();
        }
        if (getUploadView() != null) {
            _hashCode += getUploadView().hashCode();
        }
        if (getUserData() != null) {
            _hashCode += getUserData().hashCode();
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
        if (getWriteMode() != null) {
            _hashCode += getWriteMode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FileInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:AdministratorService", "FileInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CRLF");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CRLF"));
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
        elemField.setFieldName("FTPAllowClientTransMode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FTPAllowClientTransMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FTPAllowCreateDir");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FTPAllowCreateDir"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FTPAllowDelete");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FTPAllowDelete"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FTPAllowRemoveDir");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FTPAllowRemoveDir"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FTPAllowRename");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FTPAllowRename"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FTPSiteCmdPassThrough");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FTPSiteCmdPassThrough"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ISServerName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ISServerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("JMSMaxMsgSize");
        elemField.setXmlName(new javax.xml.namespace.QName("", "JMSMaxMsgSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("JMSMessageID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "JMSMessageID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("JMSNameOrFilePath");
        elemField.setXmlName(new javax.xml.namespace.QName("", "JMSNameOrFilePath"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("JMSOrFile");
        elemField.setXmlName(new javax.xml.namespace.QName("", "JMSOrFile"));
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
        elemField.setFieldName("JMSTransferStatusCheck");
        elemField.setXmlName(new javax.xml.namespace.QName("", "JMSTransferStatusCheck"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("JMSTypeProperty");
        elemField.setXmlName(new javax.xml.namespace.QName("", "JMSTypeProperty"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("JMSUserID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "JMSUserID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("JMSUserPwd");
        elemField.setXmlName(new javax.xml.namespace.QName("", "JMSUserPwd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("JPAFullLocalFileName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "JPAFullLocalFileName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("JPAFullRemoteFileName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "JPAFullRemoteFileName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("JPALocalTransactionNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "JPALocalTransactionNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("JPALocalUserId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "JPALocalUserId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("JPARemoteTransactionNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "JPARemoteTransactionNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("JPARemoteUsrId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "JPARemoteUsrId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LRECL");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LRECL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("OS390AllocPri");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OS390AllocPri"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("OS390AllocSec");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OS390AllocSec"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("OS390AllocType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OS390AllocType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("OS390BlockSize");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OS390BlockSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("OS390DataClass");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OS390DataClass"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("OS390MgtClass");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OS390MgtClass"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("OS390StorClass");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OS390StorClass"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("OS390Unit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OS390Unit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("OS390Volume");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OS390Volume"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PGPArmorFile");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PGPArmorFile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PGPCompressAlg");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PGPCompressAlg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PGPDecryptFile");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PGPDecryptFile"));
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
        elemField.setFieldName("PGPEncryptFile");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PGPEncryptFile"));
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
        elemField.setFieldName("PGPPrivateKey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PGPPrivateKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PGPSignFile");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PGPSignFile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PGPStrictVerifySign");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PGPStrictVerifySign"));
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
        elemField.setFieldName("PGPVerifySign");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PGPVerifySign"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RECFM");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RECFM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SSHPrivKey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SSHPrivKey"));
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
        elemField.setFieldName("auditId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "auditId"));
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
        elemField.setFieldName("chkptCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "chkptCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chkptInterval");
        elemField.setXmlName(new javax.xml.namespace.QName("", "chkptInterval"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chkptRestartFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "chkptRestartFlag"));
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
        elemField.setFieldName("clientCompressFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "clientCompressFlag"));
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
        elemField.setFieldName("conversionFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "conversionFlag"));
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
        elemField.setFieldName("credPassThruFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "credPassThruFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateCreated");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dateCreated"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:AdministratorService", "DateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateLastProcessed");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dateLastProcessed"));
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
        elemField.setFieldName("defaultNTDomain");
        elemField.setXmlName(new javax.xml.namespace.QName("", "defaultNTDomain"));
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
        elemField.setFieldName("directoryFileList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "directoryFileList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dbaccess.sift.proginet.com", "DirectoryElementList"));
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
        elemField.setFieldName("downloadRuleFileExtEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("", "downloadRuleFileExtEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("downloadRuleFileExts");
        elemField.setXmlName(new javax.xml.namespace.QName("", "downloadRuleFileExts"));
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
        elemField.setFieldName("encryptFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "encryptFlag"));
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
        elemField.setFieldName("fileOption");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fileOption"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("httpBackendUploadFormPara");
        elemField.setXmlName(new javax.xml.namespace.QName("", "httpBackendUploadFormPara"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("httpBackendUploadFormat");
        elemField.setXmlName(new javax.xml.namespace.QName("", "httpBackendUploadFormat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keyFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "keyFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastReturnCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lastReturnCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localTransactionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "localTransactionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localTranslationTable");
        elemField.setXmlName(new javax.xml.namespace.QName("", "localTranslationTable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nodeName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nodeName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notifyEmailTemplate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "notifyEmailTemplate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notifyFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "notifyFlag"));
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
        elemField.setFieldName("postActionData1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "postActionData1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postActionData2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "postActionData2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postActionData3");
        elemField.setXmlName(new javax.xml.namespace.QName("", "postActionData3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postActionData4");
        elemField.setXmlName(new javax.xml.namespace.QName("", "postActionData4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postActionFlag1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "postActionFlag1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postActionFlag2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "postActionFlag2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postActionFlag3");
        elemField.setXmlName(new javax.xml.namespace.QName("", "postActionFlag3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postActionFlag4");
        elemField.setXmlName(new javax.xml.namespace.QName("", "postActionFlag4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postActionType1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "postActionType1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postActionType2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "postActionType2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postActionType3");
        elemField.setXmlName(new javax.xml.namespace.QName("", "postActionType3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postActionType4");
        elemField.setXmlName(new javax.xml.namespace.QName("", "postActionType4"));
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
        elemField.setFieldName("remoteTranslationTable");
        elemField.setXmlName(new javax.xml.namespace.QName("", "remoteTranslationTable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "requestID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("restartAvailable");
        elemField.setXmlName(new javax.xml.namespace.QName("", "restartAvailable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sendRecvFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sendRecvFlag"));
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
        elemField.setFieldName("toEmailAddrFailure");
        elemField.setXmlName(new javax.xml.namespace.QName("", "toEmailAddrFailure"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toEmailAddrSuccess");
        elemField.setXmlName(new javax.xml.namespace.QName("", "toEmailAddrSuccess"));
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
        elemField.setFieldName("traceFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "traceFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferCompletionFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transferCompletionFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transferID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferWork");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transferWork"));
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
        elemField.setFieldName("updatedBy");
        elemField.setXmlName(new javax.xml.namespace.QName("", "updatedBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uploadRuleFileExtEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("", "uploadRuleFileExtEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uploadRuleFileExts");
        elemField.setXmlName(new javax.xml.namespace.QName("", "uploadRuleFileExts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uploadView");
        elemField.setXmlName(new javax.xml.namespace.QName("", "uploadView"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("writeMode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "writeMode"));
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
