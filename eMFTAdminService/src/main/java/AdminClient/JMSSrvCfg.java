/**
 * JMSSrvCfg.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 11, 2014 (12:11:36 EDT) WSDL2Java emitter.
 */

package AdminClient;

public class JMSSrvCfg  implements java.io.Serializable {
    private java.lang.String QConnectionFactory;

    private java.lang.String TConnectionFactory;

    private boolean TIBCO;

    private boolean activeMQ;

    private java.lang.String alertName;

    private java.lang.String auditMaxRecords;

    private java.lang.String auditName;

    private java.lang.String auditRequestType;

    private java.lang.String auditResponseType;

    private java.lang.String autoGenerateClientID;

    private java.lang.String clientID;

    private java.lang.String contextFactory;

    private java.lang.String createdBy;

    private AdminClient.DateTime dateCreated;

    private AdminClient.DateTime dateUpdated;

    private java.lang.String enabled;

    private java.lang.String mgmtName;

    private java.lang.String name;

    private java.lang.String password;

    private java.lang.String reconnectInterval;

    private java.lang.String srvUrl;

    private java.lang.String traceFlag;

    private java.lang.String transferActivityEnabled;

    private java.lang.String transferCheckInterval;

    private java.lang.String transferCheckTimeout;

    private java.lang.String transferName;

    private java.lang.String transferNotiActivityType;

    private java.lang.String transferNotiEndEnabled;

    private java.lang.String transferNotiEndPSEnabled;

    private java.lang.String transferNotiEndType;

    private java.lang.String transferNotiName;

    private java.lang.String transferNotiStartEnabled;

    private java.lang.String transferNotiStartType;

    private java.lang.String transferQSelector;

    private java.lang.String transferRequestType;

    private java.lang.String transferRequestTypeIS;

    private java.lang.String transferResponseType;

    private java.lang.String transferResponseTypeIS;

    private java.lang.String updatedBy;

    private java.lang.String userName;

    public JMSSrvCfg() {
    }

    public JMSSrvCfg(
           java.lang.String QConnectionFactory,
           java.lang.String TConnectionFactory,
           boolean TIBCO,
           boolean activeMQ,
           java.lang.String alertName,
           java.lang.String auditMaxRecords,
           java.lang.String auditName,
           java.lang.String auditRequestType,
           java.lang.String auditResponseType,
           java.lang.String autoGenerateClientID,
           java.lang.String clientID,
           java.lang.String contextFactory,
           java.lang.String createdBy,
           AdminClient.DateTime dateCreated,
           AdminClient.DateTime dateUpdated,
           java.lang.String enabled,
           java.lang.String mgmtName,
           java.lang.String name,
           java.lang.String password,
           java.lang.String reconnectInterval,
           java.lang.String srvUrl,
           java.lang.String traceFlag,
           java.lang.String transferActivityEnabled,
           java.lang.String transferCheckInterval,
           java.lang.String transferCheckTimeout,
           java.lang.String transferName,
           java.lang.String transferNotiActivityType,
           java.lang.String transferNotiEndEnabled,
           java.lang.String transferNotiEndPSEnabled,
           java.lang.String transferNotiEndType,
           java.lang.String transferNotiName,
           java.lang.String transferNotiStartEnabled,
           java.lang.String transferNotiStartType,
           java.lang.String transferQSelector,
           java.lang.String transferRequestType,
           java.lang.String transferRequestTypeIS,
           java.lang.String transferResponseType,
           java.lang.String transferResponseTypeIS,
           java.lang.String updatedBy,
           java.lang.String userName) {
           this.QConnectionFactory = QConnectionFactory;
           this.TConnectionFactory = TConnectionFactory;
           this.TIBCO = TIBCO;
           this.activeMQ = activeMQ;
           this.alertName = alertName;
           this.auditMaxRecords = auditMaxRecords;
           this.auditName = auditName;
           this.auditRequestType = auditRequestType;
           this.auditResponseType = auditResponseType;
           this.autoGenerateClientID = autoGenerateClientID;
           this.clientID = clientID;
           this.contextFactory = contextFactory;
           this.createdBy = createdBy;
           this.dateCreated = dateCreated;
           this.dateUpdated = dateUpdated;
           this.enabled = enabled;
           this.mgmtName = mgmtName;
           this.name = name;
           this.password = password;
           this.reconnectInterval = reconnectInterval;
           this.srvUrl = srvUrl;
           this.traceFlag = traceFlag;
           this.transferActivityEnabled = transferActivityEnabled;
           this.transferCheckInterval = transferCheckInterval;
           this.transferCheckTimeout = transferCheckTimeout;
           this.transferName = transferName;
           this.transferNotiActivityType = transferNotiActivityType;
           this.transferNotiEndEnabled = transferNotiEndEnabled;
           this.transferNotiEndPSEnabled = transferNotiEndPSEnabled;
           this.transferNotiEndType = transferNotiEndType;
           this.transferNotiName = transferNotiName;
           this.transferNotiStartEnabled = transferNotiStartEnabled;
           this.transferNotiStartType = transferNotiStartType;
           this.transferQSelector = transferQSelector;
           this.transferRequestType = transferRequestType;
           this.transferRequestTypeIS = transferRequestTypeIS;
           this.transferResponseType = transferResponseType;
           this.transferResponseTypeIS = transferResponseTypeIS;
           this.updatedBy = updatedBy;
           this.userName = userName;
    }


