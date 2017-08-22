/**
 * Checkpoint.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 11, 2014 (12:11:36 EDT) WSDL2Java emitter.
 */

package AdminClient;

public class Checkpoint  implements java.io.Serializable {
    private AdminClient.DateTime checkpointTime;

    private java.lang.String clientFileDocket;

    private java.lang.String clientFileDocketExtention;

    private java.lang.String clientFileName;

    private java.lang.String directoryTransfer;

    private java.lang.String fileId;

    private java.lang.String nodeName;

    private java.lang.String numberTries;

    private java.lang.String proxyRemoteTransactionId;

    private java.lang.String sendReceiveFlag;

    private java.lang.String serverFileDocket;

    private java.lang.String serverFileDocketExtention;

    private java.lang.String serverFileName;

    private java.lang.String transactionId;

    private java.lang.String userId;

    public Checkpoint() {
    }

    public Checkpoint(
           AdminClient.DateTime checkpointTime,
           java.lang.String clientFileDocket,
           java.lang.String clientFileDocketExtention,
           java.lang.String clientFileName,
           java.lang.String directoryTransfer,
           java.lang.String fileId,
           java.lang.String nodeName,
           java.lang.String numberTries,
           java.lang.String proxyRemoteTransactionId,
           java.lang.String sendReceiveFlag,
           java.lang.String serverFileDocket,
           java.lang.String serverFileDocketExtention,
           java.lang.String serverFileName,
           java.lang.String transactionId,
           java.lang.String userId) {
           this.checkpointTime = checkpointTime;
           this.clientFileDocket = clientFileDocket;
           this.clientFileDocketExtention = clientFileDocketExtention;
           this.clientFileName = clientFileName;
           this.directoryTransfer = directoryTransfer;
           this.fileId = fileId;
           this.nodeName = nodeName;
           this.numberTries = numberTries;
           this.proxyRemoteTransactionId = proxyRemoteTransactionId;
           this.sendReceiveFlag = sendReceiveFlag;
           this.serverFileDocket = serverFileDocket;
           this.serverFileDocketExtention = serverFileDocketExtention;
           this.serverFileName = serverFileName;
           this.transactionId = transactionId;
           this.userId = userId;
    }


    /**
     * Gets the checkpointTime value for this Checkpoint.
     * 
     * @return checkpointTime
     */
    public AdminClient.DateTime getCheckpointTime() {
        return checkpointTime;
    }


    /**
     * Sets the checkpointTime value for this Checkpoint.
     * 
     * @param checkpointTime
     */
    public void setCheckpointTime(AdminClient.DateTime checkpointTime) {
        this.checkpointTime = checkpointTime;
    }


    /**
     * Gets the clientFileDocket value for this Checkpoint.
     * 
     * @return clientFileDocket
     */
    public java.lang.String getClientFileDocket() {
        return clientFileDocket;
    }


    /**
     * Sets the clientFileDocket value for this Checkpoint.
     * 
     * @param clientFileDocket
     */
    public void setClientFileDocket(java.lang.String clientFileDocket) {
        this.clientFileDocket = clientFileDocket;
    }


    /**
     * Gets the clientFileDocketExtention value for this Checkpoint.
     * 
     * @return clientFileDocketExtention
     */
    public java.lang.String getClientFileDocketExtention() {
        return clientFileDocketExtention;
    }


    /**
     * Sets the clientFileDocketExtention value for this Checkpoint.
     * 
     * @param clientFileDocketExtention
     */
    public void setClientFileDocketExtention(java.lang.String clientFileDocketExtention) {
        this.clientFileDocketExtention = clientFileDocketExtention;
    }


    /**
     * Gets the clientFileName value for this Checkpoint.
     * 
     * @return clientFileName
     */
    public java.lang.String getClientFileName() {
        return clientFileName;
    }


    /**
     * Sets the clientFileName value for this Checkpoint.
     * 
     * @param clientFileName
     */
    public void setClientFileName(java.lang.String clientFileName) {
        this.clientFileName = clientFileName;
    }


    /**
     * Gets the directoryTransfer value for this Checkpoint.
     * 
     * @return directoryTransfer
     */
    public java.lang.String getDirectoryTransfer() {
        return directoryTransfer;
    }


    /**
     * Sets the directoryTransfer value for this Checkpoint.
     * 
     * @param directoryTransfer
     */
    public void setDirectoryTransfer(java.lang.String directoryTransfer) {
        this.directoryTransfer = directoryTransfer;
    }


    /**
     * Gets the fileId value for this Checkpoint.
     * 
     * @return fileId
     */
    public java.lang.String getFileId() {
        return fileId;
    }


