package com.notronix.lw.api.model;

import java.util.UUID;

public class Category
{
    private UUID CategoryId;
    private String CategoryName;

    public UUID getCategoryId() {
        return CategoryId;
    }

    public void setCategoryId(UUID categoryId) {
        CategoryId = categoryId;
    }

    public String getCategoryName()
    {
        return CategoryName;
    }

    public void setCategoryName(String categoryName)
    {
        CategoryName = categoryName;
    }
}
