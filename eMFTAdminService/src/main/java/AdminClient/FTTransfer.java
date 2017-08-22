/**
 * FTTransfer.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 11, 2014 (12:11:36 EDT) WSDL2Java emitter.
 */

package AdminClient;

public class FTTransfer  implements java.io.Serializable {
    private java.lang.String JMSMsgID;

    private java.lang.String JMSTransferCheckFlag;

    private java.lang.String JMSTransferCheckInterval;

    private java.lang.String JMSTransferCheckTimeout;

    private java.lang.String JMSUserID;

    private java.lang.String JMSUserPwd;

    private java.lang.String OS390AllocDir;

    private java.lang.String OS390AllocPri;

    private java.lang.String OS390AllocSec;

    private java.lang.String OS390AllocType;

    private java.lang.String OS390BlockSize;

    private java.lang.String OS390DataClass;

    private java.lang.String OS390LRECL;

    private java.lang.String OS390MgtClass;

    private java.lang.String OS390RECFM;

    private java.lang.String OS390StorClass;

    private java.lang.String OS390Unit;

    private java.lang.String OS390Volume;

    private java.lang.String PPASource1;

    private java.lang.String PPASource2;

    private java.lang.String PPASource3;

    private java.lang.String PPASource4;

    private java.lang.String PPAStatus1;

    private java.lang.String PPAStatus2;

    private java.lang.String PPAStatus3;

    private java.lang.String PPAStatus4;

    private java.lang.String PServerName;

    private java.lang.String SSLFlag;

    private java.lang.String aux0;

    private java.lang.String ckPtInterval;

    private java.lang.String commandType;

    private java.lang.String compressionFlag;

    private java.lang.String createdBy;

    private java.lang.String dataConversionType;

    private AdminClient.DateTime dateCreated;

    private AdminClient.DateTime dateUpdated;

    private java.lang.String delimiter;

    private java.lang.String department;

    private java.lang.String description;

    private java.lang.String encryptionFlag;

    private java.lang.String expirationDays;

    private java.lang.String fileWriteMode;

    private java.lang.String hostName;

    private java.lang.String hostType;

    private java.lang.String initiatorFileName;

    private boolean isCommand;

    private java.lang.String localTransTable;

    private java.lang.String loginPWD;

    private java.lang.String loginUID;

    private java.lang.String[] managedDepts;

    private boolean needSession;

    private java.lang.String permittedActions;

    private java.lang.String portNum;

    private java.lang.String processName;

    private java.lang.String ptActionData1;

    private java.lang.String ptActionData2;

    private java.lang.String ptActionData3;

    private java.lang.String ptActionData4;

    private java.lang.String ptActionFlag1;

    private java.lang.String ptActionFlag2;

    private java.lang.String ptActionFlag3;

    private java.lang.String ptActionFlag4;

    private java.lang.String ptActionType1;

    private java.lang.String ptActionType2;

    private java.lang.String ptActionType3;

    private java.lang.String ptActionType4;

    private java.lang.String remoteTransTable;

    private java.lang.String responderFileName;

    private java.lang.String responderPWD;

    private java.lang.String responderUID;

    private java.lang.String scanSubDir;

    private java.lang.String securityAttribute;

    private java.lang.String sendRecvFlag;

    private java.lang.String tableName;

    private java.lang.String toEmailAddrF;

    private java.lang.String toEmailAddrS;

    private AdminClient.DateTime trScheduleDate;

    private java.lang.String traceLvl;

    private java.lang.String transferID;

    private java.lang.String transferWork;

    private java.lang.String tryMaxCount;

    private java.lang.String unixPermissions;

    private java.lang.String updatedBy;

    private java.lang.String userData;

    private java.lang.String waitFlag;

    public FTTransfer() {
    }

    public FTTransfer(
           java.lang.String JMSMsgID,
           java.lang.String JMSTransferCheckFlag,
           java.lang.String JMSTransferCheckInterval,
           java.lang.String JMSTransferCheckTimeout,
           java.lang.String JMSUserID,
           java.lang.String JMSUserPwd,
           java.lang.String OS390AllocDir,
           java.lang.String OS390AllocPri,
           java.lang.String OS390AllocSec,
           java.lang.String OS390AllocType,
           java.lang.String OS390BlockSize,
           java.lang.String OS390DataClass,
           java.lang.String OS390LRECL,
           java.lang.String OS390MgtClass,
           java.lang.String OS390RECFM,
           java.lang.String OS390StorClass,
           java.lang.String OS390Unit,
           java.lang.String OS390Volume,
           java.lang.String PPASource1,
           java.lang.String PPASource2,
           java.lang.String PPASource3,
           java.lang.String PPASource4,
           java.lang.String PPAStatus1,
           java.lang.String PPAStatus2,
           java.lang.String PPAStatus3,
           java.lang.String PPAStatus4,
           java.lang.String PServerName,
           java.lang.String SSLFlag,
           java.lang.String aux0,
           java.lang.String ckPtInterval,
           java.lang.String commandType,
           java.lang.String compressionFlag,
           java.lang.String createdBy,
           java.lang.String dataConversionType,
           AdminClient.DateTime dateCreated,
           AdminClient.DateTime dateUpdated,
           java.lang.String delimiter,
           java.lang.String department,
           java.lang.String description,
           java.lang.String encryptionFlag,
           java.lang.String expirationDays,
           java.lang.String fileWriteMode,
           java.lang.String hostName,
           java.lang.String hostType,
           java.lang.String initiatorFileName,
           boolean isCommand,
           java.lang.String localTransTable,
           java.lang.String loginPWD,
           java.lang.String loginUID,
           java.lang.String[] managedDepts,
           boolean needSession,
           java.lang.String permittedActions,
           java.lang.String portNum,
           java.lang.String processName,
           java.lang.String ptActionData1,
           java.lang.String ptActionData2,
           java.lang.String ptActionData3,
           java.lang.String ptActionData4,
           java.lang.String ptActionFlag1,
           java.lang.String ptActionFlag2,
           java.lang.String ptActionFlag3,
           java.lang.String ptActionFlag4,
           java.lang.String ptActionType1,
           java.lang.String ptActionType2,
           java.lang.String ptActionType3,
           java.lang.String ptActionType4,
           java.lang.String remoteTransTable,
           java.lang.String responderFileName,
           java.lang.String responderPWD,
           java.lang.String responderUID,
           java.lang.String scanSubDir,
           java.lang.String securityAttribute,
           java.lang.String sendRecvFlag,
           java.lang.String tableName,
           java.lang.String toEmailAddrF,
           java.lang.String toEmailAddrS,
           AdminClient.DateTime trScheduleDate,
           java.lang.String traceLvl,
           java.lang.String transferID,
           java.lang.String transferWork,
           java.lang.String tryMaxCount,
           java.lang.String unixPermissions,
           java.lang.String updatedBy,
           java.lang.String userData,
           java.lang.String waitFlag) {
           this.JMSMsgID = JMSMsgID;
           this.JMSTransferCheckFlag = JMSTransferCheckFlag;
           this.JMSTransferCheckInterval = JMSTransferCheckInterval;
           this.JMSTransferCheckTimeout = JMSTransferCheckTimeout;
           this.JMSUserID = JMSUserID;
           this.JMSUserPwd = JMSUserPwd;
           this.OS390AllocDir = OS390AllocDir;
           this.OS390AllocPri = OS390AllocPri;
           this.OS390AllocSec = OS390AllocSec;
           this.OS390AllocType = OS390AllocType;
           this.OS390BlockSize = OS390BlockSize;
           this.OS390DataClass = OS390DataClass;
           this.OS390LRECL = OS390LRECL;
           this.OS390MgtClass = OS390MgtClass;
           this.OS390RECFM = OS390RECFM;
           this.OS390StorClass = OS390StorClass;
           this.OS390Unit = OS390Unit;
           this.OS390Volume = OS390Volume;
           this.PPASource1 = PPASource1;
           this.PPASource2 = PPASource2;
           this.PPASource3 = PPASource3;
           this.PPASource4 = PPASource4;
           this.PPAStatus1 = PPAStatus1;
           this.PPAStatus2 = PPAStatus2;
           this.PPAStatus3 = PPAStatus3;
           this.PPAStatus4 = PPAStatus4;
           this.PServerName = PServerName;
           this.SSLFlag = SSLFlag;
           this.aux0 = aux0;
           this.ckPtInterval = ckPtInterval;
           this.commandType = commandType;
           this.compressionFlag = compressionFlag;
           this.createdBy = createdBy;
           this.dataConversionType = dataConversionType;
           this.dateCreated = dateCreated;
           this.dateUpdated = dateUpdated;
           this.delimiter = delimiter;
           this.department = department;
           this.description = description;
           this.encryptionFlag = encryptionFlag;
           this.expirationDays = expirationDays;
           this.fileWriteMode = fileWriteMode;
           this.hostName = hostName;
           this.hostType = hostType;
           this.initiatorFileName = initiatorFileName;
           this.isCommand = isCommand;
           this.localTransTable = localTransTable;
           this.loginPWD = loginPWD;
           this.loginUID = loginUID;
           this.managedDepts = managedDepts;
           this.needSession = needSession;
           this.permittedActions = permittedActions;
           this.portNum = portNum;
           this.processName = processName;
           this.ptActionData1 = ptActionData1;
           this.ptActionData2 = ptActionData2;
           this.ptActionData3 = ptActionData3;
           this.ptActionData4 = ptActionData4;
           this.ptActionFlag1 = ptActionFlag1;
           this.ptActionFlag2 = ptActionFlag2;
           this.ptActionFlag3 = ptActionFlag3;
           this.ptActionFlag4 = ptActionFlag4;
           this.ptActionType1 = ptActionType1;
           this.ptActionType2 = ptActionType2;
           this.ptActionType3 = ptActionType3;
           this.ptActionType4 = ptActionType4;
           this.remoteTransTable = remoteTransTable;
           this.responderFileName = responderFileName;
           this.responderPWD = responderPWD;
           this.responderUID = responderUID;
           this.scanSubDir = scanSubDir;
           this.securityAttribute = securityAttribute;
           this.sendRecvFlag = sendRecvFlag;
           this.tableName = tableName;
           this.toEmailAddrF = toEmailAddrF;
           this.toEmailAddrS = toEmailAddrS;
           this.trScheduleDate = trScheduleDate;
           this.traceLvl = traceLvl;
           this.transferID = transferID;
           this.transferWork = transferWork;
           this.tryMaxCount = tryMaxCount;
           this.unixPermissions = unixPermissions;
           this.updatedBy = updatedBy;
           this.userData = userData;
           this.waitFlag = waitFlag;
    }


