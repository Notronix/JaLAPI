package com.notronix.lw.api.model;

import java.time.Instant;

public class ScheduledDelivery
{
    private Instant From;
    private Instant To;

    public Instant getFrom() {
        return From;
    }

    public void setFrom(Instant from) {
        From = from;
    }

    public Instant getTo() {
        return To;
    }

    public void setTo(Instant to) {
        To = to;
    }
}
