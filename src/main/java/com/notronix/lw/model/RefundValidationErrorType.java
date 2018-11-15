package com.notronix.lw.model;

public enum RefundValidationErrorType
{
    None,
    MissingOrderOnChannel,
    WrongStateOnChannel,
    AdditionalRefundNotAllowed,
    ShippingRefundNotAllowed,
    ShippingRefundOnItsOwnNotAllowed,
    ItemRefundNotAllowed,
    ServiceRefundNotAllowed,
    NegativeOrZeroRefund,
    OverRefunding,
    NeedsConfirmation,
    AlreadyRefundedOnChannel,
    AlreadyRefundedInLinnworks,
    FreeTextReasonNotSupported,
    OnlyFreeTextReasonSupported,
    ReasonTagIncorrect,
    SubReasonTagIncorrect,
    ItemNotFoundInLinnworks,
    ItemNotFoundOnChannel,
    NegativeServiceItem,
    IncorrectOwnership,
    Other
}
