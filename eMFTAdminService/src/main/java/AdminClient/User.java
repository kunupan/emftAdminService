/**
 * User.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 11, 2014 (12:11:36 EDT) WSDL2Java emitter.
 */

package AdminClient;

public class User  implements java.io.Serializable {
    private boolean AMUser;

    private java.lang.String CFAuthType;

    private java.lang.String FTPAuthType;

    private java.lang.String HTTPSAuthType;

    private boolean LDAPDerivedUser;

    private java.lang.String PGPAllowUserAddKey;

    private java.lang.String SSHAuthType;

    private java.lang.String SSOToken;

    private boolean activeUserType;

    private java.lang.String allowableProtocol;

    private java.lang.String certificateDN;

    private java.lang.String companyName;

    private java.lang.String createType;

    private java.lang.String createdBy;

    private AdminClient.DateTime dateCreated;

    private AdminClient.DateTime dateLastAccess;

    private AdminClient.DateTime dateUpdated;

    private java.lang.String defaultRole;

    private java.lang.String department;

    private java.lang.String description;

    private java.lang.String disableFlag;

    private java.lang.String emailAddr;

    private AdminClient.DateTime endDate;

    private AdminClient.DateTime expirationDate;

    private java.lang.String fullName;

    private boolean fullUser;

    private boolean guestUser;

    private java.lang.String homeDirFID;

    private java.lang.String id;

    private boolean internal;

    private java.lang.String lockFlag;

    private java.lang.String manageDepts;

    private java.lang.String maxFileSize;

    private java.lang.String netMask;

    private java.lang.String password;

    private java.lang.String phoneNumber;

    private boolean powerUser;

    private java.lang.String pwdAllowSelfChange;

    private java.lang.String pwdExpiresFlag;

    private java.lang.String pwdForceChange;

    private java.lang.String pwdHistory;

    private AdminClient.DateTime pwdLastChangeDate;

    private java.lang.String pwdResetExp;

    private java.lang.String pwdResetKey;

    private java.lang.String quotaSize;

    private java.lang.String restrictUserIPAddress;

    private java.lang.String restrictedIPAddress;

    private java.lang.String sendOnlyToUserID;

    private java.lang.String signature;

    private java.lang.String signatureUse;

    private AdminClient.DateTime startDate;

    private java.lang.String traceFlag;

    private java.lang.String updatedBy;

    private java.lang.String validDays;

    private java.lang.String validEndTime;

    private java.lang.String validStartTime;

    private boolean validUserType;

    private java.lang.String visibility;

    public User() {
    }

    public User(
           boolean AMUser,
           java.lang.String CFAuthType,
           java.lang.String FTPAuthType,
           java.lang.String HTTPSAuthType,
           boolean LDAPDerivedUser,
           java.lang.String PGPAllowUserAddKey,
           java.lang.String SSHAuthType,
           java.lang.String SSOToken,
           boolean activeUserType,
           java.lang.String allowableProtocol,
           java.lang.String certificateDN,
           java.lang.String companyName,
           java.lang.String createType,
           java.lang.String createdBy,
           AdminClient.DateTime dateCreated,
           AdminClient.DateTime dateLastAccess,
           AdminClient.DateTime dateUpdated,
           java.lang.String defaultRole,
           java.lang.String department,
           java.lang.String description,
           java.lang.String disableFlag,
           java.lang.String emailAddr,
           AdminClient.DateTime endDate,
           AdminClient.DateTime expirationDate,
           java.lang.String fullName,
           boolean fullUser,
           boolean guestUser,
           java.lang.String homeDirFID,
           java.lang.String id,
           boolean internal,
           java.lang.String lockFlag,
           java.lang.String manageDepts,
           java.lang.String maxFileSize,
           java.lang.String netMask,
           java.lang.String password,
           java.lang.String phoneNumber,
           boolean powerUser,
           java.lang.String pwdAllowSelfChange,
           java.lang.String pwdExpiresFlag,
           java.lang.String pwdForceChange,
           java.lang.String pwdHistory,
           AdminClient.DateTime pwdLastChangeDate,
           java.lang.String pwdResetExp,
           java.lang.String pwdResetKey,
           java.lang.String quotaSize,
           java.lang.String restrictUserIPAddress,
           java.lang.String restrictedIPAddress,
           java.lang.String sendOnlyToUserID,
           java.lang.String signature,
           java.lang.String signatureUse,
           AdminClient.DateTime startDate,
           java.lang.String traceFlag,
           java.lang.String updatedBy,
           java.lang.String validDays,
           java.lang.String validEndTime,
           java.lang.String validStartTime,
           boolean validUserType,
           java.lang.String visibility) {
           this.AMUser = AMUser;
           this.CFAuthType = CFAuthType;
           this.FTPAuthType = FTPAuthType;
           this.HTTPSAuthType = HTTPSAuthType;
           this.LDAPDerivedUser = LDAPDerivedUser;
           this.PGPAllowUserAddKey = PGPAllowUserAddKey;
           this.SSHAuthType = SSHAuthType;
           this.SSOToken = SSOToken;
           this.activeUserType = activeUserType;
           this.allowableProtocol = allowableProtocol;
           this.certificateDN = certificateDN;
           this.companyName = companyName;
           this.createType = createType;
           this.createdBy = createdBy;
           this.dateCreated = dateCreated;
           this.dateLastAccess = dateLastAccess;
           this.dateUpdated = dateUpdated;
           this.defaultRole = defaultRole;
           this.department = department;
           this.description = description;
           this.disableFlag = disableFlag;
           this.emailAddr = emailAddr;
           this.endDate = endDate;
           this.expirationDate = expirationDate;
           this.fullName = fullName;
           this.fullUser = fullUser;
           this.guestUser = guestUser;
           this.homeDirFID = homeDirFID;
           this.id = id;
           this.internal = internal;
           this.lockFlag = lockFlag;
           this.manageDepts = manageDepts;
           this.maxFileSize = maxFileSize;
           this.netMask = netMask;
           this.password = password;
           this.phoneNumber = phoneNumber;
           this.powerUser = powerUser;
           this.pwdAllowSelfChange = pwdAllowSelfChange;
           this.pwdExpiresFlag = pwdExpiresFlag;
           this.pwdForceChange = pwdForceChange;
           this.pwdHistory = pwdHistory;
           this.pwdLastChangeDate = pwdLastChangeDate;
           this.pwdResetExp = pwdResetExp;
           this.pwdResetKey = pwdResetKey;
           this.quotaSize = quotaSize;
           this.restrictUserIPAddress = restrictUserIPAddress;
           this.restrictedIPAddress = restrictedIPAddress;
           this.sendOnlyToUserID = sendOnlyToUserID;
           this.signature = signature;
           this.signatureUse = signatureUse;
           this.startDate = startDate;
           this.traceFlag = traceFlag;
           this.updatedBy = updatedBy;
           this.validDays = validDays;
           this.validEndTime = validEndTime;
           this.validStartTime = validStartTime;
           this.validUserType = validUserType;
           this.visibility = visibility;
    }


