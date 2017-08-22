/**
 * AS2Audit.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 11, 2014 (12:11:36 EDT) WSDL2Java emitter.
 */

package AdminClient;

public class AS2Audit  implements java.io.Serializable {
    private java.lang.String EDIDataType;

    private byte[] MDNContents;

    private byte[] MDNHeader;

    private java.lang.String MDNRequest;

    private java.lang.String MDNResults;

    private java.lang.String MDNSignAlg;

    private java.lang.String MDNSignProt;

    private java.lang.String MICDigest;

    private java.lang.String asyncMDNURL;

    private java.lang.String auditID;

    private java.lang.String compressAlg;

    private java.lang.String encryptAlg;

    private java.lang.String fromName;

    private java.lang.String messageID;

    private java.lang.String serverClient;

    private java.lang.String signAlg;

    private java.lang.String timeout;

    private java.lang.String toName;

    private java.lang.String versionIn;

    private java.lang.String versionOut;

    public AS2Audit() {
    }

    public AS2Audit(
           java.lang.String EDIDataType,
           byte[] MDNContents,
           byte[] MDNHeader,
           java.lang.String MDNRequest,
           java.lang.String MDNResults,
           java.lang.String MDNSignAlg,
           java.lang.String MDNSignProt,
           java.lang.String MICDigest,
           java.lang.String asyncMDNURL,
           java.lang.String auditID,
           java.lang.String compressAlg,
           java.lang.String encryptAlg,
           java.lang.String fromName,
           java.lang.String messageID,
           java.lang.String serverClient,
           java.lang.String signAlg,
           java.lang.String timeout,
           java.lang.String toName,
           java.lang.String versionIn,
           java.lang.String versionOut) {
           this.EDIDataType = EDIDataType;
           this.MDNContents = MDNContents;
           this.MDNHeader = MDNHeader;
           this.MDNRequest = MDNRequest;
           this.MDNResults = MDNResults;
           this.MDNSignAlg = MDNSignAlg;
           this.MDNSignProt = MDNSignProt;
           this.MICDigest = MICDigest;
           this.asyncMDNURL = asyncMDNURL;
           this.auditID = auditID;
           this.compressAlg = compressAlg;
           this.encryptAlg = encryptAlg;
           this.fromName = fromName;
           this.messageID = messageID;
           this.serverClient = serverClient;
           this.signAlg = signAlg;
           this.timeout = timeout;
           this.toName = toName;
           this.versionIn = versionIn;
           this.versionOut = versionOut;
    }


    /**
     * Gets the EDIDataType value for this AS2Audit.
     * 
     * @return EDIDataType
     */
    public java.lang.String getEDIDataType() {
        return EDIDataType;
    }


    /**
     * Sets the EDIDataType value for this AS2Audit.
     * 
     * @param EDIDataType
     */
    public void setEDIDataType(java.lang.String EDIDataType) {
        this.EDIDataType = EDIDataType;
    }


    /**
     * Gets the MDNContents value for this AS2Audit.
     * 
     * @return MDNContents
     */
    public byte[] getMDNContents() {
        return MDNContents;
    }


    /**
     * Sets the MDNContents value for this AS2Audit.
     * 
     * @param MDNContents
     */
    public void setMDNContents(byte[] MDNContents) {
        this.MDNContents = MDNContents;
    }


    /**
     * Gets the MDNHeader value for this AS2Audit.
     * 
     * @return MDNHeader
     */
    public byte[] getMDNHeader() {
        return MDNHeader;
    }


    /**
     * Sets the MDNHeader value for this AS2Audit.
     * 
     * @param MDNHeader
     */
    public void setMDNHeader(byte[] MDNHeader) {
        this.MDNHeader = MDNHeader;
    }


    /**
     * Gets the MDNRequest value for this AS2Audit.
     * 
     * @return MDNRequest
     */
    public java.lang.String getMDNRequest() {
        return MDNRequest;
    }


    /**
     * Sets the MDNRequest value for this AS2Audit.
     * 
     * @param MDNRequest
     */
    public void setMDNRequest(java.lang.String MDNRequest) {
        this.MDNRequest = MDNRequest;
    }


