/**
 * Transfer.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 11, 2014 (12:11:36 EDT) WSDL2Java emitter.
 */

package AdminClient;

public class Transfer  extends AdminClient.FileInfo  implements java.io.Serializable {
    public Transfer() {
    }

    public Transfer(
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
        super(
            CRLF,
            FTPAlias,
            FTPAllowClientTransMode,
            FTPAllowCreateDir,
            FTPAllowDelete,
            FTPAllowRemoveDir,
            FTPAllowRename,
            FTPSiteCmdPassThrough,
            ISServerName,
            JMSMaxMsgSize,
            JMSMessageID,
            JMSNameOrFilePath,
            JMSOrFile,
            JMSProperty,
            JMSSelector,
            JMSTransferStatusCheck,
            JMSTypeProperty,
            JMSUserID,
            JMSUserPwd,
            JPAFullLocalFileName,
            JPAFullRemoteFileName,
            JPALocalTransactionNumber,
            JPALocalUserId,
            JPARemoteTransactionNumber,
            JPARemoteUsrId,
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
            PGPArmorFile,
            PGPCompressAlg,
            PGPDecryptFile,
            PGPEncryptAlg,
            PGPEncryptFile,
            PGPHashingAlg,
            PGPPrivateKey,
            PGPSignFile,
            PGPStrictVerifySign,
            PGPTextMode,
            PGPVerifySign,
            RECFM,
            SSHPrivKey,
            allowableProtocol,
            auditId,
            authRoleId,
            authUserId,
            availableDate,
            availableUpdatedBy,
            chkptCount,
            chkptInterval,
            chkptRestartFlag,
            chkptTryMaxCount,
            clientCompressFlag,
            clientFileName,
            conversionFlag,
            createdBy,
            credPassThruFlag,
            dataType,
            dateCreated,
            dateLastProcessed,
            dateUpdated,
            defaultNTDomain,
            defaultNodePwd,
            defaultNodeUserId,
            department,
            description,
            directoryFileList,
            directoryTransfer,
            disableFlag,
            downloadRuleFileExtEnabled,
            downloadRuleFileExts,
            emailFailureFlag,
            emailFailureTemplate,
            emailSuccessFlag,
            emailSuccessTemplate,
            encryptFlag,
            expirationDate,
            fileOption,
            httpBackendUploadFormPara,
            httpBackendUploadFormat,
            id,
            keyFlag,
            lastReturnCode,
            localTransactionId,
            localTranslationTable,
            nodeName,
            notifyEmailTemplate,
            notifyFlag,
            oneTimeFlag,
            postActionData1,
            postActionData2,
            postActionData3,
            postActionData4,
            postActionFlag1,
            postActionFlag2,
            postActionFlag3,
            postActionFlag4,
            postActionType1,
            postActionType2,
            postActionType3,
            postActionType4,
            processName,
            remoteTranslationTable,
            requestID,
            restartAvailable,
            sendRecvFlag,
            serverFileName,
            toEmailAddrFailure,
            toEmailAddrSuccess,
            tokenData,
            tokenDateSet,
            tokenFlag,
            traceFlag,
            transferCompletionFlag,
            transferID,
            transferWork,
            unixPermissions,
            updatedBy,
            uploadRuleFileExtEnabled,
            uploadRuleFileExts,
            uploadView,
            userData,
            validDays,
            validEndTime,
            validStartTime,
            virusCheckFlag,
            writeMode);
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Transfer)) return false;
        Transfer other = (Transfer) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj);
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Transfer.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:AdministratorService", "Transfer"));
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
