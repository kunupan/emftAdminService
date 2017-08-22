/**
 * SearchAudit.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 11, 2014 (12:11:36 EDT) WSDL2Java emitter.
 */

package AdminClient;

public class SearchAudit  implements java.io.Serializable {
    private java.lang.String JMSUserID;

    private java.lang.String JMSUserPwd;

    private java.lang.String auditID;

    private java.lang.String auditType;

    private java.lang.String aux5;

    private java.lang.String aux6;

    private java.lang.String aux7;

    private java.lang.String aux8;

    private java.lang.String clientFileName;

    private java.lang.String createdBy;

    private AdminClient.DateTime dateCreated;

    private AdminClient.DateTime dateUpdated;

    private java.lang.String department;

    private java.lang.String description;

    private java.lang.String localTransID;

    private java.lang.String maxReturned;

    private java.lang.String nodeName;

    private java.lang.String nodeNameCF;

    private boolean nonEvent;

    private java.lang.String numOfDays;

    private java.lang.String processName;

    private java.lang.String searchAuditID;

    private java.lang.String sendRecvFlag;

    private java.lang.String serverFileName;

    private java.lang.String tableName;

    private AdminClient.DateTime trEndTime;

    private AdminClient.DateTime trStartTime;

    private java.lang.String trStatus;

    private java.lang.String trUserID;

    private java.lang.String type;

    private java.lang.String updatedBy;

    private java.lang.String userData;

    public SearchAudit() {
    }

    public SearchAudit(
           java.lang.String JMSUserID,
           java.lang.String JMSUserPwd,
           java.lang.String auditID,
           java.lang.String auditType,
           java.lang.String aux5,
           java.lang.String aux6,
           java.lang.String aux7,
           java.lang.String aux8,
           java.lang.String clientFileName,
           java.lang.String createdBy,
           AdminClient.DateTime dateCreated,
           AdminClient.DateTime dateUpdated,
           java.lang.String department,
           java.lang.String description,
           java.lang.String localTransID,
           java.lang.String maxReturned,
           java.lang.String nodeName,
           java.lang.String nodeNameCF,
           boolean nonEvent,
           java.lang.String numOfDays,
           java.lang.String processName,
           java.lang.String searchAuditID,
           java.lang.String sendRecvFlag,
           java.lang.String serverFileName,
           java.lang.String tableName,
           AdminClient.DateTime trEndTime,
           AdminClient.DateTime trStartTime,
           java.lang.String trStatus,
           java.lang.String trUserID,
           java.lang.String type,
           java.lang.String updatedBy,
           java.lang.String userData) {
           this.JMSUserID = JMSUserID;
           this.JMSUserPwd = JMSUserPwd;
           this.auditID = auditID;
           this.auditType = auditType;
           this.aux5 = aux5;
           this.aux6 = aux6;
           this.aux7 = aux7;
           this.aux8 = aux8;
           this.clientFileName = clientFileName;
           this.createdBy = createdBy;
           this.dateCreated = dateCreated;
           this.dateUpdated = dateUpdated;
           this.department = department;
           this.description = description;
           this.localTransID = localTransID;
           this.maxReturned = maxReturned;
           this.nodeName = nodeName;
           this.nodeNameCF = nodeNameCF;
           this.nonEvent = nonEvent;
           this.numOfDays = numOfDays;
           this.processName = processName;
           this.searchAuditID = searchAuditID;
           this.sendRecvFlag = sendRecvFlag;
           this.serverFileName = serverFileName;
           this.tableName = tableName;
           this.trEndTime = trEndTime;
           this.trStartTime = trStartTime;
           this.trStatus = trStatus;
           this.trUserID = trUserID;
           this.type = type;
           this.updatedBy = updatedBy;
           this.userData = userData;
    }


    /**
     * Gets the JMSUserID value for this SearchAudit.
     * 
     * @return JMSUserID
     */
    public java.lang.String getJMSUserID() {
        return JMSUserID;
    }


