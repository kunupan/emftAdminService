/**
 * Config.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 11, 2014 (12:11:36 EDT) WSDL2Java emitter.
 */

package AdminClient;

public class Config  implements java.io.Serializable {
    private java.lang.String CFClientAuthType;

    private int CRLChecking;

    private java.lang.String FTPClientAuthType;

    private java.lang.String FTPEmailRecipients;

    private java.lang.String FTPEmailTemplate;

    private java.lang.String FTPKeyAddByUser;

    private java.lang.String FTPKeyInitStatus;

    private java.lang.String FTPLimitLocalPorts;

    private java.lang.String FTPNumOfPorts;

    private java.lang.String FTPStartingPort;

    private java.lang.String IPAddress;

    private java.lang.String IPPort;

    private java.lang.String LDAPSyncSvrHost;

    private java.lang.String LDAPSyncTime;

    private java.lang.String PGPAllowKeyAddByUser;

    private java.lang.String PGPCompressionAlgorithm;

    private java.lang.String PGPEmailRecipients;

    private java.lang.String PGPEmailTemplate;

    private java.lang.String PGPEncryptionAlgorithm;

    private java.lang.String PGPHashingAlgorithm;

    private java.lang.String PGPInitialStatusOfKeys;

    private java.lang.String PGPStrictDecryption;

    private java.lang.String PPATimeout;

    private java.lang.String SSHClientAuthType;

    private java.lang.String SSHEmailRecipients;

    private java.lang.String SSHEmailTemplate;

    private java.lang.String SSHKeyAddByUser;

    private java.lang.String SSHKeyInitStatus;

    private java.lang.String activityInterval;

    private java.lang.String alertEmailAddr;

    private AdminClient.DateTime alertUpdateTime;

    private java.lang.String allowEmailLogin;

    private java.lang.String allowSelfReg;

    private java.lang.String antiVirusCheckFlag;

    private java.lang.String antiVirusCommand;

    private java.lang.String antiVirusExec;

    private java.lang.String auditResponseSchemaFName;

    private AdminClient.DateTime auditSearchDefaultStartTime;

    private java.lang.String cachePassword;

    private java.lang.String checkDepartmentIntegrity;

    private java.lang.String cmdCtrFlag;

    private java.lang.String compressionFlag;

    private java.lang.String connectionTimeout;

    private java.lang.String context;

    private java.lang.String dailyByteCount;

    private java.lang.String dailyIByteCount;

    private java.lang.String dailyITransferCount;

    private java.lang.String dailyITransferFCount;

    private java.lang.String dailyPByteCount;

    private java.lang.String dailyPTransferCount;

    private java.lang.String dailyPTransferFCount;

    private java.lang.String dailyTransferCount;

    private java.lang.String databaseVersion;

    private java.lang.String description;

    private java.lang.String downloadRuleFileExtEnabled;

    private java.lang.String downloadRuleFileExts;

    private java.lang.String emailAdminUserId;

    private java.lang.String emailAdminUserPass;

    private java.lang.String emailFailureRecipients;

    private java.lang.String emailFailureTemplate;

    private java.lang.String emailFailureTransTemplate;

    private java.lang.String emailHostName;

    private java.lang.String emailHostPort;

    private java.lang.String emailSender;

    private java.lang.String emailSuccessRecipients;

    private java.lang.String emailSuccessTemplate;

    private java.lang.String emailSuccessTransTemplate;

    private java.lang.String emailURL;

    private java.lang.String encryptionKey;

    private java.lang.String enhancedKeyFlag;

    private java.lang.String hostName;

    private java.lang.String hostURL;

    private java.lang.String hostdispname;

    private java.lang.String httpAuthType;

    private AdminClient.DateTime installationDate;

    private java.lang.String lastAuditFTId;

    private java.lang.String lastAuditId;

    private java.lang.String lastEventId;

    private java.lang.String lastFileId;

    private java.lang.String lastKeyId;

    private java.lang.String lastTransNo;

    private java.lang.String lockoutDuration;

    private java.lang.String lockoutDurationUser;

    private java.lang.String lockoutInterval;

    private java.lang.String lockoutIntervalUser;

    private java.lang.String loginTraceFlag;

    private java.lang.String manageConfigResponseSchemaFName;

    private java.lang.String manageServerResponseSchemaFName;

    private java.lang.String manageTransferResponseISSchemaFName;

    private java.lang.String manageTransferResponseSchemaFName;

    private java.lang.String monthlyByteCount;

    private java.lang.String monthlyIByteCount;

    private java.lang.String monthlyITransferCount;

    private java.lang.String monthlyITransferFCount;

    private java.lang.String monthlyPByteCount;

    private java.lang.String monthlyPTransferCount;

    private java.lang.String monthlyPTransferFCount;

    private java.lang.String monthlyTransferCount;

    private java.lang.String pwdBatchUsersFlag;

    private java.lang.String pwdCheckCustomRules;

    private java.lang.String pwdChkDBRules;

    private java.lang.String pwdEmbeddedWordList;

    private java.lang.String pwdEnforceHistory;

    private java.lang.String pwdExcludedWordList;

    private java.lang.String pwdMaxAge;

    private java.lang.String pwdMaxLength;

    private java.lang.String pwdMinAge;

    private java.lang.String pwdMinLength;

    private java.lang.String pwdNotifyUser;

    private java.lang.String pwdNumberOfNumerics;

    private java.lang.String pwdNumberOfSpecials;

    private java.lang.String pwdNumberOfUniqueChars;

    private java.lang.String pwdRequiresUpperLower;

    private java.lang.String pwdResetExpiration;

    private java.lang.String pwdResetOption;

    private java.lang.String secureFlag;

    private java.lang.String skipConfirmFirstTimeUser;

    private java.lang.String sshTraceFlag;

    private java.lang.String sshTraceType;

    private java.lang.String threshold;

    private java.lang.String thresholdAction;

    private java.lang.String thresholdIP;

    private java.lang.String thresholdUser;

    private java.lang.String traceFlag;

    private java.lang.String traceFlagLog4J;

    private java.lang.String transferRequestSchemaFName;

    private java.lang.String updateCache;

    private java.lang.String updateMethod;

    private java.lang.String uploadRuleFileExtEnabled;

    private java.lang.String uploadRuleFileExts;

    private java.lang.String weeklyByteCount;

    private java.lang.String weeklyIByteCount;

    private java.lang.String weeklyITransferCount;

    private java.lang.String weeklyITransferFCount;

    private java.lang.String weeklyPByteCount;

    private java.lang.String weeklyPTransferCount;

    private java.lang.String weeklyPTransferFCount;

    private java.lang.String weeklyTransferCount;

    private java.lang.String xferNotiEmailURL;

    public Config() {
    }

    public Config(
           java.lang.String CFClientAuthType,
           int CRLChecking,
           java.lang.String FTPClientAuthType,
           java.lang.String FTPEmailRecipients,
           java.lang.String FTPEmailTemplate,
           java.lang.String FTPKeyAddByUser,
           java.lang.String FTPKeyInitStatus,
           java.lang.String FTPLimitLocalPorts,
           java.lang.String FTPNumOfPorts,
           java.lang.String FTPStartingPort,
           java.lang.String IPAddress,
           java.lang.String IPPort,
           java.lang.String LDAPSyncSvrHost,
           java.lang.String LDAPSyncTime,
           java.lang.String PGPAllowKeyAddByUser,
           java.lang.String PGPCompressionAlgorithm,
           java.lang.String PGPEmailRecipients,
           java.lang.String PGPEmailTemplate,
           java.lang.String PGPEncryptionAlgorithm,
           java.lang.String PGPHashingAlgorithm,
           java.lang.String PGPInitialStatusOfKeys,
           java.lang.String PGPStrictDecryption,
           java.lang.String PPATimeout,
           java.lang.String SSHClientAuthType,
           java.lang.String SSHEmailRecipients,
           java.lang.String SSHEmailTemplate,
           java.lang.String SSHKeyAddByUser,
           java.lang.String SSHKeyInitStatus,
           java.lang.String activityInterval,
           java.lang.String alertEmailAddr,
           AdminClient.DateTime alertUpdateTime,
           java.lang.String allowEmailLogin,
           java.lang.String allowSelfReg,
           java.lang.String antiVirusCheckFlag,
           java.lang.String antiVirusCommand,
           java.lang.String antiVirusExec,
           java.lang.String auditResponseSchemaFName,
           AdminClient.DateTime auditSearchDefaultStartTime,
           java.lang.String cachePassword,
           java.lang.String checkDepartmentIntegrity,
           java.lang.String cmdCtrFlag,
           java.lang.String compressionFlag,
           java.lang.String connectionTimeout,
           java.lang.String context,
           java.lang.String dailyByteCount,
           java.lang.String dailyIByteCount,
           java.lang.String dailyITransferCount,
           java.lang.String dailyITransferFCount,
           java.lang.String dailyPByteCount,
           java.lang.String dailyPTransferCount,
           java.lang.String dailyPTransferFCount,
           java.lang.String dailyTransferCount,
           java.lang.String databaseVersion,
           java.lang.String description,
           java.lang.String downloadRuleFileExtEnabled,
           java.lang.String downloadRuleFileExts,
           java.lang.String emailAdminUserId,
           java.lang.String emailAdminUserPass,
           java.lang.String emailFailureRecipients,
           java.lang.String emailFailureTemplate,
           java.lang.String emailFailureTransTemplate,
           java.lang.String emailHostName,
           java.lang.String emailHostPort,
           java.lang.String emailSender,
           java.lang.String emailSuccessRecipients,
           java.lang.String emailSuccessTemplate,
           java.lang.String emailSuccessTransTemplate,
           java.lang.String emailURL,
           java.lang.String encryptionKey,
           java.lang.String enhancedKeyFlag,
           java.lang.String hostName,
           java.lang.String hostURL,
           java.lang.String hostdispname,
           java.lang.String httpAuthType,
           AdminClient.DateTime installationDate,
           java.lang.String lastAuditFTId,
           java.lang.String lastAuditId,
           java.lang.String lastEventId,
           java.lang.String lastFileId,
           java.lang.String lastKeyId,
           java.lang.String lastTransNo,
           java.lang.String lockoutDuration,
           java.lang.String lockoutDurationUser,
           java.lang.String lockoutInterval,
           java.lang.String lockoutIntervalUser,
           java.lang.String loginTraceFlag,
           java.lang.String manageConfigResponseSchemaFName,
           java.lang.String manageServerResponseSchemaFName,
           java.lang.String manageTransferResponseISSchemaFName,
           java.lang.String manageTransferResponseSchemaFName,
           java.lang.String monthlyByteCount,
           java.lang.String monthlyIByteCount,
           java.lang.String monthlyITransferCount,
           java.lang.String monthlyITransferFCount,
           java.lang.String monthlyPByteCount,
           java.lang.String monthlyPTransferCount,
           java.lang.String monthlyPTransferFCount,
           java.lang.String monthlyTransferCount,
           java.lang.String pwdBatchUsersFlag,
           java.lang.String pwdCheckCustomRules,
           java.lang.String pwdChkDBRules,
           java.lang.String pwdEmbeddedWordList,
           java.lang.String pwdEnforceHistory,
           java.lang.String pwdExcludedWordList,
           java.lang.String pwdMaxAge,
           java.lang.String pwdMaxLength,
           java.lang.String pwdMinAge,
           java.lang.String pwdMinLength,
           java.lang.String pwdNotifyUser,
           java.lang.String pwdNumberOfNumerics,
           java.lang.String pwdNumberOfSpecials,
           java.lang.String pwdNumberOfUniqueChars,
           java.lang.String pwdRequiresUpperLower,
           java.lang.String pwdResetExpiration,
           java.lang.String pwdResetOption,
           java.lang.String secureFlag,
           java.lang.String skipConfirmFirstTimeUser,
           java.lang.String sshTraceFlag,
           java.lang.String sshTraceType,
           java.lang.String threshold,
           java.lang.String thresholdAction,
           java.lang.String thresholdIP,
           java.lang.String thresholdUser,
           java.lang.String traceFlag,
           java.lang.String traceFlagLog4J,
           java.lang.String transferRequestSchemaFName,
           java.lang.String updateCache,
           java.lang.String updateMethod,
           java.lang.String uploadRuleFileExtEnabled,
           java.lang.String uploadRuleFileExts,
           java.lang.String weeklyByteCount,
           java.lang.String weeklyIByteCount,
           java.lang.String weeklyITransferCount,
           java.lang.String weeklyITransferFCount,
           java.lang.String weeklyPByteCount,
           java.lang.String weeklyPTransferCount,
           java.lang.String weeklyPTransferFCount,
           java.lang.String weeklyTransferCount,
           java.lang.String xferNotiEmailURL) {
           this.CFClientAuthType = CFClientAuthType;
           this.CRLChecking = CRLChecking;
           this.FTPClientAuthType = FTPClientAuthType;
           this.FTPEmailRecipients = FTPEmailRecipients;
           this.FTPEmailTemplate = FTPEmailTemplate;
           this.FTPKeyAddByUser = FTPKeyAddByUser;
           this.FTPKeyInitStatus = FTPKeyInitStatus;
           this.FTPLimitLocalPorts = FTPLimitLocalPorts;
           this.FTPNumOfPorts = FTPNumOfPorts;
           this.FTPStartingPort = FTPStartingPort;
           this.IPAddress = IPAddress;
           this.IPPort = IPPort;
           this.LDAPSyncSvrHost = LDAPSyncSvrHost;
           this.LDAPSyncTime = LDAPSyncTime;
           this.PGPAllowKeyAddByUser = PGPAllowKeyAddByUser;
           this.PGPCompressionAlgorithm = PGPCompressionAlgorithm;
           this.PGPEmailRecipients = PGPEmailRecipients;
           this.PGPEmailTemplate = PGPEmailTemplate;
           this.PGPEncryptionAlgorithm = PGPEncryptionAlgorithm;
           this.PGPHashingAlgorithm = PGPHashingAlgorithm;
           this.PGPInitialStatusOfKeys = PGPInitialStatusOfKeys;
           this.PGPStrictDecryption = PGPStrictDecryption;
           this.PPATimeout = PPATimeout;
           this.SSHClientAuthType = SSHClientAuthType;
           this.SSHEmailRecipients = SSHEmailRecipients;
           this.SSHEmailTemplate = SSHEmailTemplate;
           this.SSHKeyAddByUser = SSHKeyAddByUser;
           this.SSHKeyInitStatus = SSHKeyInitStatus;
           this.activityInterval = activityInterval;
           this.alertEmailAddr = alertEmailAddr;
           this.alertUpdateTime = alertUpdateTime;
           this.allowEmailLogin = allowEmailLogin;
           this.allowSelfReg = allowSelfReg;
           this.antiVirusCheckFlag = antiVirusCheckFlag;
           this.antiVirusCommand = antiVirusCommand;
           this.antiVirusExec = antiVirusExec;
           this.auditResponseSchemaFName = auditResponseSchemaFName;
           this.auditSearchDefaultStartTime = auditSearchDefaultStartTime;
           this.cachePassword = cachePassword;
           this.checkDepartmentIntegrity = checkDepartmentIntegrity;
           this.cmdCtrFlag = cmdCtrFlag;
           this.compressionFlag = compressionFlag;
           this.connectionTimeout = connectionTimeout;
           this.context = context;
           this.dailyByteCount = dailyByteCount;
           this.dailyIByteCount = dailyIByteCount;
           this.dailyITransferCount = dailyITransferCount;
           this.dailyITransferFCount = dailyITransferFCount;
           this.dailyPByteCount = dailyPByteCount;
           this.dailyPTransferCount = dailyPTransferCount;
           this.dailyPTransferFCount = dailyPTransferFCount;
           this.dailyTransferCount = dailyTransferCount;
           this.databaseVersion = databaseVersion;
           this.description = description;
           this.downloadRuleFileExtEnabled = downloadRuleFileExtEnabled;
           this.downloadRuleFileExts = downloadRuleFileExts;
           this.emailAdminUserId = emailAdminUserId;
           this.emailAdminUserPass = emailAdminUserPass;
           this.emailFailureRecipients = emailFailureRecipients;
           this.emailFailureTemplate = emailFailureTemplate;
           this.emailFailureTransTemplate = emailFailureTransTemplate;
           this.emailHostName = emailHostName;
           this.emailHostPort = emailHostPort;
           this.emailSender = emailSender;
           this.emailSuccessRecipients = emailSuccessRecipients;
           this.emailSuccessTemplate = emailSuccessTemplate;
           this.emailSuccessTransTemplate = emailSuccessTransTemplate;
           this.emailURL = emailURL;
           this.encryptionKey = encryptionKey;
           this.enhancedKeyFlag = enhancedKeyFlag;
           this.hostName = hostName;
           this.hostURL = hostURL;
           this.hostdispname = hostdispname;
           this.httpAuthType = httpAuthType;
           this.installationDate = installationDate;
           this.lastAuditFTId = lastAuditFTId;
           this.lastAuditId = lastAuditId;
           this.lastEventId = lastEventId;
           this.lastFileId = lastFileId;
           this.lastKeyId = lastKeyId;
           this.lastTransNo = lastTransNo;
           this.lockoutDuration = lockoutDuration;
           this.lockoutDurationUser = lockoutDurationUser;
           this.lockoutInterval = lockoutInterval;
           this.lockoutIntervalUser = lockoutIntervalUser;
           this.loginTraceFlag = loginTraceFlag;
           this.manageConfigResponseSchemaFName = manageConfigResponseSchemaFName;
           this.manageServerResponseSchemaFName = manageServerResponseSchemaFName;
           this.manageTransferResponseISSchemaFName = manageTransferResponseISSchemaFName;
           this.manageTransferResponseSchemaFName = manageTransferResponseSchemaFName;
           this.monthlyByteCount = monthlyByteCount;
           this.monthlyIByteCount = monthlyIByteCount;
           this.monthlyITransferCount = monthlyITransferCount;
           this.monthlyITransferFCount = monthlyITransferFCount;
           this.monthlyPByteCount = monthlyPByteCount;
           this.monthlyPTransferCount = monthlyPTransferCount;
           this.monthlyPTransferFCount = monthlyPTransferFCount;
           this.monthlyTransferCount = monthlyTransferCount;
           this.pwdBatchUsersFlag = pwdBatchUsersFlag;
           this.pwdCheckCustomRules = pwdCheckCustomRules;
           this.pwdChkDBRules = pwdChkDBRules;
           this.pwdEmbeddedWordList = pwdEmbeddedWordList;
           this.pwdEnforceHistory = pwdEnforceHistory;
           this.pwdExcludedWordList = pwdExcludedWordList;
           this.pwdMaxAge = pwdMaxAge;
           this.pwdMaxLength = pwdMaxLength;
           this.pwdMinAge = pwdMinAge;
           this.pwdMinLength = pwdMinLength;
           this.pwdNotifyUser = pwdNotifyUser;
           this.pwdNumberOfNumerics = pwdNumberOfNumerics;
           this.pwdNumberOfSpecials = pwdNumberOfSpecials;
           this.pwdNumberOfUniqueChars = pwdNumberOfUniqueChars;
           this.pwdRequiresUpperLower = pwdRequiresUpperLower;
           this.pwdResetExpiration = pwdResetExpiration;
           this.pwdResetOption = pwdResetOption;
           this.secureFlag = secureFlag;
           this.skipConfirmFirstTimeUser = skipConfirmFirstTimeUser;
           this.sshTraceFlag = sshTraceFlag;
           this.sshTraceType = sshTraceType;
           this.threshold = threshold;
           this.thresholdAction = thresholdAction;
           this.thresholdIP = thresholdIP;
           this.thresholdUser = thresholdUser;
           this.traceFlag = traceFlag;
           this.traceFlagLog4J = traceFlagLog4J;
           this.transferRequestSchemaFName = transferRequestSchemaFName;
           this.updateCache = updateCache;
           this.updateMethod = updateMethod;
           this.uploadRuleFileExtEnabled = uploadRuleFileExtEnabled;
           this.uploadRuleFileExts = uploadRuleFileExts;
           this.weeklyByteCount = weeklyByteCount;
           this.weeklyIByteCount = weeklyIByteCount;
           this.weeklyITransferCount = weeklyITransferCount;
           this.weeklyITransferFCount = weeklyITransferFCount;
           this.weeklyPByteCount = weeklyPByteCount;
           this.weeklyPTransferCount = weeklyPTransferCount;
           this.weeklyPTransferFCount = weeklyPTransferFCount;
           this.weeklyTransferCount = weeklyTransferCount;
           this.xferNotiEmailURL = xferNotiEmailURL;
    }


