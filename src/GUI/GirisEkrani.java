
package GUI;

import Sources.Admin;
import Sources.Course;
import Sources.Course2Admin;
import Sources.Student;
import Sources.Teacher;
import Sources.User;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class GirisEkrani extends javax.swing.JFrame {
    
    ArrayList<User> kullaniciListesi;
    ArrayList<Course> dersListesi;
    ArrayList<Course2Admin>alinacakDersler;

    /**
     * Creates new form GirisEkrani
     */
    public GirisEkrani( ArrayList<User> kullaniciListesi, ArrayList<Course> dersListesi,ArrayList<Course2Admin>alinacakDersler) {
        this.kullaniciListesi = kullaniciListesi;
        this.dersListesi = dersListesi;
        this.alinacakDersler = alinacakDersler;
        setVisible(true);
        initComponents();
    }

    private GirisEkrani() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblGirisID = new javax.swing.JLabel();
        lblGirisSifre = new javax.swing.JLabel();
        txfieldGirisID = new javax.swing.JTextField();
        txfieldGirisSifre = new javax.swing.JTextField();
        btnGirisGiris = new javax.swing.JButton();
        lblGirisSifremiUnuttum = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblGirisID.setText("User ID:");

        lblGirisSifre.setText("Password:");

        txfieldGirisID.setName(""); // NOI18N

        txfieldGirisSifre.setName(""); // NOI18N

        btnGirisGiris.setText("Login");
        btnGirisGiris.setName(""); // NOI18N
        btnGirisGiris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGirisGirisActionPerformed(evt);
            }
        });

        lblGirisSifremiUnuttum.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblGirisSifremiUnuttum.setForeground(new java.awt.Color(0, 0, 204));
        lblGirisSifremiUnuttum.setText("Forget my password");
        lblGirisSifremiUnuttum.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblGirisSifremiUnuttumMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 153));
        jLabel1.setText("Register");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblGirisID)
                            .addComponent(lblGirisSifre))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txfieldGirisID)
                            .addComponent(txfieldGirisSifre, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(118, 118, 118))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(btnGirisGiris, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(lblGirisSifremiUnuttum)))
                        .addGap(76, 76, 76))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGirisID)
                    .addComponent(txfieldGirisID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGirisSifre)
                    .addComponent(txfieldGirisSifre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnGirisGiris)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGirisSifremiUnuttum)
                    .addComponent(jLabel1))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        lblGirisID.getAccessibleContext().setAccessibleName("lblGirisID");
        lblGirisSifre.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGirisGirisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGirisGirisActionPerformed
        boolean bulunduMu = false;
        User gecerliKullanici = null;
        for (int sayac = 0; sayac < kullaniciListesi.size(); sayac++) {
            Object o = kullaniciListesi.get(sayac);
            if ( o.getClass().equals(Student.class))
            {
                Student s = (Student)o;
                if (s.getID().equals(txfieldGirisID.getText())  &&  s.getPassword().equals(txfieldGirisSifre.getText())) {
                    bulunduMu = true;
                    gecerliKullanici = s;
                    break;
                }
            }
            else if (o.getClass().equals(Teacher.class))
            {
                Teacher t = (Teacher) o;
                if (t.getID().equals(txfieldGirisID.getText())  &&  t.getPassword().equals(txfieldGirisSifre.getText())) {
                    bulunduMu = true;
                    gecerliKullanici = t;
                    break;
                }
            }
            else if (o.getClass().equals(Admin.class))
            {
                Admin a = (Admin)o;
                if (a.getID().equals(txfieldGirisID.getText())  &&  a.getPassword().equals(txfieldGirisSifre.getText())) {
                    bulunduMu = true;
                    gecerliKullanici = a;
                    break;
                }
            }
        }
        if (bulunduMu) {
            if(gecerliKullanici.getClass().equals(Student.class)) // student sayfasini ac
            {
                StudentPage sp = new StudentPage(kullaniciListesi,dersListesi, (Student) gecerliKullanici,alinacakDersler);
                dispose();
            }
            else if(gecerliKullanici.getClass().equals(Teacher.class)) //Teacher sayfasini ac
            {
                InstructorPage ip = new InstructorPage(kullaniciListesi,dersListesi, (Teacher) gecerliKullanici,alinacakDersler);
                dispose();
            }
            else // admin sayfasini ac
            {
                AdminPage ap = new AdminPage(kullaniciListesi,dersListesi, (Admin) gecerliKullanici,alinacakDersler);
                dispose();
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Access Denied");
        }
    }//GEN-LAST:event_btnGirisGirisActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        KayitSayfasi k = new KayitSayfasi(kullaniciListesi, dersListesi, alinacakDersler);
        dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void lblGirisSifremiUnuttumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGirisSifremiUnuttumMouseClicked
        SifremiUnuttumSayfasi s = new SifremiUnuttumSayfasi(kullaniciListesi, dersListesi, alinacakDersler);
        dispose();
    }//GEN-LAST:event_lblGirisSifremiUnuttumMouseClicked

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
            java.util.logging.Logger.getLogger(GirisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GirisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GirisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GirisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GirisEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGirisGiris;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblGirisID;
    private javax.swing.JLabel lblGirisSifre;
    private javax.swing.JLabel lblGirisSifremiUnuttum;
    private javax.swing.JTextField txfieldGirisID;
    private javax.swing.JTextField txfieldGirisSifre;
    // End of variables declaration//GEN-END:variables
}
