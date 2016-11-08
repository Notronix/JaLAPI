package com.notronix.lw.demo;

import com.notronix.lw.LinnworksAPI;
import com.notronix.lw.LinnworksAPIException;
import com.notronix.lw.LinnworksAPIImpl;
import com.notronix.lw.client.LinnworksAPIClient;
import com.notronix.lw.client.LinnworksAPIClientImpl;
import com.notronix.lw.model.SessionToken;

public class APITester
{
    private static void makeAPICalls(LinnworksAPI api, LinnworksAPIClient client, SessionToken token) throws LinnworksAPIException
    {
        //MAKE API METHOD CALLS HERE
    }

    public static void main(String[] args)
    {
        try
        {
            if (args == null || args.length < 3)
            {
                System.out.println("Invalid inputs: appId, appSecret, authToken required.");
                System.exit(1);
            }

            LinnworksAPI api = new LinnworksAPIImpl();
            LinnworksAPIClient client = new LinnworksAPIClientImpl();
            SessionToken token = APITester.authenticateApplication(api, client, args[0], args[1], args[2]);
            APITester.makeAPICalls(api, client, token);
        }
        catch (LinnworksAPIException ex)
        {
            ex.printStackTrace();
        }
    }

    private static SessionToken authenticateApplication(LinnworksAPI api, LinnworksAPIClient client, String appId, String appSecret, String authToken)
            throws LinnworksAPIException
    {
        SessionToken sessionToken = api.authenticateApplication(client, appId, appSecret, authToken);
        if (sessionToken == null)
        {
            throw new LinnworksAPIException("Unable to authenticate.");
        }

        return sessionToken;
    }
}
