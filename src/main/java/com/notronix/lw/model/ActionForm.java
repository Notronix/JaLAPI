package com.notronix.lw.model;

import java.util.List;

public class ActionForm
{
    private String Caption;
    private List<ActionFormControl> Controls;

    public String getCaption() {
        return Caption;
    }

    public void setCaption(String caption) {
        Caption = caption;
    }

    public List<ActionFormControl> getControls() {
        return Controls;
    }

    public void setControls(List<ActionFormControl> controls) {
        Controls = controls;
    }
}
