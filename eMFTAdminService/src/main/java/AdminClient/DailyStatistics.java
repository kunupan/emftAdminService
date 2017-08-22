/**
 * DailyStatistics.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 11, 2014 (12:11:36 EDT) WSDL2Java emitter.
 */

package AdminClient;

public class DailyStatistics  implements java.io.Serializable {
    private java.lang.String failedTransfers;

    private AdminClient.LicenseKey[] licenseKeys;

    private java.lang.String maxUsers;

    private java.lang.String maxUsersOD;

    private AdminClient.Config statFrmCfg;

    private java.lang.String successTransfers;

    private java.lang.String weeklyFailedTransfers;

    private java.lang.String weeklySuccessTransfers;

    public DailyStatistics() {
    }

    public DailyStatistics(
           java.lang.String failedTransfers,
           AdminClient.LicenseKey[] licenseKeys,
           java.lang.String maxUsers,
           java.lang.String maxUsersOD,
           AdminClient.Config statFrmCfg,
           java.lang.String successTransfers,
           java.lang.String weeklyFailedTransfers,
           java.lang.String weeklySuccessTransfers) {
           this.failedTransfers = failedTransfers;
           this.licenseKeys = licenseKeys;
           this.maxUsers = maxUsers;
           this.maxUsersOD = maxUsersOD;
           this.statFrmCfg = statFrmCfg;
           this.successTransfers = successTransfers;
           this.weeklyFailedTransfers = weeklyFailedTransfers;
           this.weeklySuccessTransfers = weeklySuccessTransfers;
    }


    /**
     * Gets the failedTransfers value for this DailyStatistics.
     * 
     * @return failedTransfers
     */
    public java.lang.String getFailedTransfers() {
        return failedTransfers;
    }


    /**
     * Sets the failedTransfers value for this DailyStatistics.
     * 
     * @param failedTransfers
     */
    public void setFailedTransfers(java.lang.String failedTransfers) {
        this.failedTransfers = failedTransfers;
    }


    /**
     * Gets the licenseKeys value for this DailyStatistics.
     * 
     * @return licenseKeys
     */
    public AdminClient.LicenseKey[] getLicenseKeys() {
        return licenseKeys;
    }


    /**
     * Sets the licenseKeys value for this DailyStatistics.
     * 
     * @param licenseKeys
     */
    public void setLicenseKeys(AdminClient.LicenseKey[] licenseKeys) {
        this.licenseKeys = licenseKeys;
    }


    /**
     * Gets the maxUsers value for this DailyStatistics.
     * 
     * @return maxUsers
     */
    public java.lang.String getMaxUsers() {
        return maxUsers;
    }


    /**
     * Sets the maxUsers value for this DailyStatistics.
     * 
     * @param maxUsers
     */
    public void setMaxUsers(java.lang.String maxUsers) {
        this.maxUsers = maxUsers;
    }


    /**
     * Gets the maxUsersOD value for this DailyStatistics.
     * 
     * @return maxUsersOD
     */
    public java.lang.String getMaxUsersOD() {
        return maxUsersOD;
    }


    /**
     * Sets the maxUsersOD value for this DailyStatistics.
     * 
     * @param maxUsersOD
     */
    public void setMaxUsersOD(java.lang.String maxUsersOD) {
        this.maxUsersOD = maxUsersOD;
    }


    /**
     * Gets the statFrmCfg value for this DailyStatistics.
     * 
     * @return statFrmCfg
     */
    public AdminClient.Config getStatFrmCfg() {
        return statFrmCfg;
    }


    /**
     * Sets the statFrmCfg value for this DailyStatistics.
     * 
     * @param statFrmCfg
     */
    public void setStatFrmCfg(AdminClient.Config statFrmCfg) {
        this.statFrmCfg = statFrmCfg;
    }


    /**
     * Gets the successTransfers value for this DailyStatistics.
     * 
     * @return successTransfers
     */
    public java.lang.String getSuccessTransfers() {
        return successTransfers;
    }


    /**
     * Sets the successTransfers value for this DailyStatistics.
     * 
     * @param successTransfers
     */
    public void setSuccessTransfers(java.lang.String successTransfers) {
        this.successTransfers = successTransfers;
    }


    /**
     * Gets the weeklyFailedTransfers value for this DailyStatistics.
     * 
     * @return weeklyFailedTransfers
     */
    public java.lang.String getWeeklyFailedTransfers() {
        return weeklyFailedTransfers;
    }


