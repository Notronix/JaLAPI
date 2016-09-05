package com.notronix.lw.model;

public class OrderGeneralInfo
{
    private Integer Status;
    private Boolean LabelPrinted;
    private String LabelError;
    private Boolean InvoicePrinted;
    private Boolean PickListPrinted;
    private Integer Notes;
    private Boolean PartShipped;
    private Byte Marker;
    private String ReferenceNum;
    private String ExternalReferenceNum;
    private String ReceivedDate;
    private String Source;
    private String SubSource;
    private Boolean HoldOrCancel;
    private String DespatchByDate;
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
}
