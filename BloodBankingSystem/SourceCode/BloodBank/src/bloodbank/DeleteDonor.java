/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bloodbank;

import DataBaseConnections.ConnectionProvider;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author SHIVA KRISHNA
 */
public class DeleteDonor extends javax.swing.JFrame {

    /**
     * Creates new form DeleteDonor
     */
    public DeleteDonor() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        DELETE = new javax.swing.JButton();
        EXIT = new javax.swing.JButton();
        RESET = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        SEARCHFIELD = new javax.swing.JTextField();
        SEARCH = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        NAMEFIELD = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        AGEFIELD = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        FNAMEFIELD = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        MNAMEFIELD = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        ADDRESSFIELD = new javax.swing.JTextField();
        CITYFIELD = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        DISTFIELD = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        PINFIELD = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        BLOODFIELD = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        GENDERFIELD = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        MOBILEFIELD = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Delete Donor");
        setMaximumSize(new java.awt.Dimension(1600, 900));
        setMinimumSize(new java.awt.Dimension(1600, 900));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1600, 900));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        jLabel1.setText("DELETE DONOR DETAILS");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(670, 30, 440, 38);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(0, 74, 1600, 13);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(0, 662, 1594, 12);

        DELETE.setBackground(new java.awt.Color(255, 153, 153));
        DELETE.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        DELETE.setForeground(new java.awt.Color(255, 0, 0));
        DELETE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bloodbank/delete.png"))); // NOI18N
        DELETE.setText("Delete");
        DELETE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DELETEActionPerformed(evt);
            }
        });
        getContentPane().add(DELETE);
        DELETE.setBounds(375, 738, 137, 42);

        EXIT.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        EXIT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bloodbank/Exit application.png"))); // NOI18N
        EXIT.setText("Exit");
        EXIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EXITActionPerformed(evt);
            }
        });
        getContentPane().add(EXIT);
        EXIT.setBounds(1086, 738, 137, 42);

        RESET.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        RESET.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bloodbank/Update details.png"))); // NOI18N
        RESET.setText("Reset");
        RESET.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RESETActionPerformed(evt);
            }
        });
        getContentPane().add(RESET);
        RESET.setBounds(741, 738, 137, 42);
        getContentPane().add(jSeparator3);
        jSeparator3.setBounds(6, 158, 1594, 14);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel2.setText("Mobile Number");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(291, 105, 152, 35);

        SEARCHFIELD.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        SEARCHFIELD.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(SEARCHFIELD);
        SEARCHFIELD.setBounds(561, 107, 281, 31);

        SEARCH.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        SEARCH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bloodbank/search1.png"))); // NOI18N
        SEARCH.setText("Search");
        SEARCH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SEARCHActionPerformed(evt);
            }
        });
        getContentPane().add(SEARCH);
        SEARCH.setBounds(954, 105, 121, 31);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel3.setText("Name");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(93, 193, 92, 25);

        NAMEFIELD.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        NAMEFIELD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NAMEFIELDActionPerformed(evt);
            }
        });
        getContentPane().add(NAMEFIELD);
        NAMEFIELD.setBounds(243, 190, 389, 35);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel4.setText("Age");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(93, 270, 92, 25);

        AGEFIELD.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        AGEFIELD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AGEFIELDActionPerformed(evt);
            }
        });
        getContentPane().add(AGEFIELD);
        AGEFIELD.setBounds(243, 267, 389, 35);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel5.setText("Mother Name");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(93, 424, 120, 25);

        FNAMEFIELD.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        FNAMEFIELD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FNAMEFIELDActionPerformed(evt);
            }
        });
        getContentPane().add(FNAMEFIELD);
        FNAMEFIELD.setBounds(243, 344, 389, 35);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel6.setText("Father Name");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(93, 347, 120, 25);

        MNAMEFIELD.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        MNAMEFIELD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MNAMEFIELDActionPerformed(evt);
            }
        });
        getContentPane().add(MNAMEFIELD);
        MNAMEFIELD.setBounds(243, 421, 389, 35);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel7.setText("Street Address");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(93, 496, 130, 25);

        ADDRESSFIELD.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        ADDRESSFIELD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADDRESSFIELDActionPerformed(evt);
            }
        });
        getContentPane().add(ADDRESSFIELD);
        ADDRESSFIELD.setBounds(243, 496, 389, 35);

        CITYFIELD.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        CITYFIELD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CITYFIELDActionPerformed(evt);
            }
        });
        getContentPane().add(CITYFIELD);
        CITYFIELD.setBounds(243, 571, 389, 35);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel8.setText("City");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(93, 574, 123, 25);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel9.setText("District");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(893, 499, 123, 25);

        DISTFIELD.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        DISTFIELD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DISTFIELDActionPerformed(evt);
            }
        });
        getContentPane().add(DISTFIELD);
        DISTFIELD.setBounds(1053, 496, 389, 35);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel10.setText("PinCode");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(893, 190, 98, 34);

        PINFIELD.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        getContentPane().add(PINFIELD);
        PINFIELD.setBounds(1053, 190, 365, 34);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel11.setText("BloodGroup");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(893, 265, 114, 34);

        BLOODFIELD.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        getContentPane().add(BLOODFIELD);
        BLOODFIELD.setBounds(1053, 271, 365, 26);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel12.setText("Gender");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(893, 342, 114, 34);

        GENDERFIELD.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        getContentPane().add(GENDERFIELD);
        GENDERFIELD.setBounds(1053, 348, 365, 26);

        jLabel13.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel13.setText("Mobile");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(893, 419, 114, 34);

        MOBILEFIELD.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        getContentPane().add(MOBILEFIELD);
        MOBILEFIELD.setBounds(1053, 421, 365, 34);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bloodbank/back10.jpg"))); // NOI18N
        getContentPane().add(jLabel14);
        jLabel14.setBounds(0, 0, 1600, 930);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NAMEFIELDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NAMEFIELDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NAMEFIELDActionPerformed

    private void AGEFIELDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AGEFIELDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AGEFIELDActionPerformed

    private void FNAMEFIELDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FNAMEFIELDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FNAMEFIELDActionPerformed

    private void MNAMEFIELDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MNAMEFIELDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MNAMEFIELDActionPerformed

    private void ADDRESSFIELDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADDRESSFIELDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ADDRESSFIELDActionPerformed

    private void CITYFIELDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CITYFIELDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CITYFIELDActionPerformed

    private void DISTFIELDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DISTFIELDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DISTFIELDActionPerformed

    private void DELETEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DELETEActionPerformed
        // TODO add your handling code here:
        try{
            String id = SEARCHFIELD.getText();
            if(id.length()>=1){
            int a = JOptionPane.showConfirmDialog(null, "Press Confirm to delete","Do you really want to delete",JOptionPane.YES_NO_OPTION);
            if(a==0)
            {
                ConnectionProvider connectionProvider = new ConnectionProvider();
                Connection con = connectionProvider.getCon();
                Statement st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
                st.executeUpdate("delete from donors where mobile = '"+id+"'");
                JOptionPane.showMessageDialog(null,"Data Has been Deleted Successfully,Thanks for Using our App");
                setVisible(false);
                new DeleteDonor().setVisible(true);
            }
            }
            else {
                JOptionPane.showMessageDialog(null,"Enter Donor Id Number to Search");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Deletion Unsuccessful");
        }
    }//GEN-LAST:event_DELETEActionPerformed

    private void EXITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EXITActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new Home().setVisible(true);
    }//GEN-LAST:event_EXITActionPerformed

    private void RESETActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RESETActionPerformed
        // TODO add your handling code here:
        new DeleteDonor().setVisible(true);
    }//GEN-LAST:event_RESETActionPerformed

    private void SEARCHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SEARCHActionPerformed
        // TODO add your handling code here:
        try{
            String id = SEARCHFIELD.getText();
            if(id.length()>=1){
                
             ConnectionProvider connectionProvider = new ConnectionProvider();
            Connection con = connectionProvider.getCon();
            Statement st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = st.executeQuery("select * from donors where mobile='"+id+"'");
            if(rs.next()){
//                rs.beforeFirst();
                NAMEFIELD.setText(rs.getString(2));
                AGEFIELD.setText(rs.getString(3));
                FNAMEFIELD.setText(rs.getString(4));
                MNAMEFIELD.setText(rs.getString(5));
                ADDRESSFIELD.setText(rs.getString(6));
                CITYFIELD.setText(rs.getString(7));
                DISTFIELD.setText(rs.getString(8));
                PINFIELD.setText(rs.getString(9));
                BLOODFIELD.setText(rs.getString(10));
                MOBILEFIELD.setText(rs.getString(11));
                GENDERFIELD.setText(rs.getString(12));
                
                NAMEFIELD.setEditable(false);
                AGEFIELD.setEditable(false);
                FNAMEFIELD.setEditable(false);
                MNAMEFIELD.setEditable(false);
                ADDRESSFIELD.setEditable(false);
                CITYFIELD.setEditable(false);
                DISTFIELD.setEditable(false);
                PINFIELD.setEditable(false);
                BLOODFIELD.setEditable(false);
                MOBILEFIELD.setEditable(false);
                GENDERFIELD.setEditable(false);
                
            }
            else {
                JOptionPane.showMessageDialog(null,"Donor is not available");
            }
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Enter Donor Id Number to Search");
            }
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        
    }//GEN-LAST:event_SEARCHActionPerformed

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
            java.util.logging.Logger.getLogger(DeleteDonor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteDonor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteDonor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteDonor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeleteDonor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ADDRESSFIELD;
    private javax.swing.JTextField AGEFIELD;
    private javax.swing.JTextField BLOODFIELD;
    private javax.swing.JTextField CITYFIELD;
    private javax.swing.JButton DELETE;
    private javax.swing.JTextField DISTFIELD;
    private javax.swing.JButton EXIT;
    private javax.swing.JTextField FNAMEFIELD;
    private javax.swing.JTextField GENDERFIELD;
    private javax.swing.JTextField MNAMEFIELD;
    private javax.swing.JTextField MOBILEFIELD;
    private javax.swing.JTextField NAMEFIELD;
    private javax.swing.JTextField PINFIELD;
    private javax.swing.JButton RESET;
    private javax.swing.JButton SEARCH;
    private javax.swing.JTextField SEARCHFIELD;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables
}
