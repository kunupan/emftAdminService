/**
 * ConfigU2U.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 11, 2014 (12:11:36 EDT) WSDL2Java emitter.
 */

package AdminClient;

public class ConfigU2U  implements java.io.Serializable {
    private java.lang.String allowDownload;

    private java.lang.String archiveAction;

    private java.lang.String archiveDayOfWeek;

    private java.lang.String archiveDirectory;

    private java.lang.String archiveEndTime;

    private java.lang.String archiveInterval;

    private java.lang.String archiveServerName;

    private java.lang.String archiveServerStart;

    private java.lang.String archiveStartTime;

    private java.lang.String archiveSvrHost;

    private java.lang.String attachRuleSizePerEmail;

    private java.lang.String[] attachRuleTypes;

    private java.lang.String attachRules;

    private java.lang.String[] createSendUserDomains;

    private java.lang.String defaultCKPTInterval;

    private java.lang.String defaultQuotaSize;

    private java.lang.String deletedDays;

    private java.lang.String disableNewSystemAddedUser;

    private java.lang.String emailArchiveAUserId;

    private java.lang.String emailArchiveAUserPass;

    private java.lang.String emailArchiveHostName;

    private java.lang.String emailArchiveHostPort;

    private java.lang.String guestAutoReactivate;

    private java.lang.String guestExpirationDays;

    private AdminClient.DateTime guestUserExpirationDate;

    private java.lang.String ldapSyncSvrHost;

    private java.lang.String ldapSyncTime;

    private java.lang.String maxExpirationDays;

    private java.lang.String maxFileSizePerEmail;

    private java.lang.String maxNumRecipients;

    private java.lang.String maxRetryDays;

    private java.lang.String outlookSSO;

    private java.lang.String quotaType;

    private java.lang.String repositoryDirectory;

    private java.lang.String repositoryServerName;

    private java.lang.String restrictAttachmentAction;

    private java.lang.String[] restrictAttachmentTypes;

    private java.lang.String retainAuditDays;

    private java.lang.String retainHistoryDays;

    private java.lang.String retentionPeriod;

    private java.lang.String revisionDays;

    private java.lang.String senderCreateUser;

    private java.lang.String statusEmailArchive;

    private java.lang.String templateAdminCreatedUser;

    private java.lang.String templateAttachmentAvailable;

    private java.lang.String templateAttachmentAvailableUserCreated;

    private java.lang.String templateAttachmentRecalled;

    private java.lang.String templateDownloadNotification;

    private java.lang.String visibilityDefault;

    public ConfigU2U() {
    }

    public ConfigU2U(
           java.lang.String allowDownload,
           java.lang.String archiveAction,
           java.lang.String archiveDayOfWeek,
           java.lang.String archiveDirectory,
           java.lang.String archiveEndTime,
           java.lang.String archiveInterval,
           java.lang.String archiveServerName,
           java.lang.String archiveServerStart,
           java.lang.String archiveStartTime,
           java.lang.String archiveSvrHost,
           java.lang.String attachRuleSizePerEmail,
           java.lang.String[] attachRuleTypes,
           java.lang.String attachRules,
           java.lang.String[] createSendUserDomains,
           java.lang.String defaultCKPTInterval,
           java.lang.String defaultQuotaSize,
           java.lang.String deletedDays,
           java.lang.String disableNewSystemAddedUser,
           java.lang.String emailArchiveAUserId,
           java.lang.String emailArchiveAUserPass,
           java.lang.String emailArchiveHostName,
           java.lang.String emailArchiveHostPort,
           java.lang.String guestAutoReactivate,
           java.lang.String guestExpirationDays,
           AdminClient.DateTime guestUserExpirationDate,
           java.lang.String ldapSyncSvrHost,
           java.lang.String ldapSyncTime,
           java.lang.String maxExpirationDays,
           java.lang.String maxFileSizePerEmail,
           java.lang.String maxNumRecipients,
           java.lang.String maxRetryDays,
           java.lang.String outlookSSO,
           java.lang.String quotaType,
           java.lang.String repositoryDirectory,
           java.lang.String repositoryServerName,
           java.lang.String restrictAttachmentAction,
           java.lang.String[] restrictAttachmentTypes,
           java.lang.String retainAuditDays,
           java.lang.String retainHistoryDays,
           java.lang.String retentionPeriod,
           java.lang.String revisionDays,
           java.lang.String senderCreateUser,
           java.lang.String statusEmailArchive,
           java.lang.String templateAdminCreatedUser,
           java.lang.String templateAttachmentAvailable,
           java.lang.String templateAttachmentAvailableUserCreated,
           java.lang.String templateAttachmentRecalled,
           java.lang.String templateDownloadNotification,
           java.lang.String visibilityDefault) {
           this.allowDownload = allowDownload;
           this.archiveAction = archiveAction;
           this.archiveDayOfWeek = archiveDayOfWeek;
           this.archiveDirectory = archiveDirectory;
           this.archiveEndTime = archiveEndTime;
           this.archiveInterval = archiveInterval;
           this.archiveServerName = archiveServerName;
           this.archiveServerStart = archiveServerStart;
           this.archiveStartTime = archiveStartTime;
           this.archiveSvrHost = archiveSvrHost;
           this.attachRuleSizePerEmail = attachRuleSizePerEmail;
           this.attachRuleTypes = attachRuleTypes;
           this.attachRules = attachRules;
           this.createSendUserDomains = createSendUserDomains;
           this.defaultCKPTInterval = defaultCKPTInterval;
           this.defaultQuotaSize = defaultQuotaSize;
           this.deletedDays = deletedDays;
           this.disableNewSystemAddedUser = disableNewSystemAddedUser;
           this.emailArchiveAUserId = emailArchiveAUserId;
           this.emailArchiveAUserPass = emailArchiveAUserPass;
           this.emailArchiveHostName = emailArchiveHostName;
           this.emailArchiveHostPort = emailArchiveHostPort;
           this.guestAutoReactivate = guestAutoReactivate;
           this.guestExpirationDays = guestExpirationDays;
           this.guestUserExpirationDate = guestUserExpirationDate;
           this.ldapSyncSvrHost = ldapSyncSvrHost;
           this.ldapSyncTime = ldapSyncTime;
           this.maxExpirationDays = maxExpirationDays;
           this.maxFileSizePerEmail = maxFileSizePerEmail;
           this.maxNumRecipients = maxNumRecipients;
           this.maxRetryDays = maxRetryDays;
           this.outlookSSO = outlookSSO;
           this.quotaType = quotaType;
           this.repositoryDirectory = repositoryDirectory;
           this.repositoryServerName = repositoryServerName;
           this.restrictAttachmentAction = restrictAttachmentAction;
           this.restrictAttachmentTypes = restrictAttachmentTypes;
           this.retainAuditDays = retainAuditDays;
           this.retainHistoryDays = retainHistoryDays;
           this.retentionPeriod = retentionPeriod;
           this.revisionDays = revisionDays;
           this.senderCreateUser = senderCreateUser;
           this.statusEmailArchive = statusEmailArchive;
           this.templateAdminCreatedUser = templateAdminCreatedUser;
           this.templateAttachmentAvailable = templateAttachmentAvailable;
           this.templateAttachmentAvailableUserCreated = templateAttachmentAvailableUserCreated;
           this.templateAttachmentRecalled = templateAttachmentRecalled;
           this.templateDownloadNotification = templateDownloadNotification;
           this.visibilityDefault = visibilityDefault;
    }