    /**
     * Gets the JMSMsgID value for this FTTransfer.
     * 
     * @return JMSMsgID
     */
    public java.lang.String getJMSMsgID() {
        return JMSMsgID;
    }


    /**
     * Sets the JMSMsgID value for this FTTransfer.
     * 
     * @param JMSMsgID
     */
    public void setJMSMsgID(java.lang.String JMSMsgID) {
        this.JMSMsgID = JMSMsgID;
    }


    /**
     * Gets the JMSTransferCheckFlag value for this FTTransfer.
     * 
     * @return JMSTransferCheckFlag
     */
    public java.lang.String getJMSTransferCheckFlag() {
        return JMSTransferCheckFlag;
    }


    /**
     * Sets the JMSTransferCheckFlag value for this FTTransfer.
     * 
     * @param JMSTransferCheckFlag
     */
    public void setJMSTransferCheckFlag(java.lang.String JMSTransferCheckFlag) {
        this.JMSTransferCheckFlag = JMSTransferCheckFlag;
    }


    /**
     * Gets the JMSTransferCheckInterval value for this FTTransfer.
     * 
     * @return JMSTransferCheckInterval
     */
    public java.lang.String getJMSTransferCheckInterval() {
        return JMSTransferCheckInterval;
    }


    /**
     * Sets the JMSTransferCheckInterval value for this FTTransfer.
     * 
     * @param JMSTransferCheckInterval
     */
    public void setJMSTransferCheckInterval(java.lang.String JMSTransferCheckInterval) {
        this.JMSTransferCheckInterval = JMSTransferCheckInterval;
    }


    /**
     * Gets the JMSTransferCheckTimeout value for this FTTransfer.
     * 
     * @return JMSTransferCheckTimeout
     */
    public java.lang.String getJMSTransferCheckTimeout() {
        return JMSTransferCheckTimeout;
    }


    /**
     * Sets the JMSTransferCheckTimeout value for this FTTransfer.
     * 
     * @param JMSTransferCheckTimeout
     */
    public void setJMSTransferCheckTimeout(java.lang.String JMSTransferCheckTimeout) {
        this.JMSTransferCheckTimeout = JMSTransferCheckTimeout;
    }


    /**
     * Gets the JMSUserID value for this FTTransfer.
     * 
     * @return JMSUserID
     */
    public java.lang.String getJMSUserID() {
        return JMSUserID;
    }


    /**
     * Sets the JMSUserID value for this FTTransfer.
     * 
     * @param JMSUserID
     */
    public void setJMSUserID(java.lang.String JMSUserID) {
        this.JMSUserID = JMSUserID;
    }


    /**
     * Gets the JMSUserPwd value for this FTTransfer.
     * 
     * @return JMSUserPwd
     */
    public java.lang.String getJMSUserPwd() {
        return JMSUserPwd;
    }


    /**
     * Sets the JMSUserPwd value for this FTTransfer.
     * 
     * @param JMSUserPwd
     */
    public void setJMSUserPwd(java.lang.String JMSUserPwd) {
        this.JMSUserPwd = JMSUserPwd;
    }


    /**
     * Gets the OS390AllocDir value for this FTTransfer.
     * 
     * @return OS390AllocDir
     */
    public java.lang.String getOS390AllocDir() {
        return OS390AllocDir;
    }


    /**
     * Sets the OS390AllocDir value for this FTTransfer.
     * 
     * @param OS390AllocDir
     */
    public void setOS390AllocDir(java.lang.String OS390AllocDir) {
        this.OS390AllocDir = OS390AllocDir;
    }


    /**
     * Gets the OS390AllocPri value for this FTTransfer.
     * 
     * @return OS390AllocPri
     */
    public java.lang.String getOS390AllocPri() {
        return OS390AllocPri;
    }


    /**
     * Sets the OS390AllocPri value for this FTTransfer.
     * 
     * @param OS390AllocPri
     */
    public void setOS390AllocPri(java.lang.String OS390AllocPri) {
        this.OS390AllocPri = OS390AllocPri;
    }


    /**
     * Gets the OS390AllocSec value for this FTTransfer.
     * 
     * @return OS390AllocSec
     */
    public java.lang.String getOS390AllocSec() {
        return OS390AllocSec;
    }


    /**
     * Sets the OS390AllocSec value for this FTTransfer.
     * 
     * @param OS390AllocSec
     */
    public void setOS390AllocSec(java.lang.String OS390AllocSec) {
        this.OS390AllocSec = OS390AllocSec;
    }


    /**
     * Gets the OS390AllocType value for this FTTransfer.
     * 
     * @return OS390AllocType
     */
    public java.lang.String getOS390AllocType() {
        return OS390AllocType;
    }


    /**
     * Sets the OS390AllocType value for this FTTransfer.
     * 
     * @param OS390AllocType
     */
    public void setOS390AllocType(java.lang.String OS390AllocType) {
        this.OS390AllocType = OS390AllocType;
    }


    /**
     * Gets the OS390BlockSize value for this FTTransfer.
     * 
     * @return OS390BlockSize
     */
    public java.lang.String getOS390BlockSize() {
        return OS390BlockSize;
    }


    /**
     * Sets the OS390BlockSize value for this FTTransfer.
     * 
     * @param OS390BlockSize
     */
    public void setOS390BlockSize(java.lang.String OS390BlockSize) {
        this.OS390BlockSize = OS390BlockSize;
    }


    /**
     * Gets the OS390DataClass value for this FTTransfer.
     * 
     * @return OS390DataClass
     */
    public java.lang.String getOS390DataClass() {
        return OS390DataClass;
    }


    /**
     * Sets the OS390DataClass value for this FTTransfer.
     * 
     * @param OS390DataClass
     */
    public void setOS390DataClass(java.lang.String OS390DataClass) {
        this.OS390DataClass = OS390DataClass;
    }


    /**
     * Gets the OS390LRECL value for this FTTransfer.
     * 
     * @return OS390LRECL
     */
    public java.lang.String getOS390LRECL() {
        return OS390LRECL;
    }


    /**
     * Sets the OS390LRECL value for this FTTransfer.
     * 
     * @param OS390LRECL
     */
    public void setOS390LRECL(java.lang.String OS390LRECL) {
        this.OS390LRECL = OS390LRECL;
    }


    /**
     * Gets the OS390MgtClass value for this FTTransfer.
     * 
     * @return OS390MgtClass
     */
    public java.lang.String getOS390MgtClass() {
        return OS390MgtClass;
    }


    /**
     * Sets the OS390MgtClass value for this FTTransfer.
     * 
     * @param OS390MgtClass
     */
    public void setOS390MgtClass(java.lang.String OS390MgtClass) {
        this.OS390MgtClass = OS390MgtClass;
    }


    /**
     * Gets the OS390RECFM value for this FTTransfer.
     * 
     * @return OS390RECFM
     */
    public java.lang.String getOS390RECFM() {
        return OS390RECFM;
    }


    /**
     * Sets the OS390RECFM value for this FTTransfer.
     * 
     * @param OS390RECFM
     */
    public void setOS390RECFM(java.lang.String OS390RECFM) {
        this.OS390RECFM = OS390RECFM;
    }