    /**
     * Sets the fileId value for this Checkpoint.
     * 
     * @param fileId
     */
    public void setFileId(java.lang.String fileId) {
        this.fileId = fileId;
    }


    /**
     * Gets the nodeName value for this Checkpoint.
     * 
     * @return nodeName
     */
    public java.lang.String getNodeName() {
        return nodeName;
    }


    /**
     * Sets the nodeName value for this Checkpoint.
     * 
     * @param nodeName
     */
    public void setNodeName(java.lang.String nodeName) {
        this.nodeName = nodeName;
    }


    /**
     * Gets the numberTries value for this Checkpoint.
     * 
     * @return numberTries
     */
    public java.lang.String getNumberTries() {
        return numberTries;
    }


    /**
     * Sets the numberTries value for this Checkpoint.
     * 
     * @param numberTries
     */
    public void setNumberTries(java.lang.String numberTries) {
        this.numberTries = numberTries;
    }


    /**
     * Gets the proxyRemoteTransactionId value for this Checkpoint.
     * 
     * @return proxyRemoteTransactionId
     */
    public java.lang.String getProxyRemoteTransactionId() {
        return proxyRemoteTransactionId;
    }


    /**
     * Sets the proxyRemoteTransactionId value for this Checkpoint.
     * 
     * @param proxyRemoteTransactionId
     */
    public void setProxyRemoteTransactionId(java.lang.String proxyRemoteTransactionId) {
        this.proxyRemoteTransactionId = proxyRemoteTransactionId;
    }


    /**
     * Gets the sendReceiveFlag value for this Checkpoint.
     * 
     * @return sendReceiveFlag
     */
    public java.lang.String getSendReceiveFlag() {
        return sendReceiveFlag;
    }


    /**
     * Sets the sendReceiveFlag value for this Checkpoint.
     * 
     * @param sendReceiveFlag
     */
    public void setSendReceiveFlag(java.lang.String sendReceiveFlag) {
        this.sendReceiveFlag = sendReceiveFlag;
    }


    /**
     * Gets the serverFileDocket value for this Checkpoint.
     * 
     * @return serverFileDocket
     */
    public java.lang.String getServerFileDocket() {
        return serverFileDocket;
    }


    /**
     * Sets the serverFileDocket value for this Checkpoint.
     * 
     * @param serverFileDocket
     */
    public void setServerFileDocket(java.lang.String serverFileDocket) {
        this.serverFileDocket = serverFileDocket;
    }


    /**
     * Gets the serverFileDocketExtention value for this Checkpoint.
     * 
     * @return serverFileDocketExtention
     */
    public java.lang.String getServerFileDocketExtention() {
        return serverFileDocketExtention;
    }


    /**
     * Sets the serverFileDocketExtention value for this Checkpoint.
     * 
     * @param serverFileDocketExtention
     */
    public void setServerFileDocketExtention(java.lang.String serverFileDocketExtention) {
        this.serverFileDocketExtention = serverFileDocketExtention;
    }


    /**
     * Gets the serverFileName value for this Checkpoint.
     * 
     * @return serverFileName
     */
    public java.lang.String getServerFileName() {
        return serverFileName;
    }


    /**
     * Sets the serverFileName value for this Checkpoint.
     * 
     * @param serverFileName
     */
    public void setServerFileName(java.lang.String serverFileName) {
        this.serverFileName = serverFileName;
    }


    /**
     * Gets the transactionId value for this Checkpoint.
     * 
     * @return transactionId
     */
    public java.lang.String getTransactionId() {
        return transactionId;
    }


    /**
     * Sets the transactionId value for this Checkpoint.
     * 
     * @param transactionId
     */
    public void setTransactionId(java.lang.String transactionId) {
        this.transactionId = transactionId;
    }


