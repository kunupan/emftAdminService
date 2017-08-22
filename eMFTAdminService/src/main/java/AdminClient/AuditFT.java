/**
 * AuditFT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 11, 2014 (12:11:36 EDT) WSDL2Java emitter.
 */

package AdminClient;

public class AuditFT  extends AdminClient.AuditBase  implements java.io.Serializable {
    private java.lang.String OS390AllocDir;

    private java.lang.String SSL;

    private java.lang.String SSLPortNum;

    private java.lang.String crlMsg;

    private java.lang.String fileAttributes;

    private java.lang.String memberCount;

    private java.lang.String nodeClass;

    private java.lang.String priority;

    private java.lang.String recordCount;

    private java.lang.String remNTDomain;

    private java.lang.String remNodeType;

    private java.lang.String remPortNum;

    private java.lang.String remTransID;

    private java.lang.String remUserID;

    private java.lang.String scanSubDir;

    private java.lang.String tempError;

    private java.lang.String trCommand;

    private java.lang.String trCompType;

    private AdminClient.DateTime trExpireDate;

    private AdminClient.DateTime trScheduleDate;

    private java.lang.String trStDiagCode;

    private java.lang.String trStRtnCode;

    private java.lang.String trStSeverity;

    private java.lang.String tryCount;

    private java.lang.String tryMaxCount;

    private java.lang.String unixFilePerm;

    private java.lang.String versionNum;

    public AuditFT() {
    }

    public AuditFT(
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
           java.lang.String OS390AllocDir,
           java.lang.String SSL,
           java.lang.String SSLPortNum,
           java.lang.String crlMsg,
           java.lang.String fileAttributes,
           java.lang.String memberCount,
           java.lang.String nodeClass,
           java.lang.String priority,
           java.lang.String recordCount,
           java.lang.String remNTDomain,
           java.lang.String remNodeType,
           java.lang.String remPortNum,
           java.lang.String remTransID,
           java.lang.String remUserID,
           java.lang.String scanSubDir,
           java.lang.String tempError,
           java.lang.String trCommand,
           java.lang.String trCompType,
           AdminClient.DateTime trExpireDate,
           AdminClient.DateTime trScheduleDate,
           java.lang.String trStDiagCode,
           java.lang.String trStRtnCode,
           java.lang.String trStSeverity,
           java.lang.String tryCount,
           java.lang.String tryMaxCount,
           java.lang.String unixFilePerm,
           java.lang.String versionNum) {
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
        this.OS390AllocDir = OS390AllocDir;
        this.SSL = SSL;
        this.SSLPortNum = SSLPortNum;
        this.crlMsg = crlMsg;
        this.fileAttributes = fileAttributes;
        this.memberCount = memberCount;
        this.nodeClass = nodeClass;
        this.priority = priority;
        this.recordCount = recordCount;
        this.remNTDomain = remNTDomain;
        this.remNodeType = remNodeType;
        this.remPortNum = remPortNum;
        this.remTransID = remTransID;
        this.remUserID = remUserID;
        this.scanSubDir = scanSubDir;
        this.tempError = tempError;
        this.trCommand = trCommand;
        this.trCompType = trCompType;
        this.trExpireDate = trExpireDate;
        this.trScheduleDate = trScheduleDate;
        this.trStDiagCode = trStDiagCode;
        this.trStRtnCode = trStRtnCode;
        this.trStSeverity = trStSeverity;
        this.tryCount = tryCount;
        this.tryMaxCount = tryMaxCount;
        this.unixFilePerm = unixFilePerm;
        this.versionNum = versionNum;
    }


    /**
     * Gets the OS390AllocDir value for this AuditFT.
     * 
     * @return OS390AllocDir
     */
    public java.lang.String getOS390AllocDir() {
        return OS390AllocDir;
    }


