/**
 * AuditBase.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 11, 2014 (12:11:36 EDT) WSDL2Java emitter.
 */

package AdminClient;

public class AuditBase  implements java.io.Serializable {
    private java.lang.String AS2MDNStatus;

    private java.lang.String CRLF;

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

    private java.lang.String RECFM;

    private java.lang.String auditId;

    private java.lang.String chkptCount;

    private java.lang.String chkptInterval;

    private java.lang.String chkptRestartFlag;

    private java.lang.String clientCompressFlag;

    private java.lang.String clientFileName;

    private java.lang.String clientIPAddr;

    private java.lang.String dataType;

    private AdminClient.DateTime dateCreated;

    private java.lang.String department;

    private java.lang.String description;

    private java.lang.String encryptFlag;

    private java.lang.String fileOption;

    private java.lang.String localTransactionId;

    private java.lang.String localTranslationTable;

    private java.lang.String[] manangedDepts;

    private java.lang.String nodeName;

    private java.lang.String nodeNameCF;

    private java.lang.String numberOfDays;

    private java.lang.String postActionData1;

    private java.lang.String postActionData2;

    private java.lang.String postActionData3;

    private java.lang.String postActionData4;

    private java.lang.String postActionFlag1;

    private java.lang.String postActionFlag2;

    private java.lang.String postActionFlag3;

    private java.lang.String postActionFlag4;

    private java.lang.String postActionReturn1;

    private java.lang.String postActionReturn2;

    private java.lang.String postActionReturn3;

    private java.lang.String postActionReturn4;

    private java.lang.String postActionType1;

    private java.lang.String postActionType2;

    private java.lang.String postActionType3;

    private java.lang.String postActionType4;

    private java.lang.String processName;

    private java.lang.String proxyStatusMsg;

    private java.lang.String proxyTrFlag;

    private java.lang.String remoteTranslationTable;

    private java.lang.String remoteUserIdJPA;

    private java.lang.String requestID;

    private java.lang.String sendRecvFlag;

    private java.lang.String serverFileName;

    private java.lang.String toEmailAddrFailure;

    private java.lang.String toEmailAddrSuccess;

    private java.lang.String transferByteCount;

    private java.lang.String transferCompressedByteCount;

    private AdminClient.DateTime transferEndTime;

    private java.lang.String transferProtocol;

    private AdminClient.DateTime transferStartTime;

    private java.lang.String transferStatus;

    private java.lang.String transferStatusMsgId;

    private java.lang.String transferUserId;

    private java.lang.String transferWork;

    private java.lang.String userData;

    private java.lang.String writeMode;

    public AuditBase() {
    }

    public AuditBase(
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
           java.lang.String writeMode) {
           this.AS2MDNStatus = AS2MDNStatus;
           this.CRLF = CRLF;
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
           this.RECFM = RECFM;
           this.auditId = auditId;
           this.chkptCount = chkptCount;
           this.chkptInterval = chkptInterval;
           this.chkptRestartFlag = chkptRestartFlag;
           this.clientCompressFlag = clientCompressFlag;
           this.clientFileName = clientFileName;
           this.clientIPAddr = clientIPAddr;
           this.dataType = dataType;
           this.dateCreated = dateCreated;
           this.department = department;
           this.description = description;
           this.encryptFlag = encryptFlag;
           this.fileOption = fileOption;
           this.localTransactionId = localTransactionId;
           this.localTranslationTable = localTranslationTable;
           this.manangedDepts = manangedDepts;
           this.nodeName = nodeName;
           this.nodeNameCF = nodeNameCF;
           this.numberOfDays = numberOfDays;
           this.postActionData1 = postActionData1;
           this.postActionData2 = postActionData2;
           this.postActionData3 = postActionData3;
           this.postActionData4 = postActionData4;
           this.postActionFlag1 = postActionFlag1;
           this.postActionFlag2 = postActionFlag2;
           this.postActionFlag3 = postActionFlag3;
           this.postActionFlag4 = postActionFlag4;
           this.postActionReturn1 = postActionReturn1;
           this.postActionReturn2 = postActionReturn2;
           this.postActionReturn3 = postActionReturn3;
           this.postActionReturn4 = postActionReturn4;
           this.postActionType1 = postActionType1;
           this.postActionType2 = postActionType2;
           this.postActionType3 = postActionType3;
           this.postActionType4 = postActionType4;
           this.processName = processName;
           this.proxyStatusMsg = proxyStatusMsg;
           this.proxyTrFlag = proxyTrFlag;
           this.remoteTranslationTable = remoteTranslationTable;
           this.remoteUserIdJPA = remoteUserIdJPA;
           this.requestID = requestID;
           this.sendRecvFlag = sendRecvFlag;
           this.serverFileName = serverFileName;
           this.toEmailAddrFailure = toEmailAddrFailure;
           this.toEmailAddrSuccess = toEmailAddrSuccess;
           this.transferByteCount = transferByteCount;
           this.transferCompressedByteCount = transferCompressedByteCount;
           this.transferEndTime = transferEndTime;
           this.transferProtocol = transferProtocol;
           this.transferStartTime = transferStartTime;
           this.transferStatus = transferStatus;
           this.transferStatusMsgId = transferStatusMsgId;
           this.transferUserId = transferUserId;
           this.transferWork = transferWork;
           this.userData = userData;
           this.writeMode = writeMode;
    }


    /**
     * Gets the AS2MDNStatus value for this AuditBase.
     * 
     * @return AS2MDNStatus
     */
    public java.lang.String getAS2MDNStatus() {
        return AS2MDNStatus;
    }


    /**
     * Sets the AS2MDNStatus value for this AuditBase.
     * 
     * @param AS2MDNStatus
     */
    public void setAS2MDNStatus(java.lang.String AS2MDNStatus) {
        this.AS2MDNStatus = AS2MDNStatus;
    }


    /**
     * Gets the CRLF value for this AuditBase.
     * 
     * @return CRLF
     */
    public java.lang.String getCRLF() {
        return CRLF;
    }


