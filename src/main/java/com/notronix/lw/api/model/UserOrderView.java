package com.notronix.lw.api.model;

import java.time.Instant;

public class UserOrderView
{
    private Instant ModifiedDateTime;
    private Integer pkViewId;
    private String ViewName;
    private String OwnerName;
    private Boolean AllowModify;
    private String JSONDetail;

    public Integer getPkViewId()
    {
        return pkViewId;
    }

    public void setPkViewId(Integer pkViewId)
    {
        this.pkViewId = pkViewId;
    }

    public String getViewName()
    {
        return ViewName;
    }

    public void setViewName(String viewName)
    {
        ViewName = viewName;
    }

    public String getOwnerName()
    {
        return OwnerName;
    }

    public void setOwnerName(String ownerName)
    {
        OwnerName = ownerName;
    }

    public Boolean getAllowModify()
    {
        return AllowModify;
    }

    public void setAllowModify(Boolean allowModify)
    {
        AllowModify = allowModify;
    }

    public String getJSONDetail()
    {
        return JSONDetail;
    }

    public void setJSONDetail(String JSONDetail)
    {
        this.JSONDetail = JSONDetail;
    }

    public Instant getModifiedDateTime()
    {
        return ModifiedDateTime;
    }

    public void setModifiedDateTime(Instant modifiedDateTime)
    {
        ModifiedDateTime = modifiedDateTime;
    }
}