    /**
     * Gets the MDNResults value for this AS2Audit.
     * 
     * @return MDNResults
     */
    public java.lang.String getMDNResults() {
        return MDNResults;
    }


    /**
     * Sets the MDNResults value for this AS2Audit.
     * 
     * @param MDNResults
     */
    public void setMDNResults(java.lang.String MDNResults) {
        this.MDNResults = MDNResults;
    }


    /**
     * Gets the MDNSignAlg value for this AS2Audit.
     * 
     * @return MDNSignAlg
     */
    public java.lang.String getMDNSignAlg() {
        return MDNSignAlg;
    }


    /**
     * Sets the MDNSignAlg value for this AS2Audit.
     * 
     * @param MDNSignAlg
     */
    public void setMDNSignAlg(java.lang.String MDNSignAlg) {
        this.MDNSignAlg = MDNSignAlg;
    }


    /**
     * Gets the MDNSignProt value for this AS2Audit.
     * 
     * @return MDNSignProt
     */
    public java.lang.String getMDNSignProt() {
        return MDNSignProt;
    }


    /**
     * Sets the MDNSignProt value for this AS2Audit.
     * 
     * @param MDNSignProt
     */
    public void setMDNSignProt(java.lang.String MDNSignProt) {
        this.MDNSignProt = MDNSignProt;
    }


    /**
     * Gets the MICDigest value for this AS2Audit.
     * 
     * @return MICDigest
     */
    public java.lang.String getMICDigest() {
        return MICDigest;
    }


    /**
     * Sets the MICDigest value for this AS2Audit.
     * 
     * @param MICDigest
     */
    public void setMICDigest(java.lang.String MICDigest) {
        this.MICDigest = MICDigest;
    }


    /**
     * Gets the asyncMDNURL value for this AS2Audit.
     * 
     * @return asyncMDNURL
     */
    public java.lang.String getAsyncMDNURL() {
        return asyncMDNURL;
    }


    /**
     * Sets the asyncMDNURL value for this AS2Audit.
     * 
     * @param asyncMDNURL
     */
    public void setAsyncMDNURL(java.lang.String asyncMDNURL) {
        this.asyncMDNURL = asyncMDNURL;
    }


    /**
     * Gets the auditID value for this AS2Audit.
     * 
     * @return auditID
     */
    public java.lang.String getAuditID() {
        return auditID;
    }


    /**
     * Sets the auditID value for this AS2Audit.
     * 
     * @param auditID
     */
    public void setAuditID(java.lang.String auditID) {
        this.auditID = auditID;
    }


    /**
     * Gets the compressAlg value for this AS2Audit.
     * 
     * @return compressAlg
     */
    public java.lang.String getCompressAlg() {
        return compressAlg;
    }


    /**
     * Sets the compressAlg value for this AS2Audit.
     * 
     * @param compressAlg
     */
    public void setCompressAlg(java.lang.String compressAlg) {
        this.compressAlg = compressAlg;
    }


    /**
     * Gets the encryptAlg value for this AS2Audit.
     * 
     * @return encryptAlg
     */
    public java.lang.String getEncryptAlg() {
        return encryptAlg;
    }


    /**
     * Sets the encryptAlg value for this AS2Audit.
     * 
     * @param encryptAlg
     */
    public void setEncryptAlg(java.lang.String encryptAlg) {
        this.encryptAlg = encryptAlg;
    }


    /**
     * Gets the fromName value for this AS2Audit.
     * 
     * @return fromName
     */
    public java.lang.String getFromName() {
        return fromName;
    }


    /**
     * Sets the fromName value for this AS2Audit.
     * 
     * @param fromName
     */
    public void setFromName(java.lang.String fromName) {
        this.fromName = fromName;
    }


    /**
     * Gets the messageID value for this AS2Audit.
     * 
     * @return messageID
     */
    public java.lang.String getMessageID() {
        return messageID;
    }


    /**
     * Sets the messageID value for this AS2Audit.
     * 
     * @param messageID
     */
    public void setMessageID(java.lang.String messageID) {
        this.messageID = messageID;
    }


    /**
     * Gets the serverClient value for this AS2Audit.
     * 
     * @return serverClient
     */
    public java.lang.String getServerClient() {
        return serverClient;
    }


