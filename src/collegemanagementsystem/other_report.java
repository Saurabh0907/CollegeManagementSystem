/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package collegemanagementsystem;

import com.college.util.JDBCUtil;
import java.sql.*;
import java.util.Vector;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author saurabh
 */
public class other_report extends javax.swing.JFrame {

    Connection con;
    ResultSet rs;
    PreparedStatement ps;
    Statement s1;
    String q;

    
    public other_report() {
        con = JDBCUtil.getConnection();
        disp();
        
    }
    
    public static void main(String args[]) {
            new other_report();
    }
    
    private void disp() {
        
        try{
        ps = con.prepareStatement("select * from otherfee");
        rs = ps.executeQuery();
        JTable table = new JTable(buildTableModel(rs));
    JOptionPane.showMessageDialog(null, new JScrollPane(table));
        
        
        }catch(Exception e){}
    
    }

    private TableModel buildTableModel(ResultSet rs) throws SQLException {
        
        ResultSetMetaData metaData = null;
        try{
        metaData = rs.getMetaData();
        }catch(Exception e){}
    // names of columns
    Vector<String> columnNames = new Vector<String>();
    int columnCount = metaData.getColumnCount();
    for (int column = 1; column <= columnCount; column++) {
        columnNames.add(metaData.getColumnName(column));
    }

    // data of the table
    Vector<Vector<Object>> data = new Vector<Vector<Object>>();
    while (rs.next()) {
        Vector<Object> vector = new Vector<Object>();
        for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
            vector.add(rs.getObject(columnIndex));
        }
        data.add(vector);
    }

    return new DefaultTableModel(data, columnNames);
    }
}
