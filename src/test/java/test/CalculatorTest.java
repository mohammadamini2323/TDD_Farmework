package test;

import com.companyName.core.Calculator;
import org.apache.logging.log4j.core.util.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    public void multiply(){
        Calculator calculator=new Calculator();
      Assertions.assertEquals(20,calculator.multiply(4,5),"no");
    }
    @Test
    public void multiply3(){
        var calculator= new Calculator();
        Assertions.assertEquals(8,calculator.multiply(2,2,2),"no");
    }
    @Test
    public void upperCase(){
        String TEXT="hello";
        Assertions.assertEquals("HELLO",TEXT.toUpperCase(),"NO");
    }
    @Test
    public void lowerCase(){
        String TEXT="HELLO";
        Assertions.assertEquals("hello",TEXT.toLowerCase(),"NO");
    }
}