    /**
     * Sets the JMSUserID value for this SearchAudit.
     * 
     * @param JMSUserID
     */
    public void setJMSUserID(java.lang.String JMSUserID) {
        this.JMSUserID = JMSUserID;
    }


    /**
     * Gets the JMSUserPwd value for this SearchAudit.
     * 
     * @return JMSUserPwd
     */
    public java.lang.String getJMSUserPwd() {
        return JMSUserPwd;
    }


    /**
     * Sets the JMSUserPwd value for this SearchAudit.
     * 
     * @param JMSUserPwd
     */
    public void setJMSUserPwd(java.lang.String JMSUserPwd) {
        this.JMSUserPwd = JMSUserPwd;
    }


    /**
     * Gets the auditID value for this SearchAudit.
     * 
     * @return auditID
     */
    public java.lang.String getAuditID() {
        return auditID;
    }


    /**
     * Sets the auditID value for this SearchAudit.
     * 
     * @param auditID
     */
    public void setAuditID(java.lang.String auditID) {
        this.auditID = auditID;
    }


    /**
     * Gets the auditType value for this SearchAudit.
     * 
     * @return auditType
     */
    public java.lang.String getAuditType() {
        return auditType;
    }


    /**
     * Sets the auditType value for this SearchAudit.
     * 
     * @param auditType
     */
    public void setAuditType(java.lang.String auditType) {
        this.auditType = auditType;
    }


    /**
     * Gets the aux5 value for this SearchAudit.
     * 
     * @return aux5
     */
    public java.lang.String getAux5() {
        return aux5;
    }


    /**
     * Sets the aux5 value for this SearchAudit.
     * 
     * @param aux5
     */
    public void setAux5(java.lang.String aux5) {
        this.aux5 = aux5;
    }


    /**
     * Gets the aux6 value for this SearchAudit.
     * 
     * @return aux6
     */
    public java.lang.String getAux6() {
        return aux6;
    }


    /**
     * Sets the aux6 value for this SearchAudit.
     * 
     * @param aux6
     */
    public void setAux6(java.lang.String aux6) {
        this.aux6 = aux6;
    }


    /**
     * Gets the aux7 value for this SearchAudit.
     * 
     * @return aux7
     */
    public java.lang.String getAux7() {
        return aux7;
    }


    /**
     * Sets the aux7 value for this SearchAudit.
     * 
     * @param aux7
     */
    public void setAux7(java.lang.String aux7) {
        this.aux7 = aux7;
    }


    /**
     * Gets the aux8 value for this SearchAudit.
     * 
     * @return aux8
     */
    public java.lang.String getAux8() {
        return aux8;
    }


    /**
     * Sets the aux8 value for this SearchAudit.
     * 
     * @param aux8
     */
    public void setAux8(java.lang.String aux8) {
        this.aux8 = aux8;
    }


    /**
     * Gets the clientFileName value for this SearchAudit.
     * 
     * @return clientFileName
     */
    public java.lang.String getClientFileName() {
        return clientFileName;
    }


    /**
     * Sets the clientFileName value for this SearchAudit.
     * 
     * @param clientFileName
     */
    public void setClientFileName(java.lang.String clientFileName) {
        this.clientFileName = clientFileName;
    }