    /**
     * Gets the allowDownload value for this ConfigU2U.
     * 
     * @return allowDownload
     */
    public java.lang.String getAllowDownload() {
        return allowDownload;
    }


    /**
     * Sets the allowDownload value for this ConfigU2U.
     * 
     * @param allowDownload
     */
    public void setAllowDownload(java.lang.String allowDownload) {
        this.allowDownload = allowDownload;
    }


    /**
     * Gets the archiveAction value for this ConfigU2U.
     * 
     * @return archiveAction
     */
    public java.lang.String getArchiveAction() {
        return archiveAction;
    }


    /**
     * Sets the archiveAction value for this ConfigU2U.
     * 
     * @param archiveAction
     */
    public void setArchiveAction(java.lang.String archiveAction) {
        this.archiveAction = archiveAction;
    }


    /**
     * Gets the archiveDayOfWeek value for this ConfigU2U.
     * 
     * @return archiveDayOfWeek
     */
    public java.lang.String getArchiveDayOfWeek() {
        return archiveDayOfWeek;
    }


    /**
     * Sets the archiveDayOfWeek value for this ConfigU2U.
     * 
     * @param archiveDayOfWeek
     */
    public void setArchiveDayOfWeek(java.lang.String archiveDayOfWeek) {
        this.archiveDayOfWeek = archiveDayOfWeek;
    }


    /**
     * Gets the archiveDirectory value for this ConfigU2U.
     * 
     * @return archiveDirectory
     */
    public java.lang.String getArchiveDirectory() {
        return archiveDirectory;
    }


    /**
     * Sets the archiveDirectory value for this ConfigU2U.
     * 
     * @param archiveDirectory
     */
    public void setArchiveDirectory(java.lang.String archiveDirectory) {
        this.archiveDirectory = archiveDirectory;
    }


    /**
     * Gets the archiveEndTime value for this ConfigU2U.
     * 
     * @return archiveEndTime
     */
    public java.lang.String getArchiveEndTime() {
        return archiveEndTime;
    }


    /**
     * Sets the archiveEndTime value for this ConfigU2U.
     * 
     * @param archiveEndTime
     */
    public void setArchiveEndTime(java.lang.String archiveEndTime) {
        this.archiveEndTime = archiveEndTime;
    }


    /**
     * Gets the archiveInterval value for this ConfigU2U.
     * 
     * @return archiveInterval
     */
    public java.lang.String getArchiveInterval() {
        return archiveInterval;
    }


    /**
     * Sets the archiveInterval value for this ConfigU2U.
     * 
     * @param archiveInterval
     */
    public void setArchiveInterval(java.lang.String archiveInterval) {
        this.archiveInterval = archiveInterval;
    }


    /**
     * Gets the archiveServerName value for this ConfigU2U.
     * 
     * @return archiveServerName
     */
    public java.lang.String getArchiveServerName() {
        return archiveServerName;
    }


    /**
     * Sets the archiveServerName value for this ConfigU2U.
     * 
     * @param archiveServerName
     */
    public void setArchiveServerName(java.lang.String archiveServerName) {
        this.archiveServerName = archiveServerName;
    }


    /**
     * Gets the archiveServerStart value for this ConfigU2U.
     * 
     * @return archiveServerStart
     */
    public java.lang.String getArchiveServerStart() {
        return archiveServerStart;
    }


    /**
     * Sets the archiveServerStart value for this ConfigU2U.
     * 
     * @param archiveServerStart
     */
    public void setArchiveServerStart(java.lang.String archiveServerStart) {
        this.archiveServerStart = archiveServerStart;
    }


    /**
     * Gets the archiveStartTime value for this ConfigU2U.
     * 
     * @return archiveStartTime
     */
    public java.lang.String getArchiveStartTime() {
        return archiveStartTime;
    }


    /**
     * Sets the archiveStartTime value for this ConfigU2U.
     * 
     * @param archiveStartTime
     */
    public void setArchiveStartTime(java.lang.String archiveStartTime) {
        this.archiveStartTime = archiveStartTime;
    }


    /**
     * Gets the archiveSvrHost value for this ConfigU2U.
     * 
     * @return archiveSvrHost
     */
    public java.lang.String getArchiveSvrHost() {
        return archiveSvrHost;
    }


    /**
     * Sets the archiveSvrHost value for this ConfigU2U.
     * 
     * @param archiveSvrHost
     */
    public void setArchiveSvrHost(java.lang.String archiveSvrHost) {
        this.archiveSvrHost = archiveSvrHost;
    }


    /**
     * Gets the attachRuleSizePerEmail value for this ConfigU2U.
     * 
     * @return attachRuleSizePerEmail
     */
    public java.lang.String getAttachRuleSizePerEmail() {
        return attachRuleSizePerEmail;
    }


    /**
     * Sets the attachRuleSizePerEmail value for this ConfigU2U.
     * 
     * @param attachRuleSizePerEmail
     */
    public void setAttachRuleSizePerEmail(java.lang.String attachRuleSizePerEmail) {
        this.attachRuleSizePerEmail = attachRuleSizePerEmail;
    }


    /**
     * Gets the attachRuleTypes value for this ConfigU2U.
     * 
     * @return attachRuleTypes
     */
    public java.lang.String[] getAttachRuleTypes() {
        return attachRuleTypes;
    }


    /**
     * Sets the attachRuleTypes value for this ConfigU2U.
     * 
     * @param attachRuleTypes
     */
    public void setAttachRuleTypes(java.lang.String[] attachRuleTypes) {
        this.attachRuleTypes = attachRuleTypes;
    }