    /**
     * Sets the OS390AllocDir value for this AuditFT.
     * 
     * @param OS390AllocDir
     */
    public void setOS390AllocDir(java.lang.String OS390AllocDir) {
        this.OS390AllocDir = OS390AllocDir;
    }


    /**
     * Gets the SSL value for this AuditFT.
     * 
     * @return SSL
     */
    public java.lang.String getSSL() {
        return SSL;
    }


    /**
     * Sets the SSL value for this AuditFT.
     * 
     * @param SSL
     */
    public void setSSL(java.lang.String SSL) {
        this.SSL = SSL;
    }


    /**
     * Gets the SSLPortNum value for this AuditFT.
     * 
     * @return SSLPortNum
     */
    public java.lang.String getSSLPortNum() {
        return SSLPortNum;
    }


    /**
     * Sets the SSLPortNum value for this AuditFT.
     * 
     * @param SSLPortNum
     */
    public void setSSLPortNum(java.lang.String SSLPortNum) {
        this.SSLPortNum = SSLPortNum;
    }


    /**
     * Gets the crlMsg value for this AuditFT.
     * 
     * @return crlMsg
     */
    public java.lang.String getCrlMsg() {
        return crlMsg;
    }


    /**
     * Sets the crlMsg value for this AuditFT.
     * 
     * @param crlMsg
     */
    public void setCrlMsg(java.lang.String crlMsg) {
        this.crlMsg = crlMsg;
    }


    /**
     * Gets the fileAttributes value for this AuditFT.
     * 
     * @return fileAttributes
     */
    public java.lang.String getFileAttributes() {
        return fileAttributes;
    }


    /**
     * Sets the fileAttributes value for this AuditFT.
     * 
     * @param fileAttributes
     */
    public void setFileAttributes(java.lang.String fileAttributes) {
        this.fileAttributes = fileAttributes;
    }


    /**
     * Gets the memberCount value for this AuditFT.
     * 
     * @return memberCount
     */
    public java.lang.String getMemberCount() {
        return memberCount;
    }


    /**
     * Sets the memberCount value for this AuditFT.
     * 
     * @param memberCount
     */
    public void setMemberCount(java.lang.String memberCount) {
        this.memberCount = memberCount;
    }


    /**
     * Gets the nodeClass value for this AuditFT.
     * 
     * @return nodeClass
     */
    public java.lang.String getNodeClass() {
        return nodeClass;
    }


    /**
     * Sets the nodeClass value for this AuditFT.
     * 
     * @param nodeClass
     */
    public void setNodeClass(java.lang.String nodeClass) {
        this.nodeClass = nodeClass;
    }


    /**
     * Gets the priority value for this AuditFT.
     * 
     * @return priority
     */
    public java.lang.String getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this AuditFT.
     * 
     * @param priority
     */
    public void setPriority(java.lang.String priority) {
        this.priority = priority;
    }


    /**
     * Gets the recordCount value for this AuditFT.
     * 
     * @return recordCount
     */
    public java.lang.String getRecordCount() {
        return recordCount;
    }


    /**
     * Sets the recordCount value for this AuditFT.
     * 
     * @param recordCount
     */
    public void setRecordCount(java.lang.String recordCount) {
        this.recordCount = recordCount;
    }


    /**
     * Gets the remNTDomain value for this AuditFT.
     * 
     * @return remNTDomain
     */
    public java.lang.String getRemNTDomain() {
        return remNTDomain;
    }


    /**
     * Sets the remNTDomain value for this AuditFT.
     * 
     * @param remNTDomain
     */
    public void setRemNTDomain(java.lang.String remNTDomain) {
        this.remNTDomain = remNTDomain;
    }


    /**
     * Gets the remNodeType value for this AuditFT.
     * 
     * @return remNodeType
     */
    public java.lang.String getRemNodeType() {
        return remNodeType;
    }


    /**
     * Sets the remNodeType value for this AuditFT.
     * 
     * @param remNodeType
     */
    public void setRemNodeType(java.lang.String remNodeType) {
        this.remNodeType = remNodeType;
    }