    /**
     * Gets the QConnectionFactory value for this JMSSrvCfg.
     * 
     * @return QConnectionFactory
     */
    public java.lang.String getQConnectionFactory() {
        return QConnectionFactory;
    }


    /**
     * Sets the QConnectionFactory value for this JMSSrvCfg.
     * 
     * @param QConnectionFactory
     */
    public void setQConnectionFactory(java.lang.String QConnectionFactory) {
        this.QConnectionFactory = QConnectionFactory;
    }


    /**
     * Gets the TConnectionFactory value for this JMSSrvCfg.
     * 
     * @return TConnectionFactory
     */
    public java.lang.String getTConnectionFactory() {
        return TConnectionFactory;
    }


    /**
     * Sets the TConnectionFactory value for this JMSSrvCfg.
     * 
     * @param TConnectionFactory
     */
    public void setTConnectionFactory(java.lang.String TConnectionFactory) {
        this.TConnectionFactory = TConnectionFactory;
    }


    /**
     * Gets the TIBCO value for this JMSSrvCfg.
     * 
     * @return TIBCO
     */
    public boolean isTIBCO() {
        return TIBCO;
    }


    /**
     * Sets the TIBCO value for this JMSSrvCfg.
     * 
     * @param TIBCO
     */
    public void setTIBCO(boolean TIBCO) {
        this.TIBCO = TIBCO;
    }


    /**
     * Gets the activeMQ value for this JMSSrvCfg.
     * 
     * @return activeMQ
     */
    public boolean isActiveMQ() {
        return activeMQ;
    }


    /**
     * Sets the activeMQ value for this JMSSrvCfg.
     * 
     * @param activeMQ
     */
    public void setActiveMQ(boolean activeMQ) {
        this.activeMQ = activeMQ;
    }


    /**
     * Gets the alertName value for this JMSSrvCfg.
     * 
     * @return alertName
     */
    public java.lang.String getAlertName() {
        return alertName;
    }


    /**
     * Sets the alertName value for this JMSSrvCfg.
     * 
     * @param alertName
     */
    public void setAlertName(java.lang.String alertName) {
        this.alertName = alertName;
    }


    /**
     * Gets the auditMaxRecords value for this JMSSrvCfg.
     * 
     * @return auditMaxRecords
     */
    public java.lang.String getAuditMaxRecords() {
        return auditMaxRecords;
    }


    /**
     * Sets the auditMaxRecords value for this JMSSrvCfg.
     * 
     * @param auditMaxRecords
     */
    public void setAuditMaxRecords(java.lang.String auditMaxRecords) {
        this.auditMaxRecords = auditMaxRecords;
    }


    /**
     * Gets the auditName value for this JMSSrvCfg.
     * 
     * @return auditName
     */
    public java.lang.String getAuditName() {
        return auditName;
    }


    /**
     * Sets the auditName value for this JMSSrvCfg.
     * 
     * @param auditName
     */
    public void setAuditName(java.lang.String auditName) {
        this.auditName = auditName;
    }


    /**
     * Gets the auditRequestType value for this JMSSrvCfg.
     * 
     * @return auditRequestType
     */
    public java.lang.String getAuditRequestType() {
        return auditRequestType;
    }


    /**
     * Sets the auditRequestType value for this JMSSrvCfg.
     * 
     * @param auditRequestType
     */
    public void setAuditRequestType(java.lang.String auditRequestType) {
        this.auditRequestType = auditRequestType;
    }


