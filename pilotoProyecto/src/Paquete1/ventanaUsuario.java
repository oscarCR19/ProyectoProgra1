package Paquete1;

import javax.swing.JOptionPane;
import java.lang.Object;
import Paquete1.SuperUsuario;
public class ventanaUsuario extends javax.swing.JFrame {
////Aqui mostramos los usuarios y contraseñas de los puntos de venta,recepcion y planta
    private String contra0 = "0";
    private String contra1 = "admin1";
    private String contra2 = "admin2";
    private String contra3 = "admin3";
    private String contra4 = "admin4";
    private String contra5 = "admin5";
    private String contra6 = "recep1";

    private String usuario0 = "0";
    private String usuario1 = "Admin1";
    private String usuario2 = "Admin2";
    private String usuario3 = "Admin3";
    private String usuario4 = "Admin4";
    private String usuario5 = "Admin5";
    private String usuario6 = "Recep1";

    public ventanaUsuario() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        labelUsuario = new javax.swing.JLabel();
        introUsuario = new javax.swing.JTextField();
        labelcontraseña = new javax.swing.JLabel();
        introContrasena = new javax.swing.JPasswordField();
        botonEntrarusuario = new javax.swing.JButton();
        labelAcceso = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Admin0=Super usuario.\nAdmin1=Carniceria Puriscal 1.\nAdmin2=Carniceria Puriscal 2.\nAdmin3=Carniceria Ciudad Colón.\nAdmin4=Caniceria Santa Ana.\nAdmin5=Carniceria Escazú.\nRecep1= Recepción Planta.");
        jTextArea1.setEnabled(false);
        jTextArea1.setMinimumSize(new java.awt.Dimension(200, 58));
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 600));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(800, 600));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));

        labelUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelUsuario.setText("Usuario:");

        introUsuario.setFocusAccelerator('\u25cf');
        introUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                introUsuarioActionPerformed(evt);
            }
        });

        labelcontraseña.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelcontraseña.setText("Contraseña:");

        introContrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                introContrasenaActionPerformed(evt);
            }
        });

        botonEntrarusuario.setText("Entrar");
        botonEntrarusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEntrarusuarioActionPerformed(evt);
            }
        });

        labelAcceso.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        labelAcceso.setText("Sistema de inventario carnicerias el chirriche ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 186, Short.MAX_VALUE)
                .addComponent(labelAcceso)
                .addGap(162, 162, 162))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(265, 265, 265)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelcontraseña)
                    .addComponent(labelUsuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(introUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(introContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonEntrarusuario)
                .addGap(346, 346, 346))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(labelAcceso)
                .addGap(67, 67, 67)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelUsuario)
                    .addComponent(introUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelcontraseña)
                    .addComponent(introContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(botonEntrarusuario)
                .addContainerGap(190, Short.MAX_VALUE))
        );

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void introContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_introContrasenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_introContrasenaActionPerformed


    private void botonEntrarusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEntrarusuarioActionPerformed
        SuperUsuario ventana = new SuperUsuario();
        CarniceriaPuriscalUno ventana2= new CarniceriaPuriscalUno();
        CarniceriaPuriscalDos ventana3= new CarniceriaPuriscalDos();
        CarniceriaCiudadColon ventana4=new CarniceriaCiudadColon();
        CarniceriaSantaAna ventana5=new CarniceriaSantaAna();
        CarniceriaEscazu ventana6=new CarniceriaEscazu();
        RecepPlanta ventana7=new RecepPlanta();
        
        String usuario = this.introUsuario.getText();
        String contra = String.valueOf(this.introContrasena.getPassword());
        
        
        if (usuario.equals(this.usuario0) || usuario.equals(this.usuario1) || usuario.equals(this.usuario2)
                || usuario.equals(this.usuario3) || usuario.equals(this.usuario4) || usuario.equals(this.usuario5)
                || usuario.equals(this.usuario6)) {

            if (usuario.equals(this.usuario0)&&contra.equals(this.contra0)) {
                ventana.setVisible(true);
                this.setVisible(false);
            } else if (usuario.equals(this.usuario1)&&contra.equals(this.contra1)) {
                ventana2.setVisible(true);
                this.setVisible(false);
            } 
            else if (usuario.equals(this.usuario2)&&contra.equals(this.contra2)) {
                ventana3.setVisible(true);
                this.setVisible(false);
            } 
            else if (usuario.equals(this.usuario3)&&contra.equals(this.contra3)) {
                ventana4.setVisible(true);
                this.setVisible(false);
            } 
            else if (usuario.equals(this.usuario4)&&contra.equals(this.contra4)) {
                ventana5.setVisible(true);
                this.setVisible(false);
            } 
            else if (usuario.equals(this.usuario5)&&contra.equals(this.contra5)) {
                ventana6.setVisible(true);
                this.setVisible(false);
            } 
            else if (usuario.equals(this.usuario6)&&contra.equals(this.contra6)) {
                ventana7.setVisible(true);
                this.setVisible(false);
            }

        }

        

        
    }//GEN-LAST:event_botonEntrarusuarioActionPerformed

    public String usuarioGlobal(){
        String usuarioGlobal=this.introUsuario.getText();
        return usuarioGlobal;
    
    }

    

    private void introUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_introUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_introUsuarioActionPerformed

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
            java.util.logging.Logger.getLogger(ventanaUsuario.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaUsuario.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaUsuario.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaUsuario.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonEntrarusuario;
    private javax.swing.JPasswordField introContrasena;
    private javax.swing.JTextField introUsuario;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel labelAcceso;
    private javax.swing.JLabel labelUsuario;
    private javax.swing.JLabel labelcontraseña;
    // End of variables declaration//GEN-END:variables
}
