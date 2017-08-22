/**
 * Key.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 11, 2014 (12:11:36 EDT) WSDL2Java emitter.
 */

package AdminClient;

public class Key  implements java.io.Serializable {
    private java.lang.String alias;

    private java.lang.String as2SignAlg;

    private java.lang.String comments;

    private java.lang.String createdBy;

    private AdminClient.DateTime dateCreated;

    private AdminClient.DateTime dateUpdated;

    private java.lang.String defaultKeyFlag;

    private java.lang.String description;

    private java.lang.String disabledFlag;

    private AdminClient.DateTime effectiveDate;

    private java.lang.String encryptionAlgorithm;

    private java.lang.String encryptionKeyFingerprint;

    private java.lang.String encryptionKeyId;

    private java.lang.String encryptionKeyLength;

    private AdminClient.DateTime expirationDate;

    private java.lang.String hashingAlgorithm;

    private java.lang.String id;

    private java.lang.String issuerName;

    private byte[] key;

    private AdminClient.DateTime keyCreationDate;

    private java.lang.String keyType;

    private java.lang.String name;

    private java.lang.String[] pgpUserIds;

    private java.lang.String privKeyPwd;

    private java.lang.String publicPrivateKeyFlag;

    private java.lang.String signingAlgorithm;

    private java.lang.String signingKeyFingerprint;

    private java.lang.String signingKeyId;

    private java.lang.String signingKeyLength;

    private java.lang.String sshKeyFormat;

    private java.lang.String subjectDN;

    private java.lang.String updatedBy;

    private java.lang.String userServerFlag;

    public Key() {
    }

    public Key(
           java.lang.String alias,
           java.lang.String as2SignAlg,
           java.lang.String comments,
           java.lang.String createdBy,
           AdminClient.DateTime dateCreated,
           AdminClient.DateTime dateUpdated,
           java.lang.String defaultKeyFlag,
           java.lang.String description,
           java.lang.String disabledFlag,
           AdminClient.DateTime effectiveDate,
           java.lang.String encryptionAlgorithm,
           java.lang.String encryptionKeyFingerprint,
           java.lang.String encryptionKeyId,
           java.lang.String encryptionKeyLength,
           AdminClient.DateTime expirationDate,
           java.lang.String hashingAlgorithm,
           java.lang.String id,
           java.lang.String issuerName,
           byte[] key,
           AdminClient.DateTime keyCreationDate,
           java.lang.String keyType,
           java.lang.String name,
           java.lang.String[] pgpUserIds,
           java.lang.String privKeyPwd,
           java.lang.String publicPrivateKeyFlag,
           java.lang.String signingAlgorithm,
           java.lang.String signingKeyFingerprint,
           java.lang.String signingKeyId,
           java.lang.String signingKeyLength,
           java.lang.String sshKeyFormat,
           java.lang.String subjectDN,
           java.lang.String updatedBy,
           java.lang.String userServerFlag) {
           this.alias = alias;
           this.as2SignAlg = as2SignAlg;
           this.comments = comments;
           this.createdBy = createdBy;
           this.dateCreated = dateCreated;
           this.dateUpdated = dateUpdated;
           this.defaultKeyFlag = defaultKeyFlag;
           this.description = description;
           this.disabledFlag = disabledFlag;
           this.effectiveDate = effectiveDate;
           this.encryptionAlgorithm = encryptionAlgorithm;
           this.encryptionKeyFingerprint = encryptionKeyFingerprint;
           this.encryptionKeyId = encryptionKeyId;
           this.encryptionKeyLength = encryptionKeyLength;
           this.expirationDate = expirationDate;
           this.hashingAlgorithm = hashingAlgorithm;
           this.id = id;
           this.issuerName = issuerName;
           this.key = key;
           this.keyCreationDate = keyCreationDate;
           this.keyType = keyType;
           this.name = name;
           this.pgpUserIds = pgpUserIds;
           this.privKeyPwd = privKeyPwd;
           this.publicPrivateKeyFlag = publicPrivateKeyFlag;
           this.signingAlgorithm = signingAlgorithm;
           this.signingKeyFingerprint = signingKeyFingerprint;
           this.signingKeyId = signingKeyId;
           this.signingKeyLength = signingKeyLength;
           this.sshKeyFormat = sshKeyFormat;
           this.subjectDN = subjectDN;
           this.updatedBy = updatedBy;
           this.userServerFlag = userServerFlag;
    }