    /**
     * Gets the auditResponseType value for this JMSSrvCfg.
     * 
     * @return auditResponseType
     */
    public java.lang.String getAuditResponseType() {
        return auditResponseType;
    }


    /**
     * Sets the auditResponseType value for this JMSSrvCfg.
     * 
     * @param auditResponseType
     */
    public void setAuditResponseType(java.lang.String auditResponseType) {
        this.auditResponseType = auditResponseType;
    }


    /**
     * Gets the autoGenerateClientID value for this JMSSrvCfg.
     * 
     * @return autoGenerateClientID
     */
    public java.lang.String getAutoGenerateClientID() {
        return autoGenerateClientID;
    }


    /**
     * Sets the autoGenerateClientID value for this JMSSrvCfg.
     * 
     * @param autoGenerateClientID
     */
    public void setAutoGenerateClientID(java.lang.String autoGenerateClientID) {
        this.autoGenerateClientID = autoGenerateClientID;
    }


    /**
     * Gets the clientID value for this JMSSrvCfg.
     * 
     * @return clientID
     */
    public java.lang.String getClientID() {
        return clientID;
    }


    /**
     * Sets the clientID value for this JMSSrvCfg.
     * 
     * @param clientID
     */
    public void setClientID(java.lang.String clientID) {
        this.clientID = clientID;
    }


    /**
     * Gets the contextFactory value for this JMSSrvCfg.
     * 
     * @return contextFactory
     */
    public java.lang.String getContextFactory() {
        return contextFactory;
    }


    /**
     * Sets the contextFactory value for this JMSSrvCfg.
     * 
     * @param contextFactory
     */
    public void setContextFactory(java.lang.String contextFactory) {
        this.contextFactory = contextFactory;
    }


