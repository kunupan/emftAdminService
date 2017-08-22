/**
 * UserProfile.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 11, 2014 (12:11:36 EDT) WSDL2Java emitter.
 */

package AdminClient;

public class UserProfile  implements java.io.Serializable {
    private java.lang.String idName;

    private java.lang.String idType;

    private java.lang.String nodeName;

    private java.lang.String remotePassword;

    private java.lang.String remoteUserId;

    private java.lang.String remoteUserNTDomain;

    public UserProfile() {
    }

    public UserProfile(
           java.lang.String idName,
           java.lang.String idType,
           java.lang.String nodeName,
           java.lang.String remotePassword,
           java.lang.String remoteUserId,
           java.lang.String remoteUserNTDomain) {
           this.idName = idName;
           this.idType = idType;
           this.nodeName = nodeName;
           this.remotePassword = remotePassword;
           this.remoteUserId = remoteUserId;
           this.remoteUserNTDomain = remoteUserNTDomain;
    }


    /**
     * Gets the idName value for this UserProfile.
     * 
     * @return idName
     */
    public java.lang.String getIdName() {
        return idName;
    }


    /**
     * Sets the idName value for this UserProfile.
     * 
     * @param idName
     */
    public void setIdName(java.lang.String idName) {
        this.idName = idName;
    }


    /**
     * Gets the idType value for this UserProfile.
     * 
     * @return idType
     */
    public java.lang.String getIdType() {
        return idType;
    }


    /**
     * Sets the idType value for this UserProfile.
     * 
     * @param idType
     */
    public void setIdType(java.lang.String idType) {
        this.idType = idType;
    }


    /**
     * Gets the nodeName value for this UserProfile.
     * 
     * @return nodeName
     */
    public java.lang.String getNodeName() {
        return nodeName;
    }


    /**
     * Sets the nodeName value for this UserProfile.
     * 
     * @param nodeName
     */
    public void setNodeName(java.lang.String nodeName) {
        this.nodeName = nodeName;
    }


    /**
     * Gets the remotePassword value for this UserProfile.
     * 
     * @return remotePassword
     */
    public java.lang.String getRemotePassword() {
        return remotePassword;
    }


    /**
     * Sets the remotePassword value for this UserProfile.
     * 
     * @param remotePassword
     */
    public void setRemotePassword(java.lang.String remotePassword) {
        this.remotePassword = remotePassword;
    }


    /**
     * Gets the remoteUserId value for this UserProfile.
     * 
     * @return remoteUserId
     */
    public java.lang.String getRemoteUserId() {
        return remoteUserId;
    }


    /**
     * Sets the remoteUserId value for this UserProfile.
     * 
     * @param remoteUserId
     */
    public void setRemoteUserId(java.lang.String remoteUserId) {
        this.remoteUserId = remoteUserId;
    }


    /**
     * Gets the remoteUserNTDomain value for this UserProfile.
     * 
     * @return remoteUserNTDomain
     */
    public java.lang.String getRemoteUserNTDomain() {
        return remoteUserNTDomain;
    }


    /**
     * Sets the remoteUserNTDomain value for this UserProfile.
     * 
     * @param remoteUserNTDomain
     */
    public void setRemoteUserNTDomain(java.lang.String remoteUserNTDomain) {
        this.remoteUserNTDomain = remoteUserNTDomain;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserProfile)) return false;
        UserProfile other = (UserProfile) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.idName==null && other.getIdName()==null) || 
             (this.idName!=null &&
              this.idName.equals(other.getIdName()))) &&
            ((this.idType==null && other.getIdType()==null) || 
             (this.idType!=null &&
              this.idType.equals(other.getIdType()))) &&
            ((this.nodeName==null && other.getNodeName()==null) || 
             (this.nodeName!=null &&
              this.nodeName.equals(other.getNodeName()))) &&
            ((this.remotePassword==null && other.getRemotePassword()==null) || 
             (this.remotePassword!=null &&
              this.remotePassword.equals(other.getRemotePassword()))) &&
            ((this.remoteUserId==null && other.getRemoteUserId()==null) || 
             (this.remoteUserId!=null &&
              this.remoteUserId.equals(other.getRemoteUserId()))) &&
            ((this.remoteUserNTDomain==null && other.getRemoteUserNTDomain()==null) || 
             (this.remoteUserNTDomain!=null &&
              this.remoteUserNTDomain.equals(other.getRemoteUserNTDomain())));
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
        if (getIdName() != null) {
            _hashCode += getIdName().hashCode();
        }
        if (getIdType() != null) {
            _hashCode += getIdType().hashCode();
        }
        if (getNodeName() != null) {
            _hashCode += getNodeName().hashCode();
        }
        if (getRemotePassword() != null) {
            _hashCode += getRemotePassword().hashCode();
        }
        if (getRemoteUserId() != null) {
            _hashCode += getRemoteUserId().hashCode();
        }
        if (getRemoteUserNTDomain() != null) {
            _hashCode += getRemoteUserNTDomain().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UserProfile.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:AdministratorService", "UserProfile"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idType"));
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
        elemField.setFieldName("remotePassword");
        elemField.setXmlName(new javax.xml.namespace.QName("", "remotePassword"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remoteUserId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "remoteUserId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remoteUserNTDomain");
        elemField.setXmlName(new javax.xml.namespace.QName("", "remoteUserNTDomain"));
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
