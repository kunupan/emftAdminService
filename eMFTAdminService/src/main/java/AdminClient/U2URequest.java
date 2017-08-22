/**
 * U2URequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 11, 2014 (12:11:36 EDT) WSDL2Java emitter.
 */

package AdminClient;

public class U2URequest  implements java.io.Serializable {
    private java.lang.String archiveDirectory;

    private java.lang.String attachmentSize;

    private AdminClient.Attachment[] attachments;

    private java.lang.String availability;

    private java.lang.String createdBy;

    private AdminClient.DateTime dateArchived;

    private AdminClient.DateTime dateCreated;

    private AdminClient.DateTime dateUpdated;

    private java.lang.String delegateEmailAddr;

    private java.lang.String department;

    private java.lang.String description;

    private java.lang.String email;

    private java.lang.String emailID;

    private AdminClient.DateTime emailSendDate;

    private AdminClient.DateTime expirationDate;

    private java.lang.String expireWhen;

    private java.lang.String notifySender;

    private java.lang.String origAttachNames;

    private java.lang.String originalRequestID;

    private AdminClient.Recipient[] recipients;

    private java.lang.String repositoryDirectory;

    private java.lang.String requestID;

    private java.lang.String sender;

    private java.lang.String senderEmailAddr;

    private java.lang.String senderName;

    private java.lang.String senderNetworkAddr;

    private java.lang.String serverNameArchive;

    private java.lang.String serverNameRepository;

    private java.lang.String statusArchive;

    private java.lang.String statusEmailArchive;

    private java.lang.String statusMisc;

    private java.lang.String transferStatus;

    private java.lang.String transferStatusAsDesc;

    private java.lang.String updatedBy;

    public U2URequest() {
    }

    public U2URequest(
           java.lang.String archiveDirectory,
           java.lang.String attachmentSize,
           AdminClient.Attachment[] attachments,
           java.lang.String availability,
           java.lang.String createdBy,
           AdminClient.DateTime dateArchived,
           AdminClient.DateTime dateCreated,
           AdminClient.DateTime dateUpdated,
           java.lang.String delegateEmailAddr,
           java.lang.String department,
           java.lang.String description,
           java.lang.String email,
           java.lang.String emailID,
           AdminClient.DateTime emailSendDate,
           AdminClient.DateTime expirationDate,
           java.lang.String expireWhen,
           java.lang.String notifySender,
           java.lang.String origAttachNames,
           java.lang.String originalRequestID,
           AdminClient.Recipient[] recipients,
           java.lang.String repositoryDirectory,
           java.lang.String requestID,
           java.lang.String sender,
           java.lang.String senderEmailAddr,
           java.lang.String senderName,
           java.lang.String senderNetworkAddr,
           java.lang.String serverNameArchive,
           java.lang.String serverNameRepository,
           java.lang.String statusArchive,
           java.lang.String statusEmailArchive,
           java.lang.String statusMisc,
           java.lang.String transferStatus,
           java.lang.String transferStatusAsDesc,
           java.lang.String updatedBy) {
           this.archiveDirectory = archiveDirectory;
           this.attachmentSize = attachmentSize;
           this.attachments = attachments;
           this.availability = availability;
           this.createdBy = createdBy;
           this.dateArchived = dateArchived;
           this.dateCreated = dateCreated;
           this.dateUpdated = dateUpdated;
           this.delegateEmailAddr = delegateEmailAddr;
           this.department = department;
           this.description = description;
           this.email = email;
           this.emailID = emailID;
           this.emailSendDate = emailSendDate;
           this.expirationDate = expirationDate;
           this.expireWhen = expireWhen;
           this.notifySender = notifySender;
           this.origAttachNames = origAttachNames;
           this.originalRequestID = originalRequestID;
           this.recipients = recipients;
           this.repositoryDirectory = repositoryDirectory;
           this.requestID = requestID;
           this.sender = sender;
           this.senderEmailAddr = senderEmailAddr;
           this.senderName = senderName;
           this.senderNetworkAddr = senderNetworkAddr;
           this.serverNameArchive = serverNameArchive;
           this.serverNameRepository = serverNameRepository;
           this.statusArchive = statusArchive;
           this.statusEmailArchive = statusEmailArchive;
           this.statusMisc = statusMisc;
           this.transferStatus = transferStatus;
           this.transferStatusAsDesc = transferStatusAsDesc;
           this.updatedBy = updatedBy;
    }


