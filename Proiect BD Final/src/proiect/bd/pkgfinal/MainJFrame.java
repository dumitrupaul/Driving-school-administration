/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proiect.bd.pkgfinal;

/**
 *
 * @author Jamez-Laptop
 */

import java.awt.Component;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    
    //folosit pentru afisarea tabelelor
    javax.swing.GroupLayout lay = new javax.swing.GroupLayout(getContentPane());
    
    public MainJFrame() {
        initComponents();
    }
    
    public Cursant cursant = new Cursant();
    public Interogari interog = new Interogari();
    public MasinaVizualizare masina = new MasinaVizualizare();
    public Instructor instructor = new Instructor();
    public Examene examen = new Examene();
    Component lastComponent = null;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pozamasina = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Cursanti = new javax.swing.JMenu();
        AdaugaCursant = new javax.swing.JMenuItem();
        VizCursant = new javax.swing.JMenuItem();
        Masini = new javax.swing.JMenu();
        AdaugaMasini = new javax.swing.JMenuItem();
        VizMasini = new javax.swing.JMenuItem();
        stergereMasina = new javax.swing.JMenuItem();
        Instructori = new javax.swing.JMenu();
        AdaugaInstructor = new javax.swing.JMenuItem();
        vizInstructor = new javax.swing.JMenuItem();
        stergeInst = new javax.swing.JMenuItem();
        Examene = new javax.swing.JMenu();
        Interogari = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pozamasina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proiect/bd/pkgfinal/unnamed.png"))); // NOI18N
        pozamasina.setText("jLabel1");
        pozamasina.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pozamasinaMouseClicked(evt);
            }
        });

        Cursanti.setText("Cursanti");

        AdaugaCursant.setText("Adauga");
        AdaugaCursant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdaugaCursantActionPerformed(evt);
            }
        });
        Cursanti.add(AdaugaCursant);

        VizCursant.setText("Vizualizare");
        VizCursant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VizCursantActionPerformed(evt);
            }
        });
        Cursanti.add(VizCursant);

        jMenuBar1.add(Cursanti);

        Masini.setText("Masini");

        AdaugaMasini.setText("Adauga");
        AdaugaMasini.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdaugaMasiniActionPerformed(evt);
            }
        });
        Masini.add(AdaugaMasini);

        VizMasini.setText("Vizualizare");
        VizMasini.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VizMasiniActionPerformed(evt);
            }
        });
        Masini.add(VizMasini);

        stergereMasina.setText("Sterge inregistrare");
        stergereMasina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stergereMasinaActionPerformed(evt);
            }
        });
        Masini.add(stergereMasina);

        jMenuBar1.add(Masini);

        Instructori.setText("Instructori");

        AdaugaInstructor.setText("Adauga");
        AdaugaInstructor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdaugaInstructorActionPerformed(evt);
            }
        });
        Instructori.add(AdaugaInstructor);

        vizInstructor.setText("Vizualizare");
        vizInstructor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vizInstructorActionPerformed(evt);
            }
        });
        Instructori.add(vizInstructor);

        stergeInst.setText("Sterge inregistrare");
        stergeInst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stergeInstActionPerformed(evt);
            }
        });
        Instructori.add(stergeInst);

        jMenuBar1.add(Instructori);

        Examene.setBackground(new java.awt.Color(204, 204, 255));
        Examene.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Examene.setForeground(new java.awt.Color(255, 102, 0));
        Examene.setText("Examene");
        Examene.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExameneMouseClicked(evt);
            }
        });
        jMenuBar1.add(Examene);

        Interogari.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Interogari.setForeground(new java.awt.Color(255, 153, 0));
        Interogari.setText("Interogari");
        Interogari.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InterogariMouseClicked(evt);
            }
        });
        jMenuBar1.add(Interogari);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(402, Short.MAX_VALUE)
                .addComponent(pozamasina, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(399, 399, 399))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addComponent(pozamasina)
                .addGap(44, 44, 44))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AdaugaCursantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdaugaCursantActionPerformed
        //adaug cursant
        JFrame aCursant = new AdaugaCursant();
        aCursant.setVisible(true);
        aCursant.setTitle("Adauga cursant");
        aCursant.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_AdaugaCursantActionPerformed

    private void VizCursantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VizCursantActionPerformed
        //vizualizarea cursantului
        cursant.update();//update la tabel odata cu vizualizarea
        
        getContentPane().setLayout(lay);
        if(lastComponent!=null){
        lay.replace(lastComponent,cursant);
        }
        lastComponent=cursant;
        lay.setHorizontalGroup(
            lay.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cursant, javax.swing.GroupLayout.DEFAULT_SIZE,200, Short.MAX_VALUE)
        );
        lay.setVerticalGroup(
            lay.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cursant, javax.swing.GroupLayout.DEFAULT_SIZE,200, Short.MAX_VALUE)
        );
        pozamasina.setVisible(false);
    }//GEN-LAST:event_VizCursantActionPerformed

    private void AdaugaMasiniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdaugaMasiniActionPerformed
        //adauga masina
        JFrame adaugaMasina=new AdaugaMasina();
        adaugaMasina.setVisible(true);
        adaugaMasina.setTitle("Adauga masina");
        adaugaMasina.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_AdaugaMasiniActionPerformed

    private void VizMasiniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VizMasiniActionPerformed
        //vizualizarea masinilor
        masina.update();//update la tabel odata cu vizualizarea
        
        getContentPane().setLayout(lay);
        if(lastComponent!=null){
        lay.replace(lastComponent,masina);
        }
        lastComponent=masina;
        lay.setHorizontalGroup(
            lay.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(masina, javax.swing.GroupLayout.DEFAULT_SIZE,200, Short.MAX_VALUE)
        );
        lay.setVerticalGroup(
            lay.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(masina, javax.swing.GroupLayout.DEFAULT_SIZE,200, Short.MAX_VALUE)
        );
        pozamasina.setVisible(false);
    }//GEN-LAST:event_VizMasiniActionPerformed

    private void stergereMasinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stergereMasinaActionPerformed
        Connection cm = new Connection();
        try {
            cm.execute("DELETE from Masina where IDMasina=" + masina.getId());
        } catch (SQLException ex) {
            Logger.getLogger(ProiectBDFinal.class.getName()).log(Level.SEVERE, null, ex);
        }
        masina.update();//update la tabel
    }//GEN-LAST:event_stergereMasinaActionPerformed

    private void AdaugaInstructorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdaugaInstructorActionPerformed
        //adaugare instructor
        JFrame aInstructor = new AdaugaInstructor();
        aInstructor.setVisible(true);
        aInstructor.setTitle("Adauga instructor");
        aInstructor.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_AdaugaInstructorActionPerformed

    private void vizInstructorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vizInstructorActionPerformed
        //vizualizare instructor
        instructor.update();//update la tabel
        
        getContentPane().setLayout(lay);
        
        if(lastComponent != null){
            lay.replace(lastComponent,instructor);
        }
        lastComponent = instructor;
        
        lay.setHorizontalGroup(
            lay.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(instructor, javax.swing.GroupLayout.DEFAULT_SIZE,200, Short.MAX_VALUE)
        );
        lay.setVerticalGroup(
            lay.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(instructor, javax.swing.GroupLayout.DEFAULT_SIZE,200, Short.MAX_VALUE)
        );
        pozamasina.setVisible(false);
    }//GEN-LAST:event_vizInstructorActionPerformed

    private void stergeInstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stergeInstActionPerformed

        Connection cm = new Connection();
        try {
            cm.execute("DELETE from Instructor where IDInstructor=" + instructor.getId());
        } catch (SQLException ex) {
            Logger.getLogger(ProiectBDFinal.class.getName()).log(Level.SEVERE, null, ex);
        }
        instructor.update();
    }//GEN-LAST:event_stergeInstActionPerformed

    private void ExameneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExameneMouseClicked
        getContentPane().setLayout(lay);
        
        if(lastComponent != null){
            lay.replace(lastComponent,examen);
        }
        lastComponent = examen;
        
        lay.setHorizontalGroup(
            lay.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(examen, javax.swing.GroupLayout.DEFAULT_SIZE,200, Short.MAX_VALUE)
        );
        lay.setVerticalGroup(
            lay.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(examen, javax.swing.GroupLayout.DEFAULT_SIZE,200, Short.MAX_VALUE)
        );
        pozamasina.setVisible(false);
    }//GEN-LAST:event_ExameneMouseClicked

    private void InterogariMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InterogariMouseClicked
        getContentPane().setLayout(lay);
        
        if(lastComponent != null){
            lay.replace(lastComponent,interog);
        }
        lastComponent = interog;
        
        lay.setHorizontalGroup(
            lay.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(interog, javax.swing.GroupLayout.DEFAULT_SIZE,200, Short.MAX_VALUE)
        );
        lay.setVerticalGroup(
            lay.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(interog, javax.swing.GroupLayout.DEFAULT_SIZE,200, Short.MAX_VALUE)
        );
        pozamasina.setVisible(false);
    }//GEN-LAST:event_InterogariMouseClicked

    private void pozamasinaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pozamasinaMouseClicked
        pozamasina.setVisible(false);
    }//GEN-LAST:event_pozamasinaMouseClicked

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AdaugaCursant;
    private javax.swing.JMenuItem AdaugaInstructor;
    private javax.swing.JMenuItem AdaugaMasini;
    private javax.swing.JMenu Cursanti;
    private javax.swing.JMenu Examene;
    private javax.swing.JMenu Instructori;
    private javax.swing.JMenu Interogari;
    private javax.swing.JMenu Masini;
    private javax.swing.JMenuItem VizCursant;
    private javax.swing.JMenuItem VizMasini;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel pozamasina;
    private javax.swing.JMenuItem stergeInst;
    private javax.swing.JMenuItem stergereMasina;
    private javax.swing.JMenuItem vizInstructor;
    // End of variables declaration//GEN-END:variables
}
