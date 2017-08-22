/**
 * ServerStatusConfig.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 11, 2014 (12:11:36 EDT) WSDL2Java emitter.
 */

package AdminClient;

public class ServerStatusConfig  implements java.io.Serializable {
    private java.lang.String checkInterval;

    private java.lang.String emailAddress;

    private java.lang.String enabled;

    private java.lang.String hostName;

    private java.lang.String logStatusCheck;

    public ServerStatusConfig() {
    }

    public ServerStatusConfig(
           java.lang.String checkInterval,
           java.lang.String emailAddress,
           java.lang.String enabled,
           java.lang.String hostName,
           java.lang.String logStatusCheck) {
           this.checkInterval = checkInterval;
           this.emailAddress = emailAddress;
           this.enabled = enabled;
           this.hostName = hostName;
           this.logStatusCheck = logStatusCheck;
    }


    /**
     * Gets the checkInterval value for this ServerStatusConfig.
     * 
     * @return checkInterval
     */
    public java.lang.String getCheckInterval() {
        return checkInterval;
    }


    /**
     * Sets the checkInterval value for this ServerStatusConfig.
     * 
     * @param checkInterval
     */
    public void setCheckInterval(java.lang.String checkInterval) {
        this.checkInterval = checkInterval;
    }


    /**
     * Gets the emailAddress value for this ServerStatusConfig.
     * 
     * @return emailAddress
     */
    public java.lang.String getEmailAddress() {
        return emailAddress;
    }


    /**
     * Sets the emailAddress value for this ServerStatusConfig.
     * 
     * @param emailAddress
     */
    public void setEmailAddress(java.lang.String emailAddress) {
        this.emailAddress = emailAddress;
    }


    /**
     * Gets the enabled value for this ServerStatusConfig.
     * 
     * @return enabled
     */
    public java.lang.String getEnabled() {
        return enabled;
    }


    /**
     * Sets the enabled value for this ServerStatusConfig.
     * 
     * @param enabled
     */
    public void setEnabled(java.lang.String enabled) {
        this.enabled = enabled;
    }


    /**
     * Gets the hostName value for this ServerStatusConfig.
     * 
     * @return hostName
     */
    public java.lang.String getHostName() {
        return hostName;
    }


    /**
     * Sets the hostName value for this ServerStatusConfig.
     * 
     * @param hostName
     */
    public void setHostName(java.lang.String hostName) {
        this.hostName = hostName;
    }


    /**
     * Gets the logStatusCheck value for this ServerStatusConfig.
     * 
     * @return logStatusCheck
     */
    public java.lang.String getLogStatusCheck() {
        return logStatusCheck;
    }


    /**
     * Sets the logStatusCheck value for this ServerStatusConfig.
     * 
     * @param logStatusCheck
     */
    public void setLogStatusCheck(java.lang.String logStatusCheck) {
        this.logStatusCheck = logStatusCheck;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ServerStatusConfig)) return false;
        ServerStatusConfig other = (ServerStatusConfig) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.checkInterval==null && other.getCheckInterval()==null) || 
             (this.checkInterval!=null &&
              this.checkInterval.equals(other.getCheckInterval()))) &&
            ((this.emailAddress==null && other.getEmailAddress()==null) || 
             (this.emailAddress!=null &&
              this.emailAddress.equals(other.getEmailAddress()))) &&
            ((this.enabled==null && other.getEnabled()==null) || 
             (this.enabled!=null &&
              this.enabled.equals(other.getEnabled()))) &&
            ((this.hostName==null && other.getHostName()==null) || 
             (this.hostName!=null &&
              this.hostName.equals(other.getHostName()))) &&
            ((this.logStatusCheck==null && other.getLogStatusCheck()==null) || 
             (this.logStatusCheck!=null &&
              this.logStatusCheck.equals(other.getLogStatusCheck())));
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
        if (getCheckInterval() != null) {
            _hashCode += getCheckInterval().hashCode();
        }
        if (getEmailAddress() != null) {
            _hashCode += getEmailAddress().hashCode();
        }
        if (getEnabled() != null) {
            _hashCode += getEnabled().hashCode();
        }
        if (getHostName() != null) {
            _hashCode += getHostName().hashCode();
        }
        if (getLogStatusCheck() != null) {
            _hashCode += getLogStatusCheck().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ServerStatusConfig.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:AdministratorService", "ServerStatusConfig"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("checkInterval");
        elemField.setXmlName(new javax.xml.namespace.QName("", "checkInterval"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "emailAddress"));
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
        elemField.setFieldName("logStatusCheck");
        elemField.setXmlName(new javax.xml.namespace.QName("", "logStatusCheck"));
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