    /**
     * Gets the OS390StorClass value for this FTTransfer.
     * 
     * @return OS390StorClass
     */
    public java.lang.String getOS390StorClass() {
        return OS390StorClass;
    }


    /**
     * Sets the OS390StorClass value for this FTTransfer.
     * 
     * @param OS390StorClass
     */
    public void setOS390StorClass(java.lang.String OS390StorClass) {
        this.OS390StorClass = OS390StorClass;
    }


    /**
     * Gets the OS390Unit value for this FTTransfer.
     * 
     * @return OS390Unit
     */
    public java.lang.String getOS390Unit() {
        return OS390Unit;
    }


    /**
     * Sets the OS390Unit value for this FTTransfer.
     * 
     * @param OS390Unit
     */
    public void setOS390Unit(java.lang.String OS390Unit) {
        this.OS390Unit = OS390Unit;
    }


    /**
     * Gets the OS390Volume value for this FTTransfer.
     * 
     * @return OS390Volume
     */
    public java.lang.String getOS390Volume() {
        return OS390Volume;
    }


    /**
     * Sets the OS390Volume value for this FTTransfer.
     * 
     * @param OS390Volume
     */
    public void setOS390Volume(java.lang.String OS390Volume) {
        this.OS390Volume = OS390Volume;
    }


    /**
     * Gets the PPASource1 value for this FTTransfer.
     * 
     * @return PPASource1
     */
    public java.lang.String getPPASource1() {
        return PPASource1;
    }


    /**
     * Sets the PPASource1 value for this FTTransfer.
     * 
     * @param PPASource1
     */
    public void setPPASource1(java.lang.String PPASource1) {
        this.PPASource1 = PPASource1;
    }


    /**
     * Gets the PPASource2 value for this FTTransfer.
     * 
     * @return PPASource2
     */
    public java.lang.String getPPASource2() {
        return PPASource2;
    }


    /**
     * Sets the PPASource2 value for this FTTransfer.
     * 
     * @param PPASource2
     */
    public void setPPASource2(java.lang.String PPASource2) {
        this.PPASource2 = PPASource2;
    }


    /**
     * Gets the PPASource3 value for this FTTransfer.
     * 
     * @return PPASource3
     */
    public java.lang.String getPPASource3() {
        return PPASource3;
    }


    /**
     * Sets the PPASource3 value for this FTTransfer.
     * 
     * @param PPASource3
     */
    public void setPPASource3(java.lang.String PPASource3) {
        this.PPASource3 = PPASource3;
    }


    /**
     * Gets the PPASource4 value for this FTTransfer.
     * 
     * @return PPASource4
     */
    public java.lang.String getPPASource4() {
        return PPASource4;
    }


    /**
     * Sets the PPASource4 value for this FTTransfer.
     * 
     * @param PPASource4
     */
    public void setPPASource4(java.lang.String PPASource4) {
        this.PPASource4 = PPASource4;
    }


    /**
     * Gets the PPAStatus1 value for this FTTransfer.
     * 
     * @return PPAStatus1
     */
    public java.lang.String getPPAStatus1() {
        return PPAStatus1;
    }


    /**
     * Sets the PPAStatus1 value for this FTTransfer.
     * 
     * @param PPAStatus1
     */
    public void setPPAStatus1(java.lang.String PPAStatus1) {
        this.PPAStatus1 = PPAStatus1;
    }


    /**
     * Gets the PPAStatus2 value for this FTTransfer.
     * 
     * @return PPAStatus2
     */
    public java.lang.String getPPAStatus2() {
        return PPAStatus2;
    }


    /**
     * Sets the PPAStatus2 value for this FTTransfer.
     * 
     * @param PPAStatus2
     */
    public void setPPAStatus2(java.lang.String PPAStatus2) {
        this.PPAStatus2 = PPAStatus2;
    }


    /**
     * Gets the PPAStatus3 value for this FTTransfer.
     * 
     * @return PPAStatus3
     */
    public java.lang.String getPPAStatus3() {
        return PPAStatus3;
    }


    /**
     * Sets the PPAStatus3 value for this FTTransfer.
     * 
     * @param PPAStatus3
     */
    public void setPPAStatus3(java.lang.String PPAStatus3) {
        this.PPAStatus3 = PPAStatus3;
    }


    /**
     * Gets the PPAStatus4 value for this FTTransfer.
     * 
     * @return PPAStatus4
     */
    public java.lang.String getPPAStatus4() {
        return PPAStatus4;
    }


    /**
     * Sets the PPAStatus4 value for this FTTransfer.
     * 
     * @param PPAStatus4
     */
    public void setPPAStatus4(java.lang.String PPAStatus4) {
        this.PPAStatus4 = PPAStatus4;
    }


    /**
     * Gets the PServerName value for this FTTransfer.
     * 
     * @return PServerName
     */
    public java.lang.String getPServerName() {
        return PServerName;
    }


    /**
     * Sets the PServerName value for this FTTransfer.
     * 
     * @param PServerName
     */
    public void setPServerName(java.lang.String PServerName) {
        this.PServerName = PServerName;
    }


    /**
     * Gets the SSLFlag value for this FTTransfer.
     * 
     * @return SSLFlag
     */
    public java.lang.String getSSLFlag() {
        return SSLFlag;
    }


    /**
     * Sets the SSLFlag value for this FTTransfer.
     * 
     * @param SSLFlag
     */
    public void setSSLFlag(java.lang.String SSLFlag) {
        this.SSLFlag = SSLFlag;
    }


    /**
     * Gets the aux0 value for this FTTransfer.
     * 
     * @return aux0
     */
    public java.lang.String getAux0() {
        return aux0;
    }


    /**
     * Sets the aux0 value for this FTTransfer.
     * 
     * @param aux0
     */
    public void setAux0(java.lang.String aux0) {
        this.aux0 = aux0;
    }


    /**
     * Gets the ckPtInterval value for this FTTransfer.
     * 
     * @return ckPtInterval
     */
    public java.lang.String getCkPtInterval() {
        return ckPtInterval;
    }


    /**
     * Sets the ckPtInterval value for this FTTransfer.
     * 
     * @param ckPtInterval
     */
    public void setCkPtInterval(java.lang.String ckPtInterval) {
        this.ckPtInterval = ckPtInterval;
    }


    /**
     * Gets the commandType value for this FTTransfer.
     * 
     * @return commandType
     */
    public java.lang.String getCommandType() {
        return commandType;
    }


    /**
     * Sets the commandType value for this FTTransfer.
     * 
     * @param commandType
     */
    public void setCommandType(java.lang.String commandType) {
        this.commandType = commandType;
    }


    /**
     * Gets the compressionFlag value for this FTTransfer.
     * 
     * @return compressionFlag
     */
    public java.lang.String getCompressionFlag() {
        return compressionFlag;
    }


    /**
     * Sets the compressionFlag value for this FTTransfer.
     * 
     * @param compressionFlag
     */
    public void setCompressionFlag(java.lang.String compressionFlag) {
        this.compressionFlag = compressionFlag;
    }


