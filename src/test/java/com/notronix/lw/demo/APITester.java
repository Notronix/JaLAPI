package com.notronix.lw.demo;

import com.notronix.lw.api.LinnworksAPIException;
import com.notronix.lw.api.model.BaseSession;
import com.notronix.lw.api.model.Credentials;
import com.notronix.lw.impl.LinnworksDataService;

@SuppressWarnings("unused")
public class APITester
{
    private static Object makeAPICalls(LinnworksDataService lds, BaseSession session) throws LinnworksAPIException {
        return lds.getServerUTCTime(session);
    }

    public static void main(String[] args) {
        LinnworksDataService lds = new LinnworksDataService();
        Credentials credentials = Credentials.withKeys(args[0], args[1], args[2]);
        BaseSession session;
        Object result;

        try {
            session = lds.authorizeByApplication(credentials);
            result = makeAPICalls(lds, session);

            System.exit(0);
        }
        catch (LinnworksAPIException ex) {
            ex.printStackTrace();
        }
    }
}