    /**
     * Sets the CRLF value for this AuditBase.
     * 
     * @param CRLF
     */
    public void setCRLF(java.lang.String CRLF) {
        this.CRLF = CRLF;
    }


    /**
     * Gets the LRECL value for this AuditBase.
     * 
     * @return LRECL
     */
    public java.lang.String getLRECL() {
        return LRECL;
    }


    /**
     * Sets the LRECL value for this AuditBase.
     * 
     * @param LRECL
     */
    public void setLRECL(java.lang.String LRECL) {
        this.LRECL = LRECL;
    }


    /**
     * Gets the OS390AllocPri value for this AuditBase.
     * 
     * @return OS390AllocPri
     */
    public java.lang.String getOS390AllocPri() {
        return OS390AllocPri;
    }


    /**
     * Sets the OS390AllocPri value for this AuditBase.
     * 
     * @param OS390AllocPri
     */
    public void setOS390AllocPri(java.lang.String OS390AllocPri) {
        this.OS390AllocPri = OS390AllocPri;
    }


    /**
     * Gets the OS390AllocSec value for this AuditBase.
     * 
     * @return OS390AllocSec
     */
    public java.lang.String getOS390AllocSec() {
        return OS390AllocSec;
    }


    /**
     * Sets the OS390AllocSec value for this AuditBase.
     * 
     * @param OS390AllocSec
     */
    public void setOS390AllocSec(java.lang.String OS390AllocSec) {
        this.OS390AllocSec = OS390AllocSec;
    }


    /**
     * Gets the OS390AllocType value for this AuditBase.
     * 
     * @return OS390AllocType
     */
    public java.lang.String getOS390AllocType() {
        return OS390AllocType;
    }


    /**
     * Sets the OS390AllocType value for this AuditBase.
     * 
     * @param OS390AllocType
     */
    public void setOS390AllocType(java.lang.String OS390AllocType) {
        this.OS390AllocType = OS390AllocType;
    }


    /**
     * Gets the OS390BlockSize value for this AuditBase.
     * 
     * @return OS390BlockSize
     */
    public java.lang.String getOS390BlockSize() {
        return OS390BlockSize;
    }


    /**
     * Sets the OS390BlockSize value for this AuditBase.
     * 
     * @param OS390BlockSize
     */
    public void setOS390BlockSize(java.lang.String OS390BlockSize) {
        this.OS390BlockSize = OS390BlockSize;
    }


    /**
     * Gets the OS390DataClass value for this AuditBase.
     * 
     * @return OS390DataClass
     */
    public java.lang.String getOS390DataClass() {
        return OS390DataClass;
    }


    /**
     * Sets the OS390DataClass value for this AuditBase.
     * 
     * @param OS390DataClass
     */
    public void setOS390DataClass(java.lang.String OS390DataClass) {
        this.OS390DataClass = OS390DataClass;
    }


    /**
     * Gets the OS390MgtClass value for this AuditBase.
     * 
     * @return OS390MgtClass
     */
    public java.lang.String getOS390MgtClass() {
        return OS390MgtClass;
    }


    /**
     * Sets the OS390MgtClass value for this AuditBase.
     * 
     * @param OS390MgtClass
     */
    public void setOS390MgtClass(java.lang.String OS390MgtClass) {
        this.OS390MgtClass = OS390MgtClass;
    }


    /**
     * Gets the OS390StorClass value for this AuditBase.
     * 
     * @return OS390StorClass
     */
    public java.lang.String getOS390StorClass() {
        return OS390StorClass;
    }


    /**
     * Sets the OS390StorClass value for this AuditBase.
     * 
     * @param OS390StorClass
     */
    public void setOS390StorClass(java.lang.String OS390StorClass) {
        this.OS390StorClass = OS390StorClass;
    }


    /**
     * Gets the OS390Unit value for this AuditBase.
     * 
     * @return OS390Unit
     */
    public java.lang.String getOS390Unit() {
        return OS390Unit;
    }


    /**
     * Sets the OS390Unit value for this AuditBase.
     * 
     * @param OS390Unit
     */
    public void setOS390Unit(java.lang.String OS390Unit) {
        this.OS390Unit = OS390Unit;
    }


    /**
     * Gets the OS390Volume value for this AuditBase.
     * 
     * @return OS390Volume
     */
    public java.lang.String getOS390Volume() {
        return OS390Volume;
    }


    /**
     * Sets the OS390Volume value for this AuditBase.
     * 
     * @param OS390Volume
     */
    public void setOS390Volume(java.lang.String OS390Volume) {
        this.OS390Volume = OS390Volume;
    }


    /**
     * Gets the RECFM value for this AuditBase.
     * 
     * @return RECFM
     */
    public java.lang.String getRECFM() {
        return RECFM;
    }


    /**
     * Sets the RECFM value for this AuditBase.
     * 
     * @param RECFM
     */
    public void setRECFM(java.lang.String RECFM) {
        this.RECFM = RECFM;
    }


    /**
     * Gets the auditId value for this AuditBase.
     * 
     * @return auditId
     */
    public java.lang.String getAuditId() {
        return auditId;
    }


    /**
     * Sets the auditId value for this AuditBase.
     * 
     * @param auditId
     */
    public void setAuditId(java.lang.String auditId) {
        this.auditId = auditId;
    }


    /**
     * Gets the chkptCount value for this AuditBase.
     * 
     * @return chkptCount
     */
    public java.lang.String getChkptCount() {
        return chkptCount;
    }


    /**
     * Sets the chkptCount value for this AuditBase.
     * 
     * @param chkptCount
     */
    public void setChkptCount(java.lang.String chkptCount) {
        this.chkptCount = chkptCount;
    }


    /**
     * Gets the chkptInterval value for this AuditBase.
     * 
     * @return chkptInterval
     */
    public java.lang.String getChkptInterval() {
        return chkptInterval;
    }


