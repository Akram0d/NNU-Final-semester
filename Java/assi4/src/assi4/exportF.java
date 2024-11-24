/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assi4;

import static assi4.search.getConnection;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileSystemView;

/**
 *
 * @author PAL WEB
 */
public class exportF extends javax.swing.JFrame {

    Connection  con=null;
    java.sql.Statement    st=null;
    
    ResultSet    rs=null;
    
    
    
     public static Connection getConnection () throws ClassNotFoundException, SQLException
   {
       String   driver="net.ucanaccess.jdbc.UcanaccessDriver";
       String   URL  ="jdbc:ucanaccess://C:\\Users\\PAL WEB\\Documents\\NetBeansProjects\\assi4\\test.accdb";
       
       
       Class kk=Class.forName(driver);
       
      
       return DriverManager.getConnection(URL);
       
       
   }
    
    public void openDataBase() throws ClassNotFoundException, SQLException
    {
        
        con=getConnection();
           
    }
    
    
    public exportF() {
        initComponents();
        setVisible(true);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        text = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Export");
        setLocation(new java.awt.Point(780, 380));
        setSize(new java.awt.Dimension(300, 300));

        text.setBackground(new java.awt.Color(204, 255, 255));

        jButton1.setText("Browse");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Choose a file to export to");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(text, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         JFileChooser fileChooser = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
            fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
            int returnValue = fileChooser.showOpenDialog(null);
            if (returnValue == JFileChooser.APPROVE_OPTION) {
                File selectedFile = fileChooser.getSelectedFile();
                text.setText(selectedFile.getAbsolutePath());
            }
            
            
              try {
             getConnection();
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
         } catch (SQLException ex) {
             Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
         }
         try {
             openDataBase();
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
         } catch (SQLException ex) {
             Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
         }
         
         try {
             st= con.createStatement();
         } catch (SQLException ex) {
             Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
         }
         
         String S="select * from Students";
         try {
            rs= st.executeQuery(S);
           
         } catch (SQLException ex) {
             Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
         }
 
            
             PrintStream    out=null;
        
        try {
            
            out= new PrintStream(text.getText());
                                   
             while (rs.next()) {
                    
                    
                int idd = rs.getInt("ID");
                String firstName = rs.getString("First_Name");
                String lastName = rs.getString("Last_Name");
                String Sex = rs.getString("Sex"); 
                int g1 = rs.getInt("G1");
                int g2 = rs.getInt("G2");
                int g3 = rs.getInt("G3");
                int g4 = rs.getInt("G4");
                int g5 = rs.getInt("G5");
                int g6 = rs.getInt("G6");
                int g7 = rs.getInt("G7");
                int g8 = rs.getInt("G8");
                int g9 = rs.getInt("G9");
                int g10 = rs.getInt("G10");
                int avg = rs.getInt("AVG");
                
                
                out.println("ID--------------> " + idd); out.println();
                out.println("First Name------> " + firstName); out.println();
                out.println("Last name-------> " + lastName); out.println();
                out.println("Sex-------------> " + Sex); out.println();
                out.println("Grade1----------> " + g1); out.println();
                out.println("Grade2----------> " + g2); out.println();
                out.println("Grade3----------> " + g3); out.println();
                out.println("Grade4----------> " + g4); out.println();
                out.println("Grade5----------> " + g5); out.println();
                out.println("Grade6----------> " + g6); out.println();
                out.println("Grade7----------> " + g7); out.println();
                out.println("Grade8----------> " + g8); out.println();
                out.println("Grade9----------> " + g9); out.println();
                out.println("Grade10----------> " + g10); out.println();
                out.println("AVG-------------> " + avg); out.println();
                
                }
               
            
        
            
        } catch (FileNotFoundException ex) {
             Logger.getLogger(exportF.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (Exception    e)
        {
            System.out.println("caught an exception...");
        }
        finally{
            
            out.flush();
            out.close();
            out=null;
             JOptionPane.showMessageDialog(this, "", "Done!", JOptionPane.INFORMATION_MESSAGE);
            dispose();
            
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(exportF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(exportF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(exportF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(exportF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new exportF().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField text;
    // End of variables declaration//GEN-END:variables
}