    /**
     * Gets the AMUser value for this User.
     * 
     * @return AMUser
     */
    public boolean isAMUser() {
        return AMUser;
    }


    /**
     * Sets the AMUser value for this User.
     * 
     * @param AMUser
     */
    public void setAMUser(boolean AMUser) {
        this.AMUser = AMUser;
    }


    /**
     * Gets the CFAuthType value for this User.
     * 
     * @return CFAuthType
     */
    public java.lang.String getCFAuthType() {
        return CFAuthType;
    }


    /**
     * Sets the CFAuthType value for this User.
     * 
     * @param CFAuthType
     */
    public void setCFAuthType(java.lang.String CFAuthType) {
        this.CFAuthType = CFAuthType;
    }


    /**
     * Gets the FTPAuthType value for this User.
     * 
     * @return FTPAuthType
     */
    public java.lang.String getFTPAuthType() {
        return FTPAuthType;
    }


    /**
     * Sets the FTPAuthType value for this User.
     * 
     * @param FTPAuthType
     */
    public void setFTPAuthType(java.lang.String FTPAuthType) {
        this.FTPAuthType = FTPAuthType;
    }


    /**
     * Gets the HTTPSAuthType value for this User.
     * 
     * @return HTTPSAuthType
     */
    public java.lang.String getHTTPSAuthType() {
        return HTTPSAuthType;
    }


    /**
     * Sets the HTTPSAuthType value for this User.
     * 
     * @param HTTPSAuthType
     */
    public void setHTTPSAuthType(java.lang.String HTTPSAuthType) {
        this.HTTPSAuthType = HTTPSAuthType;
    }


    /**
     * Gets the LDAPDerivedUser value for this User.
     * 
     * @return LDAPDerivedUser
     */
    public boolean isLDAPDerivedUser() {
        return LDAPDerivedUser;
    }


    /**
     * Sets the LDAPDerivedUser value for this User.
     * 
     * @param LDAPDerivedUser
     */
    public void setLDAPDerivedUser(boolean LDAPDerivedUser) {
        this.LDAPDerivedUser = LDAPDerivedUser;
    }


    /**
     * Gets the PGPAllowUserAddKey value for this User.
     * 
     * @return PGPAllowUserAddKey
     */
    public java.lang.String getPGPAllowUserAddKey() {
        return PGPAllowUserAddKey;
    }


    /**
     * Sets the PGPAllowUserAddKey value for this User.
     * 
     * @param PGPAllowUserAddKey
     */
    public void setPGPAllowUserAddKey(java.lang.String PGPAllowUserAddKey) {
        this.PGPAllowUserAddKey = PGPAllowUserAddKey;
    }


    /**
     * Gets the SSHAuthType value for this User.
     * 
     * @return SSHAuthType
     */
    public java.lang.String getSSHAuthType() {
        return SSHAuthType;
    }


    /**
     * Sets the SSHAuthType value for this User.
     * 
     * @param SSHAuthType
     */
    public void setSSHAuthType(java.lang.String SSHAuthType) {
        this.SSHAuthType = SSHAuthType;
    }


    /**
     * Gets the SSOToken value for this User.
     * 
     * @return SSOToken
     */
    public java.lang.String getSSOToken() {
        return SSOToken;
    }


    /**
     * Sets the SSOToken value for this User.
     * 
     * @param SSOToken
     */
    public void setSSOToken(java.lang.String SSOToken) {
        this.SSOToken = SSOToken;
    }


    /**
     * Gets the activeUserType value for this User.
     * 
     * @return activeUserType
     */
    public boolean isActiveUserType() {
        return activeUserType;
    }


    /**
     * Sets the activeUserType value for this User.
     * 
     * @param activeUserType
     */
    public void setActiveUserType(boolean activeUserType) {
        this.activeUserType = activeUserType;
    }


    /**
     * Gets the allowableProtocol value for this User.
     * 
     * @return allowableProtocol
     */
    public java.lang.String getAllowableProtocol() {
        return allowableProtocol;
    }


