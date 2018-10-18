package com.notronix.lw.model;

import java.util.List;

public class OrderGeneralInfo
{
    private Integer Status;
    private Boolean LabelPrinted;
    private String LabelError;
    private Boolean InvoicePrinted;
    private Boolean PickListPrinted;
    private Boolean IsRuleRun;
    private Integer Notes;
    private Boolean PartShipped;
    private Byte Marker;
    private Boolean IsParked;
    private List<OrderIdentifier> Identifiers;
    private String ReferenceNum;
    private String SecondaryReference;
    private String ExternalReferenceNum;
    private String ReceivedDate;
    private String Source;
    private String SubSource;
    private String SiteCode;
    private Boolean HoldOrCancel;
    private String DespatchByDate;
    private ScheduledDelivery ScheduledDelivery;
    private Boolean HasScheduledDelivery;
    private String Location;
    private Integer NumItems;

    public Integer getStatus()
    {
        return Status;
    }

    public void setStatus(Integer status)
    {
        Status = status;
    }

    public Boolean getLabelPrinted()
    {
        return LabelPrinted;
    }

    public void setLabelPrinted(Boolean labelPrinted)
    {
        LabelPrinted = labelPrinted;
    }

    public String getLabelError()
    {
        return LabelError;
    }

    public void setLabelError(String labelError)
    {
        LabelError = labelError;
    }

    public Boolean getInvoicePrinted()
    {
        return InvoicePrinted;
    }

    public void setInvoicePrinted(Boolean invoicePrinted)
    {
        InvoicePrinted = invoicePrinted;
    }

    public Boolean getPickListPrinted()
    {
        return PickListPrinted;
    }

    public void setPickListPrinted(Boolean pickListPrinted)
    {
        PickListPrinted = pickListPrinted;
    }

    public Integer getNotes()
    {
        return Notes;
    }

    public void setNotes(Integer notes)
    {
        Notes = notes;
    }

    public Boolean getPartShipped()
    {
        return PartShipped;
    }

    public void setPartShipped(Boolean partShipped)
    {
        PartShipped = partShipped;
    }

    public Byte getMarker()
    {
        return Marker;
    }

    public void setMarker(Byte marker)
    {
        Marker = marker;
    }

    public String getReferenceNum()
    {
        return ReferenceNum;
    }

    public void setReferenceNum(String referenceNum)
    {
        ReferenceNum = referenceNum;
    }

    public String getExternalReferenceNum()
    {
        return ExternalReferenceNum;
    }

    public void setExternalReferenceNum(String externalReferenceNum)
    {
        ExternalReferenceNum = externalReferenceNum;
    }

    public String getReceivedDate()
    {
        return ReceivedDate;
    }

    public void setReceivedDate(String receivedDate)
    {
        ReceivedDate = receivedDate;
    }

    public String getSource()
    {
        return Source;
    }

    public void setSource(String source)
    {
        Source = source;
    }

    public String getSubSource()
    {
        return SubSource;
    }

    public void setSubSource(String subSource)
    {
        SubSource = subSource;
    }

    public Boolean getHoldOrCancel()
    {
        return HoldOrCancel;
    }

    public void setHoldOrCancel(Boolean holdOrCancel)
    {
        HoldOrCancel = holdOrCancel;
    }

    public String getDespatchByDate()
    {
        return DespatchByDate;
    }

    public void setDespatchByDate(String despatchByDate)
    {
        DespatchByDate = despatchByDate;
    }

    public Integer getNumItems()
    {
        return NumItems;
    }

    public void setNumItems(Integer numItems)
    {
        NumItems = numItems;
    }

    public Boolean getRuleRun() {
        return IsRuleRun;
    }

    public void setRuleRun(Boolean ruleRun) {
        IsRuleRun = ruleRun;
    }

    public Boolean getParked() {
        return IsParked;
    }

    public void setParked(Boolean parked) {
        IsParked = parked;
    }

    public List<OrderIdentifier> getIdentifiers() {
        return Identifiers;
    }

    public void setIdentifiers(List<OrderIdentifier> identifiers) {
        Identifiers = identifiers;
    }

    public String getSecondaryReference() {
        return SecondaryReference;
    }

    public void setSecondaryReference(String secondaryReference) {
        SecondaryReference = secondaryReference;
    }

    public String getSiteCode() {
        return SiteCode;
    }

    public void setSiteCode(String siteCode) {
        SiteCode = siteCode;
    }

    public com.notronix.lw.model.ScheduledDelivery getScheduledDelivery() {
        return ScheduledDelivery;
    }

    public void setScheduledDelivery(com.notronix.lw.model.ScheduledDelivery scheduledDelivery) {
        ScheduledDelivery = scheduledDelivery;
    }

    public Boolean getHasScheduledDelivery() {
        return HasScheduledDelivery;
    }

    public void setHasScheduledDelivery(Boolean hasScheduledDelivery) {
        HasScheduledDelivery = hasScheduledDelivery;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }
}
