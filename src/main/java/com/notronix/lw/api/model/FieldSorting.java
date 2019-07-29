package com.notronix.lw.api.model;

public class FieldSorting
{
    private FieldCode FieldCode;
    private ListSortDirection Direction;
    private Integer Order;

    public com.notronix.lw.api.model.FieldCode getFieldCode() {
        return FieldCode;
    }

    public void setFieldCode(com.notronix.lw.api.model.FieldCode fieldCode) {
        FieldCode = fieldCode;
    }

    public ListSortDirection getDirection() {
        return Direction;
    }

    public void setDirection(ListSortDirection direction) {
        Direction = direction;
    }

    public Integer getOrder() {
        return Order;
    }

    public void setOrder(Integer order) {
        Order = order;
    }
}
