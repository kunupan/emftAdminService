/**
 * SshServerConfig.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 11, 2014 (12:11:36 EDT) WSDL2Java emitter.
 */

package AdminClient;

public class SshServerConfig  implements java.io.Serializable {
    private java.lang.String SSHPrivKey;

    private java.lang.String alias;

    private java.lang.String bindIPAddress;

    private java.lang.String enabled;

    private java.lang.String hostName;

    private java.lang.String keyFlag;

    private java.lang.String keyPwd;

    private java.lang.String keystore;

    private java.lang.String keystorePwd;

    private java.lang.String port;

    private java.lang.String rsaAlias;

    private java.lang.String rsaKeyPwd;

    private java.lang.String rsaKeystore;

    private java.lang.String rsaKeystorePwd;

    private java.lang.String welcomeMessage;

    public SshServerConfig() {
    }

    public SshServerConfig(
           java.lang.String SSHPrivKey,
           java.lang.String alias,
           java.lang.String bindIPAddress,
           java.lang.String enabled,
           java.lang.String hostName,
           java.lang.String keyFlag,
           java.lang.String keyPwd,
           java.lang.String keystore,
           java.lang.String keystorePwd,
           java.lang.String port,
           java.lang.String rsaAlias,
           java.lang.String rsaKeyPwd,
           java.lang.String rsaKeystore,
           java.lang.String rsaKeystorePwd,
           java.lang.String welcomeMessage) {
           this.SSHPrivKey = SSHPrivKey;
           this.alias = alias;
           this.bindIPAddress = bindIPAddress;
           this.enabled = enabled;
           this.hostName = hostName;
           this.keyFlag = keyFlag;
           this.keyPwd = keyPwd;
           this.keystore = keystore;
           this.keystorePwd = keystorePwd;
           this.port = port;
           this.rsaAlias = rsaAlias;
           this.rsaKeyPwd = rsaKeyPwd;
           this.rsaKeystore = rsaKeystore;
           this.rsaKeystorePwd = rsaKeystorePwd;
           this.welcomeMessage = welcomeMessage;
    }


    /**
     * Gets the SSHPrivKey value for this SshServerConfig.
     * 
     * @return SSHPrivKey
     */
    public java.lang.String getSSHPrivKey() {
        return SSHPrivKey;
    }


    /**
     * Sets the SSHPrivKey value for this SshServerConfig.
     * 
     * @param SSHPrivKey
     */
    public void setSSHPrivKey(java.lang.String SSHPrivKey) {
        this.SSHPrivKey = SSHPrivKey;
    }


    /**
     * Gets the alias value for this SshServerConfig.
     * 
     * @return alias
     */
    public java.lang.String getAlias() {
        return alias;
    }


    /**
     * Sets the alias value for this SshServerConfig.
     * 
     * @param alias
     */
    public void setAlias(java.lang.String alias) {
        this.alias = alias;
    }


    /**
     * Gets the bindIPAddress value for this SshServerConfig.
     * 
     * @return bindIPAddress
     */
    public java.lang.String getBindIPAddress() {
        return bindIPAddress;
    }


    /**
     * Sets the bindIPAddress value for this SshServerConfig.
     * 
     * @param bindIPAddress
     */
    public void setBindIPAddress(java.lang.String bindIPAddress) {
        this.bindIPAddress = bindIPAddress;
    }


    /**
     * Gets the enabled value for this SshServerConfig.
     * 
     * @return enabled
     */
    public java.lang.String getEnabled() {
        return enabled;
    }


    /**
     * Sets the enabled value for this SshServerConfig.
     * 
     * @param enabled
     */
    public void setEnabled(java.lang.String enabled) {
        this.enabled = enabled;
    }


    /**
     * Gets the hostName value for this SshServerConfig.
     * 
     * @return hostName
     */
    public java.lang.String getHostName() {
        return hostName;
    }


    /**
     * Sets the hostName value for this SshServerConfig.
     * 
     * @param hostName
     */
    public void setHostName(java.lang.String hostName) {
        this.hostName = hostName;
    }


    /**
     * Gets the keyFlag value for this SshServerConfig.
     * 
     * @return keyFlag
     */
    public java.lang.String getKeyFlag() {
        return keyFlag;
    }


    /**
     * Sets the keyFlag value for this SshServerConfig.
     * 
     * @param keyFlag
     */
    public void setKeyFlag(java.lang.String keyFlag) {
        this.keyFlag = keyFlag;
    }


