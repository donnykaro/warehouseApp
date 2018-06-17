/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warehouseapp;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import warehouseapp.gui.ManagerView;

/**
 *
 * @author proggy
 */
public class NewXls {
    
    NewXls(){
    }
    
    public static void createXls(File file){
        try(Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/warehouse_user",
                        "loginuser","loginuser")) {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM PRODUCT");

            int rowCount = 1;

            HSSFWorkbook workbook = new HSSFWorkbook();
            HSSFSheet sheet = workbook.createSheet("Products");
            HSSFRow mainRow = sheet.createRow(0);

            HSSFCell staticNameCell = mainRow.createCell(0);
            HSSFCell staticQuantityCell = mainRow.createCell(1);
            HSSFCell staticSupplierCell = mainRow.createCell(2);
            staticNameCell.setCellValue("Name");
            staticQuantityCell.setCellValue("Quantity");
            staticSupplierCell.setCellValue("Supplier");

            while(rs.next()){
                HSSFRow row = sheet.createRow(rowCount);
                HSSFCell nameCell = row.createCell(0);
                HSSFCell quantityCell = row.createCell(1);
                HSSFCell supplierCell = row.createCell(2);

                rowCount++;

                nameCell.setCellValue(rs.getString(2));
                quantityCell.setCellValue(rs.getString(3));
                supplierCell.setCellValue(rs.getString(4));

                workbook.write(file);
                workbook.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(ManagerView.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ManagerView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
