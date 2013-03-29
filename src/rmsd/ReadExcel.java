//Copyright (c) 2012, Provincial Department of Health Services, North western province, Sri Lanka
//All rights reserved.

package rmsd;


import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.CellType;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ReadExcel {

    private String inputFile;

    public void setInputFile(String inputFile) {
        this.inputFile = inputFile;
    }

    public void read() throws IOException {
        File inputWorkbook = new File(inputFile);
        Workbook w;
        try {
            w = Workbook.getWorkbook(inputWorkbook);
            // Get the first sheet
            Sheet sheet = w.getSheet(0);
            // Loop over first 10 column and lines

         //   for (int j = 0; j < sheet.getColumns(); j++) {
                for (int i = 0; i < sheet.getRows(); i++) {
                    Cell cell = sheet.getCell(0, i);
                    CellType type = cell.getType();
               //   if (cell.getType() == CellType.LABEL) {
                        String inscode= cell.getContents();

                         Cell cell1 = sheet.getCell(1, i);
                        String icode= cell1.getContents();

                        Cell cell4 = sheet.getCell(4, i);
                        String esqnty= cell4.getContents();
                  //  }else if (cell.getType() == CellType.NUMBER) {
                   //     System.out.println("I got a number " + cell.getContents());
                   // }
               // }
                        System.out.println(inscode + " " + icode+ " " + esqnty );
            }
        } catch (BiffException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        ReadExcel test = new ReadExcel();
        test.setInputFile("F:/RMSD/estimate.xls");
        test.read();
    }
}
