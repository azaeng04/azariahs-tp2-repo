/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package topic;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;
import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;

/**
 *
 * @author Azariah
 */
public class ProducerTopic {

    //URL of JMS server. The .DEFAULT_BROKER_URL will just mean that the jms server is on the localhost
    private static String url = ActiveMQConnection.DEFAULT_BROKER_URL;
    //Name of the queue we will be sending messages to.
    private static String subject = "TESTTOPIC";

    public static void main(String[] args) throws JMSException {

        //Getting JMS connection from the server and starting it.
        ConnectionFactory connectionFactory = new ActiveMQConnectionFactory(url);
        Connection connection = connectionFactory.createConnection();
        connection.start();

        //Jms messages are sent and recieved using a Session.
        //We will create here a non-transactional object
        //If you want to use transcations you should set the first parameterto true
        Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);

        //Destination here represents outr queue TESTQUEUE on the JMS server.
        //You dont have to do anything special on the server to create it.
        //It would be created  automatically.
        Destination destination = session.createTopic(subject);

        //MessageProducer is used for sending messages
        //As opposed to message consumer which is used for recieving messages
        MessageProducer producer = session.createProducer(destination);

        //We will send a small text message
        TextMessage message = session.createTextMessage("Azariah just sent a message");

        //Here we are sending the message!
        producer.send(message);
        System.out.println("Message sent: " + message.getText() + "");
        connection.close();
    }
}
