/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.question03;

import com.question03.design.principles.plk.correct.impl.Customer;
import com.question03.design.principles.plk.correct.impl.Order;
import com.question03.design.principles.plk.correct.impl.OrderLine;
import java.util.List;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Azariahs
 */
public class PrincipleOfLeastKnowledgeCorrectTest {

    public PrincipleOfLeastKnowledgeCorrectTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    @Test
    public void testPLKCorrect() {
        Customer customer = new Customer();
        List<Order> orderList = customer.getOrders();
        for (Order order : orderList) {
            List<OrderLine> orderLine = order.getOrderLine();
            for (OrderLine orderLine1 : orderLine) {
                //do stuff
            }
        }
    }
}