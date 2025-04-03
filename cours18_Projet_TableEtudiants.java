/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfacegraphiques;

import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author marwa
 */
public class cours18_Projet_TableEtudiants extends javax.swing.JFrame {
    private ArrayList<Etudiants> ListEtudiants;
    private DefaultTableModel modele;
    String[] nomColonne={"Numero","Nom","Note 1","Note 2","Note 3","Moyenne"}; //header
    /**
     * Creates new form cours18_Projet_TableEtudiants
     */
    public cours18_Projet_TableEtudiants() {
        initComponents();
        ListEtudiants= new ArrayList<>(); 
        modele= new DefaultTableModel(nomColonne, 0);
        jTable1.setModel(modele);
    }

    private void viderChamps(){
        TextNum.setText("");
        TextNom.setText("");
        TextN1.setText("");
        TextN2.setText("");
        TextN3.setText("");
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TextNom = new javax.swing.JTextField();
        TextN1 = new javax.swing.JTextField();
        TextN2 = new javax.swing.JTextField();
        TextN3 = new javax.swing.JTextField();
        Ajouter = new javax.swing.JButton();
        Modifier = new javax.swing.JButton();
        Supprimer = new javax.swing.JButton();
        Quitter = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        TextNum = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Nom:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 67, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Note 1:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 67, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Note 2:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 67, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Note 3:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 67, -1));
        getContentPane().add(TextNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 280, -1));
        getContentPane().add(TextN1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 280, -1));
        getContentPane().add(TextN2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 280, -1));
        getContentPane().add(TextN3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 280, -1));

        Ajouter.setText("Ajouter");
        Ajouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AjouterActionPerformed(evt);
            }
        });
        getContentPane().add(Ajouter, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 50, 90, -1));

        Modifier.setText("Modifier");
        Modifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModifierActionPerformed(evt);
            }
        });
        getContentPane().add(Modifier, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 90, 90, -1));

        Supprimer.setText("Supprimer");
        Supprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SupprimerActionPerformed(evt);
            }
        });
        getContentPane().add(Supprimer, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 130, 90, -1));

        Quitter.setText("Quitter");
        Quitter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuitterActionPerformed(evt);
            }
        });
        getContentPane().add(Quitter, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 170, 90, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nom", "Note 1", "Note 2", "Note 3", "Moyenne"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

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
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 520, 249));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("N Eleve:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 67, -1));

        TextNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextNumActionPerformed(evt);
            }
        });
        getContentPane().add(TextNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 280, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void QuitterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuitterActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_QuitterActionPerformed

    private void AjouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AjouterActionPerformed
        // TODO add your handling code here:
        if(TextNum.getText().isEmpty() || TextNom.getText().isEmpty() || TextN1.getText().isEmpty() || TextN2.getText().isEmpty() || TextN3.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Remplisez les champs", "Champs Vides", JOptionPane.OK_OPTION);
        }else{
            String nom;
            int num;
            float n1,n2,n3,moy;
            num=Integer.parseInt(TextNum.getText());
            nom= TextNom.getText();
            n1= Float.parseFloat(TextN1.getText());
            n2= Float.parseFloat(TextN2.getText());
            n3= Float.parseFloat(TextN3.getText());
            moy=(n1+n2+n3)/3;
            
            int countEleve=0;
            for(int i=0; i<ListEtudiants.size(); i++){
                if(num == ListEtudiants.get(i).getNum()){
                    countEleve++;
                }
            }
            if(countEleve > 0){
                JOptionPane.showMessageDialog(this, "Les infos sont deja existe", "Duplication infos", JOptionPane.ERROR_MESSAGE);
            }
            else{
                Etudiants e= new Etudiants(nom,num,n1,n2,n3,moy);
                ListEtudiants.add(e);
                modele.insertRow(modele.getRowCount(), new Object[]{num,nom,n1,n2,n3,moy});
                viderChamps();
            }
            
        }
        
                
    }//GEN-LAST:event_AjouterActionPerformed

    private void TextNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextNumActionPerformed

    private void SupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SupprimerActionPerformed
        // TODO add your handling code here:
        int indice= jTable1.getSelectedRow();
        if(indice != -1){
            ListEtudiants.remove(indice);
            modele.removeRow(indice);
            viderChamps();
        }else{
            JOptionPane.showMessageDialog(this, "Selectionner un(e) eleve");
        }
    }//GEN-LAST:event_SupprimerActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        if(evt.getButton()== MouseEvent.BUTTON1){
            int indice = jTable1.getSelectedRow();
            if(indice != -1){
                TextNum.setText(modele.getValueAt(indice, 0).toString());
                TextNom.setText(modele.getValueAt(indice, 1).toString());
                TextN1.setText(modele.getValueAt(indice, 2).toString());
                TextN2.setText(modele.getValueAt(indice, 3).toString());
                TextN3.setText(modele.getValueAt(indice, 4).toString());
            }
        }else if(evt.getButton()== MouseEvent.BUTTON3){
            viderChamps();
            jTable1.clearSelection(); //to remove any selection in table
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void ModifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModifierActionPerformed
        // TODO add your handling code here:
        if(TextNum.getText().isEmpty() || TextNom.getText().isEmpty() || TextN1.getText().isEmpty() || TextN2.getText().isEmpty() || TextN3.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Remplisez les champs", "Champs Vides", JOptionPane.OK_OPTION);
        }else{
            int indice = jTable1.getSelectedRow();
            if(indice != -1){ 
                String nom;
                int num;
                float n1,n2,n3,moy;
                num=Integer.parseInt(TextNum.getText());
                nom= TextNom.getText();
                n1= Float.parseFloat(TextN1.getText());
                n2= Float.parseFloat(TextN2.getText());
                n3= Float.parseFloat(TextN3.getText());
                moy=(n1+n2+n3)/3;
                
                    Etudiants e= ListEtudiants.get(indice); //get the same etudiant from the arraylist that have the same indice as the selected one
                    e.setNum(num);
                    e.setNom(nom);
                    e.setNote1(n1);
                    e.setNote2(n2);
                    e.setNote3(n3);
                    e.setMoyenne(moy);
                
                    modele.setValueAt(num, indice, 0);
                    modele.setValueAt(nom, indice, 1);
                    modele.setValueAt(n1, indice, 2);
                    modele.setValueAt(n2, indice, 3);
                    modele.setValueAt(n3, indice, 4);
                    modele.setValueAt(moy, indice, 5);
                
                
                
            }
        }
    }//GEN-LAST:event_ModifierActionPerformed

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
            java.util.logging.Logger.getLogger(cours18_Projet_TableEtudiants.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cours18_Projet_TableEtudiants.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cours18_Projet_TableEtudiants.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cours18_Projet_TableEtudiants.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cours18_Projet_TableEtudiants().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Ajouter;
    private javax.swing.JButton Modifier;
    private javax.swing.JButton Quitter;
    private javax.swing.JButton Supprimer;
    private javax.swing.JTextField TextN1;
    private javax.swing.JTextField TextN2;
    private javax.swing.JTextField TextN3;
    private javax.swing.JTextField TextNom;
    private javax.swing.JTextField TextNum;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