    /**
     * Gets the alias value for this Key.
     * 
     * @return alias
     */
    public java.lang.String getAlias() {
        return alias;
    }


    /**
     * Sets the alias value for this Key.
     * 
     * @param alias
     */
    public void setAlias(java.lang.String alias) {
        this.alias = alias;
    }


    /**
     * Gets the as2SignAlg value for this Key.
     * 
     * @return as2SignAlg
     */
    public java.lang.String getAs2SignAlg() {
        return as2SignAlg;
    }


    /**
     * Sets the as2SignAlg value for this Key.
     * 
     * @param as2SignAlg
     */
    public void setAs2SignAlg(java.lang.String as2SignAlg) {
        this.as2SignAlg = as2SignAlg;
    }


    /**
     * Gets the comments value for this Key.
     * 
     * @return comments
     */
    public java.lang.String getComments() {
        return comments;
    }


    /**
     * Sets the comments value for this Key.
     * 
     * @param comments
     */
    public void setComments(java.lang.String comments) {
        this.comments = comments;
    }


    /**
     * Gets the createdBy value for this Key.
     * 
     * @return createdBy
     */
    public java.lang.String getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this Key.
     * 
     * @param createdBy
     */
    public void setCreatedBy(java.lang.String createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the dateCreated value for this Key.
     * 
     * @return dateCreated
     */
    public AdminClient.DateTime getDateCreated() {
        return dateCreated;
    }


    /**
     * Sets the dateCreated value for this Key.
     * 
     * @param dateCreated
     */
    public void setDateCreated(AdminClient.DateTime dateCreated) {
        this.dateCreated = dateCreated;
    }


    /**
     * Gets the dateUpdated value for this Key.
     * 
     * @return dateUpdated
     */
    public AdminClient.DateTime getDateUpdated() {
        return dateUpdated;
    }


    /**
     * Sets the dateUpdated value for this Key.
     * 
     * @param dateUpdated
     */
    public void setDateUpdated(AdminClient.DateTime dateUpdated) {
        this.dateUpdated = dateUpdated;
    }


    /**
     * Gets the defaultKeyFlag value for this Key.
     * 
     * @return defaultKeyFlag
     */
    public java.lang.String getDefaultKeyFlag() {
        return defaultKeyFlag;
    }


    /**
     * Sets the defaultKeyFlag value for this Key.
     * 
     * @param defaultKeyFlag
     */
    public void setDefaultKeyFlag(java.lang.String defaultKeyFlag) {
        this.defaultKeyFlag = defaultKeyFlag;
    }


    /**
     * Gets the description value for this Key.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Key.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the disabledFlag value for this Key.
     * 
     * @return disabledFlag
     */
    public java.lang.String getDisabledFlag() {
        return disabledFlag;
    }


    /**
     * Sets the disabledFlag value for this Key.
     * 
     * @param disabledFlag
     */
    public void setDisabledFlag(java.lang.String disabledFlag) {
        this.disabledFlag = disabledFlag;
    }


    /**
     * Gets the effectiveDate value for this Key.
     * 
     * @return effectiveDate
     */
    public AdminClient.DateTime getEffectiveDate() {
        return effectiveDate;
    }


    /**
     * Sets the effectiveDate value for this Key.
     * 
     * @param effectiveDate
     */
    public void setEffectiveDate(AdminClient.DateTime effectiveDate) {
        this.effectiveDate = effectiveDate;
    }


    /**
     * Gets the encryptionAlgorithm value for this Key.
     * 
     * @return encryptionAlgorithm
     */
    public java.lang.String getEncryptionAlgorithm() {
        return encryptionAlgorithm;
    }


    /**
     * Sets the encryptionAlgorithm value for this Key.
     * 
     * @param encryptionAlgorithm
     */
    public void setEncryptionAlgorithm(java.lang.String encryptionAlgorithm) {
        this.encryptionAlgorithm = encryptionAlgorithm;
    }


    /**
     * Gets the encryptionKeyFingerprint value for this Key.
     * 
     * @return encryptionKeyFingerprint
     */
    public java.lang.String getEncryptionKeyFingerprint() {
        return encryptionKeyFingerprint;
    }


    /**
     * Sets the encryptionKeyFingerprint value for this Key.
     * 
     * @param encryptionKeyFingerprint
     */
    public void setEncryptionKeyFingerprint(java.lang.String encryptionKeyFingerprint) {
        this.encryptionKeyFingerprint = encryptionKeyFingerprint;
    }


    /**
     * Gets the encryptionKeyId value for this Key.
     * 
     * @return encryptionKeyId
     */
    public java.lang.String getEncryptionKeyId() {
        return encryptionKeyId;
    }


    /**
     * Sets the encryptionKeyId value for this Key.
     * 
     * @param encryptionKeyId
     */
    public void setEncryptionKeyId(java.lang.String encryptionKeyId) {
        this.encryptionKeyId = encryptionKeyId;
    }


    /**
     * Gets the encryptionKeyLength value for this Key.
     * 
     * @return encryptionKeyLength
     */
    public java.lang.String getEncryptionKeyLength() {
        return encryptionKeyLength;
    }


    /**
     * Sets the encryptionKeyLength value for this Key.
     * 
     * @param encryptionKeyLength
     */
    public void setEncryptionKeyLength(java.lang.String encryptionKeyLength) {
        this.encryptionKeyLength = encryptionKeyLength;
    }


    /**
     * Gets the expirationDate value for this Key.
     * 
     * @return expirationDate
     */
    public AdminClient.DateTime getExpirationDate() {
        return expirationDate;
    }


    /**
     * Sets the expirationDate value for this Key.
     * 
     * @param expirationDate
     */
    public void setExpirationDate(AdminClient.DateTime expirationDate) {
        this.expirationDate = expirationDate;
    }


    /**
     * Gets the hashingAlgorithm value for this Key.
     * 
     * @return hashingAlgorithm
     */
    public java.lang.String getHashingAlgorithm() {
        return hashingAlgorithm;
    }


    /**
     * Sets the hashingAlgorithm value for this Key.
     * 
     * @param hashingAlgorithm
     */
    public void setHashingAlgorithm(java.lang.String hashingAlgorithm) {
        this.hashingAlgorithm = hashingAlgorithm;
    }


    /**
     * Gets the id value for this Key.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this Key.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the issuerName value for this Key.
     * 
     * @return issuerName
     */
    public java.lang.String getIssuerName() {
        return issuerName;
    }


    /**
     * Sets the issuerName value for this Key.
     * 
     * @param issuerName
     */
    public void setIssuerName(java.lang.String issuerName) {
        this.issuerName = issuerName;
    }


    /**
     * Gets the key value for this Key.
     * 
     * @return key
     */
    public byte[] getKey() {
        return key;
    }


    /**
     * Sets the key value for this Key.
     * 
     * @param key
     */
    public void setKey(byte[] key) {
        this.key = key;
    }


    /**
     * Gets the keyCreationDate value for this Key.
     * 
     * @return keyCreationDate
     */
    public AdminClient.DateTime getKeyCreationDate() {
        return keyCreationDate;
    }


    /**
     * Sets the keyCreationDate value for this Key.
     * 
     * @param keyCreationDate
     */
    public void setKeyCreationDate(AdminClient.DateTime keyCreationDate) {
        this.keyCreationDate = keyCreationDate;
    }


    /**
     * Gets the keyType value for this Key.
     * 
     * @return keyType
     */
    public java.lang.String getKeyType() {
        return keyType;
    }


    /**
     * Sets the keyType value for this Key.
     * 
     * @param keyType
     */
    public void setKeyType(java.lang.String keyType) {
        this.keyType = keyType;
    }


    /**
     * Gets the name value for this Key.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Key.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the pgpUserIds value for this Key.
     * 
     * @return pgpUserIds
     */
    public java.lang.String[] getPgpUserIds() {
        return pgpUserIds;
    }


    /**
     * Sets the pgpUserIds value for this Key.
     * 
     * @param pgpUserIds
     */
    public void setPgpUserIds(java.lang.String[] pgpUserIds) {
        this.pgpUserIds = pgpUserIds;
    }


    /**
     * Gets the privKeyPwd value for this Key.
     * 
     * @return privKeyPwd
     */
    public java.lang.String getPrivKeyPwd() {
        return privKeyPwd;
    }


    /**
     * Sets the privKeyPwd value for this Key.
     * 
     * @param privKeyPwd
     */
    public void setPrivKeyPwd(java.lang.String privKeyPwd) {
        this.privKeyPwd = privKeyPwd;
    }


    /**
     * Gets the publicPrivateKeyFlag value for this Key.
     * 
     * @return publicPrivateKeyFlag
     */
    public java.lang.String getPublicPrivateKeyFlag() {
        return publicPrivateKeyFlag;
    }


    /**
     * Sets the publicPrivateKeyFlag value for this Key.
     * 
     * @param publicPrivateKeyFlag
     */
    public void setPublicPrivateKeyFlag(java.lang.String publicPrivateKeyFlag) {
        this.publicPrivateKeyFlag = publicPrivateKeyFlag;
    }


    /**
     * Gets the signingAlgorithm value for this Key.
     * 
     * @return signingAlgorithm
     */
    public java.lang.String getSigningAlgorithm() {
        return signingAlgorithm;
    }


    /**
     * Sets the signingAlgorithm value for this Key.
     * 
     * @param signingAlgorithm
     */
    public void setSigningAlgorithm(java.lang.String signingAlgorithm) {
        this.signingAlgorithm = signingAlgorithm;
    }


    /**
     * Gets the signingKeyFingerprint value for this Key.
     * 
     * @return signingKeyFingerprint
     */
    public java.lang.String getSigningKeyFingerprint() {
        return signingKeyFingerprint;
    }


    /**
     * Sets the signingKeyFingerprint value for this Key.
     * 
     * @param signingKeyFingerprint
     */
    public void setSigningKeyFingerprint(java.lang.String signingKeyFingerprint) {
        this.signingKeyFingerprint = signingKeyFingerprint;
    }


    /**
     * Gets the signingKeyId value for this Key.
     * 
     * @return signingKeyId
     */
    public java.lang.String getSigningKeyId() {
        return signingKeyId;
    }


    /**
     * Sets the signingKeyId value for this Key.
     * 
     * @param signingKeyId
     */
    public void setSigningKeyId(java.lang.String signingKeyId) {
        this.signingKeyId = signingKeyId;
    }


    /**
     * Gets the signingKeyLength value for this Key.
     * 
     * @return signingKeyLength
     */
    public java.lang.String getSigningKeyLength() {
        return signingKeyLength;
    }


    /**
     * Sets the signingKeyLength value for this Key.
     * 
     * @param signingKeyLength
     */
    public void setSigningKeyLength(java.lang.String signingKeyLength) {
        this.signingKeyLength = signingKeyLength;
    }


    /**
     * Gets the sshKeyFormat value for this Key.
     * 
     * @return sshKeyFormat
     */
    public java.lang.String getSshKeyFormat() {
        return sshKeyFormat;
    }


    /**
     * Sets the sshKeyFormat value for this Key.
     * 
     * @param sshKeyFormat
     */
    public void setSshKeyFormat(java.lang.String sshKeyFormat) {
        this.sshKeyFormat = sshKeyFormat;
    }


    /**
     * Gets the subjectDN value for this Key.
     * 
     * @return subjectDN
     */
    public java.lang.String getSubjectDN() {
        return subjectDN;
    }


    /**
     * Sets the subjectDN value for this Key.
     * 
     * @param subjectDN
     */
    public void setSubjectDN(java.lang.String subjectDN) {
        this.subjectDN = subjectDN;
    }


    /**
     * Gets the updatedBy value for this Key.
     * 
     * @return updatedBy
     */
    public java.lang.String getUpdatedBy() {
        return updatedBy;
    }


    /**
     * Sets the updatedBy value for this Key.
     * 
     * @param updatedBy
     */
    public void setUpdatedBy(java.lang.String updatedBy) {
        this.updatedBy = updatedBy;
    }


    /**
     * Gets the userServerFlag value for this Key.
     * 
     * @return userServerFlag
     */
    public java.lang.String getUserServerFlag() {
        return userServerFlag;
    }


    /**
     * Sets the userServerFlag value for this Key.
     * 
     * @param userServerFlag
     */
    public void setUserServerFlag(java.lang.String userServerFlag) {
        this.userServerFlag = userServerFlag;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Key)) return false;
        Key other = (Key) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.alias==null && other.getAlias()==null) || 
             (this.alias!=null &&
              this.alias.equals(other.getAlias()))) &&
            ((this.as2SignAlg==null && other.getAs2SignAlg()==null) || 
             (this.as2SignAlg!=null &&
              this.as2SignAlg.equals(other.getAs2SignAlg()))) &&
            ((this.comments==null && other.getComments()==null) || 
             (this.comments!=null &&
              this.comments.equals(other.getComments()))) &&
            ((this.createdBy==null && other.getCreatedBy()==null) || 
             (this.createdBy!=null &&
              this.createdBy.equals(other.getCreatedBy()))) &&
            ((this.dateCreated==null && other.getDateCreated()==null) || 
             (this.dateCreated!=null &&
              this.dateCreated.equals(other.getDateCreated()))) &&
            ((this.dateUpdated==null && other.getDateUpdated()==null) || 
             (this.dateUpdated!=null &&
              this.dateUpdated.equals(other.getDateUpdated()))) &&
            ((this.defaultKeyFlag==null && other.getDefaultKeyFlag()==null) || 
             (this.defaultKeyFlag!=null &&
              this.defaultKeyFlag.equals(other.getDefaultKeyFlag()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.disabledFlag==null && other.getDisabledFlag()==null) || 
             (this.disabledFlag!=null &&
              this.disabledFlag.equals(other.getDisabledFlag()))) &&
            ((this.effectiveDate==null && other.getEffectiveDate()==null) || 
             (this.effectiveDate!=null &&
              this.effectiveDate.equals(other.getEffectiveDate()))) &&
            ((this.encryptionAlgorithm==null && other.getEncryptionAlgorithm()==null) || 
             (this.encryptionAlgorithm!=null &&
              this.encryptionAlgorithm.equals(other.getEncryptionAlgorithm()))) &&
            ((this.encryptionKeyFingerprint==null && other.getEncryptionKeyFingerprint()==null) || 
             (this.encryptionKeyFingerprint!=null &&
              this.encryptionKeyFingerprint.equals(other.getEncryptionKeyFingerprint()))) &&
            ((this.encryptionKeyId==null && other.getEncryptionKeyId()==null) || 
             (this.encryptionKeyId!=null &&
              this.encryptionKeyId.equals(other.getEncryptionKeyId()))) &&
            ((this.encryptionKeyLength==null && other.getEncryptionKeyLength()==null) || 
             (this.encryptionKeyLength!=null &&
              this.encryptionKeyLength.equals(other.getEncryptionKeyLength()))) &&
            ((this.expirationDate==null && other.getExpirationDate()==null) || 
             (this.expirationDate!=null &&
              this.expirationDate.equals(other.getExpirationDate()))) &&
            ((this.hashingAlgorithm==null && other.getHashingAlgorithm()==null) || 
             (this.hashingAlgorithm!=null &&
              this.hashingAlgorithm.equals(other.getHashingAlgorithm()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.issuerName==null && other.getIssuerName()==null) || 
             (this.issuerName!=null &&
              this.issuerName.equals(other.getIssuerName()))) &&
            ((this.key==null && other.getKey()==null) || 
             (this.key!=null &&
              java.util.Arrays.equals(this.key, other.getKey()))) &&
            ((this.keyCreationDate==null && other.getKeyCreationDate()==null) || 
             (this.keyCreationDate!=null &&
              this.keyCreationDate.equals(other.getKeyCreationDate()))) &&
            ((this.keyType==null && other.getKeyType()==null) || 
             (this.keyType!=null &&
              this.keyType.equals(other.getKeyType()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.pgpUserIds==null && other.getPgpUserIds()==null) || 
             (this.pgpUserIds!=null &&
              java.util.Arrays.equals(this.pgpUserIds, other.getPgpUserIds()))) &&
            ((this.privKeyPwd==null && other.getPrivKeyPwd()==null) || 
             (this.privKeyPwd!=null &&
              this.privKeyPwd.equals(other.getPrivKeyPwd()))) &&
            ((this.publicPrivateKeyFlag==null && other.getPublicPrivateKeyFlag()==null) || 
             (this.publicPrivateKeyFlag!=null &&
              this.publicPrivateKeyFlag.equals(other.getPublicPrivateKeyFlag()))) &&
            ((this.signingAlgorithm==null && other.getSigningAlgorithm()==null) || 
             (this.signingAlgorithm!=null &&
              this.signingAlgorithm.equals(other.getSigningAlgorithm()))) &&
            ((this.signingKeyFingerprint==null && other.getSigningKeyFingerprint()==null) || 
             (this.signingKeyFingerprint!=null &&
              this.signingKeyFingerprint.equals(other.getSigningKeyFingerprint()))) &&
            ((this.signingKeyId==null && other.getSigningKeyId()==null) || 
             (this.signingKeyId!=null &&
              this.signingKeyId.equals(other.getSigningKeyId()))) &&
            ((this.signingKeyLength==null && other.getSigningKeyLength()==null) || 
             (this.signingKeyLength!=null &&
              this.signingKeyLength.equals(other.getSigningKeyLength()))) &&
            ((this.sshKeyFormat==null && other.getSshKeyFormat()==null) || 
             (this.sshKeyFormat!=null &&
              this.sshKeyFormat.equals(other.getSshKeyFormat()))) &&
            ((this.subjectDN==null && other.getSubjectDN()==null) || 
             (this.subjectDN!=null &&
              this.subjectDN.equals(other.getSubjectDN()))) &&
            ((this.updatedBy==null && other.getUpdatedBy()==null) || 
             (this.updatedBy!=null &&
              this.updatedBy.equals(other.getUpdatedBy()))) &&
            ((this.userServerFlag==null && other.getUserServerFlag()==null) || 
             (this.userServerFlag!=null &&
              this.userServerFlag.equals(other.getUserServerFlag())));
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
        if (getAlias() != null) {
            _hashCode += getAlias().hashCode();
        }
        if (getAs2SignAlg() != null) {
            _hashCode += getAs2SignAlg().hashCode();
        }
        if (getComments() != null) {
            _hashCode += getComments().hashCode();
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
        if (getDefaultKeyFlag() != null) {
            _hashCode += getDefaultKeyFlag().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getDisabledFlag() != null) {
            _hashCode += getDisabledFlag().hashCode();
        }
        if (getEffectiveDate() != null) {
            _hashCode += getEffectiveDate().hashCode();
        }
        if (getEncryptionAlgorithm() != null) {
            _hashCode += getEncryptionAlgorithm().hashCode();
        }
        if (getEncryptionKeyFingerprint() != null) {
            _hashCode += getEncryptionKeyFingerprint().hashCode();
        }
        if (getEncryptionKeyId() != null) {
            _hashCode += getEncryptionKeyId().hashCode();
        }
        if (getEncryptionKeyLength() != null) {
            _hashCode += getEncryptionKeyLength().hashCode();
        }
        if (getExpirationDate() != null) {
            _hashCode += getExpirationDate().hashCode();
        }
        if (getHashingAlgorithm() != null) {
            _hashCode += getHashingAlgorithm().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getIssuerName() != null) {
            _hashCode += getIssuerName().hashCode();
        }
        if (getKey() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getKey());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getKey(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getKeyCreationDate() != null) {
            _hashCode += getKeyCreationDate().hashCode();
        }
        if (getKeyType() != null) {
            _hashCode += getKeyType().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getPgpUserIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPgpUserIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPgpUserIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPrivKeyPwd() != null) {
            _hashCode += getPrivKeyPwd().hashCode();
        }
        if (getPublicPrivateKeyFlag() != null) {
            _hashCode += getPublicPrivateKeyFlag().hashCode();
        }
        if (getSigningAlgorithm() != null) {
            _hashCode += getSigningAlgorithm().hashCode();
        }
        if (getSigningKeyFingerprint() != null) {
            _hashCode += getSigningKeyFingerprint().hashCode();
        }
        if (getSigningKeyId() != null) {
            _hashCode += getSigningKeyId().hashCode();
        }
        if (getSigningKeyLength() != null) {
            _hashCode += getSigningKeyLength().hashCode();
        }
        if (getSshKeyFormat() != null) {
            _hashCode += getSshKeyFormat().hashCode();
        }
        if (getSubjectDN() != null) {
            _hashCode += getSubjectDN().hashCode();
        }
        if (getUpdatedBy() != null) {
            _hashCode += getUpdatedBy().hashCode();
        }
        if (getUserServerFlag() != null) {
            _hashCode += getUserServerFlag().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Key.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:AdministratorService", "Key"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alias");
        elemField.setXmlName(new javax.xml.namespace.QName("", "alias"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("as2SignAlg");
        elemField.setXmlName(new javax.xml.namespace.QName("", "as2SignAlg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comments");
        elemField.setXmlName(new javax.xml.namespace.QName("", "comments"));
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
        elemField.setFieldName("defaultKeyFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "defaultKeyFlag"));
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
        elemField.setFieldName("disabledFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "disabledFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("effectiveDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "effectiveDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:AdministratorService", "DateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("encryptionAlgorithm");
        elemField.setXmlName(new javax.xml.namespace.QName("", "encryptionAlgorithm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("encryptionKeyFingerprint");
        elemField.setXmlName(new javax.xml.namespace.QName("", "encryptionKeyFingerprint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("encryptionKeyId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "encryptionKeyId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("encryptionKeyLength");
        elemField.setXmlName(new javax.xml.namespace.QName("", "encryptionKeyLength"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expirationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "expirationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:AdministratorService", "DateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hashingAlgorithm");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hashingAlgorithm"));
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
        elemField.setFieldName("issuerName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "issuerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("key");
        elemField.setXmlName(new javax.xml.namespace.QName("", "key"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keyCreationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "keyCreationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:AdministratorService", "DateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keyType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "keyType"));
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
        elemField.setFieldName("pgpUserIds");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pgpUserIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("privKeyPwd");
        elemField.setXmlName(new javax.xml.namespace.QName("", "privKeyPwd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publicPrivateKeyFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "publicPrivateKeyFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signingAlgorithm");
        elemField.setXmlName(new javax.xml.namespace.QName("", "signingAlgorithm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signingKeyFingerprint");
        elemField.setXmlName(new javax.xml.namespace.QName("", "signingKeyFingerprint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signingKeyId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "signingKeyId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signingKeyLength");
        elemField.setXmlName(new javax.xml.namespace.QName("", "signingKeyLength"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sshKeyFormat");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sshKeyFormat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subjectDN");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subjectDN"));
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
        elemField.setFieldName("userServerFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userServerFlag"));
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