    /**
     * Gets the CFClientAuthType value for this Config.
     * 
     * @return CFClientAuthType
     */
    public java.lang.String getCFClientAuthType() {
        return CFClientAuthType;
    }


    /**
     * Sets the CFClientAuthType value for this Config.
     * 
     * @param CFClientAuthType
     */
    public void setCFClientAuthType(java.lang.String CFClientAuthType) {
        this.CFClientAuthType = CFClientAuthType;
    }


    /**
     * Gets the CRLChecking value for this Config.
     * 
     * @return CRLChecking
     */
    public int getCRLChecking() {
        return CRLChecking;
    }


    /**
     * Sets the CRLChecking value for this Config.
     * 
     * @param CRLChecking
     */
    public void setCRLChecking(int CRLChecking) {
        this.CRLChecking = CRLChecking;
    }


    /**
     * Gets the FTPClientAuthType value for this Config.
     * 
     * @return FTPClientAuthType
     */
    public java.lang.String getFTPClientAuthType() {
        return FTPClientAuthType;
    }


    /**
     * Sets the FTPClientAuthType value for this Config.
     * 
     * @param FTPClientAuthType
     */
    public void setFTPClientAuthType(java.lang.String FTPClientAuthType) {
        this.FTPClientAuthType = FTPClientAuthType;
    }


    /**
     * Gets the FTPEmailRecipients value for this Config.
     * 
     * @return FTPEmailRecipients
     */
    public java.lang.String getFTPEmailRecipients() {
        return FTPEmailRecipients;
    }


    /**
     * Sets the FTPEmailRecipients value for this Config.
     * 
     * @param FTPEmailRecipients
     */
    public void setFTPEmailRecipients(java.lang.String FTPEmailRecipients) {
        this.FTPEmailRecipients = FTPEmailRecipients;
    }


    /**
     * Gets the FTPEmailTemplate value for this Config.
     * 
     * @return FTPEmailTemplate
     */
    public java.lang.String getFTPEmailTemplate() {
        return FTPEmailTemplate;
    }


    /**
     * Sets the FTPEmailTemplate value for this Config.
     * 
     * @param FTPEmailTemplate
     */
    public void setFTPEmailTemplate(java.lang.String FTPEmailTemplate) {
        this.FTPEmailTemplate = FTPEmailTemplate;
    }


    /**
     * Gets the FTPKeyAddByUser value for this Config.
     * 
     * @return FTPKeyAddByUser
     */
    public java.lang.String getFTPKeyAddByUser() {
        return FTPKeyAddByUser;
    }


    /**
     * Sets the FTPKeyAddByUser value for this Config.
     * 
     * @param FTPKeyAddByUser
     */
    public void setFTPKeyAddByUser(java.lang.String FTPKeyAddByUser) {
        this.FTPKeyAddByUser = FTPKeyAddByUser;
    }


    /**
     * Gets the FTPKeyInitStatus value for this Config.
     * 
     * @return FTPKeyInitStatus
     */
    public java.lang.String getFTPKeyInitStatus() {
        return FTPKeyInitStatus;
    }


    /**
     * Sets the FTPKeyInitStatus value for this Config.
     * 
     * @param FTPKeyInitStatus
     */
    public void setFTPKeyInitStatus(java.lang.String FTPKeyInitStatus) {
        this.FTPKeyInitStatus = FTPKeyInitStatus;
    }


    /**
     * Gets the FTPLimitLocalPorts value for this Config.
     * 
     * @return FTPLimitLocalPorts
     */
    public java.lang.String getFTPLimitLocalPorts() {
        return FTPLimitLocalPorts;
    }


    /**
     * Sets the FTPLimitLocalPorts value for this Config.
     * 
     * @param FTPLimitLocalPorts
     */
    public void setFTPLimitLocalPorts(java.lang.String FTPLimitLocalPorts) {
        this.FTPLimitLocalPorts = FTPLimitLocalPorts;
    }


    /**
     * Gets the FTPNumOfPorts value for this Config.
     * 
     * @return FTPNumOfPorts
     */
    public java.lang.String getFTPNumOfPorts() {
        return FTPNumOfPorts;
    }


    /**
     * Sets the FTPNumOfPorts value for this Config.
     * 
     * @param FTPNumOfPorts
     */
    public void setFTPNumOfPorts(java.lang.String FTPNumOfPorts) {
        this.FTPNumOfPorts = FTPNumOfPorts;
    }


    /**
     * Gets the FTPStartingPort value for this Config.
     * 
     * @return FTPStartingPort
     */
    public java.lang.String getFTPStartingPort() {
        return FTPStartingPort;
    }


    /**
     * Sets the FTPStartingPort value for this Config.
     * 
     * @param FTPStartingPort
     */
    public void setFTPStartingPort(java.lang.String FTPStartingPort) {
        this.FTPStartingPort = FTPStartingPort;
    }


    /**
     * Gets the IPAddress value for this Config.
     * 
     * @return IPAddress
     */
    public java.lang.String getIPAddress() {
        return IPAddress;
    }


    /**
     * Sets the IPAddress value for this Config.
     * 
     * @param IPAddress
     */
    public void setIPAddress(java.lang.String IPAddress) {
        this.IPAddress = IPAddress;
    }


    /**
     * Gets the IPPort value for this Config.
     * 
     * @return IPPort
     */
    public java.lang.String getIPPort() {
        return IPPort;
    }


    /**
     * Sets the IPPort value for this Config.
     * 
     * @param IPPort
     */
    public void setIPPort(java.lang.String IPPort) {
        this.IPPort = IPPort;
    }


    /**
     * Gets the LDAPSyncSvrHost value for this Config.
     * 
     * @return LDAPSyncSvrHost
     */
    public java.lang.String getLDAPSyncSvrHost() {
        return LDAPSyncSvrHost;
    }


    /**
     * Sets the LDAPSyncSvrHost value for this Config.
     * 
     * @param LDAPSyncSvrHost
     */
    public void setLDAPSyncSvrHost(java.lang.String LDAPSyncSvrHost) {
        this.LDAPSyncSvrHost = LDAPSyncSvrHost;
    }


    /**
     * Gets the LDAPSyncTime value for this Config.
     * 
     * @return LDAPSyncTime
     */
    public java.lang.String getLDAPSyncTime() {
        return LDAPSyncTime;
    }


    /**
     * Sets the LDAPSyncTime value for this Config.
     * 
     * @param LDAPSyncTime
     */
    public void setLDAPSyncTime(java.lang.String LDAPSyncTime) {
        this.LDAPSyncTime = LDAPSyncTime;
    }


    /**
     * Gets the PGPAllowKeyAddByUser value for this Config.
     * 
     * @return PGPAllowKeyAddByUser
     */
    public java.lang.String getPGPAllowKeyAddByUser() {
        return PGPAllowKeyAddByUser;
    }


    /**
     * Sets the PGPAllowKeyAddByUser value for this Config.
     * 
     * @param PGPAllowKeyAddByUser
     */
    public void setPGPAllowKeyAddByUser(java.lang.String PGPAllowKeyAddByUser) {
        this.PGPAllowKeyAddByUser = PGPAllowKeyAddByUser;
    }


    /**
     * Gets the PGPCompressionAlgorithm value for this Config.
     * 
     * @return PGPCompressionAlgorithm
     */
    public java.lang.String getPGPCompressionAlgorithm() {
        return PGPCompressionAlgorithm;
    }


    /**
     * Sets the PGPCompressionAlgorithm value for this Config.
     * 
     * @param PGPCompressionAlgorithm
     */
    public void setPGPCompressionAlgorithm(java.lang.String PGPCompressionAlgorithm) {
        this.PGPCompressionAlgorithm = PGPCompressionAlgorithm;
    }


    /**
     * Gets the PGPEmailRecipients value for this Config.
     * 
     * @return PGPEmailRecipients
     */
    public java.lang.String getPGPEmailRecipients() {
        return PGPEmailRecipients;
    }


    /**
     * Sets the PGPEmailRecipients value for this Config.
     * 
     * @param PGPEmailRecipients
     */
    public void setPGPEmailRecipients(java.lang.String PGPEmailRecipients) {
        this.PGPEmailRecipients = PGPEmailRecipients;
    }


    /**
     * Gets the PGPEmailTemplate value for this Config.
     * 
     * @return PGPEmailTemplate
     */
    public java.lang.String getPGPEmailTemplate() {
        return PGPEmailTemplate;
    }


    /**
     * Sets the PGPEmailTemplate value for this Config.
     * 
     * @param PGPEmailTemplate
     */
    public void setPGPEmailTemplate(java.lang.String PGPEmailTemplate) {
        this.PGPEmailTemplate = PGPEmailTemplate;
    }


    /**
     * Gets the PGPEncryptionAlgorithm value for this Config.
     * 
     * @return PGPEncryptionAlgorithm
     */
    public java.lang.String getPGPEncryptionAlgorithm() {
        return PGPEncryptionAlgorithm;
    }


    /**
     * Sets the PGPEncryptionAlgorithm value for this Config.
     * 
     * @param PGPEncryptionAlgorithm
     */
    public void setPGPEncryptionAlgorithm(java.lang.String PGPEncryptionAlgorithm) {
        this.PGPEncryptionAlgorithm = PGPEncryptionAlgorithm;
    }


    /**
     * Gets the PGPHashingAlgorithm value for this Config.
     * 
     * @return PGPHashingAlgorithm
     */
    public java.lang.String getPGPHashingAlgorithm() {
        return PGPHashingAlgorithm;
    }


    /**
     * Sets the PGPHashingAlgorithm value for this Config.
     * 
     * @param PGPHashingAlgorithm
     */
    public void setPGPHashingAlgorithm(java.lang.String PGPHashingAlgorithm) {
        this.PGPHashingAlgorithm = PGPHashingAlgorithm;
    }


    /**
     * Gets the PGPInitialStatusOfKeys value for this Config.
     * 
     * @return PGPInitialStatusOfKeys
     */
    public java.lang.String getPGPInitialStatusOfKeys() {
        return PGPInitialStatusOfKeys;
    }


    /**
     * Sets the PGPInitialStatusOfKeys value for this Config.
     * 
     * @param PGPInitialStatusOfKeys
     */
    public void setPGPInitialStatusOfKeys(java.lang.String PGPInitialStatusOfKeys) {
        this.PGPInitialStatusOfKeys = PGPInitialStatusOfKeys;
    }


    /**
     * Gets the PGPStrictDecryption value for this Config.
     * 
     * @return PGPStrictDecryption
     */
    public java.lang.String getPGPStrictDecryption() {
        return PGPStrictDecryption;
    }


    /**
     * Sets the PGPStrictDecryption value for this Config.
     * 
     * @param PGPStrictDecryption
     */
    public void setPGPStrictDecryption(java.lang.String PGPStrictDecryption) {
        this.PGPStrictDecryption = PGPStrictDecryption;
    }


    /**
     * Gets the PPATimeout value for this Config.
     * 
     * @return PPATimeout
     */
    public java.lang.String getPPATimeout() {
        return PPATimeout;
    }


    /**
     * Sets the PPATimeout value for this Config.
     * 
     * @param PPATimeout
     */
    public void setPPATimeout(java.lang.String PPATimeout) {
        this.PPATimeout = PPATimeout;
    }


    /**
     * Gets the SSHClientAuthType value for this Config.
     * 
     * @return SSHClientAuthType
     */
    public java.lang.String getSSHClientAuthType() {
        return SSHClientAuthType;
    }


    /**
     * Sets the SSHClientAuthType value for this Config.
     * 
     * @param SSHClientAuthType
     */
    public void setSSHClientAuthType(java.lang.String SSHClientAuthType) {
        this.SSHClientAuthType = SSHClientAuthType;
    }


    /**
     * Gets the SSHEmailRecipients value for this Config.
     * 
     * @return SSHEmailRecipients
     */
    public java.lang.String getSSHEmailRecipients() {
        return SSHEmailRecipients;
    }


    /**
     * Sets the SSHEmailRecipients value for this Config.
     * 
     * @param SSHEmailRecipients
     */
    public void setSSHEmailRecipients(java.lang.String SSHEmailRecipients) {
        this.SSHEmailRecipients = SSHEmailRecipients;
    }


    /**
     * Gets the SSHEmailTemplate value for this Config.
     * 
     * @return SSHEmailTemplate
     */
    public java.lang.String getSSHEmailTemplate() {
        return SSHEmailTemplate;
    }


    /**
     * Sets the SSHEmailTemplate value for this Config.
     * 
     * @param SSHEmailTemplate
     */
    public void setSSHEmailTemplate(java.lang.String SSHEmailTemplate) {
        this.SSHEmailTemplate = SSHEmailTemplate;
    }


    /**
     * Gets the SSHKeyAddByUser value for this Config.
     * 
     * @return SSHKeyAddByUser
     */
    public java.lang.String getSSHKeyAddByUser() {
        return SSHKeyAddByUser;
    }


    /**
     * Sets the SSHKeyAddByUser value for this Config.
     * 
     * @param SSHKeyAddByUser
     */
    public void setSSHKeyAddByUser(java.lang.String SSHKeyAddByUser) {
        this.SSHKeyAddByUser = SSHKeyAddByUser;
    }


    /**
     * Gets the SSHKeyInitStatus value for this Config.
     * 
     * @return SSHKeyInitStatus
     */
    public java.lang.String getSSHKeyInitStatus() {
        return SSHKeyInitStatus;
    }


    /**
     * Sets the SSHKeyInitStatus value for this Config.
     * 
     * @param SSHKeyInitStatus
     */
    public void setSSHKeyInitStatus(java.lang.String SSHKeyInitStatus) {
        this.SSHKeyInitStatus = SSHKeyInitStatus;
    }


    /**
     * Gets the activityInterval value for this Config.
     * 
     * @return activityInterval
     */
    public java.lang.String getActivityInterval() {
        return activityInterval;
    }


