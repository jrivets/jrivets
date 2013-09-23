package org.jrivets.cluster.connection.net;

import org.jrivets.event.Subscriber;

final class InboundEventHolder {

    private final Subscriber subscriber;
    
    private final Object event;
    
    InboundEventHolder(Subscriber subscriber, Object event) {
        this.subscriber = subscriber;
        this.event = event;
    }

    Subscriber getSubscriber() {
        return subscriber;
    }

    Object getEvent() {
        return event;
    }
    
    Object notifySubscriber() throws Exception {
        if (subscriber != null && event != null) {
            return subscriber.notifySubscriber(event);
        }
        return null;
    }
}
