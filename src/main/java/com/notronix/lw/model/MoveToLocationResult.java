package com.notronix.lw.model;

import java.util.List;

public class MoveToLocationResult
{
    private List<String> Errors;
    private List<String> OrdersMoved;

    public List<String> getErrors() {
        return Errors;
    }

    public void setErrors(List<String> errors) {
        Errors = errors;
    }

    public List<String> getOrdersMoved() {
        return OrdersMoved;
    }

    public void setOrdersMoved(List<String> ordersMoved) {
        OrdersMoved = ordersMoved;
    }
}
