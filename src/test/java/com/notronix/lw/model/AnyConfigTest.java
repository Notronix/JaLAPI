package com.notronix.lw.model;


import org.junit.Test;

public class AnyConfigTest
{
    @Test
    public void testGettersAndSetters()
    {
        AnyConfig config = new AnyConfig();
        config.setHeaderOnly(true);
        config.setHidden(true);
        config.setPostalServiceMapping(new ConfigPostalServiceMapping());
    }
}
