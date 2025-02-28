package test;

import base.BaseTest;
import com.companyName.utility.ExcelUtils;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

public class ReadExcelFileTest extends BaseTest {
    @Test
    public void excelReader() throws IOException {
       List<List<String>> excelData= ExcelUtils.readExcelFile("user-data.xlsx");
        System.out.println(excelData.get(0).get(0));
        System.out.println(excelData.get(0));
        System.out.println(excelData);

    }
}
