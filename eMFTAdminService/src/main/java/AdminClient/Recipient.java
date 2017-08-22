/**
 * Recipient.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 11, 2014 (12:11:36 EDT) WSDL2Java emitter.
 */

package AdminClient;

public class Recipient  implements java.io.Serializable {
    private java.lang.String availability;

    private java.lang.String createdBy;

    private AdminClient.DateTime dateCreated;

    private AdminClient.DateTime dateUpdated;

    private java.lang.String department;

    private java.lang.String emailAddr;

    private java.lang.String fileID;

    private java.lang.String fullName;

    private java.lang.String recSequenceNo;

    private java.lang.String requestID;

    private java.lang.String statusDownload;

    private java.lang.String type;

    private java.lang.String updatedBy;

    private java.lang.String userID;

    public Recipient() {
    }

    public Recipient(
           java.lang.String availability,
           java.lang.String createdBy,
           AdminClient.DateTime dateCreated,
           AdminClient.DateTime dateUpdated,
           java.lang.String department,
           java.lang.String emailAddr,
           java.lang.String fileID,
           java.lang.String fullName,
           java.lang.String recSequenceNo,
           java.lang.String requestID,
           java.lang.String statusDownload,
           java.lang.String type,
           java.lang.String updatedBy,
           java.lang.String userID) {
           this.availability = availability;
           this.createdBy = createdBy;
           this.dateCreated = dateCreated;
           this.dateUpdated = dateUpdated;
           this.department = department;
           this.emailAddr = emailAddr;
           this.fileID = fileID;
           this.fullName = fullName;
           this.recSequenceNo = recSequenceNo;
           this.requestID = requestID;
           this.statusDownload = statusDownload;
           this.type = type;
           this.updatedBy = updatedBy;
           this.userID = userID;
    }


    /**
     * Gets the availability value for this Recipient.
     * 
     * @return availability
     */
    public java.lang.String getAvailability() {
        return availability;
    }


    /**
     * Sets the availability value for this Recipient.
     * 
     * @param availability
     */
    public void setAvailability(java.lang.String availability) {
        this.availability = availability;
    }


