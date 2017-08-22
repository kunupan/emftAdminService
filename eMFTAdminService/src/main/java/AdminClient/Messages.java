/**
 * Messages.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 11, 2014 (12:11:36 EDT) WSDL2Java emitter.
 */

package AdminClient;

public class Messages  implements java.io.Serializable {
    private java.util.Vector m_errorMsgs;

    private java.util.Vector m_infoMsgs;

    private java.util.Vector m_warningMsgs;

    private java.lang.String msgs;

    public Messages() {
    }

    public Messages(
           java.util.Vector m_errorMsgs,
           java.util.Vector m_infoMsgs,
           java.util.Vector m_warningMsgs,
           java.lang.String msgs) {
           this.m_errorMsgs = m_errorMsgs;
           this.m_infoMsgs = m_infoMsgs;
           this.m_warningMsgs = m_warningMsgs;
           this.msgs = msgs;
    }


    /**
     * Gets the m_errorMsgs value for this Messages.
     * 
     * @return m_errorMsgs
     */
    public java.util.Vector getM_errorMsgs() {
        return m_errorMsgs;
    }


    /**
     * Sets the m_errorMsgs value for this Messages.
     * 
     * @param m_errorMsgs
     */
    public void setM_errorMsgs(java.util.Vector m_errorMsgs) {
        this.m_errorMsgs = m_errorMsgs;
    }


    /**
     * Gets the m_infoMsgs value for this Messages.
     * 
     * @return m_infoMsgs
     */
    public java.util.Vector getM_infoMsgs() {
        return m_infoMsgs;
    }


    /**
     * Sets the m_infoMsgs value for this Messages.
     * 
     * @param m_infoMsgs
     */
    public void setM_infoMsgs(java.util.Vector m_infoMsgs) {
        this.m_infoMsgs = m_infoMsgs;
    }


    /**
     * Gets the m_warningMsgs value for this Messages.
     * 
     * @return m_warningMsgs
     */
    public java.util.Vector getM_warningMsgs() {
        return m_warningMsgs;
    }


    /**
     * Sets the m_warningMsgs value for this Messages.
     * 
     * @param m_warningMsgs
     */
    public void setM_warningMsgs(java.util.Vector m_warningMsgs) {
        this.m_warningMsgs = m_warningMsgs;
    }


    /**
     * Gets the msgs value for this Messages.
     * 
     * @return msgs
     */
    public java.lang.String getMsgs() {
        return msgs;
    }


    /**
     * Sets the msgs value for this Messages.
     * 
     * @param msgs
     */
    public void setMsgs(java.lang.String msgs) {
        this.msgs = msgs;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Messages)) return false;
        Messages other = (Messages) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.m_errorMsgs==null && other.getM_errorMsgs()==null) || 
             (this.m_errorMsgs!=null &&
              this.m_errorMsgs.equals(other.getM_errorMsgs()))) &&
            ((this.m_infoMsgs==null && other.getM_infoMsgs()==null) || 
             (this.m_infoMsgs!=null &&
              this.m_infoMsgs.equals(other.getM_infoMsgs()))) &&
            ((this.m_warningMsgs==null && other.getM_warningMsgs()==null) || 
             (this.m_warningMsgs!=null &&
              this.m_warningMsgs.equals(other.getM_warningMsgs()))) &&
            ((this.msgs==null && other.getMsgs()==null) || 
             (this.msgs!=null &&
              this.msgs.equals(other.getMsgs())));
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
        if (getM_errorMsgs() != null) {
            _hashCode += getM_errorMsgs().hashCode();
        }
        if (getM_infoMsgs() != null) {
            _hashCode += getM_infoMsgs().hashCode();
        }
        if (getM_warningMsgs() != null) {
            _hashCode += getM_warningMsgs().hashCode();
        }
        if (getMsgs() != null) {
            _hashCode += getMsgs().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Messages.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:AdministratorService", "Messages"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("m_errorMsgs");
        elemField.setXmlName(new javax.xml.namespace.QName("", "m_errorMsgs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xml.apache.org/xml-soap", "Vector"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("m_infoMsgs");
        elemField.setXmlName(new javax.xml.namespace.QName("", "m_infoMsgs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xml.apache.org/xml-soap", "Vector"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("m_warningMsgs");
        elemField.setXmlName(new javax.xml.namespace.QName("", "m_warningMsgs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xml.apache.org/xml-soap", "Vector"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msgs");
        elemField.setXmlName(new javax.xml.namespace.QName("", "msgs"));
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
