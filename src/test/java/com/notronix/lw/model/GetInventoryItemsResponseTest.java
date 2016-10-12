package com.notronix.lw.model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GetInventoryItemsResponseTest
{
    @Test
    public void testGetTotalPages()
    {
        GetInventoryItemsResponse response = new GetInventoryItemsResponse();
        response.setTotalItems(0);
        assertEquals("Total pages is wrong.", 0, response.getTotalPages());

        response.setTotalItems(1);
        response.setBatchSize(0);
        assertEquals("Total pages is wrong.", 0, response.getTotalPages());

        response.setBatchSize(1);
        assertEquals("Total pages is wrong.", 1, response.getTotalPages());

        response.setBatchSize(400);
        assertEquals("Total pages is wrong.", 1, response.getTotalPages());

        response.setTotalItems(2);
        assertEquals("Total pages is wrong.", 1, response.getTotalPages());

        response.setBatchSize(2);
        assertEquals("Total pages is wrong.", 1, response.getTotalPages());

        response.setTotalItems(3);
        response.setBatchSize(2);
        assertEquals("Total pages is wrong.", 2, response.getTotalPages());
    }
}
