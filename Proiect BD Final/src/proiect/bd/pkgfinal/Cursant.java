/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proiect.bd.pkgfinal;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author Jamez-Laptop
 */
public class Cursant extends javax.swing.JPanel {

    /**
     * Creates new form Cursant
     */
    DefaultTableModel model;
    public Cursant() {
        initComponents();
        model=(DefaultTableModel)jTable1.getModel();
        update();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IDCursant", "Nume", "Prenume", "CNP", "Adresa", "DataNasterii", "Sex", "Categorie", "Plata", "DataInscrierii", "Instructor"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 901, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    public void update(){
    try {
            Connection cm = new Connection();
            
            ResultSet rs = cm.exQuery("SELECT * FROM Cursant");
            
            //sterge rez precedent
            while(model.getRowCount()>0){
                model.removeRow(0);
            }
            
            //ascund prima coloana
            TableColumn id=jTable1.getColumn("IDCursant");
            id.setMaxWidth(0);
            id.setMinWidth(0);
            id.setPreferredWidth(0);
            
            //populez tabelul
            while(rs.next()) {
                ResultSet ninst = cm.exQuery("SELECT * FROM Instructor WHERE IDInstructor="+rs.getInt("IDInstructor"));
                ninst.next();
                model.insertRow(model.getRowCount(),new Object[]{
                rs.getString("IDCursant"),rs.getString("Nume"),rs.getString("Prenume"),rs.getString("CNP"),
                    rs.getString("Adresa"),rs.getString("DataNasterii"),
                    rs.getString("Sex"),rs.getString("Categorie"),rs.getString("Plata"),rs.getString("DataInscrierii"),ninst.getString("Nume")});
            
                cm.closeChannel(ninst);
            }
         
            cm.closeChannel(rs);
        } catch (SQLException ex) {
           Logger.getLogger(ProiectBDFinal.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    }
    public int getId(){
        return Integer.parseInt((String) model.getValueAt(jTable1.getSelectedRow(), 0));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
