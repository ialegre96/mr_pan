/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package VENTANAS;

import Clases.Empleado;
import static VENTANAS.Menu.Pnl_Cambiable;
import java.awt.BorderLayout;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LUCERO JUAREZ
 */
public class Pnl_Empleado_emp extends javax.swing.JPanel {
    
    DefaultTableModel modelo = new DefaultTableModel();
    
    public Pnl_Empleado_emp() {
        initComponents();
        llenarTabla();
    }
    
    private void llenarTabla(){
        
        modelo.addColumn("ID");
        modelo.addColumn("Empleado");
        modelo.addColumn("Genero");
     //   modelo.addColumn("DNI");        
        modelo.addColumn("Correo");
     //   modelo.addColumn("Direccion");
     //   modelo.addColumn("Sueldo");
     //  modelo.addColumn("Telefono");
        modelo.addColumn("Distrito");
        
        /*
        modelo.setRowCount(Menu.listaCliente.size());
        
        int i=0;
        for(Cliente obj: Menu.listaCliente){
            modelo.setValueAt(obj.getID_cliente(), i, 0);
            modelo.setValueAt(obj.getNombre(), i, 1);
            modelo.setValueAt(obj.getRUC(), i, 2);
            modelo.setValueAt(obj.getDNI(), i, 3);
            modelo.setValueAt(obj.getGenero(), i, 4);
            modelo.setValueAt(obj.getTelefono(), i, 5);
            modelo.setValueAt(obj.getDistrito(), i, 6);
            modelo.setValueAt(obj.getDireccion(), i, 7);
            
            i++;            
        }
        */
        this.tblEmpleado.setModel(modelo);
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmpleado = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtIdempleado = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        Icn_Cerrar1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnLimpiar1 = new javax.swing.JButton();
        btnMostrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtGenero = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtDistrito = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(600, 480));
        setMinimumSize(new java.awt.Dimension(600, 480));
        setPreferredSize(new java.awt.Dimension(600, 480));

