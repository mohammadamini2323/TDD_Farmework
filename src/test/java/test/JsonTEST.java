package test;

import base.BaseTest;
import com.companyName.utility.JsonUtils;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.URISyntaxException;

public class JsonTEST extends BaseTest {

    public static void main(String[] args) throws IOException, URISyntaxException {
        System.out.println(JsonUtils.readJsonFile("user.json"));

    }
}
