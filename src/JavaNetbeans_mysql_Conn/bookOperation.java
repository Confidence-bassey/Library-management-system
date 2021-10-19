/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaNetbeans_mysql_Conn;

/**
 *
 * @author DELL
 */
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.text.DateFormat;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import java.sql.Statement;
import com.libmgr.dao.DbHelper;


public class bookOperation extends javax.swing.JFrame {

    /**
     * Creates new form bookOperation
     */
    public bookOperation() {
        initComponents();
        
        bookDisplaybttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisplaybttnActionPerformed(evt);
            }});
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        bookDisplaybttn = new javax.swing.JButton();
        Exitbttn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        Bookname = new javax.swing.JLabel();
        Authorname = new javax.swing.JLabel();
        Isbn = new javax.swing.JLabel();
        pubDate = new javax.swing.JLabel();
        Enterbkname = new javax.swing.JTextField();
        EnterAuthor = new javax.swing.JTextField();
        EnterISBN = new javax.swing.JTextField();
        EnterpubDate = new javax.swing.JTextField();
        Addbookbttn = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153), 4));

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153), 4));

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153), 4));

        bookDisplaybttn.setText("DisplayBooks");

        Exitbttn.setText("Exit");
        Exitbttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitbttnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(bookDisplaybttn, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(Exitbttn, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(bookDisplaybttn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(Exitbttn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(82, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153), 4));

        Bookname.setText("BookName:");

        Authorname.setText("Author:");

        Isbn.setText("ISBN:");

        pubDate.setText("PubDate:");

        EnterpubDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnterpubDateActionPerformed(evt);
            }
        });

        Addbookbttn.setText("AddBook");
        Addbookbttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddbookbttnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Bookname, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                    .addComponent(pubDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Isbn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Authorname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(EnterISBN, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)
                            .addComponent(EnterpubDate)
                            .addComponent(Addbookbttn, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(EnterAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Enterbkname, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(54, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bookname)
                    .addComponent(Enterbkname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Authorname)
                    .addComponent(EnterAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Isbn)
                    .addComponent(EnterISBN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pubDate)
                    .addComponent(EnterpubDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(Addbookbttn)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jTextField1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jTextField1.setText("                                           Welcome To Mr. Bassey's BookShop");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   // conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/?" + "user=root&password=password");

    
    private String CreateBookRecord(String bookName, String authorName, String Isbn, String pubdate){
        try{
            //jdbc:mysql://localhost/db?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC
           // Class.forName("com.mysql.jdbc.Driver");
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/connector1?ServerTimeZone=UTC", "root","BillonaireConfi1");
            
            Statement state = connect.createStatement();
            String query = 
                    "INSERT INTO books(BookName,AuthorName,ISBN,pubDate)Values("+
                    "'"+bookName+"','"+authorName+"','"+Isbn+"','"+pubdate+"')";
            int rows_affected = state.executeUpdate(query);
            if(rows_affected<0){
                System.out.println("Failed to add book");
                return null;
            }
            
        } catch(Exception exception){
                System.out.println( exception);
                return null;
        }
        return null;
    }    

        
     private void deleteBk(){
        try {
           /* String booksQuery = "delete from books where books.bookId = id";
            var booksResultSet = DbHelper.executeQuery(booksQuery); */
            //String id;
            //id = JOptionPane.showInputDialog("Enter book Id");
            
        //String bookName = this.Enterbkname.getText();
       // String authorName = EnterAuthor.getText();
        String Id = this.EnterISBN.getText();
       // String pubdate = EnterpubDate.getText();
          Id =  JOptionPane.showInputDialog("Enter book Id");
         // Id = "120-4567-89103";
          Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/connector1?ServerTimeZone=UTC", "root","BillonaireConfi1");
            String booksQuery = "delete from books where bookId=?";
            PreparedStatement state = connect.prepareStatement(booksQuery);
           // String booksQuery = "delete from books where bookId = ?"; 
            
           System.out.println("preparedStatement before binding = "+ state.toString());
           
          // state.setString(1, bookName);
          // state.setString(2,authorName);
           state.setInt(1, Integer.parseInt(Id));
           System.out.println("preparedStatement after binding = "+ state.toString());

          // state.setString(4, pubdate); 
            
            int rows_affected = state.executeUpdate();
            
            if(rows_affected<0){
                JOptionPane.showMessageDialog(this,"Failed to delete book");   
            }else{
                JOptionPane.showMessageDialog(this, "Deletion successful");
            }
        }catch(Exception exception){
                System.out.println( exception);
        }
     }
     
     public void Updatebook(){
         
         try {
           /* String booksQuery = "delete from books where books.bookId = id";
            var booksResultSet = DbHelper.executeQuery(booksQuery); */
            //String id;
            //id = JOptionPane.showInputDialog("Enter book Id");
            
        String bookName = this.Enterbkname.getText();
        String authorName = EnterAuthor.getText();
        String Isbn = this.EnterISBN.getText();
        String pubdate = EnterpubDate.getText();
          String Id =  JOptionPane.showInputDialog("Enter book Id");
          Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/connector1?ServerTimeZone=UTC", "root","BillonaireConfi1");
         // Connection connect =DBHelper.getConnection();
          String booksUpdate = "update books set BookName = ?, AuthorName = ?, ISBN = ?, pubDate = ? where bookId =?";
            PreparedStatement state = connect.prepareStatement(booksUpdate);
       
            //    System.out.println("preparedStatement before binding = "+ state.toString());
           state.setInt(1, Integer.parseInt(Id));
           state.setString(2, bookName);
           state.setString(3,authorName);
           state.setString(4, Isbn);
           state.setString(5, pubdate); 
            
            int rows_affected = state.executeUpdate();
            if(rows_affected<0){
                JOptionPane.showMessageDialog(this,"Update Failed");   
            }else{
                JOptionPane.showMessageDialog(this, "Book Update successful");
            }
        }catch(Exception exception){
                System.out.println( exception);
        }

         
     }
     
    public Vector<Vector<Object>> SearchBooks(String searchKey){
         try{
             Connection connect = DbHelper.getConnection("");
              
             //"select * from books where BookName like ? or AuthorName like ? or ISBN = ? or pubDate like ? or bookId = ?";
              
             String searchQuery = "select * from books where ISBN=? or BookName like ? or AuthorName like ?";
             PreparedStatement statement = connect.prepareStatement(searchQuery);
             //var booksResultSet = DbHelper.executeQuery(searchQuery);
             
             statement.setString(1, searchKey);
             statement.setString(2, "%"+searchKey+"%");
             statement.setString(3,"%"+searchKey+"%");
             
             System.out.println("Prepared Statement = "+statement.toString());
            // ResultSet Qresult = statement.executeQuery();
             
             ResultSet Qresult = statement.executeQuery();
             Vector<Vector<Object>> searchResult = new Vector<Vector<Object>>();
             
             while(Qresult.next()){
                 Vector rowVector = new Vector();
                 rowVector.add(Qresult.getInt("bookId"));
                 rowVector.add(Qresult.getString("BookName"));
                 rowVector.add(Qresult.getString("AuthorName"));
                 rowVector.add(Qresult.getString("ISBN"));
                 rowVector.add(Qresult.getString("puDate"));
                 
                 searchResult.add(rowVector);
                 
             }
             
               return searchResult;
         }catch(Exception e){
             System.out.println(e);
              return new Vector<>();
         }
              
     } 
     


           
    private void ExitbttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitbttnActionPerformed
        // TODO add your handling code here:
        String exit = this.Exitbttn.getActionCommand();
        System.exit(0);
    }//GEN-LAST:event_ExitbttnActionPerformed

    private void AddbookbttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddbookbttnActionPerformed
        // TODO add your handling code here:        String addbook = this.Addbookbutton.getActionCommand();
        String bookName = this.Enterbkname.getText();
        String authorName = EnterAuthor.getText();
        String Isbn = EnterISBN.getText();
        String pubdate = EnterpubDate.getText();
        CreateBookRecord(bookName,authorName,Isbn,pubdate);
        JOptionPane.showMessageDialog(this,"Thank you!! "+ bookName+" has now been added to your store");
        if(bookName.isBlank()){
            JOptionPane.showMessageDialog(this,"Enter book name","Enter book name",0);
            return;
        }    
    }//GEN-LAST:event_AddbookbttnActionPerformed

    private void EnterpubDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnterpubDateActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "enter in the format: yyyy-mm-dd");
       Date Currentdate = new Date();
     SimpleDateFormat DateForm = new SimpleDateFormat("yyyy-MM-dd");
     String userEntry = EnterpubDate.getText();
      
     //Developer1
    // System.out.println(DateForm.format(Currentdate));

    }//GEN-LAST:event_EnterpubDateActionPerformed

    private void SearchLibbttnActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
        BooksWindow booksListWindow = new BooksWindow();
        booksListWindow.setVisible(true);
    }   
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(bookOperation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bookOperation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bookOperation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bookOperation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bookOperation().setVisible(true);
            }
        });
    }

    
    private void DisplaybttnActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
        BooksWindow booksListWindow = new BooksWindow();
        booksListWindow.setVisible(true);
    }   
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Addbookbttn;
    private javax.swing.JLabel Authorname;
    private javax.swing.JLabel Bookname;
    private javax.swing.JTextField EnterAuthor;
    private javax.swing.JTextField EnterISBN;
    private javax.swing.JTextField Enterbkname;
    private javax.swing.JTextField EnterpubDate;
    private javax.swing.JButton Exitbttn;
    private javax.swing.JLabel Isbn;
    private javax.swing.JButton bookDisplaybttn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel pubDate;
    // End of variables declaration//GEN-END:variables
}
