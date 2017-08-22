/**
 * Node.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 11, 2014 (12:11:36 EDT) WSDL2Java emitter.
 */

package AdminClient;

public class Node  implements java.io.Serializable {
    private java.lang.String CFComputerName;

    private java.lang.String CFVersion;

    private java.lang.String DNIPass;

    private java.lang.String DNIPort;

    private java.lang.String DNIUser;

    private java.lang.String FTPCaseSensitive;

    private java.lang.String FTPKeepAliveInterval;

    private java.lang.String FTPPrivKey;

    private java.lang.String IPName;

    private java.lang.String IPPort;

    private java.lang.String MDNReceipt;

    private java.lang.String MDNSign;

    private java.lang.String PGPArmor;

    private java.lang.String PGPCompAlg;

    private java.lang.String PGPEnabled;

    private java.lang.String PGPEncryptAlg;

    private java.lang.String PGPHashAlg;

    private java.lang.String PGPPrivKey;

    private java.lang.String PGPSign;

    private java.lang.String PGPTextMode;

    private java.lang.String PGPVerifyServerSign;

    private java.lang.String PGPVerifySign;

    private java.lang.String SSHBlockSize;

    private java.lang.String SSHCompress;

    private java.lang.String SSHPoolingFlag;

    private java.lang.String SSHPrivKey;

    private java.lang.String bindIPAddress;

    private java.lang.String checkServerStatus;

    private java.lang.String clearCommandChannel;

    private java.lang.String collectInterval;

    private java.lang.String collectType;

    private java.lang.String collectionFlag;

    private java.lang.String compressType;

    private java.lang.String connectionSecurityType;

    private java.lang.String connectionSecurityTypePS;

    private java.lang.String context;

    private java.lang.String createdBy;

    private java.lang.String dataConnectionType;

    private AdminClient.DateTime dateCreated;

    private AdminClient.DateTime dateUpdated;

    private java.lang.String defaultEncryptType;

    private java.lang.String defaultLTTable;

    private java.lang.String defaultNTDomain;

    private java.lang.String defaultPass;

    private java.lang.String defaultRTTable;

    private java.lang.String defaultUser;

    private java.lang.String department;

    private java.lang.String description;

    private java.lang.String disableFlag;

    private java.lang.String extIPAddress;

    private java.lang.String ftpPoolingFlag;

    private java.lang.String ftpPoolingIdleTimeout;

    private java.lang.String hdfsAuth;

    private java.lang.String hdfsPrivKey;

    private java.lang.String hdfsUserName;

    private java.lang.String httpPrivKey;

    private java.lang.String httpProxyIpName;

    private java.lang.String httpProxyIpPort;

    private java.lang.String idOfLastCollect;

    private java.lang.String inEncAlg;

    private java.lang.String inSignAlg;

    private java.lang.String kerberosServers;

    private java.lang.String keyFlag;

    private java.lang.String krbProtocol;

    private AdminClient.DateTime lastFailServerStatusDate;

    private AdminClient.DateTime lastGoodServerStatusDate;

    private java.lang.String lastServerStatus;

    private AdminClient.DateTime lastServerStatusDate;

    private java.lang.String manageCFServerFlag;

    private java.lang.String name;

    private java.lang.String nodeType;

    private java.lang.String outChunking;

    private java.lang.String outCompAlg;

    private java.lang.String outDataType;

    private java.lang.String outEncAlg;

    private java.lang.String outSignAlg;

    private java.lang.String outTimeout;

    private java.lang.String partnerAS2ID;

    private java.lang.String pasvChecking;

    private java.lang.String portChecking;

    private java.lang.String priEncName;

    private java.lang.String priSignName;

    private java.lang.String priorServerStatus;

    private AdminClient.DateTime priorServerStatusDate;

    private java.lang.String psPrivKey;

    private java.lang.String pubEncCert;

    private java.lang.String pubSSLCert;

    private java.lang.String pubSignCert;

    private java.lang.String secureFlag;

    private java.lang.String separateCollectThread;

    private AdminClient.DateTime serverExpiredEmailDate;

    private java.lang.String serverFileNamePrefix;

    private java.lang.String serverLicenseKey;

    private java.lang.String serverStatusFailCount;

    private java.lang.String serverStatusGoodCount;

    private java.lang.String serverType;

    private java.lang.String srvAS2ID;

    private java.lang.String sshPoolingIdleTimeout;

    private java.lang.String theClassName;

    private AdminClient.DateTime timeOfLastCollection;

    private java.lang.String traceFlag;

    private java.lang.String updatedBy;

    private java.lang.String useExtIPAddress;

    private java.lang.String userID;

    private java.lang.String visibility;

    public Node() {
    }

    public Node(
           java.lang.String CFComputerName,
           java.lang.String CFVersion,
           java.lang.String DNIPass,
           java.lang.String DNIPort,
           java.lang.String DNIUser,
           java.lang.String FTPCaseSensitive,
           java.lang.String FTPKeepAliveInterval,
           java.lang.String FTPPrivKey,
           java.lang.String IPName,
           java.lang.String IPPort,
           java.lang.String MDNReceipt,
           java.lang.String MDNSign,
           java.lang.String PGPArmor,
           java.lang.String PGPCompAlg,
           java.lang.String PGPEnabled,
           java.lang.String PGPEncryptAlg,
           java.lang.String PGPHashAlg,
           java.lang.String PGPPrivKey,
           java.lang.String PGPSign,
           java.lang.String PGPTextMode,
           java.lang.String PGPVerifyServerSign,
           java.lang.String PGPVerifySign,
           java.lang.String SSHBlockSize,
           java.lang.String SSHCompress,
           java.lang.String SSHPoolingFlag,
           java.lang.String SSHPrivKey,
           java.lang.String bindIPAddress,
           java.lang.String checkServerStatus,
           java.lang.String clearCommandChannel,
           java.lang.String collectInterval,
           java.lang.String collectType,
           java.lang.String collectionFlag,
           java.lang.String compressType,
           java.lang.String connectionSecurityType,
           java.lang.String connectionSecurityTypePS,
           java.lang.String context,
           java.lang.String createdBy,
           java.lang.String dataConnectionType,
           AdminClient.DateTime dateCreated,
           AdminClient.DateTime dateUpdated,
           java.lang.String defaultEncryptType,
           java.lang.String defaultLTTable,
           java.lang.String defaultNTDomain,
           java.lang.String defaultPass,
           java.lang.String defaultRTTable,
           java.lang.String defaultUser,
           java.lang.String department,
           java.lang.String description,
           java.lang.String disableFlag,
           java.lang.String extIPAddress,
           java.lang.String ftpPoolingFlag,
           java.lang.String ftpPoolingIdleTimeout,
           java.lang.String hdfsAuth,
           java.lang.String hdfsPrivKey,
           java.lang.String hdfsUserName,
           java.lang.String httpPrivKey,
           java.lang.String httpProxyIpName,
           java.lang.String httpProxyIpPort,
           java.lang.String idOfLastCollect,
           java.lang.String inEncAlg,
           java.lang.String inSignAlg,
           java.lang.String kerberosServers,
           java.lang.String keyFlag,
           java.lang.String krbProtocol,
           AdminClient.DateTime lastFailServerStatusDate,
           AdminClient.DateTime lastGoodServerStatusDate,
           java.lang.String lastServerStatus,
           AdminClient.DateTime lastServerStatusDate,
           java.lang.String manageCFServerFlag,
           java.lang.String name,
           java.lang.String nodeType,
           java.lang.String outChunking,
           java.lang.String outCompAlg,
           java.lang.String outDataType,
           java.lang.String outEncAlg,
           java.lang.String outSignAlg,
           java.lang.String outTimeout,
           java.lang.String partnerAS2ID,
           java.lang.String pasvChecking,
           java.lang.String portChecking,
           java.lang.String priEncName,
           java.lang.String priSignName,
           java.lang.String priorServerStatus,
           AdminClient.DateTime priorServerStatusDate,
           java.lang.String psPrivKey,
           java.lang.String pubEncCert,
           java.lang.String pubSSLCert,
           java.lang.String pubSignCert,
           java.lang.String secureFlag,
           java.lang.String separateCollectThread,
           AdminClient.DateTime serverExpiredEmailDate,
           java.lang.String serverFileNamePrefix,
           java.lang.String serverLicenseKey,
           java.lang.String serverStatusFailCount,
           java.lang.String serverStatusGoodCount,
           java.lang.String serverType,
           java.lang.String srvAS2ID,
           java.lang.String sshPoolingIdleTimeout,
           java.lang.String theClassName,
           AdminClient.DateTime timeOfLastCollection,
           java.lang.String traceFlag,
           java.lang.String updatedBy,
           java.lang.String useExtIPAddress,
           java.lang.String userID,
           java.lang.String visibility) {
           this.CFComputerName = CFComputerName;
           this.CFVersion = CFVersion;
           this.DNIPass = DNIPass;
           this.DNIPort = DNIPort;
           this.DNIUser = DNIUser;
           this.FTPCaseSensitive = FTPCaseSensitive;
           this.FTPKeepAliveInterval = FTPKeepAliveInterval;
           this.FTPPrivKey = FTPPrivKey;
           this.IPName = IPName;
           this.IPPort = IPPort;
           this.MDNReceipt = MDNReceipt;
           this.MDNSign = MDNSign;
           this.PGPArmor = PGPArmor;
           this.PGPCompAlg = PGPCompAlg;
           this.PGPEnabled = PGPEnabled;
           this.PGPEncryptAlg = PGPEncryptAlg;
           this.PGPHashAlg = PGPHashAlg;
           this.PGPPrivKey = PGPPrivKey;
           this.PGPSign = PGPSign;
           this.PGPTextMode = PGPTextMode;
           this.PGPVerifyServerSign = PGPVerifyServerSign;
           this.PGPVerifySign = PGPVerifySign;
           this.SSHBlockSize = SSHBlockSize;
           this.SSHCompress = SSHCompress;
           this.SSHPoolingFlag = SSHPoolingFlag;
           this.SSHPrivKey = SSHPrivKey;
           this.bindIPAddress = bindIPAddress;
           this.checkServerStatus = checkServerStatus;
           this.clearCommandChannel = clearCommandChannel;
           this.collectInterval = collectInterval;
           this.collectType = collectType;
           this.collectionFlag = collectionFlag;
           this.compressType = compressType;
           this.connectionSecurityType = connectionSecurityType;
           this.connectionSecurityTypePS = connectionSecurityTypePS;
           this.context = context;
           this.createdBy = createdBy;
           this.dataConnectionType = dataConnectionType;
           this.dateCreated = dateCreated;
           this.dateUpdated = dateUpdated;
           this.defaultEncryptType = defaultEncryptType;
           this.defaultLTTable = defaultLTTable;
           this.defaultNTDomain = defaultNTDomain;
           this.defaultPass = defaultPass;
           this.defaultRTTable = defaultRTTable;
           this.defaultUser = defaultUser;
           this.department = department;
           this.description = description;
           this.disableFlag = disableFlag;
           this.extIPAddress = extIPAddress;
           this.ftpPoolingFlag = ftpPoolingFlag;
           this.ftpPoolingIdleTimeout = ftpPoolingIdleTimeout;
           this.hdfsAuth = hdfsAuth;
           this.hdfsPrivKey = hdfsPrivKey;
           this.hdfsUserName = hdfsUserName;
           this.httpPrivKey = httpPrivKey;
           this.httpProxyIpName = httpProxyIpName;
           this.httpProxyIpPort = httpProxyIpPort;
           this.idOfLastCollect = idOfLastCollect;
           this.inEncAlg = inEncAlg;
           this.inSignAlg = inSignAlg;
           this.kerberosServers = kerberosServers;
           this.keyFlag = keyFlag;
           this.krbProtocol = krbProtocol;
           this.lastFailServerStatusDate = lastFailServerStatusDate;
           this.lastGoodServerStatusDate = lastGoodServerStatusDate;
           this.lastServerStatus = lastServerStatus;
           this.lastServerStatusDate = lastServerStatusDate;
           this.manageCFServerFlag = manageCFServerFlag;
           this.name = name;
           this.nodeType = nodeType;
           this.outChunking = outChunking;
           this.outCompAlg = outCompAlg;
           this.outDataType = outDataType;
           this.outEncAlg = outEncAlg;
           this.outSignAlg = outSignAlg;
           this.outTimeout = outTimeout;
           this.partnerAS2ID = partnerAS2ID;
           this.pasvChecking = pasvChecking;
           this.portChecking = portChecking;
           this.priEncName = priEncName;
           this.priSignName = priSignName;
           this.priorServerStatus = priorServerStatus;
           this.priorServerStatusDate = priorServerStatusDate;
           this.psPrivKey = psPrivKey;
           this.pubEncCert = pubEncCert;
           this.pubSSLCert = pubSSLCert;
           this.pubSignCert = pubSignCert;
           this.secureFlag = secureFlag;
           this.separateCollectThread = separateCollectThread;
           this.serverExpiredEmailDate = serverExpiredEmailDate;
           this.serverFileNamePrefix = serverFileNamePrefix;
           this.serverLicenseKey = serverLicenseKey;
           this.serverStatusFailCount = serverStatusFailCount;
           this.serverStatusGoodCount = serverStatusGoodCount;
           this.serverType = serverType;
           this.srvAS2ID = srvAS2ID;
           this.sshPoolingIdleTimeout = sshPoolingIdleTimeout;
           this.theClassName = theClassName;
           this.timeOfLastCollection = timeOfLastCollection;
           this.traceFlag = traceFlag;
           this.updatedBy = updatedBy;
           this.useExtIPAddress = useExtIPAddress;
           this.userID = userID;
           this.visibility = visibility;
    }