    /**
     * Gets the attachRules value for this ConfigU2U.
     * 
     * @return attachRules
     */
    public java.lang.String getAttachRules() {
        return attachRules;
    }


    /**
     * Sets the attachRules value for this ConfigU2U.
     * 
     * @param attachRules
     */
    public void setAttachRules(java.lang.String attachRules) {
        this.attachRules = attachRules;
    }


    /**
     * Gets the createSendUserDomains value for this ConfigU2U.
     * 
     * @return createSendUserDomains
     */
    public java.lang.String[] getCreateSendUserDomains() {
        return createSendUserDomains;
    }


    /**
     * Sets the createSendUserDomains value for this ConfigU2U.
     * 
     * @param createSendUserDomains
     */
    public void setCreateSendUserDomains(java.lang.String[] createSendUserDomains) {
        this.createSendUserDomains = createSendUserDomains;
    }


    /**
     * Gets the defaultCKPTInterval value for this ConfigU2U.
     * 
     * @return defaultCKPTInterval
     */
    public java.lang.String getDefaultCKPTInterval() {
        return defaultCKPTInterval;
    }


    /**
     * Sets the defaultCKPTInterval value for this ConfigU2U.
     * 
     * @param defaultCKPTInterval
     */
    public void setDefaultCKPTInterval(java.lang.String defaultCKPTInterval) {
        this.defaultCKPTInterval = defaultCKPTInterval;
    }


    /**
     * Gets the defaultQuotaSize value for this ConfigU2U.
     * 
     * @return defaultQuotaSize
     */
    public java.lang.String getDefaultQuotaSize() {
        return defaultQuotaSize;
    }


    /**
     * Sets the defaultQuotaSize value for this ConfigU2U.
     * 
     * @param defaultQuotaSize
     */
    public void setDefaultQuotaSize(java.lang.String defaultQuotaSize) {
        this.defaultQuotaSize = defaultQuotaSize;
    }


    /**
     * Gets the deletedDays value for this ConfigU2U.
     * 
     * @return deletedDays
     */
    public java.lang.String getDeletedDays() {
        return deletedDays;
    }


    /**
     * Sets the deletedDays value for this ConfigU2U.
     * 
     * @param deletedDays
     */
    public void setDeletedDays(java.lang.String deletedDays) {
        this.deletedDays = deletedDays;
    }


    /**
     * Gets the disableNewSystemAddedUser value for this ConfigU2U.
     * 
     * @return disableNewSystemAddedUser
     */
    public java.lang.String getDisableNewSystemAddedUser() {
        return disableNewSystemAddedUser;
    }


    /**
     * Sets the disableNewSystemAddedUser value for this ConfigU2U.
     * 
     * @param disableNewSystemAddedUser
     */
    public void setDisableNewSystemAddedUser(java.lang.String disableNewSystemAddedUser) {
        this.disableNewSystemAddedUser = disableNewSystemAddedUser;
    }


    /**
     * Gets the emailArchiveAUserId value for this ConfigU2U.
     * 
     * @return emailArchiveAUserId
     */
    public java.lang.String getEmailArchiveAUserId() {
        return emailArchiveAUserId;
    }


    /**
     * Sets the emailArchiveAUserId value for this ConfigU2U.
     * 
     * @param emailArchiveAUserId
     */
    public void setEmailArchiveAUserId(java.lang.String emailArchiveAUserId) {
        this.emailArchiveAUserId = emailArchiveAUserId;
    }


    /**
     * Gets the emailArchiveAUserPass value for this ConfigU2U.
     * 
     * @return emailArchiveAUserPass
     */
    public java.lang.String getEmailArchiveAUserPass() {
        return emailArchiveAUserPass;
    }


    /**
     * Sets the emailArchiveAUserPass value for this ConfigU2U.
     * 
     * @param emailArchiveAUserPass
     */
    public void setEmailArchiveAUserPass(java.lang.String emailArchiveAUserPass) {
        this.emailArchiveAUserPass = emailArchiveAUserPass;
    }


    /**
     * Gets the emailArchiveHostName value for this ConfigU2U.
     * 
     * @return emailArchiveHostName
     */
    public java.lang.String getEmailArchiveHostName() {
        return emailArchiveHostName;
    }


    /**
     * Sets the emailArchiveHostName value for this ConfigU2U.
     * 
     * @param emailArchiveHostName
     */
    public void setEmailArchiveHostName(java.lang.String emailArchiveHostName) {
        this.emailArchiveHostName = emailArchiveHostName;
    }


    /**
     * Gets the emailArchiveHostPort value for this ConfigU2U.
     * 
     * @return emailArchiveHostPort
     */
    public java.lang.String getEmailArchiveHostPort() {
        return emailArchiveHostPort;
    }


    /**
     * Sets the emailArchiveHostPort value for this ConfigU2U.
     * 
     * @param emailArchiveHostPort
     */
    public void setEmailArchiveHostPort(java.lang.String emailArchiveHostPort) {
        this.emailArchiveHostPort = emailArchiveHostPort;
    }


    /**
     * Gets the guestAutoReactivate value for this ConfigU2U.
     * 
     * @return guestAutoReactivate
     */
    public java.lang.String getGuestAutoReactivate() {
        return guestAutoReactivate;
    }


    /**
     * Sets the guestAutoReactivate value for this ConfigU2U.
     * 
     * @param guestAutoReactivate
     */
    public void setGuestAutoReactivate(java.lang.String guestAutoReactivate) {
        this.guestAutoReactivate = guestAutoReactivate;
    }


    /**
     * Gets the guestExpirationDays value for this ConfigU2U.
     * 
     * @return guestExpirationDays
     */
    public java.lang.String getGuestExpirationDays() {
        return guestExpirationDays;
    }


    /**
     * Sets the guestExpirationDays value for this ConfigU2U.
     * 
     * @param guestExpirationDays
     */
    public void setGuestExpirationDays(java.lang.String guestExpirationDays) {
        this.guestExpirationDays = guestExpirationDays;
    }


    /**
     * Gets the guestUserExpirationDate value for this ConfigU2U.
     * 
     * @return guestUserExpirationDate
     */
    public AdminClient.DateTime getGuestUserExpirationDate() {
        return guestUserExpirationDate;
    }


    /**
     * Sets the guestUserExpirationDate value for this ConfigU2U.
     * 
     * @param guestUserExpirationDate
     */
    public void setGuestUserExpirationDate(AdminClient.DateTime guestUserExpirationDate) {
        this.guestUserExpirationDate = guestUserExpirationDate;
    }


