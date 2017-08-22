/**
 * Session.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 11, 2014 (12:11:36 EDT) WSDL2Java emitter.
 */

package AdminClient;

public class Session  implements java.io.Serializable {
    private java.lang.String addTerminatingNull;

    private java.lang.String remoteIPAddress;

    private java.lang.String sessionID;

    private AdminClient.DateTime sessionIDDate;

    private java.lang.String userID;

    public Session() {
    }

    public Session(
           java.lang.String addTerminatingNull,
           java.lang.String remoteIPAddress,
           java.lang.String sessionID,
           AdminClient.DateTime sessionIDDate,
           java.lang.String userID) {
           this.addTerminatingNull = addTerminatingNull;
           this.remoteIPAddress = remoteIPAddress;
           this.sessionID = sessionID;
           this.sessionIDDate = sessionIDDate;
           this.userID = userID;
    }


    /**
     * Gets the addTerminatingNull value for this Session.
     * 
     * @return addTerminatingNull
     */
    public java.lang.String getAddTerminatingNull() {
        return addTerminatingNull;
    }


    /**
     * Sets the addTerminatingNull value for this Session.
     * 
     * @param addTerminatingNull
     */
    public void setAddTerminatingNull(java.lang.String addTerminatingNull) {
        this.addTerminatingNull = addTerminatingNull;
    }


    /**
     * Gets the remoteIPAddress value for this Session.
     * 
     * @return remoteIPAddress
     */
    public java.lang.String getRemoteIPAddress() {
        return remoteIPAddress;
    }


    /**
     * Sets the remoteIPAddress value for this Session.
     * 
     * @param remoteIPAddress
     */
    public void setRemoteIPAddress(java.lang.String remoteIPAddress) {
        this.remoteIPAddress = remoteIPAddress;
    }


    /**
     * Gets the sessionID value for this Session.
     * 
     * @return sessionID
     */
    public java.lang.String getSessionID() {
        return sessionID;
    }


    /**
     * Sets the sessionID value for this Session.
     * 
     * @param sessionID
     */
    public void setSessionID(java.lang.String sessionID) {
        this.sessionID = sessionID;
    }


    /**
     * Gets the sessionIDDate value for this Session.
     * 
     * @return sessionIDDate
     */
    public AdminClient.DateTime getSessionIDDate() {
        return sessionIDDate;
    }


    /**
     * Sets the sessionIDDate value for this Session.
     * 
     * @param sessionIDDate
     */
    public void setSessionIDDate(AdminClient.DateTime sessionIDDate) {
        this.sessionIDDate = sessionIDDate;
    }


    /**
     * Gets the userID value for this Session.
     * 
     * @return userID
     */
    public java.lang.String getUserID() {
        return userID;
    }


    /**
     * Sets the userID value for this Session.
     * 
     * @param userID
     */
    public void setUserID(java.lang.String userID) {
        this.userID = userID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Session)) return false;
        Session other = (Session) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.addTerminatingNull==null && other.getAddTerminatingNull()==null) || 
             (this.addTerminatingNull!=null &&
              this.addTerminatingNull.equals(other.getAddTerminatingNull()))) &&
            ((this.remoteIPAddress==null && other.getRemoteIPAddress()==null) || 
             (this.remoteIPAddress!=null &&
              this.remoteIPAddress.equals(other.getRemoteIPAddress()))) &&
            ((this.sessionID==null && other.getSessionID()==null) || 
             (this.sessionID!=null &&
              this.sessionID.equals(other.getSessionID()))) &&
            ((this.sessionIDDate==null && other.getSessionIDDate()==null) || 
             (this.sessionIDDate!=null &&
              this.sessionIDDate.equals(other.getSessionIDDate()))) &&
            ((this.userID==null && other.getUserID()==null) || 
             (this.userID!=null &&
              this.userID.equals(other.getUserID())));
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
        if (getAddTerminatingNull() != null) {
            _hashCode += getAddTerminatingNull().hashCode();
        }
        if (getRemoteIPAddress() != null) {
            _hashCode += getRemoteIPAddress().hashCode();
        }
        if (getSessionID() != null) {
            _hashCode += getSessionID().hashCode();
        }
        if (getSessionIDDate() != null) {
            _hashCode += getSessionIDDate().hashCode();
        }
        if (getUserID() != null) {
            _hashCode += getUserID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Session.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:AdministratorService", "Session"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addTerminatingNull");
        elemField.setXmlName(new javax.xml.namespace.QName("", "addTerminatingNull"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remoteIPAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "remoteIPAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sessionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionIDDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sessionIDDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:AdministratorService", "DateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userID"));
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