    /**
     * Sets the chkptInterval value for this AuditBase.
     * 
     * @param chkptInterval
     */
    public void setChkptInterval(java.lang.String chkptInterval) {
        this.chkptInterval = chkptInterval;
    }


    /**
     * Gets the chkptRestartFlag value for this AuditBase.
     * 
     * @return chkptRestartFlag
     */
    public java.lang.String getChkptRestartFlag() {
        return chkptRestartFlag;
    }


    /**
     * Sets the chkptRestartFlag value for this AuditBase.
     * 
     * @param chkptRestartFlag
     */
    public void setChkptRestartFlag(java.lang.String chkptRestartFlag) {
        this.chkptRestartFlag = chkptRestartFlag;
    }


    /**
     * Gets the clientCompressFlag value for this AuditBase.
     * 
     * @return clientCompressFlag
     */
    public java.lang.String getClientCompressFlag() {
        return clientCompressFlag;
    }


    /**
     * Sets the clientCompressFlag value for this AuditBase.
     * 
     * @param clientCompressFlag
     */
    public void setClientCompressFlag(java.lang.String clientCompressFlag) {
        this.clientCompressFlag = clientCompressFlag;
    }


    /**
     * Gets the clientFileName value for this AuditBase.
     * 
     * @return clientFileName
     */
    public java.lang.String getClientFileName() {
        return clientFileName;
    }


    /**
     * Sets the clientFileName value for this AuditBase.
     * 
     * @param clientFileName
     */
    public void setClientFileName(java.lang.String clientFileName) {
        this.clientFileName = clientFileName;
    }


    /**
     * Gets the clientIPAddr value for this AuditBase.
     * 
     * @return clientIPAddr
     */
    public java.lang.String getClientIPAddr() {
        return clientIPAddr;
    }


    /**
     * Sets the clientIPAddr value for this AuditBase.
     * 
     * @param clientIPAddr
     */
    public void setClientIPAddr(java.lang.String clientIPAddr) {
        this.clientIPAddr = clientIPAddr;
    }


    /**
     * Gets the dataType value for this AuditBase.
     * 
     * @return dataType
     */
    public java.lang.String getDataType() {
        return dataType;
    }


    /**
     * Sets the dataType value for this AuditBase.
     * 
     * @param dataType
     */
    public void setDataType(java.lang.String dataType) {
        this.dataType = dataType;
    }


    /**
     * Gets the dateCreated value for this AuditBase.
     * 
     * @return dateCreated
     */
    public AdminClient.DateTime getDateCreated() {
        return dateCreated;
    }


    /**
     * Sets the dateCreated value for this AuditBase.
     * 
     * @param dateCreated
     */
    public void setDateCreated(AdminClient.DateTime dateCreated) {
        this.dateCreated = dateCreated;
    }


    /**
     * Gets the department value for this AuditBase.
     * 
     * @return department
     */
    public java.lang.String getDepartment() {
        return department;
    }


    /**
     * Sets the department value for this AuditBase.
     * 
     * @param department
     */
    public void setDepartment(java.lang.String department) {
        this.department = department;
    }


    /**
     * Gets the description value for this AuditBase.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this AuditBase.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the encryptFlag value for this AuditBase.
     * 
     * @return encryptFlag
     */
    public java.lang.String getEncryptFlag() {
        return encryptFlag;
    }


    /**
     * Sets the encryptFlag value for this AuditBase.
     * 
     * @param encryptFlag
     */
    public void setEncryptFlag(java.lang.String encryptFlag) {
        this.encryptFlag = encryptFlag;
    }


    /**
     * Gets the fileOption value for this AuditBase.
     * 
     * @return fileOption
     */
    public java.lang.String getFileOption() {
        return fileOption;
    }


    /**
     * Sets the fileOption value for this AuditBase.
     * 
     * @param fileOption
     */
    public void setFileOption(java.lang.String fileOption) {
        this.fileOption = fileOption;
    }


    /**
     * Gets the localTransactionId value for this AuditBase.
     * 
     * @return localTransactionId
     */
    public java.lang.String getLocalTransactionId() {
        return localTransactionId;
    }


    /**
     * Sets the localTransactionId value for this AuditBase.
     * 
     * @param localTransactionId
     */
    public void setLocalTransactionId(java.lang.String localTransactionId) {
        this.localTransactionId = localTransactionId;
    }


    /**
     * Gets the localTranslationTable value for this AuditBase.
     * 
     * @return localTranslationTable
     */
    public java.lang.String getLocalTranslationTable() {
        return localTranslationTable;
    }


    /**
     * Sets the localTranslationTable value for this AuditBase.
     * 
     * @param localTranslationTable
     */
    public void setLocalTranslationTable(java.lang.String localTranslationTable) {
        this.localTranslationTable = localTranslationTable;
    }


    /**
     * Gets the manangedDepts value for this AuditBase.
     * 
     * @return manangedDepts
     */
    public java.lang.String[] getManangedDepts() {
        return manangedDepts;
    }


    /**
     * Sets the manangedDepts value for this AuditBase.
     * 
     * @param manangedDepts
     */
    public void setManangedDepts(java.lang.String[] manangedDepts) {
        this.manangedDepts = manangedDepts;
    }


    /**
     * Gets the nodeName value for this AuditBase.
     * 
     * @return nodeName
     */
    public java.lang.String getNodeName() {
        return nodeName;
    }


    /**
     * Sets the nodeName value for this AuditBase.
     * 
     * @param nodeName
     */
    public void setNodeName(java.lang.String nodeName) {
        this.nodeName = nodeName;
    }


    /**
     * Gets the nodeNameCF value for this AuditBase.
     * 
     * @return nodeNameCF
     */
    public java.lang.String getNodeNameCF() {
        return nodeNameCF;
    }


    /**
     * Sets the nodeNameCF value for this AuditBase.
     * 
     * @param nodeNameCF
     */
    public void setNodeNameCF(java.lang.String nodeNameCF) {
        this.nodeNameCF = nodeNameCF;
    }