    /**
     * Gets the CFComputerName value for this Node.
     * 
     * @return CFComputerName
     */
    public java.lang.String getCFComputerName() {
        return CFComputerName;
    }


    /**
     * Sets the CFComputerName value for this Node.
     * 
     * @param CFComputerName
     */
    public void setCFComputerName(java.lang.String CFComputerName) {
        this.CFComputerName = CFComputerName;
    }


    /**
     * Gets the CFVersion value for this Node.
     * 
     * @return CFVersion
     */
    public java.lang.String getCFVersion() {
        return CFVersion;
    }


    /**
     * Sets the CFVersion value for this Node.
     * 
     * @param CFVersion
     */
    public void setCFVersion(java.lang.String CFVersion) {
        this.CFVersion = CFVersion;
    }


    /**
     * Gets the DNIPass value for this Node.
     * 
     * @return DNIPass
     */
    public java.lang.String getDNIPass() {
        return DNIPass;
    }


    /**
     * Sets the DNIPass value for this Node.
     * 
     * @param DNIPass
     */
    public void setDNIPass(java.lang.String DNIPass) {
        this.DNIPass = DNIPass;
    }


    /**
     * Gets the DNIPort value for this Node.
     * 
     * @return DNIPort
     */
    public java.lang.String getDNIPort() {
        return DNIPort;
    }


    /**
     * Sets the DNIPort value for this Node.
     * 
     * @param DNIPort
     */
    public void setDNIPort(java.lang.String DNIPort) {
        this.DNIPort = DNIPort;
    }


    /**
     * Gets the DNIUser value for this Node.
     * 
     * @return DNIUser
     */
    public java.lang.String getDNIUser() {
        return DNIUser;
    }


    /**
     * Sets the DNIUser value for this Node.
     * 
     * @param DNIUser
     */
    public void setDNIUser(java.lang.String DNIUser) {
        this.DNIUser = DNIUser;
    }


    /**
     * Gets the FTPCaseSensitive value for this Node.
     * 
     * @return FTPCaseSensitive
     */
    public java.lang.String getFTPCaseSensitive() {
        return FTPCaseSensitive;
    }


    /**
     * Sets the FTPCaseSensitive value for this Node.
     * 
     * @param FTPCaseSensitive
     */
    public void setFTPCaseSensitive(java.lang.String FTPCaseSensitive) {
        this.FTPCaseSensitive = FTPCaseSensitive;
    }


    /**
     * Gets the FTPKeepAliveInterval value for this Node.
     * 
     * @return FTPKeepAliveInterval
     */
    public java.lang.String getFTPKeepAliveInterval() {
        return FTPKeepAliveInterval;
    }


    /**
     * Sets the FTPKeepAliveInterval value for this Node.
     * 
     * @param FTPKeepAliveInterval
     */
    public void setFTPKeepAliveInterval(java.lang.String FTPKeepAliveInterval) {
        this.FTPKeepAliveInterval = FTPKeepAliveInterval;
    }


    /**
     * Gets the FTPPrivKey value for this Node.
     * 
     * @return FTPPrivKey
     */
    public java.lang.String getFTPPrivKey() {
        return FTPPrivKey;
    }


    /**
     * Sets the FTPPrivKey value for this Node.
     * 
     * @param FTPPrivKey
     */
    public void setFTPPrivKey(java.lang.String FTPPrivKey) {
        this.FTPPrivKey = FTPPrivKey;
    }


    /**
     * Gets the IPName value for this Node.
     * 
     * @return IPName
     */
    public java.lang.String getIPName() {
        return IPName;
    }


    /**
     * Sets the IPName value for this Node.
     * 
     * @param IPName
     */
    public void setIPName(java.lang.String IPName) {
        this.IPName = IPName;
    }


    /**
     * Gets the IPPort value for this Node.
     * 
     * @return IPPort
     */
    public java.lang.String getIPPort() {
        return IPPort;
    }


    /**
     * Sets the IPPort value for this Node.
     * 
     * @param IPPort
     */
    public void setIPPort(java.lang.String IPPort) {
        this.IPPort = IPPort;
    }


    /**
     * Gets the MDNReceipt value for this Node.
     * 
     * @return MDNReceipt
     */
    public java.lang.String getMDNReceipt() {
        return MDNReceipt;
    }


    /**
     * Sets the MDNReceipt value for this Node.
     * 
     * @param MDNReceipt
     */
    public void setMDNReceipt(java.lang.String MDNReceipt) {
        this.MDNReceipt = MDNReceipt;
    }


    /**
     * Gets the MDNSign value for this Node.
     * 
     * @return MDNSign
     */
    public java.lang.String getMDNSign() {
        return MDNSign;
    }


    /**
     * Sets the MDNSign value for this Node.
     * 
     * @param MDNSign
     */
    public void setMDNSign(java.lang.String MDNSign) {
        this.MDNSign = MDNSign;
    }


    /**
     * Gets the PGPArmor value for this Node.
     * 
     * @return PGPArmor
     */
    public java.lang.String getPGPArmor() {
        return PGPArmor;
    }


    /**
     * Sets the PGPArmor value for this Node.
     * 
     * @param PGPArmor
     */
    public void setPGPArmor(java.lang.String PGPArmor) {
        this.PGPArmor = PGPArmor;
    }


    /**
     * Gets the PGPCompAlg value for this Node.
     * 
     * @return PGPCompAlg
     */
    public java.lang.String getPGPCompAlg() {
        return PGPCompAlg;
    }


    /**
     * Sets the PGPCompAlg value for this Node.
     * 
     * @param PGPCompAlg
     */
    public void setPGPCompAlg(java.lang.String PGPCompAlg) {
        this.PGPCompAlg = PGPCompAlg;
    }


    /**
     * Gets the PGPEnabled value for this Node.
     * 
     * @return PGPEnabled
     */
    public java.lang.String getPGPEnabled() {
        return PGPEnabled;
    }


    /**
     * Sets the PGPEnabled value for this Node.
     * 
     * @param PGPEnabled
     */
    public void setPGPEnabled(java.lang.String PGPEnabled) {
        this.PGPEnabled = PGPEnabled;
    }


    /**
     * Gets the PGPEncryptAlg value for this Node.
     * 
     * @return PGPEncryptAlg
     */
    public java.lang.String getPGPEncryptAlg() {
        return PGPEncryptAlg;
    }


    /**
     * Sets the PGPEncryptAlg value for this Node.
     * 
     * @param PGPEncryptAlg
     */
    public void setPGPEncryptAlg(java.lang.String PGPEncryptAlg) {
        this.PGPEncryptAlg = PGPEncryptAlg;
    }


    /**
     * Gets the PGPHashAlg value for this Node.
     * 
     * @return PGPHashAlg
     */
    public java.lang.String getPGPHashAlg() {
        return PGPHashAlg;
    }


    /**
     * Sets the PGPHashAlg value for this Node.
     * 
     * @param PGPHashAlg
     */
    public void setPGPHashAlg(java.lang.String PGPHashAlg) {
        this.PGPHashAlg = PGPHashAlg;
    }


    /**
     * Gets the PGPPrivKey value for this Node.
     * 
     * @return PGPPrivKey
     */
    public java.lang.String getPGPPrivKey() {
        return PGPPrivKey;
    }


    /**
     * Sets the PGPPrivKey value for this Node.
     * 
     * @param PGPPrivKey
     */
    public void setPGPPrivKey(java.lang.String PGPPrivKey) {
        this.PGPPrivKey = PGPPrivKey;
    }


    /**
     * Gets the PGPSign value for this Node.
     * 
     * @return PGPSign
     */
    public java.lang.String getPGPSign() {
        return PGPSign;
    }


    /**
     * Sets the PGPSign value for this Node.
     * 
     * @param PGPSign
     */
    public void setPGPSign(java.lang.String PGPSign) {
        this.PGPSign = PGPSign;
    }


    /**
     * Gets the PGPTextMode value for this Node.
     * 
     * @return PGPTextMode
     */
    public java.lang.String getPGPTextMode() {
        return PGPTextMode;
    }


    /**
     * Sets the PGPTextMode value for this Node.
     * 
     * @param PGPTextMode
     */
    public void setPGPTextMode(java.lang.String PGPTextMode) {
        this.PGPTextMode = PGPTextMode;
    }


    /**
     * Gets the PGPVerifyServerSign value for this Node.
     * 
     * @return PGPVerifyServerSign
     */
    public java.lang.String getPGPVerifyServerSign() {
        return PGPVerifyServerSign;
    }


    /**
     * Sets the PGPVerifyServerSign value for this Node.
     * 
     * @param PGPVerifyServerSign
     */
    public void setPGPVerifyServerSign(java.lang.String PGPVerifyServerSign) {
        this.PGPVerifyServerSign = PGPVerifyServerSign;
    }


    /**
     * Gets the PGPVerifySign value for this Node.
     * 
     * @return PGPVerifySign
     */
    public java.lang.String getPGPVerifySign() {
        return PGPVerifySign;
    }


    /**
     * Sets the PGPVerifySign value for this Node.
     * 
     * @param PGPVerifySign
     */
    public void setPGPVerifySign(java.lang.String PGPVerifySign) {
        this.PGPVerifySign = PGPVerifySign;
    }


    /**
     * Gets the SSHBlockSize value for this Node.
     * 
     * @return SSHBlockSize
     */
    public java.lang.String getSSHBlockSize() {
        return SSHBlockSize;
    }


    /**
     * Sets the SSHBlockSize value for this Node.
     * 
     * @param SSHBlockSize
     */
    public void setSSHBlockSize(java.lang.String SSHBlockSize) {
        this.SSHBlockSize = SSHBlockSize;
    }


