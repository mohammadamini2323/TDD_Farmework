package test;

import com.companyName.utility.StringUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringUtilsTest {
    @Test
    public void upperCase(){
        Assertions.assertEquals("HELLO",StringUtils.upperCase("hello"),"no");

    }
    @Test
    public void lowerCase(){
       String ActualText=StringUtils.lowerCase("HELLO");
       String expectedText="hello";
        Assertions.assertEquals(expectedText,ActualText,"no");

    }

}
