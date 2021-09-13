
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class AnalyzeFrame extends javax.swing.JFrame {

    /**
     * Creates new form AnalyzeFrame
     */
    public AnalyzeFrame() {
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

        jPanel1 = new javax.swing.JPanel();
        LProblemName = new javax.swing.JLabel();
        StudentsNum = new javax.swing.JLabel();
        Subs = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Conflict = new javax.swing.JLabel();
        Exams = new javax.swing.JLabel();
        StudsValue = new javax.swing.JLabel();
        SubsValue = new javax.swing.JLabel();
        PeriodsValue = new javax.swing.JLabel();
        ConflictValue = new javax.swing.JLabel();
        ExamsValue = new javax.swing.JLabel();
        AnalyzeButton = new javax.swing.JButton();
        Backbutt = new javax.swing.JButton();
        Solbutt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LProblemName.setText("Όνομα προβήματος");

        StudentsNum.setText("Αριθμός φοιτητών");

        Subs.setText("Εγγραφές");

        jLabel1.setText("Περίοδοι");

        Conflict.setText("Πυκνότητα συγκρούσεων");

        Exams.setText("Εξετάσεις");

        StudsValue.setText("StudsValue");
        StudsValue.setVisible(false);

        SubsValue.setText("SubsValue");
        SubsValue.setVisible(false);

        PeriodsValue.setText("PeriodsValue");
        PeriodsValue.setVisible(false);

        ConflictValue.setText("ConflictValue");
        ConflictValue.setVisible(false);

        ExamsValue.setText("ExamsValue");
        ExamsValue.setVisible(false);

        AnalyzeButton.setText("Ανάλυση");
        AnalyzeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AnalyzeButtonMouseClicked(evt);
            }
        });
        AnalyzeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnalyzeButtonActionPerformed(evt);
            }
        });

        Backbutt.setText("Πίσω");
        Backbutt.setVisible(false);
        Backbutt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackbuttMouseClicked(evt);
            }
        });

        Solbutt.setText("Φόρτωση λύσης");
        Solbutt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SolbuttMouseClicked(evt);
            }
        });
        Solbutt.setVisible(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(StudentsNum)
                            .addComponent(Subs)
                            .addComponent(jLabel1)
                            .addComponent(Conflict)
                            .addComponent(Exams)
                            .addComponent(Backbutt))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ExamsValue)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                                .addComponent(AnalyzeButton))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ConflictValue)
                                    .addComponent(PeriodsValue)
                                    .addComponent(SubsValue)
                                    .addComponent(StudsValue))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(LProblemName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Solbutt)))
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LProblemName)
                    .addComponent(Backbutt))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(StudentsNum)
                    .addComponent(StudsValue))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Subs)
                    .addComponent(SubsValue))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(PeriodsValue))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Conflict)
                    .addComponent(ConflictValue))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Exams)
                    .addComponent(ExamsValue)
                    .addComponent(AnalyzeButton))
                .addGap(28, 28, 28)
                .addComponent(Solbutt)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AnalyzeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AnalyzeButtonMouseClicked
         
        
    }//GEN-LAST:event_AnalyzeButtonMouseClicked

    private void BackbuttMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackbuttMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BackbuttMouseClicked

    private void SolbuttMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SolbuttMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_SolbuttMouseClicked

    private void AnalyzeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnalyzeButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AnalyzeButtonActionPerformed

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
            java.util.logging.Logger.getLogger(AnalyzeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AnalyzeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AnalyzeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AnalyzeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AnalyzeFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton AnalyzeButton;
    public javax.swing.JButton Backbutt;
    private javax.swing.JLabel Conflict;
    public static javax.swing.JLabel ConflictValue;
    private javax.swing.JLabel Exams;
    public static javax.swing.JLabel ExamsValue;
    public static javax.swing.JLabel LProblemName;
    public static javax.swing.JLabel PeriodsValue;
    public javax.swing.JButton Solbutt;
    private javax.swing.JLabel StudentsNum;
    public static javax.swing.JLabel StudsValue;
    private javax.swing.JLabel Subs;
    public static javax.swing.JLabel SubsValue;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