    /**
     * Gets the createdBy value for this JMSSrvCfg.
     * 
     * @return createdBy
     */
    public java.lang.String getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this JMSSrvCfg.
     * 
     * @param createdBy
     */
    public void setCreatedBy(java.lang.String createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the dateCreated value for this JMSSrvCfg.
     * 
     * @return dateCreated
     */
    public AdminClient.DateTime getDateCreated() {
        return dateCreated;
    }


    /**
     * Sets the dateCreated value for this JMSSrvCfg.
     * 
     * @param dateCreated
     */
    public void setDateCreated(AdminClient.DateTime dateCreated) {
        this.dateCreated = dateCreated;
    }


    /**
     * Gets the dateUpdated value for this JMSSrvCfg.
     * 
     * @return dateUpdated
     */
    public AdminClient.DateTime getDateUpdated() {
        return dateUpdated;
    }


    /**
     * Sets the dateUpdated value for this JMSSrvCfg.
     * 
     * @param dateUpdated
     */
    public void setDateUpdated(AdminClient.DateTime dateUpdated) {
        this.dateUpdated = dateUpdated;
    }


    /**
     * Gets the enabled value for this JMSSrvCfg.
     * 
     * @return enabled
     */
    public java.lang.String getEnabled() {
        return enabled;
    }


    /**
     * Sets the enabled value for this JMSSrvCfg.
     * 
     * @param enabled
     */
    public void setEnabled(java.lang.String enabled) {
        this.enabled = enabled;
    }


    /**
     * Gets the mgmtName value for this JMSSrvCfg.
     * 
     * @return mgmtName
     */
    public java.lang.String getMgmtName() {
        return mgmtName;
    }


    /**
     * Sets the mgmtName value for this JMSSrvCfg.
     * 
     * @param mgmtName
     */
    public void setMgmtName(java.lang.String mgmtName) {
        this.mgmtName = mgmtName;
    }


    /**
     * Gets the name value for this JMSSrvCfg.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this JMSSrvCfg.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the password value for this JMSSrvCfg.
     * 
     * @return password
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this JMSSrvCfg.
     * 
     * @param password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }


    /**
     * Gets the reconnectInterval value for this JMSSrvCfg.
     * 
     * @return reconnectInterval
     */
    public java.lang.String getReconnectInterval() {
        return reconnectInterval;
    }


    /**
     * Sets the reconnectInterval value for this JMSSrvCfg.
     * 
     * @param reconnectInterval
     */
    public void setReconnectInterval(java.lang.String reconnectInterval) {
        this.reconnectInterval = reconnectInterval;
    }


    /**
     * Gets the srvUrl value for this JMSSrvCfg.
     * 
     * @return srvUrl
     */
    public java.lang.String getSrvUrl() {
        return srvUrl;
    }


    /**
     * Sets the srvUrl value for this JMSSrvCfg.
     * 
     * @param srvUrl
     */
    public void setSrvUrl(java.lang.String srvUrl) {
        this.srvUrl = srvUrl;
    }


    /**
     * Gets the traceFlag value for this JMSSrvCfg.
     * 
     * @return traceFlag
     */
    public java.lang.String getTraceFlag() {
        return traceFlag;
    }


    /**
     * Sets the traceFlag value for this JMSSrvCfg.
     * 
     * @param traceFlag
     */
    public void setTraceFlag(java.lang.String traceFlag) {
        this.traceFlag = traceFlag;
    }


    /**
     * Gets the transferActivityEnabled value for this JMSSrvCfg.
     * 
     * @return transferActivityEnabled
     */
    public java.lang.String getTransferActivityEnabled() {
        return transferActivityEnabled;
    }


    /**
     * Sets the transferActivityEnabled value for this JMSSrvCfg.
     * 
     * @param transferActivityEnabled
     */
    public void setTransferActivityEnabled(java.lang.String transferActivityEnabled) {
        this.transferActivityEnabled = transferActivityEnabled;
    }


    /**
     * Gets the transferCheckInterval value for this JMSSrvCfg.
     * 
     * @return transferCheckInterval
     */
    public java.lang.String getTransferCheckInterval() {
        return transferCheckInterval;
    }


    /**
     * Sets the transferCheckInterval value for this JMSSrvCfg.
     * 
     * @param transferCheckInterval
     */
    public void setTransferCheckInterval(java.lang.String transferCheckInterval) {
        this.transferCheckInterval = transferCheckInterval;
    }


    /**
     * Gets the transferCheckTimeout value for this JMSSrvCfg.
     * 
     * @return transferCheckTimeout
     */
    public java.lang.String getTransferCheckTimeout() {
        return transferCheckTimeout;
    }


    /**
     * Sets the transferCheckTimeout value for this JMSSrvCfg.
     * 
     * @param transferCheckTimeout
     */
    public void setTransferCheckTimeout(java.lang.String transferCheckTimeout) {
        this.transferCheckTimeout = transferCheckTimeout;
    }


    /**
     * Gets the transferName value for this JMSSrvCfg.
     * 
     * @return transferName
     */
    public java.lang.String getTransferName() {
        return transferName;
    }


    /**
     * Sets the transferName value for this JMSSrvCfg.
     * 
     * @param transferName
     */
    public void setTransferName(java.lang.String transferName) {
        this.transferName = transferName;
    }


    /**
     * Gets the transferNotiActivityType value for this JMSSrvCfg.
     * 
     * @return transferNotiActivityType
     */
    public java.lang.String getTransferNotiActivityType() {
        return transferNotiActivityType;
    }


    /**
     * Sets the transferNotiActivityType value for this JMSSrvCfg.
     * 
     * @param transferNotiActivityType
     */
    public void setTransferNotiActivityType(java.lang.String transferNotiActivityType) {
        this.transferNotiActivityType = transferNotiActivityType;
    }


    /**
     * Gets the transferNotiEndEnabled value for this JMSSrvCfg.
     * 
     * @return transferNotiEndEnabled
     */
    public java.lang.String getTransferNotiEndEnabled() {
        return transferNotiEndEnabled;
    }


    /**
     * Sets the transferNotiEndEnabled value for this JMSSrvCfg.
     * 
     * @param transferNotiEndEnabled
     */
    public void setTransferNotiEndEnabled(java.lang.String transferNotiEndEnabled) {
        this.transferNotiEndEnabled = transferNotiEndEnabled;
    }


    /**
     * Gets the transferNotiEndPSEnabled value for this JMSSrvCfg.
     * 
     * @return transferNotiEndPSEnabled
     */
    public java.lang.String getTransferNotiEndPSEnabled() {
        return transferNotiEndPSEnabled;
    }


    /**
     * Sets the transferNotiEndPSEnabled value for this JMSSrvCfg.
     * 
     * @param transferNotiEndPSEnabled
     */
    public void setTransferNotiEndPSEnabled(java.lang.String transferNotiEndPSEnabled) {
        this.transferNotiEndPSEnabled = transferNotiEndPSEnabled;
    }


    /**
     * Gets the transferNotiEndType value for this JMSSrvCfg.
     * 
     * @return transferNotiEndType
     */
    public java.lang.String getTransferNotiEndType() {
        return transferNotiEndType;
    }


    /**
     * Sets the transferNotiEndType value for this JMSSrvCfg.
     * 
     * @param transferNotiEndType
     */
    public void setTransferNotiEndType(java.lang.String transferNotiEndType) {
        this.transferNotiEndType = transferNotiEndType;
    }


    /**
     * Gets the transferNotiName value for this JMSSrvCfg.
     * 
     * @return transferNotiName
     */
    public java.lang.String getTransferNotiName() {
        return transferNotiName;
    }


    /**
     * Sets the transferNotiName value for this JMSSrvCfg.
     * 
     * @param transferNotiName
     */
    public void setTransferNotiName(java.lang.String transferNotiName) {
        this.transferNotiName = transferNotiName;
    }


    /**
     * Gets the transferNotiStartEnabled value for this JMSSrvCfg.
     * 
     * @return transferNotiStartEnabled
     */
    public java.lang.String getTransferNotiStartEnabled() {
        return transferNotiStartEnabled;
    }


    /**
     * Sets the transferNotiStartEnabled value for this JMSSrvCfg.
     * 
     * @param transferNotiStartEnabled
     */
    public void setTransferNotiStartEnabled(java.lang.String transferNotiStartEnabled) {
        this.transferNotiStartEnabled = transferNotiStartEnabled;
    }


    /**
     * Gets the transferNotiStartType value for this JMSSrvCfg.
     * 
     * @return transferNotiStartType
     */
    public java.lang.String getTransferNotiStartType() {
        return transferNotiStartType;
    }


    /**
     * Sets the transferNotiStartType value for this JMSSrvCfg.
     * 
     * @param transferNotiStartType
     */
    public void setTransferNotiStartType(java.lang.String transferNotiStartType) {
        this.transferNotiStartType = transferNotiStartType;
    }


    /**
     * Gets the transferQSelector value for this JMSSrvCfg.
     * 
     * @return transferQSelector
     */
    public java.lang.String getTransferQSelector() {
        return transferQSelector;
    }


    /**
     * Sets the transferQSelector value for this JMSSrvCfg.
     * 
     * @param transferQSelector
     */
    public void setTransferQSelector(java.lang.String transferQSelector) {
        this.transferQSelector = transferQSelector;
    }


    /**
     * Gets the transferRequestType value for this JMSSrvCfg.
     * 
     * @return transferRequestType
     */
    public java.lang.String getTransferRequestType() {
        return transferRequestType;
    }


    /**
     * Sets the transferRequestType value for this JMSSrvCfg.
     * 
     * @param transferRequestType
     */
    public void setTransferRequestType(java.lang.String transferRequestType) {
        this.transferRequestType = transferRequestType;
    }


    /**
     * Gets the transferRequestTypeIS value for this JMSSrvCfg.
     * 
     * @return transferRequestTypeIS
     */
    public java.lang.String getTransferRequestTypeIS() {
        return transferRequestTypeIS;
    }


    /**
     * Sets the transferRequestTypeIS value for this JMSSrvCfg.
     * 
     * @param transferRequestTypeIS
     */
    public void setTransferRequestTypeIS(java.lang.String transferRequestTypeIS) {
        this.transferRequestTypeIS = transferRequestTypeIS;
    }


    /**
     * Gets the transferResponseType value for this JMSSrvCfg.
     * 
     * @return transferResponseType
     */
    public java.lang.String getTransferResponseType() {
        return transferResponseType;
    }


    /**
     * Sets the transferResponseType value for this JMSSrvCfg.
     * 
     * @param transferResponseType
     */
    public void setTransferResponseType(java.lang.String transferResponseType) {
        this.transferResponseType = transferResponseType;
    }


    /**
     * Gets the transferResponseTypeIS value for this JMSSrvCfg.
     * 
     * @return transferResponseTypeIS
     */
    public java.lang.String getTransferResponseTypeIS() {
        return transferResponseTypeIS;
    }


    /**
     * Sets the transferResponseTypeIS value for this JMSSrvCfg.
     * 
     * @param transferResponseTypeIS
     */
    public void setTransferResponseTypeIS(java.lang.String transferResponseTypeIS) {
        this.transferResponseTypeIS = transferResponseTypeIS;
    }


    /**
     * Gets the updatedBy value for this JMSSrvCfg.
     * 
     * @return updatedBy
     */
    public java.lang.String getUpdatedBy() {
        return updatedBy;
    }


    /**
     * Sets the updatedBy value for this JMSSrvCfg.
     * 
     * @param updatedBy
     */
    public void setUpdatedBy(java.lang.String updatedBy) {
        this.updatedBy = updatedBy;
    }


    /**
     * Gets the userName value for this JMSSrvCfg.
     * 
     * @return userName
     */
    public java.lang.String getUserName() {
        return userName;
    }


    /**
     * Sets the userName value for this JMSSrvCfg.
     * 
     * @param userName
     */
    public void setUserName(java.lang.String userName) {
        this.userName = userName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof JMSSrvCfg)) return false;
        JMSSrvCfg other = (JMSSrvCfg) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.QConnectionFactory==null && other.getQConnectionFactory()==null) || 
             (this.QConnectionFactory!=null &&
              this.QConnectionFactory.equals(other.getQConnectionFactory()))) &&
            ((this.TConnectionFactory==null && other.getTConnectionFactory()==null) || 
             (this.TConnectionFactory!=null &&
              this.TConnectionFactory.equals(other.getTConnectionFactory()))) &&
            this.TIBCO == other.isTIBCO() &&
            this.activeMQ == other.isActiveMQ() &&
            ((this.alertName==null && other.getAlertName()==null) || 
             (this.alertName!=null &&
              this.alertName.equals(other.getAlertName()))) &&
            ((this.auditMaxRecords==null && other.getAuditMaxRecords()==null) || 
             (this.auditMaxRecords!=null &&
              this.auditMaxRecords.equals(other.getAuditMaxRecords()))) &&
            ((this.auditName==null && other.getAuditName()==null) || 
             (this.auditName!=null &&
              this.auditName.equals(other.getAuditName()))) &&
            ((this.auditRequestType==null && other.getAuditRequestType()==null) || 
             (this.auditRequestType!=null &&
              this.auditRequestType.equals(other.getAuditRequestType()))) &&
            ((this.auditResponseType==null && other.getAuditResponseType()==null) || 
             (this.auditResponseType!=null &&
              this.auditResponseType.equals(other.getAuditResponseType()))) &&
            ((this.autoGenerateClientID==null && other.getAutoGenerateClientID()==null) || 
             (this.autoGenerateClientID!=null &&
              this.autoGenerateClientID.equals(other.getAutoGenerateClientID()))) &&
            ((this.clientID==null && other.getClientID()==null) || 
             (this.clientID!=null &&
              this.clientID.equals(other.getClientID()))) &&
            ((this.contextFactory==null && other.getContextFactory()==null) || 
             (this.contextFactory!=null &&
              this.contextFactory.equals(other.getContextFactory()))) &&
            ((this.createdBy==null && other.getCreatedBy()==null) || 
             (this.createdBy!=null &&
              this.createdBy.equals(other.getCreatedBy()))) &&
            ((this.dateCreated==null && other.getDateCreated()==null) || 
             (this.dateCreated!=null &&
              this.dateCreated.equals(other.getDateCreated()))) &&
            ((this.dateUpdated==null && other.getDateUpdated()==null) || 
             (this.dateUpdated!=null &&
              this.dateUpdated.equals(other.getDateUpdated()))) &&
            ((this.enabled==null && other.getEnabled()==null) || 
             (this.enabled!=null &&
              this.enabled.equals(other.getEnabled()))) &&
            ((this.mgmtName==null && other.getMgmtName()==null) || 
             (this.mgmtName!=null &&
              this.mgmtName.equals(other.getMgmtName()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword()))) &&
            ((this.reconnectInterval==null && other.getReconnectInterval()==null) || 
             (this.reconnectInterval!=null &&
              this.reconnectInterval.equals(other.getReconnectInterval()))) &&
            ((this.srvUrl==null && other.getSrvUrl()==null) || 
             (this.srvUrl!=null &&
              this.srvUrl.equals(other.getSrvUrl()))) &&
            ((this.traceFlag==null && other.getTraceFlag()==null) || 
             (this.traceFlag!=null &&
              this.traceFlag.equals(other.getTraceFlag()))) &&
            ((this.transferActivityEnabled==null && other.getTransferActivityEnabled()==null) || 
             (this.transferActivityEnabled!=null &&
              this.transferActivityEnabled.equals(other.getTransferActivityEnabled()))) &&
            ((this.transferCheckInterval==null && other.getTransferCheckInterval()==null) || 
             (this.transferCheckInterval!=null &&
              this.transferCheckInterval.equals(other.getTransferCheckInterval()))) &&
            ((this.transferCheckTimeout==null && other.getTransferCheckTimeout()==null) || 
             (this.transferCheckTimeout!=null &&
              this.transferCheckTimeout.equals(other.getTransferCheckTimeout()))) &&
            ((this.transferName==null && other.getTransferName()==null) || 
             (this.transferName!=null &&
              this.transferName.equals(other.getTransferName()))) &&
            ((this.transferNotiActivityType==null && other.getTransferNotiActivityType()==null) || 
             (this.transferNotiActivityType!=null &&
              this.transferNotiActivityType.equals(other.getTransferNotiActivityType()))) &&
            ((this.transferNotiEndEnabled==null && other.getTransferNotiEndEnabled()==null) || 
             (this.transferNotiEndEnabled!=null &&
              this.transferNotiEndEnabled.equals(other.getTransferNotiEndEnabled()))) &&
            ((this.transferNotiEndPSEnabled==null && other.getTransferNotiEndPSEnabled()==null) || 
             (this.transferNotiEndPSEnabled!=null &&
              this.transferNotiEndPSEnabled.equals(other.getTransferNotiEndPSEnabled()))) &&
            ((this.transferNotiEndType==null && other.getTransferNotiEndType()==null) || 
             (this.transferNotiEndType!=null &&
              this.transferNotiEndType.equals(other.getTransferNotiEndType()))) &&
            ((this.transferNotiName==null && other.getTransferNotiName()==null) || 
             (this.transferNotiName!=null &&
              this.transferNotiName.equals(other.getTransferNotiName()))) &&
            ((this.transferNotiStartEnabled==null && other.getTransferNotiStartEnabled()==null) || 
             (this.transferNotiStartEnabled!=null &&
              this.transferNotiStartEnabled.equals(other.getTransferNotiStartEnabled()))) &&
            ((this.transferNotiStartType==null && other.getTransferNotiStartType()==null) || 
             (this.transferNotiStartType!=null &&
              this.transferNotiStartType.equals(other.getTransferNotiStartType()))) &&
            ((this.transferQSelector==null && other.getTransferQSelector()==null) || 
             (this.transferQSelector!=null &&
              this.transferQSelector.equals(other.getTransferQSelector()))) &&
            ((this.transferRequestType==null && other.getTransferRequestType()==null) || 
             (this.transferRequestType!=null &&
              this.transferRequestType.equals(other.getTransferRequestType()))) &&
            ((this.transferRequestTypeIS==null && other.getTransferRequestTypeIS()==null) || 
             (this.transferRequestTypeIS!=null &&
              this.transferRequestTypeIS.equals(other.getTransferRequestTypeIS()))) &&
            ((this.transferResponseType==null && other.getTransferResponseType()==null) || 
             (this.transferResponseType!=null &&
              this.transferResponseType.equals(other.getTransferResponseType()))) &&
            ((this.transferResponseTypeIS==null && other.getTransferResponseTypeIS()==null) || 
             (this.transferResponseTypeIS!=null &&
              this.transferResponseTypeIS.equals(other.getTransferResponseTypeIS()))) &&
            ((this.updatedBy==null && other.getUpdatedBy()==null) || 
             (this.updatedBy!=null &&
              this.updatedBy.equals(other.getUpdatedBy()))) &&
            ((this.userName==null && other.getUserName()==null) || 
             (this.userName!=null &&
              this.userName.equals(other.getUserName())));
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
        if (getQConnectionFactory() != null) {
            _hashCode += getQConnectionFactory().hashCode();
        }
        if (getTConnectionFactory() != null) {
            _hashCode += getTConnectionFactory().hashCode();
        }
        _hashCode += (isTIBCO() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isActiveMQ() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getAlertName() != null) {
            _hashCode += getAlertName().hashCode();
        }
        if (getAuditMaxRecords() != null) {
            _hashCode += getAuditMaxRecords().hashCode();
        }
        if (getAuditName() != null) {
            _hashCode += getAuditName().hashCode();
        }
        if (getAuditRequestType() != null) {
            _hashCode += getAuditRequestType().hashCode();
        }
        if (getAuditResponseType() != null) {
            _hashCode += getAuditResponseType().hashCode();
        }
        if (getAutoGenerateClientID() != null) {
            _hashCode += getAutoGenerateClientID().hashCode();
        }
        if (getClientID() != null) {
            _hashCode += getClientID().hashCode();
        }
        if (getContextFactory() != null) {
            _hashCode += getContextFactory().hashCode();
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
        if (getEnabled() != null) {
            _hashCode += getEnabled().hashCode();
        }
        if (getMgmtName() != null) {
            _hashCode += getMgmtName().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getPassword() != null) {
            _hashCode += getPassword().hashCode();
        }
        if (getReconnectInterval() != null) {
            _hashCode += getReconnectInterval().hashCode();
        }
        if (getSrvUrl() != null) {
            _hashCode += getSrvUrl().hashCode();
        }
        if (getTraceFlag() != null) {
            _hashCode += getTraceFlag().hashCode();
        }
        if (getTransferActivityEnabled() != null) {
            _hashCode += getTransferActivityEnabled().hashCode();
        }
        if (getTransferCheckInterval() != null) {
            _hashCode += getTransferCheckInterval().hashCode();
        }
        if (getTransferCheckTimeout() != null) {
            _hashCode += getTransferCheckTimeout().hashCode();
        }
        if (getTransferName() != null) {
            _hashCode += getTransferName().hashCode();
        }
        if (getTransferNotiActivityType() != null) {
            _hashCode += getTransferNotiActivityType().hashCode();
        }
        if (getTransferNotiEndEnabled() != null) {
            _hashCode += getTransferNotiEndEnabled().hashCode();
        }
        if (getTransferNotiEndPSEnabled() != null) {
            _hashCode += getTransferNotiEndPSEnabled().hashCode();
        }
        if (getTransferNotiEndType() != null) {
            _hashCode += getTransferNotiEndType().hashCode();
        }
        if (getTransferNotiName() != null) {
            _hashCode += getTransferNotiName().hashCode();
        }
        if (getTransferNotiStartEnabled() != null) {
            _hashCode += getTransferNotiStartEnabled().hashCode();
        }
        if (getTransferNotiStartType() != null) {
            _hashCode += getTransferNotiStartType().hashCode();
        }
        if (getTransferQSelector() != null) {
            _hashCode += getTransferQSelector().hashCode();
        }
        if (getTransferRequestType() != null) {
            _hashCode += getTransferRequestType().hashCode();
        }
        if (getTransferRequestTypeIS() != null) {
            _hashCode += getTransferRequestTypeIS().hashCode();
        }
        if (getTransferResponseType() != null) {
            _hashCode += getTransferResponseType().hashCode();
        }
        if (getTransferResponseTypeIS() != null) {
            _hashCode += getTransferResponseTypeIS().hashCode();
        }
        if (getUpdatedBy() != null) {
            _hashCode += getUpdatedBy().hashCode();
        }
        if (getUserName() != null) {
            _hashCode += getUserName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(JMSSrvCfg.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:AdministratorService", "JMSSrvCfg"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("QConnectionFactory");
        elemField.setXmlName(new javax.xml.namespace.QName("", "QConnectionFactory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TConnectionFactory");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TConnectionFactory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TIBCO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TIBCO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activeMQ");
        elemField.setXmlName(new javax.xml.namespace.QName("", "activeMQ"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alertName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "alertName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("auditMaxRecords");
        elemField.setXmlName(new javax.xml.namespace.QName("", "auditMaxRecords"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("auditName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "auditName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("auditRequestType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "auditRequestType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("auditResponseType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "auditResponseType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoGenerateClientID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "autoGenerateClientID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "clientID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contextFactory");
        elemField.setXmlName(new javax.xml.namespace.QName("", "contextFactory"));
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
        elemField.setFieldName("enabled");
        elemField.setXmlName(new javax.xml.namespace.QName("", "enabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mgmtName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mgmtName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
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
        elemField.setFieldName("reconnectInterval");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reconnectInterval"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("srvUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "srvUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("traceFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "traceFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferActivityEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transferActivityEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferCheckInterval");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transferCheckInterval"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferCheckTimeout");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transferCheckTimeout"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transferName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferNotiActivityType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transferNotiActivityType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferNotiEndEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transferNotiEndEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferNotiEndPSEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transferNotiEndPSEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferNotiEndType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transferNotiEndType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferNotiName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transferNotiName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferNotiStartEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transferNotiStartEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferNotiStartType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transferNotiStartType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferQSelector");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transferQSelector"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferRequestType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transferRequestType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferRequestTypeIS");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transferRequestTypeIS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferResponseType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transferResponseType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferResponseTypeIS");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transferResponseTypeIS"));
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
        elemField.setFieldName("userName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userName"));
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