    /**
     * Gets the remPortNum value for this AuditFT.
     * 
     * @return remPortNum
     */
    public java.lang.String getRemPortNum() {
        return remPortNum;
    }


    /**
     * Sets the remPortNum value for this AuditFT.
     * 
     * @param remPortNum
     */
    public void setRemPortNum(java.lang.String remPortNum) {
        this.remPortNum = remPortNum;
    }


    /**
     * Gets the remTransID value for this AuditFT.
     * 
     * @return remTransID
     */
    public java.lang.String getRemTransID() {
        return remTransID;
    }


    /**
     * Sets the remTransID value for this AuditFT.
     * 
     * @param remTransID
     */
    public void setRemTransID(java.lang.String remTransID) {
        this.remTransID = remTransID;
    }


    /**
     * Gets the remUserID value for this AuditFT.
     * 
     * @return remUserID
     */
    public java.lang.String getRemUserID() {
        return remUserID;
    }


    /**
     * Sets the remUserID value for this AuditFT.
     * 
     * @param remUserID
     */
    public void setRemUserID(java.lang.String remUserID) {
        this.remUserID = remUserID;
    }


    /**
     * Gets the scanSubDir value for this AuditFT.
     * 
     * @return scanSubDir
     */
    public java.lang.String getScanSubDir() {
        return scanSubDir;
    }


    /**
     * Sets the scanSubDir value for this AuditFT.
     * 
     * @param scanSubDir
     */
    public void setScanSubDir(java.lang.String scanSubDir) {
        this.scanSubDir = scanSubDir;
    }


    /**
     * Gets the tempError value for this AuditFT.
     * 
     * @return tempError
     */
    public java.lang.String getTempError() {
        return tempError;
    }


    /**
     * Sets the tempError value for this AuditFT.
     * 
     * @param tempError
     */
    public void setTempError(java.lang.String tempError) {
        this.tempError = tempError;
    }


    /**
     * Gets the trCommand value for this AuditFT.
     * 
     * @return trCommand
     */
    public java.lang.String getTrCommand() {
        return trCommand;
    }


    /**
     * Sets the trCommand value for this AuditFT.
     * 
     * @param trCommand
     */
    public void setTrCommand(java.lang.String trCommand) {
        this.trCommand = trCommand;
    }


    /**
     * Gets the trCompType value for this AuditFT.
     * 
     * @return trCompType
     */
    public java.lang.String getTrCompType() {
        return trCompType;
    }


    /**
     * Sets the trCompType value for this AuditFT.
     * 
     * @param trCompType
     */
    public void setTrCompType(java.lang.String trCompType) {
        this.trCompType = trCompType;
    }


    /**
     * Gets the trExpireDate value for this AuditFT.
     * 
     * @return trExpireDate
     */
    public AdminClient.DateTime getTrExpireDate() {
        return trExpireDate;
    }


    /**
     * Sets the trExpireDate value for this AuditFT.
     * 
     * @param trExpireDate
     */
    public void setTrExpireDate(AdminClient.DateTime trExpireDate) {
        this.trExpireDate = trExpireDate;
    }


    /**
     * Gets the trScheduleDate value for this AuditFT.
     * 
     * @return trScheduleDate
     */
    public AdminClient.DateTime getTrScheduleDate() {
        return trScheduleDate;
    }


    /**
     * Sets the trScheduleDate value for this AuditFT.
     * 
     * @param trScheduleDate
     */
    public void setTrScheduleDate(AdminClient.DateTime trScheduleDate) {
        this.trScheduleDate = trScheduleDate;
    }


    /**
     * Gets the trStDiagCode value for this AuditFT.
     * 
     * @return trStDiagCode
     */
    public java.lang.String getTrStDiagCode() {
        return trStDiagCode;
    }


