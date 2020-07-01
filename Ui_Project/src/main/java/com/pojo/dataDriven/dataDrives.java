package com.pojo.dataDriven;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;


public class dataDrives {

    @Test
    public void baseDetail() throws IOException {

        Properties pFile = new Properties();
        FileInputStream file = new FileInputStream("src/main/resources/data.properties");
        pFile.load(file);
        String SheetPath = pFile.getProperty("SheetPath");
        XSSFWorkbook xls = new XSSFWorkbook(String.valueOf(SheetPath));
        int sheetCount = xls.getNumberOfSheets();


            XSSFSheet sheetname = xls.getSheetAt(0);
        System.out.println(sheetname);

    }
}
