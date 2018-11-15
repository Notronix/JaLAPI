package com.notronix.lw.model;

public enum CannotRefundReasonType
{
    None,
    NotImplemented,
    DisabledInConfig,
    MissingOrderInLinnworks,
    OpenOrderInLinnworks,
    OrderIsFullyRefundedInLinnworks,
    NoNewRefundsSpecified,
    NoUpdatedRefundsSpecified,
    MultipleReferences,
    SubStatusTagNotInTheSystem,
    SubStatusTagIsNotActionable,
    MultipleSubStatusTags,
    RefundNotInSystem,
    Other
}