    /**
     * Sets the trStDiagCode value for this AuditFT.
     * 
     * @param trStDiagCode
     */
    public void setTrStDiagCode(java.lang.String trStDiagCode) {
        this.trStDiagCode = trStDiagCode;
    }


    /**
     * Gets the trStRtnCode value for this AuditFT.
     * 
     * @return trStRtnCode
     */
    public java.lang.String getTrStRtnCode() {
        return trStRtnCode;
    }


    /**
     * Sets the trStRtnCode value for this AuditFT.
     * 
     * @param trStRtnCode
     */
    public void setTrStRtnCode(java.lang.String trStRtnCode) {
        this.trStRtnCode = trStRtnCode;
    }


    /**
     * Gets the trStSeverity value for this AuditFT.
     * 
     * @return trStSeverity
     */
    public java.lang.String getTrStSeverity() {
        return trStSeverity;
    }


    /**
     * Sets the trStSeverity value for this AuditFT.
     * 
     * @param trStSeverity
     */
    public void setTrStSeverity(java.lang.String trStSeverity) {
        this.trStSeverity = trStSeverity;
    }


    /**
     * Gets the tryCount value for this AuditFT.
     * 
     * @return tryCount
     */
    public java.lang.String getTryCount() {
        return tryCount;
    }


    /**
     * Sets the tryCount value for this AuditFT.
     * 
     * @param tryCount
     */
    public void setTryCount(java.lang.String tryCount) {
        this.tryCount = tryCount;
    }


    /**
     * Gets the tryMaxCount value for this AuditFT.
     * 
     * @return tryMaxCount
     */
    public java.lang.String getTryMaxCount() {
        return tryMaxCount;
    }


    /**
     * Sets the tryMaxCount value for this AuditFT.
     * 
     * @param tryMaxCount
     */
    public void setTryMaxCount(java.lang.String tryMaxCount) {
        this.tryMaxCount = tryMaxCount;
    }


    /**
     * Gets the unixFilePerm value for this AuditFT.
     * 
     * @return unixFilePerm
     */
    public java.lang.String getUnixFilePerm() {
        return unixFilePerm;
    }


    /**
     * Sets the unixFilePerm value for this AuditFT.
     * 
     * @param unixFilePerm
     */
    public void setUnixFilePerm(java.lang.String unixFilePerm) {
        this.unixFilePerm = unixFilePerm;
    }


    /**
     * Gets the versionNum value for this AuditFT.
     * 
     * @return versionNum
     */
    public java.lang.String getVersionNum() {
        return versionNum;
    }


