package com.companyName.utility;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ExcelUtils {
    public static List<List<String>> readExcelFile(String fileName)throws IOException{
        List<List<String>> ExcelData=new ArrayList<>();
        FileInputStream fis=new FileInputStream(new File(Objects.requireNonNull(ExcelUtils.class.getClassLoader().getResource(fileName)).getFile()));

       // FileInputStream FIBS =new FileInputStream(new File(Objects.requireNonNull(ExcelUtils.class.getClassLoader().getResource(fileName)).getFile()));

        String Path= Objects.requireNonNull(ExcelUtils.class.getClassLoader().getResource(fileName)).getPath();

        Workbook workbook=new XSSFWorkbook(fis);
        Sheet sheet=workbook.getSheetAt(0);

        for (Row row : sheet){
            List<String> rows=new ArrayList<>();
            for (Cell cell:row){
                rows.add(cell.toString());
            }
            ExcelData.add(rows);


        }
        workbook.close();
        fis.close();

        return ExcelData;
    }

}
