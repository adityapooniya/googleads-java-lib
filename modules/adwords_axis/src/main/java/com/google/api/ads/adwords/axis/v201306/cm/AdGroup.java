/**
 * AdGroup.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201306.cm;


/**
 * Represents an ad group.
 */
public class AdGroup  implements java.io.Serializable {
    /* ID of this ad group.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Id".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: ADD.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : SET.</span> */
    private java.lang.Long id;

    /* ID of the campaign with which this ad group is associated.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "CampaignId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span> */
    private java.lang.Long campaignId;

    /* Name of the campaign with which this ad group is associated.
     * <span class="constraint Selectable">This field can be selected using
     * the value "CampaignName".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private java.lang.String campaignName;

    /* Name of this ad group (at most 255 UTF-8 full-width characters).
     * This field is required and should not be {@code null} for ADD operations
     * from v201309 version.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Name".</span><span class="constraint
     * Filterable">This field can be filtered on.</span> */
    private java.lang.String name;

    /* Status of this ad group.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Status".</span><span class="constraint
     * Filterable">This field can be filtered on.</span> */
    private com.google.api.ads.adwords.axis.v201306.cm.AdGroupStatus status;

    /* List of settings for the AdGroup.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Settings".</span> */
    private com.google.api.ads.adwords.axis.v201306.cm.Setting[] settings;

    /* Data from a campaign bidding strategy experiment, returned
     * by
     *                 {@link AdGroupService#get get()} only if the experimentId
     * is supplied. */
    private com.google.api.ads.adwords.axis.v201306.cm.AdGroupExperimentData experimentData;

    /* Statistics for this ad group, returned by {@link AdGroupService#get
     * get()}
     *                 only if requested in the selector. */
    private com.google.api.ads.adwords.axis.v201306.cm.Stats stats;

    /* This Map provides a place to put new features and settings
     * in older versions
     *                 of the AdWords API in the rare instance we need to
     * introduce a new feature in
     *                 an older version.
     *                 
     *                 It is presently unused.  Do not set a value. */
    private com.google.api.ads.adwords.axis.v201306.cm.String_StringMapEntry[] forwardCompatibilityMap;

    /* Bidding configuration for this ad group. To set the bids on
     * the ad groups
     *                 use {@link BiddingStrategyConfiguration#bids}. Multiple
     * bids can be set on
     *                 ad group at the same time. Only the bids that apply
     * to the campaign's bidding
     *                 strategy {@linkplain Campaign#biddingStrategyConfiguration
     * bidding strategy}
     *                 will be used. */
    private com.google.api.ads.adwords.axis.v201306.cm.BiddingStrategyConfiguration biddingStrategyConfiguration;

    /* Allows advertisers to specify a criteria dimension on which
     * to place absolute bids.
     *                 This is only applicable for campaigns that target
     * only the content network and not search.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "ContentBidCriterionTypeGroup".</span><span
     * class="constraint Filterable">This field can be filtered on.</span> */
    private com.google.api.ads.adwords.axis.v201306.cm.CriterionTypeGroup contentBidCriterionTypeGroup;

    public AdGroup() {
    }

    public AdGroup(
           java.lang.Long id,
           java.lang.Long campaignId,
           java.lang.String campaignName,
           java.lang.String name,
           com.google.api.ads.adwords.axis.v201306.cm.AdGroupStatus status,
           com.google.api.ads.adwords.axis.v201306.cm.Setting[] settings,
           com.google.api.ads.adwords.axis.v201306.cm.AdGroupExperimentData experimentData,
           com.google.api.ads.adwords.axis.v201306.cm.Stats stats,
           com.google.api.ads.adwords.axis.v201306.cm.String_StringMapEntry[] forwardCompatibilityMap,
           com.google.api.ads.adwords.axis.v201306.cm.BiddingStrategyConfiguration biddingStrategyConfiguration,
           com.google.api.ads.adwords.axis.v201306.cm.CriterionTypeGroup contentBidCriterionTypeGroup) {
           this.id = id;
           this.campaignId = campaignId;
           this.campaignName = campaignName;
           this.name = name;
           this.status = status;
           this.settings = settings;
           this.experimentData = experimentData;
           this.stats = stats;
           this.forwardCompatibilityMap = forwardCompatibilityMap;
           this.biddingStrategyConfiguration = biddingStrategyConfiguration;
           this.contentBidCriterionTypeGroup = contentBidCriterionTypeGroup;
    }


