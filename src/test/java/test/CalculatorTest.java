package test;

import com.companyName.core.Calculator;
import org.apache.logging.log4j.core.util.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    public void multiply(){
        Calculator calculator=new Calculator();
      Assertions.assertEquals(20,calculator.multiply(0,5),"no");
    }
    @Test
    public void multiply3(){
        var calculator= new Calculator();
        Assertions.assertEquals(8,calculator.multiply(2,0,2),"no");
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
    @Test
    public void sum2(){
        Assertions.assertEquals(7,Calculator.sum(0,4),"fails");

    }
    @Test
    public  void sum3(){
        Assertions.assertEquals(24,Calculator.sum(0,8,8),"FALSE");

    }
    @Test
    public void division(){
        Assertions.assertEquals(4,Calculator.division(0,6),"fails");
    }
    @Test
    public void division2(){
        Assertions.assertEquals(4,Calculator.division(4,0),"fails");
    }
}
