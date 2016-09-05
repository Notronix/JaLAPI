package com.notronix.lw.methods.returnsrefunds;

import com.google.gson.Gson;
import com.notronix.lw.LinnworksAPIException;
import com.notronix.lw.model.SearchField;

import java.util.Arrays;
import java.util.List;

public class GetSearchTypesMethod extends ReturnsRefundsMethod<List<SearchField>>
{
    @Override
    public String getName()
    {
        return "GetSearchTypes";
    }

    @Override
    public String getPayload()
    {
        return "historyType=0";
    }

    @Override
    public List<SearchField> getResponse() throws LinnworksAPIException
    {
        return Arrays.asList(new Gson().fromJson(getJsonResult(), SearchField[].class));
    }
}
