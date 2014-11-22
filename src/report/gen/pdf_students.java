/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package report.gen;
import collegemanagementsystem.frmAdmin;
import com.college.util.JDBCUtil;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.sql.*;
import java.util.Date;


/**
 *
 * @author Saurabh
 */
public class pdf_students {
    Connection con;
    ResultSet rs;
    PreparedStatement ps;
    Statement s1;
    String q;
    
    public int createPDF(){
        try {
            con = JDBCUtil.getConnection();
            OutputStream file = new FileOutputStream(new File("C:\\Users\\saurabh\\Desktop\\students.pdf"));
            Document doc = new Document();
            PdfWriter.getInstance(doc,file);
            doc.open();
            doc.addAuthor("Admin");
            doc.addCreationDate();
            doc.addCreator("Admin");
            
            try
            {
             ps = con.prepareStatement("select * from studinfo");
            rs = ps.executeQuery();
            doc.add(new Paragraph("LIST OF STUDENTS"));
            doc.add(new Paragraph("\n"));
            while (rs.next()) {
                doc.add(new Paragraph(rs.getString(1) +"    "+rs.getString(2)));
            }
            }
            catch(Exception e){}
            finally{
            doc.close();
            file.close();
            }
        }catch(Exception e)
        {
            e.printStackTrace();
            return 0;
        }
        return 1;
        
    }
        
}
    
   
    
    
 
