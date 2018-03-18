/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author marcello
 */
public class AreaDiagonal extends javax.swing.JFrame {

    /**
     * Creates new form AreaDiagonal
     */
    public AreaDiagonal() {
        initComponents();
        this.setLocationRelativeTo(null);
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
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Resultado = new javax.swing.JTextArea();
        jSeparator1 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        bas = new javax.swing.JTextField();
        alt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Xperia", 1, 11)); // NOI18N
        jLabel1.setText("GUIA 1: Operacion 1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 8, -1, -1));

        jLabel2.setText("Calcular Area y Diagonal de una figura de 4 lados. Ingresar tamaño de los lados:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 47, -1, -1));

        jLabel3.setText("Base:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 95, -1, -1));

        jLabel4.setText("Altura:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 95, -1, -1));

        jButton1.setFont(new java.awt.Font("Hall Fetica Wide", 0, 11)); // NOI18N
        jButton1.setText("Calcular");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, -1, -1));

        Resultado.setColumns(20);
        Resultado.setRows(5);
        jScrollPane1.setViewportView(Resultado);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 162, 326, -1));

        jSeparator1.setBackground(new java.awt.Color(255, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 26, 450, 10));

        jButton2.setFont(new java.awt.Font("Hall Fetica Wide", 0, 11)); // NOI18N
        jButton2.setText("Regresar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 269, -1, -1));

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                basActionPerformed(evt);
            }
        });
        bas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                basKeyTyped(evt);
            }
        });
        jPanel1.add(bas, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 92, 82, -1));

        alt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altActionPerformed(evt);
            }
        });
        alt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                altKeyTyped(evt);
            }
        });
        jPanel1.add(alt, new org.netbeans.lib.awtextra.AbsoluteConstraints(291, 92, 82, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 310));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        OperacionesGuia1 v= new OperacionesGuia1();
        this.setVisible(false);
        v.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void basKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_basKeyTyped
        // TODO add your handling code here:
        char validar = evt.getKeyChar();
        if ((validar< '0' || validar> '9') && (validar< '.'|| validar> '.')){
            evt.consume();
        }
    }//GEN-LAST:event_basKeyTyped

    private void basActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_basActionPerformed
        // TODO add your handling code here:
        evt.setSource((char)KeyEvent.VK_CLEAR);
        alt.requestFocus();
    }//GEN-LAST:event_basActionPerformed

    private void altActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_altActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_altActionPerformed

    private void altKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_altKeyTyped
        // TODO add your handling code here:
        char valida = evt.getKeyChar();
        if ((valida< '0' || valida> '9') && (valida< '.'|| valida> '.')){
            evt.consume();
        }
    }//GEN-LAST:event_altKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        double altura, base, area, diagonal;
        if (bas.getText().equals("")||alt.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Ingresar base y altura");
        }
       else{
            altura=Double.parseDouble(alt.getText());
            base=Double.parseDouble(bas.getText());
            area=base*altura;
            diagonal=Math.sqrt((base*base)+(altura*altura));
            Resultado.setText("Resultado Area:"+area+"\n"+"Resultado Diagonal:"+diagonal); 
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(AreaDiagonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AreaDiagonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AreaDiagonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AreaDiagonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AreaDiagonal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Resultado;
    private javax.swing.JTextField alt;
    private javax.swing.JTextField bas;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