    /**
     * Sets the serverClient value for this AS2Audit.
     * 
     * @param serverClient
     */
    public void setServerClient(java.lang.String serverClient) {
        this.serverClient = serverClient;
    }


    /**
     * Gets the signAlg value for this AS2Audit.
     * 
     * @return signAlg
     */
    public java.lang.String getSignAlg() {
        return signAlg;
    }


    /**
     * Sets the signAlg value for this AS2Audit.
     * 
     * @param signAlg
     */
    public void setSignAlg(java.lang.String signAlg) {
        this.signAlg = signAlg;
    }


    /**
     * Gets the timeout value for this AS2Audit.
     * 
     * @return timeout
     */
    public java.lang.String getTimeout() {
        return timeout;
    }


    /**
     * Sets the timeout value for this AS2Audit.
     * 
     * @param timeout
     */
    public void setTimeout(java.lang.String timeout) {
        this.timeout = timeout;
    }


    /**
     * Gets the toName value for this AS2Audit.
     * 
     * @return toName
     */
    public java.lang.String getToName() {
        return toName;
    }


    /**
     * Sets the toName value for this AS2Audit.
     * 
     * @param toName
     */
    public void setToName(java.lang.String toName) {
        this.toName = toName;
    }


    /**
     * Gets the versionIn value for this AS2Audit.
     * 
     * @return versionIn
     */
    public java.lang.String getVersionIn() {
        return versionIn;
    }


    /**
     * Sets the versionIn value for this AS2Audit.
     * 
     * @param versionIn
     */
    public void setVersionIn(java.lang.String versionIn) {
        this.versionIn = versionIn;
    }


    /**
     * Gets the versionOut value for this AS2Audit.
     * 
     * @return versionOut
     */
    public java.lang.String getVersionOut() {
        return versionOut;
    }