    /**
     * Gets the id value for this AdGroup.
     * 
     * @return id   * ID of this ad group.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Id".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: ADD.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : SET.</span>
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this AdGroup.
     * 
     * @param id   * ID of this ad group.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Id".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: ADD.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : SET.</span>
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the campaignId value for this AdGroup.
     * 
     * @return campaignId   * ID of the campaign with which this ad group is associated.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "CampaignId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span>
     */
    public java.lang.Long getCampaignId() {
        return campaignId;
    }


    /**
     * Sets the campaignId value for this AdGroup.
     * 
     * @param campaignId   * ID of the campaign with which this ad group is associated.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "CampaignId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span>
     */
    public void setCampaignId(java.lang.Long campaignId) {
        this.campaignId = campaignId;
    }


    /**
     * Gets the campaignName value for this AdGroup.
     * 
     * @return campaignName   * Name of the campaign with which this ad group is associated.
     * <span class="constraint Selectable">This field can be selected using
     * the value "CampaignName".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public java.lang.String getCampaignName() {
        return campaignName;
    }


    /**
     * Sets the campaignName value for this AdGroup.
     * 
     * @param campaignName   * Name of the campaign with which this ad group is associated.
     * <span class="constraint Selectable">This field can be selected using
     * the value "CampaignName".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setCampaignName(java.lang.String campaignName) {
        this.campaignName = campaignName;
    }


    /**
     * Gets the name value for this AdGroup.
     * 
     * @return name   * Name of this ad group (at most 255 UTF-8 full-width characters).
     * This field is required and should not be {@code null} for ADD operations
     * from v201309 version.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Name".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this AdGroup.
     * 
     * @param name   * Name of this ad group (at most 255 UTF-8 full-width characters).
     * This field is required and should not be {@code null} for ADD operations
     * from v201309 version.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Name".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the status value for this AdGroup.
     * 
     * @return status   * Status of this ad group.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Status".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public com.google.api.ads.adwords.axis.v201306.cm.AdGroupStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this AdGroup.
     * 
     * @param status   * Status of this ad group.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Status".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public void setStatus(com.google.api.ads.adwords.axis.v201306.cm.AdGroupStatus status) {
        this.status = status;
    }


    /**
     * Gets the settings value for this AdGroup.
     * 
     * @return settings   * List of settings for the AdGroup.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Settings".</span>
     */
    public com.google.api.ads.adwords.axis.v201306.cm.Setting[] getSettings() {
        return settings;
    }


    /**
     * Sets the settings value for this AdGroup.
     * 
     * @param settings   * List of settings for the AdGroup.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Settings".</span>
     */
    public void setSettings(com.google.api.ads.adwords.axis.v201306.cm.Setting[] settings) {
        this.settings = settings;
    }

    public com.google.api.ads.adwords.axis.v201306.cm.Setting getSettings(int i) {
        return this.settings[i];
    }

    public void setSettings(int i, com.google.api.ads.adwords.axis.v201306.cm.Setting _value) {
        this.settings[i] = _value;
    }


    /**
     * Gets the experimentData value for this AdGroup.
     * 
     * @return experimentData   * Data from a campaign bidding strategy experiment, returned
     * by
     *                 {@link AdGroupService#get get()} only if the experimentId
     * is supplied.
     */
    public com.google.api.ads.adwords.axis.v201306.cm.AdGroupExperimentData getExperimentData() {
        return experimentData;
    }


    /**
     * Sets the experimentData value for this AdGroup.
     * 
     * @param experimentData   * Data from a campaign bidding strategy experiment, returned
     * by
     *                 {@link AdGroupService#get get()} only if the experimentId
     * is supplied.
     */
    public void setExperimentData(com.google.api.ads.adwords.axis.v201306.cm.AdGroupExperimentData experimentData) {
        this.experimentData = experimentData;
    }


