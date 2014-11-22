/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package report.gen;
import collegemanagementsystem.frmAdmin;
import com.college.util.JDBCUtil;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
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
public class pdf_hostellers {
    Connection con;
    ResultSet rs,rs1;
    PreparedStatement ps,ps1;
    Statement s1;
    String q;
    
    public int createPDF(){
        try {
            con = JDBCUtil.getConnection();
            OutputStream file = new FileOutputStream(new File("C:\\Users\\saurabh\\Desktop\\hostellers.pdf"));
            Document doc = new Document();
            PdfWriter.getInstance(doc,file);
            doc.open();
            doc.addAuthor("Admin");
            doc.addCreationDate();
            doc.addCreator("Admin");
            
            try
            {
                System.out.println("Helloolll");
            ps = con.prepareStatement("select * from stud_hos");
            rs = ps.executeQuery();
            doc.add(new Paragraph("LIST OF Hostellers"));
            doc.add(new Paragraph("\n"));
            while (rs.next()) {
                String enn = rs.getString(1);
                String host = rs.getString(2);
                String fee = rs.getString(3);
                System.out.println(enn + host + fee);
                
                try
                {ps1 = con.prepareStatement("select name from studinfo where enroll='"+enn+"'");
                rs1 = ps1.executeQuery();
                }
                catch(Exception e)
                {}
                System.out.println(enn + host + fee);
                String nm = null;
                while(rs1.next())
                {
                   nm = rs1.getString(1);
                }
                doc.add(new Paragraph(nm+"   "+enn+"     "+host+"    "+fee));
                
            }
            }
            catch(DocumentException e){} catch (SQLException e) {
            }
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
    
   
    
    
 
