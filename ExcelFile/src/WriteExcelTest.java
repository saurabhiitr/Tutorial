import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFColor;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFRichTextString;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcelTest {

    public static void writeXLSXFile(int row, int col) throws IOException {
        try {
            FileInputStream file = new FileInputStream("./resources/WriteSheet.xlsx");

            XSSFWorkbook workbook = new XSSFWorkbook(file);
            XSSFSheet sheet = workbook.getSheetAt(0);
            Cell cell = null;
            
            XSSFRichTextString rt = new XSSFRichTextString("The quick brown fox");
            XSSFFont font1 = workbook.createFont();
            font1.setBold(true);
            font1.setColor(new XSSFColor(new java.awt.Color(255, 0, 0)));
            rt.applyFont(0, 10, font1);

            XSSFFont font2 = workbook.createFont();
            font2.setItalic(true);
            font2.setUnderline(XSSFFont.U_DOUBLE);
            font2.setColor(new XSSFColor(new java.awt.Color(0, 255, 0)));
            rt.applyFont(10, 19, font2);

            XSSFFont font3 = workbook.createFont();
            font3.setColor(new XSSFColor(new java.awt.Color(0, 0, 255)));
            rt.append(" Jumped over the lazy dog", font3);


          //Retrieve the row and check for null
            XSSFRow sheetrow = sheet.getRow(row);
            if(sheetrow == null){
                sheetrow = sheet.createRow(row);
            }
            //Update the value of cell
            cell = sheetrow.getCell(col);
            if(cell == null){
                cell = sheetrow.createCell(col);
            }
            cell.setCellValue(rt);

            file.close();

            FileOutputStream outFile =new FileOutputStream(new File("./resources/WriteSheet.xlsx"));
            workbook.write(outFile);
            outFile.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        writeXLSXFile(0, 0);
    }
}