    /**
     * Sets the activityInterval value for this Config.
     * 
     * @param activityInterval
     */
    public void setActivityInterval(java.lang.String activityInterval) {
        this.activityInterval = activityInterval;
    }


    /**
     * Gets the alertEmailAddr value for this Config.
     * 
     * @return alertEmailAddr
     */
    public java.lang.String getAlertEmailAddr() {
        return alertEmailAddr;
    }


    /**
     * Sets the alertEmailAddr value for this Config.
     * 
     * @param alertEmailAddr
     */
    public void setAlertEmailAddr(java.lang.String alertEmailAddr) {
        this.alertEmailAddr = alertEmailAddr;
    }


    /**
     * Gets the alertUpdateTime value for this Config.
     * 
     * @return alertUpdateTime
     */
    public AdminClient.DateTime getAlertUpdateTime() {
        return alertUpdateTime;
    }


    /**
     * Sets the alertUpdateTime value for this Config.
     * 
     * @param alertUpdateTime
     */
    public void setAlertUpdateTime(AdminClient.DateTime alertUpdateTime) {
        this.alertUpdateTime = alertUpdateTime;
    }


    /**
     * Gets the allowEmailLogin value for this Config.
     * 
     * @return allowEmailLogin
     */
    public java.lang.String getAllowEmailLogin() {
        return allowEmailLogin;
    }


    /**
     * Sets the allowEmailLogin value for this Config.
     * 
     * @param allowEmailLogin
     */
    public void setAllowEmailLogin(java.lang.String allowEmailLogin) {
        this.allowEmailLogin = allowEmailLogin;
    }


    /**
     * Gets the allowSelfReg value for this Config.
     * 
     * @return allowSelfReg
     */
    public java.lang.String getAllowSelfReg() {
        return allowSelfReg;
    }


    /**
     * Sets the allowSelfReg value for this Config.
     * 
     * @param allowSelfReg
     */
    public void setAllowSelfReg(java.lang.String allowSelfReg) {
        this.allowSelfReg = allowSelfReg;
    }


    /**
     * Gets the antiVirusCheckFlag value for this Config.
     * 
     * @return antiVirusCheckFlag
     */
    public java.lang.String getAntiVirusCheckFlag() {
        return antiVirusCheckFlag;
    }


    /**
     * Sets the antiVirusCheckFlag value for this Config.
     * 
     * @param antiVirusCheckFlag
     */
    public void setAntiVirusCheckFlag(java.lang.String antiVirusCheckFlag) {
        this.antiVirusCheckFlag = antiVirusCheckFlag;
    }


    /**
     * Gets the antiVirusCommand value for this Config.
     * 
     * @return antiVirusCommand
     */
    public java.lang.String getAntiVirusCommand() {
        return antiVirusCommand;
    }


    /**
     * Sets the antiVirusCommand value for this Config.
     * 
     * @param antiVirusCommand
     */
    public void setAntiVirusCommand(java.lang.String antiVirusCommand) {
        this.antiVirusCommand = antiVirusCommand;
    }


    /**
     * Gets the antiVirusExec value for this Config.
     * 
     * @return antiVirusExec
     */
    public java.lang.String getAntiVirusExec() {
        return antiVirusExec;
    }


    /**
     * Sets the antiVirusExec value for this Config.
     * 
     * @param antiVirusExec
     */
    public void setAntiVirusExec(java.lang.String antiVirusExec) {
        this.antiVirusExec = antiVirusExec;
    }


    /**
     * Gets the auditResponseSchemaFName value for this Config.
     * 
     * @return auditResponseSchemaFName
     */
    public java.lang.String getAuditResponseSchemaFName() {
        return auditResponseSchemaFName;
    }


    /**
     * Sets the auditResponseSchemaFName value for this Config.
     * 
     * @param auditResponseSchemaFName
     */
    public void setAuditResponseSchemaFName(java.lang.String auditResponseSchemaFName) {
        this.auditResponseSchemaFName = auditResponseSchemaFName;
    }


    /**
     * Gets the auditSearchDefaultStartTime value for this Config.
     * 
     * @return auditSearchDefaultStartTime
     */
    public AdminClient.DateTime getAuditSearchDefaultStartTime() {
        return auditSearchDefaultStartTime;
    }


    /**
     * Sets the auditSearchDefaultStartTime value for this Config.
     * 
     * @param auditSearchDefaultStartTime
     */
    public void setAuditSearchDefaultStartTime(AdminClient.DateTime auditSearchDefaultStartTime) {
        this.auditSearchDefaultStartTime = auditSearchDefaultStartTime;
    }


    /**
     * Gets the cachePassword value for this Config.
     * 
     * @return cachePassword
     */
    public java.lang.String getCachePassword() {
        return cachePassword;
    }


    /**
     * Sets the cachePassword value for this Config.
     * 
     * @param cachePassword
     */
    public void setCachePassword(java.lang.String cachePassword) {
        this.cachePassword = cachePassword;
    }


    /**
     * Gets the checkDepartmentIntegrity value for this Config.
     * 
     * @return checkDepartmentIntegrity
     */
    public java.lang.String getCheckDepartmentIntegrity() {
        return checkDepartmentIntegrity;
    }


    /**
     * Sets the checkDepartmentIntegrity value for this Config.
     * 
     * @param checkDepartmentIntegrity
     */
    public void setCheckDepartmentIntegrity(java.lang.String checkDepartmentIntegrity) {
        this.checkDepartmentIntegrity = checkDepartmentIntegrity;
    }


    /**
     * Gets the cmdCtrFlag value for this Config.
     * 
     * @return cmdCtrFlag
     */
    public java.lang.String getCmdCtrFlag() {
        return cmdCtrFlag;
    }


    /**
     * Sets the cmdCtrFlag value for this Config.
     * 
     * @param cmdCtrFlag
     */
    public void setCmdCtrFlag(java.lang.String cmdCtrFlag) {
        this.cmdCtrFlag = cmdCtrFlag;
    }


    /**
     * Gets the compressionFlag value for this Config.
     * 
     * @return compressionFlag
     */
    public java.lang.String getCompressionFlag() {
        return compressionFlag;
    }


    /**
     * Sets the compressionFlag value for this Config.
     * 
     * @param compressionFlag
     */
    public void setCompressionFlag(java.lang.String compressionFlag) {
        this.compressionFlag = compressionFlag;
    }


    /**
     * Gets the connectionTimeout value for this Config.
     * 
     * @return connectionTimeout
     */
    public java.lang.String getConnectionTimeout() {
        return connectionTimeout;
    }


    /**
     * Sets the connectionTimeout value for this Config.
     * 
     * @param connectionTimeout
     */
    public void setConnectionTimeout(java.lang.String connectionTimeout) {
        this.connectionTimeout = connectionTimeout;
    }


    /**
     * Gets the context value for this Config.
     * 
     * @return context
     */
    public java.lang.String getContext() {
        return context;
    }


    /**
     * Sets the context value for this Config.
     * 
     * @param context
     */
    public void setContext(java.lang.String context) {
        this.context = context;
    }


    /**
     * Gets the dailyByteCount value for this Config.
     * 
     * @return dailyByteCount
     */
    public java.lang.String getDailyByteCount() {
        return dailyByteCount;
    }


    /**
     * Sets the dailyByteCount value for this Config.
     * 
     * @param dailyByteCount
     */
    public void setDailyByteCount(java.lang.String dailyByteCount) {
        this.dailyByteCount = dailyByteCount;
    }


    /**
     * Gets the dailyIByteCount value for this Config.
     * 
     * @return dailyIByteCount
     */
    public java.lang.String getDailyIByteCount() {
        return dailyIByteCount;
    }


    /**
     * Sets the dailyIByteCount value for this Config.
     * 
     * @param dailyIByteCount
     */
    public void setDailyIByteCount(java.lang.String dailyIByteCount) {
        this.dailyIByteCount = dailyIByteCount;
    }


    /**
     * Gets the dailyITransferCount value for this Config.
     * 
     * @return dailyITransferCount
     */
    public java.lang.String getDailyITransferCount() {
        return dailyITransferCount;
    }


    /**
     * Sets the dailyITransferCount value for this Config.
     * 
     * @param dailyITransferCount
     */
    public void setDailyITransferCount(java.lang.String dailyITransferCount) {
        this.dailyITransferCount = dailyITransferCount;
    }


    /**
     * Gets the dailyITransferFCount value for this Config.
     * 
     * @return dailyITransferFCount
     */
    public java.lang.String getDailyITransferFCount() {
        return dailyITransferFCount;
    }


    /**
     * Sets the dailyITransferFCount value for this Config.
     * 
     * @param dailyITransferFCount
     */
    public void setDailyITransferFCount(java.lang.String dailyITransferFCount) {
        this.dailyITransferFCount = dailyITransferFCount;
    }


    /**
     * Gets the dailyPByteCount value for this Config.
     * 
     * @return dailyPByteCount
     */
    public java.lang.String getDailyPByteCount() {
        return dailyPByteCount;
    }


    /**
     * Sets the dailyPByteCount value for this Config.
     * 
     * @param dailyPByteCount
     */
    public void setDailyPByteCount(java.lang.String dailyPByteCount) {
        this.dailyPByteCount = dailyPByteCount;
    }


    /**
     * Gets the dailyPTransferCount value for this Config.
     * 
     * @return dailyPTransferCount
     */
    public java.lang.String getDailyPTransferCount() {
        return dailyPTransferCount;
    }


    /**
     * Sets the dailyPTransferCount value for this Config.
     * 
     * @param dailyPTransferCount
     */
    public void setDailyPTransferCount(java.lang.String dailyPTransferCount) {
        this.dailyPTransferCount = dailyPTransferCount;
    }


    /**
     * Gets the dailyPTransferFCount value for this Config.
     * 
     * @return dailyPTransferFCount
     */
    public java.lang.String getDailyPTransferFCount() {
        return dailyPTransferFCount;
    }


    /**
     * Sets the dailyPTransferFCount value for this Config.
     * 
     * @param dailyPTransferFCount
     */
    public void setDailyPTransferFCount(java.lang.String dailyPTransferFCount) {
        this.dailyPTransferFCount = dailyPTransferFCount;
    }


    /**
     * Gets the dailyTransferCount value for this Config.
     * 
     * @return dailyTransferCount
     */
    public java.lang.String getDailyTransferCount() {
        return dailyTransferCount;
    }


    /**
     * Sets the dailyTransferCount value for this Config.
     * 
     * @param dailyTransferCount
     */
    public void setDailyTransferCount(java.lang.String dailyTransferCount) {
        this.dailyTransferCount = dailyTransferCount;
    }


    /**
     * Gets the databaseVersion value for this Config.
     * 
     * @return databaseVersion
     */
    public java.lang.String getDatabaseVersion() {
        return databaseVersion;
    }


    /**
     * Sets the databaseVersion value for this Config.
     * 
     * @param databaseVersion
     */
    public void setDatabaseVersion(java.lang.String databaseVersion) {
        this.databaseVersion = databaseVersion;
    }


    /**
     * Gets the description value for this Config.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Config.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the downloadRuleFileExtEnabled value for this Config.
     * 
     * @return downloadRuleFileExtEnabled
     */
    public java.lang.String getDownloadRuleFileExtEnabled() {
        return downloadRuleFileExtEnabled;
    }


    /**
     * Sets the downloadRuleFileExtEnabled value for this Config.
     * 
     * @param downloadRuleFileExtEnabled
     */
    public void setDownloadRuleFileExtEnabled(java.lang.String downloadRuleFileExtEnabled) {
        this.downloadRuleFileExtEnabled = downloadRuleFileExtEnabled;
    }


    /**
     * Gets the downloadRuleFileExts value for this Config.
     * 
     * @return downloadRuleFileExts
     */
    public java.lang.String getDownloadRuleFileExts() {
        return downloadRuleFileExts;
    }


    /**
     * Sets the downloadRuleFileExts value for this Config.
     * 
     * @param downloadRuleFileExts
     */
    public void setDownloadRuleFileExts(java.lang.String downloadRuleFileExts) {
        this.downloadRuleFileExts = downloadRuleFileExts;
    }


    /**
     * Gets the emailAdminUserId value for this Config.
     * 
     * @return emailAdminUserId
     */
    public java.lang.String getEmailAdminUserId() {
        return emailAdminUserId;
    }


    /**
     * Sets the emailAdminUserId value for this Config.
     * 
     * @param emailAdminUserId
     */
    public void setEmailAdminUserId(java.lang.String emailAdminUserId) {
        this.emailAdminUserId = emailAdminUserId;
    }


    /**
     * Gets the emailAdminUserPass value for this Config.
     * 
     * @return emailAdminUserPass
     */
    public java.lang.String getEmailAdminUserPass() {
        return emailAdminUserPass;
    }


    /**
     * Sets the emailAdminUserPass value for this Config.
     * 
     * @param emailAdminUserPass
     */
    public void setEmailAdminUserPass(java.lang.String emailAdminUserPass) {
        this.emailAdminUserPass = emailAdminUserPass;
    }


    /**
     * Gets the emailFailureRecipients value for this Config.
     * 
     * @return emailFailureRecipients
     */
    public java.lang.String getEmailFailureRecipients() {
        return emailFailureRecipients;
    }


    /**
     * Sets the emailFailureRecipients value for this Config.
     * 
     * @param emailFailureRecipients
     */
    public void setEmailFailureRecipients(java.lang.String emailFailureRecipients) {
        this.emailFailureRecipients = emailFailureRecipients;
    }


    /**
     * Gets the emailFailureTemplate value for this Config.
     * 
     * @return emailFailureTemplate
     */
    public java.lang.String getEmailFailureTemplate() {
        return emailFailureTemplate;
    }


    /**
     * Sets the emailFailureTemplate value for this Config.
     * 
     * @param emailFailureTemplate
     */
    public void setEmailFailureTemplate(java.lang.String emailFailureTemplate) {
        this.emailFailureTemplate = emailFailureTemplate;
    }


    /**
     * Gets the emailFailureTransTemplate value for this Config.
     * 
     * @return emailFailureTransTemplate
     */
    public java.lang.String getEmailFailureTransTemplate() {
        return emailFailureTransTemplate;
    }


    /**
     * Sets the emailFailureTransTemplate value for this Config.
     * 
     * @param emailFailureTransTemplate
     */
    public void setEmailFailureTransTemplate(java.lang.String emailFailureTransTemplate) {
        this.emailFailureTransTemplate = emailFailureTransTemplate;
    }


    /**
     * Gets the emailHostName value for this Config.
     * 
     * @return emailHostName
     */
    public java.lang.String getEmailHostName() {
        return emailHostName;
    }


    /**
     * Sets the emailHostName value for this Config.
     * 
     * @param emailHostName
     */
    public void setEmailHostName(java.lang.String emailHostName) {
        this.emailHostName = emailHostName;
    }


    /**
     * Gets the emailHostPort value for this Config.
     * 
     * @return emailHostPort
     */
    public java.lang.String getEmailHostPort() {
        return emailHostPort;
    }


    /**
     * Sets the emailHostPort value for this Config.
     * 
     * @param emailHostPort
     */
    public void setEmailHostPort(java.lang.String emailHostPort) {
        this.emailHostPort = emailHostPort;
    }


    /**
     * Gets the emailSender value for this Config.
     * 
     * @return emailSender
     */
    public java.lang.String getEmailSender() {
        return emailSender;
    }


    /**
     * Sets the emailSender value for this Config.
     * 
     * @param emailSender
     */
    public void setEmailSender(java.lang.String emailSender) {
        this.emailSender = emailSender;
    }


    /**
     * Gets the emailSuccessRecipients value for this Config.
     * 
     * @return emailSuccessRecipients
     */
    public java.lang.String getEmailSuccessRecipients() {
        return emailSuccessRecipients;
    }


    /**
     * Sets the emailSuccessRecipients value for this Config.
     * 
     * @param emailSuccessRecipients
     */
    public void setEmailSuccessRecipients(java.lang.String emailSuccessRecipients) {
        this.emailSuccessRecipients = emailSuccessRecipients;
    }


    /**
     * Gets the emailSuccessTemplate value for this Config.
     * 
     * @return emailSuccessTemplate
     */
    public java.lang.String getEmailSuccessTemplate() {
        return emailSuccessTemplate;
    }


    /**
     * Sets the emailSuccessTemplate value for this Config.
     * 
     * @param emailSuccessTemplate
     */
    public void setEmailSuccessTemplate(java.lang.String emailSuccessTemplate) {
        this.emailSuccessTemplate = emailSuccessTemplate;
    }


    /**
     * Gets the emailSuccessTransTemplate value for this Config.
     * 
     * @return emailSuccessTransTemplate
     */
    public java.lang.String getEmailSuccessTransTemplate() {
        return emailSuccessTransTemplate;
    }


    /**
     * Sets the emailSuccessTransTemplate value for this Config.
     * 
     * @param emailSuccessTransTemplate
     */
    public void setEmailSuccessTransTemplate(java.lang.String emailSuccessTransTemplate) {
        this.emailSuccessTransTemplate = emailSuccessTransTemplate;
    }


    /**
     * Gets the emailURL value for this Config.
     * 
     * @return emailURL
     */
    public java.lang.String getEmailURL() {
        return emailURL;
    }