    /**
     * Gets the ldapSyncSvrHost value for this ConfigU2U.
     * 
     * @return ldapSyncSvrHost
     */
    public java.lang.String getLdapSyncSvrHost() {
        return ldapSyncSvrHost;
    }


    /**
     * Sets the ldapSyncSvrHost value for this ConfigU2U.
     * 
     * @param ldapSyncSvrHost
     */
    public void setLdapSyncSvrHost(java.lang.String ldapSyncSvrHost) {
        this.ldapSyncSvrHost = ldapSyncSvrHost;
    }


    /**
     * Gets the ldapSyncTime value for this ConfigU2U.
     * 
     * @return ldapSyncTime
     */
    public java.lang.String getLdapSyncTime() {
        return ldapSyncTime;
    }


    /**
     * Sets the ldapSyncTime value for this ConfigU2U.
     * 
     * @param ldapSyncTime
     */
    public void setLdapSyncTime(java.lang.String ldapSyncTime) {
        this.ldapSyncTime = ldapSyncTime;
    }


    /**
     * Gets the maxExpirationDays value for this ConfigU2U.
     * 
     * @return maxExpirationDays
     */
    public java.lang.String getMaxExpirationDays() {
        return maxExpirationDays;
    }


    /**
     * Sets the maxExpirationDays value for this ConfigU2U.
     * 
     * @param maxExpirationDays
     */
    public void setMaxExpirationDays(java.lang.String maxExpirationDays) {
        this.maxExpirationDays = maxExpirationDays;
    }


    /**
     * Gets the maxFileSizePerEmail value for this ConfigU2U.
     * 
     * @return maxFileSizePerEmail
     */
    public java.lang.String getMaxFileSizePerEmail() {
        return maxFileSizePerEmail;
    }


    /**
     * Sets the maxFileSizePerEmail value for this ConfigU2U.
     * 
     * @param maxFileSizePerEmail
     */
    public void setMaxFileSizePerEmail(java.lang.String maxFileSizePerEmail) {
        this.maxFileSizePerEmail = maxFileSizePerEmail;
    }


    /**
     * Gets the maxNumRecipients value for this ConfigU2U.
     * 
     * @return maxNumRecipients
     */
    public java.lang.String getMaxNumRecipients() {
        return maxNumRecipients;
    }


    /**
     * Sets the maxNumRecipients value for this ConfigU2U.
     * 
     * @param maxNumRecipients
     */
    public void setMaxNumRecipients(java.lang.String maxNumRecipients) {
        this.maxNumRecipients = maxNumRecipients;
    }


    /**
     * Gets the maxRetryDays value for this ConfigU2U.
     * 
     * @return maxRetryDays
     */
    public java.lang.String getMaxRetryDays() {
        return maxRetryDays;
    }


    /**
     * Sets the maxRetryDays value for this ConfigU2U.
     * 
     * @param maxRetryDays
     */
    public void setMaxRetryDays(java.lang.String maxRetryDays) {
        this.maxRetryDays = maxRetryDays;
    }


    /**
     * Gets the outlookSSO value for this ConfigU2U.
     * 
     * @return outlookSSO
     */
    public java.lang.String getOutlookSSO() {
        return outlookSSO;
    }


    /**
     * Sets the outlookSSO value for this ConfigU2U.
     * 
     * @param outlookSSO
     */
    public void setOutlookSSO(java.lang.String outlookSSO) {
        this.outlookSSO = outlookSSO;
    }


    /**
     * Gets the quotaType value for this ConfigU2U.
     * 
     * @return quotaType
     */
    public java.lang.String getQuotaType() {
        return quotaType;
    }


    /**
     * Sets the quotaType value for this ConfigU2U.
     * 
     * @param quotaType
     */
    public void setQuotaType(java.lang.String quotaType) {
        this.quotaType = quotaType;
    }


    /**
     * Gets the repositoryDirectory value for this ConfigU2U.
     * 
     * @return repositoryDirectory
     */
    public java.lang.String getRepositoryDirectory() {
        return repositoryDirectory;
    }


    /**
     * Sets the repositoryDirectory value for this ConfigU2U.
     * 
     * @param repositoryDirectory
     */
    public void setRepositoryDirectory(java.lang.String repositoryDirectory) {
        this.repositoryDirectory = repositoryDirectory;
    }


    /**
     * Gets the repositoryServerName value for this ConfigU2U.
     * 
     * @return repositoryServerName
     */
    public java.lang.String getRepositoryServerName() {
        return repositoryServerName;
    }


    /**
     * Sets the repositoryServerName value for this ConfigU2U.
     * 
     * @param repositoryServerName
     */
    public void setRepositoryServerName(java.lang.String repositoryServerName) {
        this.repositoryServerName = repositoryServerName;
    }


    /**
     * Gets the restrictAttachmentAction value for this ConfigU2U.
     * 
     * @return restrictAttachmentAction
     */
    public java.lang.String getRestrictAttachmentAction() {
        return restrictAttachmentAction;
    }


    /**
     * Sets the restrictAttachmentAction value for this ConfigU2U.
     * 
     * @param restrictAttachmentAction
     */
    public void setRestrictAttachmentAction(java.lang.String restrictAttachmentAction) {
        this.restrictAttachmentAction = restrictAttachmentAction;
    }


    /**
     * Gets the restrictAttachmentTypes value for this ConfigU2U.
     * 
     * @return restrictAttachmentTypes
     */
    public java.lang.String[] getRestrictAttachmentTypes() {
        return restrictAttachmentTypes;
    }


    /**
     * Sets the restrictAttachmentTypes value for this ConfigU2U.
     * 
     * @param restrictAttachmentTypes
     */
    public void setRestrictAttachmentTypes(java.lang.String[] restrictAttachmentTypes) {
        this.restrictAttachmentTypes = restrictAttachmentTypes;
    }


    /**
     * Gets the retainAuditDays value for this ConfigU2U.
     * 
     * @return retainAuditDays
     */
    public java.lang.String getRetainAuditDays() {
        return retainAuditDays;
    }


    /**
     * Sets the retainAuditDays value for this ConfigU2U.
     * 
     * @param retainAuditDays
     */
    public void setRetainAuditDays(java.lang.String retainAuditDays) {
        this.retainAuditDays = retainAuditDays;
    }


    /**
     * Gets the retainHistoryDays value for this ConfigU2U.
     * 
     * @return retainHistoryDays
     */
    public java.lang.String getRetainHistoryDays() {
        return retainHistoryDays;
    }


