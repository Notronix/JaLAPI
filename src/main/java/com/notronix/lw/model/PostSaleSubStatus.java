package com.notronix.lw.model;

import java.util.List;

public class PostSaleSubStatus
{
    private String StatusTag;
    private String StatusDescription;
    private Boolean Actionable;
    private String ActionDescription;
    private List<String> EditableFields;

    public String getStatusTag() {
        return StatusTag;
    }

    public void setStatusTag(String statusTag) {
        StatusTag = statusTag;
    }

    public String getStatusDescription() {
        return StatusDescription;
    }

    public void setStatusDescription(String statusDescription) {
        StatusDescription = statusDescription;
    }

    public Boolean getActionable() {
        return Actionable;
    }

    public void setActionable(Boolean actionable) {
        Actionable = actionable;
    }

    public String getActionDescription() {
        return ActionDescription;
    }

    public void setActionDescription(String actionDescription) {
        ActionDescription = actionDescription;
    }

    public List<String> getEditableFields() {
        return EditableFields;
    }

    public void setEditableFields(List<String> editableFields) {
        EditableFields = editableFields;
    }
}
