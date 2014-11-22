/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package collegemanagementsystem;

/**
 *
 * @author saurabh
 */
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Date;

/**
 *
 * @author Anuj Patel
 */

public class sg {
    protected void createPDF(){
        try {
            OutputStream file = new FileOutputStream(new File("C:\\Users\\saurabh\\Desktop\\Saurabh Garg\\Sg.pdf"));
            Document doc = new Document();
            PdfWriter.getInstance(doc,file);
            doc.open();
            doc.addAuthor("Saurabh Garg");
            doc.addCreationDate();
            doc.addCreator("Saurabh Garg");
            doc.addTitle("Sample");
            doc.add(new Paragraph("Saurabh Garg"));
            doc.add(new Paragraph(new Date().toString()));
            doc.close();
            file.close();
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        
    }
    
    public static void main(String args[])
    {
        sg pd = new sg();
        pd.createPDF();
    }
        
}
