package com.notronix.lw.client;

import com.notronix.lw.LinnworksAPIException;
import com.notronix.lw.methods.Method;

@FunctionalInterface
public interface LinnworksAPIClient
{
    <T> T executeMethod(Method<T> method) throws LinnworksAPIException;
}