    /**
     * Gets the SSHCompress value for this Node.
     * 
     * @return SSHCompress
     */
    public java.lang.String getSSHCompress() {
        return SSHCompress;
    }


    /**
     * Sets the SSHCompress value for this Node.
     * 
     * @param SSHCompress
     */
    public void setSSHCompress(java.lang.String SSHCompress) {
        this.SSHCompress = SSHCompress;
    }


    /**
     * Gets the SSHPoolingFlag value for this Node.
     * 
     * @return SSHPoolingFlag
     */
    public java.lang.String getSSHPoolingFlag() {
        return SSHPoolingFlag;
    }


    /**
     * Sets the SSHPoolingFlag value for this Node.
     * 
     * @param SSHPoolingFlag
     */
    public void setSSHPoolingFlag(java.lang.String SSHPoolingFlag) {
        this.SSHPoolingFlag = SSHPoolingFlag;
    }


    /**
     * Gets the SSHPrivKey value for this Node.
     * 
     * @return SSHPrivKey
     */
    public java.lang.String getSSHPrivKey() {
        return SSHPrivKey;
    }


    /**
     * Sets the SSHPrivKey value for this Node.
     * 
     * @param SSHPrivKey
     */
    public void setSSHPrivKey(java.lang.String SSHPrivKey) {
        this.SSHPrivKey = SSHPrivKey;
    }


    /**
     * Gets the bindIPAddress value for this Node.
     * 
     * @return bindIPAddress
     */
    public java.lang.String getBindIPAddress() {
        return bindIPAddress;
    }


    /**
     * Sets the bindIPAddress value for this Node.
     * 
     * @param bindIPAddress
     */
    public void setBindIPAddress(java.lang.String bindIPAddress) {
        this.bindIPAddress = bindIPAddress;
    }


    /**
     * Gets the checkServerStatus value for this Node.
     * 
     * @return checkServerStatus
     */
    public java.lang.String getCheckServerStatus() {
        return checkServerStatus;
    }


    /**
     * Sets the checkServerStatus value for this Node.
     * 
     * @param checkServerStatus
     */
    public void setCheckServerStatus(java.lang.String checkServerStatus) {
        this.checkServerStatus = checkServerStatus;
    }


    /**
     * Gets the clearCommandChannel value for this Node.
     * 
     * @return clearCommandChannel
     */
    public java.lang.String getClearCommandChannel() {
        return clearCommandChannel;
    }


    /**
     * Sets the clearCommandChannel value for this Node.
     * 
     * @param clearCommandChannel
     */
    public void setClearCommandChannel(java.lang.String clearCommandChannel) {
        this.clearCommandChannel = clearCommandChannel;
    }


    /**
     * Gets the collectInterval value for this Node.
     * 
     * @return collectInterval
     */
    public java.lang.String getCollectInterval() {
        return collectInterval;
    }


    /**
     * Sets the collectInterval value for this Node.
     * 
     * @param collectInterval
     */
    public void setCollectInterval(java.lang.String collectInterval) {
        this.collectInterval = collectInterval;
    }


    /**
     * Gets the collectType value for this Node.
     * 
     * @return collectType
     */
    public java.lang.String getCollectType() {
        return collectType;
    }


    /**
     * Sets the collectType value for this Node.
     * 
     * @param collectType
     */
    public void setCollectType(java.lang.String collectType) {
        this.collectType = collectType;
    }


    /**
     * Gets the collectionFlag value for this Node.
     * 
     * @return collectionFlag
     */
    public java.lang.String getCollectionFlag() {
        return collectionFlag;
    }


    /**
     * Sets the collectionFlag value for this Node.
     * 
     * @param collectionFlag
     */
    public void setCollectionFlag(java.lang.String collectionFlag) {
        this.collectionFlag = collectionFlag;
    }


    /**
     * Gets the compressType value for this Node.
     * 
     * @return compressType
     */
    public java.lang.String getCompressType() {
        return compressType;
    }


    /**
     * Sets the compressType value for this Node.
     * 
     * @param compressType
     */
    public void setCompressType(java.lang.String compressType) {
        this.compressType = compressType;
    }


    /**
     * Gets the connectionSecurityType value for this Node.
     * 
     * @return connectionSecurityType
     */
    public java.lang.String getConnectionSecurityType() {
        return connectionSecurityType;
    }


    /**
     * Sets the connectionSecurityType value for this Node.
     * 
     * @param connectionSecurityType
     */
    public void setConnectionSecurityType(java.lang.String connectionSecurityType) {
        this.connectionSecurityType = connectionSecurityType;
    }


    /**
     * Gets the connectionSecurityTypePS value for this Node.
     * 
     * @return connectionSecurityTypePS
     */
    public java.lang.String getConnectionSecurityTypePS() {
        return connectionSecurityTypePS;
    }


    /**
     * Sets the connectionSecurityTypePS value for this Node.
     * 
     * @param connectionSecurityTypePS
     */
    public void setConnectionSecurityTypePS(java.lang.String connectionSecurityTypePS) {
        this.connectionSecurityTypePS = connectionSecurityTypePS;
    }


    /**
     * Gets the context value for this Node.
     * 
     * @return context
     */
    public java.lang.String getContext() {
        return context;
    }


    /**
     * Sets the context value for this Node.
     * 
     * @param context
     */
    public void setContext(java.lang.String context) {
        this.context = context;
    }


