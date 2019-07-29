package com.notronix.lw.api.model;

public class GetSelectionList
{
    private MethodInfo Method;
    private Object Target;

    public MethodInfo getMethod() {
        return Method;
    }

    public void setMethod(MethodInfo method) {
        Method = method;
    }

    public Object getTarget() {
        return Target;
    }

    public void setTarget(Object target) {
        Target = target;
    }
}
