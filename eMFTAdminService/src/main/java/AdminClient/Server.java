/**
 * Server.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 11, 2014 (12:11:36 EDT) WSDL2Java emitter.
 */

package AdminClient;

public class Server  extends AdminClient.Node  implements java.io.Serializable {
    public Server() {
    }

    public Server(
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
        super(
            CFComputerName,
            CFVersion,
            DNIPass,
            DNIPort,
            DNIUser,
            FTPCaseSensitive,
            FTPKeepAliveInterval,
            FTPPrivKey,
            IPName,
            IPPort,
            MDNReceipt,
            MDNSign,
            PGPArmor,
            PGPCompAlg,
            PGPEnabled,
            PGPEncryptAlg,
            PGPHashAlg,
            PGPPrivKey,
            PGPSign,
            PGPTextMode,
            PGPVerifyServerSign,
            PGPVerifySign,
            SSHBlockSize,
            SSHCompress,
            SSHPoolingFlag,
            SSHPrivKey,
            bindIPAddress,
            checkServerStatus,
            clearCommandChannel,
            collectInterval,
            collectType,
            collectionFlag,
            compressType,
            connectionSecurityType,
            connectionSecurityTypePS,
            context,
            createdBy,
            dataConnectionType,
            dateCreated,
            dateUpdated,
            defaultEncryptType,
            defaultLTTable,
            defaultNTDomain,
            defaultPass,
            defaultRTTable,
            defaultUser,
            department,
            description,
            disableFlag,
            extIPAddress,
            ftpPoolingFlag,
            ftpPoolingIdleTimeout,
            hdfsAuth,
            hdfsPrivKey,
            hdfsUserName,
            httpPrivKey,
            httpProxyIpName,
            httpProxyIpPort,
            idOfLastCollect,
            inEncAlg,
            inSignAlg,
            kerberosServers,
            keyFlag,
            krbProtocol,
            lastFailServerStatusDate,
            lastGoodServerStatusDate,
            lastServerStatus,
            lastServerStatusDate,
            manageCFServerFlag,
            name,
            nodeType,
            outChunking,
            outCompAlg,
            outDataType,
            outEncAlg,
            outSignAlg,
            outTimeout,
            partnerAS2ID,
            pasvChecking,
            portChecking,
            priEncName,
            priSignName,
            priorServerStatus,
            priorServerStatusDate,
            psPrivKey,
            pubEncCert,
            pubSSLCert,
            pubSignCert,
            secureFlag,
            separateCollectThread,
            serverExpiredEmailDate,
            serverFileNamePrefix,
            serverLicenseKey,
            serverStatusFailCount,
            serverStatusGoodCount,
            serverType,
            srvAS2ID,
            sshPoolingIdleTimeout,
            theClassName,
            timeOfLastCollection,
            traceFlag,
            updatedBy,
            useExtIPAddress,
            userID,
            visibility);
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Server)) return false;
        Server other = (Server) obj;
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
        new org.apache.axis.description.TypeDesc(Server.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:AdministratorService", "Server"));
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
