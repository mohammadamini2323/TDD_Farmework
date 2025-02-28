package base;

import com.companyName.config.PropertiesLoader;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.Configurator;
import org.junit.jupiter.api.BeforeEach;

public class BaseTest {
    public static final Logger logger = LogManager.getLogger(BaseTest.class);
    protected String baseUrl;
    protected boolean debugLogging;
    @BeforeEach
    public void setup(){
        baseUrl= PropertiesLoader.get("base.url");
        debugLogging= Boolean.parseBoolean(PropertiesLoader.get("enable.debug.logging"));
        if (debugLogging){
            Configurator.setRootLevel(Level.DEBUG);
            logger.debug("Enabled debug mode.");}
        else {Configurator.setRootLevel(Level.INFO);}
        logger.info("Base URL: {} ",baseUrl);
    }
    public void log(String message){
        if (debugLogging){
            logger.debug(message);
        }else {logger.info(message);}
    }
}
