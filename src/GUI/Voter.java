/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import Function.ListArray;
import Function.DataVoter;
import Function.DatabaseConnection;
import Function.Security;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Random;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mtauf
 */
public class Voter extends javax.swing.JFrame {
    private int i=-1;
    private String vote_who;
    private char privilege;
    EditVoter editVoter;
    AdminPanel adminPanel;
    DatabaseConnection datacon = new DatabaseConnection();
    /**
     * Creates new form GeneratePassword
     * @param privilege
     */
    public Voter(char privilege) {
        this.privilege=privilege;
        initComponents();
        PrivilegeShow();
        ShowData("SELECT * FROM mahasiswa");
    }
    public Voter(char privilege, AdminPanel a) {
        this.privilege=privilege;
        initComponents();
        this.adminPanel=a;
        PrivilegeShow();
        ShowData("SELECT * FROM mahasiswa");
    }

    private Voter() {
        initComponents();
        ShowData("SELECT * FROM mahasiswa");
        //To change body of generated methods, choose Tools | Templates.
    }
    
    private void PrivilegeShow(){
        this.setResizable(false);
        if(privilege=='p'){
            AddButton.setVisible(false);
            DeleteButton.setVisible(false);
            EditButton.setVisible(false);
        }else if(privilege=='a'){
            AddButton.setVisible(true);
            DeleteButton.setVisible(true);
            EditButton.setVisible(true);
        }
    }
    public void ShowData(String query){
        ListArray listArray=new ListArray();
        ArrayList<DataVoter> list = new ArrayList<>();
        list = listArray.getListDataVoter(query);
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        model.setRowCount(0);
        Object[] row=new Object[4];
        for(int i=0;i<list.size();i++){
            row[0]=list.get(i).getNim();
            row[1]=list.get(i).getNama();
            row[2]=list.get(i).getProdi();
            row[3]=list.get(i).getKeterangan();
            model.addRow(row);
        }
        jLabel2.setText("Data : "+model.getRowCount());
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
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        AddButton = new javax.swing.JButton();
        EditButton = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Panitia");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconVoter/SEARCH TEXT.png"))); // NOI18N

        jTextField1.setBackground(new java.awt.Color(153, 153, 153));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconVoter/search button.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "NIM", "Nama", "Prodi", "Vote"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        AddButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconVoter/add button.png"))); // NOI18N
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });

        EditButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconVoter/editbutton.png"))); // NOI18N
        EditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditButtonActionPerformed(evt);
            }
        });

        DeleteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconVoter/delete button.png"))); // NOI18N
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Agency FB", 0, 20)); // NOI18N
        jLabel2.setText("jLabel2");

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconVoter/generate.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconVoter/filter text.png"))); // NOI18N

        jComboBox1.setFont(new java.awt.Font("Agency FB", 0, 20)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ALL", "BELUM VOTE", "SUDAH VOTE" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel2)
                        .addGap(38, 38, 38)
                        .addComponent(AddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EditButton, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(47, 47, 47))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 369, Short.MAX_VALUE)
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(DeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(EditButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String search=jTextField1.getText();
        int keterangan=-1;
        if(jComboBox1.getSelectedIndex()==0){
            ShowData("SELECT * FROM mahasiswa where NIM like '%"+search+"%' or Nama like '%"+search+"%' or kd_prodi='"+search+"'");
        }else if(jComboBox1.getSelectedIndex()==1){
            ShowData("SELECT * FROM mahasiswa where (NIM like '%"+search+"%' or Nama like '%"+search+"%' or kd_prodi='"+search+"') and keterangan=0");
        }else{
            ShowData("SELECT * FROM mahasiswa where (NIM like '%"+search+"%' or Nama like '%"+search+"%' or kd_prodi='"+search+"' ) and keterangan=1");
        }
    }//GEN-LAST:event_jButton2ActionPerformed
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        i=jTable1.getSelectedRow();
        if(i>=0){
            String username=jTable1.getValueAt(i, 0).toString();
            boolean keterangan=(boolean) jTable1.getValueAt(i, 3);
            String password;
            boolean change=false;
            if(!keterangan){
                DatabaseConnection datacon = new DatabaseConnection();
                String chars = "abcdefghijklmnopqrstuvwxyz"
                            +"ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                            +"0123456789";
                Random rnd = new Random();
                long length=8;
                password = new Random().ints(length, 0, chars.length()).mapToObj(i -> "" + chars.charAt(i)).collect(Collectors.joining());
                password = new Security().encrypt(password);
                Connection con=datacon.getConnection();
                Statement st;
                ResultSet rs;
                try{
                    st=con.createStatement();
                    rs=st.executeQuery("SELECT * FROM loginvoter");
                    while(rs.next()&&!change){
                        if(rs.getString("username").equals(username)){
                            if(st.executeUpdate("UPDATE `loginvoter` SET `password`='"+password+"' WHERE username='"+username+"'")==1){
                                JOptionPane.showMessageDialog(this, "Sukses!");
                                change=true;
                            }else{
                                JOptionPane.showMessageDialog(this, "Error!");
                            }

                        }
                    }
                    if(!change){
                        if(st.executeUpdate("INSERT INTO `loginvoter`(`username`, `password`) VALUES ('"+username+"','"+password+"')")==1){
                            JOptionPane.showMessageDialog(this, "Sukses!");
                        }
                    }
                }catch(SQLException ex){
                    ex.printStackTrace();
                }
                password = new Security().decrypt(password);
                JOptionPane.showMessageDialog(this, "Username: "+username+"\nPassword: "+password);
            }else{
                JOptionPane.showMessageDialog(this, "User ini sudah vote!");
            }
        }else{
            JOptionPane.showMessageDialog(this, "NO DATA SELECTED!");
        }
// TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        System.out.println(i);
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
        i=jTable1.getSelectedRow();
        editVoter = new EditVoter('s',this);
        editVoter.setAlwaysOnTop(true);
        editVoter.setVisible(true);
        editVoter.setLocationRelativeTo(this);
        this.setEnabled(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_AddButtonActionPerformed

    private void EditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditButtonActionPerformed
        i=jTable1.getSelectedRow();
        if(i>=0){
            String NIM=jTable1.getValueAt(i, 0).toString();
            String Nama=(String) jTable1.getValueAt(i, 1);
            String kd_prodi=(String) jTable1.getValueAt(i, 2);
            editVoter = new EditVoter('u', NIM, Nama, kd_prodi, this);
            editVoter.setAlwaysOnTop(true);
            editVoter.setVisible(true);
            editVoter.setLocationRelativeTo(this);
            
        }else{
            JOptionPane.showMessageDialog(this, "Select Data From Table!");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_EditButtonActionPerformed

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        i=jTable1.getSelectedRow();
        String id=jTable1.getValueAt(i, 0).toString();
        String query = "DELETE FROM mahasiswa where NIM='"+id+"'";
        int choice=JOptionPane.showConfirmDialog(this, "Ingin menghapus data mahasiswa dengan NIM:"+id+" ?","Delete Confirmation",JOptionPane.YES_NO_OPTION);
        if(choice==JOptionPane.YES_OPTION){
            ListArray listArray = new ListArray();
            ArrayList<DataVoter> list =listArray.getListDataVoter("SELECT * FROM mahasiswa");
            vote_who=list.get(i).getVoteWho();
            System.out.println(vote_who);
            editData(query,true,id);
            ShowData("SELECT * FROM mahasiswa");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteButtonActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        if(privilege=='a'){
            dispose();
            adminPanel.setEnabled(true);
        }else if(privilege=='p'){
            dispose();
            new LoginForm().setVisible(true);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        if(jComboBox1.getSelectedIndex()==0){
            ShowData("SELECT * FROM mahasiswa");
        }else if(jComboBox1.getSelectedIndex()==1){
            ShowData("SELECT * FROM mahasiswa where keterangan=0");
        }else{
            ShowData("SELECT * FROM mahasiswa where keterangan=1");
        }
        System.out.println("masuk");
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed
    void editData(String query,boolean show,String id){
        Connection con = datacon.getConnection();
        Statement st = null;
        try{
            st=con.createStatement();
            if(st.executeUpdate(query)==1){
                if(show){
                    if(vote_who!=null){
                        System.out.println(vote_who);
                        editData("UPDATE calon set dipilih=dipilih-1 WHERE NIM='"+vote_who+"'", false, id);
                    }
                    JOptionPane.showMessageDialog(this, "Data Deleted!");
                     
                }
            }
            }catch(SQLException e){
                e.printStackTrace();
                editData("DELETE FROM loginvoter where username='"+id+"'", false,id);
                editData(query, true, id);
            }
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
            java.util.logging.Logger.getLogger(Voter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Voter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Voter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Voter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Voter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JButton EditButton;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