    /**
     * Gets the numberOfDays value for this AuditBase.
     * 
     * @return numberOfDays
     */
    public java.lang.String getNumberOfDays() {
        return numberOfDays;
    }


    /**
     * Sets the numberOfDays value for this AuditBase.
     * 
     * @param numberOfDays
     */
    public void setNumberOfDays(java.lang.String numberOfDays) {
        this.numberOfDays = numberOfDays;
    }


    /**
     * Gets the postActionData1 value for this AuditBase.
     * 
     * @return postActionData1
     */
    public java.lang.String getPostActionData1() {
        return postActionData1;
    }


    /**
     * Sets the postActionData1 value for this AuditBase.
     * 
     * @param postActionData1
     */
    public void setPostActionData1(java.lang.String postActionData1) {
        this.postActionData1 = postActionData1;
    }


    /**
     * Gets the postActionData2 value for this AuditBase.
     * 
     * @return postActionData2
     */
    public java.lang.String getPostActionData2() {
        return postActionData2;
    }


    /**
     * Sets the postActionData2 value for this AuditBase.
     * 
     * @param postActionData2
     */
    public void setPostActionData2(java.lang.String postActionData2) {
        this.postActionData2 = postActionData2;
    }


    /**
     * Gets the postActionData3 value for this AuditBase.
     * 
     * @return postActionData3
     */
    public java.lang.String getPostActionData3() {
        return postActionData3;
    }


    /**
     * Sets the postActionData3 value for this AuditBase.
     * 
     * @param postActionData3
     */
    public void setPostActionData3(java.lang.String postActionData3) {
        this.postActionData3 = postActionData3;
    }


    /**
     * Gets the postActionData4 value for this AuditBase.
     * 
     * @return postActionData4
     */
    public java.lang.String getPostActionData4() {
        return postActionData4;
    }


    /**
     * Sets the postActionData4 value for this AuditBase.
     * 
     * @param postActionData4
     */
    public void setPostActionData4(java.lang.String postActionData4) {
        this.postActionData4 = postActionData4;
    }


    /**
     * Gets the postActionFlag1 value for this AuditBase.
     * 
     * @return postActionFlag1
     */
    public java.lang.String getPostActionFlag1() {
        return postActionFlag1;
    }


    /**
     * Sets the postActionFlag1 value for this AuditBase.
     * 
     * @param postActionFlag1
     */
    public void setPostActionFlag1(java.lang.String postActionFlag1) {
        this.postActionFlag1 = postActionFlag1;
    }


    /**
     * Gets the postActionFlag2 value for this AuditBase.
     * 
     * @return postActionFlag2
     */
    public java.lang.String getPostActionFlag2() {
        return postActionFlag2;
    }


    /**
     * Sets the postActionFlag2 value for this AuditBase.
     * 
     * @param postActionFlag2
     */
    public void setPostActionFlag2(java.lang.String postActionFlag2) {
        this.postActionFlag2 = postActionFlag2;
    }


    /**
     * Gets the postActionFlag3 value for this AuditBase.
     * 
     * @return postActionFlag3
     */
    public java.lang.String getPostActionFlag3() {
        return postActionFlag3;
    }


    /**
     * Sets the postActionFlag3 value for this AuditBase.
     * 
     * @param postActionFlag3
     */
    public void setPostActionFlag3(java.lang.String postActionFlag3) {
        this.postActionFlag3 = postActionFlag3;
    }


    /**
     * Gets the postActionFlag4 value for this AuditBase.
     * 
     * @return postActionFlag4
     */
    public java.lang.String getPostActionFlag4() {
        return postActionFlag4;
    }


    /**
     * Sets the postActionFlag4 value for this AuditBase.
     * 
     * @param postActionFlag4
     */
    public void setPostActionFlag4(java.lang.String postActionFlag4) {
        this.postActionFlag4 = postActionFlag4;
    }


    /**
     * Gets the postActionReturn1 value for this AuditBase.
     * 
     * @return postActionReturn1
     */
    public java.lang.String getPostActionReturn1() {
        return postActionReturn1;
    }


    /**
     * Sets the postActionReturn1 value for this AuditBase.
     * 
     * @param postActionReturn1
     */
    public void setPostActionReturn1(java.lang.String postActionReturn1) {
        this.postActionReturn1 = postActionReturn1;
    }


    /**
     * Gets the postActionReturn2 value for this AuditBase.
     * 
     * @return postActionReturn2
     */
    public java.lang.String getPostActionReturn2() {
        return postActionReturn2;
    }


    /**
     * Sets the postActionReturn2 value for this AuditBase.
     * 
     * @param postActionReturn2
     */
    public void setPostActionReturn2(java.lang.String postActionReturn2) {
        this.postActionReturn2 = postActionReturn2;
    }


    /**
     * Gets the postActionReturn3 value for this AuditBase.
     * 
     * @return postActionReturn3
     */
    public java.lang.String getPostActionReturn3() {
        return postActionReturn3;
    }


    /**
     * Sets the postActionReturn3 value for this AuditBase.
     * 
     * @param postActionReturn3
     */
    public void setPostActionReturn3(java.lang.String postActionReturn3) {
        this.postActionReturn3 = postActionReturn3;
    }


    /**
     * Gets the postActionReturn4 value for this AuditBase.
     * 
     * @return postActionReturn4
     */
    public java.lang.String getPostActionReturn4() {
        return postActionReturn4;
    }


    /**
     * Sets the postActionReturn4 value for this AuditBase.
     * 
     * @param postActionReturn4
     */
    public void setPostActionReturn4(java.lang.String postActionReturn4) {
        this.postActionReturn4 = postActionReturn4;
    }


    /**
     * Gets the postActionType1 value for this AuditBase.
     * 
     * @return postActionType1
     */
    public java.lang.String getPostActionType1() {
        return postActionType1;
    }