    /**
     * Sets the versionNum value for this AuditFT.
     * 
     * @param versionNum
     */
    public void setVersionNum(java.lang.String versionNum) {
        this.versionNum = versionNum;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AuditFT)) return false;
        AuditFT other = (AuditFT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.OS390AllocDir==null && other.getOS390AllocDir()==null) || 
             (this.OS390AllocDir!=null &&
              this.OS390AllocDir.equals(other.getOS390AllocDir()))) &&
            ((this.SSL==null && other.getSSL()==null) || 
             (this.SSL!=null &&
              this.SSL.equals(other.getSSL()))) &&
            ((this.SSLPortNum==null && other.getSSLPortNum()==null) || 
             (this.SSLPortNum!=null &&
              this.SSLPortNum.equals(other.getSSLPortNum()))) &&
            ((this.crlMsg==null && other.getCrlMsg()==null) || 
             (this.crlMsg!=null &&
              this.crlMsg.equals(other.getCrlMsg()))) &&
            ((this.fileAttributes==null && other.getFileAttributes()==null) || 
             (this.fileAttributes!=null &&
              this.fileAttributes.equals(other.getFileAttributes()))) &&
            ((this.memberCount==null && other.getMemberCount()==null) || 
             (this.memberCount!=null &&
              this.memberCount.equals(other.getMemberCount()))) &&
            ((this.nodeClass==null && other.getNodeClass()==null) || 
             (this.nodeClass!=null &&
              this.nodeClass.equals(other.getNodeClass()))) &&
            ((this.priority==null && other.getPriority()==null) || 
             (this.priority!=null &&
              this.priority.equals(other.getPriority()))) &&
            ((this.recordCount==null && other.getRecordCount()==null) || 
             (this.recordCount!=null &&
              this.recordCount.equals(other.getRecordCount()))) &&
            ((this.remNTDomain==null && other.getRemNTDomain()==null) || 
             (this.remNTDomain!=null &&
              this.remNTDomain.equals(other.getRemNTDomain()))) &&
            ((this.remNodeType==null && other.getRemNodeType()==null) || 
             (this.remNodeType!=null &&
              this.remNodeType.equals(other.getRemNodeType()))) &&
            ((this.remPortNum==null && other.getRemPortNum()==null) || 
             (this.remPortNum!=null &&
              this.remPortNum.equals(other.getRemPortNum()))) &&
            ((this.remTransID==null && other.getRemTransID()==null) || 
             (this.remTransID!=null &&
              this.remTransID.equals(other.getRemTransID()))) &&
            ((this.remUserID==null && other.getRemUserID()==null) || 
             (this.remUserID!=null &&
              this.remUserID.equals(other.getRemUserID()))) &&
            ((this.scanSubDir==null && other.getScanSubDir()==null) || 
             (this.scanSubDir!=null &&
              this.scanSubDir.equals(other.getScanSubDir()))) &&
            ((this.tempError==null && other.getTempError()==null) || 
             (this.tempError!=null &&
              this.tempError.equals(other.getTempError()))) &&
            ((this.trCommand==null && other.getTrCommand()==null) || 
             (this.trCommand!=null &&
              this.trCommand.equals(other.getTrCommand()))) &&
            ((this.trCompType==null && other.getTrCompType()==null) || 
             (this.trCompType!=null &&
              this.trCompType.equals(other.getTrCompType()))) &&
            ((this.trExpireDate==null && other.getTrExpireDate()==null) || 
             (this.trExpireDate!=null &&
              this.trExpireDate.equals(other.getTrExpireDate()))) &&
            ((this.trScheduleDate==null && other.getTrScheduleDate()==null) || 
             (this.trScheduleDate!=null &&
              this.trScheduleDate.equals(other.getTrScheduleDate()))) &&
            ((this.trStDiagCode==null && other.getTrStDiagCode()==null) || 
             (this.trStDiagCode!=null &&
              this.trStDiagCode.equals(other.getTrStDiagCode()))) &&
            ((this.trStRtnCode==null && other.getTrStRtnCode()==null) || 
             (this.trStRtnCode!=null &&
              this.trStRtnCode.equals(other.getTrStRtnCode()))) &&
            ((this.trStSeverity==null && other.getTrStSeverity()==null) || 
             (this.trStSeverity!=null &&
              this.trStSeverity.equals(other.getTrStSeverity()))) &&
            ((this.tryCount==null && other.getTryCount()==null) || 
             (this.tryCount!=null &&
              this.tryCount.equals(other.getTryCount()))) &&
            ((this.tryMaxCount==null && other.getTryMaxCount()==null) || 
             (this.tryMaxCount!=null &&
              this.tryMaxCount.equals(other.getTryMaxCount()))) &&
            ((this.unixFilePerm==null && other.getUnixFilePerm()==null) || 
             (this.unixFilePerm!=null &&
              this.unixFilePerm.equals(other.getUnixFilePerm()))) &&
            ((this.versionNum==null && other.getVersionNum()==null) || 
             (this.versionNum!=null &&
              this.versionNum.equals(other.getVersionNum())));
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
        if (getOS390AllocDir() != null) {
            _hashCode += getOS390AllocDir().hashCode();
        }
        if (getSSL() != null) {
            _hashCode += getSSL().hashCode();
        }
        if (getSSLPortNum() != null) {
            _hashCode += getSSLPortNum().hashCode();
        }
        if (getCrlMsg() != null) {
            _hashCode += getCrlMsg().hashCode();
        }
        if (getFileAttributes() != null) {
            _hashCode += getFileAttributes().hashCode();
        }
        if (getMemberCount() != null) {
            _hashCode += getMemberCount().hashCode();
        }
        if (getNodeClass() != null) {
            _hashCode += getNodeClass().hashCode();
        }
        if (getPriority() != null) {
            _hashCode += getPriority().hashCode();
        }
        if (getRecordCount() != null) {
            _hashCode += getRecordCount().hashCode();
        }
        if (getRemNTDomain() != null) {
            _hashCode += getRemNTDomain().hashCode();
        }
        if (getRemNodeType() != null) {
            _hashCode += getRemNodeType().hashCode();
        }
        if (getRemPortNum() != null) {
            _hashCode += getRemPortNum().hashCode();
        }
        if (getRemTransID() != null) {
            _hashCode += getRemTransID().hashCode();
        }
        if (getRemUserID() != null) {
            _hashCode += getRemUserID().hashCode();
        }
        if (getScanSubDir() != null) {
            _hashCode += getScanSubDir().hashCode();
        }
        if (getTempError() != null) {
            _hashCode += getTempError().hashCode();
        }
        if (getTrCommand() != null) {
            _hashCode += getTrCommand().hashCode();
        }
        if (getTrCompType() != null) {
            _hashCode += getTrCompType().hashCode();
        }
        if (getTrExpireDate() != null) {
            _hashCode += getTrExpireDate().hashCode();
        }
        if (getTrScheduleDate() != null) {
            _hashCode += getTrScheduleDate().hashCode();
        }
        if (getTrStDiagCode() != null) {
            _hashCode += getTrStDiagCode().hashCode();
        }
        if (getTrStRtnCode() != null) {
            _hashCode += getTrStRtnCode().hashCode();
        }
        if (getTrStSeverity() != null) {
            _hashCode += getTrStSeverity().hashCode();
        }
        if (getTryCount() != null) {
            _hashCode += getTryCount().hashCode();
        }
        if (getTryMaxCount() != null) {
            _hashCode += getTryMaxCount().hashCode();
        }
        if (getUnixFilePerm() != null) {
            _hashCode += getUnixFilePerm().hashCode();
        }
        if (getVersionNum() != null) {
            _hashCode += getVersionNum().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AuditFT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:AdministratorService", "AuditFT"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("OS390AllocDir");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OS390AllocDir"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SSL");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SSL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SSLPortNum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SSLPortNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("crlMsg");
        elemField.setXmlName(new javax.xml.namespace.QName("", "crlMsg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileAttributes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fileAttributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memberCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "memberCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nodeClass");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nodeClass"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "priority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recordCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "recordCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remNTDomain");
        elemField.setXmlName(new javax.xml.namespace.QName("", "remNTDomain"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remNodeType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "remNodeType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remPortNum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "remPortNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remTransID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "remTransID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remUserID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "remUserID"));
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
        elemField.setFieldName("tempError");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tempError"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trCommand");
        elemField.setXmlName(new javax.xml.namespace.QName("", "trCommand"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trCompType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "trCompType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trExpireDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "trExpireDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:AdministratorService", "DateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trScheduleDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "trScheduleDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:AdministratorService", "DateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trStDiagCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "trStDiagCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trStRtnCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "trStRtnCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trStSeverity");
        elemField.setXmlName(new javax.xml.namespace.QName("", "trStSeverity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tryCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tryCount"));
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
        elemField.setFieldName("unixFilePerm");
        elemField.setXmlName(new javax.xml.namespace.QName("", "unixFilePerm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("versionNum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "versionNum"));
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
