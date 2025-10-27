package test1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadXlData {

    public Object[][] readExcelData(String path) throws IOException {
        File file = new File(path);

        try (FileInputStream inputStream = new FileInputStream(file);
             Workbook book = new XSSFWorkbook(inputStream)) {

            Sheet sheet = book.getSheetAt(0);
            int rowCount = sheet.getPhysicalNumberOfRows();
            int colCount = sheet.getRow(0).getLastCellNum();

            Object[][] data = new Object[rowCount - 1][colCount];

            for (int i = 1; i < rowCount; i++) {
                Row row = sheet.getRow(i);
                if (row == null) continue;

                for (int j = 0; j < colCount; j++) {
                    Cell cell = row.getCell(j);
                    data[i - 1][j] = (cell != null) ? cell.toString() : "";
                    System.out.println(data[i - 1][j]);
                }
            }

            return data;
        }
    }
}