        tblEmpleado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID_Empleado", "Empleado", "Correo", "Genero", "Distrito"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEmpleadoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblEmpleado);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/Icn_Marca.png"))); // NOI18N

        btnLimpiar.setBackground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/ico_limpiar.png"))); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel6.setText("ID_Empleado :");

        txtIdempleado.setEditable(false);
        txtIdempleado.setForeground(new java.awt.Color(102, 102, 102));
        txtIdempleado.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtIdempleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdempleadoActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel7.setText("Nombre :");

        txtNombre.setEditable(false);
        txtNombre.setForeground(new java.awt.Color(102, 102, 102));
        txtNombre.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        Icn_Cerrar1.setFont(new java.awt.Font("Roboto Light", 1, 11)); // NOI18N
        Icn_Cerrar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/Icn_Volver.png"))); // NOI18N
        Icn_Cerrar1.setText("Volver");
        Icn_Cerrar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Icn_Cerrar1MouseClicked(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Roboto Medium", 0, 22)); // NOI18N
        jLabel12.setText("EMPLEADO");

        btnLimpiar1.setBackground(new java.awt.Color(255, 255, 255));
        btnLimpiar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/ico_limpiar_tabla.png"))); // NOI18N
        btnLimpiar1.setText("Limpiar Tabla");
        btnLimpiar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiar1ActionPerformed(evt);
            }
        });

        btnMostrar.setBackground(new java.awt.Color(255, 255, 255));
        btnMostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/ico_mostrar.png"))); // NOI18N
        btnMostrar.setText("Mostrar");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel1.setText("Correo : ");

        txtCorreo.setEditable(false);
        txtCorreo.setForeground(new java.awt.Color(102, 102, 102));
        txtCorreo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel4.setText("Género :");

        txtGenero.setEditable(false);
        txtGenero.setForeground(new java.awt.Color(102, 102, 102));
        txtGenero.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGeneroActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel10.setText("Distrito :");

        txtDistrito.setEditable(false);
        txtDistrito.setForeground(new java.awt.Color(102, 102, 102));
        txtDistrito.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtDistrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDistritoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(btnMostrar)
                .addGap(18, 18, 18)
                .addComponent(btnLimpiar)
                .addGap(18, 18, 18)
                .addComponent(btnLimpiar1)
                .addContainerGap(367, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Icn_Cerrar1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel7)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel1)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel10)
                                                    .addComponent(jLabel4))))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtCorreo)
                                                .addComponent(txtGenero)
                                                .addComponent(txtNombre)
                                                .addComponent(txtDistrito, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(txtIdempleado, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel12))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(Icn_Cerrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5)))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdempleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDistrito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnLimpiar1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdempleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdempleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdempleadoActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtIdempleado.setText("");
        txtNombre.setText("");
        txtCorreo.setText("");
       // txtDni.setText("");
       // txtSueldo.setText("");
        txtGenero.setText("");
      //  txtTelefono.setText("");
        txtDistrito.setText("");
      //  txtDireccion.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void Icn_Cerrar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Icn_Cerrar1MouseClicked

        Pnl_Cambiable.removeAll();
        Pnl_Cambiable.revalidate();
        Pnl_Cambiable.repaint();
    }//GEN-LAST:event_Icn_Cerrar1MouseClicked

    private void btnLimpiar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiar1ActionPerformed
        //Eliminar todas las tablas
        int elimTotal = tblEmpleado.getRowCount();
        for (int i = elimTotal-1; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }//GEN-LAST:event_btnLimpiar1ActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        Empleado e = new Empleado();
        
        try {
            List<Empleado> empleados = e.obtenerTodos();
            
            //Iterator<Cliente> it = Menu.listaCliente.iterator();
            
            Iterator<Empleado> it = empleados.iterator();
            
            //Mostrar Datos Almacenados previamente
            while(it.hasNext()){
            e = it.next();
            String agregar[] = new String[9];        
            agregar[0] = e.getID_Empleado();
            agregar[1] = e.getNombre();
            agregar[2] = e.getGenero();
            agregar[3] = e.getCorreo();
            agregar[4] = e.getDistrito();
            agregar[5] = e.getDNI();
            agregar[6] = e.getTelefono();
            agregar[7] = String.valueOf(e.getSueldo());
            agregar[8] = e.getDireccion();
            
            modelo.addRow(agregar);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Pnl_Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void tblEmpleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEmpleadoMouseClicked
         
/*        String id = (String) tblEmpleado.getValueAt(tblEmpleado.getSelectedRow(), 0);
        String nombre = (String) tblEmpleado.getValueAt(tblEmpleado.getSelectedRow(), 1);             
        String correo = (String) tblEmpleado.getValueAt(tblEmpleado.getSelectedRow(), 2);   
        String sueldo = (String) tblEmpleado.getValueAt(tblEmpleado.getSelectedRow(), 3);
        String genero = (String) tblEmpleado.getValueAt(tblEmpleado.getSelectedRow(), 4);        
        String dni = (String) tblEmpleado.getValueAt(tblEmpleado.getSelectedRow(), 5); 
        String telefono = (String) tblEmpleado.getValueAt(tblEmpleado.getSelectedRow(), 6); 
        String distrito = (String) tblEmpleado.getValueAt(tblEmpleado.getSelectedRow(), 7); 
        String direccion = (String) tblEmpleado.getValueAt(tblEmpleado.getSelectedRow(), 8);*/
        String id = (String) tblEmpleado.getValueAt(tblEmpleado.getSelectedRow(), 0);
        String nombre = (String) tblEmpleado.getValueAt(tblEmpleado.getSelectedRow(), 1);                     
        String genero = (String) tblEmpleado.getValueAt(tblEmpleado.getSelectedRow(), 2);
        String correo = (String) tblEmpleado.getValueAt(tblEmpleado.getSelectedRow(), 3);                  
        String distrito = (String) tblEmpleado.getValueAt(tblEmpleado.getSelectedRow(), 4); 
         
                     
        
        
        try {
            
            txtIdempleado.setText(id);
            txtNombre.setText(nombre);
            txtCorreo.setText(correo);
            txtGenero.setText(genero);
            txtDistrito.setText(distrito);
           
            
        } catch (Exception e) {
            System.out.println("Error en Editar: "+e.getMessage());
        }
    }//GEN-LAST:event_tblEmpleadoMouseClicked

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoActionPerformed

    private void txtGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGeneroActionPerformed

    private void txtDistritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDistritoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDistritoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Icn_Cerrar1;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnLimpiar1;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblEmpleado;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDistrito;
    private javax.swing.JTextField txtGenero;
    private javax.swing.JTextField txtIdempleado;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
