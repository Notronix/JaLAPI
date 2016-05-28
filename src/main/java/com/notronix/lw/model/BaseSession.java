package com.notronix.lw.model;

import java.util.Map;

public class BaseSession
{
    private String UserName;
    private String Md5Hash;
    private String DatabaseName;
    private String DatabaseServer;
    private String ConnectionString;
    private String ProductName;
    private String ExpirationDate;
    private String SupportLevel;
    private Boolean SuperAdmin;
    private String Server;
    private String Email;
    private String Id;
    private String Token;
    private String GroupName;
    private String Locality;
    private Map<String, Object> Properties;

    public String getUserName()
    {
        return UserName;
    }

    public void setUserName(String userName)
    {
        UserName = userName;
    }

    public String getMd5Hash()
    {
        return Md5Hash;
    }

    public void setMd5Hash(String md5Hash)
    {
        Md5Hash = md5Hash;
    }

    public String getDatabaseName()
    {
        return DatabaseName;
    }

    public void setDatabaseName(String databaseName)
    {
        DatabaseName = databaseName;
    }

    public String getDatabaseServer()
    {
        return DatabaseServer;
    }

    public void setDatabaseServer(String databaseServer)
    {
        DatabaseServer = databaseServer;
    }

    public String getConnectionString()
    {
        return ConnectionString;
    }

    public void setConnectionString(String connectionString)
    {
        ConnectionString = connectionString;
    }

    public String getProductName()
    {
        return ProductName;
    }

    public void setProductName(String productName)
    {
        ProductName = productName;
    }

    public String getExpirationDate()
    {
        return ExpirationDate;
    }

    public void setExpirationDate(String expirationDate)
    {
        ExpirationDate = expirationDate;
    }

    public String getSupportLevel()
    {
        return SupportLevel;
    }

    public void setSupportLevel(String supportLevel)
    {
        SupportLevel = supportLevel;
    }

    public Boolean getSuperAdmin()
    {
        return SuperAdmin;
    }

    public void setSuperAdmin(Boolean superAdmin)
    {
        SuperAdmin = superAdmin;
    }

    public String getServer()
    {
        return Server;
    }

    public void setServer(String server)
    {
        Server = server;
    }

    public String getEmail()
    {
        return Email;
    }

    public void setEmail(String email)
    {
        Email = email;
    }

    public String getId()
    {
        return Id;
    }

    public void setId(String id)
    {
        Id = id;
    }

    public String getToken()
    {
        return Token;
    }

    public void setToken(String token)
    {
        Token = token;
    }

    public String getGroupName()
    {
        return GroupName;
    }

    public void setGroupName(String groupName)
    {
        GroupName = groupName;
    }

    public String getLocality()
    {
        return Locality;
    }

    public void setLocality(String locality)
    {
        Locality = locality;
    }

    public Map<String, Object> getProperties()
    {
        return Properties;
    }

    public void setProperties(Map<String, Object> properties)
    {
        Properties = properties;
    }
}
