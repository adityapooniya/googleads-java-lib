
package com.google.api.ads.dfp.jaxws.v201208;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LabelType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LabelType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="COMPETITIVE_EXCLUSION"/>
 *     &lt;enumeration value="AD_UNIT_FREQUENCY_CAP"/>
 *     &lt;enumeration value="AD_EXCLUSION"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LabelType")
@XmlEnum
public enum LabelType {


    /**
     * 
     *                 Allows for the creation of labels to exclude competing ads from showing on
     *                 the same page.
     *               
     * 
     */
    COMPETITIVE_EXCLUSION,

    /**
     * 
     *                 Allows for the creation of limits on the frequency that a user sees a
     *                 particular type of creative over a portion of the inventory.
     *               
     * 
     */
    AD_UNIT_FREQUENCY_CAP,

    /**
     * 
     *                 Allows for the creation of labels to exclude ads from showing against a tag
     *                 that specifies the label as an exclusion.
     *               
     * 
     */
    AD_EXCLUSION;

    public String value() {
        return name();
    }

    public static LabelType fromValue(String v) {
        return valueOf(v);
    }

}
