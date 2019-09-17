package com.notronix.lw.api.model;

import java.time.Instant;
import java.util.List;
import java.util.Set;
import java.util.UUID;

public class ChannelOrder
{
    private Boolean UseChannelTax;
    private UUID pkOrderId;
    private Boolean AutomaticallyLinkBySKU;
    private String Site;
    private String MatchPostalServiceTag;
    private String PostalServiceName;
    private Boolean SavePostalServiceIfNotExist;
    private String MatchPaymentMethodTag;
    private String PaymentMethodName;
    private Boolean SavePaymentMethodIfNotExist;
    private String MappingSource;
    private OrderState OrderState;
    private PaymentStatus PaymentStatus;
    private List<ChannelOrderItem> OrderItems;
    private List<ChannelOrderExtendedProperty> ExtendedProperties;
    private List<ChannelOrderNote> Notes;
    private String Source;
    private String SubSource;
    private String ChannelBuyerName;
    private String ReferenceNumber;
    private String ExternalReference;
    private String SecondaryReferenceNumber;
    private String Currency;
    private Double ConversionRate;
    private Instant ReceivedDate;
    private Instant DispatchBy;
    private Instant PaidOn;
    private Double PostalServiceCost;
    private Double PostalServiceTaxRate;
    private Double PostalServiceDiscount;
    private Double Discount;
    private DiscountType DiscountType;
    private DiscountTaxType	DiscountTaxType;
    private ChannelAddress BillingAddress;
    private ChannelAddress DeliveryAddress;
    private OrderXML OrderXML;
    private Instant DeliveryStartDate;
    private Instant DeliveryEndDate;
    private Set<String> OrderIdentifierTags;
    private Boolean ForceReSaveFulfilledOrder;

    public Boolean getUseChannelTax() {
        return UseChannelTax;
    }

    public void setUseChannelTax(Boolean useChannelTax) {
        UseChannelTax = useChannelTax;
    }

    public UUID getPkOrderId() {
        return pkOrderId;
    }

    public void setPkOrderId(UUID pkOrderId) {
        this.pkOrderId = pkOrderId;
    }

    public Boolean getAutomaticallyLinkBySKU() {
        return AutomaticallyLinkBySKU;
    }

    public void setAutomaticallyLinkBySKU(Boolean automaticallyLinkBySKU) {
        AutomaticallyLinkBySKU = automaticallyLinkBySKU;
    }

    public String getSite() {
        return Site;
    }

    public void setSite(String site) {
        Site = site;
    }

    public String getMatchPostalServiceTag() {
        return MatchPostalServiceTag;
    }

    public void setMatchPostalServiceTag(String matchPostalServiceTag) {
        MatchPostalServiceTag = matchPostalServiceTag;
    }

    public String getPostalServiceName() {
        return PostalServiceName;
    }

    public void setPostalServiceName(String postalServiceName) {
        PostalServiceName = postalServiceName;
    }

    public Boolean getSavePostalServiceIfNotExist() {
        return SavePostalServiceIfNotExist;
    }

    public void setSavePostalServiceIfNotExist(Boolean savePostalServiceIfNotExist) {
        SavePostalServiceIfNotExist = savePostalServiceIfNotExist;
    }

    public String getMatchPaymentMethodTag() {
        return MatchPaymentMethodTag;
    }

    public void setMatchPaymentMethodTag(String matchPaymentMethodTag) {
        MatchPaymentMethodTag = matchPaymentMethodTag;
    }

    public String getPaymentMethodName() {
        return PaymentMethodName;
    }

    public void setPaymentMethodName(String paymentMethodName) {
        PaymentMethodName = paymentMethodName;
    }

    public Boolean getSavePaymentMethodIfNotExist() {
        return SavePaymentMethodIfNotExist;
    }

    public void setSavePaymentMethodIfNotExist(Boolean savePaymentMethodIfNotExist) {
        SavePaymentMethodIfNotExist = savePaymentMethodIfNotExist;
    }

    public String getMappingSource() {
        return MappingSource;
    }

    public void setMappingSource(String mappingSource) {
        MappingSource = mappingSource;
    }

    public com.notronix.lw.api.model.OrderState getOrderState() {
        return OrderState;
    }

    public void setOrderState(com.notronix.lw.api.model.OrderState orderState) {
        OrderState = orderState;
    }

    public com.notronix.lw.api.model.PaymentStatus getPaymentStatus() {
        return PaymentStatus;
    }

    public void setPaymentStatus(com.notronix.lw.api.model.PaymentStatus paymentStatus) {
        PaymentStatus = paymentStatus;
    }

    public List<ChannelOrderItem> getOrderItems() {
        return OrderItems;
    }

    public void setOrderItems(List<ChannelOrderItem> orderItems) {
        OrderItems = orderItems;
    }

    public List<ChannelOrderExtendedProperty> getExtendedProperties() {
        return ExtendedProperties;
    }

