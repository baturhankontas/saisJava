
package GUI;

import Sources.Course;
import Sources.Course2Admin;
import Sources.Student;
import Sources.User;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class StudentPage extends javax.swing.JFrame {
    
    ArrayList<User> kullaniciListesi;
    ArrayList<Course> dersListesi;
    Student gecerliOgrenci;
    ArrayList<Course2Admin>alinacakDersler;

    /**
     * Creates new form StudentPage
     */
    public StudentPage(ArrayList<User> kullaniciListesi, ArrayList<Course> dersListesi,Student gecerliOgrenci, ArrayList<Course2Admin>alinacakDersler) {
        this.kullaniciListesi = kullaniciListesi;
        this.dersListesi = dersListesi;
        this.gecerliOgrenci = gecerliOgrenci;
        this.alinacakDersler = alinacakDersler;
    
        initComponents();
        setVisible(true);
        
        for (int sayac = 0; sayac < gecerliOgrenci.getDersler().size(); sayac++) { //alinabilecek dersleri ekle
            cmBoxStudentDerslerim.addItem(gecerliOgrenci.getDersler().get(sayac).getName());
        }
        for (int sayac = 0; sayac < dersListesi.size(); sayac++) {
            Course c = dersListesi.get(sayac);
            if (!gecerliOgrenci.dersAlinmisMi(c) && c.isStatus()) {
                cmBoxStudentAlinacakDersler.addItem(c.getName());
            }
        }
        if (gecerliOgrenci.getYoneticiMesaji() == null) {
            lblStudentYoneticiMesaji.setText("");
        }
        else
        {
            lblStudentYoneticiMesaji.setText(gecerliOgrenci.getYoneticiMesaji());
        }
    }

    private StudentPage() {
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

        lblStudentDerslerim = new javax.swing.JLabel();
        cmBoxStudentDerslerim = new javax.swing.JComboBox<>();
        btnStudentCikar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cmBoxStudentAlinacakDersler = new javax.swing.JComboBox<>();
        btnStudentEkle = new javax.swing.JButton();
        btnStudentOturumuKapat = new javax.swing.JButton();
        lblStudentYoneticiMesaji = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblStudentDerslerim.setText("My Courses:");

        btnStudentCikar.setText("Drop Course");
        btnStudentCikar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStudentCikarActionPerformed(evt);
            }
        });

        jLabel1.setText("Enrollable courses:");

        btnStudentEkle.setText("Enroll");
        btnStudentEkle.setActionCommand("Add Course");
        btnStudentEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStudentEkleActionPerformed(evt);
            }
        });

        btnStudentOturumuKapat.setText("Logout");
        btnStudentOturumuKapat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStudentOturumuKapatActionPerformed(evt);
            }
        });

        lblStudentYoneticiMesaji.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnStudentOturumuKapat)
                .addGap(43, 43, 43))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblStudentDerslerim, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmBoxStudentDerslerim, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmBoxStudentAlinacakDersler, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnStudentCikar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(lblStudentYoneticiMesaji))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnStudentEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(btnStudentOturumuKapat)
                .addGap(28, 28, 28)
                .addComponent(lblStudentYoneticiMesaji)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(lblStudentDerslerim)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmBoxStudentDerslerim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnStudentCikar)
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmBoxStudentAlinacakDersler, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnStudentEkle)
                .addGap(59, 59, 59))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnStudentCikarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStudentCikarActionPerformed
        int dersIndeksi = cmBoxStudentDerslerim.getSelectedIndex();
        gecerliOgrenci.dersCikar(dersIndeksi);
        cmBoxStudentDerslerim.removeAllItems();
        for (int sayac = 0; sayac < gecerliOgrenci.getDersler().size(); sayac++) {
            cmBoxStudentDerslerim.addItem(gecerliOgrenci.getDersler().get(sayac).getName());
        }
        cmBoxStudentAlinacakDersler.removeAllItems();
        for (int sayac = 0; sayac < dersListesi.size(); sayac++) {
            Course c = dersListesi.get(sayac);
            if (!gecerliOgrenci.dersAlinmisMi(c) && c.isStatus()) {
                cmBoxStudentAlinacakDersler.addItem(c.getName());
            }
        }
        JOptionPane.showMessageDialog(null, "Course Dropped");
    }//GEN-LAST:event_btnStudentCikarActionPerformed

    private void btnStudentEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStudentEkleActionPerformed
        String alinacakDers = cmBoxStudentAlinacakDersler.getSelectedItem().toString();
        for (int sayac = 0; sayac < dersListesi.size(); sayac++) {
            Course c = dersListesi.get(sayac);
            if (c.getName().equals(alinacakDers)) {
                boolean bulunduMu = false;
                for (int sayac2 = 0; sayac2 < alinacakDersler.size(); sayac2++) {
                    Course2Admin c2 = alinacakDersler.get(sayac2);
                    if (c2.getOgrenci().getTC().equals(gecerliOgrenci.getTC())) { //ogrenci daha once dersalacak listesine eklendiyse
                        bulunduMu = true;
                        c2.dersEkle(c);
                        break;
                    }
                }
                if (!bulunduMu) {
                    Course2Admin yeniKayit = new Course2Admin(gecerliOgrenci);
                    yeniKayit.dersEkle(c);
                    alinacakDersler.add(yeniKayit);
                }
                break;
            }
        }
        cmBoxStudentAlinacakDersler.removeAllItems();
        for (int sayac = 0; sayac < dersListesi.size(); sayac++) {
            Course c = dersListesi.get(sayac);
            if (!gecerliOgrenci.dersAlinmisMi(c) && c.isStatus()) { //dersi normalde alabilecekse
                boolean bulunduMu = false;
                for (int sayac2 = 0; sayac2 < alinacakDersler.size(); sayac2++) { 
                    Course2Admin c2 = alinacakDersler.get(sayac2);
                    if (c2.getOgrenci().getTC().equals(gecerliOgrenci.getTC())) { //alinacak listesinde ogrenci varsa
                        for (int sayac3 = 0; sayac3 < c2.getDersler().size(); sayac3++) {
                            Course c3 = c2.getDersler().get(sayac3);
                            if (c3.getCode().equals(c.getCode())) { //ders de varsa 
                                bulunduMu = true;
                                break;
                            }
                        }
                        break;
                    }
                }
                if (!bulunduMu) {
                    cmBoxStudentAlinacakDersler.addItem(c.getName());
                }
            }
        }
        JOptionPane.showMessageDialog(null, "Course added.");
    }//GEN-LAST:event_btnStudentEkleActionPerformed

    private void btnStudentOturumuKapatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStudentOturumuKapatActionPerformed
        GirisEkrani g = new GirisEkrani(kullaniciListesi, dersListesi,alinacakDersler);
        gecerliOgrenci.setYoneticiMesaji(null);
        dispose();
    }//GEN-LAST:event_btnStudentOturumuKapatActionPerformed

   
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
            java.util.logging.Logger.getLogger(StudentPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnStudentCikar;
    private javax.swing.JButton btnStudentEkle;
    private javax.swing.JButton btnStudentOturumuKapat;
    private javax.swing.JComboBox<String> cmBoxStudentAlinacakDersler;
    private javax.swing.JComboBox<String> cmBoxStudentDerslerim;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblStudentDerslerim;
    private javax.swing.JLabel lblStudentYoneticiMesaji;
    // End of variables declaration//GEN-END:variables
}
