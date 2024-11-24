/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assi4;

import static assi4.menu.getConnection;
import java.beans.Statement;
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
public class adding extends javax.swing.JFrame {
    

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

    public adding() throws ClassNotFoundException, SQLException {
        initComponents();
        setVisible(true);
        openDataBase();
    }
 
  
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        id = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        fName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Lname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        sex = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        G1 = new javax.swing.JTextField();
        G2 = new javax.swing.JTextField();
        G3 = new javax.swing.JTextField();
        G4 = new javax.swing.JTextField();
        G5 = new javax.swing.JTextField();
        G6 = new javax.swing.JTextField();
        G7 = new javax.swing.JTextField();
        G8 = new javax.swing.JTextField();
        G9 = new javax.swing.JTextField();
        G10 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Adding a new Student");
        setBackground(new java.awt.Color(0, 255, 255));
        setLocation(new java.awt.Point(700, 250));
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                formKeyTyped(evt);
            }
        });

        id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                idKeyTyped(evt);
            }
        });

        jLabel1.setText("    Enter the needed information for the student");

        jLabel2.setForeground(new java.awt.Color(255, 0, 51));
        jLabel2.setText("ID: ");

        jLabel3.setForeground(new java.awt.Color(255, 0, 51));
        jLabel3.setText("First Name:");

        fName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fNameKeyTyped(evt);
            }
        });

        jLabel4.setText("Last Name:");

        Lname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LnameActionPerformed(evt);
            }
        });
        Lname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                LnameKeyTyped(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(255, 0, 51));
        jLabel5.setText("Sex: ");

        sex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sexActionPerformed(evt);
            }
        });
        sex.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                sexKeyTyped(evt);
            }
        });

        jLabel6.setText("Grade1:");

        jLabel7.setText("Grade2:");

        jLabel8.setText("Grade3:");

        jLabel9.setText("Grade4:");

        jLabel10.setText("Grade5:");

        jLabel11.setText("Grade6:");

        jLabel12.setText("Grade7:");

        jLabel13.setText("Grade8:");

        jLabel14.setText("Grade9:");

        jLabel15.setText("Grade10:");

        G1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                G1KeyTyped(evt);
            }
        });

        G2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G2ActionPerformed(evt);
            }
        });
        G2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                G2KeyTyped(evt);
            }
        });

        G3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                G3KeyTyped(evt);
            }
        });

        G4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G4ActionPerformed(evt);
            }
        });
        G4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                G4KeyTyped(evt);
            }
        });

        G5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                G5KeyTyped(evt);
            }
        });

        G6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                G6KeyTyped(evt);
            }
        });

        G7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                G7KeyTyped(evt);
            }
        });

        G8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                G8KeyTyped(evt);
            }
        });

        G9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                G9KeyTyped(evt);
            }
        });

        G10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                G10KeyTyped(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(51, 102, 255));
        jButton1.setText("Add Student");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel16.setForeground(new java.awt.Color(255, 51, 51));
        jLabel16.setText("*(Required)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(G1))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(G5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(G4))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(G3))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(G2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(G8, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(G7, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(G6)
                            .addComponent(G10)
                            .addComponent(G9, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fName)
                            .addComponent(Lname, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                            .addComponent(sex)
                            .addComponent(id, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(35, 35, 35))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel16)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(fName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(Lname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(sex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(G6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(G1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(G2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(G7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(G3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(G8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(G9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(G4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(G5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(G10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LnameActionPerformed

    private void sexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sexActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sexActionPerformed

    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
        if (id.getText().isEmpty()){
             JOptionPane.showMessageDialog(this, "", "you must provide an ID", JOptionPane.ERROR_MESSAGE);
             return;
        }
        if (fName.getText().isEmpty()){
             JOptionPane.showMessageDialog(this, "", "you must provide a first neme", JOptionPane.ERROR_MESSAGE);
             return;
        }
        if (sex.getText().isEmpty()){
             JOptionPane.showMessageDialog(this, "", "you must provide student's sex", JOptionPane.ERROR_MESSAGE);
             return;
        }
        if (Lname.getText().isEmpty())
            Lname.setText(" ");
        
        int Id=Integer.parseInt(id.getText());
        int g1,g2,g3,g4,g5,g6,g7,g8,g9,g10;
        
       if(G1.getText().isEmpty())
           g1=0;
       else
        g1=Integer.parseInt(G1.getText());
       if(g1>100)
           g1=100;
       
       if(G2.getText().isEmpty())
           g2=0;
       else
        g2=Integer.parseInt(G2.getText());
        if(g2>100)
           g2=100;
       
       if(G3.getText().isEmpty())
           g3=0;
       else
        g3=Integer.parseInt(G3.getText());
        if(g3>100)
           g3=100;
       
       if(G4.getText().isEmpty())
           g4=0;
       else
        g4=Integer.parseInt(G4.getText());
        if(g4>100)
           g4=100;
       
       if(G5.getText().isEmpty())
           g5=0;
       else
        g5=Integer.parseInt(G5.getText());
        if(g5>100)
           g5=100;
       
       if(G6.getText().isEmpty())
           g6=0;
       else
        g6=Integer.parseInt(G6.getText());
        if(g6>100)
           g6=100;
       
       if(G7.getText().isEmpty())
           g7=0;
       else
        g7=Integer.parseInt(G7.getText());
        if(g7>100)
           g7=100;
       
       if(G8.getText().isEmpty())
           g8=0;
       else
        g8=Integer.parseInt(G8.getText());
        if(g8>100)
           g8=100;
       
       if(G9.getText().isEmpty())
           g9=0;
       else
        g9=Integer.parseInt(G9.getText());
        if(g9>100)
           g9=100;
       
       if(G10.getText().isEmpty())
           g10=0;
       else
        g10=Integer.parseInt(G10.getText());
        if(g10>100)
           g10=100;
       
       
       

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
         
         String S="insert into Students (ID, First_Name, Last_Name, Sex, G1, G2, G3, G4, G5, G6, G7, G8, G9, G10)\n" +
"VALUES (" + Id + ", " +"'"+ fName.getText()+"'"+ "," +"'"+ Lname.getText()+"'" + "," +"'"+ sex.getText()+"'" + "," + g1 + "," + g2 + "," + g3 + "," + g4 + "," + g5 + "," + g6 + "," + g7 + "," + g8 + "," + g9 + "," + g10 +" )";
         try {
             st.execute(S);
           
         } catch (SQLException ex) {
             Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
         }
         
         
        
          JOptionPane.showMessageDialog(this, "", "Done!", JOptionPane.INFORMATION_MESSAGE);
          dispose();

        
       


    }//GEN-LAST:event_jButton1ActionPerformed

    private void G2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_G2ActionPerformed

    private void G4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_G4ActionPerformed

    private void idKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idKeyTyped
       
         if  ((evt.getKeyChar() >= 'A' && evt.getKeyChar() <= 'Z') || (evt.getKeyChar() >= 'a' && evt.getKeyChar() <= 'z')) {
                    evt.consume();
        }
        
    }//GEN-LAST:event_idKeyTyped

    private void fNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fNameKeyTyped
        if (evt.getKeyChar()>'0'&&evt.getKeyChar()<'9')
            evt.consume();
    }//GEN-LAST:event_fNameKeyTyped

    private void LnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LnameKeyTyped
        if (evt.getKeyChar()>'0'&&evt.getKeyChar()<'9')
            evt.consume();
    }//GEN-LAST:event_LnameKeyTyped

    private void sexKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sexKeyTyped
         if (evt.getKeyChar()>'0'&&evt.getKeyChar()<'9')
            evt.consume();
    }//GEN-LAST:event_sexKeyTyped

    private void formKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_formKeyTyped

    private void G1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_G1KeyTyped
        if  ((evt.getKeyChar() >= 'A' && evt.getKeyChar() <= 'Z') || (evt.getKeyChar() >= 'a' && evt.getKeyChar() <= 'z')) {
                    evt.consume();
        }
    }//GEN-LAST:event_G1KeyTyped

    private void G2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_G2KeyTyped
        if  ((evt.getKeyChar() >= 'A' && evt.getKeyChar() <= 'Z') || (evt.getKeyChar() >= 'a' && evt.getKeyChar() <= 'z')) {
                    evt.consume();
        }
    }//GEN-LAST:event_G2KeyTyped

    private void G3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_G3KeyTyped
        if  ((evt.getKeyChar() >= 'A' && evt.getKeyChar() <= 'Z') || (evt.getKeyChar() >= 'a' && evt.getKeyChar() <= 'z')) {
                    evt.consume();
        }
    }//GEN-LAST:event_G3KeyTyped

    private void G4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_G4KeyTyped
        if  ((evt.getKeyChar() >= 'A' && evt.getKeyChar() <= 'Z') || (evt.getKeyChar() >= 'a' && evt.getKeyChar() <= 'z')) {
                    evt.consume();
        }
    }//GEN-LAST:event_G4KeyTyped

    private void G5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_G5KeyTyped
        if  ((evt.getKeyChar() >= 'A' && evt.getKeyChar() <= 'Z') || (evt.getKeyChar() >= 'a' && evt.getKeyChar() <= 'z')) {
                    evt.consume();
        }
    }//GEN-LAST:event_G5KeyTyped

    private void G6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_G6KeyTyped
        if  ((evt.getKeyChar() >= 'A' && evt.getKeyChar() <= 'Z') || (evt.getKeyChar() >= 'a' && evt.getKeyChar() <= 'z')) {
                    evt.consume();
        }
    }//GEN-LAST:event_G6KeyTyped

    private void G7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_G7KeyTyped
        if  ((evt.getKeyChar() >= 'A' && evt.getKeyChar() <= 'Z') || (evt.getKeyChar() >= 'a' && evt.getKeyChar() <= 'z')) {
                    evt.consume();
        }
    }//GEN-LAST:event_G7KeyTyped

    private void G8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_G8KeyTyped
        if  ((evt.getKeyChar() >= 'A' && evt.getKeyChar() <= 'Z') || (evt.getKeyChar() >= 'a' && evt.getKeyChar() <= 'z')) {
                    evt.consume();
        }
    }//GEN-LAST:event_G8KeyTyped

    private void G9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_G9KeyTyped
        if  ((evt.getKeyChar() >= 'A' && evt.getKeyChar() <= 'Z') || (evt.getKeyChar() >= 'a' && evt.getKeyChar() <= 'z')) {
                    evt.consume();
        }
    }//GEN-LAST:event_G9KeyTyped

    private void G10KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_G10KeyTyped
       if  ((evt.getKeyChar() >= 'A' && evt.getKeyChar() <= 'Z') || (evt.getKeyChar() >= 'a' && evt.getKeyChar() <= 'z')) {
                    evt.consume();
        }
    }//GEN-LAST:event_G10KeyTyped

    
    
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
            java.util.logging.Logger.getLogger(adding.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adding.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adding.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adding.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new adding().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(adding.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(adding.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField G1;
    private javax.swing.JTextField G10;
    private javax.swing.JTextField G2;
    private javax.swing.JTextField G3;
    private javax.swing.JTextField G4;
    private javax.swing.JTextField G5;
    private javax.swing.JTextField G6;
    private javax.swing.JTextField G7;
    private javax.swing.JTextField G8;
    private javax.swing.JTextField G9;
    private javax.swing.JTextField Lname;
    private javax.swing.JTextField fName;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField sex;
    // End of variables declaration//GEN-END:variables
}