    /**
     * Sets the postActionType1 value for this AuditBase.
     * 
     * @param postActionType1
     */
    public void setPostActionType1(java.lang.String postActionType1) {
        this.postActionType1 = postActionType1;
    }


    /**
     * Gets the postActionType2 value for this AuditBase.
     * 
     * @return postActionType2
     */
    public java.lang.String getPostActionType2() {
        return postActionType2;
    }


    /**
     * Sets the postActionType2 value for this AuditBase.
     * 
     * @param postActionType2
     */
    public void setPostActionType2(java.lang.String postActionType2) {
        this.postActionType2 = postActionType2;
    }


    /**
     * Gets the postActionType3 value for this AuditBase.
     * 
     * @return postActionType3
     */
    public java.lang.String getPostActionType3() {
        return postActionType3;
    }


    /**
     * Sets the postActionType3 value for this AuditBase.
     * 
     * @param postActionType3
     */
    public void setPostActionType3(java.lang.String postActionType3) {
        this.postActionType3 = postActionType3;
    }


    /**
     * Gets the postActionType4 value for this AuditBase.
     * 
     * @return postActionType4
     */
    public java.lang.String getPostActionType4() {
        return postActionType4;
    }


    /**
     * Sets the postActionType4 value for this AuditBase.
     * 
     * @param postActionType4
     */
    public void setPostActionType4(java.lang.String postActionType4) {
        this.postActionType4 = postActionType4;
    }


    /**
     * Gets the processName value for this AuditBase.
     * 
     * @return processName
     */
    public java.lang.String getProcessName() {
        return processName;
    }


    /**
     * Sets the processName value for this AuditBase.
     * 
     * @param processName
     */
    public void setProcessName(java.lang.String processName) {
        this.processName = processName;
    }


    /**
     * Gets the proxyStatusMsg value for this AuditBase.
     * 
     * @return proxyStatusMsg
     */
    public java.lang.String getProxyStatusMsg() {
        return proxyStatusMsg;
    }


    /**
     * Sets the proxyStatusMsg value for this AuditBase.
     * 
     * @param proxyStatusMsg
     */
    public void setProxyStatusMsg(java.lang.String proxyStatusMsg) {
        this.proxyStatusMsg = proxyStatusMsg;
    }


    /**
     * Gets the proxyTrFlag value for this AuditBase.
     * 
     * @return proxyTrFlag
     */
    public java.lang.String getProxyTrFlag() {
        return proxyTrFlag;
    }


    /**
     * Sets the proxyTrFlag value for this AuditBase.
     * 
     * @param proxyTrFlag
     */
    public void setProxyTrFlag(java.lang.String proxyTrFlag) {
        this.proxyTrFlag = proxyTrFlag;
    }


    /**
     * Gets the remoteTranslationTable value for this AuditBase.
     * 
     * @return remoteTranslationTable
     */
    public java.lang.String getRemoteTranslationTable() {
        return remoteTranslationTable;
    }


    /**
     * Sets the remoteTranslationTable value for this AuditBase.
     * 
     * @param remoteTranslationTable
     */
    public void setRemoteTranslationTable(java.lang.String remoteTranslationTable) {
        this.remoteTranslationTable = remoteTranslationTable;
    }


    /**
     * Gets the remoteUserIdJPA value for this AuditBase.
     * 
     * @return remoteUserIdJPA
     */
    public java.lang.String getRemoteUserIdJPA() {
        return remoteUserIdJPA;
    }


    /**
     * Sets the remoteUserIdJPA value for this AuditBase.
     * 
     * @param remoteUserIdJPA
     */
    public void setRemoteUserIdJPA(java.lang.String remoteUserIdJPA) {
        this.remoteUserIdJPA = remoteUserIdJPA;
    }


    /**
     * Gets the requestID value for this AuditBase.
     * 
     * @return requestID
     */
    public java.lang.String getRequestID() {
        return requestID;
    }


    /**
     * Sets the requestID value for this AuditBase.
     * 
     * @param requestID
     */
    public void setRequestID(java.lang.String requestID) {
        this.requestID = requestID;
    }


    /**
     * Gets the sendRecvFlag value for this AuditBase.
     * 
     * @return sendRecvFlag
     */
    public java.lang.String getSendRecvFlag() {
        return sendRecvFlag;
    }


    /**
     * Sets the sendRecvFlag value for this AuditBase.
     * 
     * @param sendRecvFlag
     */
    public void setSendRecvFlag(java.lang.String sendRecvFlag) {
        this.sendRecvFlag = sendRecvFlag;
    }


    /**
     * Gets the serverFileName value for this AuditBase.
     * 
     * @return serverFileName
     */
    public java.lang.String getServerFileName() {
        return serverFileName;
    }


    /**
     * Sets the serverFileName value for this AuditBase.
     * 
     * @param serverFileName
     */
    public void setServerFileName(java.lang.String serverFileName) {
        this.serverFileName = serverFileName;
    }


    /**
     * Gets the toEmailAddrFailure value for this AuditBase.
     * 
     * @return toEmailAddrFailure
     */
    public java.lang.String getToEmailAddrFailure() {
        return toEmailAddrFailure;
    }


    /**
     * Sets the toEmailAddrFailure value for this AuditBase.
     * 
     * @param toEmailAddrFailure
     */
    public void setToEmailAddrFailure(java.lang.String toEmailAddrFailure) {
        this.toEmailAddrFailure = toEmailAddrFailure;
    }


    /**
     * Gets the toEmailAddrSuccess value for this AuditBase.
     * 
     * @return toEmailAddrSuccess
     */
    public java.lang.String getToEmailAddrSuccess() {
        return toEmailAddrSuccess;
    }


    /**
     * Sets the toEmailAddrSuccess value for this AuditBase.
     * 
     * @param toEmailAddrSuccess
     */
    public void setToEmailAddrSuccess(java.lang.String toEmailAddrSuccess) {
        this.toEmailAddrSuccess = toEmailAddrSuccess;
    }


