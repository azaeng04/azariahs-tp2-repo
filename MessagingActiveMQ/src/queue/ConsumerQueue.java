/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

import javax.jms.*;
import javax.jms.ConnectionFactory;
import javax.jms.JMSException;
import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;

/**
 *
 * @author Azariah
 */
public class ConsumerQueue {

    //URL of JMS server
    private static String url = ActiveMQConnection.DEFAULT_BROKER_URL;
    //Name of the queue we will recieve messages from
    private static String subject = "TESTQUEUE";

    public static void main(String[] args) throws JMSException {

        //Getting JMS connection from the server
        ConnectionFactory connectionFactory = new ActiveMQConnectionFactory(url);
        Connection connection = connectionFactory.createConnection();
        connection.start();

        //Creating session for sending messges
        Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);

        //Getting the queue 'TESTQUEUE'
        Destination destination = session.createQueue(subject);

        //MessageConsumer is used for recieving messages
        MessageConsumer consumer = session.createConsumer(destination);

        //Here we recieve the messge
        //By default this call is blocking,which means it will wait on a message to arrive on the queue
        Message message = consumer.receive();

        //There are many types of Messages and Text message is just one of them
        //Producer sent us a text message so we must cast it to get access to its getText().
        if (message instanceof TextMessage) {
            TextMessage textMessage = (TextMessage) message;
            System.out.println("Recieved message: " + " " + textMessage.getText());
        }
        connection.close();
    }
}
