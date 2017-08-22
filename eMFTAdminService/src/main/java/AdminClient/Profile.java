/**
 * Profile.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 11, 2014 (12:11:36 EDT) WSDL2Java emitter.
 */

package AdminClient;

public class Profile  implements java.io.Serializable {
    private java.lang.String createdBy;

    private AdminClient.DateTime dateCreated;

    private AdminClient.DateTime dateUpdated;

    private java.lang.String department;

    private java.lang.String description;

    private java.lang.String localPwd;

    private java.lang.String localUID;

    private java.lang.String nodeName;

    private java.lang.String profileID;

    private java.lang.String profileType;

    private java.lang.String remotePwd;

    private java.lang.String remoteUID;

    private java.lang.String tableName;

    private java.lang.String updatedBy;

    public Profile() {
    }

    public Profile(
           java.lang.String createdBy,
           AdminClient.DateTime dateCreated,
           AdminClient.DateTime dateUpdated,
           java.lang.String department,
           java.lang.String description,
           java.lang.String localPwd,
           java.lang.String localUID,
           java.lang.String nodeName,
           java.lang.String profileID,
           java.lang.String profileType,
           java.lang.String remotePwd,
           java.lang.String remoteUID,
           java.lang.String tableName,
           java.lang.String updatedBy) {
           this.createdBy = createdBy;
           this.dateCreated = dateCreated;
           this.dateUpdated = dateUpdated;
           this.department = department;
           this.description = description;
           this.localPwd = localPwd;
           this.localUID = localUID;
           this.nodeName = nodeName;
           this.profileID = profileID;
           this.profileType = profileType;
           this.remotePwd = remotePwd;
           this.remoteUID = remoteUID;
           this.tableName = tableName;
           this.updatedBy = updatedBy;
    }


