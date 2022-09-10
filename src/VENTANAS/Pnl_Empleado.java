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
public class Pnl_Empleado extends javax.swing.JPanel {
    
    DefaultTableModel modelo = new DefaultTableModel();
    
    public Pnl_Empleado() {
        initComponents();
        llenarTabla();
    }
    
    private void llenarTabla(){
        
        modelo.addColumn("ID");
        modelo.addColumn("Empleado");
        modelo.addColumn("Genero");
        modelo.addColumn("DNI");        
        modelo.addColumn("Correo");      
        modelo.addColumn("Sueldo");
        modelo.addColumn("Telefono");
        modelo.addColumn("Distrito");
        modelo.addColumn("Direccion");
        
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
        
        mostrar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmpleado = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        btnEditar = new javax.swing.JButton();
        bttnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtIdempleado = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtSueldo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtGenero = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtDistrito = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        Icn_Cerrar1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(600, 480));
        setMinimumSize(new java.awt.Dimension(600, 480));
        setPreferredSize(new java.awt.Dimension(600, 480));

        tblEmpleado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID_Empleado", "Empleado", "Correo", "Sueldo", "Genero", "DNI", "Teléfono", "Distrito", "Direccion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
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

        btnEditar.setBackground(new java.awt.Color(255, 255, 255));
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/ico_editar.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        bttnEliminar.setBackground(new java.awt.Color(255, 255, 255));
        bttnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/ico_eliminar.png"))); // NOI18N
        bttnEliminar.setText("Eliminar");
        bttnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnEliminarActionPerformed(evt);
            }
        });

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

        txtIdempleado.setForeground(new java.awt.Color(102, 102, 102));
        txtIdempleado.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtIdempleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdempleadoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel1.setText("Correo : ");

        txtCorreo.setForeground(new java.awt.Color(102, 102, 102));
        txtCorreo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel3.setText("Sueldo :");

        txtSueldo.setForeground(new java.awt.Color(102, 102, 102));
        txtSueldo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtSueldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSueldoActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel7.setText("Nombre :");

        txtNombre.setForeground(new java.awt.Color(102, 102, 102));
        txtNombre.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel8.setText("DNI :");

        txtDni.setForeground(new java.awt.Color(102, 102, 102));
        txtDni.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDniActionPerformed(evt);
            }
        });

        btnAgregar.setBackground(new java.awt.Color(255, 255, 255));
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/ico_agregar.png"))); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel4.setText("Género :");

        txtGenero.setForeground(new java.awt.Color(102, 102, 102));
        txtGenero.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGeneroActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel9.setText("Teléfono :");

        txtTelefono.setForeground(new java.awt.Color(102, 102, 102));
        txtTelefono.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel10.setText("Distrito :");

        txtDistrito.setForeground(new java.awt.Color(102, 102, 102));
        txtDistrito.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtDistrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDistritoActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel11.setText("Dirección :");

        txtDireccion.setForeground(new java.awt.Color(102, 102, 102));
        txtDireccion.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnAgregar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bttnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel11)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel3)
                                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel1)
                                                    .addGap(33, 33, 33))))
                                        .addGap(13, 13, 13)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtTelefono)
                                            .addComponent(txtSueldo, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtCorreo, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtIdempleado, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(37, 37, 37)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel7)
                                                    .addComponent(jLabel8))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel10)
                                                    .addGap(5, 5, 5)))
                                            .addComponent(jLabel4))))
                                .addGap(52, 52, 52)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtGenero, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDni, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDistrito, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 200, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Icn_Cerrar1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel12)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)))
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
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdempleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtDistrito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
         Empleado e = new Empleado();
        
                
        e.setID_Empleado(txtIdempleado.getText());
        e.setNombre(txtNombre.getText());
        e.setCorreo(txtCorreo.getText());
        e.setSueldoBase(Double.valueOf(txtSueldo.getText()));
        e.setGenero(txtGenero.getText());
        e.setDNI(txtDni.getText());        
        e.setTelefono(txtTelefono.getText());
        e.setDistrito(txtDistrito.getText());
        e.setDireccion(txtDireccion.getText());        
        
        
        try {
            e.editar(e);
            limpiarTabla();
            limpiarCampos();
            mostrar();
        } catch (SQLException ex) {
            Logger.getLogger(Pnl_Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void bttnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnEliminarActionPerformed
        if(tblEmpleado.getSelectedRow()>=0){ //Debe seleccionar una fila, sino salta una alerta.
        
        
        Empleado e = new Empleado();
        
        String indice_eliminar = (String) tblEmpleado.getValueAt(tblEmpleado.getSelectedRow(), 0);
        
            e.setID_Empleado(indice_eliminar);

            if(JOptionPane.showConfirmDialog(null, "¿Está seguro que desea eliminar este registro?","ADVERTENCIA",JOptionPane.YES_NO_OPTION)
                    == JOptionPane.YES_OPTION){
                try {       
                    
                    e.eliminar(e);

                    limpiarTabla();
                    limpiarCampos();
                    mostrar();


                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Debe seleccionar un registro.");
                    Logger.getLogger(Pnl_Cliente.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        
        
        }else{
            JOptionPane.showMessageDialog(null, "Primero debe seleccionar una fila.");
        }
    }//GEN-LAST:event_bttnEliminarActionPerformed

    private void txtIdempleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdempleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdempleadoActionPerformed

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoActionPerformed

    private void txtSueldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSueldoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSueldoActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtIdempleado.setText("");
        txtNombre.setText("");
        txtCorreo.setText("");
        txtDni.setText("");
        txtSueldo.setText("");
        txtGenero.setText("");
        txtTelefono.setText("");
        txtDistrito.setText("");
        txtDireccion.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDniActionPerformed

    private void txtGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGeneroActionPerformed

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoActionPerformed

    private void txtDistritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDistritoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDistritoActionPerformed

    private void txtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionActionPerformed

    private void Icn_Cerrar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Icn_Cerrar1MouseClicked

        Pnl_Cambiable.removeAll();
        Pnl_Cambiable.revalidate();
        Pnl_Cambiable.repaint();
    }//GEN-LAST:event_Icn_Cerrar1MouseClicked

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        Empleado objEmpleado = new Empleado();
        objEmpleado.setID_Empleado(txtIdempleado.getText());
        objEmpleado.setDNI(txtDni.getText());
        objEmpleado.setNombre(txtNombre.getText());
        objEmpleado.setSueldoBase(Double.valueOf(txtSueldo.getText()));
        objEmpleado.setCorreo(txtCorreo.getText());
        objEmpleado.setGenero(txtGenero.getText());
        objEmpleado.setTelefono(txtTelefono.getText());
        objEmpleado.setDistrito(txtDistrito.getText());
        objEmpleado.setDireccion(txtDireccion.getText());
        
        System.out.println(objEmpleado);
        
        try {
            objEmpleado.insertar(objEmpleado);
            limpiarCampos();
            limpiarTabla();
            mostrar();
        } catch (SQLException ex) {
            Logger.getLogger(Pnl_Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //Menu.listaCliente.add(objCliente);
        
        //Mostrar en tabla al momento de agregar
        /*
        String agregar[] = new String[8];        
            agregar[0] = txtCodigo.getText();
            agregar[1] = txtDni.getText();
            agregar[2] = txtNombre.getText();
            agregar[3] = txtApellido.getText(); 
            agregar[4] = txtGenero.getText();
            agregar[5] = txtCelular.getText();
            agregar[6] = txtDistrito.getText();
            agregar[7] = txtDireccion.getText();
            
            modelo.addRow(agregar);*/
        
        //     
            txtIdempleado.setText("");
            txtDni.setText("");
            txtTelefono.setText("");
            txtGenero.setText("");
            txtNombre.setText("");
            txtSueldo.setText("");
            txtCorreo.setText("");
            txtDistrito.setText("");
            txtDireccion.setText("");
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void tblEmpleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEmpleadoMouseClicked
         
        String id = (String) tblEmpleado.getValueAt(tblEmpleado.getSelectedRow(), 0);
        String nombre = (String) tblEmpleado.getValueAt(tblEmpleado.getSelectedRow(), 1);
        String genero = (String) tblEmpleado.getValueAt(tblEmpleado.getSelectedRow(), 2);
        String dni = (String) tblEmpleado.getValueAt(tblEmpleado.getSelectedRow(), 3);             
        String correo = (String) tblEmpleado.getValueAt(tblEmpleado.getSelectedRow(), 4);   
        String sueldo = (String) tblEmpleado.getValueAt(tblEmpleado.getSelectedRow(), 5);
        String telefono = (String) tblEmpleado.getValueAt(tblEmpleado.getSelectedRow(), 6); 
        String distrito = (String) tblEmpleado.getValueAt(tblEmpleado.getSelectedRow(), 7); 
        String direccion = (String) tblEmpleado.getValueAt(tblEmpleado.getSelectedRow(), 8); 
                     
        
        
        try {
            
            txtIdempleado.setText(id);
            txtNombre.setText(nombre);   
            txtCorreo.setText(correo);
            txtSueldo.setText(sueldo);
            txtGenero.setText(genero);
            txtDni.setText(dni);
            txtTelefono.setText(telefono);
            txtDistrito.setText(distrito);
            txtDireccion.setText(direccion);
            
            
            
            
        } catch (Exception e) {
            System.out.println("Error en Editar: "+e.getMessage());
        }
    }//GEN-LAST:event_tblEmpleadoMouseClicked

    private void limpiarTabla(){
        //Eliminar todas las tablas
        int elimTotal = tblEmpleado.getRowCount();
        for (int i = elimTotal-1; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }
    
    private void limpiarCampos(){
        txtIdempleado.setText("");
        txtNombre.setText("");
        txtCorreo.setText("");
        txtDni.setText("");
        txtSueldo.setText("");
        txtGenero.setText("");
        txtTelefono.setText("");
        txtDistrito.setText("");
        txtDireccion.setText("");
    }
    
    private void mostrar(){
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
            agregar[3] = e.getDNI();
            agregar[4] = e.getCorreo();
            agregar[5] = String.valueOf(e.getSueldo());
            agregar[6] = e.getTelefono();
            agregar[7] = e.getDistrito();
            agregar[8] = e.getDireccion();
            
            modelo.addRow(agregar);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Pnl_Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Icn_Cerrar1;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton bttnEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblEmpleado;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDistrito;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtGenero;
    private javax.swing.JTextField txtIdempleado;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtSueldo;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
