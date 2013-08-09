/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.net.URI;
import org.apache.activemq.broker.BrokerService;
import org.apache.activemq.broker.TransportConnector;

/**
 *
 * @author Azariah
 */
public class MessageMiddleware {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        BrokerService broker = new BrokerService();
        TransportConnector connector = new TransportConnector();
        connector.setUri(new URI("tcp://localhost:61616"));
        //broker
        broker.addConnector(connector);
        broker.start();
        System.out.println("Messaging middleware started");

    }
}
