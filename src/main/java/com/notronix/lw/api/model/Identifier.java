package com.notronix.lw.api.model;

import java.util.UUID;

public class Identifier
{
    private Integer IdentifierId;
    private Boolean IsCustom;
    private UUID ImageId;
    private String ImageUrl;
    private String Tag;
    private String Name;

    public Integer getIdentifierId() {
        return IdentifierId;
    }

    public void setIdentifierId(Integer identifierId) {
        IdentifierId = identifierId;
    }

    public Boolean getCustom() {
        return IsCustom;
    }

    public void setCustom(Boolean custom) {
        IsCustom = custom;
    }

    public UUID getImageId() {
        return ImageId;
    }

    public void setImageId(UUID imageId) {
        ImageId = imageId;
    }

    public String getImageUrl() {
        return ImageUrl;
    }

    public void setImageUrl(String imageUrl) {
        ImageUrl = imageUrl;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getTag() {
        return Tag;
    }

    public void setTag(String tag) {
        Tag = tag;
    }
}
