/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package report.gen;
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
 * @author saurabh
 */

public class pdf_stud_reg {
    Connection con;
    ResultSet rs;
    PreparedStatement ps;
    Statement s1;
    String q;
    
    protected int createPDF(String en){
        try {
            con = JDBCUtil.getConnection();
            OutputStream file = new FileOutputStream(new File("C:\\Users\\saurabh\\Desktop\\report.pdf"));
            Document doc = new Document();
            PdfWriter.getInstance(doc,file);
            doc.open();
            doc.addAuthor("Admin");
            doc.addCreationDate();
            doc.addCreator("Admin");
            
            try
            {
             ps = con.prepareStatement("select * from studinfo where enroll='"+en+"'");
            rs = ps.executeQuery();
            while (rs.next()) {
            doc.add(new Paragraph("Name : "+rs.getString(1)));
            doc.add(new Paragraph("Enroll : "+rs.getString(2)));
            doc.add(new Paragraph("Contact No : "+rs.getString(3)));
            doc.add(new Paragraph("Address : "+rs.getString(4)));
            doc.add(new Paragraph("City : "+rs.getString(5)));
            doc.add(new Paragraph("District : "+rs.getString(6)));
            doc.add(new Paragraph("State : "+rs.getString(7)));
            doc.add(new Paragraph("Pincode : "+rs.getString(8)));
            doc.add(new Paragraph("Email Id : "+rs.getString(9)));
            doc.add(new Paragraph("Father\'s Name : "+rs.getString(10)));
            doc.add(new Paragraph("Mother\'s Name : "+rs.getString(11)));
            doc.add(new Paragraph("Parents Contact : "+rs.getString(12)));
            doc.add(new Paragraph("Parents Email Id : "+rs.getString(13)));
            }
            doc.add(new Paragraph("    "));
            doc.add(new Paragraph("    "));
            doc.add(new Paragraph("Other Details"));
            ps = con.prepareStatement("select * from studinfo1 where enroll='"+en+"'");
            rs = ps.executeQuery();
            while (rs.next()) {
            doc.add(new Paragraph("Gender : "+rs.getString(2)));
            doc.add(new Paragraph("12th Roll Number : "+rs.getString(3)));
            doc.add(new Paragraph("Scholarship Holder : "+rs.getString(5)));
            doc.add(new Paragraph("Hosteller : "+rs.getString(7)));
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