    /**
     * Sets the retainHistoryDays value for this ConfigU2U.
     * 
     * @param retainHistoryDays
     */
    public void setRetainHistoryDays(java.lang.String retainHistoryDays) {
        this.retainHistoryDays = retainHistoryDays;
    }


    /**
     * Gets the retentionPeriod value for this ConfigU2U.
     * 
     * @return retentionPeriod
     */
    public java.lang.String getRetentionPeriod() {
        return retentionPeriod;
    }


    /**
     * Sets the retentionPeriod value for this ConfigU2U.
     * 
     * @param retentionPeriod
     */
    public void setRetentionPeriod(java.lang.String retentionPeriod) {
        this.retentionPeriod = retentionPeriod;
    }


    /**
     * Gets the revisionDays value for this ConfigU2U.
     * 
     * @return revisionDays
     */
    public java.lang.String getRevisionDays() {
        return revisionDays;
    }


    /**
     * Sets the revisionDays value for this ConfigU2U.
     * 
     * @param revisionDays
     */
    public void setRevisionDays(java.lang.String revisionDays) {
        this.revisionDays = revisionDays;
    }


    /**
     * Gets the senderCreateUser value for this ConfigU2U.
     * 
     * @return senderCreateUser
     */
    public java.lang.String getSenderCreateUser() {
        return senderCreateUser;
    }


    /**
     * Sets the senderCreateUser value for this ConfigU2U.
     * 
     * @param senderCreateUser
     */
    public void setSenderCreateUser(java.lang.String senderCreateUser) {
        this.senderCreateUser = senderCreateUser;
    }


    /**
     * Gets the statusEmailArchive value for this ConfigU2U.
     * 
     * @return statusEmailArchive
     */
    public java.lang.String getStatusEmailArchive() {
        return statusEmailArchive;
    }


    /**
     * Sets the statusEmailArchive value for this ConfigU2U.
     * 
     * @param statusEmailArchive
     */
    public void setStatusEmailArchive(java.lang.String statusEmailArchive) {
        this.statusEmailArchive = statusEmailArchive;
    }


    /**
     * Gets the templateAdminCreatedUser value for this ConfigU2U.
     * 
     * @return templateAdminCreatedUser
     */
    public java.lang.String getTemplateAdminCreatedUser() {
        return templateAdminCreatedUser;
    }


    /**
     * Sets the templateAdminCreatedUser value for this ConfigU2U.
     * 
     * @param templateAdminCreatedUser
     */
    public void setTemplateAdminCreatedUser(java.lang.String templateAdminCreatedUser) {
        this.templateAdminCreatedUser = templateAdminCreatedUser;
    }


    /**
     * Gets the templateAttachmentAvailable value for this ConfigU2U.
     * 
     * @return templateAttachmentAvailable
     */
    public java.lang.String getTemplateAttachmentAvailable() {
        return templateAttachmentAvailable;
    }


    /**
     * Sets the templateAttachmentAvailable value for this ConfigU2U.
     * 
     * @param templateAttachmentAvailable
     */
    public void setTemplateAttachmentAvailable(java.lang.String templateAttachmentAvailable) {
        this.templateAttachmentAvailable = templateAttachmentAvailable;
    }


    /**
     * Gets the templateAttachmentAvailableUserCreated value for this ConfigU2U.
     * 
     * @return templateAttachmentAvailableUserCreated
     */
    public java.lang.String getTemplateAttachmentAvailableUserCreated() {
        return templateAttachmentAvailableUserCreated;
    }


    /**
     * Sets the templateAttachmentAvailableUserCreated value for this ConfigU2U.
     * 
     * @param templateAttachmentAvailableUserCreated
     */
    public void setTemplateAttachmentAvailableUserCreated(java.lang.String templateAttachmentAvailableUserCreated) {
        this.templateAttachmentAvailableUserCreated = templateAttachmentAvailableUserCreated;
    }


    /**
     * Gets the templateAttachmentRecalled value for this ConfigU2U.
     * 
     * @return templateAttachmentRecalled
     */
    public java.lang.String getTemplateAttachmentRecalled() {
        return templateAttachmentRecalled;
    }


    /**
     * Sets the templateAttachmentRecalled value for this ConfigU2U.
     * 
     * @param templateAttachmentRecalled
     */
    public void setTemplateAttachmentRecalled(java.lang.String templateAttachmentRecalled) {
        this.templateAttachmentRecalled = templateAttachmentRecalled;
    }


    /**
     * Gets the templateDownloadNotification value for this ConfigU2U.
     * 
     * @return templateDownloadNotification
     */
    public java.lang.String getTemplateDownloadNotification() {
        return templateDownloadNotification;
    }


    /**
     * Sets the templateDownloadNotification value for this ConfigU2U.
     * 
     * @param templateDownloadNotification
     */
    public void setTemplateDownloadNotification(java.lang.String templateDownloadNotification) {
        this.templateDownloadNotification = templateDownloadNotification;
    }


    /**
     * Gets the visibilityDefault value for this ConfigU2U.
     * 
     * @return visibilityDefault
     */
    public java.lang.String getVisibilityDefault() {
        return visibilityDefault;
    }