    /**
     * Sets the weeklyFailedTransfers value for this DailyStatistics.
     * 
     * @param weeklyFailedTransfers
     */
    public void setWeeklyFailedTransfers(java.lang.String weeklyFailedTransfers) {
        this.weeklyFailedTransfers = weeklyFailedTransfers;
    }


    /**
     * Gets the weeklySuccessTransfers value for this DailyStatistics.
     * 
     * @return weeklySuccessTransfers
     */
    public java.lang.String getWeeklySuccessTransfers() {
        return weeklySuccessTransfers;
    }


    /**
     * Sets the weeklySuccessTransfers value for this DailyStatistics.
     * 
     * @param weeklySuccessTransfers
     */
    public void setWeeklySuccessTransfers(java.lang.String weeklySuccessTransfers) {
        this.weeklySuccessTransfers = weeklySuccessTransfers;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DailyStatistics)) return false;
        DailyStatistics other = (DailyStatistics) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.failedTransfers==null && other.getFailedTransfers()==null) || 
             (this.failedTransfers!=null &&
              this.failedTransfers.equals(other.getFailedTransfers()))) &&
            ((this.licenseKeys==null && other.getLicenseKeys()==null) || 
             (this.licenseKeys!=null &&
              java.util.Arrays.equals(this.licenseKeys, other.getLicenseKeys()))) &&
            ((this.maxUsers==null && other.getMaxUsers()==null) || 
             (this.maxUsers!=null &&
              this.maxUsers.equals(other.getMaxUsers()))) &&
            ((this.maxUsersOD==null && other.getMaxUsersOD()==null) || 
             (this.maxUsersOD!=null &&
              this.maxUsersOD.equals(other.getMaxUsersOD()))) &&
            ((this.statFrmCfg==null && other.getStatFrmCfg()==null) || 
             (this.statFrmCfg!=null &&
              this.statFrmCfg.equals(other.getStatFrmCfg()))) &&
            ((this.successTransfers==null && other.getSuccessTransfers()==null) || 
             (this.successTransfers!=null &&
              this.successTransfers.equals(other.getSuccessTransfers()))) &&
            ((this.weeklyFailedTransfers==null && other.getWeeklyFailedTransfers()==null) || 
             (this.weeklyFailedTransfers!=null &&
              this.weeklyFailedTransfers.equals(other.getWeeklyFailedTransfers()))) &&
            ((this.weeklySuccessTransfers==null && other.getWeeklySuccessTransfers()==null) || 
             (this.weeklySuccessTransfers!=null &&
              this.weeklySuccessTransfers.equals(other.getWeeklySuccessTransfers())));
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
        if (getFailedTransfers() != null) {
            _hashCode += getFailedTransfers().hashCode();
        }
        if (getLicenseKeys() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLicenseKeys());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLicenseKeys(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMaxUsers() != null) {
            _hashCode += getMaxUsers().hashCode();
        }
        if (getMaxUsersOD() != null) {
            _hashCode += getMaxUsersOD().hashCode();
        }
        if (getStatFrmCfg() != null) {
            _hashCode += getStatFrmCfg().hashCode();
        }
        if (getSuccessTransfers() != null) {
            _hashCode += getSuccessTransfers().hashCode();
        }
        if (getWeeklyFailedTransfers() != null) {
            _hashCode += getWeeklyFailedTransfers().hashCode();
        }
        if (getWeeklySuccessTransfers() != null) {
            _hashCode += getWeeklySuccessTransfers().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DailyStatistics.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:AdministratorService", "DailyStatistics"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("failedTransfers");
        elemField.setXmlName(new javax.xml.namespace.QName("", "failedTransfers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("licenseKeys");
        elemField.setXmlName(new javax.xml.namespace.QName("", "licenseKeys"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:AdministratorService", "LicenseKey"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxUsers");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxUsers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxUsersOD");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxUsersOD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statFrmCfg");
        elemField.setXmlName(new javax.xml.namespace.QName("", "statFrmCfg"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:AdministratorService", "Config"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("successTransfers");
        elemField.setXmlName(new javax.xml.namespace.QName("", "successTransfers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("weeklyFailedTransfers");
        elemField.setXmlName(new javax.xml.namespace.QName("", "weeklyFailedTransfers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("weeklySuccessTransfers");
        elemField.setXmlName(new javax.xml.namespace.QName("", "weeklySuccessTransfers"));
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