    /**
     * Gets the createdBy value for this SearchAudit.
     * 
     * @return createdBy
     */
    public java.lang.String getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this SearchAudit.
     * 
     * @param createdBy
     */
    public void setCreatedBy(java.lang.String createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the dateCreated value for this SearchAudit.
     * 
     * @return dateCreated
     */
    public AdminClient.DateTime getDateCreated() {
        return dateCreated;
    }


    /**
     * Sets the dateCreated value for this SearchAudit.
     * 
     * @param dateCreated
     */
    public void setDateCreated(AdminClient.DateTime dateCreated) {
        this.dateCreated = dateCreated;
    }


    /**
     * Gets the dateUpdated value for this SearchAudit.
     * 
     * @return dateUpdated
     */
    public AdminClient.DateTime getDateUpdated() {
        return dateUpdated;
    }


    /**
     * Sets the dateUpdated value for this SearchAudit.
     * 
     * @param dateUpdated
     */
    public void setDateUpdated(AdminClient.DateTime dateUpdated) {
        this.dateUpdated = dateUpdated;
    }


    /**
     * Gets the department value for this SearchAudit.
     * 
     * @return department
     */
    public java.lang.String getDepartment() {
        return department;
    }


    /**
     * Sets the department value for this SearchAudit.
     * 
     * @param department
     */
    public void setDepartment(java.lang.String department) {
        this.department = department;
    }


    /**
     * Gets the description value for this SearchAudit.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this SearchAudit.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the localTransID value for this SearchAudit.
     * 
     * @return localTransID
     */
    public java.lang.String getLocalTransID() {
        return localTransID;
    }


    /**
     * Sets the localTransID value for this SearchAudit.
     * 
     * @param localTransID
     */
    public void setLocalTransID(java.lang.String localTransID) {
        this.localTransID = localTransID;
    }


    /**
     * Gets the maxReturned value for this SearchAudit.
     * 
     * @return maxReturned
     */
    public java.lang.String getMaxReturned() {
        return maxReturned;
    }


    /**
     * Sets the maxReturned value for this SearchAudit.
     * 
     * @param maxReturned
     */
    public void setMaxReturned(java.lang.String maxReturned) {
        this.maxReturned = maxReturned;
    }


    /**
     * Gets the nodeName value for this SearchAudit.
     * 
     * @return nodeName
     */
    public java.lang.String getNodeName() {
        return nodeName;
    }


    /**
     * Sets the nodeName value for this SearchAudit.
     * 
     * @param nodeName
     */
    public void setNodeName(java.lang.String nodeName) {
        this.nodeName = nodeName;
    }


    /**
     * Gets the nodeNameCF value for this SearchAudit.
     * 
     * @return nodeNameCF
     */
    public java.lang.String getNodeNameCF() {
        return nodeNameCF;
    }


    /**
     * Sets the nodeNameCF value for this SearchAudit.
     * 
     * @param nodeNameCF
     */
    public void setNodeNameCF(java.lang.String nodeNameCF) {
        this.nodeNameCF = nodeNameCF;
    }


    /**
     * Gets the nonEvent value for this SearchAudit.
     * 
     * @return nonEvent
     */
    public boolean isNonEvent() {
        return nonEvent;
    }


    /**
     * Sets the nonEvent value for this SearchAudit.
     * 
     * @param nonEvent
     */
    public void setNonEvent(boolean nonEvent) {
        this.nonEvent = nonEvent;
    }


    /**
     * Gets the numOfDays value for this SearchAudit.
     * 
     * @return numOfDays
     */
    public java.lang.String getNumOfDays() {
        return numOfDays;
    }


    /**
     * Sets the numOfDays value for this SearchAudit.
     * 
     * @param numOfDays
     */
    public void setNumOfDays(java.lang.String numOfDays) {
        this.numOfDays = numOfDays;
    }


    /**
     * Gets the processName value for this SearchAudit.
     * 
     * @return processName
     */
    public java.lang.String getProcessName() {
        return processName;
    }


    /**
     * Sets the processName value for this SearchAudit.
     * 
     * @param processName
     */
    public void setProcessName(java.lang.String processName) {
        this.processName = processName;
    }


    /**
     * Gets the searchAuditID value for this SearchAudit.
     * 
     * @return searchAuditID
     */
    public java.lang.String getSearchAuditID() {
        return searchAuditID;
    }


    /**
     * Sets the searchAuditID value for this SearchAudit.
     * 
     * @param searchAuditID
     */
    public void setSearchAuditID(java.lang.String searchAuditID) {
        this.searchAuditID = searchAuditID;
    }


    /**
     * Gets the sendRecvFlag value for this SearchAudit.
     * 
     * @return sendRecvFlag
     */
    public java.lang.String getSendRecvFlag() {
        return sendRecvFlag;
    }


    /**
     * Sets the sendRecvFlag value for this SearchAudit.
     * 
     * @param sendRecvFlag
     */
    public void setSendRecvFlag(java.lang.String sendRecvFlag) {
        this.sendRecvFlag = sendRecvFlag;
    }


    /**
     * Gets the serverFileName value for this SearchAudit.
     * 
     * @return serverFileName
     */
    public java.lang.String getServerFileName() {
        return serverFileName;
    }


    /**
     * Sets the serverFileName value for this SearchAudit.
     * 
     * @param serverFileName
     */
    public void setServerFileName(java.lang.String serverFileName) {
        this.serverFileName = serverFileName;
    }


    /**
     * Gets the tableName value for this SearchAudit.
     * 
     * @return tableName
     */
    public java.lang.String getTableName() {
        return tableName;
    }


    /**
     * Sets the tableName value for this SearchAudit.
     * 
     * @param tableName
     */
    public void setTableName(java.lang.String tableName) {
        this.tableName = tableName;
    }


    /**
     * Gets the trEndTime value for this SearchAudit.
     * 
     * @return trEndTime
     */
    public AdminClient.DateTime getTrEndTime() {
        return trEndTime;
    }


    /**
     * Sets the trEndTime value for this SearchAudit.
     * 
     * @param trEndTime
     */
    public void setTrEndTime(AdminClient.DateTime trEndTime) {
        this.trEndTime = trEndTime;
    }


    /**
     * Gets the trStartTime value for this SearchAudit.
     * 
     * @return trStartTime
     */
    public AdminClient.DateTime getTrStartTime() {
        return trStartTime;
    }


    /**
     * Sets the trStartTime value for this SearchAudit.
     * 
     * @param trStartTime
     */
    public void setTrStartTime(AdminClient.DateTime trStartTime) {
        this.trStartTime = trStartTime;
    }


    /**
     * Gets the trStatus value for this SearchAudit.
     * 
     * @return trStatus
     */
    public java.lang.String getTrStatus() {
        return trStatus;
    }


    /**
     * Sets the trStatus value for this SearchAudit.
     * 
     * @param trStatus
     */
    public void setTrStatus(java.lang.String trStatus) {
        this.trStatus = trStatus;
    }


    /**
     * Gets the trUserID value for this SearchAudit.
     * 
     * @return trUserID
     */
    public java.lang.String getTrUserID() {
        return trUserID;
    }


    /**
     * Sets the trUserID value for this SearchAudit.
     * 
     * @param trUserID
     */
    public void setTrUserID(java.lang.String trUserID) {
        this.trUserID = trUserID;
    }


    /**
     * Gets the type value for this SearchAudit.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this SearchAudit.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the updatedBy value for this SearchAudit.
     * 
     * @return updatedBy
     */
    public java.lang.String getUpdatedBy() {
        return updatedBy;
    }


    /**
     * Sets the updatedBy value for this SearchAudit.
     * 
     * @param updatedBy
     */
    public void setUpdatedBy(java.lang.String updatedBy) {
        this.updatedBy = updatedBy;
    }


    /**
     * Gets the userData value for this SearchAudit.
     * 
     * @return userData
     */
    public java.lang.String getUserData() {
        return userData;
    }


    /**
     * Sets the userData value for this SearchAudit.
     * 
     * @param userData
     */
    public void setUserData(java.lang.String userData) {
        this.userData = userData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SearchAudit)) return false;
        SearchAudit other = (SearchAudit) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.JMSUserID==null && other.getJMSUserID()==null) || 
             (this.JMSUserID!=null &&
              this.JMSUserID.equals(other.getJMSUserID()))) &&
            ((this.JMSUserPwd==null && other.getJMSUserPwd()==null) || 
             (this.JMSUserPwd!=null &&
              this.JMSUserPwd.equals(other.getJMSUserPwd()))) &&
            ((this.auditID==null && other.getAuditID()==null) || 
             (this.auditID!=null &&
              this.auditID.equals(other.getAuditID()))) &&
            ((this.auditType==null && other.getAuditType()==null) || 
             (this.auditType!=null &&
              this.auditType.equals(other.getAuditType()))) &&
            ((this.aux5==null && other.getAux5()==null) || 
             (this.aux5!=null &&
              this.aux5.equals(other.getAux5()))) &&
            ((this.aux6==null && other.getAux6()==null) || 
             (this.aux6!=null &&
              this.aux6.equals(other.getAux6()))) &&
            ((this.aux7==null && other.getAux7()==null) || 
             (this.aux7!=null &&
              this.aux7.equals(other.getAux7()))) &&
            ((this.aux8==null && other.getAux8()==null) || 
             (this.aux8!=null &&
              this.aux8.equals(other.getAux8()))) &&
            ((this.clientFileName==null && other.getClientFileName()==null) || 
             (this.clientFileName!=null &&
              this.clientFileName.equals(other.getClientFileName()))) &&
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
            ((this.localTransID==null && other.getLocalTransID()==null) || 
             (this.localTransID!=null &&
              this.localTransID.equals(other.getLocalTransID()))) &&
            ((this.maxReturned==null && other.getMaxReturned()==null) || 
             (this.maxReturned!=null &&
              this.maxReturned.equals(other.getMaxReturned()))) &&
            ((this.nodeName==null && other.getNodeName()==null) || 
             (this.nodeName!=null &&
              this.nodeName.equals(other.getNodeName()))) &&
            ((this.nodeNameCF==null && other.getNodeNameCF()==null) || 
             (this.nodeNameCF!=null &&
              this.nodeNameCF.equals(other.getNodeNameCF()))) &&
            this.nonEvent == other.isNonEvent() &&
            ((this.numOfDays==null && other.getNumOfDays()==null) || 
             (this.numOfDays!=null &&
              this.numOfDays.equals(other.getNumOfDays()))) &&
            ((this.processName==null && other.getProcessName()==null) || 
             (this.processName!=null &&
              this.processName.equals(other.getProcessName()))) &&
            ((this.searchAuditID==null && other.getSearchAuditID()==null) || 
             (this.searchAuditID!=null &&
              this.searchAuditID.equals(other.getSearchAuditID()))) &&
            ((this.sendRecvFlag==null && other.getSendRecvFlag()==null) || 
             (this.sendRecvFlag!=null &&
              this.sendRecvFlag.equals(other.getSendRecvFlag()))) &&
            ((this.serverFileName==null && other.getServerFileName()==null) || 
             (this.serverFileName!=null &&
              this.serverFileName.equals(other.getServerFileName()))) &&
            ((this.tableName==null && other.getTableName()==null) || 
             (this.tableName!=null &&
              this.tableName.equals(other.getTableName()))) &&
            ((this.trEndTime==null && other.getTrEndTime()==null) || 
             (this.trEndTime!=null &&
              this.trEndTime.equals(other.getTrEndTime()))) &&
            ((this.trStartTime==null && other.getTrStartTime()==null) || 
             (this.trStartTime!=null &&
              this.trStartTime.equals(other.getTrStartTime()))) &&
            ((this.trStatus==null && other.getTrStatus()==null) || 
             (this.trStatus!=null &&
              this.trStatus.equals(other.getTrStatus()))) &&
            ((this.trUserID==null && other.getTrUserID()==null) || 
             (this.trUserID!=null &&
              this.trUserID.equals(other.getTrUserID()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.updatedBy==null && other.getUpdatedBy()==null) || 
             (this.updatedBy!=null &&
              this.updatedBy.equals(other.getUpdatedBy()))) &&
            ((this.userData==null && other.getUserData()==null) || 
             (this.userData!=null &&
              this.userData.equals(other.getUserData())));
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
        if (getJMSUserID() != null) {
            _hashCode += getJMSUserID().hashCode();
        }
        if (getJMSUserPwd() != null) {
            _hashCode += getJMSUserPwd().hashCode();
        }
        if (getAuditID() != null) {
            _hashCode += getAuditID().hashCode();
        }
        if (getAuditType() != null) {
            _hashCode += getAuditType().hashCode();
        }
        if (getAux5() != null) {
            _hashCode += getAux5().hashCode();
        }
        if (getAux6() != null) {
            _hashCode += getAux6().hashCode();
        }
        if (getAux7() != null) {
            _hashCode += getAux7().hashCode();
        }
        if (getAux8() != null) {
            _hashCode += getAux8().hashCode();
        }
        if (getClientFileName() != null) {
            _hashCode += getClientFileName().hashCode();
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
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getLocalTransID() != null) {
            _hashCode += getLocalTransID().hashCode();
        }
        if (getMaxReturned() != null) {
            _hashCode += getMaxReturned().hashCode();
        }
        if (getNodeName() != null) {
            _hashCode += getNodeName().hashCode();
        }
        if (getNodeNameCF() != null) {
            _hashCode += getNodeNameCF().hashCode();
        }
        _hashCode += (isNonEvent() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getNumOfDays() != null) {
            _hashCode += getNumOfDays().hashCode();
        }
        if (getProcessName() != null) {
            _hashCode += getProcessName().hashCode();
        }
        if (getSearchAuditID() != null) {
            _hashCode += getSearchAuditID().hashCode();
        }
        if (getSendRecvFlag() != null) {
            _hashCode += getSendRecvFlag().hashCode();
        }
        if (getServerFileName() != null) {
            _hashCode += getServerFileName().hashCode();
        }
        if (getTableName() != null) {
            _hashCode += getTableName().hashCode();
        }
        if (getTrEndTime() != null) {
            _hashCode += getTrEndTime().hashCode();
        }
        if (getTrStartTime() != null) {
            _hashCode += getTrStartTime().hashCode();
        }
        if (getTrStatus() != null) {
            _hashCode += getTrStatus().hashCode();
        }
        if (getTrUserID() != null) {
            _hashCode += getTrUserID().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getUpdatedBy() != null) {
            _hashCode += getUpdatedBy().hashCode();
        }
        if (getUserData() != null) {
            _hashCode += getUserData().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SearchAudit.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:AdministratorService", "SearchAudit"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("JMSUserID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "JMSUserID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("JMSUserPwd");
        elemField.setXmlName(new javax.xml.namespace.QName("", "JMSUserPwd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("auditID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "auditID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("auditType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "auditType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aux5");
        elemField.setXmlName(new javax.xml.namespace.QName("", "aux5"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aux6");
        elemField.setXmlName(new javax.xml.namespace.QName("", "aux6"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aux7");
        elemField.setXmlName(new javax.xml.namespace.QName("", "aux7"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aux8");
        elemField.setXmlName(new javax.xml.namespace.QName("", "aux8"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientFileName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "clientFileName"));
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
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localTransID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "localTransID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxReturned");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxReturned"));
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
        elemField.setFieldName("nodeNameCF");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nodeNameCF"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nonEvent");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nonEvent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numOfDays");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numOfDays"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "processName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchAuditID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "searchAuditID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sendRecvFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sendRecvFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serverFileName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serverFileName"));
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
        elemField.setFieldName("trEndTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "trEndTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:AdministratorService", "DateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trStartTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "trStartTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:AdministratorService", "DateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "trStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trUserID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "trUserID"));
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
        elemField.setFieldName("userData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userData"));
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
