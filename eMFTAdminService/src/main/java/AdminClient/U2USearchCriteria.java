/**
 * U2USearchCriteria.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 11, 2014 (12:11:36 EDT) WSDL2Java emitter.
 */

package AdminClient;

public class U2USearchCriteria  implements java.io.Serializable {
    private AdminClient.DateTime dateFrom;

    private AdminClient.DateTime dateTo;

    private int days;

    private java.lang.String emailMessage;

    private java.lang.String fileName;

    private int fileSize;

    private java.lang.String fileType;

    private java.lang.String from;

    private java.lang.String quickSearch;

    private int searchType;

    private java.lang.String subject;

    private java.lang.String to;

    public U2USearchCriteria() {
    }

    public U2USearchCriteria(
           AdminClient.DateTime dateFrom,
           AdminClient.DateTime dateTo,
           int days,
           java.lang.String emailMessage,
           java.lang.String fileName,
           int fileSize,
           java.lang.String fileType,
           java.lang.String from,
           java.lang.String quickSearch,
           int searchType,
           java.lang.String subject,
           java.lang.String to) {
           this.dateFrom = dateFrom;
           this.dateTo = dateTo;
           this.days = days;
           this.emailMessage = emailMessage;
           this.fileName = fileName;
           this.fileSize = fileSize;
           this.fileType = fileType;
           this.from = from;
           this.quickSearch = quickSearch;
           this.searchType = searchType;
           this.subject = subject;
           this.to = to;
    }


    /**
     * Gets the dateFrom value for this U2USearchCriteria.
     * 
     * @return dateFrom
     */
    public AdminClient.DateTime getDateFrom() {
        return dateFrom;
    }


    /**
     * Sets the dateFrom value for this U2USearchCriteria.
     * 
     * @param dateFrom
     */
    public void setDateFrom(AdminClient.DateTime dateFrom) {
        this.dateFrom = dateFrom;
    }


    /**
     * Gets the dateTo value for this U2USearchCriteria.
     * 
     * @return dateTo
     */
    public AdminClient.DateTime getDateTo() {
        return dateTo;
    }


    /**
     * Sets the dateTo value for this U2USearchCriteria.
     * 
     * @param dateTo
     */
    public void setDateTo(AdminClient.DateTime dateTo) {
        this.dateTo = dateTo;
    }


    /**
     * Gets the days value for this U2USearchCriteria.
     * 
     * @return days
     */
    public int getDays() {
        return days;
    }


    /**
     * Sets the days value for this U2USearchCriteria.
     * 
     * @param days
     */
    public void setDays(int days) {
        this.days = days;
    }


    /**
     * Gets the emailMessage value for this U2USearchCriteria.
     * 
     * @return emailMessage
     */
    public java.lang.String getEmailMessage() {
        return emailMessage;
    }


    /**
     * Sets the emailMessage value for this U2USearchCriteria.
     * 
     * @param emailMessage
     */
    public void setEmailMessage(java.lang.String emailMessage) {
        this.emailMessage = emailMessage;
    }


    /**
     * Gets the fileName value for this U2USearchCriteria.
     * 
     * @return fileName
     */
    public java.lang.String getFileName() {
        return fileName;
    }


    /**
     * Sets the fileName value for this U2USearchCriteria.
     * 
     * @param fileName
     */
    public void setFileName(java.lang.String fileName) {
        this.fileName = fileName;
    }


    /**
     * Gets the fileSize value for this U2USearchCriteria.
     * 
     * @return fileSize
     */
    public int getFileSize() {
        return fileSize;
    }


    /**
     * Sets the fileSize value for this U2USearchCriteria.
     * 
     * @param fileSize
     */
    public void setFileSize(int fileSize) {
        this.fileSize = fileSize;
    }


    /**
     * Gets the fileType value for this U2USearchCriteria.
     * 
     * @return fileType
     */
    public java.lang.String getFileType() {
        return fileType;
    }


    /**
     * Sets the fileType value for this U2USearchCriteria.
     * 
     * @param fileType
     */
    public void setFileType(java.lang.String fileType) {
        this.fileType = fileType;
    }


    /**
     * Gets the from value for this U2USearchCriteria.
     * 
     * @return from
     */
    public java.lang.String getFrom() {
        return from;
    }


    /**
     * Sets the from value for this U2USearchCriteria.
     * 
     * @param from
     */
    public void setFrom(java.lang.String from) {
        this.from = from;
    }


