import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {
    Customer customer;

    @Before
    public void before() {
        customer = new Customer("Darren", 120, 25.50);
    }

    @Test