    /**
     * Gets the archiveDirectory value for this U2URequest.
     * 
     * @return archiveDirectory
     */
    public java.lang.String getArchiveDirectory() {
        return archiveDirectory;
    }


    /**
     * Sets the archiveDirectory value for this U2URequest.
     * 
     * @param archiveDirectory
     */
    public void setArchiveDirectory(java.lang.String archiveDirectory) {
        this.archiveDirectory = archiveDirectory;
    }


    /**
     * Gets the attachmentSize value for this U2URequest.
     * 
     * @return attachmentSize
     */
    public java.lang.String getAttachmentSize() {
        return attachmentSize;
    }


    /**
     * Sets the attachmentSize value for this U2URequest.
     * 
     * @param attachmentSize
     */
    public void setAttachmentSize(java.lang.String attachmentSize) {
        this.attachmentSize = attachmentSize;
    }


    /**
     * Gets the attachments value for this U2URequest.
     * 
     * @return attachments
     */
    public AdminClient.Attachment[] getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this U2URequest.
     * 
     * @param attachments
     */
    public void setAttachments(AdminClient.Attachment[] attachments) {
        this.attachments = attachments;
    }


    /**
     * Gets the availability value for this U2URequest.
     * 
     * @return availability
     */
    public java.lang.String getAvailability() {
        return availability;
    }


    /**
     * Sets the availability value for this U2URequest.
     * 
     * @param availability
     */
    public void setAvailability(java.lang.String availability) {
        this.availability = availability;
    }