    /**
     * Sets the versionOut value for this AS2Audit.
     * 
     * @param versionOut
     */
    public void setVersionOut(java.lang.String versionOut) {
        this.versionOut = versionOut;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AS2Audit)) return false;
        AS2Audit other = (AS2Audit) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.EDIDataType==null && other.getEDIDataType()==null) || 
             (this.EDIDataType!=null &&
              this.EDIDataType.equals(other.getEDIDataType()))) &&
            ((this.MDNContents==null && other.getMDNContents()==null) || 
             (this.MDNContents!=null &&
              java.util.Arrays.equals(this.MDNContents, other.getMDNContents()))) &&
            ((this.MDNHeader==null && other.getMDNHeader()==null) || 
             (this.MDNHeader!=null &&
              java.util.Arrays.equals(this.MDNHeader, other.getMDNHeader()))) &&
            ((this.MDNRequest==null && other.getMDNRequest()==null) || 
             (this.MDNRequest!=null &&
              this.MDNRequest.equals(other.getMDNRequest()))) &&
            ((this.MDNResults==null && other.getMDNResults()==null) || 
             (this.MDNResults!=null &&
              this.MDNResults.equals(other.getMDNResults()))) &&
            ((this.MDNSignAlg==null && other.getMDNSignAlg()==null) || 
             (this.MDNSignAlg!=null &&
              this.MDNSignAlg.equals(other.getMDNSignAlg()))) &&
            ((this.MDNSignProt==null && other.getMDNSignProt()==null) || 
             (this.MDNSignProt!=null &&
              this.MDNSignProt.equals(other.getMDNSignProt()))) &&
            ((this.MICDigest==null && other.getMICDigest()==null) || 
             (this.MICDigest!=null &&
              this.MICDigest.equals(other.getMICDigest()))) &&
            ((this.asyncMDNURL==null && other.getAsyncMDNURL()==null) || 
             (this.asyncMDNURL!=null &&
              this.asyncMDNURL.equals(other.getAsyncMDNURL()))) &&
            ((this.auditID==null && other.getAuditID()==null) || 
             (this.auditID!=null &&
              this.auditID.equals(other.getAuditID()))) &&
            ((this.compressAlg==null && other.getCompressAlg()==null) || 
             (this.compressAlg!=null &&
              this.compressAlg.equals(other.getCompressAlg()))) &&
            ((this.encryptAlg==null && other.getEncryptAlg()==null) || 
             (this.encryptAlg!=null &&
              this.encryptAlg.equals(other.getEncryptAlg()))) &&
            ((this.fromName==null && other.getFromName()==null) || 
             (this.fromName!=null &&
              this.fromName.equals(other.getFromName()))) &&
            ((this.messageID==null && other.getMessageID()==null) || 
             (this.messageID!=null &&
              this.messageID.equals(other.getMessageID()))) &&
            ((this.serverClient==null && other.getServerClient()==null) || 
             (this.serverClient!=null &&
              this.serverClient.equals(other.getServerClient()))) &&
            ((this.signAlg==null && other.getSignAlg()==null) || 
             (this.signAlg!=null &&
              this.signAlg.equals(other.getSignAlg()))) &&
            ((this.timeout==null && other.getTimeout()==null) || 
             (this.timeout!=null &&
              this.timeout.equals(other.getTimeout()))) &&
            ((this.toName==null && other.getToName()==null) || 
             (this.toName!=null &&
              this.toName.equals(other.getToName()))) &&
            ((this.versionIn==null && other.getVersionIn()==null) || 
             (this.versionIn!=null &&
              this.versionIn.equals(other.getVersionIn()))) &&
            ((this.versionOut==null && other.getVersionOut()==null) || 
             (this.versionOut!=null &&
              this.versionOut.equals(other.getVersionOut())));
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
        if (getEDIDataType() != null) {
            _hashCode += getEDIDataType().hashCode();
        }
        if (getMDNContents() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMDNContents());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMDNContents(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMDNHeader() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMDNHeader());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMDNHeader(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMDNRequest() != null) {
            _hashCode += getMDNRequest().hashCode();
        }
        if (getMDNResults() != null) {
            _hashCode += getMDNResults().hashCode();
        }
        if (getMDNSignAlg() != null) {
            _hashCode += getMDNSignAlg().hashCode();
        }
        if (getMDNSignProt() != null) {
            _hashCode += getMDNSignProt().hashCode();
        }
        if (getMICDigest() != null) {
            _hashCode += getMICDigest().hashCode();
        }
        if (getAsyncMDNURL() != null) {
            _hashCode += getAsyncMDNURL().hashCode();
        }
        if (getAuditID() != null) {
            _hashCode += getAuditID().hashCode();
        }
        if (getCompressAlg() != null) {
            _hashCode += getCompressAlg().hashCode();
        }
        if (getEncryptAlg() != null) {
            _hashCode += getEncryptAlg().hashCode();
        }
        if (getFromName() != null) {
            _hashCode += getFromName().hashCode();
        }
        if (getMessageID() != null) {
            _hashCode += getMessageID().hashCode();
        }
        if (getServerClient() != null) {
            _hashCode += getServerClient().hashCode();
        }
        if (getSignAlg() != null) {
            _hashCode += getSignAlg().hashCode();
        }
        if (getTimeout() != null) {
            _hashCode += getTimeout().hashCode();
        }
        if (getToName() != null) {
            _hashCode += getToName().hashCode();
        }
        if (getVersionIn() != null) {
            _hashCode += getVersionIn().hashCode();
        }
        if (getVersionOut() != null) {
            _hashCode += getVersionOut().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AS2Audit.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:AdministratorService", "AS2Audit"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EDIDataType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EDIDataType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MDNContents");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MDNContents"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MDNHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MDNHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MDNRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MDNRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MDNResults");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MDNResults"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MDNSignAlg");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MDNSignAlg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MDNSignProt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MDNSignProt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MICDigest");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MICDigest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("asyncMDNURL");
        elemField.setXmlName(new javax.xml.namespace.QName("", "asyncMDNURL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("auditID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "auditID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("compressAlg");
        elemField.setXmlName(new javax.xml.namespace.QName("", "compressAlg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("encryptAlg");
        elemField.setXmlName(new javax.xml.namespace.QName("", "encryptAlg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fromName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fromName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messageID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "messageID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serverClient");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serverClient"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signAlg");
        elemField.setXmlName(new javax.xml.namespace.QName("", "signAlg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeout");
        elemField.setXmlName(new javax.xml.namespace.QName("", "timeout"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "toName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("versionIn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "versionIn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("versionOut");
        elemField.setXmlName(new javax.xml.namespace.QName("", "versionOut"));
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
