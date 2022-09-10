
package VENTANAS;

import static VENTANAS.Menu.Pnl_Cambiable;
import java.awt.BorderLayout;
import javax.swing.table.DefaultTableModel; //Importar libreria tabla
import Clases.*;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Pnl_Cliente extends javax.swing.JPanel {
    
    DefaultTableModel modelo = new DefaultTableModel();

    public Pnl_Cliente() {
        initComponents();
        llenarTabla();
    }
    
    private void llenarTabla(){
        
        modelo.addColumn("Codigo_Cliente");
        modelo.addColumn("Nombre");
        modelo.addColumn("Genero");
        modelo.addColumn("DNI");        
        modelo.addColumn("RUC");
        modelo.addColumn("Direccion");
        modelo.addColumn("Telefono");
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
        this.tblCliente.setModel(modelo);
        
        mostrar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCliente = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtDistrito = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtGenero = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txtRuc = new javax.swing.JTextField();
        Icn_Cerrar1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(600, 480));
        setMinimumSize(new java.awt.Dimension(600, 480));
        setPreferredSize(new java.awt.Dimension(600, 480));

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel1.setText("N° DNI : ");

        txtDni.setForeground(new java.awt.Color(102, 102, 102));
        txtDni.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDniActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel3.setText("Sexo :");

        txtTelefono.setForeground(new java.awt.Color(102, 102, 102));
        txtTelefono.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });

        tblCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID_Cliente", "Cliente", "Genero", "DNI", "RUC", "Direccion", "Telefono", "Distrito"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Object.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCliente);
        if (tblCliente.getColumnModel().getColumnCount() > 0) {
            tblCliente.getColumnModel().getColumn(4).setResizable(false);
            tblCliente.getColumnModel().getColumn(4).setPreferredWidth(50);
        }

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/Icn_Marca.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel6.setText("ID_Cliente : ");

        txtCodigo.setForeground(new java.awt.Color(102, 102, 102));
        txtCodigo.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtCodigo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel7.setText("Nombre : ");

        txtNombre.setForeground(new java.awt.Color(102, 102, 102));
        txtNombre.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel4.setText("Celular : ");

        txtDireccion.setForeground(new java.awt.Color(102, 102, 102));
        txtDireccion.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel8.setText("Distrito : ");

        txtDistrito.setForeground(new java.awt.Color(102, 102, 102));
        txtDistrito.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtDistrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDistritoActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel9.setText("Dirección :");

        txtGenero.setForeground(new java.awt.Color(102, 102, 102));
        txtGenero.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGeneroActionPerformed(evt);
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

        btnEditar.setBackground(new java.awt.Color(255, 255, 255));
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/ico_editar.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(255, 255, 255));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/ico_eliminar.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
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

        jLabel11.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel11.setText("RUC :");

        txtRuc.setForeground(new java.awt.Color(102, 102, 102));
        txtRuc.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtRuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRucActionPerformed(evt);
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

        jLabel2.setFont(new java.awt.Font("Roboto Medium", 0, 22)); // NOI18N
        jLabel2.setText("CLIENTE");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel2)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Icn_Cerrar1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel4))))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(txtDni)
                            .addComponent(txtTelefono)
                            .addComponent(txtDistrito))
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtRuc, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))))))
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
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDistrito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDniActionPerformed

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoActionPerformed

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionActionPerformed

    private void txtDistritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDistritoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDistritoActionPerformed

    private void txtGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGeneroActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        
        Cliente objCliente = new Cliente();
        objCliente.setID_cliente(txtCodigo.getText());
        objCliente.setDNI(txtDni.getText());
        objCliente.setNombre(txtNombre.getText());
        objCliente.setRUC(txtRuc.getText());
        objCliente.setGenero(txtGenero.getText());
        objCliente.setTelefono(txtTelefono.getText());
        objCliente.setDistrito(txtDistrito.getText());
        objCliente.setDireccion(txtDireccion.getText());
        
        //System.out.println(objCliente);
        
        try {
            objCliente.insertar(objCliente);
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
            txtCodigo.setText("");
            txtDni.setText("");
            txtTelefono.setText("");
            txtRuc.setText("");
            txtNombre.setText("");
            txtDireccion.setText("");
            txtDistrito.setText("");
            txtGenero.setText("");
            
            
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        
        Cliente c = new Cliente();
        
                
        c.setID_cliente(txtCodigo.getText());
        c.setNombre(txtNombre.getText());
        c.setGenero(txtRuc.getText());
        c.setDNI(txtDni.getText());
        c.setRUC(txtDireccion.getText());
        c.setTelefono(txtTelefono.getText());
        c.setDistrito(txtDistrito.getText());
        c.setDireccion(txtGenero.getText());        
        
        
        try {
            c.editar(c);
            limpiarTabla();
            limpiarCampos();
            mostrar();
        } catch (SQLException ex) {
            Logger.getLogger(Pnl_Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        
        
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        
        
        if(tblCliente.getSelectedRow()>=0){ //Debe seleccionar una fila, sino salta una alerta.
        
        
        Cliente c = new Cliente();
        
        String indice_eliminar = (String) tblCliente.getValueAt(tblCliente.getSelectedRow(), 0);
        
            c.setID_cliente(indice_eliminar);

            if(JOptionPane.showConfirmDialog(null, "¿Está seguro que desea eliminar este registro?","ADVERTENCIA",JOptionPane.YES_NO_OPTION)
                    == JOptionPane.YES_OPTION){
                try {       
                    
                    c.eliminar(c);

                    limpiarCampos();
                    limpiarTabla();
                    mostrar();


                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Debe seleccionar un registro.");
                    Logger.getLogger(Pnl_Cliente.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        
        
        }else{
            JOptionPane.showMessageDialog(null, "Primero debe seleccionar una fila.");
        }
        
        
        
        //Declarar la variable que contendrá la fila seleccionada
       /* int eliminar = tblCliente.getSelectedRow();        
        
        //Condicional para eliminar
        
        if (eliminar >= 0) {
            modelo.removeRow(eliminar);
            Menu.listaCliente.remove(eliminar);
        }else{
            JOptionPane.showMessageDialog(this, "No se ha seleccionado la fila a eliminar", "ERROR", JOptionPane.WARNING_MESSAGE);
        }*/
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtCodigo.setText("");
        txtNombre.setText("");
        txtDni.setText("");
        txtDireccion.setText("");
        txtTelefono.setText("");
        txtRuc.setText("");
        txtDistrito.setText("");
        txtGenero.setText("");
        
        txtCodigo.grabFocus();
        
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void tblClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClienteMouseClicked
        
        String id = (String) tblCliente.getValueAt(tblCliente.getSelectedRow(), 0);
        String nombre = (String) tblCliente.getValueAt(tblCliente.getSelectedRow(), 1);
        String genero = (String) tblCliente.getValueAt(tblCliente.getSelectedRow(), 2);
        String dni = (String) tblCliente.getValueAt(tblCliente.getSelectedRow(), 3);
        String ruc = (String) tblCliente.getValueAt(tblCliente.getSelectedRow(), 4);
        String direccion = (String) tblCliente.getValueAt(tblCliente.getSelectedRow(), 5);   
        String telefono = (String) tblCliente.getValueAt(tblCliente.getSelectedRow(), 6);        
        String distrito = (String) tblCliente.getValueAt(tblCliente.getSelectedRow(), 7);
                     
        
        
        try {
            
            txtCodigo.setText(id);
            txtNombre.setText(nombre);
            txtDni.setText(dni);
            txtDireccion.setText(ruc);
            txtTelefono.setText(telefono);
            txtRuc.setText(genero);
            txtDistrito.setText(distrito);
            txtGenero.setText(direccion);
            
            
            
        } catch (Exception e) {
            System.out.println("Error en Editar: "+e.getMessage());
        }
    }//GEN-LAST:event_tblClienteMouseClicked

    private void txtRucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRucActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRucActionPerformed

    private void limpiarTabla(){
        //Eliminar todas las tablas
        int elimTotal = tblCliente.getRowCount();
        for (int i = elimTotal-1; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }
   
    private void limpiarCampos(){
        txtCodigo.setText("");
        txtNombre.setText("");
        txtDni.setText("");
        txtDireccion.setText("");
        txtTelefono.setText("");
        txtRuc.setText("");
        txtDistrito.setText("");
        txtGenero.setText("");
        
        txtCodigo.grabFocus();
    }
    
    private void mostrar(){
        Cliente c = new Cliente();
        
        try {
            List<Cliente> clientes = c.obtenerTodos();
            
            //Iterator<Cliente> it = Menu.listaCliente.iterator();
            
            Iterator<Cliente> it = clientes.iterator();
            
            //Mostrar Datos Almacenados previamente
            while(it.hasNext()){
            c = it.next();
            String agregar[] = new String[8];        
            agregar[0] = c.getID_cliente();
            agregar[1] = c.getNombre();
            agregar[2] = c.getGenero();
            agregar[3] = c.getDNI();
            agregar[4] = c.getRUC();
            agregar[5] = c.getDireccion();
            agregar[6] = c.getTelefono();
            agregar[7] = c.getDistrito();
            
            modelo.addRow(agregar);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Pnl_Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        
        
        
        //Mostrar en tabla al momento de agregar
        /*String agregar[] = new String[8];        
            agregar[0] = objCliente.getID_cliente();
            agregar[1] = objCliente.getDNI();
            agregar[2] = objCliente.getNombre();
            agregar[3] = objCliente.getApellido();
            agregar[4] = objCliente.getGenero();
            agregar[5] = objCliente.getTelefono();
            agregar[6] = objCliente.getDistrito();
            agregar[7] = objCliente.getDireccion();*/
    }
    
    private void Icn_Cerrar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Icn_Cerrar1MouseClicked

        Pnl_Cambiable.removeAll();
        Pnl_Cambiable.revalidate();
        Pnl_Cambiable.repaint();
    }//GEN-LAST:event_Icn_Cerrar1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Icn_Cerrar1;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCliente;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDistrito;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtGenero;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRuc;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
