package com.notronix.lw.api.model;

import java.time.Instant;

public class DateFieldFilter
{
    private Instant DateFrom;
    private Instant DateTo;
    private DateTimeFieldFilterType Type;
    private Integer Value;
    private FieldCode FieldCode;

    public Instant getDateFrom() {
        return DateFrom;
    }

    public void setDateFrom(Instant dateFrom) {
        DateFrom = dateFrom;
    }

    public Instant getDateTo() {
        return DateTo;
    }

    public void setDateTo(Instant dateTo) {
        DateTo = dateTo;
    }

    public DateTimeFieldFilterType getType() {
        return Type;
    }

    public void setType(DateTimeFieldFilterType type) {
        Type = type;
    }

    public Integer getValue() {
        return Value;
    }

    public void setValue(Integer value) {
        Value = value;
    }

    public com.notronix.lw.api.model.FieldCode getFieldCode() {
        return FieldCode;
    }

    public void setFieldCode(com.notronix.lw.api.model.FieldCode fieldCode) {
        FieldCode = fieldCode;
    }
}