    /**
     * Gets the createdBy value for this Profile.
     * 
     * @return createdBy
     */
    public java.lang.String getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this Profile.
     * 
     * @param createdBy
     */
    public void setCreatedBy(java.lang.String createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the dateCreated value for this Profile.
     * 
     * @return dateCreated
     */
    public AdminClient.DateTime getDateCreated() {
        return dateCreated;
    }


    /**
     * Sets the dateCreated value for this Profile.
     * 
     * @param dateCreated
     */
    public void setDateCreated(AdminClient.DateTime dateCreated) {
        this.dateCreated = dateCreated;
    }


    /**
     * Gets the dateUpdated value for this Profile.
     * 
     * @return dateUpdated
     */
    public AdminClient.DateTime getDateUpdated() {
        return dateUpdated;
    }


    /**
     * Sets the dateUpdated value for this Profile.
     * 
     * @param dateUpdated
     */
    public void setDateUpdated(AdminClient.DateTime dateUpdated) {
        this.dateUpdated = dateUpdated;
    }


    /**
     * Gets the department value for this Profile.
     * 
     * @return department
     */
    public java.lang.String getDepartment() {
        return department;
    }


    /**
     * Sets the department value for this Profile.
     * 
     * @param department
     */
    public void setDepartment(java.lang.String department) {
        this.department = department;
    }


    /**
     * Gets the description value for this Profile.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Profile.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the localPwd value for this Profile.
     * 
     * @return localPwd
     */
    public java.lang.String getLocalPwd() {
        return localPwd;
    }


    /**
     * Sets the localPwd value for this Profile.
     * 
     * @param localPwd
     */
    public void setLocalPwd(java.lang.String localPwd) {
        this.localPwd = localPwd;
    }


    /**
     * Gets the localUID value for this Profile.
     * 
     * @return localUID
     */
    public java.lang.String getLocalUID() {
        return localUID;
    }


    /**
     * Sets the localUID value for this Profile.
     * 
     * @param localUID
     */
    public void setLocalUID(java.lang.String localUID) {
        this.localUID = localUID;
    }


    /**
     * Gets the nodeName value for this Profile.
     * 
     * @return nodeName
     */
    public java.lang.String getNodeName() {
        return nodeName;
    }


    /**
     * Sets the nodeName value for this Profile.
     * 
     * @param nodeName
     */
    public void setNodeName(java.lang.String nodeName) {
        this.nodeName = nodeName;
    }


    /**
     * Gets the profileID value for this Profile.
     * 
     * @return profileID
     */
    public java.lang.String getProfileID() {
        return profileID;
    }


    /**
     * Sets the profileID value for this Profile.
     * 
     * @param profileID
     */
    public void setProfileID(java.lang.String profileID) {
        this.profileID = profileID;
    }


    /**
     * Gets the profileType value for this Profile.
     * 
     * @return profileType
     */
    public java.lang.String getProfileType() {
        return profileType;
    }


    /**
     * Sets the profileType value for this Profile.
     * 
     * @param profileType
     */
    public void setProfileType(java.lang.String profileType) {
        this.profileType = profileType;
    }


    /**
     * Gets the remotePwd value for this Profile.
     * 
     * @return remotePwd
     */
    public java.lang.String getRemotePwd() {
        return remotePwd;
    }


    /**
     * Sets the remotePwd value for this Profile.
     * 
     * @param remotePwd
     */
    public void setRemotePwd(java.lang.String remotePwd) {
        this.remotePwd = remotePwd;
    }


    /**
     * Gets the remoteUID value for this Profile.
     * 
     * @return remoteUID
     */
    public java.lang.String getRemoteUID() {
        return remoteUID;
    }


    /**
     * Sets the remoteUID value for this Profile.
     * 
     * @param remoteUID
     */
    public void setRemoteUID(java.lang.String remoteUID) {
        this.remoteUID = remoteUID;
    }


    /**
     * Gets the tableName value for this Profile.
     * 
     * @return tableName
     */
    public java.lang.String getTableName() {
        return tableName;
    }


    /**
     * Sets the tableName value for this Profile.
     * 
     * @param tableName
     */
    public void setTableName(java.lang.String tableName) {
        this.tableName = tableName;
    }


    /**
     * Gets the updatedBy value for this Profile.
     * 
     * @return updatedBy
     */
    public java.lang.String getUpdatedBy() {
        return updatedBy;
    }


    /**
     * Sets the updatedBy value for this Profile.
     * 
     * @param updatedBy
     */
    public void setUpdatedBy(java.lang.String updatedBy) {
        this.updatedBy = updatedBy;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Profile)) return false;
        Profile other = (Profile) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
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
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.localPwd==null && other.getLocalPwd()==null) || 
             (this.localPwd!=null &&
              this.localPwd.equals(other.getLocalPwd()))) &&
            ((this.localUID==null && other.getLocalUID()==null) || 
             (this.localUID!=null &&
              this.localUID.equals(other.getLocalUID()))) &&
            ((this.nodeName==null && other.getNodeName()==null) || 
             (this.nodeName!=null &&
              this.nodeName.equals(other.getNodeName()))) &&
            ((this.profileID==null && other.getProfileID()==null) || 
             (this.profileID!=null &&
              this.profileID.equals(other.getProfileID()))) &&
            ((this.profileType==null && other.getProfileType()==null) || 
             (this.profileType!=null &&
              this.profileType.equals(other.getProfileType()))) &&
            ((this.remotePwd==null && other.getRemotePwd()==null) || 
             (this.remotePwd!=null &&
              this.remotePwd.equals(other.getRemotePwd()))) &&
            ((this.remoteUID==null && other.getRemoteUID()==null) || 
             (this.remoteUID!=null &&
              this.remoteUID.equals(other.getRemoteUID()))) &&
            ((this.tableName==null && other.getTableName()==null) || 
             (this.tableName!=null &&
              this.tableName.equals(other.getTableName()))) &&
            ((this.updatedBy==null && other.getUpdatedBy()==null) || 
             (this.updatedBy!=null &&
              this.updatedBy.equals(other.getUpdatedBy())));
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
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getLocalPwd() != null) {
            _hashCode += getLocalPwd().hashCode();
        }
        if (getLocalUID() != null) {
            _hashCode += getLocalUID().hashCode();
        }
        if (getNodeName() != null) {
            _hashCode += getNodeName().hashCode();
        }
        if (getProfileID() != null) {
            _hashCode += getProfileID().hashCode();
        }
        if (getProfileType() != null) {
            _hashCode += getProfileType().hashCode();
        }
        if (getRemotePwd() != null) {
            _hashCode += getRemotePwd().hashCode();
        }
        if (getRemoteUID() != null) {
            _hashCode += getRemoteUID().hashCode();
        }
        if (getTableName() != null) {
            _hashCode += getTableName().hashCode();
        }
        if (getUpdatedBy() != null) {
            _hashCode += getUpdatedBy().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Profile.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:AdministratorService", "Profile"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localPwd");
        elemField.setXmlName(new javax.xml.namespace.QName("", "localPwd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localUID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "localUID"));
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
        elemField.setFieldName("profileID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "profileID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("profileType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "profileType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remotePwd");
        elemField.setXmlName(new javax.xml.namespace.QName("", "remotePwd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remoteUID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "remoteUID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tableName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tableName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updatedBy");
        elemField.setXmlName(new javax.xml.namespace.QName("", "updatedBy"));
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
