package test;

import base.BaseTest;
import com.companyName.config.PropertiesLoader;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PropertiesLoaderTest extends BaseTest {
    @Test
    public void getPropertiesTest(){
        String expectedAppNane="TDD Framework";
        String actualAppName= PropertiesLoader.get("app.name");
        assertEquals(expectedAppNane,actualAppName,"app name should match ");
    }
    @Test
    public void defaultTesting(){
        String nonExistingKey=PropertiesLoader.get("NON EXISTING KEY","DEFAULT VALUE");
        assertEquals("DEFAULT VALUE",nonExistingKey,"should return DEFAULT value");


    }

}
