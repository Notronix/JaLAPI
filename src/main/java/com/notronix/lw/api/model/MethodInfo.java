package com.notronix.lw.api.model;

public class MethodInfo
{
    private String Name;
    private String AssemblyName;
    private String ClassName;
    private String Signature;
    private String Signature2;
    private Integer MemberType;
    private Object GenericArguments;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAssemblyName() {
        return AssemblyName;
    }

    public void setAssemblyName(String assemblyName) {
        AssemblyName = assemblyName;
    }

    public String getClassName() {
        return ClassName;
    }

    public void setClassName(String className) {
        ClassName = className;
    }

    public String getSignature() {
        return Signature;
    }

    public void setSignature(String signature) {
        Signature = signature;
    }

    public String getSignature2() {
        return Signature2;
    }

    public void setSignature2(String signature2) {
        Signature2 = signature2;
    }

    public Integer getMemberType() {
        return MemberType;
    }

    public void setMemberType(Integer memberType) {
        MemberType = memberType;
    }

    public Object getGenericArguments() {
        return GenericArguments;
    }

    public void setGenericArguments(Object genericArguments) {
        GenericArguments = genericArguments;
    }
}