    /**
     * Gets the stats value for this AdGroup.
     * 
     * @return stats   * Statistics for this ad group, returned by {@link AdGroupService#get
     * get()}
     *                 only if requested in the selector.
     */
    public com.google.api.ads.adwords.axis.v201306.cm.Stats getStats() {
        return stats;
    }


    /**
     * Sets the stats value for this AdGroup.
     * 
     * @param stats   * Statistics for this ad group, returned by {@link AdGroupService#get
     * get()}
     *                 only if requested in the selector.
     */
    public void setStats(com.google.api.ads.adwords.axis.v201306.cm.Stats stats) {
        this.stats = stats;
    }


    /**
     * Gets the forwardCompatibilityMap value for this AdGroup.
     * 
     * @return forwardCompatibilityMap   * This Map provides a place to put new features and settings
     * in older versions
     *                 of the AdWords API in the rare instance we need to
     * introduce a new feature in
     *                 an older version.
     *                 
     *                 It is presently unused.  Do not set a value.
     */
    public com.google.api.ads.adwords.axis.v201306.cm.String_StringMapEntry[] getForwardCompatibilityMap() {
        return forwardCompatibilityMap;
    }


    /**
     * Sets the forwardCompatibilityMap value for this AdGroup.
     * 
     * @param forwardCompatibilityMap   * This Map provides a place to put new features and settings
     * in older versions
     *                 of the AdWords API in the rare instance we need to
     * introduce a new feature in
     *                 an older version.
     *                 
     *                 It is presently unused.  Do not set a value.
     */
    public void setForwardCompatibilityMap(com.google.api.ads.adwords.axis.v201306.cm.String_StringMapEntry[] forwardCompatibilityMap) {
        this.forwardCompatibilityMap = forwardCompatibilityMap;
    }

    public com.google.api.ads.adwords.axis.v201306.cm.String_StringMapEntry getForwardCompatibilityMap(int i) {
        return this.forwardCompatibilityMap[i];
    }

    public void setForwardCompatibilityMap(int i, com.google.api.ads.adwords.axis.v201306.cm.String_StringMapEntry _value) {
        this.forwardCompatibilityMap[i] = _value;
    }


    /**
     * Gets the biddingStrategyConfiguration value for this AdGroup.
     * 
     * @return biddingStrategyConfiguration   * Bidding configuration for this ad group. To set the bids on
     * the ad groups
     *                 use {@link BiddingStrategyConfiguration#bids}. Multiple
     * bids can be set on
     *                 ad group at the same time. Only the bids that apply
     * to the campaign's bidding
     *                 strategy {@linkplain Campaign#biddingStrategyConfiguration
     * bidding strategy}
     *                 will be used.
     */
    public com.google.api.ads.adwords.axis.v201306.cm.BiddingStrategyConfiguration getBiddingStrategyConfiguration() {
        return biddingStrategyConfiguration;
    }


    /**
     * Sets the biddingStrategyConfiguration value for this AdGroup.
     * 
     * @param biddingStrategyConfiguration   * Bidding configuration for this ad group. To set the bids on
     * the ad groups
     *                 use {@link BiddingStrategyConfiguration#bids}. Multiple
     * bids can be set on
     *                 ad group at the same time. Only the bids that apply
     * to the campaign's bidding
     *                 strategy {@linkplain Campaign#biddingStrategyConfiguration
     * bidding strategy}
     *                 will be used.
     */
    public void setBiddingStrategyConfiguration(com.google.api.ads.adwords.axis.v201306.cm.BiddingStrategyConfiguration biddingStrategyConfiguration) {
        this.biddingStrategyConfiguration = biddingStrategyConfiguration;
    }