    /**
     * Sets the emailURL value for this Config.
     * 
     * @param emailURL
     */
    public void setEmailURL(java.lang.String emailURL) {
        this.emailURL = emailURL;
    }


    /**
     * Gets the encryptionKey value for this Config.
     * 
     * @return encryptionKey
     */
    public java.lang.String getEncryptionKey() {
        return encryptionKey;
    }


    /**
     * Sets the encryptionKey value for this Config.
     * 
     * @param encryptionKey
     */
    public void setEncryptionKey(java.lang.String encryptionKey) {
        this.encryptionKey = encryptionKey;
    }


    /**
     * Gets the enhancedKeyFlag value for this Config.
     * 
     * @return enhancedKeyFlag
     */
    public java.lang.String getEnhancedKeyFlag() {
        return enhancedKeyFlag;
    }


    /**
     * Sets the enhancedKeyFlag value for this Config.
     * 
     * @param enhancedKeyFlag
     */
    public void setEnhancedKeyFlag(java.lang.String enhancedKeyFlag) {
        this.enhancedKeyFlag = enhancedKeyFlag;
    }


    /**
     * Gets the hostName value for this Config.
     * 
     * @return hostName
     */
    public java.lang.String getHostName() {
        return hostName;
    }


    /**
     * Sets the hostName value for this Config.
     * 
     * @param hostName
     */
    public void setHostName(java.lang.String hostName) {
        this.hostName = hostName;
    }


    /**
     * Gets the hostURL value for this Config.
     * 
     * @return hostURL
     */
    public java.lang.String getHostURL() {
        return hostURL;
    }


    /**
     * Sets the hostURL value for this Config.
     * 
     * @param hostURL
     */
    public void setHostURL(java.lang.String hostURL) {
        this.hostURL = hostURL;
    }


    /**
     * Gets the hostdispname value for this Config.
     * 
     * @return hostdispname
     */
    public java.lang.String getHostdispname() {
        return hostdispname;
    }


    /**
     * Sets the hostdispname value for this Config.
     * 
     * @param hostdispname
     */
    public void setHostdispname(java.lang.String hostdispname) {
        this.hostdispname = hostdispname;
    }


    /**
     * Gets the httpAuthType value for this Config.
     * 
     * @return httpAuthType
     */
    public java.lang.String getHttpAuthType() {
        return httpAuthType;
    }


    /**
     * Sets the httpAuthType value for this Config.
     * 
     * @param httpAuthType
     */
    public void setHttpAuthType(java.lang.String httpAuthType) {
        this.httpAuthType = httpAuthType;
    }


    /**
     * Gets the installationDate value for this Config.
     * 
     * @return installationDate
     */
    public AdminClient.DateTime getInstallationDate() {
        return installationDate;
    }


    /**
     * Sets the installationDate value for this Config.
     * 
     * @param installationDate
     */
    public void setInstallationDate(AdminClient.DateTime installationDate) {
        this.installationDate = installationDate;
    }


    /**
     * Gets the lastAuditFTId value for this Config.
     * 
     * @return lastAuditFTId
     */
    public java.lang.String getLastAuditFTId() {
        return lastAuditFTId;
    }


    /**
     * Sets the lastAuditFTId value for this Config.
     * 
     * @param lastAuditFTId
     */
    public void setLastAuditFTId(java.lang.String lastAuditFTId) {
        this.lastAuditFTId = lastAuditFTId;
    }


    /**
     * Gets the lastAuditId value for this Config.
     * 
     * @return lastAuditId
     */
    public java.lang.String getLastAuditId() {
        return lastAuditId;
    }


    /**
     * Sets the lastAuditId value for this Config.
     * 
     * @param lastAuditId
     */
    public void setLastAuditId(java.lang.String lastAuditId) {
        this.lastAuditId = lastAuditId;
    }


    /**
     * Gets the lastEventId value for this Config.
     * 
     * @return lastEventId
     */
    public java.lang.String getLastEventId() {
        return lastEventId;
    }


    /**
     * Sets the lastEventId value for this Config.
     * 
     * @param lastEventId
     */
    public void setLastEventId(java.lang.String lastEventId) {
        this.lastEventId = lastEventId;
    }


    /**
     * Gets the lastFileId value for this Config.
     * 
     * @return lastFileId
     */
    public java.lang.String getLastFileId() {
        return lastFileId;
    }


    /**
     * Sets the lastFileId value for this Config.
     * 
     * @param lastFileId
     */
    public void setLastFileId(java.lang.String lastFileId) {
        this.lastFileId = lastFileId;
    }


    /**
     * Gets the lastKeyId value for this Config.
     * 
     * @return lastKeyId
     */
    public java.lang.String getLastKeyId() {
        return lastKeyId;
    }


    /**
     * Sets the lastKeyId value for this Config.
     * 
     * @param lastKeyId
     */
    public void setLastKeyId(java.lang.String lastKeyId) {
        this.lastKeyId = lastKeyId;
    }


    /**
     * Gets the lastTransNo value for this Config.
     * 
     * @return lastTransNo
     */
    public java.lang.String getLastTransNo() {
        return lastTransNo;
    }


    /**
     * Sets the lastTransNo value for this Config.
     * 
     * @param lastTransNo
     */
    public void setLastTransNo(java.lang.String lastTransNo) {
        this.lastTransNo = lastTransNo;
    }


    /**
     * Gets the lockoutDuration value for this Config.
     * 
     * @return lockoutDuration
     */
    public java.lang.String getLockoutDuration() {
        return lockoutDuration;
    }


    /**
     * Sets the lockoutDuration value for this Config.
     * 
     * @param lockoutDuration
     */
    public void setLockoutDuration(java.lang.String lockoutDuration) {
        this.lockoutDuration = lockoutDuration;
    }


    /**
     * Gets the lockoutDurationUser value for this Config.
     * 
     * @return lockoutDurationUser
     */
    public java.lang.String getLockoutDurationUser() {
        return lockoutDurationUser;
    }


    /**
     * Sets the lockoutDurationUser value for this Config.
     * 
     * @param lockoutDurationUser
     */
    public void setLockoutDurationUser(java.lang.String lockoutDurationUser) {
        this.lockoutDurationUser = lockoutDurationUser;
    }


    /**
     * Gets the lockoutInterval value for this Config.
     * 
     * @return lockoutInterval
     */
    public java.lang.String getLockoutInterval() {
        return lockoutInterval;
    }


    /**
     * Sets the lockoutInterval value for this Config.
     * 
     * @param lockoutInterval
     */
    public void setLockoutInterval(java.lang.String lockoutInterval) {
        this.lockoutInterval = lockoutInterval;
    }


    /**
     * Gets the lockoutIntervalUser value for this Config.
     * 
     * @return lockoutIntervalUser
     */
    public java.lang.String getLockoutIntervalUser() {
        return lockoutIntervalUser;
    }


    /**
     * Sets the lockoutIntervalUser value for this Config.
     * 
     * @param lockoutIntervalUser
     */
    public void setLockoutIntervalUser(java.lang.String lockoutIntervalUser) {
        this.lockoutIntervalUser = lockoutIntervalUser;
    }


    /**
     * Gets the loginTraceFlag value for this Config.
     * 
     * @return loginTraceFlag
     */
    public java.lang.String getLoginTraceFlag() {
        return loginTraceFlag;
    }


    /**
     * Sets the loginTraceFlag value for this Config.
     * 
     * @param loginTraceFlag
     */
    public void setLoginTraceFlag(java.lang.String loginTraceFlag) {
        this.loginTraceFlag = loginTraceFlag;
    }


    /**
     * Gets the manageConfigResponseSchemaFName value for this Config.
     * 
     * @return manageConfigResponseSchemaFName
     */
    public java.lang.String getManageConfigResponseSchemaFName() {
        return manageConfigResponseSchemaFName;
    }


    /**
     * Sets the manageConfigResponseSchemaFName value for this Config.
     * 
     * @param manageConfigResponseSchemaFName
     */
    public void setManageConfigResponseSchemaFName(java.lang.String manageConfigResponseSchemaFName) {
        this.manageConfigResponseSchemaFName = manageConfigResponseSchemaFName;
    }


    /**
     * Gets the manageServerResponseSchemaFName value for this Config.
     * 
     * @return manageServerResponseSchemaFName
     */
    public java.lang.String getManageServerResponseSchemaFName() {
        return manageServerResponseSchemaFName;
    }


    /**
     * Sets the manageServerResponseSchemaFName value for this Config.
     * 
     * @param manageServerResponseSchemaFName
     */
    public void setManageServerResponseSchemaFName(java.lang.String manageServerResponseSchemaFName) {
        this.manageServerResponseSchemaFName = manageServerResponseSchemaFName;
    }


    /**
     * Gets the manageTransferResponseISSchemaFName value for this Config.
     * 
     * @return manageTransferResponseISSchemaFName
     */
    public java.lang.String getManageTransferResponseISSchemaFName() {
        return manageTransferResponseISSchemaFName;
    }


    /**
     * Sets the manageTransferResponseISSchemaFName value for this Config.
     * 
     * @param manageTransferResponseISSchemaFName
     */
    public void setManageTransferResponseISSchemaFName(java.lang.String manageTransferResponseISSchemaFName) {
        this.manageTransferResponseISSchemaFName = manageTransferResponseISSchemaFName;
    }


    /**
     * Gets the manageTransferResponseSchemaFName value for this Config.
     * 
     * @return manageTransferResponseSchemaFName
     */
    public java.lang.String getManageTransferResponseSchemaFName() {
        return manageTransferResponseSchemaFName;
    }


    /**
     * Sets the manageTransferResponseSchemaFName value for this Config.
     * 
     * @param manageTransferResponseSchemaFName
     */
    public void setManageTransferResponseSchemaFName(java.lang.String manageTransferResponseSchemaFName) {
        this.manageTransferResponseSchemaFName = manageTransferResponseSchemaFName;
    }


    /**
     * Gets the monthlyByteCount value for this Config.
     * 
     * @return monthlyByteCount
     */
    public java.lang.String getMonthlyByteCount() {
        return monthlyByteCount;
    }


    /**
     * Sets the monthlyByteCount value for this Config.
     * 
     * @param monthlyByteCount
     */
    public void setMonthlyByteCount(java.lang.String monthlyByteCount) {
        this.monthlyByteCount = monthlyByteCount;
    }


    /**
     * Gets the monthlyIByteCount value for this Config.
     * 
     * @return monthlyIByteCount
     */
    public java.lang.String getMonthlyIByteCount() {
        return monthlyIByteCount;
    }


    /**
     * Sets the monthlyIByteCount value for this Config.
     * 
     * @param monthlyIByteCount
     */
    public void setMonthlyIByteCount(java.lang.String monthlyIByteCount) {
        this.monthlyIByteCount = monthlyIByteCount;
    }


    /**
     * Gets the monthlyITransferCount value for this Config.
     * 
     * @return monthlyITransferCount
     */
    public java.lang.String getMonthlyITransferCount() {
        return monthlyITransferCount;
    }


    /**
     * Sets the monthlyITransferCount value for this Config.
     * 
     * @param monthlyITransferCount
     */
    public void setMonthlyITransferCount(java.lang.String monthlyITransferCount) {
        this.monthlyITransferCount = monthlyITransferCount;
    }


    /**
     * Gets the monthlyITransferFCount value for this Config.
     * 
     * @return monthlyITransferFCount
     */
    public java.lang.String getMonthlyITransferFCount() {
        return monthlyITransferFCount;
    }


    /**
     * Sets the monthlyITransferFCount value for this Config.
     * 
     * @param monthlyITransferFCount
     */
    public void setMonthlyITransferFCount(java.lang.String monthlyITransferFCount) {
        this.monthlyITransferFCount = monthlyITransferFCount;
    }


    /**
     * Gets the monthlyPByteCount value for this Config.
     * 
     * @return monthlyPByteCount
     */
    public java.lang.String getMonthlyPByteCount() {
        return monthlyPByteCount;
    }


    /**
     * Sets the monthlyPByteCount value for this Config.
     * 
     * @param monthlyPByteCount
     */
    public void setMonthlyPByteCount(java.lang.String monthlyPByteCount) {
        this.monthlyPByteCount = monthlyPByteCount;
    }


    /**
     * Gets the monthlyPTransferCount value for this Config.
     * 
     * @return monthlyPTransferCount
     */
    public java.lang.String getMonthlyPTransferCount() {
        return monthlyPTransferCount;
    }


    /**
     * Sets the monthlyPTransferCount value for this Config.
     * 
     * @param monthlyPTransferCount
     */
    public void setMonthlyPTransferCount(java.lang.String monthlyPTransferCount) {
        this.monthlyPTransferCount = monthlyPTransferCount;
    }


    /**
     * Gets the monthlyPTransferFCount value for this Config.
     * 
     * @return monthlyPTransferFCount
     */
    public java.lang.String getMonthlyPTransferFCount() {
        return monthlyPTransferFCount;
    }


    /**
     * Sets the monthlyPTransferFCount value for this Config.
     * 
     * @param monthlyPTransferFCount
     */
    public void setMonthlyPTransferFCount(java.lang.String monthlyPTransferFCount) {
        this.monthlyPTransferFCount = monthlyPTransferFCount;
    }


    /**
     * Gets the monthlyTransferCount value for this Config.
     * 
     * @return monthlyTransferCount
     */
    public java.lang.String getMonthlyTransferCount() {
        return monthlyTransferCount;
    }


    /**
     * Sets the monthlyTransferCount value for this Config.
     * 
     * @param monthlyTransferCount
     */
    public void setMonthlyTransferCount(java.lang.String monthlyTransferCount) {
        this.monthlyTransferCount = monthlyTransferCount;
    }


    /**
     * Gets the pwdBatchUsersFlag value for this Config.
     * 
     * @return pwdBatchUsersFlag
     */
    public java.lang.String getPwdBatchUsersFlag() {
        return pwdBatchUsersFlag;
    }


    /**
     * Sets the pwdBatchUsersFlag value for this Config.
     * 
     * @param pwdBatchUsersFlag
     */
    public void setPwdBatchUsersFlag(java.lang.String pwdBatchUsersFlag) {
        this.pwdBatchUsersFlag = pwdBatchUsersFlag;
    }


    /**
     * Gets the pwdCheckCustomRules value for this Config.
     * 
     * @return pwdCheckCustomRules
     */
    public java.lang.String getPwdCheckCustomRules() {
        return pwdCheckCustomRules;
    }


    /**
     * Sets the pwdCheckCustomRules value for this Config.
     * 
     * @param pwdCheckCustomRules
     */
    public void setPwdCheckCustomRules(java.lang.String pwdCheckCustomRules) {
        this.pwdCheckCustomRules = pwdCheckCustomRules;
    }


    /**
     * Gets the pwdChkDBRules value for this Config.
     * 
     * @return pwdChkDBRules
     */
    public java.lang.String getPwdChkDBRules() {
        return pwdChkDBRules;
    }


    /**
     * Sets the pwdChkDBRules value for this Config.
     * 
     * @param pwdChkDBRules
     */
    public void setPwdChkDBRules(java.lang.String pwdChkDBRules) {
        this.pwdChkDBRules = pwdChkDBRules;
    }


    /**
     * Gets the pwdEmbeddedWordList value for this Config.
     * 
     * @return pwdEmbeddedWordList
     */
    public java.lang.String getPwdEmbeddedWordList() {
        return pwdEmbeddedWordList;
    }


    /**
     * Sets the pwdEmbeddedWordList value for this Config.
     * 
     * @param pwdEmbeddedWordList
     */
    public void setPwdEmbeddedWordList(java.lang.String pwdEmbeddedWordList) {
        this.pwdEmbeddedWordList = pwdEmbeddedWordList;
    }


    /**
     * Gets the pwdEnforceHistory value for this Config.
     * 
     * @return pwdEnforceHistory
     */
    public java.lang.String getPwdEnforceHistory() {
        return pwdEnforceHistory;
    }


    /**
     * Sets the pwdEnforceHistory value for this Config.
     * 
     * @param pwdEnforceHistory
     */
    public void setPwdEnforceHistory(java.lang.String pwdEnforceHistory) {
        this.pwdEnforceHistory = pwdEnforceHistory;
    }


    /**
     * Gets the pwdExcludedWordList value for this Config.
     * 
     * @return pwdExcludedWordList
     */
    public java.lang.String getPwdExcludedWordList() {
        return pwdExcludedWordList;
    }


    /**
     * Sets the pwdExcludedWordList value for this Config.
     * 
     * @param pwdExcludedWordList
     */
    public void setPwdExcludedWordList(java.lang.String pwdExcludedWordList) {
        this.pwdExcludedWordList = pwdExcludedWordList;
    }


    /**
     * Gets the pwdMaxAge value for this Config.
     * 
     * @return pwdMaxAge
     */
    public java.lang.String getPwdMaxAge() {
        return pwdMaxAge;
    }


    /**
     * Sets the pwdMaxAge value for this Config.
     * 
     * @param pwdMaxAge
     */
    public void setPwdMaxAge(java.lang.String pwdMaxAge) {
        this.pwdMaxAge = pwdMaxAge;
    }


    /**
     * Gets the pwdMaxLength value for this Config.
     * 
     * @return pwdMaxLength
     */
    public java.lang.String getPwdMaxLength() {
        return pwdMaxLength;
    }