    /**
     * Gets the keyPwd value for this SshServerConfig.
     * 
     * @return keyPwd
     */
    public java.lang.String getKeyPwd() {
        return keyPwd;
    }


    /**
     * Sets the keyPwd value for this SshServerConfig.
     * 
     * @param keyPwd
     */
    public void setKeyPwd(java.lang.String keyPwd) {
        this.keyPwd = keyPwd;
    }


    /**
     * Gets the keystore value for this SshServerConfig.
     * 
     * @return keystore
     */
    public java.lang.String getKeystore() {
        return keystore;
    }


    /**
     * Sets the keystore value for this SshServerConfig.
     * 
     * @param keystore
     */
    public void setKeystore(java.lang.String keystore) {
        this.keystore = keystore;
    }


    /**
     * Gets the keystorePwd value for this SshServerConfig.
     * 
     * @return keystorePwd
     */
    public java.lang.String getKeystorePwd() {
        return keystorePwd;
    }


    /**
     * Sets the keystorePwd value for this SshServerConfig.
     * 
     * @param keystorePwd
     */
    public void setKeystorePwd(java.lang.String keystorePwd) {
        this.keystorePwd = keystorePwd;
    }


    /**
     * Gets the port value for this SshServerConfig.
     * 
     * @return port
     */
    public java.lang.String getPort() {
        return port;
    }


    /**
     * Sets the port value for this SshServerConfig.
     * 
     * @param port
     */
    public void setPort(java.lang.String port) {
        this.port = port;
    }


    /**
     * Gets the rsaAlias value for this SshServerConfig.
     * 
     * @return rsaAlias
     */
    public java.lang.String getRsaAlias() {
        return rsaAlias;
    }


    /**
     * Sets the rsaAlias value for this SshServerConfig.
     * 
     * @param rsaAlias
     */
    public void setRsaAlias(java.lang.String rsaAlias) {
        this.rsaAlias = rsaAlias;
    }


    /**
     * Gets the rsaKeyPwd value for this SshServerConfig.
     * 
     * @return rsaKeyPwd
     */
    public java.lang.String getRsaKeyPwd() {
        return rsaKeyPwd;
    }


    /**
     * Sets the rsaKeyPwd value for this SshServerConfig.
     * 
     * @param rsaKeyPwd
     */
    public void setRsaKeyPwd(java.lang.String rsaKeyPwd) {
        this.rsaKeyPwd = rsaKeyPwd;
    }


    /**
     * Gets the rsaKeystore value for this SshServerConfig.
     * 
     * @return rsaKeystore
     */
    public java.lang.String getRsaKeystore() {
        return rsaKeystore;
    }


    /**
     * Sets the rsaKeystore value for this SshServerConfig.
     * 
     * @param rsaKeystore
     */
    public void setRsaKeystore(java.lang.String rsaKeystore) {
        this.rsaKeystore = rsaKeystore;
    }


    /**
     * Gets the rsaKeystorePwd value for this SshServerConfig.
     * 
     * @return rsaKeystorePwd
     */
    public java.lang.String getRsaKeystorePwd() {
        return rsaKeystorePwd;
    }


    /**
     * Sets the rsaKeystorePwd value for this SshServerConfig.
     * 
     * @param rsaKeystorePwd
     */
    public void setRsaKeystorePwd(java.lang.String rsaKeystorePwd) {
        this.rsaKeystorePwd = rsaKeystorePwd;
    }


    /**
     * Gets the welcomeMessage value for this SshServerConfig.
     * 
     * @return welcomeMessage
     */
    public java.lang.String getWelcomeMessage() {
        return welcomeMessage;
    }


