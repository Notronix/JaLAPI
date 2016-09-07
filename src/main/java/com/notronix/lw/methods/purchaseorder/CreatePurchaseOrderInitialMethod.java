package com.notronix.lw.methods.purchaseorder;

import com.notronix.lw.LinnworksAPIException;
import com.notronix.lw.model.CreatePurchaseOrderParameters;

public class CreatePurchaseOrderInitialMethod extends PurchaseOrderMethod<String>
{
    private CreatePurchaseOrderParameters parameters;

    @Override
    public String getName()
    {
        return "Create_PurchaseOrder_Initial";
    }

    @Override
    public String getPayload()
    {
        if (parameters == null)
        {
            parameters = new CreatePurchaseOrderParameters();
        }

        String fkSupplierId = parameters.getFkSupplierId() == null ? "" : parameters.getFkSupplierId();
        String fkLocationId = parameters.getFkLocationId() == null ? "" : parameters.getFkLocationId();
        String externalInvoiceNumber = parameters.getExternalInvoiceNumber() == null ? "" : parameters.getExternalInvoiceNumber();
        String currency = parameters.getCurrency() == null ? "" : parameters.getCurrency();
        String supplierReferenceNumber = parameters.getSupplierReferenceNumber() == null ? "" : parameters.getSupplierReferenceNumber();
        String dateOfPurchase = parameters.getDateOfPurchase() == null ? "" : parameters.getDateOfPurchase().toString();
        String quotedDeliveryDate = parameters.getQuotedDeliveryDate() == null ? "" : parameters.getQuotedDeliveryDate().toString();
        String postagePaid = parameters.getPostagePaid() == null ? "0" : parameters.getPostagePaid().toString();
        String shippingTaxRate = parameters.getShippingTaxRate() == null ? "0" : parameters.getShippingTaxRate().toString();
        String conversionRate = parameters.getConversionRate() == null ? "0" : parameters.getConversionRate().toString();

        return "createParameters={\"fkSupplierId\": \"" + fkSupplierId + "\"," +
                "\"fkLocationId\": \"" + fkLocationId + "\"," +
                "\"ExternalInvoiceNumber\": \"" + externalInvoiceNumber + "\"," +
                "\"Currency\": \"" + currency + "\"," +
                "\"SupplierReferenceNumber\": \"" + supplierReferenceNumber + "\"," +
                "\"DateOfPurchase\": \"" + dateOfPurchase + "\"," +
                "\"QuotedDeliveryDate\": \"" + quotedDeliveryDate + "\"," +
                "\"PostagePaid\": " + postagePaid + "," +
                "\"ShippingTaxRate\": " + shippingTaxRate + "," +
                "\"ConversionRate\": " + conversionRate + "}";
    }

    @Override
    public String getResponse() throws LinnworksAPIException
    {
        String purchaseOrderId = getJsonResult();

        if (purchaseOrderId != null)
        {
            purchaseOrderId = purchaseOrderId.replaceAll("\"", "");
        }

        return purchaseOrderId;
    }

    public CreatePurchaseOrderParameters getParameters()
    {
        return parameters;
    }

    public void setParameters(CreatePurchaseOrderParameters parameters)
    {
        this.parameters = parameters;
    }

    public CreatePurchaseOrderInitialMethod withParameters(CreatePurchaseOrderParameters parameters)
    {
        this.parameters = parameters;
        return this;
    }
}
