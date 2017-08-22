/**
 * DirectoryElementList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 11, 2014 (12:11:36 EDT) WSDL2Java emitter.
 */

package AdminClient;

public class DirectoryElementList  implements java.io.Serializable {
    private java.lang.String elementName;

    private java.lang.String elementType;

    private AdminClient.DirectoryElementList[] subDirectoryList;

    public DirectoryElementList() {
    }

    public DirectoryElementList(
           java.lang.String elementName,
           java.lang.String elementType,
           AdminClient.DirectoryElementList[] subDirectoryList) {
           this.elementName = elementName;
           this.elementType = elementType;
           this.subDirectoryList = subDirectoryList;
    }


    /**
     * Gets the elementName value for this DirectoryElementList.
     * 
     * @return elementName
     */
    public java.lang.String getElementName() {
        return elementName;
    }


    /**
     * Sets the elementName value for this DirectoryElementList.
     * 
     * @param elementName
     */
    public void setElementName(java.lang.String elementName) {
        this.elementName = elementName;
    }


    /**
     * Gets the elementType value for this DirectoryElementList.
     * 
     * @return elementType
     */
    public java.lang.String getElementType() {
        return elementType;
    }


    /**
     * Sets the elementType value for this DirectoryElementList.
     * 
     * @param elementType
     */
    public void setElementType(java.lang.String elementType) {
        this.elementType = elementType;
    }


    /**
     * Gets the subDirectoryList value for this DirectoryElementList.
     * 
     * @return subDirectoryList
     */
    public AdminClient.DirectoryElementList[] getSubDirectoryList() {
        return subDirectoryList;
    }


    /**
     * Sets the subDirectoryList value for this DirectoryElementList.
     * 
     * @param subDirectoryList
     */
    public void setSubDirectoryList(AdminClient.DirectoryElementList[] subDirectoryList) {
        this.subDirectoryList = subDirectoryList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DirectoryElementList)) return false;
        DirectoryElementList other = (DirectoryElementList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.elementName==null && other.getElementName()==null) || 
             (this.elementName!=null &&
              this.elementName.equals(other.getElementName()))) &&
            ((this.elementType==null && other.getElementType()==null) || 
             (this.elementType!=null &&
              this.elementType.equals(other.getElementType()))) &&
            ((this.subDirectoryList==null && other.getSubDirectoryList()==null) || 
             (this.subDirectoryList!=null &&
              java.util.Arrays.equals(this.subDirectoryList, other.getSubDirectoryList())));
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
        if (getElementName() != null) {
            _hashCode += getElementName().hashCode();
        }
        if (getElementType() != null) {
            _hashCode += getElementType().hashCode();
        }
        if (getSubDirectoryList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSubDirectoryList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSubDirectoryList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DirectoryElementList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dbaccess.sift.proginet.com", "DirectoryElementList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("elementName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "elementName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("elementType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "elementType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subDirectoryList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subDirectoryList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dbaccess.sift.proginet.com", "DirectoryElementList"));
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