    /**
     * Gets the createdBy value for this Node.
     * 
     * @return createdBy
     */
    public java.lang.String getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this Node.
     * 
     * @param createdBy
     */
    public void setCreatedBy(java.lang.String createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the dataConnectionType value for this Node.
     * 
     * @return dataConnectionType
     */
    public java.lang.String getDataConnectionType() {
        return dataConnectionType;
    }


    /**
     * Sets the dataConnectionType value for this Node.
     * 
     * @param dataConnectionType
     */
    public void setDataConnectionType(java.lang.String dataConnectionType) {
        this.dataConnectionType = dataConnectionType;
    }


    /**
     * Gets the dateCreated value for this Node.
     * 
     * @return dateCreated
     */
    public AdminClient.DateTime getDateCreated() {
        return dateCreated;
    }


    /**
     * Sets the dateCreated value for this Node.
     * 
     * @param dateCreated
     */
    public void setDateCreated(AdminClient.DateTime dateCreated) {
        this.dateCreated = dateCreated;
    }


    /**
     * Gets the dateUpdated value for this Node.
     * 
     * @return dateUpdated
     */
    public AdminClient.DateTime getDateUpdated() {
        return dateUpdated;
    }


    /**
     * Sets the dateUpdated value for this Node.
     * 
     * @param dateUpdated
     */
    public void setDateUpdated(AdminClient.DateTime dateUpdated) {
        this.dateUpdated = dateUpdated;
    }


    /**
     * Gets the defaultEncryptType value for this Node.
     * 
     * @return defaultEncryptType
     */
    public java.lang.String getDefaultEncryptType() {
        return defaultEncryptType;
    }


    /**
     * Sets the defaultEncryptType value for this Node.
     * 
     * @param defaultEncryptType
     */
    public void setDefaultEncryptType(java.lang.String defaultEncryptType) {
        this.defaultEncryptType = defaultEncryptType;
    }


    /**
     * Gets the defaultLTTable value for this Node.
     * 
     * @return defaultLTTable
     */
    public java.lang.String getDefaultLTTable() {
        return defaultLTTable;
    }


    /**
     * Sets the defaultLTTable value for this Node.
     * 
     * @param defaultLTTable
     */
    public void setDefaultLTTable(java.lang.String defaultLTTable) {
        this.defaultLTTable = defaultLTTable;
    }


    /**
     * Gets the defaultNTDomain value for this Node.
     * 
     * @return defaultNTDomain
     */
    public java.lang.String getDefaultNTDomain() {
        return defaultNTDomain;
    }


    /**
     * Sets the defaultNTDomain value for this Node.
     * 
     * @param defaultNTDomain
     */
    public void setDefaultNTDomain(java.lang.String defaultNTDomain) {
        this.defaultNTDomain = defaultNTDomain;
    }


    /**
     * Gets the defaultPass value for this Node.
     * 
     * @return defaultPass
     */
    public java.lang.String getDefaultPass() {
        return defaultPass;
    }


    /**
     * Sets the defaultPass value for this Node.
     * 
     * @param defaultPass
     */
    public void setDefaultPass(java.lang.String defaultPass) {
        this.defaultPass = defaultPass;
    }


    /**
     * Gets the defaultRTTable value for this Node.
     * 
     * @return defaultRTTable
     */
    public java.lang.String getDefaultRTTable() {
        return defaultRTTable;
    }


    /**
     * Sets the defaultRTTable value for this Node.
     * 
     * @param defaultRTTable
     */
    public void setDefaultRTTable(java.lang.String defaultRTTable) {
        this.defaultRTTable = defaultRTTable;
    }


    /**
     * Gets the defaultUser value for this Node.
     * 
     * @return defaultUser
     */
    public java.lang.String getDefaultUser() {
        return defaultUser;
    }


    /**
     * Sets the defaultUser value for this Node.
     * 
     * @param defaultUser
     */
    public void setDefaultUser(java.lang.String defaultUser) {
        this.defaultUser = defaultUser;
    }


    /**
     * Gets the department value for this Node.
     * 
     * @return department
     */
    public java.lang.String getDepartment() {
        return department;
    }


    /**
     * Sets the department value for this Node.
     * 
     * @param department
     */
    public void setDepartment(java.lang.String department) {
        this.department = department;
    }


    /**
     * Gets the description value for this Node.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Node.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the disableFlag value for this Node.
     * 
     * @return disableFlag
     */
    public java.lang.String getDisableFlag() {
        return disableFlag;
    }


    /**
     * Sets the disableFlag value for this Node.
     * 
     * @param disableFlag
     */
    public void setDisableFlag(java.lang.String disableFlag) {
        this.disableFlag = disableFlag;
    }


    /**
     * Gets the extIPAddress value for this Node.
     * 
     * @return extIPAddress
     */
    public java.lang.String getExtIPAddress() {
        return extIPAddress;
    }


    /**
     * Sets the extIPAddress value for this Node.
     * 
     * @param extIPAddress
     */
    public void setExtIPAddress(java.lang.String extIPAddress) {
        this.extIPAddress = extIPAddress;
    }


    /**
     * Gets the ftpPoolingFlag value for this Node.
     * 
     * @return ftpPoolingFlag
     */
    public java.lang.String getFtpPoolingFlag() {
        return ftpPoolingFlag;
    }


    /**
     * Sets the ftpPoolingFlag value for this Node.
     * 
     * @param ftpPoolingFlag
     */
    public void setFtpPoolingFlag(java.lang.String ftpPoolingFlag) {
        this.ftpPoolingFlag = ftpPoolingFlag;
    }


    /**
     * Gets the ftpPoolingIdleTimeout value for this Node.
     * 
     * @return ftpPoolingIdleTimeout
     */
    public java.lang.String getFtpPoolingIdleTimeout() {
        return ftpPoolingIdleTimeout;
    }


    /**
     * Sets the ftpPoolingIdleTimeout value for this Node.
     * 
     * @param ftpPoolingIdleTimeout
     */
    public void setFtpPoolingIdleTimeout(java.lang.String ftpPoolingIdleTimeout) {
        this.ftpPoolingIdleTimeout = ftpPoolingIdleTimeout;
    }


    /**
     * Gets the hdfsAuth value for this Node.
     * 
     * @return hdfsAuth
     */
    public java.lang.String getHdfsAuth() {
        return hdfsAuth;
    }


    /**
     * Sets the hdfsAuth value for this Node.
     * 
     * @param hdfsAuth
     */
    public void setHdfsAuth(java.lang.String hdfsAuth) {
        this.hdfsAuth = hdfsAuth;
    }


    /**
     * Gets the hdfsPrivKey value for this Node.
     * 
     * @return hdfsPrivKey
     */
    public java.lang.String getHdfsPrivKey() {
        return hdfsPrivKey;
    }


    /**
     * Sets the hdfsPrivKey value for this Node.
     * 
     * @param hdfsPrivKey
     */
    public void setHdfsPrivKey(java.lang.String hdfsPrivKey) {
        this.hdfsPrivKey = hdfsPrivKey;
    }


    /**
     * Gets the hdfsUserName value for this Node.
     * 
     * @return hdfsUserName
     */
    public java.lang.String getHdfsUserName() {
        return hdfsUserName;
    }


    /**
     * Sets the hdfsUserName value for this Node.
     * 
     * @param hdfsUserName
     */
    public void setHdfsUserName(java.lang.String hdfsUserName) {
        this.hdfsUserName = hdfsUserName;
    }


    /**
     * Gets the httpPrivKey value for this Node.
     * 
     * @return httpPrivKey
     */
    public java.lang.String getHttpPrivKey() {
        return httpPrivKey;
    }


    /**
     * Sets the httpPrivKey value for this Node.
     * 
     * @param httpPrivKey
     */
    public void setHttpPrivKey(java.lang.String httpPrivKey) {
        this.httpPrivKey = httpPrivKey;
    }


    /**
     * Gets the httpProxyIpName value for this Node.
     * 
     * @return httpProxyIpName
     */
    public java.lang.String getHttpProxyIpName() {
        return httpProxyIpName;
    }


    /**
     * Sets the httpProxyIpName value for this Node.
     * 
     * @param httpProxyIpName
     */
    public void setHttpProxyIpName(java.lang.String httpProxyIpName) {
        this.httpProxyIpName = httpProxyIpName;
    }


    /**
     * Gets the httpProxyIpPort value for this Node.
     * 
     * @return httpProxyIpPort
     */
    public java.lang.String getHttpProxyIpPort() {
        return httpProxyIpPort;
    }


    /**
     * Sets the httpProxyIpPort value for this Node.
     * 
     * @param httpProxyIpPort
     */
    public void setHttpProxyIpPort(java.lang.String httpProxyIpPort) {
        this.httpProxyIpPort = httpProxyIpPort;
    }


    /**
     * Gets the idOfLastCollect value for this Node.
     * 
     * @return idOfLastCollect
     */
    public java.lang.String getIdOfLastCollect() {
        return idOfLastCollect;
    }


    /**
     * Sets the idOfLastCollect value for this Node.
     * 
     * @param idOfLastCollect
     */
    public void setIdOfLastCollect(java.lang.String idOfLastCollect) {
        this.idOfLastCollect = idOfLastCollect;
    }


    /**
     * Gets the inEncAlg value for this Node.
     * 
     * @return inEncAlg
     */
    public java.lang.String getInEncAlg() {
        return inEncAlg;
    }


    /**
     * Sets the inEncAlg value for this Node.
     * 
     * @param inEncAlg
     */
    public void setInEncAlg(java.lang.String inEncAlg) {
        this.inEncAlg = inEncAlg;
    }


    /**
     * Gets the inSignAlg value for this Node.
     * 
     * @return inSignAlg
     */
    public java.lang.String getInSignAlg() {
        return inSignAlg;
    }


    /**
     * Sets the inSignAlg value for this Node.
     * 
     * @param inSignAlg
     */
    public void setInSignAlg(java.lang.String inSignAlg) {
        this.inSignAlg = inSignAlg;
    }


    /**
     * Gets the kerberosServers value for this Node.
     * 
     * @return kerberosServers
     */
    public java.lang.String getKerberosServers() {
        return kerberosServers;
    }


    /**
     * Sets the kerberosServers value for this Node.
     * 
     * @param kerberosServers
     */
    public void setKerberosServers(java.lang.String kerberosServers) {
        this.kerberosServers = kerberosServers;
    }


    /**
     * Gets the keyFlag value for this Node.
     * 
     * @return keyFlag
     */
    public java.lang.String getKeyFlag() {
        return keyFlag;
    }


    /**
     * Sets the keyFlag value for this Node.
     * 
     * @param keyFlag
     */
    public void setKeyFlag(java.lang.String keyFlag) {
        this.keyFlag = keyFlag;
    }


    /**
     * Gets the krbProtocol value for this Node.
     * 
     * @return krbProtocol
     */
    public java.lang.String getKrbProtocol() {
        return krbProtocol;
    }


    /**
     * Sets the krbProtocol value for this Node.
     * 
     * @param krbProtocol
     */
    public void setKrbProtocol(java.lang.String krbProtocol) {
        this.krbProtocol = krbProtocol;
    }


    /**
     * Gets the lastFailServerStatusDate value for this Node.
     * 
     * @return lastFailServerStatusDate
     */
    public AdminClient.DateTime getLastFailServerStatusDate() {
        return lastFailServerStatusDate;
    }


    /**
     * Sets the lastFailServerStatusDate value for this Node.
     * 
     * @param lastFailServerStatusDate
     */
    public void setLastFailServerStatusDate(AdminClient.DateTime lastFailServerStatusDate) {
        this.lastFailServerStatusDate = lastFailServerStatusDate;
    }


    /**
     * Gets the lastGoodServerStatusDate value for this Node.
     * 
     * @return lastGoodServerStatusDate
     */
    public AdminClient.DateTime getLastGoodServerStatusDate() {
        return lastGoodServerStatusDate;
    }


    /**
     * Sets the lastGoodServerStatusDate value for this Node.
     * 
     * @param lastGoodServerStatusDate
     */
    public void setLastGoodServerStatusDate(AdminClient.DateTime lastGoodServerStatusDate) {
        this.lastGoodServerStatusDate = lastGoodServerStatusDate;
    }


    /**
     * Gets the lastServerStatus value for this Node.
     * 
     * @return lastServerStatus
     */
    public java.lang.String getLastServerStatus() {
        return lastServerStatus;
    }


    /**
     * Sets the lastServerStatus value for this Node.
     * 
     * @param lastServerStatus
     */
    public void setLastServerStatus(java.lang.String lastServerStatus) {
        this.lastServerStatus = lastServerStatus;
    }


    /**
     * Gets the lastServerStatusDate value for this Node.
     * 
     * @return lastServerStatusDate
     */
    public AdminClient.DateTime getLastServerStatusDate() {
        return lastServerStatusDate;
    }


    /**
     * Sets the lastServerStatusDate value for this Node.
     * 
     * @param lastServerStatusDate
     */
    public void setLastServerStatusDate(AdminClient.DateTime lastServerStatusDate) {
        this.lastServerStatusDate = lastServerStatusDate;
    }


    /**
     * Gets the manageCFServerFlag value for this Node.
     * 
     * @return manageCFServerFlag
     */
    public java.lang.String getManageCFServerFlag() {
        return manageCFServerFlag;
    }


    /**
     * Sets the manageCFServerFlag value for this Node.
     * 
     * @param manageCFServerFlag
     */
    public void setManageCFServerFlag(java.lang.String manageCFServerFlag) {
        this.manageCFServerFlag = manageCFServerFlag;
    }


    /**
     * Gets the name value for this Node.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Node.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the nodeType value for this Node.
     * 
     * @return nodeType
     */
    public java.lang.String getNodeType() {
        return nodeType;
    }


    /**
     * Sets the nodeType value for this Node.
     * 
     * @param nodeType
     */
    public void setNodeType(java.lang.String nodeType) {
        this.nodeType = nodeType;
    }


    /**
     * Gets the outChunking value for this Node.
     * 
     * @return outChunking
     */
    public java.lang.String getOutChunking() {
        return outChunking;
    }


    /**
     * Sets the outChunking value for this Node.
     * 
     * @param outChunking
     */
    public void setOutChunking(java.lang.String outChunking) {
        this.outChunking = outChunking;
    }


    /**
     * Gets the outCompAlg value for this Node.
     * 
     * @return outCompAlg
     */
    public java.lang.String getOutCompAlg() {
        return outCompAlg;
    }


    /**
     * Sets the outCompAlg value for this Node.
     * 
     * @param outCompAlg
     */
    public void setOutCompAlg(java.lang.String outCompAlg) {
        this.outCompAlg = outCompAlg;
    }


    /**
     * Gets the outDataType value for this Node.
     * 
     * @return outDataType
     */
    public java.lang.String getOutDataType() {
        return outDataType;
    }


    /**
     * Sets the outDataType value for this Node.
     * 
     * @param outDataType
     */
    public void setOutDataType(java.lang.String outDataType) {
        this.outDataType = outDataType;
    }


    /**
     * Gets the outEncAlg value for this Node.
     * 
     * @return outEncAlg
     */
    public java.lang.String getOutEncAlg() {
        return outEncAlg;
    }


    /**
     * Sets the outEncAlg value for this Node.
     * 
     * @param outEncAlg
     */
    public void setOutEncAlg(java.lang.String outEncAlg) {
        this.outEncAlg = outEncAlg;
    }


    /**
     * Gets the outSignAlg value for this Node.
     * 
     * @return outSignAlg
     */
    public java.lang.String getOutSignAlg() {
        return outSignAlg;
    }


    /**
     * Sets the outSignAlg value for this Node.
     * 
     * @param outSignAlg
     */
    public void setOutSignAlg(java.lang.String outSignAlg) {
        this.outSignAlg = outSignAlg;
    }


    /**
     * Gets the outTimeout value for this Node.
     * 
     * @return outTimeout
     */
    public java.lang.String getOutTimeout() {
        return outTimeout;
    }


    /**
     * Sets the outTimeout value for this Node.
     * 
     * @param outTimeout
     */
    public void setOutTimeout(java.lang.String outTimeout) {
        this.outTimeout = outTimeout;
    }


    /**
     * Gets the partnerAS2ID value for this Node.
     * 
     * @return partnerAS2ID
     */
    public java.lang.String getPartnerAS2ID() {
        return partnerAS2ID;
    }


    /**
     * Sets the partnerAS2ID value for this Node.
     * 
     * @param partnerAS2ID
     */
    public void setPartnerAS2ID(java.lang.String partnerAS2ID) {
        this.partnerAS2ID = partnerAS2ID;
    }


    /**
     * Gets the pasvChecking value for this Node.
     * 
     * @return pasvChecking
     */
    public java.lang.String getPasvChecking() {
        return pasvChecking;
    }


    /**
     * Sets the pasvChecking value for this Node.
     * 
     * @param pasvChecking
     */
    public void setPasvChecking(java.lang.String pasvChecking) {
        this.pasvChecking = pasvChecking;
    }


    /**
     * Gets the portChecking value for this Node.
     * 
     * @return portChecking
     */
    public java.lang.String getPortChecking() {
        return portChecking;
    }


    /**
     * Sets the portChecking value for this Node.
     * 
     * @param portChecking
     */
    public void setPortChecking(java.lang.String portChecking) {
        this.portChecking = portChecking;
    }


    /**
     * Gets the priEncName value for this Node.
     * 
     * @return priEncName
     */
    public java.lang.String getPriEncName() {
        return priEncName;
    }


    /**
     * Sets the priEncName value for this Node.
     * 
     * @param priEncName
     */
    public void setPriEncName(java.lang.String priEncName) {
        this.priEncName = priEncName;
    }


    /**
     * Gets the priSignName value for this Node.
     * 
     * @return priSignName
     */
    public java.lang.String getPriSignName() {
        return priSignName;
    }


    /**
     * Sets the priSignName value for this Node.
     * 
     * @param priSignName
     */
    public void setPriSignName(java.lang.String priSignName) {
        this.priSignName = priSignName;
    }


    /**
     * Gets the priorServerStatus value for this Node.
     * 
     * @return priorServerStatus
     */
    public java.lang.String getPriorServerStatus() {
        return priorServerStatus;
    }


    /**
     * Sets the priorServerStatus value for this Node.
     * 
     * @param priorServerStatus
     */
    public void setPriorServerStatus(java.lang.String priorServerStatus) {
        this.priorServerStatus = priorServerStatus;
    }


    /**
     * Gets the priorServerStatusDate value for this Node.
     * 
     * @return priorServerStatusDate
     */
    public AdminClient.DateTime getPriorServerStatusDate() {
        return priorServerStatusDate;
    }


    /**
     * Sets the priorServerStatusDate value for this Node.
     * 
     * @param priorServerStatusDate
     */
    public void setPriorServerStatusDate(AdminClient.DateTime priorServerStatusDate) {
        this.priorServerStatusDate = priorServerStatusDate;
    }


    /**
     * Gets the psPrivKey value for this Node.
     * 
     * @return psPrivKey
     */
    public java.lang.String getPsPrivKey() {
        return psPrivKey;
    }


    /**
     * Sets the psPrivKey value for this Node.
     * 
     * @param psPrivKey
     */
    public void setPsPrivKey(java.lang.String psPrivKey) {
        this.psPrivKey = psPrivKey;
    }


    /**
     * Gets the pubEncCert value for this Node.
     * 
     * @return pubEncCert
     */
    public java.lang.String getPubEncCert() {
        return pubEncCert;
    }


    /**
     * Sets the pubEncCert value for this Node.
     * 
     * @param pubEncCert
     */
    public void setPubEncCert(java.lang.String pubEncCert) {
        this.pubEncCert = pubEncCert;
    }


    /**
     * Gets the pubSSLCert value for this Node.
     * 
     * @return pubSSLCert
     */
    public java.lang.String getPubSSLCert() {
        return pubSSLCert;
    }


    /**
     * Sets the pubSSLCert value for this Node.
     * 
     * @param pubSSLCert
     */
    public void setPubSSLCert(java.lang.String pubSSLCert) {
        this.pubSSLCert = pubSSLCert;
    }


    /**
     * Gets the pubSignCert value for this Node.
     * 
     * @return pubSignCert
     */
    public java.lang.String getPubSignCert() {
        return pubSignCert;
    }


    /**
     * Sets the pubSignCert value for this Node.
     * 
     * @param pubSignCert
     */
    public void setPubSignCert(java.lang.String pubSignCert) {
        this.pubSignCert = pubSignCert;
    }


    /**
     * Gets the secureFlag value for this Node.
     * 
     * @return secureFlag
     */
    public java.lang.String getSecureFlag() {
        return secureFlag;
    }


    /**
     * Sets the secureFlag value for this Node.
     * 
     * @param secureFlag
     */
    public void setSecureFlag(java.lang.String secureFlag) {
        this.secureFlag = secureFlag;
    }


    /**
     * Gets the separateCollectThread value for this Node.
     * 
     * @return separateCollectThread
     */
    public java.lang.String getSeparateCollectThread() {
        return separateCollectThread;
    }


    /**
     * Sets the separateCollectThread value for this Node.
     * 
     * @param separateCollectThread
     */
    public void setSeparateCollectThread(java.lang.String separateCollectThread) {
        this.separateCollectThread = separateCollectThread;
    }


    /**
     * Gets the serverExpiredEmailDate value for this Node.
     * 
     * @return serverExpiredEmailDate
     */
    public AdminClient.DateTime getServerExpiredEmailDate() {
        return serverExpiredEmailDate;
    }


    /**
     * Sets the serverExpiredEmailDate value for this Node.
     * 
     * @param serverExpiredEmailDate
     */
    public void setServerExpiredEmailDate(AdminClient.DateTime serverExpiredEmailDate) {
        this.serverExpiredEmailDate = serverExpiredEmailDate;
    }


    /**
     * Gets the serverFileNamePrefix value for this Node.
     * 
     * @return serverFileNamePrefix
     */
    public java.lang.String getServerFileNamePrefix() {
        return serverFileNamePrefix;
    }


    /**
     * Sets the serverFileNamePrefix value for this Node.
     * 
     * @param serverFileNamePrefix
     */
    public void setServerFileNamePrefix(java.lang.String serverFileNamePrefix) {
        this.serverFileNamePrefix = serverFileNamePrefix;
    }


    /**
     * Gets the serverLicenseKey value for this Node.
     * 
     * @return serverLicenseKey
     */
    public java.lang.String getServerLicenseKey() {
        return serverLicenseKey;
    }


    /**
     * Sets the serverLicenseKey value for this Node.
     * 
     * @param serverLicenseKey
     */
    public void setServerLicenseKey(java.lang.String serverLicenseKey) {
        this.serverLicenseKey = serverLicenseKey;
    }


    /**
     * Gets the serverStatusFailCount value for this Node.
     * 
     * @return serverStatusFailCount
     */
    public java.lang.String getServerStatusFailCount() {
        return serverStatusFailCount;
    }


    /**
     * Sets the serverStatusFailCount value for this Node.
     * 
     * @param serverStatusFailCount
     */
    public void setServerStatusFailCount(java.lang.String serverStatusFailCount) {
        this.serverStatusFailCount = serverStatusFailCount;
    }


    /**
     * Gets the serverStatusGoodCount value for this Node.
     * 
     * @return serverStatusGoodCount
     */
    public java.lang.String getServerStatusGoodCount() {
        return serverStatusGoodCount;
    }


    /**
     * Sets the serverStatusGoodCount value for this Node.
     * 
     * @param serverStatusGoodCount
     */
    public void setServerStatusGoodCount(java.lang.String serverStatusGoodCount) {
        this.serverStatusGoodCount = serverStatusGoodCount;
    }


    /**
     * Gets the serverType value for this Node.
     * 
     * @return serverType
     */
    public java.lang.String getServerType() {
        return serverType;
    }


    /**
     * Sets the serverType value for this Node.
     * 
     * @param serverType
     */
    public void setServerType(java.lang.String serverType) {
        this.serverType = serverType;
    }


    /**
     * Gets the srvAS2ID value for this Node.
     * 
     * @return srvAS2ID
     */
    public java.lang.String getSrvAS2ID() {
        return srvAS2ID;
    }


    /**
     * Sets the srvAS2ID value for this Node.
     * 
     * @param srvAS2ID
     */
    public void setSrvAS2ID(java.lang.String srvAS2ID) {
        this.srvAS2ID = srvAS2ID;
    }


    /**
     * Gets the sshPoolingIdleTimeout value for this Node.
     * 
     * @return sshPoolingIdleTimeout
     */
    public java.lang.String getSshPoolingIdleTimeout() {
        return sshPoolingIdleTimeout;
    }


    /**
     * Sets the sshPoolingIdleTimeout value for this Node.
     * 
     * @param sshPoolingIdleTimeout
     */
    public void setSshPoolingIdleTimeout(java.lang.String sshPoolingIdleTimeout) {
        this.sshPoolingIdleTimeout = sshPoolingIdleTimeout;
    }


    /**
     * Gets the theClassName value for this Node.
     * 
     * @return theClassName
     */
    public java.lang.String getTheClassName() {
        return theClassName;
    }


    /**
     * Sets the theClassName value for this Node.
     * 
     * @param theClassName
     */
    public void setTheClassName(java.lang.String theClassName) {
        this.theClassName = theClassName;
    }


    /**
     * Gets the timeOfLastCollection value for this Node.
     * 
     * @return timeOfLastCollection
     */
    public AdminClient.DateTime getTimeOfLastCollection() {
        return timeOfLastCollection;
    }


    /**
     * Sets the timeOfLastCollection value for this Node.
     * 
     * @param timeOfLastCollection
     */
    public void setTimeOfLastCollection(AdminClient.DateTime timeOfLastCollection) {
        this.timeOfLastCollection = timeOfLastCollection;
    }


    /**
     * Gets the traceFlag value for this Node.
     * 
     * @return traceFlag
     */
    public java.lang.String getTraceFlag() {
        return traceFlag;
    }


    /**
     * Sets the traceFlag value for this Node.
     * 
     * @param traceFlag
     */
    public void setTraceFlag(java.lang.String traceFlag) {
        this.traceFlag = traceFlag;
    }


    /**
     * Gets the updatedBy value for this Node.
     * 
     * @return updatedBy
     */
    public java.lang.String getUpdatedBy() {
        return updatedBy;
    }


    /**
     * Sets the updatedBy value for this Node.
     * 
     * @param updatedBy
     */
    public void setUpdatedBy(java.lang.String updatedBy) {
        this.updatedBy = updatedBy;
    }


    /**
     * Gets the useExtIPAddress value for this Node.
     * 
     * @return useExtIPAddress
     */
    public java.lang.String getUseExtIPAddress() {
        return useExtIPAddress;
    }


    /**
     * Sets the useExtIPAddress value for this Node.
     * 
     * @param useExtIPAddress
     */
    public void setUseExtIPAddress(java.lang.String useExtIPAddress) {
        this.useExtIPAddress = useExtIPAddress;
    }


    /**
     * Gets the userID value for this Node.
     * 
     * @return userID
     */
    public java.lang.String getUserID() {
        return userID;
    }


    /**
     * Sets the userID value for this Node.
     * 
     * @param userID
     */
    public void setUserID(java.lang.String userID) {
        this.userID = userID;
    }


    /**
     * Gets the visibility value for this Node.
     * 
     * @return visibility
     */
    public java.lang.String getVisibility() {
        return visibility;
    }


    /**
     * Sets the visibility value for this Node.
     * 
     * @param visibility
     */
    public void setVisibility(java.lang.String visibility) {
        this.visibility = visibility;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Node)) return false;
        Node other = (Node) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.CFComputerName==null && other.getCFComputerName()==null) || 
             (this.CFComputerName!=null &&
              this.CFComputerName.equals(other.getCFComputerName()))) &&
            ((this.CFVersion==null && other.getCFVersion()==null) || 
             (this.CFVersion!=null &&
              this.CFVersion.equals(other.getCFVersion()))) &&
            ((this.DNIPass==null && other.getDNIPass()==null) || 
             (this.DNIPass!=null &&
              this.DNIPass.equals(other.getDNIPass()))) &&
            ((this.DNIPort==null && other.getDNIPort()==null) || 
             (this.DNIPort!=null &&
              this.DNIPort.equals(other.getDNIPort()))) &&
            ((this.DNIUser==null && other.getDNIUser()==null) || 
             (this.DNIUser!=null &&
              this.DNIUser.equals(other.getDNIUser()))) &&
            ((this.FTPCaseSensitive==null && other.getFTPCaseSensitive()==null) || 
             (this.FTPCaseSensitive!=null &&
              this.FTPCaseSensitive.equals(other.getFTPCaseSensitive()))) &&
            ((this.FTPKeepAliveInterval==null && other.getFTPKeepAliveInterval()==null) || 
             (this.FTPKeepAliveInterval!=null &&
              this.FTPKeepAliveInterval.equals(other.getFTPKeepAliveInterval()))) &&
            ((this.FTPPrivKey==null && other.getFTPPrivKey()==null) || 
             (this.FTPPrivKey!=null &&
              this.FTPPrivKey.equals(other.getFTPPrivKey()))) &&
            ((this.IPName==null && other.getIPName()==null) || 
             (this.IPName!=null &&
              this.IPName.equals(other.getIPName()))) &&
            ((this.IPPort==null && other.getIPPort()==null) || 
             (this.IPPort!=null &&
              this.IPPort.equals(other.getIPPort()))) &&
            ((this.MDNReceipt==null && other.getMDNReceipt()==null) || 
             (this.MDNReceipt!=null &&
              this.MDNReceipt.equals(other.getMDNReceipt()))) &&
            ((this.MDNSign==null && other.getMDNSign()==null) || 
             (this.MDNSign!=null &&
              this.MDNSign.equals(other.getMDNSign()))) &&
            ((this.PGPArmor==null && other.getPGPArmor()==null) || 
             (this.PGPArmor!=null &&
              this.PGPArmor.equals(other.getPGPArmor()))) &&
            ((this.PGPCompAlg==null && other.getPGPCompAlg()==null) || 
             (this.PGPCompAlg!=null &&
              this.PGPCompAlg.equals(other.getPGPCompAlg()))) &&
            ((this.PGPEnabled==null && other.getPGPEnabled()==null) || 
             (this.PGPEnabled!=null &&
              this.PGPEnabled.equals(other.getPGPEnabled()))) &&
            ((this.PGPEncryptAlg==null && other.getPGPEncryptAlg()==null) || 
             (this.PGPEncryptAlg!=null &&
              this.PGPEncryptAlg.equals(other.getPGPEncryptAlg()))) &&
            ((this.PGPHashAlg==null && other.getPGPHashAlg()==null) || 
             (this.PGPHashAlg!=null &&
              this.PGPHashAlg.equals(other.getPGPHashAlg()))) &&
            ((this.PGPPrivKey==null && other.getPGPPrivKey()==null) || 
             (this.PGPPrivKey!=null &&
              this.PGPPrivKey.equals(other.getPGPPrivKey()))) &&
            ((this.PGPSign==null && other.getPGPSign()==null) || 
             (this.PGPSign!=null &&
              this.PGPSign.equals(other.getPGPSign()))) &&
            ((this.PGPTextMode==null && other.getPGPTextMode()==null) || 
             (this.PGPTextMode!=null &&
              this.PGPTextMode.equals(other.getPGPTextMode()))) &&
            ((this.PGPVerifyServerSign==null && other.getPGPVerifyServerSign()==null) || 
             (this.PGPVerifyServerSign!=null &&
              this.PGPVerifyServerSign.equals(other.getPGPVerifyServerSign()))) &&
            ((this.PGPVerifySign==null && other.getPGPVerifySign()==null) || 
             (this.PGPVerifySign!=null &&
              this.PGPVerifySign.equals(other.getPGPVerifySign()))) &&
            ((this.SSHBlockSize==null && other.getSSHBlockSize()==null) || 
             (this.SSHBlockSize!=null &&
              this.SSHBlockSize.equals(other.getSSHBlockSize()))) &&
            ((this.SSHCompress==null && other.getSSHCompress()==null) || 
             (this.SSHCompress!=null &&
              this.SSHCompress.equals(other.getSSHCompress()))) &&
            ((this.SSHPoolingFlag==null && other.getSSHPoolingFlag()==null) || 
             (this.SSHPoolingFlag!=null &&
              this.SSHPoolingFlag.equals(other.getSSHPoolingFlag()))) &&
            ((this.SSHPrivKey==null && other.getSSHPrivKey()==null) || 
             (this.SSHPrivKey!=null &&
              this.SSHPrivKey.equals(other.getSSHPrivKey()))) &&
            ((this.bindIPAddress==null && other.getBindIPAddress()==null) || 
             (this.bindIPAddress!=null &&
              this.bindIPAddress.equals(other.getBindIPAddress()))) &&
            ((this.checkServerStatus==null && other.getCheckServerStatus()==null) || 
             (this.checkServerStatus!=null &&
              this.checkServerStatus.equals(other.getCheckServerStatus()))) &&
            ((this.clearCommandChannel==null && other.getClearCommandChannel()==null) || 
             (this.clearCommandChannel!=null &&
              this.clearCommandChannel.equals(other.getClearCommandChannel()))) &&
            ((this.collectInterval==null && other.getCollectInterval()==null) || 
             (this.collectInterval!=null &&
              this.collectInterval.equals(other.getCollectInterval()))) &&
            ((this.collectType==null && other.getCollectType()==null) || 
             (this.collectType!=null &&
              this.collectType.equals(other.getCollectType()))) &&
            ((this.collectionFlag==null && other.getCollectionFlag()==null) || 
             (this.collectionFlag!=null &&
              this.collectionFlag.equals(other.getCollectionFlag()))) &&
            ((this.compressType==null && other.getCompressType()==null) || 
             (this.compressType!=null &&
              this.compressType.equals(other.getCompressType()))) &&
            ((this.connectionSecurityType==null && other.getConnectionSecurityType()==null) || 
             (this.connectionSecurityType!=null &&
              this.connectionSecurityType.equals(other.getConnectionSecurityType()))) &&
            ((this.connectionSecurityTypePS==null && other.getConnectionSecurityTypePS()==null) || 
             (this.connectionSecurityTypePS!=null &&
              this.connectionSecurityTypePS.equals(other.getConnectionSecurityTypePS()))) &&
            ((this.context==null && other.getContext()==null) || 
             (this.context!=null &&
              this.context.equals(other.getContext()))) &&
            ((this.createdBy==null && other.getCreatedBy()==null) || 
             (this.createdBy!=null &&
              this.createdBy.equals(other.getCreatedBy()))) &&
            ((this.dataConnectionType==null && other.getDataConnectionType()==null) || 
             (this.dataConnectionType!=null &&
              this.dataConnectionType.equals(other.getDataConnectionType()))) &&
            ((this.dateCreated==null && other.getDateCreated()==null) || 
             (this.dateCreated!=null &&
              this.dateCreated.equals(other.getDateCreated()))) &&
            ((this.dateUpdated==null && other.getDateUpdated()==null) || 
             (this.dateUpdated!=null &&
              this.dateUpdated.equals(other.getDateUpdated()))) &&
            ((this.defaultEncryptType==null && other.getDefaultEncryptType()==null) || 
             (this.defaultEncryptType!=null &&
              this.defaultEncryptType.equals(other.getDefaultEncryptType()))) &&
            ((this.defaultLTTable==null && other.getDefaultLTTable()==null) || 
             (this.defaultLTTable!=null &&
              this.defaultLTTable.equals(other.getDefaultLTTable()))) &&
            ((this.defaultNTDomain==null && other.getDefaultNTDomain()==null) || 
             (this.defaultNTDomain!=null &&
              this.defaultNTDomain.equals(other.getDefaultNTDomain()))) &&
            ((this.defaultPass==null && other.getDefaultPass()==null) || 
             (this.defaultPass!=null &&
              this.defaultPass.equals(other.getDefaultPass()))) &&
            ((this.defaultRTTable==null && other.getDefaultRTTable()==null) || 
             (this.defaultRTTable!=null &&
              this.defaultRTTable.equals(other.getDefaultRTTable()))) &&
            ((this.defaultUser==null && other.getDefaultUser()==null) || 
             (this.defaultUser!=null &&
              this.defaultUser.equals(other.getDefaultUser()))) &&
            ((this.department==null && other.getDepartment()==null) || 
             (this.department!=null &&
              this.department.equals(other.getDepartment()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.disableFlag==null && other.getDisableFlag()==null) || 
             (this.disableFlag!=null &&
              this.disableFlag.equals(other.getDisableFlag()))) &&
            ((this.extIPAddress==null && other.getExtIPAddress()==null) || 
             (this.extIPAddress!=null &&
              this.extIPAddress.equals(other.getExtIPAddress()))) &&
            ((this.ftpPoolingFlag==null && other.getFtpPoolingFlag()==null) || 
             (this.ftpPoolingFlag!=null &&
              this.ftpPoolingFlag.equals(other.getFtpPoolingFlag()))) &&
            ((this.ftpPoolingIdleTimeout==null && other.getFtpPoolingIdleTimeout()==null) || 
             (this.ftpPoolingIdleTimeout!=null &&
              this.ftpPoolingIdleTimeout.equals(other.getFtpPoolingIdleTimeout()))) &&
            ((this.hdfsAuth==null && other.getHdfsAuth()==null) || 
             (this.hdfsAuth!=null &&
              this.hdfsAuth.equals(other.getHdfsAuth()))) &&
            ((this.hdfsPrivKey==null && other.getHdfsPrivKey()==null) || 
             (this.hdfsPrivKey!=null &&
              this.hdfsPrivKey.equals(other.getHdfsPrivKey()))) &&
            ((this.hdfsUserName==null && other.getHdfsUserName()==null) || 
             (this.hdfsUserName!=null &&
              this.hdfsUserName.equals(other.getHdfsUserName()))) &&
            ((this.httpPrivKey==null && other.getHttpPrivKey()==null) || 
             (this.httpPrivKey!=null &&
              this.httpPrivKey.equals(other.getHttpPrivKey()))) &&
            ((this.httpProxyIpName==null && other.getHttpProxyIpName()==null) || 
             (this.httpProxyIpName!=null &&
              this.httpProxyIpName.equals(other.getHttpProxyIpName()))) &&
            ((this.httpProxyIpPort==null && other.getHttpProxyIpPort()==null) || 
             (this.httpProxyIpPort!=null &&
              this.httpProxyIpPort.equals(other.getHttpProxyIpPort()))) &&
            ((this.idOfLastCollect==null && other.getIdOfLastCollect()==null) || 
             (this.idOfLastCollect!=null &&
              this.idOfLastCollect.equals(other.getIdOfLastCollect()))) &&
            ((this.inEncAlg==null && other.getInEncAlg()==null) || 
             (this.inEncAlg!=null &&
              this.inEncAlg.equals(other.getInEncAlg()))) &&
            ((this.inSignAlg==null && other.getInSignAlg()==null) || 
             (this.inSignAlg!=null &&
              this.inSignAlg.equals(other.getInSignAlg()))) &&
            ((this.kerberosServers==null && other.getKerberosServers()==null) || 
             (this.kerberosServers!=null &&
              this.kerberosServers.equals(other.getKerberosServers()))) &&
            ((this.keyFlag==null && other.getKeyFlag()==null) || 
             (this.keyFlag!=null &&
              this.keyFlag.equals(other.getKeyFlag()))) &&
            ((this.krbProtocol==null && other.getKrbProtocol()==null) || 
             (this.krbProtocol!=null &&
              this.krbProtocol.equals(other.getKrbProtocol()))) &&
            ((this.lastFailServerStatusDate==null && other.getLastFailServerStatusDate()==null) || 
             (this.lastFailServerStatusDate!=null &&
              this.lastFailServerStatusDate.equals(other.getLastFailServerStatusDate()))) &&
            ((this.lastGoodServerStatusDate==null && other.getLastGoodServerStatusDate()==null) || 
             (this.lastGoodServerStatusDate!=null &&
              this.lastGoodServerStatusDate.equals(other.getLastGoodServerStatusDate()))) &&
            ((this.lastServerStatus==null && other.getLastServerStatus()==null) || 
             (this.lastServerStatus!=null &&
              this.lastServerStatus.equals(other.getLastServerStatus()))) &&
            ((this.lastServerStatusDate==null && other.getLastServerStatusDate()==null) || 
             (this.lastServerStatusDate!=null &&
              this.lastServerStatusDate.equals(other.getLastServerStatusDate()))) &&
            ((this.manageCFServerFlag==null && other.getManageCFServerFlag()==null) || 
             (this.manageCFServerFlag!=null &&
              this.manageCFServerFlag.equals(other.getManageCFServerFlag()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.nodeType==null && other.getNodeType()==null) || 
             (this.nodeType!=null &&
              this.nodeType.equals(other.getNodeType()))) &&
            ((this.outChunking==null && other.getOutChunking()==null) || 
             (this.outChunking!=null &&
              this.outChunking.equals(other.getOutChunking()))) &&
            ((this.outCompAlg==null && other.getOutCompAlg()==null) || 
             (this.outCompAlg!=null &&
              this.outCompAlg.equals(other.getOutCompAlg()))) &&
            ((this.outDataType==null && other.getOutDataType()==null) || 
             (this.outDataType!=null &&
              this.outDataType.equals(other.getOutDataType()))) &&
            ((this.outEncAlg==null && other.getOutEncAlg()==null) || 
             (this.outEncAlg!=null &&
              this.outEncAlg.equals(other.getOutEncAlg()))) &&
            ((this.outSignAlg==null && other.getOutSignAlg()==null) || 
             (this.outSignAlg!=null &&
              this.outSignAlg.equals(other.getOutSignAlg()))) &&
            ((this.outTimeout==null && other.getOutTimeout()==null) || 
             (this.outTimeout!=null &&
              this.outTimeout.equals(other.getOutTimeout()))) &&
            ((this.partnerAS2ID==null && other.getPartnerAS2ID()==null) || 
             (this.partnerAS2ID!=null &&
              this.partnerAS2ID.equals(other.getPartnerAS2ID()))) &&
            ((this.pasvChecking==null && other.getPasvChecking()==null) || 
             (this.pasvChecking!=null &&
              this.pasvChecking.equals(other.getPasvChecking()))) &&
            ((this.portChecking==null && other.getPortChecking()==null) || 
             (this.portChecking!=null &&
              this.portChecking.equals(other.getPortChecking()))) &&
            ((this.priEncName==null && other.getPriEncName()==null) || 
             (this.priEncName!=null &&
              this.priEncName.equals(other.getPriEncName()))) &&
            ((this.priSignName==null && other.getPriSignName()==null) || 
             (this.priSignName!=null &&
              this.priSignName.equals(other.getPriSignName()))) &&
            ((this.priorServerStatus==null && other.getPriorServerStatus()==null) || 
             (this.priorServerStatus!=null &&
              this.priorServerStatus.equals(other.getPriorServerStatus()))) &&
            ((this.priorServerStatusDate==null && other.getPriorServerStatusDate()==null) || 
             (this.priorServerStatusDate!=null &&
              this.priorServerStatusDate.equals(other.getPriorServerStatusDate()))) &&
            ((this.psPrivKey==null && other.getPsPrivKey()==null) || 
             (this.psPrivKey!=null &&
              this.psPrivKey.equals(other.getPsPrivKey()))) &&
            ((this.pubEncCert==null && other.getPubEncCert()==null) || 
             (this.pubEncCert!=null &&
              this.pubEncCert.equals(other.getPubEncCert()))) &&
            ((this.pubSSLCert==null && other.getPubSSLCert()==null) || 
             (this.pubSSLCert!=null &&
              this.pubSSLCert.equals(other.getPubSSLCert()))) &&
            ((this.pubSignCert==null && other.getPubSignCert()==null) || 
             (this.pubSignCert!=null &&
              this.pubSignCert.equals(other.getPubSignCert()))) &&
            ((this.secureFlag==null && other.getSecureFlag()==null) || 
             (this.secureFlag!=null &&
              this.secureFlag.equals(other.getSecureFlag()))) &&
            ((this.separateCollectThread==null && other.getSeparateCollectThread()==null) || 
             (this.separateCollectThread!=null &&
              this.separateCollectThread.equals(other.getSeparateCollectThread()))) &&
            ((this.serverExpiredEmailDate==null && other.getServerExpiredEmailDate()==null) || 
             (this.serverExpiredEmailDate!=null &&
              this.serverExpiredEmailDate.equals(other.getServerExpiredEmailDate()))) &&
            ((this.serverFileNamePrefix==null && other.getServerFileNamePrefix()==null) || 
             (this.serverFileNamePrefix!=null &&
              this.serverFileNamePrefix.equals(other.getServerFileNamePrefix()))) &&
            ((this.serverLicenseKey==null && other.getServerLicenseKey()==null) || 
             (this.serverLicenseKey!=null &&
              this.serverLicenseKey.equals(other.getServerLicenseKey()))) &&
            ((this.serverStatusFailCount==null && other.getServerStatusFailCount()==null) || 
             (this.serverStatusFailCount!=null &&
              this.serverStatusFailCount.equals(other.getServerStatusFailCount()))) &&
            ((this.serverStatusGoodCount==null && other.getServerStatusGoodCount()==null) || 
             (this.serverStatusGoodCount!=null &&
              this.serverStatusGoodCount.equals(other.getServerStatusGoodCount()))) &&
            ((this.serverType==null && other.getServerType()==null) || 
             (this.serverType!=null &&
              this.serverType.equals(other.getServerType()))) &&
            ((this.srvAS2ID==null && other.getSrvAS2ID()==null) || 
             (this.srvAS2ID!=null &&
              this.srvAS2ID.equals(other.getSrvAS2ID()))) &&
            ((this.sshPoolingIdleTimeout==null && other.getSshPoolingIdleTimeout()==null) || 
             (this.sshPoolingIdleTimeout!=null &&
              this.sshPoolingIdleTimeout.equals(other.getSshPoolingIdleTimeout()))) &&
            ((this.theClassName==null && other.getTheClassName()==null) || 
             (this.theClassName!=null &&
              this.theClassName.equals(other.getTheClassName()))) &&
            ((this.timeOfLastCollection==null && other.getTimeOfLastCollection()==null) || 
             (this.timeOfLastCollection!=null &&
              this.timeOfLastCollection.equals(other.getTimeOfLastCollection()))) &&
            ((this.traceFlag==null && other.getTraceFlag()==null) || 
             (this.traceFlag!=null &&
              this.traceFlag.equals(other.getTraceFlag()))) &&
            ((this.updatedBy==null && other.getUpdatedBy()==null) || 
             (this.updatedBy!=null &&
              this.updatedBy.equals(other.getUpdatedBy()))) &&
            ((this.useExtIPAddress==null && other.getUseExtIPAddress()==null) || 
             (this.useExtIPAddress!=null &&
              this.useExtIPAddress.equals(other.getUseExtIPAddress()))) &&
            ((this.userID==null && other.getUserID()==null) || 
             (this.userID!=null &&
              this.userID.equals(other.getUserID()))) &&
            ((this.visibility==null && other.getVisibility()==null) || 
             (this.visibility!=null &&
              this.visibility.equals(other.getVisibility())));
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
        if (getCFComputerName() != null) {
            _hashCode += getCFComputerName().hashCode();
        }
        if (getCFVersion() != null) {
            _hashCode += getCFVersion().hashCode();
        }
        if (getDNIPass() != null) {
            _hashCode += getDNIPass().hashCode();
        }
        if (getDNIPort() != null) {
            _hashCode += getDNIPort().hashCode();
        }
        if (getDNIUser() != null) {
            _hashCode += getDNIUser().hashCode();
        }
        if (getFTPCaseSensitive() != null) {
            _hashCode += getFTPCaseSensitive().hashCode();
        }
        if (getFTPKeepAliveInterval() != null) {
            _hashCode += getFTPKeepAliveInterval().hashCode();
        }
        if (getFTPPrivKey() != null) {
            _hashCode += getFTPPrivKey().hashCode();
        }
        if (getIPName() != null) {
            _hashCode += getIPName().hashCode();
        }
        if (getIPPort() != null) {
            _hashCode += getIPPort().hashCode();
        }
        if (getMDNReceipt() != null) {
            _hashCode += getMDNReceipt().hashCode();
        }
        if (getMDNSign() != null) {
            _hashCode += getMDNSign().hashCode();
        }
        if (getPGPArmor() != null) {
            _hashCode += getPGPArmor().hashCode();
        }
        if (getPGPCompAlg() != null) {
            _hashCode += getPGPCompAlg().hashCode();
        }
        if (getPGPEnabled() != null) {
            _hashCode += getPGPEnabled().hashCode();
        }
        if (getPGPEncryptAlg() != null) {
            _hashCode += getPGPEncryptAlg().hashCode();
        }
        if (getPGPHashAlg() != null) {
            _hashCode += getPGPHashAlg().hashCode();
        }
        if (getPGPPrivKey() != null) {
            _hashCode += getPGPPrivKey().hashCode();
        }
        if (getPGPSign() != null) {
            _hashCode += getPGPSign().hashCode();
        }
        if (getPGPTextMode() != null) {
            _hashCode += getPGPTextMode().hashCode();
        }
        if (getPGPVerifyServerSign() != null) {
            _hashCode += getPGPVerifyServerSign().hashCode();
        }
        if (getPGPVerifySign() != null) {
            _hashCode += getPGPVerifySign().hashCode();
        }
        if (getSSHBlockSize() != null) {
            _hashCode += getSSHBlockSize().hashCode();
        }
        if (getSSHCompress() != null) {
            _hashCode += getSSHCompress().hashCode();
        }
        if (getSSHPoolingFlag() != null) {
            _hashCode += getSSHPoolingFlag().hashCode();
        }
        if (getSSHPrivKey() != null) {
            _hashCode += getSSHPrivKey().hashCode();
        }
        if (getBindIPAddress() != null) {
            _hashCode += getBindIPAddress().hashCode();
        }
        if (getCheckServerStatus() != null) {
            _hashCode += getCheckServerStatus().hashCode();
        }
        if (getClearCommandChannel() != null) {
            _hashCode += getClearCommandChannel().hashCode();
        }
        if (getCollectInterval() != null) {
            _hashCode += getCollectInterval().hashCode();
        }
        if (getCollectType() != null) {
            _hashCode += getCollectType().hashCode();
        }
        if (getCollectionFlag() != null) {
            _hashCode += getCollectionFlag().hashCode();
        }
        if (getCompressType() != null) {
            _hashCode += getCompressType().hashCode();
        }
        if (getConnectionSecurityType() != null) {
            _hashCode += getConnectionSecurityType().hashCode();
        }
        if (getConnectionSecurityTypePS() != null) {
            _hashCode += getConnectionSecurityTypePS().hashCode();
        }
        if (getContext() != null) {
            _hashCode += getContext().hashCode();
        }
        if (getCreatedBy() != null) {
            _hashCode += getCreatedBy().hashCode();
        }
        if (getDataConnectionType() != null) {
            _hashCode += getDataConnectionType().hashCode();
        }
        if (getDateCreated() != null) {
            _hashCode += getDateCreated().hashCode();
        }
        if (getDateUpdated() != null) {
            _hashCode += getDateUpdated().hashCode();
        }
        if (getDefaultEncryptType() != null) {
            _hashCode += getDefaultEncryptType().hashCode();
        }
        if (getDefaultLTTable() != null) {
            _hashCode += getDefaultLTTable().hashCode();
        }
        if (getDefaultNTDomain() != null) {
            _hashCode += getDefaultNTDomain().hashCode();
        }
        if (getDefaultPass() != null) {
            _hashCode += getDefaultPass().hashCode();
        }
        if (getDefaultRTTable() != null) {
            _hashCode += getDefaultRTTable().hashCode();
        }
        if (getDefaultUser() != null) {
            _hashCode += getDefaultUser().hashCode();
        }
        if (getDepartment() != null) {
            _hashCode += getDepartment().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getDisableFlag() != null) {
            _hashCode += getDisableFlag().hashCode();
        }
        if (getExtIPAddress() != null) {
            _hashCode += getExtIPAddress().hashCode();
        }
        if (getFtpPoolingFlag() != null) {
            _hashCode += getFtpPoolingFlag().hashCode();
        }
        if (getFtpPoolingIdleTimeout() != null) {
            _hashCode += getFtpPoolingIdleTimeout().hashCode();
        }
        if (getHdfsAuth() != null) {
            _hashCode += getHdfsAuth().hashCode();
        }
        if (getHdfsPrivKey() != null) {
            _hashCode += getHdfsPrivKey().hashCode();
        }
        if (getHdfsUserName() != null) {
            _hashCode += getHdfsUserName().hashCode();
        }
        if (getHttpPrivKey() != null) {
            _hashCode += getHttpPrivKey().hashCode();
        }
        if (getHttpProxyIpName() != null) {
            _hashCode += getHttpProxyIpName().hashCode();
        }
        if (getHttpProxyIpPort() != null) {
            _hashCode += getHttpProxyIpPort().hashCode();
        }
        if (getIdOfLastCollect() != null) {
            _hashCode += getIdOfLastCollect().hashCode();
        }
        if (getInEncAlg() != null) {
            _hashCode += getInEncAlg().hashCode();
        }
        if (getInSignAlg() != null) {
            _hashCode += getInSignAlg().hashCode();
        }
        if (getKerberosServers() != null) {
            _hashCode += getKerberosServers().hashCode();
        }
        if (getKeyFlag() != null) {
            _hashCode += getKeyFlag().hashCode();
        }
        if (getKrbProtocol() != null) {
            _hashCode += getKrbProtocol().hashCode();
        }
        if (getLastFailServerStatusDate() != null) {
            _hashCode += getLastFailServerStatusDate().hashCode();
        }
        if (getLastGoodServerStatusDate() != null) {
            _hashCode += getLastGoodServerStatusDate().hashCode();
        }
        if (getLastServerStatus() != null) {
            _hashCode += getLastServerStatus().hashCode();
        }
        if (getLastServerStatusDate() != null) {
            _hashCode += getLastServerStatusDate().hashCode();
        }
        if (getManageCFServerFlag() != null) {
            _hashCode += getManageCFServerFlag().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getNodeType() != null) {
            _hashCode += getNodeType().hashCode();
        }
        if (getOutChunking() != null) {
            _hashCode += getOutChunking().hashCode();
        }
        if (getOutCompAlg() != null) {
            _hashCode += getOutCompAlg().hashCode();
        }
        if (getOutDataType() != null) {
            _hashCode += getOutDataType().hashCode();
        }
        if (getOutEncAlg() != null) {
            _hashCode += getOutEncAlg().hashCode();
        }
        if (getOutSignAlg() != null) {
            _hashCode += getOutSignAlg().hashCode();
        }
        if (getOutTimeout() != null) {
            _hashCode += getOutTimeout().hashCode();
        }
        if (getPartnerAS2ID() != null) {
            _hashCode += getPartnerAS2ID().hashCode();
        }
        if (getPasvChecking() != null) {
            _hashCode += getPasvChecking().hashCode();
        }
        if (getPortChecking() != null) {
            _hashCode += getPortChecking().hashCode();
        }
        if (getPriEncName() != null) {
            _hashCode += getPriEncName().hashCode();
        }
        if (getPriSignName() != null) {
            _hashCode += getPriSignName().hashCode();
        }
        if (getPriorServerStatus() != null) {
            _hashCode += getPriorServerStatus().hashCode();
        }
        if (getPriorServerStatusDate() != null) {
            _hashCode += getPriorServerStatusDate().hashCode();
        }
        if (getPsPrivKey() != null) {
            _hashCode += getPsPrivKey().hashCode();
        }
        if (getPubEncCert() != null) {
            _hashCode += getPubEncCert().hashCode();
        }
        if (getPubSSLCert() != null) {
            _hashCode += getPubSSLCert().hashCode();
        }
        if (getPubSignCert() != null) {
            _hashCode += getPubSignCert().hashCode();
        }
        if (getSecureFlag() != null) {
            _hashCode += getSecureFlag().hashCode();
        }
        if (getSeparateCollectThread() != null) {
            _hashCode += getSeparateCollectThread().hashCode();
        }
        if (getServerExpiredEmailDate() != null) {
            _hashCode += getServerExpiredEmailDate().hashCode();
        }
        if (getServerFileNamePrefix() != null) {
            _hashCode += getServerFileNamePrefix().hashCode();
        }
        if (getServerLicenseKey() != null) {
            _hashCode += getServerLicenseKey().hashCode();
        }
        if (getServerStatusFailCount() != null) {
            _hashCode += getServerStatusFailCount().hashCode();
        }
        if (getServerStatusGoodCount() != null) {
            _hashCode += getServerStatusGoodCount().hashCode();
        }
        if (getServerType() != null) {
            _hashCode += getServerType().hashCode();
        }
        if (getSrvAS2ID() != null) {
            _hashCode += getSrvAS2ID().hashCode();
        }
        if (getSshPoolingIdleTimeout() != null) {
            _hashCode += getSshPoolingIdleTimeout().hashCode();
        }
        if (getTheClassName() != null) {
            _hashCode += getTheClassName().hashCode();
        }
        if (getTimeOfLastCollection() != null) {
            _hashCode += getTimeOfLastCollection().hashCode();
        }
        if (getTraceFlag() != null) {
            _hashCode += getTraceFlag().hashCode();
        }
        if (getUpdatedBy() != null) {
            _hashCode += getUpdatedBy().hashCode();
        }
        if (getUseExtIPAddress() != null) {
            _hashCode += getUseExtIPAddress().hashCode();
        }
        if (getUserID() != null) {
            _hashCode += getUserID().hashCode();
        }
        if (getVisibility() != null) {
            _hashCode += getVisibility().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Node.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:AdministratorService", "Node"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CFComputerName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CFComputerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CFVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CFVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DNIPass");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DNIPass"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DNIPort");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DNIPort"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DNIUser");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DNIUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FTPCaseSensitive");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FTPCaseSensitive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FTPKeepAliveInterval");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FTPKeepAliveInterval"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FTPPrivKey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FTPPrivKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IPName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IPName"));
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
        elemField.setFieldName("MDNReceipt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MDNReceipt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MDNSign");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MDNSign"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PGPArmor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PGPArmor"));
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
        elemField.setFieldName("PGPEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PGPEnabled"));
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
        elemField.setFieldName("PGPHashAlg");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PGPHashAlg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PGPPrivKey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PGPPrivKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PGPSign");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PGPSign"));
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
        elemField.setFieldName("PGPVerifyServerSign");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PGPVerifyServerSign"));
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
        elemField.setFieldName("SSHBlockSize");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SSHBlockSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SSHCompress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SSHCompress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SSHPoolingFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SSHPoolingFlag"));
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
        elemField.setFieldName("bindIPAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bindIPAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("checkServerStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "checkServerStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clearCommandChannel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "clearCommandChannel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("collectInterval");
        elemField.setXmlName(new javax.xml.namespace.QName("", "collectInterval"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("collectType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "collectType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("collectionFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "collectionFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("compressType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "compressType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("connectionSecurityType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "connectionSecurityType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("connectionSecurityTypePS");
        elemField.setXmlName(new javax.xml.namespace.QName("", "connectionSecurityTypePS"));
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
        elemField.setFieldName("createdBy");
        elemField.setXmlName(new javax.xml.namespace.QName("", "createdBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataConnectionType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataConnectionType"));
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
        elemField.setFieldName("dateUpdated");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dateUpdated"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:AdministratorService", "DateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultEncryptType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "defaultEncryptType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultLTTable");
        elemField.setXmlName(new javax.xml.namespace.QName("", "defaultLTTable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultNTDomain");
        elemField.setXmlName(new javax.xml.namespace.QName("", "defaultNTDomain"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultPass");
        elemField.setXmlName(new javax.xml.namespace.QName("", "defaultPass"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultRTTable");
        elemField.setXmlName(new javax.xml.namespace.QName("", "defaultRTTable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultUser");
        elemField.setXmlName(new javax.xml.namespace.QName("", "defaultUser"));
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
        elemField.setFieldName("disableFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "disableFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extIPAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "extIPAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ftpPoolingFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ftpPoolingFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ftpPoolingIdleTimeout");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ftpPoolingIdleTimeout"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hdfsAuth");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hdfsAuth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hdfsPrivKey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hdfsPrivKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hdfsUserName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hdfsUserName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("httpPrivKey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "httpPrivKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("httpProxyIpName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "httpProxyIpName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("httpProxyIpPort");
        elemField.setXmlName(new javax.xml.namespace.QName("", "httpProxyIpPort"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idOfLastCollect");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idOfLastCollect"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inEncAlg");
        elemField.setXmlName(new javax.xml.namespace.QName("", "inEncAlg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inSignAlg");
        elemField.setXmlName(new javax.xml.namespace.QName("", "inSignAlg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kerberosServers");
        elemField.setXmlName(new javax.xml.namespace.QName("", "kerberosServers"));
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
        elemField.setFieldName("krbProtocol");
        elemField.setXmlName(new javax.xml.namespace.QName("", "krbProtocol"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastFailServerStatusDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lastFailServerStatusDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:AdministratorService", "DateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastGoodServerStatusDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lastGoodServerStatusDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:AdministratorService", "DateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastServerStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lastServerStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastServerStatusDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lastServerStatusDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:AdministratorService", "DateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manageCFServerFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "manageCFServerFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nodeType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nodeType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outChunking");
        elemField.setXmlName(new javax.xml.namespace.QName("", "outChunking"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outCompAlg");
        elemField.setXmlName(new javax.xml.namespace.QName("", "outCompAlg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outDataType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "outDataType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outEncAlg");
        elemField.setXmlName(new javax.xml.namespace.QName("", "outEncAlg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outSignAlg");
        elemField.setXmlName(new javax.xml.namespace.QName("", "outSignAlg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outTimeout");
        elemField.setXmlName(new javax.xml.namespace.QName("", "outTimeout"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partnerAS2ID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "partnerAS2ID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pasvChecking");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pasvChecking"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("portChecking");
        elemField.setXmlName(new javax.xml.namespace.QName("", "portChecking"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priEncName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "priEncName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priSignName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "priSignName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priorServerStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "priorServerStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priorServerStatusDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "priorServerStatusDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:AdministratorService", "DateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("psPrivKey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "psPrivKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pubEncCert");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pubEncCert"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pubSSLCert");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pubSSLCert"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pubSignCert");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pubSignCert"));
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
        elemField.setFieldName("separateCollectThread");
        elemField.setXmlName(new javax.xml.namespace.QName("", "separateCollectThread"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serverExpiredEmailDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serverExpiredEmailDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:AdministratorService", "DateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serverFileNamePrefix");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serverFileNamePrefix"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serverLicenseKey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serverLicenseKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serverStatusFailCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serverStatusFailCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serverStatusGoodCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serverStatusGoodCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serverType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serverType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("srvAS2ID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "srvAS2ID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sshPoolingIdleTimeout");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sshPoolingIdleTimeout"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("theClassName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "theClassName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeOfLastCollection");
        elemField.setXmlName(new javax.xml.namespace.QName("", "timeOfLastCollection"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:AdministratorService", "DateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("traceFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "traceFlag"));
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
        elemField.setFieldName("useExtIPAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "useExtIPAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("visibility");
        elemField.setXmlName(new javax.xml.namespace.QName("", "visibility"));
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
