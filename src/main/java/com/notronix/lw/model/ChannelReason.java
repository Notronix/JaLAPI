package com.notronix.lw.model;

import java.util.List;

public class ChannelReason
{
    private String Tag;
    private String DisplayName;
    private ChannelReasonTypes Types;
    private List<ChannelSubReason> SubReasons;

    public String getTag() {
        return Tag;
    }

    public void setTag(String tag) {
        Tag = tag;
    }

    public String getDisplayName() {
        return DisplayName;
    }

    public void setDisplayName(String displayName) {
        DisplayName = displayName;
    }

    public ChannelReasonTypes getTypes() {
        return Types;
    }

    public void setTypes(ChannelReasonTypes types) {
        Types = types;
    }

    public List<ChannelSubReason> getSubReasons() {
        return SubReasons;
    }

    public void setSubReasons(List<ChannelSubReason> subReasons) {
        SubReasons = subReasons;
    }
}
