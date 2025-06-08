
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.sql.*;
import javax.swing.JOptionPane;
import project.*;

public class newvisitor extends javax.swing.JFrame {

    public newvisitor() {
        initComponents();
        jTextField7.setEditable(false);
        SimpleDateFormat myformat=new SimpleDateFormat("yyyy/MM/dd  HH:mm:ss");
        Calendar cal=Calendar.getInstance();
        jTextField7.setText(myformat.format(cal.getTime()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jTextField4 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(345, 67));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1171, 725));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Mistral", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 102));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/new1.png"))); // NOI18N
        jLabel1.setText("NEW VISITORS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 140, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/close.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1108, 6, 27, 26));

        jLabel2.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabel2.setText("NAME");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 85, -1));

        jTextField1.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 350, -1));

        jLabel3.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabel3.setText("CONTACT NUMBER");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 144, -1));

        jTextField2.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 350, -1));

        jLabel4.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabel4.setText("ADDRESS");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 101, -1));

        jLabel5.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabel5.setText("GENDER");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 410, 64, -1));

        jComboBox1.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MALE", "FEMALE", "OTHERS", " " }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 440, 350, -1));

        jLabel6.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabel6.setText("EMAIL");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 490, -1, -1));

        jLabel7.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabel7.setText("DEPARTMENT");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 100, 122, -1));

        jComboBox2.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "HUMAN RESOURCES", "OPERATIONS MANAGEMENT ", "INFORMATION TECHNOLOGY", "MARKETING", "SALES", "ACCOUNTING AND FINANCE", "FAQs", " " }));
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 130, 350, -1));

        jTextField4.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 520, 360, -1));

        jLabel8.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabel8.setText("PURPOSE FOR VISIT");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 170, -1, -1));

        jTextField5.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 200, 350, -1));

        jLabel9.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabel9.setText("ID TYPE");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 250, 78, 20));

        jComboBox3.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AADHAR CARD", "PAN CARD", "VOTER ID", "DRIVING LICENCE" }));
        getContentPane().add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 280, 350, 20));

        jLabel10.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabel10.setText("ID NUMBER");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 330, 92, -1));

        jTextField6.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 360, 350, -1));

        jLabel11.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabel11.setText("VISIT DATE & TIME[hh:mm:ss] (Today)");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 410, -1, -1));

        jTextField7.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 440, 350, -1));

        jButton2.setBackground(new java.awt.Color(153, 51, 0));
        jButton2.setFont(new java.awt.Font("Castellar", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("SAVE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 600, -1, -1));

        jButton3.setBackground(new java.awt.Color(153, 51, 0));
        jButton3.setFont(new java.awt.Font("Castellar", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("CLEAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 600, -1, -1));

        jLabel12.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabel12.setText("NUMBER OF PERSON");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 490, -1, -1));

        jTextField8.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        getContentPane().add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 520, 350, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 350, 120));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/panel.jpg"))); // NOI18N
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        setVisible(false);
        new newvisitor().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
        int id=1;
        String name=jTextField1.getText();
        String mobileNumber=jTextField2.getText();
        String address=jTextArea1.getText();
        String gender=(String)jComboBox1.getSelectedItem();
        String email=jTextField4.getText();
        String dept=(String)jComboBox2.getSelectedItem();
        String pvisit=jTextField5.getText();
        String idtype=(String)jComboBox3.getSelectedItem();
        String idNumber=jTextField6.getText();
        String checkin=jTextField7.getText();
        String personvisit=jTextField8.getText();
        String Query="Select max(id) from visitors";
        try
        {
            ResultSet rs=select.getData(Query);
            while(rs.next())
                id=rs.getInt(1);
            id=id+1;
            if(!name.equals("") && !mobileNumber.equals("") && !pvisit.equals("")&& !idNumber.equals(""))
            {
                Query="insert into visitors(id,name,mobileNumber,address,gender,email,dept,pvisit,idtype,idnumber,checkin,personvisit) values("+id+",'"+name+"','"+mobileNumber+"','"+address+"','"+gender+"','"+email+"','"+dept+"','"+pvisit+"','"+idtype+"','"+idNumber+"','"+checkin+"','"+personvisit+"')";
                InsertUpdateDelete.setData(Query, "Saved details Successfully!");
                setVisible(false);
                new newvisitor().setVisible(true);
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new newvisitor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}