    /**
     * Gets the transferByteCount value for this AuditBase.
     * 
     * @return transferByteCount
     */
    public java.lang.String getTransferByteCount() {
        return transferByteCount;
    }


    /**
     * Sets the transferByteCount value for this AuditBase.
     * 
     * @param transferByteCount
     */
    public void setTransferByteCount(java.lang.String transferByteCount) {
        this.transferByteCount = transferByteCount;
    }


    /**
     * Gets the transferCompressedByteCount value for this AuditBase.
     * 
     * @return transferCompressedByteCount
     */
    public java.lang.String getTransferCompressedByteCount() {
        return transferCompressedByteCount;
    }


    /**
     * Sets the transferCompressedByteCount value for this AuditBase.
     * 
     * @param transferCompressedByteCount
     */
    public void setTransferCompressedByteCount(java.lang.String transferCompressedByteCount) {
        this.transferCompressedByteCount = transferCompressedByteCount;
    }


    /**
     * Gets the transferEndTime value for this AuditBase.
     * 
     * @return transferEndTime
     */
    public AdminClient.DateTime getTransferEndTime() {
        return transferEndTime;
    }


    /**
     * Sets the transferEndTime value for this AuditBase.
     * 
     * @param transferEndTime
     */
    public void setTransferEndTime(AdminClient.DateTime transferEndTime) {
        this.transferEndTime = transferEndTime;
    }


    /**
     * Gets the transferProtocol value for this AuditBase.
     * 
     * @return transferProtocol
     */
    public java.lang.String getTransferProtocol() {
        return transferProtocol;
    }


    /**
     * Sets the transferProtocol value for this AuditBase.
     * 
     * @param transferProtocol
     */
    public void setTransferProtocol(java.lang.String transferProtocol) {
        this.transferProtocol = transferProtocol;
    }


    /**
     * Gets the transferStartTime value for this AuditBase.
     * 
     * @return transferStartTime
     */
    public AdminClient.DateTime getTransferStartTime() {
        return transferStartTime;
    }


    /**
     * Sets the transferStartTime value for this AuditBase.
     * 
     * @param transferStartTime
     */
    public void setTransferStartTime(AdminClient.DateTime transferStartTime) {
        this.transferStartTime = transferStartTime;
    }


    /**
     * Gets the transferStatus value for this AuditBase.
     * 
     * @return transferStatus
     */
    public java.lang.String getTransferStatus() {
        return transferStatus;
    }


    /**
     * Sets the transferStatus value for this AuditBase.
     * 
     * @param transferStatus
     */
    public void setTransferStatus(java.lang.String transferStatus) {
        this.transferStatus = transferStatus;
    }


    /**
     * Gets the transferStatusMsgId value for this AuditBase.
     * 
     * @return transferStatusMsgId
     */
    public java.lang.String getTransferStatusMsgId() {
        return transferStatusMsgId;
    }


    /**
     * Sets the transferStatusMsgId value for this AuditBase.
     * 
     * @param transferStatusMsgId
     */
    public void setTransferStatusMsgId(java.lang.String transferStatusMsgId) {
        this.transferStatusMsgId = transferStatusMsgId;
    }


    /**
     * Gets the transferUserId value for this AuditBase.
     * 
     * @return transferUserId
     */
    public java.lang.String getTransferUserId() {
        return transferUserId;
    }


    /**
     * Sets the transferUserId value for this AuditBase.
     * 
     * @param transferUserId
     */
    public void setTransferUserId(java.lang.String transferUserId) {
        this.transferUserId = transferUserId;
    }


    /**
     * Gets the transferWork value for this AuditBase.
     * 
     * @return transferWork
     */
    public java.lang.String getTransferWork() {
        return transferWork;
    }


    /**
     * Sets the transferWork value for this AuditBase.
     * 
     * @param transferWork
     */
    public void setTransferWork(java.lang.String transferWork) {
        this.transferWork = transferWork;
    }


    /**
     * Gets the userData value for this AuditBase.
     * 
     * @return userData
     */
    public java.lang.String getUserData() {
        return userData;
    }


    /**
     * Sets the userData value for this AuditBase.
     * 
     * @param userData
     */
    public void setUserData(java.lang.String userData) {
        this.userData = userData;
    }


    /**
     * Gets the writeMode value for this AuditBase.
     * 
     * @return writeMode
     */
    public java.lang.String getWriteMode() {
        return writeMode;
    }


