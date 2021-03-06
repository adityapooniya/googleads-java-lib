
package com.google.api.ads.dfp.jaxws.v201208;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A {@code Creative} that points to an externally hosted VAST ad and is
 *             served via VAST 2.0 XML as a VAST Wrapper.  This creative is read only.
 *           
 * 
 * <p>Java class for VastRedirectCreative complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VastRedirectCreative">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.google.com/apis/ads/publisher/v201208}Creative">
 *       &lt;sequence>
 *         &lt;element name="vastXmlUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vastRedirectType" type="{https://www.google.com/apis/ads/publisher/v201208}VastRedirectType" minOccurs="0"/>
 *         &lt;element name="companionCreativeIds" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="trackingUrls" type="{https://www.google.com/apis/ads/publisher/v201208}ConversionEvent_TrackingUrlsMapEntry" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VastRedirectCreative", propOrder = {
    "vastXmlUrl",
    "vastRedirectType",
    "companionCreativeIds",
    "trackingUrls"
})
public class VastRedirectCreative
    extends Creative
{

    protected String vastXmlUrl;
    protected VastRedirectType vastRedirectType;
    @XmlElement(type = Long.class)
    protected List<Long> companionCreativeIds;
    protected List<ConversionEventTrackingUrlsMapEntry> trackingUrls;

    /**
     * Gets the value of the vastXmlUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVastXmlUrl() {
        return vastXmlUrl;
    }

    /**
     * Sets the value of the vastXmlUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVastXmlUrl(String value) {
        this.vastXmlUrl = value;
    }

    /**
     * Gets the value of the vastRedirectType property.
     * 
     * @return
     *     possible object is
     *     {@link VastRedirectType }
     *     
     */
    public VastRedirectType getVastRedirectType() {
        return vastRedirectType;
    }

    /**
     * Sets the value of the vastRedirectType property.
     * 
     * @param value
     *     allowed object is
     *     {@link VastRedirectType }
     *     
     */
    public void setVastRedirectType(VastRedirectType value) {
        this.vastRedirectType = value;
    }

    /**
     * Gets the value of the companionCreativeIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the companionCreativeIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompanionCreativeIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getCompanionCreativeIds() {
        if (companionCreativeIds == null) {
            companionCreativeIds = new ArrayList<Long>();
        }
        return this.companionCreativeIds;
    }

    /**
     * Gets the value of the trackingUrls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trackingUrls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrackingUrls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConversionEventTrackingUrlsMapEntry }
     * 
     * 
     */
    public List<ConversionEventTrackingUrlsMapEntry> getTrackingUrls() {
        if (trackingUrls == null) {
            trackingUrls = new ArrayList<ConversionEventTrackingUrlsMapEntry>();
        }
        return this.trackingUrls;
    }

}