    /**
     * Gets the createdBy value for this Recipient.
     * 
     * @return createdBy
     */
    public java.lang.String getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this Recipient.
     * 
     * @param createdBy
     */
    public void setCreatedBy(java.lang.String createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the dateCreated value for this Recipient.
     * 
     * @return dateCreated
     */
    public AdminClient.DateTime getDateCreated() {
        return dateCreated;
    }


    /**
     * Sets the dateCreated value for this Recipient.
     * 
     * @param dateCreated
     */
    public void setDateCreated(AdminClient.DateTime dateCreated) {
        this.dateCreated = dateCreated;
    }


    /**
     * Gets the dateUpdated value for this Recipient.
     * 
     * @return dateUpdated
     */
    public AdminClient.DateTime getDateUpdated() {
        return dateUpdated;
    }


    /**
     * Sets the dateUpdated value for this Recipient.
     * 
     * @param dateUpdated
     */
    public void setDateUpdated(AdminClient.DateTime dateUpdated) {
        this.dateUpdated = dateUpdated;
    }


    /**
     * Gets the department value for this Recipient.
     * 
     * @return department
     */
    public java.lang.String getDepartment() {
        return department;
    }


    /**
     * Sets the department value for this Recipient.
     * 
     * @param department
     */
    public void setDepartment(java.lang.String department) {
        this.department = department;
    }


    /**
     * Gets the emailAddr value for this Recipient.
     * 
     * @return emailAddr
     */
    public java.lang.String getEmailAddr() {
        return emailAddr;
    }


    /**
     * Sets the emailAddr value for this Recipient.
     * 
     * @param emailAddr
     */
    public void setEmailAddr(java.lang.String emailAddr) {
        this.emailAddr = emailAddr;
    }


    /**
     * Gets the fileID value for this Recipient.
     * 
     * @return fileID
     */
    public java.lang.String getFileID() {
        return fileID;
    }


    /**
     * Sets the fileID value for this Recipient.
     * 
     * @param fileID
     */
    public void setFileID(java.lang.String fileID) {
        this.fileID = fileID;
    }


    /**
     * Gets the fullName value for this Recipient.
     * 
     * @return fullName
     */
    public java.lang.String getFullName() {
        return fullName;
    }


    /**
     * Sets the fullName value for this Recipient.
     * 
     * @param fullName
     */
    public void setFullName(java.lang.String fullName) {
        this.fullName = fullName;
    }


    /**
     * Gets the recSequenceNo value for this Recipient.
     * 
     * @return recSequenceNo
     */
    public java.lang.String getRecSequenceNo() {
        return recSequenceNo;
    }


    /**
     * Sets the recSequenceNo value for this Recipient.
     * 
     * @param recSequenceNo
     */
    public void setRecSequenceNo(java.lang.String recSequenceNo) {
        this.recSequenceNo = recSequenceNo;
    }


    /**
     * Gets the requestID value for this Recipient.
     * 
     * @return requestID
     */
    public java.lang.String getRequestID() {
        return requestID;
    }


    /**
     * Sets the requestID value for this Recipient.
     * 
     * @param requestID
     */
    public void setRequestID(java.lang.String requestID) {
        this.requestID = requestID;
    }


    /**
     * Gets the statusDownload value for this Recipient.
     * 
     * @return statusDownload
     */
    public java.lang.String getStatusDownload() {
        return statusDownload;
    }


    /**
     * Sets the statusDownload value for this Recipient.
     * 
     * @param statusDownload
     */
    public void setStatusDownload(java.lang.String statusDownload) {
        this.statusDownload = statusDownload;
    }


    /**
     * Gets the type value for this Recipient.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this Recipient.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the updatedBy value for this Recipient.
     * 
     * @return updatedBy
     */
    public java.lang.String getUpdatedBy() {
        return updatedBy;
    }


    /**
     * Sets the updatedBy value for this Recipient.
     * 
     * @param updatedBy
     */
    public void setUpdatedBy(java.lang.String updatedBy) {
        this.updatedBy = updatedBy;
    }


    /**
     * Gets the userID value for this Recipient.
     * 
     * @return userID
     */
    public java.lang.String getUserID() {
        return userID;
    }


    /**
     * Sets the userID value for this Recipient.
     * 
     * @param userID
     */
    public void setUserID(java.lang.String userID) {
        this.userID = userID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Recipient)) return false;
        Recipient other = (Recipient) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.availability==null && other.getAvailability()==null) || 
             (this.availability!=null &&
              this.availability.equals(other.getAvailability()))) &&
            ((this.createdBy==null && other.getCreatedBy()==null) || 
             (this.createdBy!=null &&
              this.createdBy.equals(other.getCreatedBy()))) &&
            ((this.dateCreated==null && other.getDateCreated()==null) || 
             (this.dateCreated!=null &&
              this.dateCreated.equals(other.getDateCreated()))) &&
            ((this.dateUpdated==null && other.getDateUpdated()==null) || 
             (this.dateUpdated!=null &&
              this.dateUpdated.equals(other.getDateUpdated()))) &&
            ((this.department==null && other.getDepartment()==null) || 
             (this.department!=null &&
              this.department.equals(other.getDepartment()))) &&
            ((this.emailAddr==null && other.getEmailAddr()==null) || 
             (this.emailAddr!=null &&
              this.emailAddr.equals(other.getEmailAddr()))) &&
            ((this.fileID==null && other.getFileID()==null) || 
             (this.fileID!=null &&
              this.fileID.equals(other.getFileID()))) &&
            ((this.fullName==null && other.getFullName()==null) || 
             (this.fullName!=null &&
              this.fullName.equals(other.getFullName()))) &&
            ((this.recSequenceNo==null && other.getRecSequenceNo()==null) || 
             (this.recSequenceNo!=null &&
              this.recSequenceNo.equals(other.getRecSequenceNo()))) &&
            ((this.requestID==null && other.getRequestID()==null) || 
             (this.requestID!=null &&
              this.requestID.equals(other.getRequestID()))) &&
            ((this.statusDownload==null && other.getStatusDownload()==null) || 
             (this.statusDownload!=null &&
              this.statusDownload.equals(other.getStatusDownload()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.updatedBy==null && other.getUpdatedBy()==null) || 
             (this.updatedBy!=null &&
              this.updatedBy.equals(other.getUpdatedBy()))) &&
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
        if (getAvailability() != null) {
            _hashCode += getAvailability().hashCode();
        }
        if (getCreatedBy() != null) {
            _hashCode += getCreatedBy().hashCode();
        }
        if (getDateCreated() != null) {
            _hashCode += getDateCreated().hashCode();
        }
        if (getDateUpdated() != null) {
            _hashCode += getDateUpdated().hashCode();
        }
        if (getDepartment() != null) {
            _hashCode += getDepartment().hashCode();
        }
        if (getEmailAddr() != null) {
            _hashCode += getEmailAddr().hashCode();
        }
        if (getFileID() != null) {
            _hashCode += getFileID().hashCode();
        }
        if (getFullName() != null) {
            _hashCode += getFullName().hashCode();
        }
        if (getRecSequenceNo() != null) {
            _hashCode += getRecSequenceNo().hashCode();
        }
        if (getRequestID() != null) {
            _hashCode += getRequestID().hashCode();
        }
        if (getStatusDownload() != null) {
            _hashCode += getStatusDownload().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getUpdatedBy() != null) {
            _hashCode += getUpdatedBy().hashCode();
        }
        if (getUserID() != null) {
            _hashCode += getUserID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Recipient.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:AdministratorService", "Recipient"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("availability");
        elemField.setXmlName(new javax.xml.namespace.QName("", "availability"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdBy");
        elemField.setXmlName(new javax.xml.namespace.QName("", "createdBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateCreated");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dateCreated"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:AdministratorService", "DateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateUpdated");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dateUpdated"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:AdministratorService", "DateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("department");
        elemField.setXmlName(new javax.xml.namespace.QName("", "department"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailAddr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "emailAddr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fileID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fullName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fullName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recSequenceNo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "recSequenceNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "requestID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusDownload");
        elemField.setXmlName(new javax.xml.namespace.QName("", "statusDownload"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updatedBy");
        elemField.setXmlName(new javax.xml.namespace.QName("", "updatedBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