    /**
     * Sets the writeMode value for this AuditBase.
     * 
     * @param writeMode
     */
    public void setWriteMode(java.lang.String writeMode) {
        this.writeMode = writeMode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AuditBase)) return false;
        AuditBase other = (AuditBase) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.AS2MDNStatus==null && other.getAS2MDNStatus()==null) || 
             (this.AS2MDNStatus!=null &&
              this.AS2MDNStatus.equals(other.getAS2MDNStatus()))) &&
            ((this.CRLF==null && other.getCRLF()==null) || 
             (this.CRLF!=null &&
              this.CRLF.equals(other.getCRLF()))) &&
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
            ((this.RECFM==null && other.getRECFM()==null) || 
             (this.RECFM!=null &&
              this.RECFM.equals(other.getRECFM()))) &&
            ((this.auditId==null && other.getAuditId()==null) || 
             (this.auditId!=null &&
              this.auditId.equals(other.getAuditId()))) &&
            ((this.chkptCount==null && other.getChkptCount()==null) || 
             (this.chkptCount!=null &&
              this.chkptCount.equals(other.getChkptCount()))) &&
            ((this.chkptInterval==null && other.getChkptInterval()==null) || 
             (this.chkptInterval!=null &&
              this.chkptInterval.equals(other.getChkptInterval()))) &&
            ((this.chkptRestartFlag==null && other.getChkptRestartFlag()==null) || 
             (this.chkptRestartFlag!=null &&
              this.chkptRestartFlag.equals(other.getChkptRestartFlag()))) &&
            ((this.clientCompressFlag==null && other.getClientCompressFlag()==null) || 
             (this.clientCompressFlag!=null &&
              this.clientCompressFlag.equals(other.getClientCompressFlag()))) &&
            ((this.clientFileName==null && other.getClientFileName()==null) || 
             (this.clientFileName!=null &&
              this.clientFileName.equals(other.getClientFileName()))) &&
            ((this.clientIPAddr==null && other.getClientIPAddr()==null) || 
             (this.clientIPAddr!=null &&
              this.clientIPAddr.equals(other.getClientIPAddr()))) &&
            ((this.dataType==null && other.getDataType()==null) || 
             (this.dataType!=null &&
              this.dataType.equals(other.getDataType()))) &&
            ((this.dateCreated==null && other.getDateCreated()==null) || 
             (this.dateCreated!=null &&
              this.dateCreated.equals(other.getDateCreated()))) &&
            ((this.department==null && other.getDepartment()==null) || 
             (this.department!=null &&
              this.department.equals(other.getDepartment()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.encryptFlag==null && other.getEncryptFlag()==null) || 
             (this.encryptFlag!=null &&
              this.encryptFlag.equals(other.getEncryptFlag()))) &&
            ((this.fileOption==null && other.getFileOption()==null) || 
             (this.fileOption!=null &&
              this.fileOption.equals(other.getFileOption()))) &&
            ((this.localTransactionId==null && other.getLocalTransactionId()==null) || 
             (this.localTransactionId!=null &&
              this.localTransactionId.equals(other.getLocalTransactionId()))) &&
            ((this.localTranslationTable==null && other.getLocalTranslationTable()==null) || 
             (this.localTranslationTable!=null &&
              this.localTranslationTable.equals(other.getLocalTranslationTable()))) &&
            ((this.manangedDepts==null && other.getManangedDepts()==null) || 
             (this.manangedDepts!=null &&
              java.util.Arrays.equals(this.manangedDepts, other.getManangedDepts()))) &&
            ((this.nodeName==null && other.getNodeName()==null) || 
             (this.nodeName!=null &&
              this.nodeName.equals(other.getNodeName()))) &&
            ((this.nodeNameCF==null && other.getNodeNameCF()==null) || 
             (this.nodeNameCF!=null &&
              this.nodeNameCF.equals(other.getNodeNameCF()))) &&
            ((this.numberOfDays==null && other.getNumberOfDays()==null) || 
             (this.numberOfDays!=null &&
              this.numberOfDays.equals(other.getNumberOfDays()))) &&
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
            ((this.postActionReturn1==null && other.getPostActionReturn1()==null) || 
             (this.postActionReturn1!=null &&
              this.postActionReturn1.equals(other.getPostActionReturn1()))) &&
            ((this.postActionReturn2==null && other.getPostActionReturn2()==null) || 
             (this.postActionReturn2!=null &&
              this.postActionReturn2.equals(other.getPostActionReturn2()))) &&
            ((this.postActionReturn3==null && other.getPostActionReturn3()==null) || 
             (this.postActionReturn3!=null &&
              this.postActionReturn3.equals(other.getPostActionReturn3()))) &&
            ((this.postActionReturn4==null && other.getPostActionReturn4()==null) || 
             (this.postActionReturn4!=null &&
              this.postActionReturn4.equals(other.getPostActionReturn4()))) &&
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
            ((this.proxyStatusMsg==null && other.getProxyStatusMsg()==null) || 
             (this.proxyStatusMsg!=null &&
              this.proxyStatusMsg.equals(other.getProxyStatusMsg()))) &&
            ((this.proxyTrFlag==null && other.getProxyTrFlag()==null) || 
             (this.proxyTrFlag!=null &&
              this.proxyTrFlag.equals(other.getProxyTrFlag()))) &&
            ((this.remoteTranslationTable==null && other.getRemoteTranslationTable()==null) || 
             (this.remoteTranslationTable!=null &&
              this.remoteTranslationTable.equals(other.getRemoteTranslationTable()))) &&
            ((this.remoteUserIdJPA==null && other.getRemoteUserIdJPA()==null) || 
             (this.remoteUserIdJPA!=null &&
              this.remoteUserIdJPA.equals(other.getRemoteUserIdJPA()))) &&
            ((this.requestID==null && other.getRequestID()==null) || 
             (this.requestID!=null &&
              this.requestID.equals(other.getRequestID()))) &&
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
            ((this.transferByteCount==null && other.getTransferByteCount()==null) || 
             (this.transferByteCount!=null &&
              this.transferByteCount.equals(other.getTransferByteCount()))) &&
            ((this.transferCompressedByteCount==null && other.getTransferCompressedByteCount()==null) || 
             (this.transferCompressedByteCount!=null &&
              this.transferCompressedByteCount.equals(other.getTransferCompressedByteCount()))) &&
            ((this.transferEndTime==null && other.getTransferEndTime()==null) || 
             (this.transferEndTime!=null &&
              this.transferEndTime.equals(other.getTransferEndTime()))) &&
            ((this.transferProtocol==null && other.getTransferProtocol()==null) || 
             (this.transferProtocol!=null &&
              this.transferProtocol.equals(other.getTransferProtocol()))) &&
            ((this.transferStartTime==null && other.getTransferStartTime()==null) || 
             (this.transferStartTime!=null &&
              this.transferStartTime.equals(other.getTransferStartTime()))) &&
            ((this.transferStatus==null && other.getTransferStatus()==null) || 
             (this.transferStatus!=null &&
              this.transferStatus.equals(other.getTransferStatus()))) &&
            ((this.transferStatusMsgId==null && other.getTransferStatusMsgId()==null) || 
             (this.transferStatusMsgId!=null &&
              this.transferStatusMsgId.equals(other.getTransferStatusMsgId()))) &&
            ((this.transferUserId==null && other.getTransferUserId()==null) || 
             (this.transferUserId!=null &&
              this.transferUserId.equals(other.getTransferUserId()))) &&
            ((this.transferWork==null && other.getTransferWork()==null) || 
             (this.transferWork!=null &&
              this.transferWork.equals(other.getTransferWork()))) &&
            ((this.userData==null && other.getUserData()==null) || 
             (this.userData!=null &&
              this.userData.equals(other.getUserData()))) &&
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
        if (getAS2MDNStatus() != null) {
            _hashCode += getAS2MDNStatus().hashCode();
        }
        if (getCRLF() != null) {
            _hashCode += getCRLF().hashCode();
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
        if (getRECFM() != null) {
            _hashCode += getRECFM().hashCode();
        }
        if (getAuditId() != null) {
            _hashCode += getAuditId().hashCode();
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
        if (getClientCompressFlag() != null) {
            _hashCode += getClientCompressFlag().hashCode();
        }
        if (getClientFileName() != null) {
            _hashCode += getClientFileName().hashCode();
        }
        if (getClientIPAddr() != null) {
            _hashCode += getClientIPAddr().hashCode();
        }
        if (getDataType() != null) {
            _hashCode += getDataType().hashCode();
        }
        if (getDateCreated() != null) {
            _hashCode += getDateCreated().hashCode();
        }
        if (getDepartment() != null) {
            _hashCode += getDepartment().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getEncryptFlag() != null) {
            _hashCode += getEncryptFlag().hashCode();
        }
        if (getFileOption() != null) {
            _hashCode += getFileOption().hashCode();
        }
        if (getLocalTransactionId() != null) {
            _hashCode += getLocalTransactionId().hashCode();
        }
        if (getLocalTranslationTable() != null) {
            _hashCode += getLocalTranslationTable().hashCode();
        }
        if (getManangedDepts() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getManangedDepts());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getManangedDepts(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNodeName() != null) {
            _hashCode += getNodeName().hashCode();
        }
        if (getNodeNameCF() != null) {
            _hashCode += getNodeNameCF().hashCode();
        }
        if (getNumberOfDays() != null) {
            _hashCode += getNumberOfDays().hashCode();
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
        if (getPostActionReturn1() != null) {
            _hashCode += getPostActionReturn1().hashCode();
        }
        if (getPostActionReturn2() != null) {
            _hashCode += getPostActionReturn2().hashCode();
        }
        if (getPostActionReturn3() != null) {
            _hashCode += getPostActionReturn3().hashCode();
        }
        if (getPostActionReturn4() != null) {
            _hashCode += getPostActionReturn4().hashCode();
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
        if (getProxyStatusMsg() != null) {
            _hashCode += getProxyStatusMsg().hashCode();
        }
        if (getProxyTrFlag() != null) {
            _hashCode += getProxyTrFlag().hashCode();
        }
        if (getRemoteTranslationTable() != null) {
            _hashCode += getRemoteTranslationTable().hashCode();
        }
        if (getRemoteUserIdJPA() != null) {
            _hashCode += getRemoteUserIdJPA().hashCode();
        }
        if (getRequestID() != null) {
            _hashCode += getRequestID().hashCode();
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
        if (getTransferByteCount() != null) {
            _hashCode += getTransferByteCount().hashCode();
        }
        if (getTransferCompressedByteCount() != null) {
            _hashCode += getTransferCompressedByteCount().hashCode();
        }
        if (getTransferEndTime() != null) {
            _hashCode += getTransferEndTime().hashCode();
        }
        if (getTransferProtocol() != null) {
            _hashCode += getTransferProtocol().hashCode();
        }
        if (getTransferStartTime() != null) {
            _hashCode += getTransferStartTime().hashCode();
        }
        if (getTransferStatus() != null) {
            _hashCode += getTransferStatus().hashCode();
        }
        if (getTransferStatusMsgId() != null) {
            _hashCode += getTransferStatusMsgId().hashCode();
        }
        if (getTransferUserId() != null) {
            _hashCode += getTransferUserId().hashCode();
        }
        if (getTransferWork() != null) {
            _hashCode += getTransferWork().hashCode();
        }
        if (getUserData() != null) {
            _hashCode += getUserData().hashCode();
        }
        if (getWriteMode() != null) {
            _hashCode += getWriteMode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AuditBase.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:AdministratorService", "AuditBase"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("AS2MDNStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AS2MDNStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CRLF");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CRLF"));
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
        elemField.setFieldName("RECFM");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RECFM"));
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
        elemField.setFieldName("clientIPAddr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "clientIPAddr"));
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
        elemField.setFieldName("encryptFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "encryptFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileOption");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fileOption"));
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
        elemField.setFieldName("manangedDepts");
        elemField.setXmlName(new javax.xml.namespace.QName("", "manangedDepts"));
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
        elemField.setFieldName("nodeNameCF");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nodeNameCF"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberOfDays");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numberOfDays"));
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
        elemField.setFieldName("postActionReturn1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "postActionReturn1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postActionReturn2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "postActionReturn2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postActionReturn3");
        elemField.setXmlName(new javax.xml.namespace.QName("", "postActionReturn3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postActionReturn4");
        elemField.setXmlName(new javax.xml.namespace.QName("", "postActionReturn4"));
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
        elemField.setFieldName("proxyStatusMsg");
        elemField.setXmlName(new javax.xml.namespace.QName("", "proxyStatusMsg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("proxyTrFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "proxyTrFlag"));
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
        elemField.setFieldName("remoteUserIdJPA");
        elemField.setXmlName(new javax.xml.namespace.QName("", "remoteUserIdJPA"));
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
        elemField.setFieldName("transferByteCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transferByteCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferCompressedByteCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transferCompressedByteCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferEndTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transferEndTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:AdministratorService", "DateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferProtocol");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transferProtocol"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferStartTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transferStartTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:AdministratorService", "DateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transferStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferStatusMsgId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transferStatusMsgId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferUserId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transferUserId"));
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
        elemField.setFieldName("userData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userData"));
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
