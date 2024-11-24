/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assi4;

import static assi4.adding.getConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author PAL WEB
 */
public class change extends javax.swing.JFrame {

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
    
    public change() {
        initComponents();
        setVisible(true);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        g1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        g2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        g3 = new javax.swing.JTextField();
        g4 = new javax.swing.JTextField();
        g5 = new javax.swing.JTextField();
        g6 = new javax.swing.JTextField();
        g7 = new javax.swing.JTextField();
        g8 = new javax.swing.JTextField();
        g9 = new javax.swing.JTextField();
        g10 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        id = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Modifing Students Grades");
        setLocation(new java.awt.Point(700, 150));
        setSize(new java.awt.Dimension(370, 560));

        jLabel1.setText("Select a student to modify his grades");

        g1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g1ActionPerformed(evt);
            }
        });
        g1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                g1KeyTyped(evt);
            }
        });

        jLabel2.setText("Grade1:");

        jLabel3.setText("Grade2:");

        g2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                g2KeyTyped(evt);
            }
        });

        jLabel4.setText("Grade3:");

        jLabel5.setText("Grade4:");

        jLabel6.setText("Grade5:");

        jLabel7.setText("Grade6:");

        jLabel8.setText("Grade7:");

        jLabel9.setText("Grade8:");

        jLabel10.setText("Grade9:");

        jLabel11.setText("Grade10:");

        g3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g3ActionPerformed(evt);
            }
        });
        g3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                g3KeyTyped(evt);
            }
        });

        g4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                g4KeyTyped(evt);
            }
        });

        g5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                g5KeyTyped(evt);
            }
        });

        g6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                g6KeyTyped(evt);
            }
        });

        g7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                g7KeyTyped(evt);
            }
        });

        g8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                g8KeyTyped(evt);
            }
        });

        g9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                g9KeyTyped(evt);
            }
        });

        g10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                g10KeyTyped(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 204, 51));
        jButton1.setText("Modify");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                idKeyTyped(evt);
            }
        });

        jLabel12.setText("Enter");

        jLabel13.setForeground(new java.awt.Color(255, 0, 51));
        jLabel13.setText("ID:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 37, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(g5)
                                    .addComponent(g6)
                                    .addComponent(g7)
                                    .addComponent(g8)
                                    .addComponent(g9)
                                    .addComponent(g1)
                                    .addComponent(g3)
                                    .addComponent(g2)
                                    .addComponent(g4)
                                    .addComponent(g10, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(g1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(g2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(g3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(g4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(g5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(g6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(g7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(g8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(g9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(g10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void g1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_g1ActionPerformed

    private void g3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_g3ActionPerformed

    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
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
         
         if (id.getText().isEmpty()){
             JOptionPane.showMessageDialog(this, "", "you didn't provide any ID", JOptionPane.ERROR_MESSAGE);
             return;
         }
         
         int ID=Integer.parseInt(id.getText());
         
         if(!g1.getText().isEmpty()){
             int val=Integer.parseInt(g1.getText());
             if (val>100)
                 val=100;
             String S="Update Students set G1="+val+" where ID="+ID;
         try {
             st.execute(S);
           
         } catch (SQLException ex) {
             Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
         }
         }
         
         if(!g2.getText().isEmpty()){
             int val=Integer.parseInt(g2.getText());
             if (val>100)
                 val=100;
             String S="Update Students set G2="+val+" where ID="+ID;
         try {
             st.execute(S);
           
         } catch (SQLException ex) {
             Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
         }
         }
         
         if(!g3.getText().isEmpty()){
             int val=Integer.parseInt(g3.getText());
             if (val>100)
                 val=100;
             String S="Update Students set G3="+val+" where ID="+ID;
         try {
             st.execute(S);
           
         } catch (SQLException ex) {
             Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
         }
         }
         
         if(!g4.getText().isEmpty()){
             int val=Integer.parseInt(g4.getText());
             if (val>100)
                 val=100;
             String S="Update Students set G4="+val+" where ID="+ID;
         try {
             st.execute(S);
           
         } catch (SQLException ex) {
             Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
         }
         }
         
         if(!g5.getText().isEmpty()){
             int val=Integer.parseInt(g5.getText());
             if (val>100)
                 val=100;
             String S="Update Students set G5="+val+" where ID="+ID;
         try {
             st.execute(S);
           
         } catch (SQLException ex) {
             Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
         }
         }
         
         if(!g6.getText().isEmpty()){
             int val=Integer.parseInt(g6.getText());
             if (val>100)
                 val=100;
             String S="Update Students set G6="+val+" where ID="+ID;
         try {
             st.execute(S);
           
         } catch (SQLException ex) {
             Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
         }
         }
         
         if(!g7.getText().isEmpty()){
             int val=Integer.parseInt(g7.getText());
             if (val>100)
                 val=100;
             String S="Update Students set G7="+val+" where ID="+ID;
         try {
             st.execute(S);
           
         } catch (SQLException ex) {
             Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
         }
         }
         
         if(!g8.getText().isEmpty()){
             int val=Integer.parseInt(g8.getText());
             if (val>100)
                 val=100;
             String S="Update Students set G8="+val+" where ID="+ID;
         try {
             st.execute(S);
           
         } catch (SQLException ex) {
             Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
         }
         }
         
         if(!g9.getText().isEmpty()){
             int val=Integer.parseInt(g9.getText());
             if (val>100)
                 val=100;
             String S="Update Students set G9="+val+" where ID="+ID;
         try {
             st.execute(S);
           
         } catch (SQLException ex) {
             Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
         }
         }
         
         if(!g10.getText().isEmpty()){
             int val=Integer.parseInt(g10.getText());
             if (val>100)
                 val=100;
             String S="Update Students set G10="+val+" where ID="+ID;
         try {
             st.execute(S);
           
         } catch (SQLException ex) {
             Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
         }
         }
         
           JOptionPane.showMessageDialog(this, "", "Done!", JOptionPane.INFORMATION_MESSAGE);
            dispose();
          
         
         
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void idKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idKeyTyped
        if  ((evt.getKeyChar() >= 'A' && evt.getKeyChar() <= 'Z') || (evt.getKeyChar() >= 'a' && evt.getKeyChar() <= 'z')) {
                    evt.consume();
        }
    }//GEN-LAST:event_idKeyTyped

    private void g1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_g1KeyTyped
        if  ((evt.getKeyChar() >= 'A' && evt.getKeyChar() <= 'Z') || (evt.getKeyChar() >= 'a' && evt.getKeyChar() <= 'z')) {
                    evt.consume();
        }
    }//GEN-LAST:event_g1KeyTyped

    private void g2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_g2KeyTyped
        if  ((evt.getKeyChar() >= 'A' && evt.getKeyChar() <= 'Z') || (evt.getKeyChar() >= 'a' && evt.getKeyChar() <= 'z')) {
                    evt.consume();
        }
    }//GEN-LAST:event_g2KeyTyped

    private void g3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_g3KeyTyped
        if  ((evt.getKeyChar() >= 'A' && evt.getKeyChar() <= 'Z') || (evt.getKeyChar() >= 'a' && evt.getKeyChar() <= 'z')) {
                    evt.consume();
        }
    }//GEN-LAST:event_g3KeyTyped

    private void g4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_g4KeyTyped
        if  ((evt.getKeyChar() >= 'A' && evt.getKeyChar() <= 'Z') || (evt.getKeyChar() >= 'a' && evt.getKeyChar() <= 'z')) {
                    evt.consume();
        }
    }//GEN-LAST:event_g4KeyTyped

    private void g5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_g5KeyTyped
        if  ((evt.getKeyChar() >= 'A' && evt.getKeyChar() <= 'Z') || (evt.getKeyChar() >= 'a' && evt.getKeyChar() <= 'z')) {
                    evt.consume();
        }
    }//GEN-LAST:event_g5KeyTyped

    private void g6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_g6KeyTyped
       if  ((evt.getKeyChar() >= 'A' && evt.getKeyChar() <= 'Z') || (evt.getKeyChar() >= 'a' && evt.getKeyChar() <= 'z')) {
                    evt.consume();
        }
    }//GEN-LAST:event_g6KeyTyped

    private void g7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_g7KeyTyped
        if  ((evt.getKeyChar() >= 'A' && evt.getKeyChar() <= 'Z') || (evt.getKeyChar() >= 'a' && evt.getKeyChar() <= 'z')) {
                    evt.consume();
        }
    }//GEN-LAST:event_g7KeyTyped

    private void g8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_g8KeyTyped
        if  ((evt.getKeyChar() >= 'A' && evt.getKeyChar() <= 'Z') || (evt.getKeyChar() >= 'a' && evt.getKeyChar() <= 'z')) {
                    evt.consume();
        }
    }//GEN-LAST:event_g8KeyTyped

    private void g9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_g9KeyTyped
        if  ((evt.getKeyChar() >= 'A' && evt.getKeyChar() <= 'Z') || (evt.getKeyChar() >= 'a' && evt.getKeyChar() <= 'z')) {
                    evt.consume();
        }
    }//GEN-LAST:event_g9KeyTyped

    private void g10KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_g10KeyTyped
        if  ((evt.getKeyChar() >= 'A' && evt.getKeyChar() <= 'Z') || (evt.getKeyChar() >= 'a' && evt.getKeyChar() <= 'z')) {
                    evt.consume();
        }
    }//GEN-LAST:event_g10KeyTyped

 
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
            java.util.logging.Logger.getLogger(change.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(change.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(change.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(change.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new change().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField g1;
    private javax.swing.JTextField g10;
    private javax.swing.JTextField g2;
    private javax.swing.JTextField g3;
    private javax.swing.JTextField g4;
    private javax.swing.JTextField g5;
    private javax.swing.JTextField g6;
    private javax.swing.JTextField g7;
    private javax.swing.JTextField g8;
    private javax.swing.JTextField g9;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