    /**
     * Sets the allowableProtocol value for this User.
     * 
     * @param allowableProtocol
     */
    public void setAllowableProtocol(java.lang.String allowableProtocol) {
        this.allowableProtocol = allowableProtocol;
    }


    /**
     * Gets the certificateDN value for this User.
     * 
     * @return certificateDN
     */
    public java.lang.String getCertificateDN() {
        return certificateDN;
    }


    /**
     * Sets the certificateDN value for this User.
     * 
     * @param certificateDN
     */
    public void setCertificateDN(java.lang.String certificateDN) {
        this.certificateDN = certificateDN;
    }


    /**
     * Gets the companyName value for this User.
     * 
     * @return companyName
     */
    public java.lang.String getCompanyName() {
        return companyName;
    }


    /**
     * Sets the companyName value for this User.
     * 
     * @param companyName
     */
    public void setCompanyName(java.lang.String companyName) {
        this.companyName = companyName;
    }


    /**
     * Gets the createType value for this User.
     * 
     * @return createType
     */
    public java.lang.String getCreateType() {
        return createType;
    }


    /**
     * Sets the createType value for this User.
     * 
     * @param createType
     */
    public void setCreateType(java.lang.String createType) {
        this.createType = createType;
    }


    /**
     * Gets the createdBy value for this User.
     * 
     * @return createdBy
     */
    public java.lang.String getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this User.
     * 
     * @param createdBy
     */
    public void setCreatedBy(java.lang.String createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the dateCreated value for this User.
     * 
     * @return dateCreated
     */
    public AdminClient.DateTime getDateCreated() {
        return dateCreated;
    }


    /**
     * Sets the dateCreated value for this User.
     * 
     * @param dateCreated
     */
    public void setDateCreated(AdminClient.DateTime dateCreated) {
        this.dateCreated = dateCreated;
    }


    /**
     * Gets the dateLastAccess value for this User.
     * 
     * @return dateLastAccess
     */
    public AdminClient.DateTime getDateLastAccess() {
        return dateLastAccess;
    }


    /**
     * Sets the dateLastAccess value for this User.
     * 
     * @param dateLastAccess
     */
    public void setDateLastAccess(AdminClient.DateTime dateLastAccess) {
        this.dateLastAccess = dateLastAccess;
    }


    /**
     * Gets the dateUpdated value for this User.
     * 
     * @return dateUpdated
     */
    public AdminClient.DateTime getDateUpdated() {
        return dateUpdated;
    }


    /**
     * Sets the dateUpdated value for this User.
     * 
     * @param dateUpdated
     */
    public void setDateUpdated(AdminClient.DateTime dateUpdated) {
        this.dateUpdated = dateUpdated;
    }


    /**
     * Gets the defaultRole value for this User.
     * 
     * @return defaultRole
     */
    public java.lang.String getDefaultRole() {
        return defaultRole;
    }


    /**
     * Sets the defaultRole value for this User.
     * 
     * @param defaultRole
     */
    public void setDefaultRole(java.lang.String defaultRole) {
        this.defaultRole = defaultRole;
    }


    /**
     * Gets the department value for this User.
     * 
     * @return department
     */
    public java.lang.String getDepartment() {
        return department;
    }


    /**
     * Sets the department value for this User.
     * 
     * @param department
     */
    public void setDepartment(java.lang.String department) {
        this.department = department;
    }


    /**
     * Gets the description value for this User.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this User.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the disableFlag value for this User.
     * 
     * @return disableFlag
     */
    public java.lang.String getDisableFlag() {
        return disableFlag;
    }


    /**
     * Sets the disableFlag value for this User.
     * 
     * @param disableFlag
     */
    public void setDisableFlag(java.lang.String disableFlag) {
        this.disableFlag = disableFlag;
    }


    /**
     * Gets the emailAddr value for this User.
     * 
     * @return emailAddr
     */
    public java.lang.String getEmailAddr() {
        return emailAddr;
    }


    /**
     * Sets the emailAddr value for this User.
     * 
     * @param emailAddr
     */
    public void setEmailAddr(java.lang.String emailAddr) {
        this.emailAddr = emailAddr;
    }


    /**
     * Gets the endDate value for this User.
     * 
     * @return endDate
     */
    public AdminClient.DateTime getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this User.
     * 
     * @param endDate
     */
    public void setEndDate(AdminClient.DateTime endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the expirationDate value for this User.
     * 
     * @return expirationDate
     */
    public AdminClient.DateTime getExpirationDate() {
        return expirationDate;
    }


    /**
     * Sets the expirationDate value for this User.
     * 
     * @param expirationDate
     */
    public void setExpirationDate(AdminClient.DateTime expirationDate) {
        this.expirationDate = expirationDate;
    }


    /**
     * Gets the fullName value for this User.
     * 
     * @return fullName
     */
    public java.lang.String getFullName() {
        return fullName;
    }


    /**
     * Sets the fullName value for this User.
     * 
     * @param fullName
     */
    public void setFullName(java.lang.String fullName) {
        this.fullName = fullName;
    }


    /**
     * Gets the fullUser value for this User.
     * 
     * @return fullUser
     */
    public boolean isFullUser() {
        return fullUser;
    }


    /**
     * Sets the fullUser value for this User.
     * 
     * @param fullUser
     */
    public void setFullUser(boolean fullUser) {
        this.fullUser = fullUser;
    }


    /**
     * Gets the guestUser value for this User.
     * 
     * @return guestUser
     */
    public boolean isGuestUser() {
        return guestUser;
    }


    /**
     * Sets the guestUser value for this User.
     * 
     * @param guestUser
     */
    public void setGuestUser(boolean guestUser) {
        this.guestUser = guestUser;
    }


    /**
     * Gets the homeDirFID value for this User.
     * 
     * @return homeDirFID
     */
    public java.lang.String getHomeDirFID() {
        return homeDirFID;
    }


    /**
     * Sets the homeDirFID value for this User.
     * 
     * @param homeDirFID
     */
    public void setHomeDirFID(java.lang.String homeDirFID) {
        this.homeDirFID = homeDirFID;
    }


    /**
     * Gets the id value for this User.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this User.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the internal value for this User.
     * 
     * @return internal
     */
    public boolean isInternal() {
        return internal;
    }


    /**
     * Sets the internal value for this User.
     * 
     * @param internal
     */
    public void setInternal(boolean internal) {
        this.internal = internal;
    }


    /**
     * Gets the lockFlag value for this User.
     * 
     * @return lockFlag
     */
    public java.lang.String getLockFlag() {
        return lockFlag;
    }


    /**
     * Sets the lockFlag value for this User.
     * 
     * @param lockFlag
     */
    public void setLockFlag(java.lang.String lockFlag) {
        this.lockFlag = lockFlag;
    }


    /**
     * Gets the manageDepts value for this User.
     * 
     * @return manageDepts
     */
    public java.lang.String getManageDepts() {
        return manageDepts;
    }


    /**
     * Sets the manageDepts value for this User.
     * 
     * @param manageDepts
     */
    public void setManageDepts(java.lang.String manageDepts) {
        this.manageDepts = manageDepts;
    }


    /**
     * Gets the maxFileSize value for this User.
     * 
     * @return maxFileSize
     */
    public java.lang.String getMaxFileSize() {
        return maxFileSize;
    }


    /**
     * Sets the maxFileSize value for this User.
     * 
     * @param maxFileSize
     */
    public void setMaxFileSize(java.lang.String maxFileSize) {
        this.maxFileSize = maxFileSize;
    }


    /**
     * Gets the netMask value for this User.
     * 
     * @return netMask
     */
    public java.lang.String getNetMask() {
        return netMask;
    }


    /**
     * Sets the netMask value for this User.
     * 
     * @param netMask
     */
    public void setNetMask(java.lang.String netMask) {
        this.netMask = netMask;
    }


    /**
     * Gets the password value for this User.
     * 
     * @return password
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this User.
     * 
     * @param password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }


    /**
     * Gets the phoneNumber value for this User.
     * 
     * @return phoneNumber
     */
    public java.lang.String getPhoneNumber() {
        return phoneNumber;
    }


    /**
     * Sets the phoneNumber value for this User.
     * 
     * @param phoneNumber
     */
    public void setPhoneNumber(java.lang.String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    /**
     * Gets the powerUser value for this User.
     * 
     * @return powerUser
     */
    public boolean isPowerUser() {
        return powerUser;
    }


    /**
     * Sets the powerUser value for this User.
     * 
     * @param powerUser
     */
    public void setPowerUser(boolean powerUser) {
        this.powerUser = powerUser;
    }


    /**
     * Gets the pwdAllowSelfChange value for this User.
     * 
     * @return pwdAllowSelfChange
     */
    public java.lang.String getPwdAllowSelfChange() {
        return pwdAllowSelfChange;
    }


    /**
     * Sets the pwdAllowSelfChange value for this User.
     * 
     * @param pwdAllowSelfChange
     */
    public void setPwdAllowSelfChange(java.lang.String pwdAllowSelfChange) {
        this.pwdAllowSelfChange = pwdAllowSelfChange;
    }


    /**
     * Gets the pwdExpiresFlag value for this User.
     * 
     * @return pwdExpiresFlag
     */
    public java.lang.String getPwdExpiresFlag() {
        return pwdExpiresFlag;
    }


    /**
     * Sets the pwdExpiresFlag value for this User.
     * 
     * @param pwdExpiresFlag
     */
    public void setPwdExpiresFlag(java.lang.String pwdExpiresFlag) {
        this.pwdExpiresFlag = pwdExpiresFlag;
    }


    /**
     * Gets the pwdForceChange value for this User.
     * 
     * @return pwdForceChange
     */
    public java.lang.String getPwdForceChange() {
        return pwdForceChange;
    }


    /**
     * Sets the pwdForceChange value for this User.
     * 
     * @param pwdForceChange
     */
    public void setPwdForceChange(java.lang.String pwdForceChange) {
        this.pwdForceChange = pwdForceChange;
    }


    /**
     * Gets the pwdHistory value for this User.
     * 
     * @return pwdHistory
     */
    public java.lang.String getPwdHistory() {
        return pwdHistory;
    }


    /**
     * Sets the pwdHistory value for this User.
     * 
     * @param pwdHistory
     */
    public void setPwdHistory(java.lang.String pwdHistory) {
        this.pwdHistory = pwdHistory;
    }


    /**
     * Gets the pwdLastChangeDate value for this User.
     * 
     * @return pwdLastChangeDate
     */
    public AdminClient.DateTime getPwdLastChangeDate() {
        return pwdLastChangeDate;
    }


    /**
     * Sets the pwdLastChangeDate value for this User.
     * 
     * @param pwdLastChangeDate
     */
    public void setPwdLastChangeDate(AdminClient.DateTime pwdLastChangeDate) {
        this.pwdLastChangeDate = pwdLastChangeDate;
    }


    /**
     * Gets the pwdResetExp value for this User.
     * 
     * @return pwdResetExp
     */
    public java.lang.String getPwdResetExp() {
        return pwdResetExp;
    }


    /**
     * Sets the pwdResetExp value for this User.
     * 
     * @param pwdResetExp
     */
    public void setPwdResetExp(java.lang.String pwdResetExp) {
        this.pwdResetExp = pwdResetExp;
    }


    /**
     * Gets the pwdResetKey value for this User.
     * 
     * @return pwdResetKey
     */
    public java.lang.String getPwdResetKey() {
        return pwdResetKey;
    }


    /**
     * Sets the pwdResetKey value for this User.
     * 
     * @param pwdResetKey
     */
    public void setPwdResetKey(java.lang.String pwdResetKey) {
        this.pwdResetKey = pwdResetKey;
    }


    /**
     * Gets the quotaSize value for this User.
     * 
     * @return quotaSize
     */
    public java.lang.String getQuotaSize() {
        return quotaSize;
    }


    /**
     * Sets the quotaSize value for this User.
     * 
     * @param quotaSize
     */
    public void setQuotaSize(java.lang.String quotaSize) {
        this.quotaSize = quotaSize;
    }


    /**
     * Gets the restrictUserIPAddress value for this User.
     * 
     * @return restrictUserIPAddress
     */
    public java.lang.String getRestrictUserIPAddress() {
        return restrictUserIPAddress;
    }


    /**
     * Sets the restrictUserIPAddress value for this User.
     * 
     * @param restrictUserIPAddress
     */
    public void setRestrictUserIPAddress(java.lang.String restrictUserIPAddress) {
        this.restrictUserIPAddress = restrictUserIPAddress;
    }


    /**
     * Gets the restrictedIPAddress value for this User.
     * 
     * @return restrictedIPAddress
     */
    public java.lang.String getRestrictedIPAddress() {
        return restrictedIPAddress;
    }


    /**
     * Sets the restrictedIPAddress value for this User.
     * 
     * @param restrictedIPAddress
     */
    public void setRestrictedIPAddress(java.lang.String restrictedIPAddress) {
        this.restrictedIPAddress = restrictedIPAddress;
    }


    /**
     * Gets the sendOnlyToUserID value for this User.
     * 
     * @return sendOnlyToUserID
     */
    public java.lang.String getSendOnlyToUserID() {
        return sendOnlyToUserID;
    }


    /**
     * Sets the sendOnlyToUserID value for this User.
     * 
     * @param sendOnlyToUserID
     */
    public void setSendOnlyToUserID(java.lang.String sendOnlyToUserID) {
        this.sendOnlyToUserID = sendOnlyToUserID;
    }


    /**
     * Gets the signature value for this User.
     * 
     * @return signature
     */
    public java.lang.String getSignature() {
        return signature;
    }


    /**
     * Sets the signature value for this User.
     * 
     * @param signature
     */
    public void setSignature(java.lang.String signature) {
        this.signature = signature;
    }


    /**
     * Gets the signatureUse value for this User.
     * 
     * @return signatureUse
     */
    public java.lang.String getSignatureUse() {
        return signatureUse;
    }


    /**
     * Sets the signatureUse value for this User.
     * 
     * @param signatureUse
     */
    public void setSignatureUse(java.lang.String signatureUse) {
        this.signatureUse = signatureUse;
    }


    /**
     * Gets the startDate value for this User.
     * 
     * @return startDate
     */
    public AdminClient.DateTime getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this User.
     * 
     * @param startDate
     */
    public void setStartDate(AdminClient.DateTime startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the traceFlag value for this User.
     * 
     * @return traceFlag
     */
    public java.lang.String getTraceFlag() {
        return traceFlag;
    }


    /**
     * Sets the traceFlag value for this User.
     * 
     * @param traceFlag
     */
    public void setTraceFlag(java.lang.String traceFlag) {
        this.traceFlag = traceFlag;
    }


    /**
     * Gets the updatedBy value for this User.
     * 
     * @return updatedBy
     */
    public java.lang.String getUpdatedBy() {
        return updatedBy;
    }


    /**
     * Sets the updatedBy value for this User.
     * 
     * @param updatedBy
     */
    public void setUpdatedBy(java.lang.String updatedBy) {
        this.updatedBy = updatedBy;
    }


    /**
     * Gets the validDays value for this User.
     * 
     * @return validDays
     */
    public java.lang.String getValidDays() {
        return validDays;
    }


    /**
     * Sets the validDays value for this User.
     * 
     * @param validDays
     */
    public void setValidDays(java.lang.String validDays) {
        this.validDays = validDays;
    }


    /**
     * Gets the validEndTime value for this User.
     * 
     * @return validEndTime
     */
    public java.lang.String getValidEndTime() {
        return validEndTime;
    }


    /**
     * Sets the validEndTime value for this User.
     * 
     * @param validEndTime
     */
    public void setValidEndTime(java.lang.String validEndTime) {
        this.validEndTime = validEndTime;
    }


    /**
     * Gets the validStartTime value for this User.
     * 
     * @return validStartTime
     */
    public java.lang.String getValidStartTime() {
        return validStartTime;
    }


    /**
     * Sets the validStartTime value for this User.
     * 
     * @param validStartTime
     */
    public void setValidStartTime(java.lang.String validStartTime) {
        this.validStartTime = validStartTime;
    }


    /**
     * Gets the validUserType value for this User.
     * 
     * @return validUserType
     */
    public boolean isValidUserType() {
        return validUserType;
    }


    /**
     * Sets the validUserType value for this User.
     * 
     * @param validUserType
     */
    public void setValidUserType(boolean validUserType) {
        this.validUserType = validUserType;
    }


    /**
     * Gets the visibility value for this User.
     * 
     * @return visibility
     */
    public java.lang.String getVisibility() {
        return visibility;
    }


    /**
     * Sets the visibility value for this User.
     * 
     * @param visibility
     */
    public void setVisibility(java.lang.String visibility) {
        this.visibility = visibility;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof User)) return false;
        User other = (User) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.AMUser == other.isAMUser() &&
            ((this.CFAuthType==null && other.getCFAuthType()==null) || 
             (this.CFAuthType!=null &&
              this.CFAuthType.equals(other.getCFAuthType()))) &&
            ((this.FTPAuthType==null && other.getFTPAuthType()==null) || 
             (this.FTPAuthType!=null &&
              this.FTPAuthType.equals(other.getFTPAuthType()))) &&
            ((this.HTTPSAuthType==null && other.getHTTPSAuthType()==null) || 
             (this.HTTPSAuthType!=null &&
              this.HTTPSAuthType.equals(other.getHTTPSAuthType()))) &&
            this.LDAPDerivedUser == other.isLDAPDerivedUser() &&
            ((this.PGPAllowUserAddKey==null && other.getPGPAllowUserAddKey()==null) || 
             (this.PGPAllowUserAddKey!=null &&
              this.PGPAllowUserAddKey.equals(other.getPGPAllowUserAddKey()))) &&
            ((this.SSHAuthType==null && other.getSSHAuthType()==null) || 
             (this.SSHAuthType!=null &&
              this.SSHAuthType.equals(other.getSSHAuthType()))) &&
            ((this.SSOToken==null && other.getSSOToken()==null) || 
             (this.SSOToken!=null &&
              this.SSOToken.equals(other.getSSOToken()))) &&
            this.activeUserType == other.isActiveUserType() &&
            ((this.allowableProtocol==null && other.getAllowableProtocol()==null) || 
             (this.allowableProtocol!=null &&
              this.allowableProtocol.equals(other.getAllowableProtocol()))) &&
            ((this.certificateDN==null && other.getCertificateDN()==null) || 
             (this.certificateDN!=null &&
              this.certificateDN.equals(other.getCertificateDN()))) &&
            ((this.companyName==null && other.getCompanyName()==null) || 
             (this.companyName!=null &&
              this.companyName.equals(other.getCompanyName()))) &&
            ((this.createType==null && other.getCreateType()==null) || 
             (this.createType!=null &&
              this.createType.equals(other.getCreateType()))) &&
            ((this.createdBy==null && other.getCreatedBy()==null) || 
             (this.createdBy!=null &&
              this.createdBy.equals(other.getCreatedBy()))) &&
            ((this.dateCreated==null && other.getDateCreated()==null) || 
             (this.dateCreated!=null &&
              this.dateCreated.equals(other.getDateCreated()))) &&
            ((this.dateLastAccess==null && other.getDateLastAccess()==null) || 
             (this.dateLastAccess!=null &&
              this.dateLastAccess.equals(other.getDateLastAccess()))) &&
            ((this.dateUpdated==null && other.getDateUpdated()==null) || 
             (this.dateUpdated!=null &&
              this.dateUpdated.equals(other.getDateUpdated()))) &&
            ((this.defaultRole==null && other.getDefaultRole()==null) || 
             (this.defaultRole!=null &&
              this.defaultRole.equals(other.getDefaultRole()))) &&
            ((this.department==null && other.getDepartment()==null) || 
             (this.department!=null &&
              this.department.equals(other.getDepartment()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.disableFlag==null && other.getDisableFlag()==null) || 
             (this.disableFlag!=null &&
              this.disableFlag.equals(other.getDisableFlag()))) &&
            ((this.emailAddr==null && other.getEmailAddr()==null) || 
             (this.emailAddr!=null &&
              this.emailAddr.equals(other.getEmailAddr()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.expirationDate==null && other.getExpirationDate()==null) || 
             (this.expirationDate!=null &&
              this.expirationDate.equals(other.getExpirationDate()))) &&
            ((this.fullName==null && other.getFullName()==null) || 
             (this.fullName!=null &&
              this.fullName.equals(other.getFullName()))) &&
            this.fullUser == other.isFullUser() &&
            this.guestUser == other.isGuestUser() &&
            ((this.homeDirFID==null && other.getHomeDirFID()==null) || 
             (this.homeDirFID!=null &&
              this.homeDirFID.equals(other.getHomeDirFID()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            this.internal == other.isInternal() &&
            ((this.lockFlag==null && other.getLockFlag()==null) || 
             (this.lockFlag!=null &&
              this.lockFlag.equals(other.getLockFlag()))) &&
            ((this.manageDepts==null && other.getManageDepts()==null) || 
             (this.manageDepts!=null &&
              this.manageDepts.equals(other.getManageDepts()))) &&
            ((this.maxFileSize==null && other.getMaxFileSize()==null) || 
             (this.maxFileSize!=null &&
              this.maxFileSize.equals(other.getMaxFileSize()))) &&
            ((this.netMask==null && other.getNetMask()==null) || 
             (this.netMask!=null &&
              this.netMask.equals(other.getNetMask()))) &&
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword()))) &&
            ((this.phoneNumber==null && other.getPhoneNumber()==null) || 
             (this.phoneNumber!=null &&
              this.phoneNumber.equals(other.getPhoneNumber()))) &&
            this.powerUser == other.isPowerUser() &&
            ((this.pwdAllowSelfChange==null && other.getPwdAllowSelfChange()==null) || 
             (this.pwdAllowSelfChange!=null &&
              this.pwdAllowSelfChange.equals(other.getPwdAllowSelfChange()))) &&
            ((this.pwdExpiresFlag==null && other.getPwdExpiresFlag()==null) || 
             (this.pwdExpiresFlag!=null &&
              this.pwdExpiresFlag.equals(other.getPwdExpiresFlag()))) &&
            ((this.pwdForceChange==null && other.getPwdForceChange()==null) || 
             (this.pwdForceChange!=null &&
              this.pwdForceChange.equals(other.getPwdForceChange()))) &&
            ((this.pwdHistory==null && other.getPwdHistory()==null) || 
             (this.pwdHistory!=null &&
              this.pwdHistory.equals(other.getPwdHistory()))) &&
            ((this.pwdLastChangeDate==null && other.getPwdLastChangeDate()==null) || 
             (this.pwdLastChangeDate!=null &&
              this.pwdLastChangeDate.equals(other.getPwdLastChangeDate()))) &&
            ((this.pwdResetExp==null && other.getPwdResetExp()==null) || 
             (this.pwdResetExp!=null &&
              this.pwdResetExp.equals(other.getPwdResetExp()))) &&
            ((this.pwdResetKey==null && other.getPwdResetKey()==null) || 
             (this.pwdResetKey!=null &&
              this.pwdResetKey.equals(other.getPwdResetKey()))) &&
            ((this.quotaSize==null && other.getQuotaSize()==null) || 
             (this.quotaSize!=null &&
              this.quotaSize.equals(other.getQuotaSize()))) &&
            ((this.restrictUserIPAddress==null && other.getRestrictUserIPAddress()==null) || 
             (this.restrictUserIPAddress!=null &&
              this.restrictUserIPAddress.equals(other.getRestrictUserIPAddress()))) &&
            ((this.restrictedIPAddress==null && other.getRestrictedIPAddress()==null) || 
             (this.restrictedIPAddress!=null &&
              this.restrictedIPAddress.equals(other.getRestrictedIPAddress()))) &&
            ((this.sendOnlyToUserID==null && other.getSendOnlyToUserID()==null) || 
             (this.sendOnlyToUserID!=null &&
              this.sendOnlyToUserID.equals(other.getSendOnlyToUserID()))) &&
            ((this.signature==null && other.getSignature()==null) || 
             (this.signature!=null &&
              this.signature.equals(other.getSignature()))) &&
            ((this.signatureUse==null && other.getSignatureUse()==null) || 
             (this.signatureUse!=null &&
              this.signatureUse.equals(other.getSignatureUse()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.traceFlag==null && other.getTraceFlag()==null) || 
             (this.traceFlag!=null &&
              this.traceFlag.equals(other.getTraceFlag()))) &&
            ((this.updatedBy==null && other.getUpdatedBy()==null) || 
             (this.updatedBy!=null &&
              this.updatedBy.equals(other.getUpdatedBy()))) &&
            ((this.validDays==null && other.getValidDays()==null) || 
             (this.validDays!=null &&
              this.validDays.equals(other.getValidDays()))) &&
            ((this.validEndTime==null && other.getValidEndTime()==null) || 
             (this.validEndTime!=null &&
              this.validEndTime.equals(other.getValidEndTime()))) &&
            ((this.validStartTime==null && other.getValidStartTime()==null) || 
             (this.validStartTime!=null &&
              this.validStartTime.equals(other.getValidStartTime()))) &&
            this.validUserType == other.isValidUserType() &&
            ((this.visibility==null && other.getVisibility()==null) || 
             (this.visibility!=null &&
              this.visibility.equals(other.getVisibility())));
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
        _hashCode += (isAMUser() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getCFAuthType() != null) {
            _hashCode += getCFAuthType().hashCode();
        }
        if (getFTPAuthType() != null) {
            _hashCode += getFTPAuthType().hashCode();
        }
        if (getHTTPSAuthType() != null) {
            _hashCode += getHTTPSAuthType().hashCode();
        }
        _hashCode += (isLDAPDerivedUser() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getPGPAllowUserAddKey() != null) {
            _hashCode += getPGPAllowUserAddKey().hashCode();
        }
        if (getSSHAuthType() != null) {
            _hashCode += getSSHAuthType().hashCode();
        }
        if (getSSOToken() != null) {
            _hashCode += getSSOToken().hashCode();
        }
        _hashCode += (isActiveUserType() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getAllowableProtocol() != null) {
            _hashCode += getAllowableProtocol().hashCode();
        }
        if (getCertificateDN() != null) {
            _hashCode += getCertificateDN().hashCode();
        }
        if (getCompanyName() != null) {
            _hashCode += getCompanyName().hashCode();
        }
        if (getCreateType() != null) {
            _hashCode += getCreateType().hashCode();
        }
        if (getCreatedBy() != null) {
            _hashCode += getCreatedBy().hashCode();
        }
        if (getDateCreated() != null) {
            _hashCode += getDateCreated().hashCode();
        }
        if (getDateLastAccess() != null) {
            _hashCode += getDateLastAccess().hashCode();
        }
        if (getDateUpdated() != null) {
            _hashCode += getDateUpdated().hashCode();
        }
        if (getDefaultRole() != null) {
            _hashCode += getDefaultRole().hashCode();
        }
        if (getDepartment() != null) {
            _hashCode += getDepartment().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getDisableFlag() != null) {
            _hashCode += getDisableFlag().hashCode();
        }
        if (getEmailAddr() != null) {
            _hashCode += getEmailAddr().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getExpirationDate() != null) {
            _hashCode += getExpirationDate().hashCode();
        }
        if (getFullName() != null) {
            _hashCode += getFullName().hashCode();
        }
        _hashCode += (isFullUser() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isGuestUser() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getHomeDirFID() != null) {
            _hashCode += getHomeDirFID().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        _hashCode += (isInternal() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getLockFlag() != null) {
            _hashCode += getLockFlag().hashCode();
        }
        if (getManageDepts() != null) {
            _hashCode += getManageDepts().hashCode();
        }
        if (getMaxFileSize() != null) {
            _hashCode += getMaxFileSize().hashCode();
        }
        if (getNetMask() != null) {
            _hashCode += getNetMask().hashCode();
        }
        if (getPassword() != null) {
            _hashCode += getPassword().hashCode();
        }
        if (getPhoneNumber() != null) {
            _hashCode += getPhoneNumber().hashCode();
        }
        _hashCode += (isPowerUser() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getPwdAllowSelfChange() != null) {
            _hashCode += getPwdAllowSelfChange().hashCode();
        }
        if (getPwdExpiresFlag() != null) {
            _hashCode += getPwdExpiresFlag().hashCode();
        }
        if (getPwdForceChange() != null) {
            _hashCode += getPwdForceChange().hashCode();
        }
        if (getPwdHistory() != null) {
            _hashCode += getPwdHistory().hashCode();
        }
        if (getPwdLastChangeDate() != null) {
            _hashCode += getPwdLastChangeDate().hashCode();
        }
        if (getPwdResetExp() != null) {
            _hashCode += getPwdResetExp().hashCode();
        }
        if (getPwdResetKey() != null) {
            _hashCode += getPwdResetKey().hashCode();
        }
        if (getQuotaSize() != null) {
            _hashCode += getQuotaSize().hashCode();
        }
        if (getRestrictUserIPAddress() != null) {
            _hashCode += getRestrictUserIPAddress().hashCode();
        }
        if (getRestrictedIPAddress() != null) {
            _hashCode += getRestrictedIPAddress().hashCode();
        }
        if (getSendOnlyToUserID() != null) {
            _hashCode += getSendOnlyToUserID().hashCode();
        }
        if (getSignature() != null) {
            _hashCode += getSignature().hashCode();
        }
        if (getSignatureUse() != null) {
            _hashCode += getSignatureUse().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getTraceFlag() != null) {
            _hashCode += getTraceFlag().hashCode();
        }
        if (getUpdatedBy() != null) {
            _hashCode += getUpdatedBy().hashCode();
        }
        if (getValidDays() != null) {
            _hashCode += getValidDays().hashCode();
        }
        if (getValidEndTime() != null) {
            _hashCode += getValidEndTime().hashCode();
        }
        if (getValidStartTime() != null) {
            _hashCode += getValidStartTime().hashCode();
        }
        _hashCode += (isValidUserType() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getVisibility() != null) {
            _hashCode += getVisibility().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(User.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:AdministratorService", "User"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("AMUser");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AMUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CFAuthType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CFAuthType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FTPAuthType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FTPAuthType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HTTPSAuthType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "HTTPSAuthType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LDAPDerivedUser");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LDAPDerivedUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PGPAllowUserAddKey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PGPAllowUserAddKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SSHAuthType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SSHAuthType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SSOToken");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SSOToken"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activeUserType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "activeUserType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowableProtocol");
        elemField.setXmlName(new javax.xml.namespace.QName("", "allowableProtocol"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certificateDN");
        elemField.setXmlName(new javax.xml.namespace.QName("", "certificateDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "companyName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "createType"));
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
        elemField.setFieldName("dateLastAccess");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dateLastAccess"));
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
        elemField.setFieldName("defaultRole");
        elemField.setXmlName(new javax.xml.namespace.QName("", "defaultRole"));
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
        elemField.setFieldName("disableFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "disableFlag"));
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
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "endDate"));
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
        elemField.setFieldName("fullName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fullName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fullUser");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fullUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("guestUser");
        elemField.setXmlName(new javax.xml.namespace.QName("", "guestUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("homeDirFID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "homeDirFID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "internal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lockFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lockFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manageDepts");
        elemField.setXmlName(new javax.xml.namespace.QName("", "manageDepts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxFileSize");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxFileSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("netMask");
        elemField.setXmlName(new javax.xml.namespace.QName("", "netMask"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("password");
        elemField.setXmlName(new javax.xml.namespace.QName("", "password"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phoneNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "phoneNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("powerUser");
        elemField.setXmlName(new javax.xml.namespace.QName("", "powerUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pwdAllowSelfChange");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pwdAllowSelfChange"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pwdExpiresFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pwdExpiresFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pwdForceChange");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pwdForceChange"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pwdHistory");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pwdHistory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pwdLastChangeDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pwdLastChangeDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:AdministratorService", "DateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pwdResetExp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pwdResetExp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pwdResetKey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pwdResetKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quotaSize");
        elemField.setXmlName(new javax.xml.namespace.QName("", "quotaSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("restrictUserIPAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "restrictUserIPAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("restrictedIPAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "restrictedIPAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sendOnlyToUserID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sendOnlyToUserID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signature");
        elemField.setXmlName(new javax.xml.namespace.QName("", "signature"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signatureUse");
        elemField.setXmlName(new javax.xml.namespace.QName("", "signatureUse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "startDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:AdministratorService", "DateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("traceFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "traceFlag"));
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
        elemField.setFieldName("validDays");
        elemField.setXmlName(new javax.xml.namespace.QName("", "validDays"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validEndTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "validEndTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validStartTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "validStartTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validUserType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "validUserType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("visibility");
        elemField.setXmlName(new javax.xml.namespace.QName("", "visibility"));
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