    /**
     * Sets the pwdMaxLength value for this Config.
     * 
     * @param pwdMaxLength
     */
    public void setPwdMaxLength(java.lang.String pwdMaxLength) {
        this.pwdMaxLength = pwdMaxLength;
    }


    /**
     * Gets the pwdMinAge value for this Config.
     * 
     * @return pwdMinAge
     */
    public java.lang.String getPwdMinAge() {
        return pwdMinAge;
    }


    /**
     * Sets the pwdMinAge value for this Config.
     * 
     * @param pwdMinAge
     */
    public void setPwdMinAge(java.lang.String pwdMinAge) {
        this.pwdMinAge = pwdMinAge;
    }


    /**
     * Gets the pwdMinLength value for this Config.
     * 
     * @return pwdMinLength
     */
    public java.lang.String getPwdMinLength() {
        return pwdMinLength;
    }


    /**
     * Sets the pwdMinLength value for this Config.
     * 
     * @param pwdMinLength
     */
    public void setPwdMinLength(java.lang.String pwdMinLength) {
        this.pwdMinLength = pwdMinLength;
    }


    /**
     * Gets the pwdNotifyUser value for this Config.
     * 
     * @return pwdNotifyUser
     */
    public java.lang.String getPwdNotifyUser() {
        return pwdNotifyUser;
    }


    /**
     * Sets the pwdNotifyUser value for this Config.
     * 
     * @param pwdNotifyUser
     */
    public void setPwdNotifyUser(java.lang.String pwdNotifyUser) {
        this.pwdNotifyUser = pwdNotifyUser;
    }


    /**
     * Gets the pwdNumberOfNumerics value for this Config.
     * 
     * @return pwdNumberOfNumerics
     */
    public java.lang.String getPwdNumberOfNumerics() {
        return pwdNumberOfNumerics;
    }


    /**
     * Sets the pwdNumberOfNumerics value for this Config.
     * 
     * @param pwdNumberOfNumerics
     */
    public void setPwdNumberOfNumerics(java.lang.String pwdNumberOfNumerics) {
        this.pwdNumberOfNumerics = pwdNumberOfNumerics;
    }


    /**
     * Gets the pwdNumberOfSpecials value for this Config.
     * 
     * @return pwdNumberOfSpecials
     */
    public java.lang.String getPwdNumberOfSpecials() {
        return pwdNumberOfSpecials;
    }


    /**
     * Sets the pwdNumberOfSpecials value for this Config.
     * 
     * @param pwdNumberOfSpecials
     */
    public void setPwdNumberOfSpecials(java.lang.String pwdNumberOfSpecials) {
        this.pwdNumberOfSpecials = pwdNumberOfSpecials;
    }


    /**
     * Gets the pwdNumberOfUniqueChars value for this Config.
     * 
     * @return pwdNumberOfUniqueChars
     */
    public java.lang.String getPwdNumberOfUniqueChars() {
        return pwdNumberOfUniqueChars;
    }


    /**
     * Sets the pwdNumberOfUniqueChars value for this Config.
     * 
     * @param pwdNumberOfUniqueChars
     */
    public void setPwdNumberOfUniqueChars(java.lang.String pwdNumberOfUniqueChars) {
        this.pwdNumberOfUniqueChars = pwdNumberOfUniqueChars;
    }


    /**
     * Gets the pwdRequiresUpperLower value for this Config.
     * 
     * @return pwdRequiresUpperLower
     */
    public java.lang.String getPwdRequiresUpperLower() {
        return pwdRequiresUpperLower;
    }


    /**
     * Sets the pwdRequiresUpperLower value for this Config.
     * 
     * @param pwdRequiresUpperLower
     */
    public void setPwdRequiresUpperLower(java.lang.String pwdRequiresUpperLower) {
        this.pwdRequiresUpperLower = pwdRequiresUpperLower;
    }


    /**
     * Gets the pwdResetExpiration value for this Config.
     * 
     * @return pwdResetExpiration
     */
    public java.lang.String getPwdResetExpiration() {
        return pwdResetExpiration;
    }


    /**
     * Sets the pwdResetExpiration value for this Config.
     * 
     * @param pwdResetExpiration
     */
    public void setPwdResetExpiration(java.lang.String pwdResetExpiration) {
        this.pwdResetExpiration = pwdResetExpiration;
    }


    /**
     * Gets the pwdResetOption value for this Config.
     * 
     * @return pwdResetOption
     */
    public java.lang.String getPwdResetOption() {
        return pwdResetOption;
    }


    /**
     * Sets the pwdResetOption value for this Config.
     * 
     * @param pwdResetOption
     */
    public void setPwdResetOption(java.lang.String pwdResetOption) {
        this.pwdResetOption = pwdResetOption;
    }


    /**
     * Gets the secureFlag value for this Config.
     * 
     * @return secureFlag
     */
    public java.lang.String getSecureFlag() {
        return secureFlag;
    }


    /**
     * Sets the secureFlag value for this Config.
     * 
     * @param secureFlag
     */
    public void setSecureFlag(java.lang.String secureFlag) {
        this.secureFlag = secureFlag;
    }


    /**
     * Gets the skipConfirmFirstTimeUser value for this Config.
     * 
     * @return skipConfirmFirstTimeUser
     */
    public java.lang.String getSkipConfirmFirstTimeUser() {
        return skipConfirmFirstTimeUser;
    }


    /**
     * Sets the skipConfirmFirstTimeUser value for this Config.
     * 
     * @param skipConfirmFirstTimeUser
     */
    public void setSkipConfirmFirstTimeUser(java.lang.String skipConfirmFirstTimeUser) {
        this.skipConfirmFirstTimeUser = skipConfirmFirstTimeUser;
    }


    /**
     * Gets the sshTraceFlag value for this Config.
     * 
     * @return sshTraceFlag
     */
    public java.lang.String getSshTraceFlag() {
        return sshTraceFlag;
    }


    /**
     * Sets the sshTraceFlag value for this Config.
     * 
     * @param sshTraceFlag
     */
    public void setSshTraceFlag(java.lang.String sshTraceFlag) {
        this.sshTraceFlag = sshTraceFlag;
    }


    /**
     * Gets the sshTraceType value for this Config.
     * 
     * @return sshTraceType
     */
    public java.lang.String getSshTraceType() {
        return sshTraceType;
    }


    /**
     * Sets the sshTraceType value for this Config.
     * 
     * @param sshTraceType
     */
    public void setSshTraceType(java.lang.String sshTraceType) {
        this.sshTraceType = sshTraceType;
    }


    /**
     * Gets the threshold value for this Config.
     * 
     * @return threshold
     */
    public java.lang.String getThreshold() {
        return threshold;
    }


    /**
     * Sets the threshold value for this Config.
     * 
     * @param threshold
     */
    public void setThreshold(java.lang.String threshold) {
        this.threshold = threshold;
    }


    /**
     * Gets the thresholdAction value for this Config.
     * 
     * @return thresholdAction
     */
    public java.lang.String getThresholdAction() {
        return thresholdAction;
    }


    /**
     * Sets the thresholdAction value for this Config.
     * 
     * @param thresholdAction
     */
    public void setThresholdAction(java.lang.String thresholdAction) {
        this.thresholdAction = thresholdAction;
    }


    /**
     * Gets the thresholdIP value for this Config.
     * 
     * @return thresholdIP
     */
    public java.lang.String getThresholdIP() {
        return thresholdIP;
    }


    /**
     * Sets the thresholdIP value for this Config.
     * 
     * @param thresholdIP
     */
    public void setThresholdIP(java.lang.String thresholdIP) {
        this.thresholdIP = thresholdIP;
    }


    /**
     * Gets the thresholdUser value for this Config.
     * 
     * @return thresholdUser
     */
    public java.lang.String getThresholdUser() {
        return thresholdUser;
    }


    /**
     * Sets the thresholdUser value for this Config.
     * 
     * @param thresholdUser
     */
    public void setThresholdUser(java.lang.String thresholdUser) {
        this.thresholdUser = thresholdUser;
    }


    /**
     * Gets the traceFlag value for this Config.
     * 
     * @return traceFlag
     */
    public java.lang.String getTraceFlag() {
        return traceFlag;
    }


    /**
     * Sets the traceFlag value for this Config.
     * 
     * @param traceFlag
     */
    public void setTraceFlag(java.lang.String traceFlag) {
        this.traceFlag = traceFlag;
    }


    /**
     * Gets the traceFlagLog4J value for this Config.
     * 
     * @return traceFlagLog4J
     */
    public java.lang.String getTraceFlagLog4J() {
        return traceFlagLog4J;
    }


    /**
     * Sets the traceFlagLog4J value for this Config.
     * 
     * @param traceFlagLog4J
     */
    public void setTraceFlagLog4J(java.lang.String traceFlagLog4J) {
        this.traceFlagLog4J = traceFlagLog4J;
    }


    /**
     * Gets the transferRequestSchemaFName value for this Config.
     * 
     * @return transferRequestSchemaFName
     */
    public java.lang.String getTransferRequestSchemaFName() {
        return transferRequestSchemaFName;
    }


    /**
     * Sets the transferRequestSchemaFName value for this Config.
     * 
     * @param transferRequestSchemaFName
     */
    public void setTransferRequestSchemaFName(java.lang.String transferRequestSchemaFName) {
        this.transferRequestSchemaFName = transferRequestSchemaFName;
    }


    /**
     * Gets the updateCache value for this Config.
     * 
     * @return updateCache
     */
    public java.lang.String getUpdateCache() {
        return updateCache;
    }


    /**
     * Sets the updateCache value for this Config.
     * 
     * @param updateCache
     */
    public void setUpdateCache(java.lang.String updateCache) {
        this.updateCache = updateCache;
    }


    /**
     * Gets the updateMethod value for this Config.
     * 
     * @return updateMethod
     */
    public java.lang.String getUpdateMethod() {
        return updateMethod;
    }


    /**
     * Sets the updateMethod value for this Config.
     * 
     * @param updateMethod
     */
    public void setUpdateMethod(java.lang.String updateMethod) {
        this.updateMethod = updateMethod;
    }


    /**
     * Gets the uploadRuleFileExtEnabled value for this Config.
     * 
     * @return uploadRuleFileExtEnabled
     */
    public java.lang.String getUploadRuleFileExtEnabled() {
        return uploadRuleFileExtEnabled;
    }


    /**
     * Sets the uploadRuleFileExtEnabled value for this Config.
     * 
     * @param uploadRuleFileExtEnabled
     */
    public void setUploadRuleFileExtEnabled(java.lang.String uploadRuleFileExtEnabled) {
        this.uploadRuleFileExtEnabled = uploadRuleFileExtEnabled;
    }


    /**
     * Gets the uploadRuleFileExts value for this Config.
     * 
     * @return uploadRuleFileExts
     */
    public java.lang.String getUploadRuleFileExts() {
        return uploadRuleFileExts;
    }


    /**
     * Sets the uploadRuleFileExts value for this Config.
     * 
     * @param uploadRuleFileExts
     */
    public void setUploadRuleFileExts(java.lang.String uploadRuleFileExts) {
        this.uploadRuleFileExts = uploadRuleFileExts;
    }


    /**
     * Gets the weeklyByteCount value for this Config.
     * 
     * @return weeklyByteCount
     */
    public java.lang.String getWeeklyByteCount() {
        return weeklyByteCount;
    }


    /**
     * Sets the weeklyByteCount value for this Config.
     * 
     * @param weeklyByteCount
     */
    public void setWeeklyByteCount(java.lang.String weeklyByteCount) {
        this.weeklyByteCount = weeklyByteCount;
    }


    /**
     * Gets the weeklyIByteCount value for this Config.
     * 
     * @return weeklyIByteCount
     */
    public java.lang.String getWeeklyIByteCount() {
        return weeklyIByteCount;
    }


    /**
     * Sets the weeklyIByteCount value for this Config.
     * 
     * @param weeklyIByteCount
     */
    public void setWeeklyIByteCount(java.lang.String weeklyIByteCount) {
        this.weeklyIByteCount = weeklyIByteCount;
    }


    /**
     * Gets the weeklyITransferCount value for this Config.
     * 
     * @return weeklyITransferCount
     */
    public java.lang.String getWeeklyITransferCount() {
        return weeklyITransferCount;
    }


    /**
     * Sets the weeklyITransferCount value for this Config.
     * 
     * @param weeklyITransferCount
     */
    public void setWeeklyITransferCount(java.lang.String weeklyITransferCount) {
        this.weeklyITransferCount = weeklyITransferCount;
    }


    /**
     * Gets the weeklyITransferFCount value for this Config.
     * 
     * @return weeklyITransferFCount
     */
    public java.lang.String getWeeklyITransferFCount() {
        return weeklyITransferFCount;
    }


    /**
     * Sets the weeklyITransferFCount value for this Config.
     * 
     * @param weeklyITransferFCount
     */
    public void setWeeklyITransferFCount(java.lang.String weeklyITransferFCount) {
        this.weeklyITransferFCount = weeklyITransferFCount;
    }


    /**
     * Gets the weeklyPByteCount value for this Config.
     * 
     * @return weeklyPByteCount
     */
    public java.lang.String getWeeklyPByteCount() {
        return weeklyPByteCount;
    }


    /**
     * Sets the weeklyPByteCount value for this Config.
     * 
     * @param weeklyPByteCount
     */
    public void setWeeklyPByteCount(java.lang.String weeklyPByteCount) {
        this.weeklyPByteCount = weeklyPByteCount;
    }


    /**
     * Gets the weeklyPTransferCount value for this Config.
     * 
     * @return weeklyPTransferCount
     */
    public java.lang.String getWeeklyPTransferCount() {
        return weeklyPTransferCount;
    }


    /**
     * Sets the weeklyPTransferCount value for this Config.
     * 
     * @param weeklyPTransferCount
     */
    public void setWeeklyPTransferCount(java.lang.String weeklyPTransferCount) {
        this.weeklyPTransferCount = weeklyPTransferCount;
    }


    /**
     * Gets the weeklyPTransferFCount value for this Config.
     * 
     * @return weeklyPTransferFCount
     */
    public java.lang.String getWeeklyPTransferFCount() {
        return weeklyPTransferFCount;
    }


    /**
     * Sets the weeklyPTransferFCount value for this Config.
     * 
     * @param weeklyPTransferFCount
     */
    public void setWeeklyPTransferFCount(java.lang.String weeklyPTransferFCount) {
        this.weeklyPTransferFCount = weeklyPTransferFCount;
    }


    /**
     * Gets the weeklyTransferCount value for this Config.
     * 
     * @return weeklyTransferCount
     */
    public java.lang.String getWeeklyTransferCount() {
        return weeklyTransferCount;
    }


    /**
     * Sets the weeklyTransferCount value for this Config.
     * 
     * @param weeklyTransferCount
     */
    public void setWeeklyTransferCount(java.lang.String weeklyTransferCount) {
        this.weeklyTransferCount = weeklyTransferCount;
    }


    /**
     * Gets the xferNotiEmailURL value for this Config.
     * 
     * @return xferNotiEmailURL
     */
    public java.lang.String getXferNotiEmailURL() {
        return xferNotiEmailURL;
    }


