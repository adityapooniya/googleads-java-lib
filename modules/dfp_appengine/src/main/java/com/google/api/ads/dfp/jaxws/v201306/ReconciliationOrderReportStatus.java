
package com.google.api.ads.dfp.jaxws.v201306;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReconciliationOrderReportStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReconciliationOrderReportStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DRAFT"/>
 *     &lt;enumeration value="RECONCILED"/>
 *     &lt;enumeration value="REVERTED"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ReconciliationOrderReportStatus")
@XmlEnum
public enum ReconciliationOrderReportStatus {


    /**
     * 
     *                 The starting status of a reconciliation order report.
     *                 Rows are updatable in the {@code DRAFT} state. Reconciliation order reports
     *                 can be submitted with the {@link SubmitReconciliationOrderReports} action to change
     *                 the status to {@link #RECONCILED}.
     *               
     * 
     */
    DRAFT,

    /**
     * 
     *                 The final status of a reconciliation order report.
     *                 Rows are not updatable in the {@code RECONCILED} state. Reconciliation order reports
     *                 can be reverted with the {@link RevertReconciliationOrderReports} action to change the
     *                 status to {@link #REVERTED}.
     *               
     * 
     */
    RECONCILED,

    /**
     * 
     *                 A similar status to {@code DRAFT}.
     *                 Rows are updatable in the {@code REVERTED} state. Reconciliation order reports
     *                 can be submitted with the {@link SubmitReconciliationOrderReports} action to change the
     *                 status to {@link #RECONCILED}.
     *               
     * 
     */
    REVERTED,

    /**
     * 
     *                 The value returned if the actual value is not exposed by the requested API version.
     *               
     * 
     */
    UNKNOWN;

    public String value() {
        return name();
    }

    public static ReconciliationOrderReportStatus fromValue(String v) {
        return valueOf(v);
    }

}