    public void setExtendedProperties(List<ChannelOrderExtendedProperty> extendedProperties) {
        ExtendedProperties = extendedProperties;
    }

    public List<ChannelOrderNote> getNotes() {
        return Notes;
    }

    public void setNotes(List<ChannelOrderNote> notes) {
        Notes = notes;
    }

    public String getSource() {
        return Source;
    }

    public void setSource(String source) {
        Source = source;
    }

    public String getSubSource() {
        return SubSource;
    }

    public void setSubSource(String subSource) {
        SubSource = subSource;
    }

    public String getChannelBuyerName() {
        return ChannelBuyerName;
    }

    public void setChannelBuyerName(String channelBuyerName) {
        ChannelBuyerName = channelBuyerName;
    }

    public String getReferenceNumber() {
        return ReferenceNumber;
    }

    public void setReferenceNumber(String referenceNumber) {
        ReferenceNumber = referenceNumber;
    }

    public String getExternalReference() {
        return ExternalReference;
    }

    public void setExternalReference(String externalReference) {
        ExternalReference = externalReference;
    }

    public String getSecondaryReferenceNumber() {
        return SecondaryReferenceNumber;
    }

    public void setSecondaryReferenceNumber(String secondaryReferenceNumber) {
        SecondaryReferenceNumber = secondaryReferenceNumber;
    }

    public String getCurrency() {
        return Currency;
    }

    public void setCurrency(String currency) {
        Currency = currency;
    }

    public Double getConversionRate() {
        return ConversionRate;
    }

    public void setConversionRate(Double conversionRate) {
        ConversionRate = conversionRate;
    }

    public Instant getReceivedDate() {
        return ReceivedDate;
    }

    public void setReceivedDate(Instant receivedDate) {
        ReceivedDate = receivedDate;
    }

    public Instant getDispatchBy() {
        return DispatchBy;
    }

    public void setDispatchBy(Instant dispatchBy) {
        DispatchBy = dispatchBy;
    }

    public Instant getPaidOn() {
        return PaidOn;
    }

    public void setPaidOn(Instant paidOn) {
        PaidOn = paidOn;
    }

    public Double getPostalServiceCost() {
        return PostalServiceCost;
    }

    public void setPostalServiceCost(Double postalServiceCost) {
        PostalServiceCost = postalServiceCost;
    }

    public Double getPostalServiceTaxRate() {
        return PostalServiceTaxRate;
    }

    public void setPostalServiceTaxRate(Double postalServiceTaxRate) {
        PostalServiceTaxRate = postalServiceTaxRate;
    }

    public Double getPostalServiceDiscount() {
        return PostalServiceDiscount;
    }

    public void setPostalServiceDiscount(Double postalServiceDiscount) {
        PostalServiceDiscount = postalServiceDiscount;
    }

    public Double getDiscount() {
        return Discount;
    }

    public void setDiscount(Double discount) {
        Discount = discount;
    }

    public com.notronix.lw.api.model.DiscountType getDiscountType() {
        return DiscountType;
    }

    public void setDiscountType(com.notronix.lw.api.model.DiscountType discountType) {
        DiscountType = discountType;
    }

    public com.notronix.lw.api.model.DiscountTaxType getDiscountTaxType() {
        return DiscountTaxType;
    }

    public void setDiscountTaxType(com.notronix.lw.api.model.DiscountTaxType discountTaxType) {
        DiscountTaxType = discountTaxType;
    }

    public ChannelAddress getBillingAddress() {
        return BillingAddress;
    }

    public void setBillingAddress(ChannelAddress billingAddress) {
        BillingAddress = billingAddress;
    }

    public ChannelAddress getDeliveryAddress() {
        return DeliveryAddress;
    }

    public void setDeliveryAddress(ChannelAddress deliveryAddress) {
        DeliveryAddress = deliveryAddress;
    }

    public com.notronix.lw.api.model.OrderXML getOrderXML() {
        return OrderXML;
    }

    public void setOrderXML(com.notronix.lw.api.model.OrderXML orderXML) {
        OrderXML = orderXML;
    }

    public Instant getDeliveryStartDate() {
        return DeliveryStartDate;
    }

    public void setDeliveryStartDate(Instant deliveryStartDate) {
        DeliveryStartDate = deliveryStartDate;
    }

    public Instant getDeliveryEndDate() {
        return DeliveryEndDate;
    }

    public void setDeliveryEndDate(Instant deliveryEndDate) {
        DeliveryEndDate = deliveryEndDate;
    }

    public Set<String> getOrderIdentifierTags() {
        return OrderIdentifierTags;
    }

    public void setOrderIdentifierTags(Set<String> orderIdentifierTags) {
        OrderIdentifierTags = orderIdentifierTags;
    }

    public Boolean getForceReSaveFulfilledOrder() {
        return ForceReSaveFulfilledOrder;
    }

    public void setForceReSaveFulfilledOrder(Boolean forceReSaveFulfilledOrder) {
        ForceReSaveFulfilledOrder = forceReSaveFulfilledOrder;
    }
}