    /**
     * Gets the userId value for this Checkpoint.
     * 
     * @return userId
     */
    public java.lang.String getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this Checkpoint.
     * 
     * @param userId
     */
    public void setUserId(java.lang.String userId) {
        this.userId = userId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Checkpoint)) return false;
        Checkpoint other = (Checkpoint) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.checkpointTime==null && other.getCheckpointTime()==null) || 
             (this.checkpointTime!=null &&
              this.checkpointTime.equals(other.getCheckpointTime()))) &&
            ((this.clientFileDocket==null && other.getClientFileDocket()==null) || 
             (this.clientFileDocket!=null &&
              this.clientFileDocket.equals(other.getClientFileDocket()))) &&
            ((this.clientFileDocketExtention==null && other.getClientFileDocketExtention()==null) || 
             (this.clientFileDocketExtention!=null &&
              this.clientFileDocketExtention.equals(other.getClientFileDocketExtention()))) &&
            ((this.clientFileName==null && other.getClientFileName()==null) || 
             (this.clientFileName!=null &&
              this.clientFileName.equals(other.getClientFileName()))) &&
            ((this.directoryTransfer==null && other.getDirectoryTransfer()==null) || 
             (this.directoryTransfer!=null &&
              this.directoryTransfer.equals(other.getDirectoryTransfer()))) &&
            ((this.fileId==null && other.getFileId()==null) || 
             (this.fileId!=null &&
              this.fileId.equals(other.getFileId()))) &&
            ((this.nodeName==null && other.getNodeName()==null) || 
             (this.nodeName!=null &&
              this.nodeName.equals(other.getNodeName()))) &&
            ((this.numberTries==null && other.getNumberTries()==null) || 
             (this.numberTries!=null &&
              this.numberTries.equals(other.getNumberTries()))) &&
            ((this.proxyRemoteTransactionId==null && other.getProxyRemoteTransactionId()==null) || 
             (this.proxyRemoteTransactionId!=null &&
              this.proxyRemoteTransactionId.equals(other.getProxyRemoteTransactionId()))) &&
            ((this.sendReceiveFlag==null && other.getSendReceiveFlag()==null) || 
             (this.sendReceiveFlag!=null &&
              this.sendReceiveFlag.equals(other.getSendReceiveFlag()))) &&
            ((this.serverFileDocket==null && other.getServerFileDocket()==null) || 
             (this.serverFileDocket!=null &&
              this.serverFileDocket.equals(other.getServerFileDocket()))) &&
            ((this.serverFileDocketExtention==null && other.getServerFileDocketExtention()==null) || 
             (this.serverFileDocketExtention!=null &&
              this.serverFileDocketExtention.equals(other.getServerFileDocketExtention()))) &&
            ((this.serverFileName==null && other.getServerFileName()==null) || 
             (this.serverFileName!=null &&
              this.serverFileName.equals(other.getServerFileName()))) &&
            ((this.transactionId==null && other.getTransactionId()==null) || 
             (this.transactionId!=null &&
              this.transactionId.equals(other.getTransactionId()))) &&
            ((this.userId==null && other.getUserId()==null) || 
             (this.userId!=null &&
              this.userId.equals(other.getUserId())));
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
        if (getCheckpointTime() != null) {
            _hashCode += getCheckpointTime().hashCode();
        }
        if (getClientFileDocket() != null) {
            _hashCode += getClientFileDocket().hashCode();
        }
        if (getClientFileDocketExtention() != null) {
            _hashCode += getClientFileDocketExtention().hashCode();
        }
        if (getClientFileName() != null) {
            _hashCode += getClientFileName().hashCode();
        }
        if (getDirectoryTransfer() != null) {
            _hashCode += getDirectoryTransfer().hashCode();
        }
        if (getFileId() != null) {
            _hashCode += getFileId().hashCode();
        }
        if (getNodeName() != null) {
            _hashCode += getNodeName().hashCode();
        }
        if (getNumberTries() != null) {
            _hashCode += getNumberTries().hashCode();
        }
        if (getProxyRemoteTransactionId() != null) {
            _hashCode += getProxyRemoteTransactionId().hashCode();
        }
        if (getSendReceiveFlag() != null) {
            _hashCode += getSendReceiveFlag().hashCode();
        }
        if (getServerFileDocket() != null) {
            _hashCode += getServerFileDocket().hashCode();
        }
        if (getServerFileDocketExtention() != null) {
            _hashCode += getServerFileDocketExtention().hashCode();
        }
        if (getServerFileName() != null) {
            _hashCode += getServerFileName().hashCode();
        }
        if (getTransactionId() != null) {
            _hashCode += getTransactionId().hashCode();
        }
        if (getUserId() != null) {
            _hashCode += getUserId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Checkpoint.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:AdministratorService", "Checkpoint"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("checkpointTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "checkpointTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:AdministratorService", "DateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientFileDocket");
        elemField.setXmlName(new javax.xml.namespace.QName("", "clientFileDocket"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientFileDocketExtention");
        elemField.setXmlName(new javax.xml.namespace.QName("", "clientFileDocketExtention"));
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
        elemField.setFieldName("directoryTransfer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "directoryTransfer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fileId"));
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
        elemField.setFieldName("numberTries");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numberTries"));
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
        elemField.setFieldName("sendReceiveFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sendReceiveFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serverFileDocket");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serverFileDocket"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serverFileDocketExtention");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serverFileDocketExtention"));
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
        elemField.setFieldName("transactionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transactionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userId"));
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