    /**
     * Gets the createdBy value for this U2URequest.
     * 
     * @return createdBy
     */
    public java.lang.String getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this U2URequest.
     * 
     * @param createdBy
     */
    public void setCreatedBy(java.lang.String createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the dateArchived value for this U2URequest.
     * 
     * @return dateArchived
     */
    public AdminClient.DateTime getDateArchived() {
        return dateArchived;
    }


    /**
     * Sets the dateArchived value for this U2URequest.
     * 
     * @param dateArchived
     */
    public void setDateArchived(AdminClient.DateTime dateArchived) {
        this.dateArchived = dateArchived;
    }


    /**
     * Gets the dateCreated value for this U2URequest.
     * 
     * @return dateCreated
     */
    public AdminClient.DateTime getDateCreated() {
        return dateCreated;
    }


    /**
     * Sets the dateCreated value for this U2URequest.
     * 
     * @param dateCreated
     */
    public void setDateCreated(AdminClient.DateTime dateCreated) {
        this.dateCreated = dateCreated;
    }


    /**
     * Gets the dateUpdated value for this U2URequest.
     * 
     * @return dateUpdated
     */
    public AdminClient.DateTime getDateUpdated() {
        return dateUpdated;
    }


    /**
     * Sets the dateUpdated value for this U2URequest.
     * 
     * @param dateUpdated
     */
    public void setDateUpdated(AdminClient.DateTime dateUpdated) {
        this.dateUpdated = dateUpdated;
    }


    /**
     * Gets the delegateEmailAddr value for this U2URequest.
     * 
     * @return delegateEmailAddr
     */
    public java.lang.String getDelegateEmailAddr() {
        return delegateEmailAddr;
    }


    /**
     * Sets the delegateEmailAddr value for this U2URequest.
     * 
     * @param delegateEmailAddr
     */
    public void setDelegateEmailAddr(java.lang.String delegateEmailAddr) {
        this.delegateEmailAddr = delegateEmailAddr;
    }


    /**
     * Gets the department value for this U2URequest.
     * 
     * @return department
     */
    public java.lang.String getDepartment() {
        return department;
    }


    /**
     * Sets the department value for this U2URequest.
     * 
     * @param department
     */
    public void setDepartment(java.lang.String department) {
        this.department = department;
    }


    /**
     * Gets the description value for this U2URequest.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this U2URequest.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the email value for this U2URequest.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this U2URequest.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the emailID value for this U2URequest.
     * 
     * @return emailID
     */
    public java.lang.String getEmailID() {
        return emailID;
    }


    /**
     * Sets the emailID value for this U2URequest.
     * 
     * @param emailID
     */
    public void setEmailID(java.lang.String emailID) {
        this.emailID = emailID;
    }


    /**
     * Gets the emailSendDate value for this U2URequest.
     * 
     * @return emailSendDate
     */
    public AdminClient.DateTime getEmailSendDate() {
        return emailSendDate;
    }


    /**
     * Sets the emailSendDate value for this U2URequest.
     * 
     * @param emailSendDate
     */
    public void setEmailSendDate(AdminClient.DateTime emailSendDate) {
        this.emailSendDate = emailSendDate;
    }


    /**
     * Gets the expirationDate value for this U2URequest.
     * 
     * @return expirationDate
     */
    public AdminClient.DateTime getExpirationDate() {
        return expirationDate;
    }


    /**
     * Sets the expirationDate value for this U2URequest.
     * 
     * @param expirationDate
     */
    public void setExpirationDate(AdminClient.DateTime expirationDate) {
        this.expirationDate = expirationDate;
    }


    /**
     * Gets the expireWhen value for this U2URequest.
     * 
     * @return expireWhen
     */
    public java.lang.String getExpireWhen() {
        return expireWhen;
    }


    /**
     * Sets the expireWhen value for this U2URequest.
     * 
     * @param expireWhen
     */
    public void setExpireWhen(java.lang.String expireWhen) {
        this.expireWhen = expireWhen;
    }


    /**
     * Gets the notifySender value for this U2URequest.
     * 
     * @return notifySender
     */
    public java.lang.String getNotifySender() {
        return notifySender;
    }


    /**
     * Sets the notifySender value for this U2URequest.
     * 
     * @param notifySender
     */
    public void setNotifySender(java.lang.String notifySender) {
        this.notifySender = notifySender;
    }


    /**
     * Gets the origAttachNames value for this U2URequest.
     * 
     * @return origAttachNames
     */
    public java.lang.String getOrigAttachNames() {
        return origAttachNames;
    }


    /**
     * Sets the origAttachNames value for this U2URequest.
     * 
     * @param origAttachNames
     */
    public void setOrigAttachNames(java.lang.String origAttachNames) {
        this.origAttachNames = origAttachNames;
    }


    /**
     * Gets the originalRequestID value for this U2URequest.
     * 
     * @return originalRequestID
     */
    public java.lang.String getOriginalRequestID() {
        return originalRequestID;
    }


    /**
     * Sets the originalRequestID value for this U2URequest.
     * 
     * @param originalRequestID
     */
    public void setOriginalRequestID(java.lang.String originalRequestID) {
        this.originalRequestID = originalRequestID;
    }


    /**
     * Gets the recipients value for this U2URequest.
     * 
     * @return recipients
     */
    public AdminClient.Recipient[] getRecipients() {
        return recipients;
    }


    /**
     * Sets the recipients value for this U2URequest.
     * 
     * @param recipients
     */
    public void setRecipients(AdminClient.Recipient[] recipients) {
        this.recipients = recipients;
    }


    /**
     * Gets the repositoryDirectory value for this U2URequest.
     * 
     * @return repositoryDirectory
     */
    public java.lang.String getRepositoryDirectory() {
        return repositoryDirectory;
    }


    /**
     * Sets the repositoryDirectory value for this U2URequest.
     * 
     * @param repositoryDirectory
     */
    public void setRepositoryDirectory(java.lang.String repositoryDirectory) {
        this.repositoryDirectory = repositoryDirectory;
    }


    /**
     * Gets the requestID value for this U2URequest.
     * 
     * @return requestID
     */
    public java.lang.String getRequestID() {
        return requestID;
    }


    /**
     * Sets the requestID value for this U2URequest.
     * 
     * @param requestID
     */
    public void setRequestID(java.lang.String requestID) {
        this.requestID = requestID;
    }


    /**
     * Gets the sender value for this U2URequest.
     * 
     * @return sender
     */
    public java.lang.String getSender() {
        return sender;
    }


    /**
     * Sets the sender value for this U2URequest.
     * 
     * @param sender
     */
    public void setSender(java.lang.String sender) {
        this.sender = sender;
    }


    /**
     * Gets the senderEmailAddr value for this U2URequest.
     * 
     * @return senderEmailAddr
     */
    public java.lang.String getSenderEmailAddr() {
        return senderEmailAddr;
    }


    /**
     * Sets the senderEmailAddr value for this U2URequest.
     * 
     * @param senderEmailAddr
     */
    public void setSenderEmailAddr(java.lang.String senderEmailAddr) {
        this.senderEmailAddr = senderEmailAddr;
    }


    /**
     * Gets the senderName value for this U2URequest.
     * 
     * @return senderName
     */
    public java.lang.String getSenderName() {
        return senderName;
    }


    /**
     * Sets the senderName value for this U2URequest.
     * 
     * @param senderName
     */
    public void setSenderName(java.lang.String senderName) {
        this.senderName = senderName;
    }


    /**
     * Gets the senderNetworkAddr value for this U2URequest.
     * 
     * @return senderNetworkAddr
     */
    public java.lang.String getSenderNetworkAddr() {
        return senderNetworkAddr;
    }


    /**
     * Sets the senderNetworkAddr value for this U2URequest.
     * 
     * @param senderNetworkAddr
     */
    public void setSenderNetworkAddr(java.lang.String senderNetworkAddr) {
        this.senderNetworkAddr = senderNetworkAddr;
    }


    /**
     * Gets the serverNameArchive value for this U2URequest.
     * 
     * @return serverNameArchive
     */
    public java.lang.String getServerNameArchive() {
        return serverNameArchive;
    }


    /**
     * Sets the serverNameArchive value for this U2URequest.
     * 
     * @param serverNameArchive
     */
    public void setServerNameArchive(java.lang.String serverNameArchive) {
        this.serverNameArchive = serverNameArchive;
    }


    /**
     * Gets the serverNameRepository value for this U2URequest.
     * 
     * @return serverNameRepository
     */
    public java.lang.String getServerNameRepository() {
        return serverNameRepository;
    }


    /**
     * Sets the serverNameRepository value for this U2URequest.
     * 
     * @param serverNameRepository
     */
    public void setServerNameRepository(java.lang.String serverNameRepository) {
        this.serverNameRepository = serverNameRepository;
    }


    /**
     * Gets the statusArchive value for this U2URequest.
     * 
     * @return statusArchive
     */
    public java.lang.String getStatusArchive() {
        return statusArchive;
    }


    /**
     * Sets the statusArchive value for this U2URequest.
     * 
     * @param statusArchive
     */
    public void setStatusArchive(java.lang.String statusArchive) {
        this.statusArchive = statusArchive;
    }


    /**
     * Gets the statusEmailArchive value for this U2URequest.
     * 
     * @return statusEmailArchive
     */
    public java.lang.String getStatusEmailArchive() {
        return statusEmailArchive;
    }


    /**
     * Sets the statusEmailArchive value for this U2URequest.
     * 
     * @param statusEmailArchive
     */
    public void setStatusEmailArchive(java.lang.String statusEmailArchive) {
        this.statusEmailArchive = statusEmailArchive;
    }


    /**
     * Gets the statusMisc value for this U2URequest.
     * 
     * @return statusMisc
     */
    public java.lang.String getStatusMisc() {
        return statusMisc;
    }


    /**
     * Sets the statusMisc value for this U2URequest.
     * 
     * @param statusMisc
     */
    public void setStatusMisc(java.lang.String statusMisc) {
        this.statusMisc = statusMisc;
    }


    /**
     * Gets the transferStatus value for this U2URequest.
     * 
     * @return transferStatus
     */
    public java.lang.String getTransferStatus() {
        return transferStatus;
    }


    /**
     * Sets the transferStatus value for this U2URequest.
     * 
     * @param transferStatus
     */
    public void setTransferStatus(java.lang.String transferStatus) {
        this.transferStatus = transferStatus;
    }


    /**
     * Gets the transferStatusAsDesc value for this U2URequest.
     * 
     * @return transferStatusAsDesc
     */
    public java.lang.String getTransferStatusAsDesc() {
        return transferStatusAsDesc;
    }


    /**
     * Sets the transferStatusAsDesc value for this U2URequest.
     * 
     * @param transferStatusAsDesc
     */
    public void setTransferStatusAsDesc(java.lang.String transferStatusAsDesc) {
        this.transferStatusAsDesc = transferStatusAsDesc;
    }


    /**
     * Gets the updatedBy value for this U2URequest.
     * 
     * @return updatedBy
     */
    public java.lang.String getUpdatedBy() {
        return updatedBy;
    }


    /**
     * Sets the updatedBy value for this U2URequest.
     * 
     * @param updatedBy
     */
    public void setUpdatedBy(java.lang.String updatedBy) {
        this.updatedBy = updatedBy;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof U2URequest)) return false;
        U2URequest other = (U2URequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.archiveDirectory==null && other.getArchiveDirectory()==null) || 
             (this.archiveDirectory!=null &&
              this.archiveDirectory.equals(other.getArchiveDirectory()))) &&
            ((this.attachmentSize==null && other.getAttachmentSize()==null) || 
             (this.attachmentSize!=null &&
              this.attachmentSize.equals(other.getAttachmentSize()))) &&
            ((this.attachments==null && other.getAttachments()==null) || 
             (this.attachments!=null &&
              java.util.Arrays.equals(this.attachments, other.getAttachments()))) &&
            ((this.availability==null && other.getAvailability()==null) || 
             (this.availability!=null &&
              this.availability.equals(other.getAvailability()))) &&
            ((this.createdBy==null && other.getCreatedBy()==null) || 
             (this.createdBy!=null &&
              this.createdBy.equals(other.getCreatedBy()))) &&
            ((this.dateArchived==null && other.getDateArchived()==null) || 
             (this.dateArchived!=null &&
              this.dateArchived.equals(other.getDateArchived()))) &&
            ((this.dateCreated==null && other.getDateCreated()==null) || 
             (this.dateCreated!=null &&
              this.dateCreated.equals(other.getDateCreated()))) &&
            ((this.dateUpdated==null && other.getDateUpdated()==null) || 
             (this.dateUpdated!=null &&
              this.dateUpdated.equals(other.getDateUpdated()))) &&
            ((this.delegateEmailAddr==null && other.getDelegateEmailAddr()==null) || 
             (this.delegateEmailAddr!=null &&
              this.delegateEmailAddr.equals(other.getDelegateEmailAddr()))) &&
            ((this.department==null && other.getDepartment()==null) || 
             (this.department!=null &&
              this.department.equals(other.getDepartment()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.emailID==null && other.getEmailID()==null) || 
             (this.emailID!=null &&
              this.emailID.equals(other.getEmailID()))) &&
            ((this.emailSendDate==null && other.getEmailSendDate()==null) || 
             (this.emailSendDate!=null &&
              this.emailSendDate.equals(other.getEmailSendDate()))) &&
            ((this.expirationDate==null && other.getExpirationDate()==null) || 
             (this.expirationDate!=null &&
              this.expirationDate.equals(other.getExpirationDate()))) &&
            ((this.expireWhen==null && other.getExpireWhen()==null) || 
             (this.expireWhen!=null &&
              this.expireWhen.equals(other.getExpireWhen()))) &&
            ((this.notifySender==null && other.getNotifySender()==null) || 
             (this.notifySender!=null &&
              this.notifySender.equals(other.getNotifySender()))) &&
            ((this.origAttachNames==null && other.getOrigAttachNames()==null) || 
             (this.origAttachNames!=null &&
              this.origAttachNames.equals(other.getOrigAttachNames()))) &&
            ((this.originalRequestID==null && other.getOriginalRequestID()==null) || 
             (this.originalRequestID!=null &&
              this.originalRequestID.equals(other.getOriginalRequestID()))) &&
            ((this.recipients==null && other.getRecipients()==null) || 
             (this.recipients!=null &&
              java.util.Arrays.equals(this.recipients, other.getRecipients()))) &&
            ((this.repositoryDirectory==null && other.getRepositoryDirectory()==null) || 
             (this.repositoryDirectory!=null &&
              this.repositoryDirectory.equals(other.getRepositoryDirectory()))) &&
            ((this.requestID==null && other.getRequestID()==null) || 
             (this.requestID!=null &&
              this.requestID.equals(other.getRequestID()))) &&
            ((this.sender==null && other.getSender()==null) || 
             (this.sender!=null &&
              this.sender.equals(other.getSender()))) &&
            ((this.senderEmailAddr==null && other.getSenderEmailAddr()==null) || 
             (this.senderEmailAddr!=null &&
              this.senderEmailAddr.equals(other.getSenderEmailAddr()))) &&
            ((this.senderName==null && other.getSenderName()==null) || 
             (this.senderName!=null &&
              this.senderName.equals(other.getSenderName()))) &&
            ((this.senderNetworkAddr==null && other.getSenderNetworkAddr()==null) || 
             (this.senderNetworkAddr!=null &&
              this.senderNetworkAddr.equals(other.getSenderNetworkAddr()))) &&
            ((this.serverNameArchive==null && other.getServerNameArchive()==null) || 
             (this.serverNameArchive!=null &&
              this.serverNameArchive.equals(other.getServerNameArchive()))) &&
            ((this.serverNameRepository==null && other.getServerNameRepository()==null) || 
             (this.serverNameRepository!=null &&
              this.serverNameRepository.equals(other.getServerNameRepository()))) &&
            ((this.statusArchive==null && other.getStatusArchive()==null) || 
             (this.statusArchive!=null &&
              this.statusArchive.equals(other.getStatusArchive()))) &&
            ((this.statusEmailArchive==null && other.getStatusEmailArchive()==null) || 
             (this.statusEmailArchive!=null &&
              this.statusEmailArchive.equals(other.getStatusEmailArchive()))) &&
            ((this.statusMisc==null && other.getStatusMisc()==null) || 
             (this.statusMisc!=null &&
              this.statusMisc.equals(other.getStatusMisc()))) &&
            ((this.transferStatus==null && other.getTransferStatus()==null) || 
             (this.transferStatus!=null &&
              this.transferStatus.equals(other.getTransferStatus()))) &&
            ((this.transferStatusAsDesc==null && other.getTransferStatusAsDesc()==null) || 
             (this.transferStatusAsDesc!=null &&
              this.transferStatusAsDesc.equals(other.getTransferStatusAsDesc()))) &&
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
        if (getArchiveDirectory() != null) {
            _hashCode += getArchiveDirectory().hashCode();
        }
        if (getAttachmentSize() != null) {
            _hashCode += getAttachmentSize().hashCode();
        }
        if (getAttachments() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAttachments());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAttachments(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAvailability() != null) {
            _hashCode += getAvailability().hashCode();
        }
        if (getCreatedBy() != null) {
            _hashCode += getCreatedBy().hashCode();
        }
        if (getDateArchived() != null) {
            _hashCode += getDateArchived().hashCode();
        }
        if (getDateCreated() != null) {
            _hashCode += getDateCreated().hashCode();
        }
        if (getDateUpdated() != null) {
            _hashCode += getDateUpdated().hashCode();
        }
        if (getDelegateEmailAddr() != null) {
            _hashCode += getDelegateEmailAddr().hashCode();
        }
        if (getDepartment() != null) {
            _hashCode += getDepartment().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getEmailID() != null) {
            _hashCode += getEmailID().hashCode();
        }
        if (getEmailSendDate() != null) {
            _hashCode += getEmailSendDate().hashCode();
        }
        if (getExpirationDate() != null) {
            _hashCode += getExpirationDate().hashCode();
        }
        if (getExpireWhen() != null) {
            _hashCode += getExpireWhen().hashCode();
        }
        if (getNotifySender() != null) {
            _hashCode += getNotifySender().hashCode();
        }
        if (getOrigAttachNames() != null) {
            _hashCode += getOrigAttachNames().hashCode();
        }
        if (getOriginalRequestID() != null) {
            _hashCode += getOriginalRequestID().hashCode();
        }
        if (getRecipients() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRecipients());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRecipients(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRepositoryDirectory() != null) {
            _hashCode += getRepositoryDirectory().hashCode();
        }
        if (getRequestID() != null) {
            _hashCode += getRequestID().hashCode();
        }
        if (getSender() != null) {
            _hashCode += getSender().hashCode();
        }
        if (getSenderEmailAddr() != null) {
            _hashCode += getSenderEmailAddr().hashCode();
        }
        if (getSenderName() != null) {
            _hashCode += getSenderName().hashCode();
        }
        if (getSenderNetworkAddr() != null) {
            _hashCode += getSenderNetworkAddr().hashCode();
        }
        if (getServerNameArchive() != null) {
            _hashCode += getServerNameArchive().hashCode();
        }
        if (getServerNameRepository() != null) {
            _hashCode += getServerNameRepository().hashCode();
        }
        if (getStatusArchive() != null) {
            _hashCode += getStatusArchive().hashCode();
        }
        if (getStatusEmailArchive() != null) {
            _hashCode += getStatusEmailArchive().hashCode();
        }
        if (getStatusMisc() != null) {
            _hashCode += getStatusMisc().hashCode();
        }
        if (getTransferStatus() != null) {
            _hashCode += getTransferStatus().hashCode();
        }
        if (getTransferStatusAsDesc() != null) {
            _hashCode += getTransferStatusAsDesc().hashCode();
        }
        if (getUpdatedBy() != null) {
            _hashCode += getUpdatedBy().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(U2URequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:AdministratorService", "U2URequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("archiveDirectory");
        elemField.setXmlName(new javax.xml.namespace.QName("", "archiveDirectory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attachmentSize");
        elemField.setXmlName(new javax.xml.namespace.QName("", "attachmentSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attachments");
        elemField.setXmlName(new javax.xml.namespace.QName("", "attachments"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:AdministratorService", "Attachment"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("dateArchived");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dateArchived"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:AdministratorService", "DateTime"));
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
        elemField.setFieldName("delegateEmailAddr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "delegateEmailAddr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("", "email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "emailID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailSendDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "emailSendDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:AdministratorService", "DateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expirationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "expirationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:AdministratorService", "DateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expireWhen");
        elemField.setXmlName(new javax.xml.namespace.QName("", "expireWhen"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notifySender");
        elemField.setXmlName(new javax.xml.namespace.QName("", "notifySender"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("origAttachNames");
        elemField.setXmlName(new javax.xml.namespace.QName("", "origAttachNames"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originalRequestID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "originalRequestID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recipients");
        elemField.setXmlName(new javax.xml.namespace.QName("", "recipients"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:AdministratorService", "Recipient"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("repositoryDirectory");
        elemField.setXmlName(new javax.xml.namespace.QName("", "repositoryDirectory"));
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
        elemField.setFieldName("sender");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sender"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senderEmailAddr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "senderEmailAddr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senderName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "senderName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senderNetworkAddr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "senderNetworkAddr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serverNameArchive");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serverNameArchive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serverNameRepository");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serverNameRepository"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusArchive");
        elemField.setXmlName(new javax.xml.namespace.QName("", "statusArchive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusEmailArchive");
        elemField.setXmlName(new javax.xml.namespace.QName("", "statusEmailArchive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusMisc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "statusMisc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transferStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferStatusAsDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transferStatusAsDesc"));
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