    /**
     * Sets the visibilityDefault value for this ConfigU2U.
     * 
     * @param visibilityDefault
     */
    public void setVisibilityDefault(java.lang.String visibilityDefault) {
        this.visibilityDefault = visibilityDefault;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConfigU2U)) return false;
        ConfigU2U other = (ConfigU2U) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.allowDownload==null && other.getAllowDownload()==null) || 
             (this.allowDownload!=null &&
              this.allowDownload.equals(other.getAllowDownload()))) &&
            ((this.archiveAction==null && other.getArchiveAction()==null) || 
             (this.archiveAction!=null &&
              this.archiveAction.equals(other.getArchiveAction()))) &&
            ((this.archiveDayOfWeek==null && other.getArchiveDayOfWeek()==null) || 
             (this.archiveDayOfWeek!=null &&
              this.archiveDayOfWeek.equals(other.getArchiveDayOfWeek()))) &&
            ((this.archiveDirectory==null && other.getArchiveDirectory()==null) || 
             (this.archiveDirectory!=null &&
              this.archiveDirectory.equals(other.getArchiveDirectory()))) &&
            ((this.archiveEndTime==null && other.getArchiveEndTime()==null) || 
             (this.archiveEndTime!=null &&
              this.archiveEndTime.equals(other.getArchiveEndTime()))) &&
            ((this.archiveInterval==null && other.getArchiveInterval()==null) || 
             (this.archiveInterval!=null &&
              this.archiveInterval.equals(other.getArchiveInterval()))) &&
            ((this.archiveServerName==null && other.getArchiveServerName()==null) || 
             (this.archiveServerName!=null &&
              this.archiveServerName.equals(other.getArchiveServerName()))) &&
            ((this.archiveServerStart==null && other.getArchiveServerStart()==null) || 
             (this.archiveServerStart!=null &&
              this.archiveServerStart.equals(other.getArchiveServerStart()))) &&
            ((this.archiveStartTime==null && other.getArchiveStartTime()==null) || 
             (this.archiveStartTime!=null &&
              this.archiveStartTime.equals(other.getArchiveStartTime()))) &&
            ((this.archiveSvrHost==null && other.getArchiveSvrHost()==null) || 
             (this.archiveSvrHost!=null &&
              this.archiveSvrHost.equals(other.getArchiveSvrHost()))) &&
            ((this.attachRuleSizePerEmail==null && other.getAttachRuleSizePerEmail()==null) || 
             (this.attachRuleSizePerEmail!=null &&
              this.attachRuleSizePerEmail.equals(other.getAttachRuleSizePerEmail()))) &&
            ((this.attachRuleTypes==null && other.getAttachRuleTypes()==null) || 
             (this.attachRuleTypes!=null &&
              java.util.Arrays.equals(this.attachRuleTypes, other.getAttachRuleTypes()))) &&
            ((this.attachRules==null && other.getAttachRules()==null) || 
             (this.attachRules!=null &&
              this.attachRules.equals(other.getAttachRules()))) &&
            ((this.createSendUserDomains==null && other.getCreateSendUserDomains()==null) || 
             (this.createSendUserDomains!=null &&
              java.util.Arrays.equals(this.createSendUserDomains, other.getCreateSendUserDomains()))) &&
            ((this.defaultCKPTInterval==null && other.getDefaultCKPTInterval()==null) || 
             (this.defaultCKPTInterval!=null &&
              this.defaultCKPTInterval.equals(other.getDefaultCKPTInterval()))) &&
            ((this.defaultQuotaSize==null && other.getDefaultQuotaSize()==null) || 
             (this.defaultQuotaSize!=null &&
              this.defaultQuotaSize.equals(other.getDefaultQuotaSize()))) &&
            ((this.deletedDays==null && other.getDeletedDays()==null) || 
             (this.deletedDays!=null &&
              this.deletedDays.equals(other.getDeletedDays()))) &&
            ((this.disableNewSystemAddedUser==null && other.getDisableNewSystemAddedUser()==null) || 
             (this.disableNewSystemAddedUser!=null &&
              this.disableNewSystemAddedUser.equals(other.getDisableNewSystemAddedUser()))) &&
            ((this.emailArchiveAUserId==null && other.getEmailArchiveAUserId()==null) || 
             (this.emailArchiveAUserId!=null &&
              this.emailArchiveAUserId.equals(other.getEmailArchiveAUserId()))) &&
            ((this.emailArchiveAUserPass==null && other.getEmailArchiveAUserPass()==null) || 
             (this.emailArchiveAUserPass!=null &&
              this.emailArchiveAUserPass.equals(other.getEmailArchiveAUserPass()))) &&
            ((this.emailArchiveHostName==null && other.getEmailArchiveHostName()==null) || 
             (this.emailArchiveHostName!=null &&
              this.emailArchiveHostName.equals(other.getEmailArchiveHostName()))) &&
            ((this.emailArchiveHostPort==null && other.getEmailArchiveHostPort()==null) || 
             (this.emailArchiveHostPort!=null &&
              this.emailArchiveHostPort.equals(other.getEmailArchiveHostPort()))) &&
            ((this.guestAutoReactivate==null && other.getGuestAutoReactivate()==null) || 
             (this.guestAutoReactivate!=null &&
              this.guestAutoReactivate.equals(other.getGuestAutoReactivate()))) &&
            ((this.guestExpirationDays==null && other.getGuestExpirationDays()==null) || 
             (this.guestExpirationDays!=null &&
              this.guestExpirationDays.equals(other.getGuestExpirationDays()))) &&
            ((this.guestUserExpirationDate==null && other.getGuestUserExpirationDate()==null) || 
             (this.guestUserExpirationDate!=null &&
              this.guestUserExpirationDate.equals(other.getGuestUserExpirationDate()))) &&
            ((this.ldapSyncSvrHost==null && other.getLdapSyncSvrHost()==null) || 
             (this.ldapSyncSvrHost!=null &&
              this.ldapSyncSvrHost.equals(other.getLdapSyncSvrHost()))) &&
            ((this.ldapSyncTime==null && other.getLdapSyncTime()==null) || 
             (this.ldapSyncTime!=null &&
              this.ldapSyncTime.equals(other.getLdapSyncTime()))) &&
            ((this.maxExpirationDays==null && other.getMaxExpirationDays()==null) || 
             (this.maxExpirationDays!=null &&
              this.maxExpirationDays.equals(other.getMaxExpirationDays()))) &&
            ((this.maxFileSizePerEmail==null && other.getMaxFileSizePerEmail()==null) || 
             (this.maxFileSizePerEmail!=null &&
              this.maxFileSizePerEmail.equals(other.getMaxFileSizePerEmail()))) &&
            ((this.maxNumRecipients==null && other.getMaxNumRecipients()==null) || 
             (this.maxNumRecipients!=null &&
              this.maxNumRecipients.equals(other.getMaxNumRecipients()))) &&
            ((this.maxRetryDays==null && other.getMaxRetryDays()==null) || 
             (this.maxRetryDays!=null &&
              this.maxRetryDays.equals(other.getMaxRetryDays()))) &&
            ((this.outlookSSO==null && other.getOutlookSSO()==null) || 
             (this.outlookSSO!=null &&
              this.outlookSSO.equals(other.getOutlookSSO()))) &&
            ((this.quotaType==null && other.getQuotaType()==null) || 
             (this.quotaType!=null &&
              this.quotaType.equals(other.getQuotaType()))) &&
            ((this.repositoryDirectory==null && other.getRepositoryDirectory()==null) || 
             (this.repositoryDirectory!=null &&
              this.repositoryDirectory.equals(other.getRepositoryDirectory()))) &&
            ((this.repositoryServerName==null && other.getRepositoryServerName()==null) || 
             (this.repositoryServerName!=null &&
              this.repositoryServerName.equals(other.getRepositoryServerName()))) &&
            ((this.restrictAttachmentAction==null && other.getRestrictAttachmentAction()==null) || 
             (this.restrictAttachmentAction!=null &&
              this.restrictAttachmentAction.equals(other.getRestrictAttachmentAction()))) &&
            ((this.restrictAttachmentTypes==null && other.getRestrictAttachmentTypes()==null) || 
             (this.restrictAttachmentTypes!=null &&
              java.util.Arrays.equals(this.restrictAttachmentTypes, other.getRestrictAttachmentTypes()))) &&
            ((this.retainAuditDays==null && other.getRetainAuditDays()==null) || 
             (this.retainAuditDays!=null &&
              this.retainAuditDays.equals(other.getRetainAuditDays()))) &&
            ((this.retainHistoryDays==null && other.getRetainHistoryDays()==null) || 
             (this.retainHistoryDays!=null &&
              this.retainHistoryDays.equals(other.getRetainHistoryDays()))) &&
            ((this.retentionPeriod==null && other.getRetentionPeriod()==null) || 
             (this.retentionPeriod!=null &&
              this.retentionPeriod.equals(other.getRetentionPeriod()))) &&
            ((this.revisionDays==null && other.getRevisionDays()==null) || 
             (this.revisionDays!=null &&
              this.revisionDays.equals(other.getRevisionDays()))) &&
            ((this.senderCreateUser==null && other.getSenderCreateUser()==null) || 
             (this.senderCreateUser!=null &&
              this.senderCreateUser.equals(other.getSenderCreateUser()))) &&
            ((this.statusEmailArchive==null && other.getStatusEmailArchive()==null) || 
             (this.statusEmailArchive!=null &&
              this.statusEmailArchive.equals(other.getStatusEmailArchive()))) &&
            ((this.templateAdminCreatedUser==null && other.getTemplateAdminCreatedUser()==null) || 
             (this.templateAdminCreatedUser!=null &&
              this.templateAdminCreatedUser.equals(other.getTemplateAdminCreatedUser()))) &&
            ((this.templateAttachmentAvailable==null && other.getTemplateAttachmentAvailable()==null) || 
             (this.templateAttachmentAvailable!=null &&
              this.templateAttachmentAvailable.equals(other.getTemplateAttachmentAvailable()))) &&
            ((this.templateAttachmentAvailableUserCreated==null && other.getTemplateAttachmentAvailableUserCreated()==null) || 
             (this.templateAttachmentAvailableUserCreated!=null &&
              this.templateAttachmentAvailableUserCreated.equals(other.getTemplateAttachmentAvailableUserCreated()))) &&
            ((this.templateAttachmentRecalled==null && other.getTemplateAttachmentRecalled()==null) || 
             (this.templateAttachmentRecalled!=null &&
              this.templateAttachmentRecalled.equals(other.getTemplateAttachmentRecalled()))) &&
            ((this.templateDownloadNotification==null && other.getTemplateDownloadNotification()==null) || 
             (this.templateDownloadNotification!=null &&
              this.templateDownloadNotification.equals(other.getTemplateDownloadNotification()))) &&
            ((this.visibilityDefault==null && other.getVisibilityDefault()==null) || 
             (this.visibilityDefault!=null &&
              this.visibilityDefault.equals(other.getVisibilityDefault())));
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
        if (getAllowDownload() != null) {
            _hashCode += getAllowDownload().hashCode();
        }
        if (getArchiveAction() != null) {
            _hashCode += getArchiveAction().hashCode();
        }
        if (getArchiveDayOfWeek() != null) {
            _hashCode += getArchiveDayOfWeek().hashCode();
        }
        if (getArchiveDirectory() != null) {
            _hashCode += getArchiveDirectory().hashCode();
        }
        if (getArchiveEndTime() != null) {
            _hashCode += getArchiveEndTime().hashCode();
        }
        if (getArchiveInterval() != null) {
            _hashCode += getArchiveInterval().hashCode();
        }
        if (getArchiveServerName() != null) {
            _hashCode += getArchiveServerName().hashCode();
        }
        if (getArchiveServerStart() != null) {
            _hashCode += getArchiveServerStart().hashCode();
        }
        if (getArchiveStartTime() != null) {
            _hashCode += getArchiveStartTime().hashCode();
        }
        if (getArchiveSvrHost() != null) {
            _hashCode += getArchiveSvrHost().hashCode();
        }
        if (getAttachRuleSizePerEmail() != null) {
            _hashCode += getAttachRuleSizePerEmail().hashCode();
        }
        if (getAttachRuleTypes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAttachRuleTypes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAttachRuleTypes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAttachRules() != null) {
            _hashCode += getAttachRules().hashCode();
        }
        if (getCreateSendUserDomains() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCreateSendUserDomains());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCreateSendUserDomains(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDefaultCKPTInterval() != null) {
            _hashCode += getDefaultCKPTInterval().hashCode();
        }
        if (getDefaultQuotaSize() != null) {
            _hashCode += getDefaultQuotaSize().hashCode();
        }
        if (getDeletedDays() != null) {
            _hashCode += getDeletedDays().hashCode();
        }
        if (getDisableNewSystemAddedUser() != null) {
            _hashCode += getDisableNewSystemAddedUser().hashCode();
        }
        if (getEmailArchiveAUserId() != null) {
            _hashCode += getEmailArchiveAUserId().hashCode();
        }
        if (getEmailArchiveAUserPass() != null) {
            _hashCode += getEmailArchiveAUserPass().hashCode();
        }
        if (getEmailArchiveHostName() != null) {
            _hashCode += getEmailArchiveHostName().hashCode();
        }
        if (getEmailArchiveHostPort() != null) {
            _hashCode += getEmailArchiveHostPort().hashCode();
        }
        if (getGuestAutoReactivate() != null) {
            _hashCode += getGuestAutoReactivate().hashCode();
        }
        if (getGuestExpirationDays() != null) {
            _hashCode += getGuestExpirationDays().hashCode();
        }
        if (getGuestUserExpirationDate() != null) {
            _hashCode += getGuestUserExpirationDate().hashCode();
        }
        if (getLdapSyncSvrHost() != null) {
            _hashCode += getLdapSyncSvrHost().hashCode();
        }
        if (getLdapSyncTime() != null) {
            _hashCode += getLdapSyncTime().hashCode();
        }
        if (getMaxExpirationDays() != null) {
            _hashCode += getMaxExpirationDays().hashCode();
        }
        if (getMaxFileSizePerEmail() != null) {
            _hashCode += getMaxFileSizePerEmail().hashCode();
        }
        if (getMaxNumRecipients() != null) {
            _hashCode += getMaxNumRecipients().hashCode();
        }
        if (getMaxRetryDays() != null) {
            _hashCode += getMaxRetryDays().hashCode();
        }
        if (getOutlookSSO() != null) {
            _hashCode += getOutlookSSO().hashCode();
        }
        if (getQuotaType() != null) {
            _hashCode += getQuotaType().hashCode();
        }
        if (getRepositoryDirectory() != null) {
            _hashCode += getRepositoryDirectory().hashCode();
        }
        if (getRepositoryServerName() != null) {
            _hashCode += getRepositoryServerName().hashCode();
        }
        if (getRestrictAttachmentAction() != null) {
            _hashCode += getRestrictAttachmentAction().hashCode();
        }
        if (getRestrictAttachmentTypes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRestrictAttachmentTypes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRestrictAttachmentTypes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRetainAuditDays() != null) {
            _hashCode += getRetainAuditDays().hashCode();
        }
        if (getRetainHistoryDays() != null) {
            _hashCode += getRetainHistoryDays().hashCode();
        }
        if (getRetentionPeriod() != null) {
            _hashCode += getRetentionPeriod().hashCode();
        }
        if (getRevisionDays() != null) {
            _hashCode += getRevisionDays().hashCode();
        }
        if (getSenderCreateUser() != null) {
            _hashCode += getSenderCreateUser().hashCode();
        }
        if (getStatusEmailArchive() != null) {
            _hashCode += getStatusEmailArchive().hashCode();
        }
        if (getTemplateAdminCreatedUser() != null) {
            _hashCode += getTemplateAdminCreatedUser().hashCode();
        }
        if (getTemplateAttachmentAvailable() != null) {
            _hashCode += getTemplateAttachmentAvailable().hashCode();
        }
        if (getTemplateAttachmentAvailableUserCreated() != null) {
            _hashCode += getTemplateAttachmentAvailableUserCreated().hashCode();
        }
        if (getTemplateAttachmentRecalled() != null) {
            _hashCode += getTemplateAttachmentRecalled().hashCode();
        }
        if (getTemplateDownloadNotification() != null) {
            _hashCode += getTemplateDownloadNotification().hashCode();
        }
        if (getVisibilityDefault() != null) {
            _hashCode += getVisibilityDefault().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConfigU2U.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:AdministratorService", "ConfigU2U"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowDownload");
        elemField.setXmlName(new javax.xml.namespace.QName("", "allowDownload"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("archiveAction");
        elemField.setXmlName(new javax.xml.namespace.QName("", "archiveAction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("archiveDayOfWeek");
        elemField.setXmlName(new javax.xml.namespace.QName("", "archiveDayOfWeek"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("archiveDirectory");
        elemField.setXmlName(new javax.xml.namespace.QName("", "archiveDirectory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("archiveEndTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "archiveEndTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("archiveInterval");
        elemField.setXmlName(new javax.xml.namespace.QName("", "archiveInterval"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("archiveServerName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "archiveServerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("archiveServerStart");
        elemField.setXmlName(new javax.xml.namespace.QName("", "archiveServerStart"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("archiveStartTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "archiveStartTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("archiveSvrHost");
        elemField.setXmlName(new javax.xml.namespace.QName("", "archiveSvrHost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attachRuleSizePerEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("", "attachRuleSizePerEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attachRuleTypes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "attachRuleTypes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attachRules");
        elemField.setXmlName(new javax.xml.namespace.QName("", "attachRules"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createSendUserDomains");
        elemField.setXmlName(new javax.xml.namespace.QName("", "createSendUserDomains"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultCKPTInterval");
        elemField.setXmlName(new javax.xml.namespace.QName("", "defaultCKPTInterval"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultQuotaSize");
        elemField.setXmlName(new javax.xml.namespace.QName("", "defaultQuotaSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deletedDays");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deletedDays"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disableNewSystemAddedUser");
        elemField.setXmlName(new javax.xml.namespace.QName("", "disableNewSystemAddedUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailArchiveAUserId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "emailArchiveAUserId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailArchiveAUserPass");
        elemField.setXmlName(new javax.xml.namespace.QName("", "emailArchiveAUserPass"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailArchiveHostName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "emailArchiveHostName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailArchiveHostPort");
        elemField.setXmlName(new javax.xml.namespace.QName("", "emailArchiveHostPort"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("guestAutoReactivate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "guestAutoReactivate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("guestExpirationDays");
        elemField.setXmlName(new javax.xml.namespace.QName("", "guestExpirationDays"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("guestUserExpirationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "guestUserExpirationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:AdministratorService", "DateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ldapSyncSvrHost");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ldapSyncSvrHost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ldapSyncTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ldapSyncTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxExpirationDays");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxExpirationDays"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxFileSizePerEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxFileSizePerEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxNumRecipients");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxNumRecipients"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxRetryDays");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxRetryDays"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outlookSSO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "outlookSSO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quotaType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "quotaType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("repositoryDirectory");
        elemField.setXmlName(new javax.xml.namespace.QName("", "repositoryDirectory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("repositoryServerName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "repositoryServerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("restrictAttachmentAction");
        elemField.setXmlName(new javax.xml.namespace.QName("", "restrictAttachmentAction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("restrictAttachmentTypes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "restrictAttachmentTypes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retainAuditDays");
        elemField.setXmlName(new javax.xml.namespace.QName("", "retainAuditDays"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retainHistoryDays");
        elemField.setXmlName(new javax.xml.namespace.QName("", "retainHistoryDays"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retentionPeriod");
        elemField.setXmlName(new javax.xml.namespace.QName("", "retentionPeriod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revisionDays");
        elemField.setXmlName(new javax.xml.namespace.QName("", "revisionDays"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senderCreateUser");
        elemField.setXmlName(new javax.xml.namespace.QName("", "senderCreateUser"));
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
        elemField.setFieldName("templateAdminCreatedUser");
        elemField.setXmlName(new javax.xml.namespace.QName("", "templateAdminCreatedUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("templateAttachmentAvailable");
        elemField.setXmlName(new javax.xml.namespace.QName("", "templateAttachmentAvailable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("templateAttachmentAvailableUserCreated");
        elemField.setXmlName(new javax.xml.namespace.QName("", "templateAttachmentAvailableUserCreated"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("templateAttachmentRecalled");
        elemField.setXmlName(new javax.xml.namespace.QName("", "templateAttachmentRecalled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("templateDownloadNotification");
        elemField.setXmlName(new javax.xml.namespace.QName("", "templateDownloadNotification"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("visibilityDefault");
        elemField.setXmlName(new javax.xml.namespace.QName("", "visibilityDefault"));
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