    /**
     * Sets the xferNotiEmailURL value for this Config.
     * 
     * @param xferNotiEmailURL
     */
    public void setXferNotiEmailURL(java.lang.String xferNotiEmailURL) {
        this.xferNotiEmailURL = xferNotiEmailURL;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Config)) return false;
        Config other = (Config) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.CFClientAuthType==null && other.getCFClientAuthType()==null) || 
             (this.CFClientAuthType!=null &&
              this.CFClientAuthType.equals(other.getCFClientAuthType()))) &&
            this.CRLChecking == other.getCRLChecking() &&
            ((this.FTPClientAuthType==null && other.getFTPClientAuthType()==null) || 
             (this.FTPClientAuthType!=null &&
              this.FTPClientAuthType.equals(other.getFTPClientAuthType()))) &&
            ((this.FTPEmailRecipients==null && other.getFTPEmailRecipients()==null) || 
             (this.FTPEmailRecipients!=null &&
              this.FTPEmailRecipients.equals(other.getFTPEmailRecipients()))) &&
            ((this.FTPEmailTemplate==null && other.getFTPEmailTemplate()==null) || 
             (this.FTPEmailTemplate!=null &&
              this.FTPEmailTemplate.equals(other.getFTPEmailTemplate()))) &&
            ((this.FTPKeyAddByUser==null && other.getFTPKeyAddByUser()==null) || 
             (this.FTPKeyAddByUser!=null &&
              this.FTPKeyAddByUser.equals(other.getFTPKeyAddByUser()))) &&
            ((this.FTPKeyInitStatus==null && other.getFTPKeyInitStatus()==null) || 
             (this.FTPKeyInitStatus!=null &&
              this.FTPKeyInitStatus.equals(other.getFTPKeyInitStatus()))) &&
            ((this.FTPLimitLocalPorts==null && other.getFTPLimitLocalPorts()==null) || 
             (this.FTPLimitLocalPorts!=null &&
              this.FTPLimitLocalPorts.equals(other.getFTPLimitLocalPorts()))) &&
            ((this.FTPNumOfPorts==null && other.getFTPNumOfPorts()==null) || 
             (this.FTPNumOfPorts!=null &&
              this.FTPNumOfPorts.equals(other.getFTPNumOfPorts()))) &&
            ((this.FTPStartingPort==null && other.getFTPStartingPort()==null) || 
             (this.FTPStartingPort!=null &&
              this.FTPStartingPort.equals(other.getFTPStartingPort()))) &&
            ((this.IPAddress==null && other.getIPAddress()==null) || 
             (this.IPAddress!=null &&
              this.IPAddress.equals(other.getIPAddress()))) &&
            ((this.IPPort==null && other.getIPPort()==null) || 
             (this.IPPort!=null &&
              this.IPPort.equals(other.getIPPort()))) &&
            ((this.LDAPSyncSvrHost==null && other.getLDAPSyncSvrHost()==null) || 
             (this.LDAPSyncSvrHost!=null &&
              this.LDAPSyncSvrHost.equals(other.getLDAPSyncSvrHost()))) &&
            ((this.LDAPSyncTime==null && other.getLDAPSyncTime()==null) || 
             (this.LDAPSyncTime!=null &&
              this.LDAPSyncTime.equals(other.getLDAPSyncTime()))) &&
            ((this.PGPAllowKeyAddByUser==null && other.getPGPAllowKeyAddByUser()==null) || 
             (this.PGPAllowKeyAddByUser!=null &&
              this.PGPAllowKeyAddByUser.equals(other.getPGPAllowKeyAddByUser()))) &&
            ((this.PGPCompressionAlgorithm==null && other.getPGPCompressionAlgorithm()==null) || 
             (this.PGPCompressionAlgorithm!=null &&
              this.PGPCompressionAlgorithm.equals(other.getPGPCompressionAlgorithm()))) &&
            ((this.PGPEmailRecipients==null && other.getPGPEmailRecipients()==null) || 
             (this.PGPEmailRecipients!=null &&
              this.PGPEmailRecipients.equals(other.getPGPEmailRecipients()))) &&
            ((this.PGPEmailTemplate==null && other.getPGPEmailTemplate()==null) || 
             (this.PGPEmailTemplate!=null &&
              this.PGPEmailTemplate.equals(other.getPGPEmailTemplate()))) &&
            ((this.PGPEncryptionAlgorithm==null && other.getPGPEncryptionAlgorithm()==null) || 
             (this.PGPEncryptionAlgorithm!=null &&
              this.PGPEncryptionAlgorithm.equals(other.getPGPEncryptionAlgorithm()))) &&
            ((this.PGPHashingAlgorithm==null && other.getPGPHashingAlgorithm()==null) || 
             (this.PGPHashingAlgorithm!=null &&
              this.PGPHashingAlgorithm.equals(other.getPGPHashingAlgorithm()))) &&
            ((this.PGPInitialStatusOfKeys==null && other.getPGPInitialStatusOfKeys()==null) || 
             (this.PGPInitialStatusOfKeys!=null &&
              this.PGPInitialStatusOfKeys.equals(other.getPGPInitialStatusOfKeys()))) &&
            ((this.PGPStrictDecryption==null && other.getPGPStrictDecryption()==null) || 
             (this.PGPStrictDecryption!=null &&
              this.PGPStrictDecryption.equals(other.getPGPStrictDecryption()))) &&
            ((this.PPATimeout==null && other.getPPATimeout()==null) || 
             (this.PPATimeout!=null &&
              this.PPATimeout.equals(other.getPPATimeout()))) &&
            ((this.SSHClientAuthType==null && other.getSSHClientAuthType()==null) || 
             (this.SSHClientAuthType!=null &&
              this.SSHClientAuthType.equals(other.getSSHClientAuthType()))) &&
            ((this.SSHEmailRecipients==null && other.getSSHEmailRecipients()==null) || 
             (this.SSHEmailRecipients!=null &&
              this.SSHEmailRecipients.equals(other.getSSHEmailRecipients()))) &&
            ((this.SSHEmailTemplate==null && other.getSSHEmailTemplate()==null) || 
             (this.SSHEmailTemplate!=null &&
              this.SSHEmailTemplate.equals(other.getSSHEmailTemplate()))) &&
            ((this.SSHKeyAddByUser==null && other.getSSHKeyAddByUser()==null) || 
             (this.SSHKeyAddByUser!=null &&
              this.SSHKeyAddByUser.equals(other.getSSHKeyAddByUser()))) &&
            ((this.SSHKeyInitStatus==null && other.getSSHKeyInitStatus()==null) || 
             (this.SSHKeyInitStatus!=null &&
              this.SSHKeyInitStatus.equals(other.getSSHKeyInitStatus()))) &&
            ((this.activityInterval==null && other.getActivityInterval()==null) || 
             (this.activityInterval!=null &&
              this.activityInterval.equals(other.getActivityInterval()))) &&
            ((this.alertEmailAddr==null && other.getAlertEmailAddr()==null) || 
             (this.alertEmailAddr!=null &&
              this.alertEmailAddr.equals(other.getAlertEmailAddr()))) &&
            ((this.alertUpdateTime==null && other.getAlertUpdateTime()==null) || 
             (this.alertUpdateTime!=null &&
              this.alertUpdateTime.equals(other.getAlertUpdateTime()))) &&
            ((this.allowEmailLogin==null && other.getAllowEmailLogin()==null) || 
             (this.allowEmailLogin!=null &&
              this.allowEmailLogin.equals(other.getAllowEmailLogin()))) &&
            ((this.allowSelfReg==null && other.getAllowSelfReg()==null) || 
             (this.allowSelfReg!=null &&
              this.allowSelfReg.equals(other.getAllowSelfReg()))) &&
            ((this.antiVirusCheckFlag==null && other.getAntiVirusCheckFlag()==null) || 
             (this.antiVirusCheckFlag!=null &&
              this.antiVirusCheckFlag.equals(other.getAntiVirusCheckFlag()))) &&
            ((this.antiVirusCommand==null && other.getAntiVirusCommand()==null) || 
             (this.antiVirusCommand!=null &&
              this.antiVirusCommand.equals(other.getAntiVirusCommand()))) &&
            ((this.antiVirusExec==null && other.getAntiVirusExec()==null) || 
             (this.antiVirusExec!=null &&
              this.antiVirusExec.equals(other.getAntiVirusExec()))) &&
            ((this.auditResponseSchemaFName==null && other.getAuditResponseSchemaFName()==null) || 
             (this.auditResponseSchemaFName!=null &&
              this.auditResponseSchemaFName.equals(other.getAuditResponseSchemaFName()))) &&
            ((this.auditSearchDefaultStartTime==null && other.getAuditSearchDefaultStartTime()==null) || 
             (this.auditSearchDefaultStartTime!=null &&
              this.auditSearchDefaultStartTime.equals(other.getAuditSearchDefaultStartTime()))) &&
            ((this.cachePassword==null && other.getCachePassword()==null) || 
             (this.cachePassword!=null &&
              this.cachePassword.equals(other.getCachePassword()))) &&
            ((this.checkDepartmentIntegrity==null && other.getCheckDepartmentIntegrity()==null) || 
             (this.checkDepartmentIntegrity!=null &&
              this.checkDepartmentIntegrity.equals(other.getCheckDepartmentIntegrity()))) &&
            ((this.cmdCtrFlag==null && other.getCmdCtrFlag()==null) || 
             (this.cmdCtrFlag!=null &&
              this.cmdCtrFlag.equals(other.getCmdCtrFlag()))) &&
            ((this.compressionFlag==null && other.getCompressionFlag()==null) || 
             (this.compressionFlag!=null &&
              this.compressionFlag.equals(other.getCompressionFlag()))) &&
            ((this.connectionTimeout==null && other.getConnectionTimeout()==null) || 
             (this.connectionTimeout!=null &&
              this.connectionTimeout.equals(other.getConnectionTimeout()))) &&
            ((this.context==null && other.getContext()==null) || 
             (this.context!=null &&
              this.context.equals(other.getContext()))) &&
            ((this.dailyByteCount==null && other.getDailyByteCount()==null) || 
             (this.dailyByteCount!=null &&
              this.dailyByteCount.equals(other.getDailyByteCount()))) &&
            ((this.dailyIByteCount==null && other.getDailyIByteCount()==null) || 
             (this.dailyIByteCount!=null &&
              this.dailyIByteCount.equals(other.getDailyIByteCount()))) &&
            ((this.dailyITransferCount==null && other.getDailyITransferCount()==null) || 
             (this.dailyITransferCount!=null &&
              this.dailyITransferCount.equals(other.getDailyITransferCount()))) &&
            ((this.dailyITransferFCount==null && other.getDailyITransferFCount()==null) || 
             (this.dailyITransferFCount!=null &&
              this.dailyITransferFCount.equals(other.getDailyITransferFCount()))) &&
            ((this.dailyPByteCount==null && other.getDailyPByteCount()==null) || 
             (this.dailyPByteCount!=null &&
              this.dailyPByteCount.equals(other.getDailyPByteCount()))) &&
            ((this.dailyPTransferCount==null && other.getDailyPTransferCount()==null) || 
             (this.dailyPTransferCount!=null &&
              this.dailyPTransferCount.equals(other.getDailyPTransferCount()))) &&
            ((this.dailyPTransferFCount==null && other.getDailyPTransferFCount()==null) || 
             (this.dailyPTransferFCount!=null &&
              this.dailyPTransferFCount.equals(other.getDailyPTransferFCount()))) &&
            ((this.dailyTransferCount==null && other.getDailyTransferCount()==null) || 
             (this.dailyTransferCount!=null &&
              this.dailyTransferCount.equals(other.getDailyTransferCount()))) &&
            ((this.databaseVersion==null && other.getDatabaseVersion()==null) || 
             (this.databaseVersion!=null &&
              this.databaseVersion.equals(other.getDatabaseVersion()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.downloadRuleFileExtEnabled==null && other.getDownloadRuleFileExtEnabled()==null) || 
             (this.downloadRuleFileExtEnabled!=null &&
              this.downloadRuleFileExtEnabled.equals(other.getDownloadRuleFileExtEnabled()))) &&
            ((this.downloadRuleFileExts==null && other.getDownloadRuleFileExts()==null) || 
             (this.downloadRuleFileExts!=null &&
              this.downloadRuleFileExts.equals(other.getDownloadRuleFileExts()))) &&
            ((this.emailAdminUserId==null && other.getEmailAdminUserId()==null) || 
             (this.emailAdminUserId!=null &&
              this.emailAdminUserId.equals(other.getEmailAdminUserId()))) &&
            ((this.emailAdminUserPass==null && other.getEmailAdminUserPass()==null) || 
             (this.emailAdminUserPass!=null &&
              this.emailAdminUserPass.equals(other.getEmailAdminUserPass()))) &&
            ((this.emailFailureRecipients==null && other.getEmailFailureRecipients()==null) || 
             (this.emailFailureRecipients!=null &&
              this.emailFailureRecipients.equals(other.getEmailFailureRecipients()))) &&
            ((this.emailFailureTemplate==null && other.getEmailFailureTemplate()==null) || 
             (this.emailFailureTemplate!=null &&
              this.emailFailureTemplate.equals(other.getEmailFailureTemplate()))) &&
            ((this.emailFailureTransTemplate==null && other.getEmailFailureTransTemplate()==null) || 
             (this.emailFailureTransTemplate!=null &&
              this.emailFailureTransTemplate.equals(other.getEmailFailureTransTemplate()))) &&
            ((this.emailHostName==null && other.getEmailHostName()==null) || 
             (this.emailHostName!=null &&
              this.emailHostName.equals(other.getEmailHostName()))) &&
            ((this.emailHostPort==null && other.getEmailHostPort()==null) || 
             (this.emailHostPort!=null &&
              this.emailHostPort.equals(other.getEmailHostPort()))) &&
            ((this.emailSender==null && other.getEmailSender()==null) || 
             (this.emailSender!=null &&
              this.emailSender.equals(other.getEmailSender()))) &&
            ((this.emailSuccessRecipients==null && other.getEmailSuccessRecipients()==null) || 
             (this.emailSuccessRecipients!=null &&
              this.emailSuccessRecipients.equals(other.getEmailSuccessRecipients()))) &&
            ((this.emailSuccessTemplate==null && other.getEmailSuccessTemplate()==null) || 
             (this.emailSuccessTemplate!=null &&
              this.emailSuccessTemplate.equals(other.getEmailSuccessTemplate()))) &&
            ((this.emailSuccessTransTemplate==null && other.getEmailSuccessTransTemplate()==null) || 
             (this.emailSuccessTransTemplate!=null &&
              this.emailSuccessTransTemplate.equals(other.getEmailSuccessTransTemplate()))) &&
            ((this.emailURL==null && other.getEmailURL()==null) || 
             (this.emailURL!=null &&
              this.emailURL.equals(other.getEmailURL()))) &&
            ((this.encryptionKey==null && other.getEncryptionKey()==null) || 
             (this.encryptionKey!=null &&
              this.encryptionKey.equals(other.getEncryptionKey()))) &&
            ((this.enhancedKeyFlag==null && other.getEnhancedKeyFlag()==null) || 
             (this.enhancedKeyFlag!=null &&
              this.enhancedKeyFlag.equals(other.getEnhancedKeyFlag()))) &&
            ((this.hostName==null && other.getHostName()==null) || 
             (this.hostName!=null &&
              this.hostName.equals(other.getHostName()))) &&
            ((this.hostURL==null && other.getHostURL()==null) || 
             (this.hostURL!=null &&
              this.hostURL.equals(other.getHostURL()))) &&
            ((this.hostdispname==null && other.getHostdispname()==null) || 
             (this.hostdispname!=null &&
              this.hostdispname.equals(other.getHostdispname()))) &&
            ((this.httpAuthType==null && other.getHttpAuthType()==null) || 
             (this.httpAuthType!=null &&
              this.httpAuthType.equals(other.getHttpAuthType()))) &&
            ((this.installationDate==null && other.getInstallationDate()==null) || 
             (this.installationDate!=null &&
              this.installationDate.equals(other.getInstallationDate()))) &&
            ((this.lastAuditFTId==null && other.getLastAuditFTId()==null) || 
             (this.lastAuditFTId!=null &&
              this.lastAuditFTId.equals(other.getLastAuditFTId()))) &&
            ((this.lastAuditId==null && other.getLastAuditId()==null) || 
             (this.lastAuditId!=null &&
              this.lastAuditId.equals(other.getLastAuditId()))) &&
            ((this.lastEventId==null && other.getLastEventId()==null) || 
             (this.lastEventId!=null &&
              this.lastEventId.equals(other.getLastEventId()))) &&
            ((this.lastFileId==null && other.getLastFileId()==null) || 
             (this.lastFileId!=null &&
              this.lastFileId.equals(other.getLastFileId()))) &&
            ((this.lastKeyId==null && other.getLastKeyId()==null) || 
             (this.lastKeyId!=null &&
              this.lastKeyId.equals(other.getLastKeyId()))) &&
            ((this.lastTransNo==null && other.getLastTransNo()==null) || 
             (this.lastTransNo!=null &&
              this.lastTransNo.equals(other.getLastTransNo()))) &&
            ((this.lockoutDuration==null && other.getLockoutDuration()==null) || 
             (this.lockoutDuration!=null &&
              this.lockoutDuration.equals(other.getLockoutDuration()))) &&
            ((this.lockoutDurationUser==null && other.getLockoutDurationUser()==null) || 
             (this.lockoutDurationUser!=null &&
              this.lockoutDurationUser.equals(other.getLockoutDurationUser()))) &&
            ((this.lockoutInterval==null && other.getLockoutInterval()==null) || 
             (this.lockoutInterval!=null &&
              this.lockoutInterval.equals(other.getLockoutInterval()))) &&
            ((this.lockoutIntervalUser==null && other.getLockoutIntervalUser()==null) || 
             (this.lockoutIntervalUser!=null &&
              this.lockoutIntervalUser.equals(other.getLockoutIntervalUser()))) &&
            ((this.loginTraceFlag==null && other.getLoginTraceFlag()==null) || 
             (this.loginTraceFlag!=null &&
              this.loginTraceFlag.equals(other.getLoginTraceFlag()))) &&
            ((this.manageConfigResponseSchemaFName==null && other.getManageConfigResponseSchemaFName()==null) || 
             (this.manageConfigResponseSchemaFName!=null &&
              this.manageConfigResponseSchemaFName.equals(other.getManageConfigResponseSchemaFName()))) &&
            ((this.manageServerResponseSchemaFName==null && other.getManageServerResponseSchemaFName()==null) || 
             (this.manageServerResponseSchemaFName!=null &&
              this.manageServerResponseSchemaFName.equals(other.getManageServerResponseSchemaFName()))) &&
            ((this.manageTransferResponseISSchemaFName==null && other.getManageTransferResponseISSchemaFName()==null) || 
             (this.manageTransferResponseISSchemaFName!=null &&
              this.manageTransferResponseISSchemaFName.equals(other.getManageTransferResponseISSchemaFName()))) &&
            ((this.manageTransferResponseSchemaFName==null && other.getManageTransferResponseSchemaFName()==null) || 
             (this.manageTransferResponseSchemaFName!=null &&
              this.manageTransferResponseSchemaFName.equals(other.getManageTransferResponseSchemaFName()))) &&
            ((this.monthlyByteCount==null && other.getMonthlyByteCount()==null) || 
             (this.monthlyByteCount!=null &&
              this.monthlyByteCount.equals(other.getMonthlyByteCount()))) &&
            ((this.monthlyIByteCount==null && other.getMonthlyIByteCount()==null) || 
             (this.monthlyIByteCount!=null &&
              this.monthlyIByteCount.equals(other.getMonthlyIByteCount()))) &&
            ((this.monthlyITransferCount==null && other.getMonthlyITransferCount()==null) || 
             (this.monthlyITransferCount!=null &&
              this.monthlyITransferCount.equals(other.getMonthlyITransferCount()))) &&
            ((this.monthlyITransferFCount==null && other.getMonthlyITransferFCount()==null) || 
             (this.monthlyITransferFCount!=null &&
              this.monthlyITransferFCount.equals(other.getMonthlyITransferFCount()))) &&
            ((this.monthlyPByteCount==null && other.getMonthlyPByteCount()==null) || 
             (this.monthlyPByteCount!=null &&
              this.monthlyPByteCount.equals(other.getMonthlyPByteCount()))) &&
            ((this.monthlyPTransferCount==null && other.getMonthlyPTransferCount()==null) || 
             (this.monthlyPTransferCount!=null &&
              this.monthlyPTransferCount.equals(other.getMonthlyPTransferCount()))) &&
            ((this.monthlyPTransferFCount==null && other.getMonthlyPTransferFCount()==null) || 
             (this.monthlyPTransferFCount!=null &&
              this.monthlyPTransferFCount.equals(other.getMonthlyPTransferFCount()))) &&
            ((this.monthlyTransferCount==null && other.getMonthlyTransferCount()==null) || 
             (this.monthlyTransferCount!=null &&
              this.monthlyTransferCount.equals(other.getMonthlyTransferCount()))) &&
            ((this.pwdBatchUsersFlag==null && other.getPwdBatchUsersFlag()==null) || 
             (this.pwdBatchUsersFlag!=null &&
              this.pwdBatchUsersFlag.equals(other.getPwdBatchUsersFlag()))) &&
            ((this.pwdCheckCustomRules==null && other.getPwdCheckCustomRules()==null) || 
             (this.pwdCheckCustomRules!=null &&
              this.pwdCheckCustomRules.equals(other.getPwdCheckCustomRules()))) &&
            ((this.pwdChkDBRules==null && other.getPwdChkDBRules()==null) || 
             (this.pwdChkDBRules!=null &&
              this.pwdChkDBRules.equals(other.getPwdChkDBRules()))) &&
            ((this.pwdEmbeddedWordList==null && other.getPwdEmbeddedWordList()==null) || 
             (this.pwdEmbeddedWordList!=null &&
              this.pwdEmbeddedWordList.equals(other.getPwdEmbeddedWordList()))) &&
            ((this.pwdEnforceHistory==null && other.getPwdEnforceHistory()==null) || 
             (this.pwdEnforceHistory!=null &&
              this.pwdEnforceHistory.equals(other.getPwdEnforceHistory()))) &&
            ((this.pwdExcludedWordList==null && other.getPwdExcludedWordList()==null) || 
             (this.pwdExcludedWordList!=null &&
              this.pwdExcludedWordList.equals(other.getPwdExcludedWordList()))) &&
            ((this.pwdMaxAge==null && other.getPwdMaxAge()==null) || 
             (this.pwdMaxAge!=null &&
              this.pwdMaxAge.equals(other.getPwdMaxAge()))) &&
            ((this.pwdMaxLength==null && other.getPwdMaxLength()==null) || 
             (this.pwdMaxLength!=null &&
              this.pwdMaxLength.equals(other.getPwdMaxLength()))) &&
            ((this.pwdMinAge==null && other.getPwdMinAge()==null) || 
             (this.pwdMinAge!=null &&
              this.pwdMinAge.equals(other.getPwdMinAge()))) &&
            ((this.pwdMinLength==null && other.getPwdMinLength()==null) || 
             (this.pwdMinLength!=null &&
              this.pwdMinLength.equals(other.getPwdMinLength()))) &&
            ((this.pwdNotifyUser==null && other.getPwdNotifyUser()==null) || 
             (this.pwdNotifyUser!=null &&
              this.pwdNotifyUser.equals(other.getPwdNotifyUser()))) &&
            ((this.pwdNumberOfNumerics==null && other.getPwdNumberOfNumerics()==null) || 
             (this.pwdNumberOfNumerics!=null &&
              this.pwdNumberOfNumerics.equals(other.getPwdNumberOfNumerics()))) &&
            ((this.pwdNumberOfSpecials==null && other.getPwdNumberOfSpecials()==null) || 
             (this.pwdNumberOfSpecials!=null &&
              this.pwdNumberOfSpecials.equals(other.getPwdNumberOfSpecials()))) &&
            ((this.pwdNumberOfUniqueChars==null && other.getPwdNumberOfUniqueChars()==null) || 
             (this.pwdNumberOfUniqueChars!=null &&
              this.pwdNumberOfUniqueChars.equals(other.getPwdNumberOfUniqueChars()))) &&
            ((this.pwdRequiresUpperLower==null && other.getPwdRequiresUpperLower()==null) || 
             (this.pwdRequiresUpperLower!=null &&
              this.pwdRequiresUpperLower.equals(other.getPwdRequiresUpperLower()))) &&
            ((this.pwdResetExpiration==null && other.getPwdResetExpiration()==null) || 
             (this.pwdResetExpiration!=null &&
              this.pwdResetExpiration.equals(other.getPwdResetExpiration()))) &&
            ((this.pwdResetOption==null && other.getPwdResetOption()==null) || 
             (this.pwdResetOption!=null &&
              this.pwdResetOption.equals(other.getPwdResetOption()))) &&
            ((this.secureFlag==null && other.getSecureFlag()==null) || 
             (this.secureFlag!=null &&
              this.secureFlag.equals(other.getSecureFlag()))) &&
            ((this.skipConfirmFirstTimeUser==null && other.getSkipConfirmFirstTimeUser()==null) || 
             (this.skipConfirmFirstTimeUser!=null &&
              this.skipConfirmFirstTimeUser.equals(other.getSkipConfirmFirstTimeUser()))) &&
            ((this.sshTraceFlag==null && other.getSshTraceFlag()==null) || 
             (this.sshTraceFlag!=null &&
              this.sshTraceFlag.equals(other.getSshTraceFlag()))) &&
            ((this.sshTraceType==null && other.getSshTraceType()==null) || 
             (this.sshTraceType!=null &&
              this.sshTraceType.equals(other.getSshTraceType()))) &&
            ((this.threshold==null && other.getThreshold()==null) || 
             (this.threshold!=null &&
              this.threshold.equals(other.getThreshold()))) &&
            ((this.thresholdAction==null && other.getThresholdAction()==null) || 
             (this.thresholdAction!=null &&
              this.thresholdAction.equals(other.getThresholdAction()))) &&
            ((this.thresholdIP==null && other.getThresholdIP()==null) || 
             (this.thresholdIP!=null &&
              this.thresholdIP.equals(other.getThresholdIP()))) &&
            ((this.thresholdUser==null && other.getThresholdUser()==null) || 
             (this.thresholdUser!=null &&
              this.thresholdUser.equals(other.getThresholdUser()))) &&
            ((this.traceFlag==null && other.getTraceFlag()==null) || 
             (this.traceFlag!=null &&
              this.traceFlag.equals(other.getTraceFlag()))) &&
            ((this.traceFlagLog4J==null && other.getTraceFlagLog4J()==null) || 
             (this.traceFlagLog4J!=null &&
              this.traceFlagLog4J.equals(other.getTraceFlagLog4J()))) &&
            ((this.transferRequestSchemaFName==null && other.getTransferRequestSchemaFName()==null) || 
             (this.transferRequestSchemaFName!=null &&
              this.transferRequestSchemaFName.equals(other.getTransferRequestSchemaFName()))) &&
            ((this.updateCache==null && other.getUpdateCache()==null) || 
             (this.updateCache!=null &&
              this.updateCache.equals(other.getUpdateCache()))) &&
            ((this.updateMethod==null && other.getUpdateMethod()==null) || 
             (this.updateMethod!=null &&
              this.updateMethod.equals(other.getUpdateMethod()))) &&
            ((this.uploadRuleFileExtEnabled==null && other.getUploadRuleFileExtEnabled()==null) || 
             (this.uploadRuleFileExtEnabled!=null &&
              this.uploadRuleFileExtEnabled.equals(other.getUploadRuleFileExtEnabled()))) &&
            ((this.uploadRuleFileExts==null && other.getUploadRuleFileExts()==null) || 
             (this.uploadRuleFileExts!=null &&
              this.uploadRuleFileExts.equals(other.getUploadRuleFileExts()))) &&
            ((this.weeklyByteCount==null && other.getWeeklyByteCount()==null) || 
             (this.weeklyByteCount!=null &&
              this.weeklyByteCount.equals(other.getWeeklyByteCount()))) &&
            ((this.weeklyIByteCount==null && other.getWeeklyIByteCount()==null) || 
             (this.weeklyIByteCount!=null &&
              this.weeklyIByteCount.equals(other.getWeeklyIByteCount()))) &&
            ((this.weeklyITransferCount==null && other.getWeeklyITransferCount()==null) || 
             (this.weeklyITransferCount!=null &&
              this.weeklyITransferCount.equals(other.getWeeklyITransferCount()))) &&
            ((this.weeklyITransferFCount==null && other.getWeeklyITransferFCount()==null) || 
             (this.weeklyITransferFCount!=null &&
              this.weeklyITransferFCount.equals(other.getWeeklyITransferFCount()))) &&
            ((this.weeklyPByteCount==null && other.getWeeklyPByteCount()==null) || 
             (this.weeklyPByteCount!=null &&
              this.weeklyPByteCount.equals(other.getWeeklyPByteCount()))) &&
            ((this.weeklyPTransferCount==null && other.getWeeklyPTransferCount()==null) || 
             (this.weeklyPTransferCount!=null &&
              this.weeklyPTransferCount.equals(other.getWeeklyPTransferCount()))) &&
            ((this.weeklyPTransferFCount==null && other.getWeeklyPTransferFCount()==null) || 
             (this.weeklyPTransferFCount!=null &&
              this.weeklyPTransferFCount.equals(other.getWeeklyPTransferFCount()))) &&
            ((this.weeklyTransferCount==null && other.getWeeklyTransferCount()==null) || 
             (this.weeklyTransferCount!=null &&
              this.weeklyTransferCount.equals(other.getWeeklyTransferCount()))) &&
            ((this.xferNotiEmailURL==null && other.getXferNotiEmailURL()==null) || 
             (this.xferNotiEmailURL!=null &&
              this.xferNotiEmailURL.equals(other.getXferNotiEmailURL())));
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
        if (getCFClientAuthType() != null) {
            _hashCode += getCFClientAuthType().hashCode();
        }
        _hashCode += getCRLChecking();
        if (getFTPClientAuthType() != null) {
            _hashCode += getFTPClientAuthType().hashCode();
        }
        if (getFTPEmailRecipients() != null) {
            _hashCode += getFTPEmailRecipients().hashCode();
        }
        if (getFTPEmailTemplate() != null) {
            _hashCode += getFTPEmailTemplate().hashCode();
        }
        if (getFTPKeyAddByUser() != null) {
            _hashCode += getFTPKeyAddByUser().hashCode();
        }
        if (getFTPKeyInitStatus() != null) {
            _hashCode += getFTPKeyInitStatus().hashCode();
        }
        if (getFTPLimitLocalPorts() != null) {
            _hashCode += getFTPLimitLocalPorts().hashCode();
        }
        if (getFTPNumOfPorts() != null) {
            _hashCode += getFTPNumOfPorts().hashCode();
        }
        if (getFTPStartingPort() != null) {
            _hashCode += getFTPStartingPort().hashCode();
        }
        if (getIPAddress() != null) {
            _hashCode += getIPAddress().hashCode();
        }
        if (getIPPort() != null) {
            _hashCode += getIPPort().hashCode();
        }
        if (getLDAPSyncSvrHost() != null) {
            _hashCode += getLDAPSyncSvrHost().hashCode();
        }
        if (getLDAPSyncTime() != null) {
            _hashCode += getLDAPSyncTime().hashCode();
        }
        if (getPGPAllowKeyAddByUser() != null) {
            _hashCode += getPGPAllowKeyAddByUser().hashCode();
        }
        if (getPGPCompressionAlgorithm() != null) {
            _hashCode += getPGPCompressionAlgorithm().hashCode();
        }
        if (getPGPEmailRecipients() != null) {
            _hashCode += getPGPEmailRecipients().hashCode();
        }
        if (getPGPEmailTemplate() != null) {
            _hashCode += getPGPEmailTemplate().hashCode();
        }
        if (getPGPEncryptionAlgorithm() != null) {
            _hashCode += getPGPEncryptionAlgorithm().hashCode();
        }
        if (getPGPHashingAlgorithm() != null) {
            _hashCode += getPGPHashingAlgorithm().hashCode();
        }
        if (getPGPInitialStatusOfKeys() != null) {
            _hashCode += getPGPInitialStatusOfKeys().hashCode();
        }
        if (getPGPStrictDecryption() != null) {
            _hashCode += getPGPStrictDecryption().hashCode();
        }
        if (getPPATimeout() != null) {
            _hashCode += getPPATimeout().hashCode();
        }
        if (getSSHClientAuthType() != null) {
            _hashCode += getSSHClientAuthType().hashCode();
        }
        if (getSSHEmailRecipients() != null) {
            _hashCode += getSSHEmailRecipients().hashCode();
        }
        if (getSSHEmailTemplate() != null) {
            _hashCode += getSSHEmailTemplate().hashCode();
        }
        if (getSSHKeyAddByUser() != null) {
            _hashCode += getSSHKeyAddByUser().hashCode();
        }
        if (getSSHKeyInitStatus() != null) {
            _hashCode += getSSHKeyInitStatus().hashCode();
        }
        if (getActivityInterval() != null) {
            _hashCode += getActivityInterval().hashCode();
        }
        if (getAlertEmailAddr() != null) {
            _hashCode += getAlertEmailAddr().hashCode();
        }
        if (getAlertUpdateTime() != null) {
            _hashCode += getAlertUpdateTime().hashCode();
        }
        if (getAllowEmailLogin() != null) {
            _hashCode += getAllowEmailLogin().hashCode();
        }
        if (getAllowSelfReg() != null) {
            _hashCode += getAllowSelfReg().hashCode();
        }
        if (getAntiVirusCheckFlag() != null) {
            _hashCode += getAntiVirusCheckFlag().hashCode();
        }
        if (getAntiVirusCommand() != null) {
            _hashCode += getAntiVirusCommand().hashCode();
        }
        if (getAntiVirusExec() != null) {
            _hashCode += getAntiVirusExec().hashCode();
        }
        if (getAuditResponseSchemaFName() != null) {
            _hashCode += getAuditResponseSchemaFName().hashCode();
        }
        if (getAuditSearchDefaultStartTime() != null) {
            _hashCode += getAuditSearchDefaultStartTime().hashCode();
        }
        if (getCachePassword() != null) {
            _hashCode += getCachePassword().hashCode();
        }
        if (getCheckDepartmentIntegrity() != null) {
            _hashCode += getCheckDepartmentIntegrity().hashCode();
        }
        if (getCmdCtrFlag() != null) {
            _hashCode += getCmdCtrFlag().hashCode();
        }
        if (getCompressionFlag() != null) {
            _hashCode += getCompressionFlag().hashCode();
        }
        if (getConnectionTimeout() != null) {
            _hashCode += getConnectionTimeout().hashCode();
        }
        if (getContext() != null) {
            _hashCode += getContext().hashCode();
        }
        if (getDailyByteCount() != null) {
            _hashCode += getDailyByteCount().hashCode();
        }
        if (getDailyIByteCount() != null) {
            _hashCode += getDailyIByteCount().hashCode();
        }
        if (getDailyITransferCount() != null) {
            _hashCode += getDailyITransferCount().hashCode();
        }
        if (getDailyITransferFCount() != null) {
            _hashCode += getDailyITransferFCount().hashCode();
        }
        if (getDailyPByteCount() != null) {
            _hashCode += getDailyPByteCount().hashCode();
        }
        if (getDailyPTransferCount() != null) {
            _hashCode += getDailyPTransferCount().hashCode();
        }
        if (getDailyPTransferFCount() != null) {
            _hashCode += getDailyPTransferFCount().hashCode();
        }
        if (getDailyTransferCount() != null) {
            _hashCode += getDailyTransferCount().hashCode();
        }
        if (getDatabaseVersion() != null) {
            _hashCode += getDatabaseVersion().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getDownloadRuleFileExtEnabled() != null) {
            _hashCode += getDownloadRuleFileExtEnabled().hashCode();
        }
        if (getDownloadRuleFileExts() != null) {
            _hashCode += getDownloadRuleFileExts().hashCode();
        }
        if (getEmailAdminUserId() != null) {
            _hashCode += getEmailAdminUserId().hashCode();
        }
        if (getEmailAdminUserPass() != null) {
            _hashCode += getEmailAdminUserPass().hashCode();
        }
        if (getEmailFailureRecipients() != null) {
            _hashCode += getEmailFailureRecipients().hashCode();
        }
        if (getEmailFailureTemplate() != null) {
            _hashCode += getEmailFailureTemplate().hashCode();
        }
        if (getEmailFailureTransTemplate() != null) {
            _hashCode += getEmailFailureTransTemplate().hashCode();
        }
        if (getEmailHostName() != null) {
            _hashCode += getEmailHostName().hashCode();
        }
        if (getEmailHostPort() != null) {
            _hashCode += getEmailHostPort().hashCode();
        }
        if (getEmailSender() != null) {
            _hashCode += getEmailSender().hashCode();
        }
        if (getEmailSuccessRecipients() != null) {
            _hashCode += getEmailSuccessRecipients().hashCode();
        }
        if (getEmailSuccessTemplate() != null) {
            _hashCode += getEmailSuccessTemplate().hashCode();
        }
        if (getEmailSuccessTransTemplate() != null) {
            _hashCode += getEmailSuccessTransTemplate().hashCode();
        }
        if (getEmailURL() != null) {
            _hashCode += getEmailURL().hashCode();
        }
        if (getEncryptionKey() != null) {
            _hashCode += getEncryptionKey().hashCode();
        }
        if (getEnhancedKeyFlag() != null) {
            _hashCode += getEnhancedKeyFlag().hashCode();
        }
        if (getHostName() != null) {
            _hashCode += getHostName().hashCode();
        }
        if (getHostURL() != null) {
            _hashCode += getHostURL().hashCode();
        }
        if (getHostdispname() != null) {
            _hashCode += getHostdispname().hashCode();
        }
        if (getHttpAuthType() != null) {
            _hashCode += getHttpAuthType().hashCode();
        }
        if (getInstallationDate() != null) {
            _hashCode += getInstallationDate().hashCode();
        }
        if (getLastAuditFTId() != null) {
            _hashCode += getLastAuditFTId().hashCode();
        }
        if (getLastAuditId() != null) {
            _hashCode += getLastAuditId().hashCode();
        }
        if (getLastEventId() != null) {
            _hashCode += getLastEventId().hashCode();
        }
        if (getLastFileId() != null) {
            _hashCode += getLastFileId().hashCode();
        }
        if (getLastKeyId() != null) {
            _hashCode += getLastKeyId().hashCode();
        }
        if (getLastTransNo() != null) {
            _hashCode += getLastTransNo().hashCode();
        }
        if (getLockoutDuration() != null) {
            _hashCode += getLockoutDuration().hashCode();
        }
        if (getLockoutDurationUser() != null) {
            _hashCode += getLockoutDurationUser().hashCode();
        }
        if (getLockoutInterval() != null) {
            _hashCode += getLockoutInterval().hashCode();
        }
        if (getLockoutIntervalUser() != null) {
            _hashCode += getLockoutIntervalUser().hashCode();
        }
        if (getLoginTraceFlag() != null) {
            _hashCode += getLoginTraceFlag().hashCode();
        }
        if (getManageConfigResponseSchemaFName() != null) {
            _hashCode += getManageConfigResponseSchemaFName().hashCode();
        }
        if (getManageServerResponseSchemaFName() != null) {
            _hashCode += getManageServerResponseSchemaFName().hashCode();
        }
        if (getManageTransferResponseISSchemaFName() != null) {
            _hashCode += getManageTransferResponseISSchemaFName().hashCode();
        }
        if (getManageTransferResponseSchemaFName() != null) {
            _hashCode += getManageTransferResponseSchemaFName().hashCode();
        }
        if (getMonthlyByteCount() != null) {
            _hashCode += getMonthlyByteCount().hashCode();
        }
        if (getMonthlyIByteCount() != null) {
            _hashCode += getMonthlyIByteCount().hashCode();
        }
        if (getMonthlyITransferCount() != null) {
            _hashCode += getMonthlyITransferCount().hashCode();
        }
        if (getMonthlyITransferFCount() != null) {
            _hashCode += getMonthlyITransferFCount().hashCode();
        }
        if (getMonthlyPByteCount() != null) {
            _hashCode += getMonthlyPByteCount().hashCode();
        }
        if (getMonthlyPTransferCount() != null) {
            _hashCode += getMonthlyPTransferCount().hashCode();
        }
        if (getMonthlyPTransferFCount() != null) {
            _hashCode += getMonthlyPTransferFCount().hashCode();
        }
        if (getMonthlyTransferCount() != null) {
            _hashCode += getMonthlyTransferCount().hashCode();
        }
        if (getPwdBatchUsersFlag() != null) {
            _hashCode += getPwdBatchUsersFlag().hashCode();
        }
        if (getPwdCheckCustomRules() != null) {
            _hashCode += getPwdCheckCustomRules().hashCode();
        }
        if (getPwdChkDBRules() != null) {
            _hashCode += getPwdChkDBRules().hashCode();
        }
        if (getPwdEmbeddedWordList() != null) {
            _hashCode += getPwdEmbeddedWordList().hashCode();
        }
        if (getPwdEnforceHistory() != null) {
            _hashCode += getPwdEnforceHistory().hashCode();
        }
        if (getPwdExcludedWordList() != null) {
            _hashCode += getPwdExcludedWordList().hashCode();
        }
        if (getPwdMaxAge() != null) {
            _hashCode += getPwdMaxAge().hashCode();
        }
        if (getPwdMaxLength() != null) {
            _hashCode += getPwdMaxLength().hashCode();
        }
        if (getPwdMinAge() != null) {
            _hashCode += getPwdMinAge().hashCode();
        }
        if (getPwdMinLength() != null) {
            _hashCode += getPwdMinLength().hashCode();
        }
        if (getPwdNotifyUser() != null) {
            _hashCode += getPwdNotifyUser().hashCode();
        }
        if (getPwdNumberOfNumerics() != null) {
            _hashCode += getPwdNumberOfNumerics().hashCode();
        }
        if (getPwdNumberOfSpecials() != null) {
            _hashCode += getPwdNumberOfSpecials().hashCode();
        }
        if (getPwdNumberOfUniqueChars() != null) {
            _hashCode += getPwdNumberOfUniqueChars().hashCode();
        }
        if (getPwdRequiresUpperLower() != null) {
            _hashCode += getPwdRequiresUpperLower().hashCode();
        }
        if (getPwdResetExpiration() != null) {
            _hashCode += getPwdResetExpiration().hashCode();
        }
        if (getPwdResetOption() != null) {
            _hashCode += getPwdResetOption().hashCode();
        }
        if (getSecureFlag() != null) {
            _hashCode += getSecureFlag().hashCode();
        }
        if (getSkipConfirmFirstTimeUser() != null) {
            _hashCode += getSkipConfirmFirstTimeUser().hashCode();
        }
        if (getSshTraceFlag() != null) {
            _hashCode += getSshTraceFlag().hashCode();
        }
        if (getSshTraceType() != null) {
            _hashCode += getSshTraceType().hashCode();
        }
        if (getThreshold() != null) {
            _hashCode += getThreshold().hashCode();
        }
        if (getThresholdAction() != null) {
            _hashCode += getThresholdAction().hashCode();
        }
        if (getThresholdIP() != null) {
            _hashCode += getThresholdIP().hashCode();
        }
        if (getThresholdUser() != null) {
            _hashCode += getThresholdUser().hashCode();
        }
        if (getTraceFlag() != null) {
            _hashCode += getTraceFlag().hashCode();
        }
        if (getTraceFlagLog4J() != null) {
            _hashCode += getTraceFlagLog4J().hashCode();
        }
        if (getTransferRequestSchemaFName() != null) {
            _hashCode += getTransferRequestSchemaFName().hashCode();
        }
        if (getUpdateCache() != null) {
            _hashCode += getUpdateCache().hashCode();
        }
        if (getUpdateMethod() != null) {
            _hashCode += getUpdateMethod().hashCode();
        }
        if (getUploadRuleFileExtEnabled() != null) {
            _hashCode += getUploadRuleFileExtEnabled().hashCode();
        }
        if (getUploadRuleFileExts() != null) {
            _hashCode += getUploadRuleFileExts().hashCode();
        }
        if (getWeeklyByteCount() != null) {
            _hashCode += getWeeklyByteCount().hashCode();
        }
        if (getWeeklyIByteCount() != null) {
            _hashCode += getWeeklyIByteCount().hashCode();
        }
        if (getWeeklyITransferCount() != null) {
            _hashCode += getWeeklyITransferCount().hashCode();
        }
        if (getWeeklyITransferFCount() != null) {
            _hashCode += getWeeklyITransferFCount().hashCode();
        }
        if (getWeeklyPByteCount() != null) {
            _hashCode += getWeeklyPByteCount().hashCode();
        }
        if (getWeeklyPTransferCount() != null) {
            _hashCode += getWeeklyPTransferCount().hashCode();
        }
        if (getWeeklyPTransferFCount() != null) {
            _hashCode += getWeeklyPTransferFCount().hashCode();
        }
        if (getWeeklyTransferCount() != null) {
            _hashCode += getWeeklyTransferCount().hashCode();
        }
        if (getXferNotiEmailURL() != null) {
            _hashCode += getXferNotiEmailURL().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Config.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:AdministratorService", "Config"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CFClientAuthType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CFClientAuthType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CRLChecking");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CRLChecking"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FTPClientAuthType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FTPClientAuthType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FTPEmailRecipients");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FTPEmailRecipients"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FTPEmailTemplate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FTPEmailTemplate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FTPKeyAddByUser");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FTPKeyAddByUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FTPKeyInitStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FTPKeyInitStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FTPLimitLocalPorts");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FTPLimitLocalPorts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FTPNumOfPorts");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FTPNumOfPorts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FTPStartingPort");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FTPStartingPort"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IPAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IPAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IPPort");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IPPort"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LDAPSyncSvrHost");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LDAPSyncSvrHost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LDAPSyncTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LDAPSyncTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PGPAllowKeyAddByUser");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PGPAllowKeyAddByUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PGPCompressionAlgorithm");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PGPCompressionAlgorithm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PGPEmailRecipients");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PGPEmailRecipients"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PGPEmailTemplate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PGPEmailTemplate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PGPEncryptionAlgorithm");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PGPEncryptionAlgorithm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PGPHashingAlgorithm");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PGPHashingAlgorithm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PGPInitialStatusOfKeys");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PGPInitialStatusOfKeys"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PGPStrictDecryption");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PGPStrictDecryption"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PPATimeout");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PPATimeout"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SSHClientAuthType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SSHClientAuthType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SSHEmailRecipients");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SSHEmailRecipients"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SSHEmailTemplate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SSHEmailTemplate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SSHKeyAddByUser");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SSHKeyAddByUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SSHKeyInitStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SSHKeyInitStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activityInterval");
        elemField.setXmlName(new javax.xml.namespace.QName("", "activityInterval"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alertEmailAddr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "alertEmailAddr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alertUpdateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "alertUpdateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:AdministratorService", "DateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowEmailLogin");
        elemField.setXmlName(new javax.xml.namespace.QName("", "allowEmailLogin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowSelfReg");
        elemField.setXmlName(new javax.xml.namespace.QName("", "allowSelfReg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("antiVirusCheckFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "antiVirusCheckFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("antiVirusCommand");
        elemField.setXmlName(new javax.xml.namespace.QName("", "antiVirusCommand"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("antiVirusExec");
        elemField.setXmlName(new javax.xml.namespace.QName("", "antiVirusExec"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("auditResponseSchemaFName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "auditResponseSchemaFName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("auditSearchDefaultStartTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "auditSearchDefaultStartTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:AdministratorService", "DateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cachePassword");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cachePassword"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("checkDepartmentIntegrity");
        elemField.setXmlName(new javax.xml.namespace.QName("", "checkDepartmentIntegrity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cmdCtrFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cmdCtrFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("compressionFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "compressionFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("connectionTimeout");
        elemField.setXmlName(new javax.xml.namespace.QName("", "connectionTimeout"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("context");
        elemField.setXmlName(new javax.xml.namespace.QName("", "context"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dailyByteCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dailyByteCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dailyIByteCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dailyIByteCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dailyITransferCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dailyITransferCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dailyITransferFCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dailyITransferFCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dailyPByteCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dailyPByteCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dailyPTransferCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dailyPTransferCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dailyPTransferFCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dailyPTransferFCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dailyTransferCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dailyTransferCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("databaseVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "databaseVersion"));
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
        elemField.setFieldName("emailAdminUserId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "emailAdminUserId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailAdminUserPass");
        elemField.setXmlName(new javax.xml.namespace.QName("", "emailAdminUserPass"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailFailureRecipients");
        elemField.setXmlName(new javax.xml.namespace.QName("", "emailFailureRecipients"));
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
        elemField.setFieldName("emailFailureTransTemplate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "emailFailureTransTemplate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailHostName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "emailHostName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailHostPort");
        elemField.setXmlName(new javax.xml.namespace.QName("", "emailHostPort"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailSender");
        elemField.setXmlName(new javax.xml.namespace.QName("", "emailSender"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailSuccessRecipients");
        elemField.setXmlName(new javax.xml.namespace.QName("", "emailSuccessRecipients"));
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
        elemField.setFieldName("emailSuccessTransTemplate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "emailSuccessTransTemplate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailURL");
        elemField.setXmlName(new javax.xml.namespace.QName("", "emailURL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("encryptionKey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "encryptionKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enhancedKeyFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "enhancedKeyFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hostName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostURL");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hostURL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostdispname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hostdispname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("httpAuthType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "httpAuthType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("installationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "installationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:AdministratorService", "DateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastAuditFTId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lastAuditFTId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastAuditId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lastAuditId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastEventId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lastEventId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastFileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lastFileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastKeyId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lastKeyId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastTransNo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lastTransNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lockoutDuration");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lockoutDuration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lockoutDurationUser");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lockoutDurationUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lockoutInterval");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lockoutInterval"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lockoutIntervalUser");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lockoutIntervalUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loginTraceFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "loginTraceFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manageConfigResponseSchemaFName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "manageConfigResponseSchemaFName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manageServerResponseSchemaFName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "manageServerResponseSchemaFName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manageTransferResponseISSchemaFName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "manageTransferResponseISSchemaFName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manageTransferResponseSchemaFName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "manageTransferResponseSchemaFName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("monthlyByteCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "monthlyByteCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("monthlyIByteCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "monthlyIByteCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("monthlyITransferCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "monthlyITransferCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("monthlyITransferFCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "monthlyITransferFCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("monthlyPByteCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "monthlyPByteCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("monthlyPTransferCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "monthlyPTransferCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("monthlyPTransferFCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "monthlyPTransferFCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("monthlyTransferCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "monthlyTransferCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pwdBatchUsersFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pwdBatchUsersFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pwdCheckCustomRules");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pwdCheckCustomRules"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pwdChkDBRules");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pwdChkDBRules"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pwdEmbeddedWordList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pwdEmbeddedWordList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pwdEnforceHistory");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pwdEnforceHistory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pwdExcludedWordList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pwdExcludedWordList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pwdMaxAge");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pwdMaxAge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pwdMaxLength");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pwdMaxLength"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pwdMinAge");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pwdMinAge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pwdMinLength");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pwdMinLength"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pwdNotifyUser");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pwdNotifyUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pwdNumberOfNumerics");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pwdNumberOfNumerics"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pwdNumberOfSpecials");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pwdNumberOfSpecials"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pwdNumberOfUniqueChars");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pwdNumberOfUniqueChars"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pwdRequiresUpperLower");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pwdRequiresUpperLower"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pwdResetExpiration");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pwdResetExpiration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pwdResetOption");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pwdResetOption"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("secureFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "secureFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("skipConfirmFirstTimeUser");
        elemField.setXmlName(new javax.xml.namespace.QName("", "skipConfirmFirstTimeUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sshTraceFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sshTraceFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sshTraceType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sshTraceType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("threshold");
        elemField.setXmlName(new javax.xml.namespace.QName("", "threshold"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thresholdAction");
        elemField.setXmlName(new javax.xml.namespace.QName("", "thresholdAction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thresholdIP");
        elemField.setXmlName(new javax.xml.namespace.QName("", "thresholdIP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thresholdUser");
        elemField.setXmlName(new javax.xml.namespace.QName("", "thresholdUser"));
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
        elemField.setFieldName("traceFlagLog4J");
        elemField.setXmlName(new javax.xml.namespace.QName("", "traceFlagLog4J"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferRequestSchemaFName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transferRequestSchemaFName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updateCache");
        elemField.setXmlName(new javax.xml.namespace.QName("", "updateCache"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updateMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("", "updateMethod"));
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
        elemField.setFieldName("weeklyByteCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "weeklyByteCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("weeklyIByteCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "weeklyIByteCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("weeklyITransferCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "weeklyITransferCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("weeklyITransferFCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "weeklyITransferFCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("weeklyPByteCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "weeklyPByteCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("weeklyPTransferCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "weeklyPTransferCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("weeklyPTransferFCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "weeklyPTransferFCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("weeklyTransferCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "weeklyTransferCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xferNotiEmailURL");
        elemField.setXmlName(new javax.xml.namespace.QName("", "xferNotiEmailURL"));
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