    /**
     * Gets the contentBidCriterionTypeGroup value for this AdGroup.
     * 
     * @return contentBidCriterionTypeGroup   * Allows advertisers to specify a criteria dimension on which
     * to place absolute bids.
     *                 This is only applicable for campaigns that target
     * only the content network and not search.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "ContentBidCriterionTypeGroup".</span><span
     * class="constraint Filterable">This field can be filtered on.</span>
     */
    public com.google.api.ads.adwords.axis.v201306.cm.CriterionTypeGroup getContentBidCriterionTypeGroup() {
        return contentBidCriterionTypeGroup;
    }


    /**
     * Sets the contentBidCriterionTypeGroup value for this AdGroup.
     * 
     * @param contentBidCriterionTypeGroup   * Allows advertisers to specify a criteria dimension on which
     * to place absolute bids.
     *                 This is only applicable for campaigns that target
     * only the content network and not search.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "ContentBidCriterionTypeGroup".</span><span
     * class="constraint Filterable">This field can be filtered on.</span>
     */
    public void setContentBidCriterionTypeGroup(com.google.api.ads.adwords.axis.v201306.cm.CriterionTypeGroup contentBidCriterionTypeGroup) {
        this.contentBidCriterionTypeGroup = contentBidCriterionTypeGroup;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdGroup)) return false;
        AdGroup other = (AdGroup) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.campaignId==null && other.getCampaignId()==null) || 
             (this.campaignId!=null &&
              this.campaignId.equals(other.getCampaignId()))) &&
            ((this.campaignName==null && other.getCampaignName()==null) || 
             (this.campaignName!=null &&
              this.campaignName.equals(other.getCampaignName()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.settings==null && other.getSettings()==null) || 
             (this.settings!=null &&
              java.util.Arrays.equals(this.settings, other.getSettings()))) &&
            ((this.experimentData==null && other.getExperimentData()==null) || 
             (this.experimentData!=null &&
              this.experimentData.equals(other.getExperimentData()))) &&
            ((this.stats==null && other.getStats()==null) || 
             (this.stats!=null &&
              this.stats.equals(other.getStats()))) &&
            ((this.forwardCompatibilityMap==null && other.getForwardCompatibilityMap()==null) || 
             (this.forwardCompatibilityMap!=null &&
              java.util.Arrays.equals(this.forwardCompatibilityMap, other.getForwardCompatibilityMap()))) &&
            ((this.biddingStrategyConfiguration==null && other.getBiddingStrategyConfiguration()==null) || 
             (this.biddingStrategyConfiguration!=null &&
              this.biddingStrategyConfiguration.equals(other.getBiddingStrategyConfiguration()))) &&
            ((this.contentBidCriterionTypeGroup==null && other.getContentBidCriterionTypeGroup()==null) || 
             (this.contentBidCriterionTypeGroup!=null &&
              this.contentBidCriterionTypeGroup.equals(other.getContentBidCriterionTypeGroup())));
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getCampaignId() != null) {
            _hashCode += getCampaignId().hashCode();
        }
        if (getCampaignName() != null) {
            _hashCode += getCampaignName().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getSettings() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSettings());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSettings(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExperimentData() != null) {
            _hashCode += getExperimentData().hashCode();
        }
        if (getStats() != null) {
            _hashCode += getStats().hashCode();
        }
        if (getForwardCompatibilityMap() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getForwardCompatibilityMap());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getForwardCompatibilityMap(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBiddingStrategyConfiguration() != null) {
            _hashCode += getBiddingStrategyConfiguration().hashCode();
        }
        if (getContentBidCriterionTypeGroup() != null) {
            _hashCode += getContentBidCriterionTypeGroup().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AdGroup.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "AdGroup"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaignId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "campaignId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaignName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "campaignName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "AdGroup.Status"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("settings");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "settings"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "Setting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("experimentData");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "experimentData"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "AdGroupExperimentData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stats");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "stats"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "Stats"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("forwardCompatibilityMap");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "forwardCompatibilityMap"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "String_StringMapEntry"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biddingStrategyConfiguration");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "biddingStrategyConfiguration"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "BiddingStrategyConfiguration"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contentBidCriterionTypeGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "contentBidCriterionTypeGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "CriterionTypeGroup"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
