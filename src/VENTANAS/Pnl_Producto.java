/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package VENTANAS;

import Clases.Producto;
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
public class Pnl_Producto extends javax.swing.JPanel {
    
    DefaultTableModel modelo = new DefaultTableModel();

    public Pnl_Producto() {
        initComponents();
        llenarTabla();
    }
    
    private void llenarTabla(){
        
        modelo.addColumn("ID");
        modelo.addColumn("Producto");
        modelo.addColumn("Precio");
        modelo.addColumn("Stock");        
        modelo.addColumn("Gasto Total");
        modelo.addColumn("ID_Proveedor");
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
        this.tblProducto.setModel(modelo);
        
        mostrar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtID_Producto = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProducto = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtStock = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtPrecioU = new javax.swing.JTextField();
        Icn_Cerrar1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtID_Proveedor = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(600, 480));
        setMinimumSize(new java.awt.Dimension(600, 480));
        setPreferredSize(new java.awt.Dimension(600, 480));

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel1.setText("ID_Producto: ");

        txtID_Producto.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtID_Producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtID_ProductoActionPerformed(evt);
            }
        });

        tblProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID_Producto", "Producto", "Precio/unidad", "Stock", "Gasto Total", "ID_Proveedor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.Double.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProductoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblProducto);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/Icn_Marca.png"))); // NOI18N

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

        jLabel3.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel3.setText("Nombre:");

        txtNombre.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel6.setText("Stock:");

        txtStock.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStockActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel7.setText("Precio Unitario :");

        txtPrecioU.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtPrecioU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioUActionPerformed(evt);
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

        jLabel4.setFont(new java.awt.Font("Roboto Medium", 0, 22)); // NOI18N
        jLabel4.setText("PRODUCTO");

        txtID_Proveedor.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel2.setText("ID_Proveedor:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(77, 77, 77)
                                .addComponent(txtStock))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtID_Proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addGap(24, 24, 24)
                                    .addComponent(txtPrecioU, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Icn_Cerrar1)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(40, 40, 40)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel1)
                                                .addComponent(jLabel3))
                                            .addGap(38, 38, 38)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtID_Producto, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                                .addComponent(txtNombre))))))
                            .addGap(341, 341, 341)
                            .addComponent(jLabel5))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(20, 20, 20)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(23, 23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(Icn_Cerrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5)))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtID_Producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrecioU, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtID_Proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtID_ProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtID_ProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtID_ProductoActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        Producto objProducto = new Producto();
        
        objProducto.setGastoTotal(Double.valueOf(txtPrecioU.getText())*Integer.parseInt(txtStock.getText()));
        
        objProducto.setID_Producto(txtID_Producto.getText());
        objProducto.setNombre(txtNombre.getText());
        objProducto.setPrecio_unitario(Double.valueOf(txtPrecioU.getText()));
        objProducto.setStock(Integer.parseInt(txtStock.getText()));        
        objProducto.setID_Proveedor(txtID_Proveedor.getText());
       
        
        System.out.println(objProducto);
        
        try {
            objProducto.insertar(objProducto);
            limpiarTabla();
            limpiarCampos();
            mostrar();
            
        } catch (SQLException ex) {
            Logger.getLogger(Pnl_Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
           
            txtID_Producto.setText("");
            txtNombre.setText("");
            txtPrecioU.setText("");
            txtStock.setText("");
            txtNombre.setText("");
            txtID_Proveedor.setText("");
            
            txtID_Producto.grabFocus();
            
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        Producto pr = new Producto();
        
                
        pr.setID_Producto(txtID_Producto.getText());
        pr.setNombre(txtNombre.getText());
        pr.setPrecio_unitario(Double.valueOf(txtPrecioU.getText()));
        pr.setStock(Integer.parseInt(txtStock.getText()));
        pr.setGastoTotal(pr.getPrecio_unitario()*pr.getStock());
        pr.setID_Proveedor(txtID_Proveedor.getText());
        
        
        
        
        try {
            pr.editar(pr);
            
            limpiarCampos();
            limpiarTabla();
            mostrar();
            
        } catch (SQLException ex) {
            Logger.getLogger(Pnl_Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if(tblProducto.getSelectedRow()>=0){ //Debe seleccionar una fila, sino salta una alerta.
        
        
        Producto pr = new Producto();
        
        String indice_eliminar = (String) tblProducto.getValueAt(tblProducto.getSelectedRow(), 0);
        
            pr.setID_Producto(indice_eliminar);

            if(JOptionPane.showConfirmDialog(null, "¿Está seguro que desea eliminar este registro?","ADVERTENCIA",JOptionPane.YES_NO_OPTION)
                    == JOptionPane.YES_OPTION){
                try {       
                    
                    pr.eliminar(pr);
                    
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
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtID_Producto.setText("");
        txtNombre.setText("");
        txtPrecioU.setText("");
        txtStock.setText("");
        txtNombre.setText("");
        txtID_Proveedor.setText("");
            
        txtID_Producto.grabFocus();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStockActionPerformed

    private void txtPrecioUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioUActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioUActionPerformed

    private void Icn_Cerrar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Icn_Cerrar1MouseClicked

        Pnl_Cambiable.removeAll();
        Pnl_Cambiable.revalidate();
        Pnl_Cambiable.repaint();
    }//GEN-LAST:event_Icn_Cerrar1MouseClicked

    private void tblProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProductoMouseClicked
        
        String id = (String) tblProducto.getValueAt(tblProducto.getSelectedRow(), 0);
        String nombre = (String) tblProducto.getValueAt(tblProducto.getSelectedRow(), 1);
        String precio = (String) tblProducto.getValueAt(tblProducto.getSelectedRow(), 2);
        String stock = (String) tblProducto.getValueAt(tblProducto.getSelectedRow(), 3);
        String gasto = (String) tblProducto.getValueAt(tblProducto.getSelectedRow(), 4);
        String ID_Proveedor = (String) tblProducto.getValueAt(tblProducto.getSelectedRow(), 5);   
        
                     
        
        
        try {
            
            txtID_Producto.setText(id);
            txtNombre.setText(nombre);
            txtPrecioU.setText(String.valueOf(precio));
            txtStock.setText(String.valueOf(stock));
            txtID_Proveedor.setText(ID_Proveedor);
            
            
            
        } catch (Exception e) {
            System.out.println("Error en Editar: "+e.getMessage());
        }
    }//GEN-LAST:event_tblProductoMouseClicked

    private void limpiarTabla(){
        //Eliminar todas las tablas
        int elimTotal = tblProducto.getRowCount();
        for (int i = elimTotal-1; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }
    
    private void limpiarCampos(){
        txtID_Producto.setText("");
        txtNombre.setText("");
        txtPrecioU.setText("");
        txtStock.setText("");
        txtNombre.setText("");
        txtID_Proveedor.setText("");
            
        txtID_Producto.grabFocus();
    }
    
    private void mostrar(){
        Producto pr = new Producto();
        
        try {
            List<Producto> productos = pr.obtenerTodos();
            
            //Iterator<Cliente> it = Menu.listaCliente.iterator();
            
            Iterator<Producto> it = productos.iterator();
            
            //Mostrar Datos Almacenados previamente
            while(it.hasNext()){
            pr = it.next();
            String agregar[] = new String[8];        
            agregar[0] = pr.getID_Producto();
            agregar[1] = pr.getNombre();
            agregar[2] = String.valueOf(pr.getPrecio_unitario());
            agregar[3] = String.valueOf(pr.getStock());
            agregar[4] = String.valueOf(pr.getGastoTotal());
            agregar[5] = pr.getID_Proveedor();           
            
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
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblProducto;
    private javax.swing.JTextField txtID_Producto;
    private javax.swing.JTextField txtID_Proveedor;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecioU;
    private javax.swing.JTextField txtStock;
    // End of variables declaration//GEN-END:variables
}