    /**
     * Gets the createdBy value for this FTTransfer.
     * 
     * @return createdBy
     */
    public java.lang.String getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this FTTransfer.
     * 
     * @param createdBy
     */
    public void setCreatedBy(java.lang.String createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the dataConversionType value for this FTTransfer.
     * 
     * @return dataConversionType
     */
    public java.lang.String getDataConversionType() {
        return dataConversionType;
    }


    /**
     * Sets the dataConversionType value for this FTTransfer.
     * 
     * @param dataConversionType
     */
    public void setDataConversionType(java.lang.String dataConversionType) {
        this.dataConversionType = dataConversionType;
    }


    /**
     * Gets the dateCreated value for this FTTransfer.
     * 
     * @return dateCreated
     */
    public AdminClient.DateTime getDateCreated() {
        return dateCreated;
    }


    /**
     * Sets the dateCreated value for this FTTransfer.
     * 
     * @param dateCreated
     */
    public void setDateCreated(AdminClient.DateTime dateCreated) {
        this.dateCreated = dateCreated;
    }


    /**
     * Gets the dateUpdated value for this FTTransfer.
     * 
     * @return dateUpdated
     */
    public AdminClient.DateTime getDateUpdated() {
        return dateUpdated;
    }


    /**
     * Sets the dateUpdated value for this FTTransfer.
     * 
     * @param dateUpdated
     */
    public void setDateUpdated(AdminClient.DateTime dateUpdated) {
        this.dateUpdated = dateUpdated;
    }


    /**
     * Gets the delimiter value for this FTTransfer.
     * 
     * @return delimiter
     */
    public java.lang.String getDelimiter() {
        return delimiter;
    }


    /**
     * Sets the delimiter value for this FTTransfer.
     * 
     * @param delimiter
     */
    public void setDelimiter(java.lang.String delimiter) {
        this.delimiter = delimiter;
    }


    /**
     * Gets the department value for this FTTransfer.
     * 
     * @return department
     */
    public java.lang.String getDepartment() {
        return department;
    }


    /**
     * Sets the department value for this FTTransfer.
     * 
     * @param department
     */
    public void setDepartment(java.lang.String department) {
        this.department = department;
    }


    /**
     * Gets the description value for this FTTransfer.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this FTTransfer.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the encryptionFlag value for this FTTransfer.
     * 
     * @return encryptionFlag
     */
    public java.lang.String getEncryptionFlag() {
        return encryptionFlag;
    }


    /**
     * Sets the encryptionFlag value for this FTTransfer.
     * 
     * @param encryptionFlag
     */
    public void setEncryptionFlag(java.lang.String encryptionFlag) {
        this.encryptionFlag = encryptionFlag;
    }


    /**
     * Gets the expirationDays value for this FTTransfer.
     * 
     * @return expirationDays
     */
    public java.lang.String getExpirationDays() {
        return expirationDays;
    }


    /**
     * Sets the expirationDays value for this FTTransfer.
     * 
     * @param expirationDays
     */
    public void setExpirationDays(java.lang.String expirationDays) {
        this.expirationDays = expirationDays;
    }


    /**
     * Gets the fileWriteMode value for this FTTransfer.
     * 
     * @return fileWriteMode
     */
    public java.lang.String getFileWriteMode() {
        return fileWriteMode;
    }


    /**
     * Sets the fileWriteMode value for this FTTransfer.
     * 
     * @param fileWriteMode
     */
    public void setFileWriteMode(java.lang.String fileWriteMode) {
        this.fileWriteMode = fileWriteMode;
    }


    /**
     * Gets the hostName value for this FTTransfer.
     * 
     * @return hostName
     */
    public java.lang.String getHostName() {
        return hostName;
    }


    /**
     * Sets the hostName value for this FTTransfer.
     * 
     * @param hostName
     */
    public void setHostName(java.lang.String hostName) {
        this.hostName = hostName;
    }


    /**
     * Gets the hostType value for this FTTransfer.
     * 
     * @return hostType
     */
    public java.lang.String getHostType() {
        return hostType;
    }


    /**
     * Sets the hostType value for this FTTransfer.
     * 
     * @param hostType
     */
    public void setHostType(java.lang.String hostType) {
        this.hostType = hostType;
    }


    /**
     * Gets the initiatorFileName value for this FTTransfer.
     * 
     * @return initiatorFileName
     */
    public java.lang.String getInitiatorFileName() {
        return initiatorFileName;
    }


    /**
     * Sets the initiatorFileName value for this FTTransfer.
     * 
     * @param initiatorFileName
     */
    public void setInitiatorFileName(java.lang.String initiatorFileName) {
        this.initiatorFileName = initiatorFileName;
    }


    /**
     * Gets the isCommand value for this FTTransfer.
     * 
     * @return isCommand
     */
    public boolean isIsCommand() {
        return isCommand;
    }


    /**
     * Sets the isCommand value for this FTTransfer.
     * 
     * @param isCommand
     */
    public void setIsCommand(boolean isCommand) {
        this.isCommand = isCommand;
    }


    /**
     * Gets the localTransTable value for this FTTransfer.
     * 
     * @return localTransTable
     */
    public java.lang.String getLocalTransTable() {
        return localTransTable;
    }


    /**
     * Sets the localTransTable value for this FTTransfer.
     * 
     * @param localTransTable
     */
    public void setLocalTransTable(java.lang.String localTransTable) {
        this.localTransTable = localTransTable;
    }


    /**
     * Gets the loginPWD value for this FTTransfer.
     * 
     * @return loginPWD
     */
    public java.lang.String getLoginPWD() {
        return loginPWD;
    }


    /**
     * Sets the loginPWD value for this FTTransfer.
     * 
     * @param loginPWD
     */
    public void setLoginPWD(java.lang.String loginPWD) {
        this.loginPWD = loginPWD;
    }


    /**
     * Gets the loginUID value for this FTTransfer.
     * 
     * @return loginUID
     */
    public java.lang.String getLoginUID() {
        return loginUID;
    }


    /**
     * Sets the loginUID value for this FTTransfer.
     * 
     * @param loginUID
     */
    public void setLoginUID(java.lang.String loginUID) {
        this.loginUID = loginUID;
    }


    /**
     * Gets the managedDepts value for this FTTransfer.
     * 
     * @return managedDepts
     */
    public java.lang.String[] getManagedDepts() {
        return managedDepts;
    }


    /**
     * Sets the managedDepts value for this FTTransfer.
     * 
     * @param managedDepts
     */
    public void setManagedDepts(java.lang.String[] managedDepts) {
        this.managedDepts = managedDepts;
    }


    /**
     * Gets the needSession value for this FTTransfer.
     * 
     * @return needSession
     */
    public boolean isNeedSession() {
        return needSession;
    }


    /**
     * Sets the needSession value for this FTTransfer.
     * 
     * @param needSession
     */
    public void setNeedSession(boolean needSession) {
        this.needSession = needSession;
    }


    /**
     * Gets the permittedActions value for this FTTransfer.
     * 
     * @return permittedActions
     */
    public java.lang.String getPermittedActions() {
        return permittedActions;
    }


    /**
     * Sets the permittedActions value for this FTTransfer.
     * 
     * @param permittedActions
     */
    public void setPermittedActions(java.lang.String permittedActions) {
        this.permittedActions = permittedActions;
    }


    /**
     * Gets the portNum value for this FTTransfer.
     * 
     * @return portNum
     */
    public java.lang.String getPortNum() {
        return portNum;
    }


    /**
     * Sets the portNum value for this FTTransfer.
     * 
     * @param portNum
     */
    public void setPortNum(java.lang.String portNum) {
        this.portNum = portNum;
    }


    /**
     * Gets the processName value for this FTTransfer.
     * 
     * @return processName
     */
    public java.lang.String getProcessName() {
        return processName;
    }


    /**
     * Sets the processName value for this FTTransfer.
     * 
     * @param processName
     */
    public void setProcessName(java.lang.String processName) {
        this.processName = processName;
    }


    /**
     * Gets the ptActionData1 value for this FTTransfer.
     * 
     * @return ptActionData1
     */
    public java.lang.String getPtActionData1() {
        return ptActionData1;
    }


    /**
     * Sets the ptActionData1 value for this FTTransfer.
     * 
     * @param ptActionData1
     */
    public void setPtActionData1(java.lang.String ptActionData1) {
        this.ptActionData1 = ptActionData1;
    }


    /**
     * Gets the ptActionData2 value for this FTTransfer.
     * 
     * @return ptActionData2
     */
    public java.lang.String getPtActionData2() {
        return ptActionData2;
    }


    /**
     * Sets the ptActionData2 value for this FTTransfer.
     * 
     * @param ptActionData2
     */
    public void setPtActionData2(java.lang.String ptActionData2) {
        this.ptActionData2 = ptActionData2;
    }


    /**
     * Gets the ptActionData3 value for this FTTransfer.
     * 
     * @return ptActionData3
     */
    public java.lang.String getPtActionData3() {
        return ptActionData3;
    }


    /**
     * Sets the ptActionData3 value for this FTTransfer.
     * 
     * @param ptActionData3
     */
    public void setPtActionData3(java.lang.String ptActionData3) {
        this.ptActionData3 = ptActionData3;
    }


    /**
     * Gets the ptActionData4 value for this FTTransfer.
     * 
     * @return ptActionData4
     */
    public java.lang.String getPtActionData4() {
        return ptActionData4;
    }


    /**
     * Sets the ptActionData4 value for this FTTransfer.
     * 
     * @param ptActionData4
     */
    public void setPtActionData4(java.lang.String ptActionData4) {
        this.ptActionData4 = ptActionData4;
    }


    /**
     * Gets the ptActionFlag1 value for this FTTransfer.
     * 
     * @return ptActionFlag1
     */
    public java.lang.String getPtActionFlag1() {
        return ptActionFlag1;
    }


    /**
     * Sets the ptActionFlag1 value for this FTTransfer.
     * 
     * @param ptActionFlag1
     */
    public void setPtActionFlag1(java.lang.String ptActionFlag1) {
        this.ptActionFlag1 = ptActionFlag1;
    }


    /**
     * Gets the ptActionFlag2 value for this FTTransfer.
     * 
     * @return ptActionFlag2
     */
    public java.lang.String getPtActionFlag2() {
        return ptActionFlag2;
    }


    /**
     * Sets the ptActionFlag2 value for this FTTransfer.
     * 
     * @param ptActionFlag2
     */
    public void setPtActionFlag2(java.lang.String ptActionFlag2) {
        this.ptActionFlag2 = ptActionFlag2;
    }


    /**
     * Gets the ptActionFlag3 value for this FTTransfer.
     * 
     * @return ptActionFlag3
     */
    public java.lang.String getPtActionFlag3() {
        return ptActionFlag3;
    }


    /**
     * Sets the ptActionFlag3 value for this FTTransfer.
     * 
     * @param ptActionFlag3
     */
    public void setPtActionFlag3(java.lang.String ptActionFlag3) {
        this.ptActionFlag3 = ptActionFlag3;
    }


    /**
     * Gets the ptActionFlag4 value for this FTTransfer.
     * 
     * @return ptActionFlag4
     */
    public java.lang.String getPtActionFlag4() {
        return ptActionFlag4;
    }


    /**
     * Sets the ptActionFlag4 value for this FTTransfer.
     * 
     * @param ptActionFlag4
     */
    public void setPtActionFlag4(java.lang.String ptActionFlag4) {
        this.ptActionFlag4 = ptActionFlag4;
    }


    /**
     * Gets the ptActionType1 value for this FTTransfer.
     * 
     * @return ptActionType1
     */
    public java.lang.String getPtActionType1() {
        return ptActionType1;
    }


    /**
     * Sets the ptActionType1 value for this FTTransfer.
     * 
     * @param ptActionType1
     */
    public void setPtActionType1(java.lang.String ptActionType1) {
        this.ptActionType1 = ptActionType1;
    }


    /**
     * Gets the ptActionType2 value for this FTTransfer.
     * 
     * @return ptActionType2
     */
    public java.lang.String getPtActionType2() {
        return ptActionType2;
    }


    /**
     * Sets the ptActionType2 value for this FTTransfer.
     * 
     * @param ptActionType2
     */
    public void setPtActionType2(java.lang.String ptActionType2) {
        this.ptActionType2 = ptActionType2;
    }


    /**
     * Gets the ptActionType3 value for this FTTransfer.
     * 
     * @return ptActionType3
     */
    public java.lang.String getPtActionType3() {
        return ptActionType3;
    }


    /**
     * Sets the ptActionType3 value for this FTTransfer.
     * 
     * @param ptActionType3
     */
    public void setPtActionType3(java.lang.String ptActionType3) {
        this.ptActionType3 = ptActionType3;
    }


    /**
     * Gets the ptActionType4 value for this FTTransfer.
     * 
     * @return ptActionType4
     */
    public java.lang.String getPtActionType4() {
        return ptActionType4;
    }


    /**
     * Sets the ptActionType4 value for this FTTransfer.
     * 
     * @param ptActionType4
     */
    public void setPtActionType4(java.lang.String ptActionType4) {
        this.ptActionType4 = ptActionType4;
    }


    /**
     * Gets the remoteTransTable value for this FTTransfer.
     * 
     * @return remoteTransTable
     */
    public java.lang.String getRemoteTransTable() {
        return remoteTransTable;
    }


    /**
     * Sets the remoteTransTable value for this FTTransfer.
     * 
     * @param remoteTransTable
     */
    public void setRemoteTransTable(java.lang.String remoteTransTable) {
        this.remoteTransTable = remoteTransTable;
    }


    /**
     * Gets the responderFileName value for this FTTransfer.
     * 
     * @return responderFileName
     */
    public java.lang.String getResponderFileName() {
        return responderFileName;
    }


    /**
     * Sets the responderFileName value for this FTTransfer.
     * 
     * @param responderFileName
     */
    public void setResponderFileName(java.lang.String responderFileName) {
        this.responderFileName = responderFileName;
    }


    /**
     * Gets the responderPWD value for this FTTransfer.
     * 
     * @return responderPWD
     */
    public java.lang.String getResponderPWD() {
        return responderPWD;
    }


    /**
     * Sets the responderPWD value for this FTTransfer.
     * 
     * @param responderPWD
     */
    public void setResponderPWD(java.lang.String responderPWD) {
        this.responderPWD = responderPWD;
    }


    /**
     * Gets the responderUID value for this FTTransfer.
     * 
     * @return responderUID
     */
    public java.lang.String getResponderUID() {
        return responderUID;
    }


    /**
     * Sets the responderUID value for this FTTransfer.
     * 
     * @param responderUID
     */
    public void setResponderUID(java.lang.String responderUID) {
        this.responderUID = responderUID;
    }


    /**
     * Gets the scanSubDir value for this FTTransfer.
     * 
     * @return scanSubDir
     */
    public java.lang.String getScanSubDir() {
        return scanSubDir;
    }


    /**
     * Sets the scanSubDir value for this FTTransfer.
     * 
     * @param scanSubDir
     */
    public void setScanSubDir(java.lang.String scanSubDir) {
        this.scanSubDir = scanSubDir;
    }


    /**
     * Gets the securityAttribute value for this FTTransfer.
     * 
     * @return securityAttribute
     */
    public java.lang.String getSecurityAttribute() {
        return securityAttribute;
    }


    /**
     * Sets the securityAttribute value for this FTTransfer.
     * 
     * @param securityAttribute
     */
    public void setSecurityAttribute(java.lang.String securityAttribute) {
        this.securityAttribute = securityAttribute;
    }


    /**
     * Gets the sendRecvFlag value for this FTTransfer.
     * 
     * @return sendRecvFlag
     */
    public java.lang.String getSendRecvFlag() {
        return sendRecvFlag;
    }


    /**
     * Sets the sendRecvFlag value for this FTTransfer.
     * 
     * @param sendRecvFlag
     */
    public void setSendRecvFlag(java.lang.String sendRecvFlag) {
        this.sendRecvFlag = sendRecvFlag;
    }


    /**
     * Gets the tableName value for this FTTransfer.
     * 
     * @return tableName
     */
    public java.lang.String getTableName() {
        return tableName;
    }


    /**
     * Sets the tableName value for this FTTransfer.
     * 
     * @param tableName
     */
    public void setTableName(java.lang.String tableName) {
        this.tableName = tableName;
    }


    /**
     * Gets the toEmailAddrF value for this FTTransfer.
     * 
     * @return toEmailAddrF
     */
    public java.lang.String getToEmailAddrF() {
        return toEmailAddrF;
    }


    /**
     * Sets the toEmailAddrF value for this FTTransfer.
     * 
     * @param toEmailAddrF
     */
    public void setToEmailAddrF(java.lang.String toEmailAddrF) {
        this.toEmailAddrF = toEmailAddrF;
    }


    /**
     * Gets the toEmailAddrS value for this FTTransfer.
     * 
     * @return toEmailAddrS
     */
    public java.lang.String getToEmailAddrS() {
        return toEmailAddrS;
    }


    /**
     * Sets the toEmailAddrS value for this FTTransfer.
     * 
     * @param toEmailAddrS
     */
    public void setToEmailAddrS(java.lang.String toEmailAddrS) {
        this.toEmailAddrS = toEmailAddrS;
    }


    /**
     * Gets the trScheduleDate value for this FTTransfer.
     * 
     * @return trScheduleDate
     */
    public AdminClient.DateTime getTrScheduleDate() {
        return trScheduleDate;
    }


    /**
     * Sets the trScheduleDate value for this FTTransfer.
     * 
     * @param trScheduleDate
     */
    public void setTrScheduleDate(AdminClient.DateTime trScheduleDate) {
        this.trScheduleDate = trScheduleDate;
    }


    /**
     * Gets the traceLvl value for this FTTransfer.
     * 
     * @return traceLvl
     */
    public java.lang.String getTraceLvl() {
        return traceLvl;
    }


    /**
     * Sets the traceLvl value for this FTTransfer.
     * 
     * @param traceLvl
     */
    public void setTraceLvl(java.lang.String traceLvl) {
        this.traceLvl = traceLvl;
    }


    /**
     * Gets the transferID value for this FTTransfer.
     * 
     * @return transferID
     */
    public java.lang.String getTransferID() {
        return transferID;
    }


    /**
     * Sets the transferID value for this FTTransfer.
     * 
     * @param transferID
     */
    public void setTransferID(java.lang.String transferID) {
        this.transferID = transferID;
    }


    /**
     * Gets the transferWork value for this FTTransfer.
     * 
     * @return transferWork
     */
    public java.lang.String getTransferWork() {
        return transferWork;
    }


    /**
     * Sets the transferWork value for this FTTransfer.
     * 
     * @param transferWork
     */
    public void setTransferWork(java.lang.String transferWork) {
        this.transferWork = transferWork;
    }


    /**
     * Gets the tryMaxCount value for this FTTransfer.
     * 
     * @return tryMaxCount
     */
    public java.lang.String getTryMaxCount() {
        return tryMaxCount;
    }


    /**
     * Sets the tryMaxCount value for this FTTransfer.
     * 
     * @param tryMaxCount
     */
    public void setTryMaxCount(java.lang.String tryMaxCount) {
        this.tryMaxCount = tryMaxCount;
    }


    /**
     * Gets the unixPermissions value for this FTTransfer.
     * 
     * @return unixPermissions
     */
    public java.lang.String getUnixPermissions() {
        return unixPermissions;
    }


    /**
     * Sets the unixPermissions value for this FTTransfer.
     * 
     * @param unixPermissions
     */
    public void setUnixPermissions(java.lang.String unixPermissions) {
        this.unixPermissions = unixPermissions;
    }


    /**
     * Gets the updatedBy value for this FTTransfer.
     * 
     * @return updatedBy
     */
    public java.lang.String getUpdatedBy() {
        return updatedBy;
    }


    /**
     * Sets the updatedBy value for this FTTransfer.
     * 
     * @param updatedBy
     */
    public void setUpdatedBy(java.lang.String updatedBy) {
        this.updatedBy = updatedBy;
    }


    /**
     * Gets the userData value for this FTTransfer.
     * 
     * @return userData
     */
    public java.lang.String getUserData() {
        return userData;
    }


    /**
     * Sets the userData value for this FTTransfer.
     * 
     * @param userData
     */
    public void setUserData(java.lang.String userData) {
        this.userData = userData;
    }


    /**
     * Gets the waitFlag value for this FTTransfer.
     * 
     * @return waitFlag
     */
    public java.lang.String getWaitFlag() {
        return waitFlag;
    }


    /**
     * Sets the waitFlag value for this FTTransfer.
     * 
     * @param waitFlag
     */
    public void setWaitFlag(java.lang.String waitFlag) {
        this.waitFlag = waitFlag;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FTTransfer)) return false;
        FTTransfer other = (FTTransfer) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.JMSMsgID==null && other.getJMSMsgID()==null) || 
             (this.JMSMsgID!=null &&
              this.JMSMsgID.equals(other.getJMSMsgID()))) &&
            ((this.JMSTransferCheckFlag==null && other.getJMSTransferCheckFlag()==null) || 
             (this.JMSTransferCheckFlag!=null &&
              this.JMSTransferCheckFlag.equals(other.getJMSTransferCheckFlag()))) &&
            ((this.JMSTransferCheckInterval==null && other.getJMSTransferCheckInterval()==null) || 
             (this.JMSTransferCheckInterval!=null &&
              this.JMSTransferCheckInterval.equals(other.getJMSTransferCheckInterval()))) &&
            ((this.JMSTransferCheckTimeout==null && other.getJMSTransferCheckTimeout()==null) || 
             (this.JMSTransferCheckTimeout!=null &&
              this.JMSTransferCheckTimeout.equals(other.getJMSTransferCheckTimeout()))) &&
            ((this.JMSUserID==null && other.getJMSUserID()==null) || 
             (this.JMSUserID!=null &&
              this.JMSUserID.equals(other.getJMSUserID()))) &&
            ((this.JMSUserPwd==null && other.getJMSUserPwd()==null) || 
             (this.JMSUserPwd!=null &&
              this.JMSUserPwd.equals(other.getJMSUserPwd()))) &&
            ((this.OS390AllocDir==null && other.getOS390AllocDir()==null) || 
             (this.OS390AllocDir!=null &&
              this.OS390AllocDir.equals(other.getOS390AllocDir()))) &&
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
            ((this.OS390LRECL==null && other.getOS390LRECL()==null) || 
             (this.OS390LRECL!=null &&
              this.OS390LRECL.equals(other.getOS390LRECL()))) &&
            ((this.OS390MgtClass==null && other.getOS390MgtClass()==null) || 
             (this.OS390MgtClass!=null &&
              this.OS390MgtClass.equals(other.getOS390MgtClass()))) &&
            ((this.OS390RECFM==null && other.getOS390RECFM()==null) || 
             (this.OS390RECFM!=null &&
              this.OS390RECFM.equals(other.getOS390RECFM()))) &&
            ((this.OS390StorClass==null && other.getOS390StorClass()==null) || 
             (this.OS390StorClass!=null &&
              this.OS390StorClass.equals(other.getOS390StorClass()))) &&
            ((this.OS390Unit==null && other.getOS390Unit()==null) || 
             (this.OS390Unit!=null &&
              this.OS390Unit.equals(other.getOS390Unit()))) &&
            ((this.OS390Volume==null && other.getOS390Volume()==null) || 
             (this.OS390Volume!=null &&
              this.OS390Volume.equals(other.getOS390Volume()))) &&
            ((this.PPASource1==null && other.getPPASource1()==null) || 
             (this.PPASource1!=null &&
              this.PPASource1.equals(other.getPPASource1()))) &&
            ((this.PPASource2==null && other.getPPASource2()==null) || 
             (this.PPASource2!=null &&
              this.PPASource2.equals(other.getPPASource2()))) &&
            ((this.PPASource3==null && other.getPPASource3()==null) || 
             (this.PPASource3!=null &&
              this.PPASource3.equals(other.getPPASource3()))) &&
            ((this.PPASource4==null && other.getPPASource4()==null) || 
             (this.PPASource4!=null &&
              this.PPASource4.equals(other.getPPASource4()))) &&
            ((this.PPAStatus1==null && other.getPPAStatus1()==null) || 
             (this.PPAStatus1!=null &&
              this.PPAStatus1.equals(other.getPPAStatus1()))) &&
            ((this.PPAStatus2==null && other.getPPAStatus2()==null) || 
             (this.PPAStatus2!=null &&
              this.PPAStatus2.equals(other.getPPAStatus2()))) &&
            ((this.PPAStatus3==null && other.getPPAStatus3()==null) || 
             (this.PPAStatus3!=null &&
              this.PPAStatus3.equals(other.getPPAStatus3()))) &&
            ((this.PPAStatus4==null && other.getPPAStatus4()==null) || 
             (this.PPAStatus4!=null &&
              this.PPAStatus4.equals(other.getPPAStatus4()))) &&
            ((this.PServerName==null && other.getPServerName()==null) || 
             (this.PServerName!=null &&
              this.PServerName.equals(other.getPServerName()))) &&
            ((this.SSLFlag==null && other.getSSLFlag()==null) || 
             (this.SSLFlag!=null &&
              this.SSLFlag.equals(other.getSSLFlag()))) &&
            ((this.aux0==null && other.getAux0()==null) || 
             (this.aux0!=null &&
              this.aux0.equals(other.getAux0()))) &&
            ((this.ckPtInterval==null && other.getCkPtInterval()==null) || 
             (this.ckPtInterval!=null &&
              this.ckPtInterval.equals(other.getCkPtInterval()))) &&
            ((this.commandType==null && other.getCommandType()==null) || 
             (this.commandType!=null &&
              this.commandType.equals(other.getCommandType()))) &&
            ((this.compressionFlag==null && other.getCompressionFlag()==null) || 
             (this.compressionFlag!=null &&
              this.compressionFlag.equals(other.getCompressionFlag()))) &&
            ((this.createdBy==null && other.getCreatedBy()==null) || 
             (this.createdBy!=null &&
              this.createdBy.equals(other.getCreatedBy()))) &&
            ((this.dataConversionType==null && other.getDataConversionType()==null) || 
             (this.dataConversionType!=null &&
              this.dataConversionType.equals(other.getDataConversionType()))) &&
            ((this.dateCreated==null && other.getDateCreated()==null) || 
             (this.dateCreated!=null &&
              this.dateCreated.equals(other.getDateCreated()))) &&
            ((this.dateUpdated==null && other.getDateUpdated()==null) || 
             (this.dateUpdated!=null &&
              this.dateUpdated.equals(other.getDateUpdated()))) &&
            ((this.delimiter==null && other.getDelimiter()==null) || 
             (this.delimiter!=null &&
              this.delimiter.equals(other.getDelimiter()))) &&
            ((this.department==null && other.getDepartment()==null) || 
             (this.department!=null &&
              this.department.equals(other.getDepartment()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.encryptionFlag==null && other.getEncryptionFlag()==null) || 
             (this.encryptionFlag!=null &&
              this.encryptionFlag.equals(other.getEncryptionFlag()))) &&
            ((this.expirationDays==null && other.getExpirationDays()==null) || 
             (this.expirationDays!=null &&
              this.expirationDays.equals(other.getExpirationDays()))) &&
            ((this.fileWriteMode==null && other.getFileWriteMode()==null) || 
             (this.fileWriteMode!=null &&
              this.fileWriteMode.equals(other.getFileWriteMode()))) &&
            ((this.hostName==null && other.getHostName()==null) || 
             (this.hostName!=null &&
              this.hostName.equals(other.getHostName()))) &&
            ((this.hostType==null && other.getHostType()==null) || 
             (this.hostType!=null &&
              this.hostType.equals(other.getHostType()))) &&
            ((this.initiatorFileName==null && other.getInitiatorFileName()==null) || 
             (this.initiatorFileName!=null &&
              this.initiatorFileName.equals(other.getInitiatorFileName()))) &&
            this.isCommand == other.isIsCommand() &&
            ((this.localTransTable==null && other.getLocalTransTable()==null) || 
             (this.localTransTable!=null &&
              this.localTransTable.equals(other.getLocalTransTable()))) &&
            ((this.loginPWD==null && other.getLoginPWD()==null) || 
             (this.loginPWD!=null &&
              this.loginPWD.equals(other.getLoginPWD()))) &&
            ((this.loginUID==null && other.getLoginUID()==null) || 
             (this.loginUID!=null &&
              this.loginUID.equals(other.getLoginUID()))) &&
            ((this.managedDepts==null && other.getManagedDepts()==null) || 
             (this.managedDepts!=null &&
              java.util.Arrays.equals(this.managedDepts, other.getManagedDepts()))) &&
            this.needSession == other.isNeedSession() &&
            ((this.permittedActions==null && other.getPermittedActions()==null) || 
             (this.permittedActions!=null &&
              this.permittedActions.equals(other.getPermittedActions()))) &&
            ((this.portNum==null && other.getPortNum()==null) || 
             (this.portNum!=null &&
              this.portNum.equals(other.getPortNum()))) &&
            ((this.processName==null && other.getProcessName()==null) || 
             (this.processName!=null &&
              this.processName.equals(other.getProcessName()))) &&
            ((this.ptActionData1==null && other.getPtActionData1()==null) || 
             (this.ptActionData1!=null &&
              this.ptActionData1.equals(other.getPtActionData1()))) &&
            ((this.ptActionData2==null && other.getPtActionData2()==null) || 
             (this.ptActionData2!=null &&
              this.ptActionData2.equals(other.getPtActionData2()))) &&
            ((this.ptActionData3==null && other.getPtActionData3()==null) || 
             (this.ptActionData3!=null &&
              this.ptActionData3.equals(other.getPtActionData3()))) &&
            ((this.ptActionData4==null && other.getPtActionData4()==null) || 
             (this.ptActionData4!=null &&
              this.ptActionData4.equals(other.getPtActionData4()))) &&
            ((this.ptActionFlag1==null && other.getPtActionFlag1()==null) || 
             (this.ptActionFlag1!=null &&
              this.ptActionFlag1.equals(other.getPtActionFlag1()))) &&
            ((this.ptActionFlag2==null && other.getPtActionFlag2()==null) || 
             (this.ptActionFlag2!=null &&
              this.ptActionFlag2.equals(other.getPtActionFlag2()))) &&
            ((this.ptActionFlag3==null && other.getPtActionFlag3()==null) || 
             (this.ptActionFlag3!=null &&
              this.ptActionFlag3.equals(other.getPtActionFlag3()))) &&
            ((this.ptActionFlag4==null && other.getPtActionFlag4()==null) || 
             (this.ptActionFlag4!=null &&
              this.ptActionFlag4.equals(other.getPtActionFlag4()))) &&
            ((this.ptActionType1==null && other.getPtActionType1()==null) || 
             (this.ptActionType1!=null &&
              this.ptActionType1.equals(other.getPtActionType1()))) &&
            ((this.ptActionType2==null && other.getPtActionType2()==null) || 
             (this.ptActionType2!=null &&
              this.ptActionType2.equals(other.getPtActionType2()))) &&
            ((this.ptActionType3==null && other.getPtActionType3()==null) || 
             (this.ptActionType3!=null &&
              this.ptActionType3.equals(other.getPtActionType3()))) &&
            ((this.ptActionType4==null && other.getPtActionType4()==null) || 
             (this.ptActionType4!=null &&
              this.ptActionType4.equals(other.getPtActionType4()))) &&
            ((this.remoteTransTable==null && other.getRemoteTransTable()==null) || 
             (this.remoteTransTable!=null &&
              this.remoteTransTable.equals(other.getRemoteTransTable()))) &&
            ((this.responderFileName==null && other.getResponderFileName()==null) || 
             (this.responderFileName!=null &&
              this.responderFileName.equals(other.getResponderFileName()))) &&
            ((this.responderPWD==null && other.getResponderPWD()==null) || 
             (this.responderPWD!=null &&
              this.responderPWD.equals(other.getResponderPWD()))) &&
            ((this.responderUID==null && other.getResponderUID()==null) || 
             (this.responderUID!=null &&
              this.responderUID.equals(other.getResponderUID()))) &&
            ((this.scanSubDir==null && other.getScanSubDir()==null) || 
             (this.scanSubDir!=null &&
              this.scanSubDir.equals(other.getScanSubDir()))) &&
            ((this.securityAttribute==null && other.getSecurityAttribute()==null) || 
             (this.securityAttribute!=null &&
              this.securityAttribute.equals(other.getSecurityAttribute()))) &&
            ((this.sendRecvFlag==null && other.getSendRecvFlag()==null) || 
             (this.sendRecvFlag!=null &&
              this.sendRecvFlag.equals(other.getSendRecvFlag()))) &&
            ((this.tableName==null && other.getTableName()==null) || 
             (this.tableName!=null &&
              this.tableName.equals(other.getTableName()))) &&
            ((this.toEmailAddrF==null && other.getToEmailAddrF()==null) || 
             (this.toEmailAddrF!=null &&
              this.toEmailAddrF.equals(other.getToEmailAddrF()))) &&
            ((this.toEmailAddrS==null && other.getToEmailAddrS()==null) || 
             (this.toEmailAddrS!=null &&
              this.toEmailAddrS.equals(other.getToEmailAddrS()))) &&
            ((this.trScheduleDate==null && other.getTrScheduleDate()==null) || 
             (this.trScheduleDate!=null &&
              this.trScheduleDate.equals(other.getTrScheduleDate()))) &&
            ((this.traceLvl==null && other.getTraceLvl()==null) || 
             (this.traceLvl!=null &&
              this.traceLvl.equals(other.getTraceLvl()))) &&
            ((this.transferID==null && other.getTransferID()==null) || 
             (this.transferID!=null &&
              this.transferID.equals(other.getTransferID()))) &&
            ((this.transferWork==null && other.getTransferWork()==null) || 
             (this.transferWork!=null &&
              this.transferWork.equals(other.getTransferWork()))) &&
            ((this.tryMaxCount==null && other.getTryMaxCount()==null) || 
             (this.tryMaxCount!=null &&
              this.tryMaxCount.equals(other.getTryMaxCount()))) &&
            ((this.unixPermissions==null && other.getUnixPermissions()==null) || 
             (this.unixPermissions!=null &&
              this.unixPermissions.equals(other.getUnixPermissions()))) &&
            ((this.updatedBy==null && other.getUpdatedBy()==null) || 
             (this.updatedBy!=null &&
              this.updatedBy.equals(other.getUpdatedBy()))) &&
            ((this.userData==null && other.getUserData()==null) || 
             (this.userData!=null &&
              this.userData.equals(other.getUserData()))) &&
            ((this.waitFlag==null && other.getWaitFlag()==null) || 
             (this.waitFlag!=null &&
              this.waitFlag.equals(other.getWaitFlag())));
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
        if (getJMSMsgID() != null) {
            _hashCode += getJMSMsgID().hashCode();
        }
        if (getJMSTransferCheckFlag() != null) {
            _hashCode += getJMSTransferCheckFlag().hashCode();
        }
        if (getJMSTransferCheckInterval() != null) {
            _hashCode += getJMSTransferCheckInterval().hashCode();
        }
        if (getJMSTransferCheckTimeout() != null) {
            _hashCode += getJMSTransferCheckTimeout().hashCode();
        }
        if (getJMSUserID() != null) {
            _hashCode += getJMSUserID().hashCode();
        }
        if (getJMSUserPwd() != null) {
            _hashCode += getJMSUserPwd().hashCode();
        }
        if (getOS390AllocDir() != null) {
            _hashCode += getOS390AllocDir().hashCode();
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
        if (getOS390LRECL() != null) {
            _hashCode += getOS390LRECL().hashCode();
        }
        if (getOS390MgtClass() != null) {
            _hashCode += getOS390MgtClass().hashCode();
        }
        if (getOS390RECFM() != null) {
            _hashCode += getOS390RECFM().hashCode();
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
        if (getPPASource1() != null) {
            _hashCode += getPPASource1().hashCode();
        }
        if (getPPASource2() != null) {
            _hashCode += getPPASource2().hashCode();
        }
        if (getPPASource3() != null) {
            _hashCode += getPPASource3().hashCode();
        }
        if (getPPASource4() != null) {
            _hashCode += getPPASource4().hashCode();
        }
        if (getPPAStatus1() != null) {
            _hashCode += getPPAStatus1().hashCode();
        }
        if (getPPAStatus2() != null) {
            _hashCode += getPPAStatus2().hashCode();
        }
        if (getPPAStatus3() != null) {
            _hashCode += getPPAStatus3().hashCode();
        }
        if (getPPAStatus4() != null) {
            _hashCode += getPPAStatus4().hashCode();
        }
        if (getPServerName() != null) {
            _hashCode += getPServerName().hashCode();
        }
        if (getSSLFlag() != null) {
            _hashCode += getSSLFlag().hashCode();
        }
        if (getAux0() != null) {
            _hashCode += getAux0().hashCode();
        }
        if (getCkPtInterval() != null) {
            _hashCode += getCkPtInterval().hashCode();
        }
        if (getCommandType() != null) {
            _hashCode += getCommandType().hashCode();
        }
        if (getCompressionFlag() != null) {
            _hashCode += getCompressionFlag().hashCode();
        }
        if (getCreatedBy() != null) {
            _hashCode += getCreatedBy().hashCode();
        }
        if (getDataConversionType() != null) {
            _hashCode += getDataConversionType().hashCode();
        }
        if (getDateCreated() != null) {
            _hashCode += getDateCreated().hashCode();
        }
        if (getDateUpdated() != null) {
            _hashCode += getDateUpdated().hashCode();
        }
        if (getDelimiter() != null) {
            _hashCode += getDelimiter().hashCode();
        }
        if (getDepartment() != null) {
            _hashCode += getDepartment().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getEncryptionFlag() != null) {
            _hashCode += getEncryptionFlag().hashCode();
        }
        if (getExpirationDays() != null) {
            _hashCode += getExpirationDays().hashCode();
        }
        if (getFileWriteMode() != null) {
            _hashCode += getFileWriteMode().hashCode();
        }
        if (getHostName() != null) {
            _hashCode += getHostName().hashCode();
        }
        if (getHostType() != null) {
            _hashCode += getHostType().hashCode();
        }
        if (getInitiatorFileName() != null) {
            _hashCode += getInitiatorFileName().hashCode();
        }
        _hashCode += (isIsCommand() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getLocalTransTable() != null) {
            _hashCode += getLocalTransTable().hashCode();
        }
        if (getLoginPWD() != null) {
            _hashCode += getLoginPWD().hashCode();
        }
        if (getLoginUID() != null) {
            _hashCode += getLoginUID().hashCode();
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
        _hashCode += (isNeedSession() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getPermittedActions() != null) {
            _hashCode += getPermittedActions().hashCode();
        }
        if (getPortNum() != null) {
            _hashCode += getPortNum().hashCode();
        }
        if (getProcessName() != null) {
            _hashCode += getProcessName().hashCode();
        }
        if (getPtActionData1() != null) {
            _hashCode += getPtActionData1().hashCode();
        }
        if (getPtActionData2() != null) {
            _hashCode += getPtActionData2().hashCode();
        }
        if (getPtActionData3() != null) {
            _hashCode += getPtActionData3().hashCode();
        }
        if (getPtActionData4() != null) {
            _hashCode += getPtActionData4().hashCode();
        }
        if (getPtActionFlag1() != null) {
            _hashCode += getPtActionFlag1().hashCode();
        }
        if (getPtActionFlag2() != null) {
            _hashCode += getPtActionFlag2().hashCode();
        }
        if (getPtActionFlag3() != null) {
            _hashCode += getPtActionFlag3().hashCode();
        }
        if (getPtActionFlag4() != null) {
            _hashCode += getPtActionFlag4().hashCode();
        }
        if (getPtActionType1() != null) {
            _hashCode += getPtActionType1().hashCode();
        }
        if (getPtActionType2() != null) {
            _hashCode += getPtActionType2().hashCode();
        }
        if (getPtActionType3() != null) {
            _hashCode += getPtActionType3().hashCode();
        }
        if (getPtActionType4() != null) {
            _hashCode += getPtActionType4().hashCode();
        }
        if (getRemoteTransTable() != null) {
            _hashCode += getRemoteTransTable().hashCode();
        }
        if (getResponderFileName() != null) {
            _hashCode += getResponderFileName().hashCode();
        }
        if (getResponderPWD() != null) {
            _hashCode += getResponderPWD().hashCode();
        }
        if (getResponderUID() != null) {
            _hashCode += getResponderUID().hashCode();
        }
        if (getScanSubDir() != null) {
            _hashCode += getScanSubDir().hashCode();
        }
        if (getSecurityAttribute() != null) {
            _hashCode += getSecurityAttribute().hashCode();
        }
        if (getSendRecvFlag() != null) {
            _hashCode += getSendRecvFlag().hashCode();
        }
        if (getTableName() != null) {
            _hashCode += getTableName().hashCode();
        }
        if (getToEmailAddrF() != null) {
            _hashCode += getToEmailAddrF().hashCode();
        }
        if (getToEmailAddrS() != null) {
            _hashCode += getToEmailAddrS().hashCode();
        }
        if (getTrScheduleDate() != null) {
            _hashCode += getTrScheduleDate().hashCode();
        }
        if (getTraceLvl() != null) {
            _hashCode += getTraceLvl().hashCode();
        }
        if (getTransferID() != null) {
            _hashCode += getTransferID().hashCode();
        }
        if (getTransferWork() != null) {
            _hashCode += getTransferWork().hashCode();
        }
        if (getTryMaxCount() != null) {
            _hashCode += getTryMaxCount().hashCode();
        }
        if (getUnixPermissions() != null) {
            _hashCode += getUnixPermissions().hashCode();
        }
        if (getUpdatedBy() != null) {
            _hashCode += getUpdatedBy().hashCode();
        }
        if (getUserData() != null) {
            _hashCode += getUserData().hashCode();
        }
        if (getWaitFlag() != null) {
            _hashCode += getWaitFlag().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FTTransfer.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:AdministratorService", "FTTransfer"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("JMSMsgID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "JMSMsgID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("JMSTransferCheckFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "JMSTransferCheckFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("JMSTransferCheckInterval");
        elemField.setXmlName(new javax.xml.namespace.QName("", "JMSTransferCheckInterval"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("JMSTransferCheckTimeout");
        elemField.setXmlName(new javax.xml.namespace.QName("", "JMSTransferCheckTimeout"));
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
        elemField.setFieldName("OS390AllocDir");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OS390AllocDir"));
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
        elemField.setFieldName("OS390LRECL");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OS390LRECL"));
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
        elemField.setFieldName("OS390RECFM");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OS390RECFM"));
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
        elemField.setFieldName("PPASource1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PPASource1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PPASource2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PPASource2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PPASource3");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PPASource3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PPASource4");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PPASource4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PPAStatus1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PPAStatus1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PPAStatus2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PPAStatus2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PPAStatus3");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PPAStatus3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PPAStatus4");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PPAStatus4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PServerName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PServerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SSLFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SSLFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aux0");
        elemField.setXmlName(new javax.xml.namespace.QName("", "aux0"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ckPtInterval");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ckPtInterval"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commandType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "commandType"));
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
        elemField.setFieldName("createdBy");
        elemField.setXmlName(new javax.xml.namespace.QName("", "createdBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataConversionType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataConversionType"));
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
        elemField.setFieldName("delimiter");
        elemField.setXmlName(new javax.xml.namespace.QName("", "delimiter"));
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
        elemField.setFieldName("encryptionFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "encryptionFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expirationDays");
        elemField.setXmlName(new javax.xml.namespace.QName("", "expirationDays"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileWriteMode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fileWriteMode"));
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
        elemField.setFieldName("hostType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hostType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("initiatorFileName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "initiatorFileName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isCommand");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isCommand"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localTransTable");
        elemField.setXmlName(new javax.xml.namespace.QName("", "localTransTable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loginPWD");
        elemField.setXmlName(new javax.xml.namespace.QName("", "loginPWD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loginUID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "loginUID"));
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
        elemField.setFieldName("needSession");
        elemField.setXmlName(new javax.xml.namespace.QName("", "needSession"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permittedActions");
        elemField.setXmlName(new javax.xml.namespace.QName("", "permittedActions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("portNum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "portNum"));
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
        elemField.setFieldName("ptActionData1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ptActionData1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ptActionData2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ptActionData2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ptActionData3");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ptActionData3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ptActionData4");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ptActionData4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ptActionFlag1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ptActionFlag1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ptActionFlag2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ptActionFlag2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ptActionFlag3");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ptActionFlag3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ptActionFlag4");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ptActionFlag4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ptActionType1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ptActionType1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ptActionType2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ptActionType2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ptActionType3");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ptActionType3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ptActionType4");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ptActionType4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remoteTransTable");
        elemField.setXmlName(new javax.xml.namespace.QName("", "remoteTransTable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responderFileName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "responderFileName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responderPWD");
        elemField.setXmlName(new javax.xml.namespace.QName("", "responderPWD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responderUID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "responderUID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scanSubDir");
        elemField.setXmlName(new javax.xml.namespace.QName("", "scanSubDir"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("securityAttribute");
        elemField.setXmlName(new javax.xml.namespace.QName("", "securityAttribute"));
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
        elemField.setFieldName("tableName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tableName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toEmailAddrF");
        elemField.setXmlName(new javax.xml.namespace.QName("", "toEmailAddrF"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toEmailAddrS");
        elemField.setXmlName(new javax.xml.namespace.QName("", "toEmailAddrS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trScheduleDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "trScheduleDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:AdministratorService", "DateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("traceLvl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "traceLvl"));
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
        elemField.setFieldName("tryMaxCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tryMaxCount"));
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
        elemField.setFieldName("userData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("waitFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "waitFlag"));
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
