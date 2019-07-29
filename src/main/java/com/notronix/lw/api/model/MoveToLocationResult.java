package com.notronix.lw.api.model;

import java.util.List;
import java.util.UUID;

public class MoveToLocationResult
{
    private List<String> Errors;
    private List<UUID> OrdersMoved;

    public List<String> getErrors() {
        return Errors;
    }

    public void setErrors(List<String> errors) {
        Errors = errors;
    }

    public List<UUID> getOrdersMoved() {
        return OrdersMoved;
    }

    public void setOrdersMoved(List<UUID> ordersMoved) {
        OrdersMoved = ordersMoved;
    }
}
