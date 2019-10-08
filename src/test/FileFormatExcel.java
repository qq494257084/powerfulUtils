package test;

import com.lyl.entity.FileFormatEntity;
import com.lyl.utils.format.FileFormat;
import com.lyl.utils.text.StringUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;

/**
 * @author liyaling
 * @email ts_liyaling@qq.com
 * @date 2019/10/8 9:39
 */

public class FileFormatExcel {
    public static void main(String[] args) throws Exception {
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(new FileInputStream("C:\\Users\\Leeyarlling\\Desktop\\新建 Microsoft Excel 工作表.xlsx"));
        XSSFSheet sheetAt = xssfWorkbook.getSheetAt(0);
        int i = 0;
        for (Row cells : sheetAt) {
            FileFormatEntity fileFormatEntity = new FileFormatEntity();
            {
                Cell cell = cells.getCell(0);
                cell.setCellType(Cell.CELL_TYPE_STRING);
                fileFormatEntity.setFormat(cell.getStringCellValue().replaceAll("[,，;；\\s]+", ","));
                if(StringUtils.isEmpty(fileFormatEntity.getFormat()))
                    continue;
            }
            {
                Cell cell = cells.getCell(1);
                cell.setCellType(Cell.CELL_TYPE_STRING);
                fileFormatEntity.setHex(cell.getStringCellValue().replaceAll("\\s+", ""));
                if(StringUtils.isEmpty(fileFormatEntity.getHex()))
                    continue;
            }
            {
                Cell cell = cells.getCell(2);
                cell.setCellType(Cell.CELL_TYPE_STRING);
                fileFormatEntity.setDetail(cell.getStringCellValue().trim());
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("FileFormatEntity fileFormatEntity" + ++i + " = new FileFormatEntity();\n");
            stringBuilder.append("fileFormatEntity" + i + ".setFormat(\"" + fileFormatEntity.getFormat() + "\");\n");
            stringBuilder.append("fileFormatEntity" + i + ".setHex(\"" + fileFormatEntity.getHex() + "\");\n");
            if (fileFormatEntity.getDetail() != null && fileFormatEntity.getDetail().length() != 0)
                stringBuilder.append("fileFormatEntity" + i + ".setDetail(\"" + fileFormatEntity.getDetail() + "\");\n");
            stringBuilder.append("entityHandler(fileFormatEntity" + i + ");");
            System.out.println(stringBuilder.toString());
        }
    }
}