    /**
     * Sets the welcomeMessage value for this SshServerConfig.
     * 
     * @param welcomeMessage
     */
    public void setWelcomeMessage(java.lang.String welcomeMessage) {
        this.welcomeMessage = welcomeMessage;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SshServerConfig)) return false;
        SshServerConfig other = (SshServerConfig) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.SSHPrivKey==null && other.getSSHPrivKey()==null) || 
             (this.SSHPrivKey!=null &&
              this.SSHPrivKey.equals(other.getSSHPrivKey()))) &&
            ((this.alias==null && other.getAlias()==null) || 
             (this.alias!=null &&
              this.alias.equals(other.getAlias()))) &&
            ((this.bindIPAddress==null && other.getBindIPAddress()==null) || 
             (this.bindIPAddress!=null &&
              this.bindIPAddress.equals(other.getBindIPAddress()))) &&
            ((this.enabled==null && other.getEnabled()==null) || 
             (this.enabled!=null &&
              this.enabled.equals(other.getEnabled()))) &&
            ((this.hostName==null && other.getHostName()==null) || 
             (this.hostName!=null &&
              this.hostName.equals(other.getHostName()))) &&
            ((this.keyFlag==null && other.getKeyFlag()==null) || 
             (this.keyFlag!=null &&
              this.keyFlag.equals(other.getKeyFlag()))) &&
            ((this.keyPwd==null && other.getKeyPwd()==null) || 
             (this.keyPwd!=null &&
              this.keyPwd.equals(other.getKeyPwd()))) &&
            ((this.keystore==null && other.getKeystore()==null) || 
             (this.keystore!=null &&
              this.keystore.equals(other.getKeystore()))) &&
            ((this.keystorePwd==null && other.getKeystorePwd()==null) || 
             (this.keystorePwd!=null &&
              this.keystorePwd.equals(other.getKeystorePwd()))) &&
            ((this.port==null && other.getPort()==null) || 
             (this.port!=null &&
              this.port.equals(other.getPort()))) &&
            ((this.rsaAlias==null && other.getRsaAlias()==null) || 
             (this.rsaAlias!=null &&
              this.rsaAlias.equals(other.getRsaAlias()))) &&
            ((this.rsaKeyPwd==null && other.getRsaKeyPwd()==null) || 
             (this.rsaKeyPwd!=null &&
              this.rsaKeyPwd.equals(other.getRsaKeyPwd()))) &&
            ((this.rsaKeystore==null && other.getRsaKeystore()==null) || 
             (this.rsaKeystore!=null &&
              this.rsaKeystore.equals(other.getRsaKeystore()))) &&
            ((this.rsaKeystorePwd==null && other.getRsaKeystorePwd()==null) || 
             (this.rsaKeystorePwd!=null &&
              this.rsaKeystorePwd.equals(other.getRsaKeystorePwd()))) &&
            ((this.welcomeMessage==null && other.getWelcomeMessage()==null) || 
             (this.welcomeMessage!=null &&
              this.welcomeMessage.equals(other.getWelcomeMessage())));
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
        if (getSSHPrivKey() != null) {
            _hashCode += getSSHPrivKey().hashCode();
        }
        if (getAlias() != null) {
            _hashCode += getAlias().hashCode();
        }
        if (getBindIPAddress() != null) {
            _hashCode += getBindIPAddress().hashCode();
        }
        if (getEnabled() != null) {
            _hashCode += getEnabled().hashCode();
        }
        if (getHostName() != null) {
            _hashCode += getHostName().hashCode();
        }
        if (getKeyFlag() != null) {
            _hashCode += getKeyFlag().hashCode();
        }
        if (getKeyPwd() != null) {
            _hashCode += getKeyPwd().hashCode();
        }
        if (getKeystore() != null) {
            _hashCode += getKeystore().hashCode();
        }
        if (getKeystorePwd() != null) {
            _hashCode += getKeystorePwd().hashCode();
        }
        if (getPort() != null) {
            _hashCode += getPort().hashCode();
        }
        if (getRsaAlias() != null) {
            _hashCode += getRsaAlias().hashCode();
        }
        if (getRsaKeyPwd() != null) {
            _hashCode += getRsaKeyPwd().hashCode();
        }
        if (getRsaKeystore() != null) {
            _hashCode += getRsaKeystore().hashCode();
        }
        if (getRsaKeystorePwd() != null) {
            _hashCode += getRsaKeystorePwd().hashCode();
        }
        if (getWelcomeMessage() != null) {
            _hashCode += getWelcomeMessage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SshServerConfig.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:AdministratorService", "SshServerConfig"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SSHPrivKey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SSHPrivKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alias");
        elemField.setXmlName(new javax.xml.namespace.QName("", "alias"));
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
        elemField.setFieldName("enabled");
        elemField.setXmlName(new javax.xml.namespace.QName("", "enabled"));
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
        elemField.setFieldName("keyFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "keyFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keyPwd");
        elemField.setXmlName(new javax.xml.namespace.QName("", "keyPwd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keystore");
        elemField.setXmlName(new javax.xml.namespace.QName("", "keystore"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keystorePwd");
        elemField.setXmlName(new javax.xml.namespace.QName("", "keystorePwd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("port");
        elemField.setXmlName(new javax.xml.namespace.QName("", "port"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rsaAlias");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rsaAlias"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rsaKeyPwd");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rsaKeyPwd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rsaKeystore");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rsaKeystore"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rsaKeystorePwd");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rsaKeystorePwd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("welcomeMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "welcomeMessage"));
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
