
package VENTANAS;

import java.awt.Color; //importar libreria de colores
import CLASES.ApLogin;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {
   
    
    int xMouse, yMouse; // SE CREAN LAS VARIABLES PARA LOCALIZAR EL MOUSE Y MOVER EL PANEL
    
    public Login() {
        initComponents();
        
        this.setLocationRelativeTo(null); // SE UTILIZA PARA CENTRAR EL PANEL

        // SE OCULTAN LOS TEXTOS DE ADVERTENCIA
        Txt_Asterisco1.setVisible(false);
        Txt_Asterisco2.setVisible(false);
        Txt_CamposObli.setVisible(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Pnl_Principal = new javax.swing.JPanel();
        Txt_Asterisco1 = new javax.swing.JLabel();
        Txt_Asterisco2 = new javax.swing.JLabel();
        Txt_CamposObli = new javax.swing.JLabel();
        Img_Logo = new javax.swing.JLabel();
        Img_Fondo = new javax.swing.JLabel();
        Img_Icono = new javax.swing.JLabel();
        Pnl_Superior = new javax.swing.JPanel();
        Pnl_Cerrar = new javax.swing.JPanel();
        Txt_Cerrar = new javax.swing.JLabel();
        Txt_IniciarS = new javax.swing.JLabel();
        Txt_Usuario = new javax.swing.JLabel();
        Csll_Usuario = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        Txt_Contraseña = new javax.swing.JLabel();
        Csll_Contraseña = new javax.swing.JPasswordField();
        Btn_Iniciar = new javax.swing.JPanel();
        Txt_Iniciar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        Pnl_Principal.setBackground(new java.awt.Color(255, 255, 255));
        Pnl_Principal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Txt_Asterisco1.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        Txt_Asterisco1.setForeground(new java.awt.Color(255, 0, 0));
        Txt_Asterisco1.setText("*");
        Pnl_Principal.add(Txt_Asterisco1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 210, -1, -1));

        Txt_Asterisco2.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        Txt_Asterisco2.setForeground(new java.awt.Color(255, 0, 0));
        Txt_Asterisco2.setText("*");
        Pnl_Principal.add(Txt_Asterisco2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 330, -1, -1));

        Txt_CamposObli.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        Txt_CamposObli.setForeground(new java.awt.Color(255, 0, 0));
        Txt_CamposObli.setText("Ingrese campos obligatorios(*)");
        Pnl_Principal.add(Txt_CamposObli, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, -1, -1));

        Img_Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/fnd_Logo.png"))); // NOI18N
        Pnl_Principal.add(Img_Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 0, -1, -1));

        Img_Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/fnd_Postres.jpg"))); // NOI18N
        Pnl_Principal.add(Img_Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, -4, 260, 500));

        Img_Icono.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        Img_Icono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/Icn_Pancito.png"))); // NOI18N
        Pnl_Principal.add(Img_Icono, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, -1, -1));

        Pnl_Superior.setBackground(new java.awt.Color(255, 255, 255));
        Pnl_Superior.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                Pnl_SuperiorMouseDragged(evt);
            }
        });
        Pnl_Superior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Pnl_SuperiorMousePressed(evt);
            }
        });

        Pnl_Cerrar.setBackground(new java.awt.Color(255, 255, 255));

        Txt_Cerrar.setBackground(new java.awt.Color(255, 255, 255));
        Txt_Cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/Icn_Cerrar.png"))); // NOI18N
        Txt_Cerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Txt_Cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Txt_CerrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Txt_CerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Txt_CerrarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout Pnl_CerrarLayout = new javax.swing.GroupLayout(Pnl_Cerrar);
        Pnl_Cerrar.setLayout(Pnl_CerrarLayout);
        Pnl_CerrarLayout.setHorizontalGroup(
            Pnl_CerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Txt_Cerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Pnl_CerrarLayout.setVerticalGroup(
            Pnl_CerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Txt_Cerrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout Pnl_SuperiorLayout = new javax.swing.GroupLayout(Pnl_Superior);
        Pnl_Superior.setLayout(Pnl_SuperiorLayout);
        Pnl_SuperiorLayout.setHorizontalGroup(
            Pnl_SuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pnl_SuperiorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Pnl_Cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(762, Short.MAX_VALUE))
        );
        Pnl_SuperiorLayout.setVerticalGroup(
            Pnl_SuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pnl_SuperiorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Pnl_Cerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        Pnl_Principal.add(Pnl_Superior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 40));

        Txt_IniciarS.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        Txt_IniciarS.setText("INICIAR SESIÓN");
        Pnl_Principal.add(Txt_IniciarS, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        Txt_Usuario.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        Txt_Usuario.setText("USUARIO");
        Pnl_Principal.add(Txt_Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        Csll_Usuario.setForeground(new java.awt.Color(204, 204, 204));
        Csll_Usuario.setText("Ingrese nombre del usuario");
        Csll_Usuario.setBorder(null);
        Csll_Usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Csll_UsuarioMousePressed(evt);
            }
        });
        Csll_Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Csll_UsuarioActionPerformed(evt);
            }
        });
        Pnl_Principal.add(Csll_Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 390, 30));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        Pnl_Principal.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 360, 10));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        Pnl_Principal.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 360, 10));

        Txt_Contraseña.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        Txt_Contraseña.setText("CONTRASEÑA");
        Pnl_Principal.add(Txt_Contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, -1, -1));

        Csll_Contraseña.setForeground(new java.awt.Color(204, 204, 204));
        Csll_Contraseña.setText("********");
        Csll_Contraseña.setBorder(null);
        Csll_Contraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Csll_ContraseñaMousePressed(evt);
            }
        });
        Pnl_Principal.add(Csll_Contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 370, 30));

        Btn_Iniciar.setBackground(new java.awt.Color(242, 146, 69));
        Btn_Iniciar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Btn_Iniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_IniciarMouseClicked(evt);
            }
        });

        Txt_Iniciar.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        Txt_Iniciar.setForeground(new java.awt.Color(255, 255, 255));
        Txt_Iniciar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Txt_Iniciar.setText("INICIAR");
        Txt_Iniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Txt_IniciarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Txt_IniciarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Txt_IniciarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout Btn_IniciarLayout = new javax.swing.GroupLayout(Btn_Iniciar);
        Btn_Iniciar.setLayout(Btn_IniciarLayout);
        Btn_IniciarLayout.setHorizontalGroup(
            Btn_IniciarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Btn_IniciarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Txt_Iniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        Btn_IniciarLayout.setVerticalGroup(
            Btn_IniciarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Btn_IniciarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Txt_Iniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Pnl_Principal.add(Btn_Iniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 110, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Pnl_Principal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Pnl_Principal, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Txt_CerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Txt_CerrarMouseClicked
        this.dispose(); // METODO PARA CERRAR LOS PANELES, SIN CERRAR TODO EL PROGRAMA
        
    }//GEN-LAST:event_Txt_CerrarMouseClicked

    private void Txt_CerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Txt_CerrarMouseEntered
        Pnl_Cerrar.setBackground(new Color(244,0,37));
    }//GEN-LAST:event_Txt_CerrarMouseEntered

    private void Txt_CerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Txt_CerrarMouseExited
        Pnl_Cerrar.setBackground(Color.white);
    }//GEN-LAST:event_Txt_CerrarMouseExited

    private void Pnl_SuperiorMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pnl_SuperiorMouseDragged

        //SE MUEVE EL PANEL A LAS COORDENADAS DEL MOUSE
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse,y - yMouse); // SE USA PARA MOVER AL MISMO TIEMPO EL PANEL AL MOUSE
    }//GEN-LAST:event_Pnl_SuperiorMouseDragged

    private void Pnl_SuperiorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pnl_SuperiorMousePressed

        // SE ASIGNAN LAS VARIABLES MIENTRAS SE MANTENGA PRESIONADO EL PANEL SUPERIOR
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_Pnl_SuperiorMousePressed

    private void Csll_UsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Csll_UsuarioMousePressed

        if (Csll_Usuario.getText().equals("Ingrese nombre del usuario")){
            Csll_Usuario.setText("");
            Csll_Usuario.setForeground(Color.black);
        }

        if (String.valueOf(Csll_Contraseña.getPassword()).isEmpty()){
            Csll_Contraseña.setText("********");
            Csll_Contraseña.setForeground(Color.gray);
        }

    }//GEN-LAST:event_Csll_UsuarioMousePressed

    private void Csll_UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Csll_UsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Csll_UsuarioActionPerformed

    private void Csll_ContraseñaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Csll_ContraseñaMousePressed
        //Crear objeto de la clase ApLogin y almacenar datos del formulario
        ApLogin cl;
        cl = new ApLogin(Csll_Usuario.getText(),Csll_Contraseña.getText());
        if (String.valueOf(cl.getContraseña()).equals("********")){
            Csll_Contraseña.setText("");
            Csll_Contraseña.setForeground(Color.black);
        }
        if (cl.getUsuario().isEmpty() ){
            Csll_Usuario.setText("Ingrese nombre del usuario");
            Csll_Usuario.setForeground(Color.gray);
        }

    }//GEN-LAST:event_Csll_ContraseñaMousePressed

    private void Txt_IniciarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Txt_IniciarMouseClicked
        
        ApLogin cl;
        Menu menu = new Menu();
        Menu_emp menu_e = new Menu_emp();
        
        //Crear objeto de la clase ApLogin y almacenar datos del formulario

        cl = new ApLogin();
        
        String user = Csll_Usuario.getText();
        String pass = Csll_Contraseña.getText();
        
        
        if ((Csll_Usuario.getText().isEmpty())||
            (String.valueOf(Csll_Contraseña.getText()).isEmpty())||
            (Csll_Usuario.getText().equals("Ingresar nombre del usuario"))||
            (String.valueOf(Csll_Contraseña.getText()).equals("********"))
        ){

            Txt_Asterisco1.setVisible(true);
            Txt_Asterisco2.setVisible(true);
            Txt_CamposObli.setVisible(true);

        }
        
        
        try {
            int num = cl.Login(user, pass);
            
            if(num == 1){
                //PARA EL PANEL DE ADMINISTRADOR
                JOptionPane.showMessageDialog(null, "Panel Administrador");
                this.dispose();            
                menu.setVisible(true);
            }else if(num == 2){
                //PARA EL PANEL DE USUARIO
                JOptionPane.showMessageDialog(null, "Panel Empleado");
                this.dispose();            
                menu_e.setVisible(true);
            }else if(num == 0){
                //CUANDO NO EXISTE EL USUARIO                
                Csll_Usuario.setText("");
                Csll_Contraseña.setText("");
                Csll_Usuario.grabFocus();
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        

    }//GEN-LAST:event_Txt_IniciarMouseClicked

    private void Txt_IniciarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Txt_IniciarMouseEntered
        Btn_Iniciar.setBackground(new Color(237,116,16));
    }//GEN-LAST:event_Txt_IniciarMouseEntered

    private void Txt_IniciarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Txt_IniciarMouseExited
        Btn_Iniciar.setBackground(new Color(242,146,69));
    }//GEN-LAST:event_Txt_IniciarMouseExited

    private void Btn_IniciarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_IniciarMouseClicked
        //Meta meta = new Meta();
        //meta.setVisible(true);
    }//GEN-LAST:event_Btn_IniciarMouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Btn_Iniciar;
    private javax.swing.JPasswordField Csll_Contraseña;
    private javax.swing.JTextField Csll_Usuario;
    private javax.swing.JLabel Img_Fondo;
    private javax.swing.JLabel Img_Icono;
    private javax.swing.JLabel Img_Logo;
    private javax.swing.JPanel Pnl_Cerrar;
    private javax.swing.JPanel Pnl_Principal;
    private javax.swing.JPanel Pnl_Superior;
    private javax.swing.JLabel Txt_Asterisco1;
    private javax.swing.JLabel Txt_Asterisco2;
    private javax.swing.JLabel Txt_CamposObli;
    private javax.swing.JLabel Txt_Cerrar;
    private javax.swing.JLabel Txt_Contraseña;
    private javax.swing.JLabel Txt_Iniciar;
    private javax.swing.JLabel Txt_IniciarS;
    private javax.swing.JLabel Txt_Usuario;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