    /**
     * Gets the quickSearch value for this U2USearchCriteria.
     * 
     * @return quickSearch
     */
    public java.lang.String getQuickSearch() {
        return quickSearch;
    }


    /**
     * Sets the quickSearch value for this U2USearchCriteria.
     * 
     * @param quickSearch
     */
    public void setQuickSearch(java.lang.String quickSearch) {
        this.quickSearch = quickSearch;
    }


    /**
     * Gets the searchType value for this U2USearchCriteria.
     * 
     * @return searchType
     */
    public int getSearchType() {
        return searchType;
    }


    /**
     * Sets the searchType value for this U2USearchCriteria.
     * 
     * @param searchType
     */
    public void setSearchType(int searchType) {
        this.searchType = searchType;
    }


    /**
     * Gets the subject value for this U2USearchCriteria.
     * 
     * @return subject
     */
    public java.lang.String getSubject() {
        return subject;
    }


    /**
     * Sets the subject value for this U2USearchCriteria.
     * 
     * @param subject
     */
    public void setSubject(java.lang.String subject) {
        this.subject = subject;
    }


    /**
     * Gets the to value for this U2USearchCriteria.
     * 
     * @return to
     */
    public java.lang.String getTo() {
        return to;
    }


    /**
     * Sets the to value for this U2USearchCriteria.
     * 
     * @param to
     */
    public void setTo(java.lang.String to) {
        this.to = to;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof U2USearchCriteria)) return false;
        U2USearchCriteria other = (U2USearchCriteria) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dateFrom==null && other.getDateFrom()==null) || 
             (this.dateFrom!=null &&
              this.dateFrom.equals(other.getDateFrom()))) &&
            ((this.dateTo==null && other.getDateTo()==null) || 
             (this.dateTo!=null &&
              this.dateTo.equals(other.getDateTo()))) &&
            this.days == other.getDays() &&
            ((this.emailMessage==null && other.getEmailMessage()==null) || 
             (this.emailMessage!=null &&
              this.emailMessage.equals(other.getEmailMessage()))) &&
            ((this.fileName==null && other.getFileName()==null) || 
             (this.fileName!=null &&
              this.fileName.equals(other.getFileName()))) &&
            this.fileSize == other.getFileSize() &&
            ((this.fileType==null && other.getFileType()==null) || 
             (this.fileType!=null &&
              this.fileType.equals(other.getFileType()))) &&
            ((this.from==null && other.getFrom()==null) || 
             (this.from!=null &&
              this.from.equals(other.getFrom()))) &&
            ((this.quickSearch==null && other.getQuickSearch()==null) || 
             (this.quickSearch!=null &&
              this.quickSearch.equals(other.getQuickSearch()))) &&
            this.searchType == other.getSearchType() &&
            ((this.subject==null && other.getSubject()==null) || 
             (this.subject!=null &&
              this.subject.equals(other.getSubject()))) &&
            ((this.to==null && other.getTo()==null) || 
             (this.to!=null &&
              this.to.equals(other.getTo())));
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
        if (getDateFrom() != null) {
            _hashCode += getDateFrom().hashCode();
        }
        if (getDateTo() != null) {
            _hashCode += getDateTo().hashCode();
        }
        _hashCode += getDays();
        if (getEmailMessage() != null) {
            _hashCode += getEmailMessage().hashCode();
        }
        if (getFileName() != null) {
            _hashCode += getFileName().hashCode();
        }
        _hashCode += getFileSize();
        if (getFileType() != null) {
            _hashCode += getFileType().hashCode();
        }
        if (getFrom() != null) {
            _hashCode += getFrom().hashCode();
        }
        if (getQuickSearch() != null) {
            _hashCode += getQuickSearch().hashCode();
        }
        _hashCode += getSearchType();
        if (getSubject() != null) {
            _hashCode += getSubject().hashCode();
        }
        if (getTo() != null) {
            _hashCode += getTo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(U2USearchCriteria.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:AdministratorService", "U2USearchCriteria"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dateFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:AdministratorService", "DateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateTo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dateTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:AdministratorService", "DateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("days");
        elemField.setXmlName(new javax.xml.namespace.QName("", "days"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "emailMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fileName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileSize");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fileSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fileType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("from");
        elemField.setXmlName(new javax.xml.namespace.QName("", "from"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quickSearch");
        elemField.setXmlName(new javax.xml.namespace.QName("", "quickSearch"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "searchType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subject");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subject"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("to");
        elemField.setXmlName(new javax.xml.namespace.QName("", "to"));
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
