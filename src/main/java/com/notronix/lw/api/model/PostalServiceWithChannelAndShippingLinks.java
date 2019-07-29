package com.notronix.lw.api.model;

import java.util.List;
import java.util.UUID;

public class PostalServiceWithChannelAndShippingLinks
{
    private UUID id;
    private Boolean hasMappedShippingService;
    private List<PostalServiceChannel> Channels;
    private List<ShippingService> ShippingServices;
    private String PostalServiceName;
    private String PostalServiceTag;
    private String ServiceCountry;
    private String PostalServiceCode;
    private String Vendor;
    private String PrintModule;
    private String PrintModuleTitle;
    private UUID pkPostalServiceId;
    private Boolean TrackingNumberRequired;
    private Boolean WeightRequired;
    private Boolean IgnorePackagingGroup;
    private Integer fkShippingAPIConfigId;
    private UUID IntegratedServiceId;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Boolean getHasMappedShippingService() {
        return hasMappedShippingService;
    }

    public void setHasMappedShippingService(Boolean hasMappedShippingService) {
        this.hasMappedShippingService = hasMappedShippingService;
    }

    public List<PostalServiceChannel> getChannels() {
        return Channels;
    }

    public void setChannels(List<PostalServiceChannel> channels) {
        Channels = channels;
    }

    public List<ShippingService> getShippingServices() {
        return ShippingServices;
    }

    public void setShippingServices(List<ShippingService> shippingServices) {
        ShippingServices = shippingServices;
    }

    public String getPostalServiceName() {
        return PostalServiceName;
    }

    public void setPostalServiceName(String postalServiceName) {
        PostalServiceName = postalServiceName;
    }

    public String getPostalServiceTag() {
        return PostalServiceTag;
    }

    public void setPostalServiceTag(String postalServiceTag) {
        PostalServiceTag = postalServiceTag;
    }

    public String getServiceCountry() {
        return ServiceCountry;
    }

    public void setServiceCountry(String serviceCountry) {
        ServiceCountry = serviceCountry;
    }

    public String getPostalServiceCode() {
        return PostalServiceCode;
    }

    public void setPostalServiceCode(String postalServiceCode) {
        PostalServiceCode = postalServiceCode;
    }

    public String getVendor() {
        return Vendor;
    }

    public void setVendor(String vendor) {
        Vendor = vendor;
    }

    public String getPrintModule() {
        return PrintModule;
    }

    public void setPrintModule(String printModule) {
        PrintModule = printModule;
    }

    public String getPrintModuleTitle() {
        return PrintModuleTitle;
    }

    public void setPrintModuleTitle(String printModuleTitle) {
        PrintModuleTitle = printModuleTitle;
    }

    public UUID getPkPostalServiceId() {
        return pkPostalServiceId;
    }

    public void setPkPostalServiceId(UUID pkPostalServiceId) {
        this.pkPostalServiceId = pkPostalServiceId;
    }

    public Boolean getTrackingNumberRequired() {
        return TrackingNumberRequired;
    }

    public void setTrackingNumberRequired(Boolean trackingNumberRequired) {
        TrackingNumberRequired = trackingNumberRequired;
    }

    public Boolean getWeightRequired() {
        return WeightRequired;
    }

    public void setWeightRequired(Boolean weightRequired) {
        WeightRequired = weightRequired;
    }

    public Boolean getIgnorePackagingGroup() {
        return IgnorePackagingGroup;
    }

    public void setIgnorePackagingGroup(Boolean ignorePackagingGroup) {
        IgnorePackagingGroup = ignorePackagingGroup;
    }

    public Integer getFkShippingAPIConfigId() {
        return fkShippingAPIConfigId;
    }

    public void setFkShippingAPIConfigId(Integer fkShippingAPIConfigId) {
        this.fkShippingAPIConfigId = fkShippingAPIConfigId;
    }

    public UUID getIntegratedServiceId() {
        return IntegratedServiceId;
    }

    public void setIntegratedServiceId(UUID integratedServiceId) {
        IntegratedServiceId = integratedServiceId;
    }
}
