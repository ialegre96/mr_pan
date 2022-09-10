
package VENTANAS;

import java.awt.BorderLayout;
import java.awt.Color;
import java.util.ArrayList;
import Clases.*;
import static VENTANAS.Menu.Pnl_Cambiable;

public class Menu_emp extends javax.swing.JFrame {
    
    
    int xMouse, yMouse;
    
    public static ArrayList<Cliente>listaCliente = null; 
    
    public Menu_emp() {
        initComponents();
        
        this.setLocationRelativeTo(null); // SE UTILIZA PARA CENTRAR EL PANEL
        
        listaCliente = new ArrayList<Cliente>(); // Se ingresa al constructor por buena práctica
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Pnl_Principal = new javax.swing.JPanel();
        Txt_Cerrar1 = new javax.swing.JLabel();
        Pnl_Cambiable = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Pnl_Opciones = new javax.swing.JPanel();
        Btn_Proveedor = new javax.swing.JPanel();
        Txt_Proveedor = new javax.swing.JLabel();
        Btn_Empleados = new javax.swing.JPanel();
        Txt_Empleados = new javax.swing.JLabel();
        Btn_Clientes = new javax.swing.JPanel();
        Txt_Clientes = new javax.swing.JLabel();
        Btn_Productos = new javax.swing.JPanel();
        Txt_Productos = new javax.swing.JLabel();
        Btn_Boletas = new javax.swing.JPanel();
        Txt_Boletas = new javax.swing.JLabel();
        Btn_Factura = new javax.swing.JPanel();
        Txt_Factura = new javax.swing.JLabel();
        Txt_Acercade = new javax.swing.JLabel();
        Pnl_CerrarSesion = new javax.swing.JPanel();
        Txt_CerrarSesion = new javax.swing.JLabel();
        Pnl_Superior = new javax.swing.JPanel();
        Pnl_Cerrar = new javax.swing.JPanel();
        Txt_Cerrar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(900, 650));
        setUndecorated(true);

        Pnl_Principal.setBackground(new java.awt.Color(255, 255, 255));
        Pnl_Principal.setMaximumSize(new java.awt.Dimension(900, 650));
        Pnl_Principal.setMinimumSize(new java.awt.Dimension(900, 650));
        Pnl_Principal.setPreferredSize(new java.awt.Dimension(900, 650));
        Pnl_Principal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Txt_Cerrar1.setBackground(new java.awt.Color(255, 255, 255));
        Txt_Cerrar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/Icn_Cerrar.png"))); // NOI18N
        Txt_Cerrar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Txt_Cerrar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Txt_Cerrar1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Txt_Cerrar1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Txt_Cerrar1MouseExited(evt);
            }
        });
        Pnl_Principal.add(Txt_Cerrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Pnl_Cambiable.setBackground(new java.awt.Color(255, 255, 255));
        Pnl_Cambiable.setMaximumSize(new java.awt.Dimension(600, 600));
        Pnl_Cambiable.setMinimumSize(new java.awt.Dimension(600, 600));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/Icn_Marca.png"))); // NOI18N

        javax.swing.GroupLayout Pnl_CambiableLayout = new javax.swing.GroupLayout(Pnl_Cambiable);
        Pnl_Cambiable.setLayout(Pnl_CambiableLayout);
        Pnl_CambiableLayout.setHorizontalGroup(
            Pnl_CambiableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pnl_CambiableLayout.createSequentialGroup()
                .addContainerGap(339, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(302, 302, 302))
        );
        Pnl_CambiableLayout.setVerticalGroup(
            Pnl_CambiableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pnl_CambiableLayout.createSequentialGroup()
                .addGap(244, 244, 244)
                .addComponent(jLabel1)
                .addContainerGap(333, Short.MAX_VALUE))
        );

        Pnl_Principal.add(Pnl_Cambiable, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 720, 650));

        Pnl_Opciones.setBackground(new java.awt.Color(242, 146, 69));
        Pnl_Opciones.setMaximumSize(new java.awt.Dimension(180, 600));
        Pnl_Opciones.setPreferredSize(new java.awt.Dimension(186, 600));
        Pnl_Opciones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Btn_Proveedor.setBackground(new java.awt.Color(242, 146, 69));
        Btn_Proveedor.setMaximumSize(new java.awt.Dimension(180, 35));
        Btn_Proveedor.setMinimumSize(new java.awt.Dimension(180, 35));
        Btn_Proveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Btn_ProveedorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btn_ProveedorMouseExited(evt);
            }
        });

        Txt_Proveedor.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        Txt_Proveedor.setForeground(new java.awt.Color(255, 255, 255));
        Txt_Proveedor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Txt_Proveedor.setText("PROVEEDOR");
        Txt_Proveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Txt_ProveedorMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Txt_ProveedorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Txt_ProveedorMouseExited(evt);
            }
        });

        javax.swing.GroupLayout Btn_ProveedorLayout = new javax.swing.GroupLayout(Btn_Proveedor);
        Btn_Proveedor.setLayout(Btn_ProveedorLayout);
        Btn_ProveedorLayout.setHorizontalGroup(
            Btn_ProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Txt_Proveedor, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
        );
        Btn_ProveedorLayout.setVerticalGroup(
            Btn_ProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Txt_Proveedor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        Pnl_Opciones.add(Btn_Proveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 46, -1, -1));

        Btn_Empleados.setBackground(new java.awt.Color(242, 146, 69));
        Btn_Empleados.setMaximumSize(new java.awt.Dimension(180, 35));
        Btn_Empleados.setMinimumSize(new java.awt.Dimension(180, 35));

        Txt_Empleados.setBackground(new java.awt.Color(255, 255, 255));
        Txt_Empleados.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        Txt_Empleados.setForeground(new java.awt.Color(255, 255, 255));
        Txt_Empleados.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Txt_Empleados.setText("EMPLEADOS");
        Txt_Empleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Txt_EmpleadosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Txt_EmpleadosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Txt_EmpleadosMouseExited(evt);
            }
        });

        javax.swing.GroupLayout Btn_EmpleadosLayout = new javax.swing.GroupLayout(Btn_Empleados);
        Btn_Empleados.setLayout(Btn_EmpleadosLayout);
        Btn_EmpleadosLayout.setHorizontalGroup(
            Btn_EmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Txt_Empleados, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
        );
        Btn_EmpleadosLayout.setVerticalGroup(
            Btn_EmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Txt_Empleados, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        Pnl_Opciones.add(Btn_Empleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 87, -1, -1));

        Btn_Clientes.setBackground(new java.awt.Color(242, 146, 69));
        Btn_Clientes.setMaximumSize(new java.awt.Dimension(180, 35));
        Btn_Clientes.setMinimumSize(new java.awt.Dimension(180, 35));
        Btn_Clientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_ClientesMouseClicked(evt);
            }
        });

        Txt_Clientes.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        Txt_Clientes.setForeground(new java.awt.Color(255, 255, 255));
        Txt_Clientes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Txt_Clientes.setText("CLIENTES");
        Txt_Clientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Txt_ClientesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Txt_ClientesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Txt_ClientesMouseExited(evt);
            }
        });

        javax.swing.GroupLayout Btn_ClientesLayout = new javax.swing.GroupLayout(Btn_Clientes);
        Btn_Clientes.setLayout(Btn_ClientesLayout);
        Btn_ClientesLayout.setHorizontalGroup(
            Btn_ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Txt_Clientes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
        );
        Btn_ClientesLayout.setVerticalGroup(
            Btn_ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Txt_Clientes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        Pnl_Opciones.add(Btn_Clientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 128, -1, -1));

        Btn_Productos.setBackground(new java.awt.Color(242, 146, 69));
        Btn_Productos.setMaximumSize(new java.awt.Dimension(180, 35));
        Btn_Productos.setMinimumSize(new java.awt.Dimension(180, 35));

        Txt_Productos.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        Txt_Productos.setForeground(new java.awt.Color(255, 255, 255));
        Txt_Productos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Txt_Productos.setText("PRODUCTOS");
        Txt_Productos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Txt_ProductosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Txt_ProductosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Txt_ProductosMouseExited(evt);
            }
        });

        javax.swing.GroupLayout Btn_ProductosLayout = new javax.swing.GroupLayout(Btn_Productos);
        Btn_Productos.setLayout(Btn_ProductosLayout);
        Btn_ProductosLayout.setHorizontalGroup(
            Btn_ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
            .addGroup(Btn_ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Btn_ProductosLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Txt_Productos, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        Btn_ProductosLayout.setVerticalGroup(
            Btn_ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
            .addGroup(Btn_ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Btn_ProductosLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Txt_Productos, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        Pnl_Opciones.add(Btn_Productos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 173, -1, -1));

        Btn_Boletas.setBackground(new java.awt.Color(242, 146, 69));
        Btn_Boletas.setMaximumSize(new java.awt.Dimension(180, 35));
        Btn_Boletas.setMinimumSize(new java.awt.Dimension(180, 35));

        Txt_Boletas.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        Txt_Boletas.setForeground(new java.awt.Color(255, 255, 255));
        Txt_Boletas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Txt_Boletas.setText("BOLETA");
        Txt_Boletas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Txt_BoletasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Txt_BoletasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Txt_BoletasMouseExited(evt);
            }
        });

        javax.swing.GroupLayout Btn_BoletasLayout = new javax.swing.GroupLayout(Btn_Boletas);
        Btn_Boletas.setLayout(Btn_BoletasLayout);
        Btn_BoletasLayout.setHorizontalGroup(
            Btn_BoletasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Txt_Boletas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
        );
        Btn_BoletasLayout.setVerticalGroup(
            Btn_BoletasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Txt_Boletas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        Pnl_Opciones.add(Btn_Boletas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 213, 180, 40));

        Btn_Factura.setBackground(new java.awt.Color(242, 146, 69));
        Btn_Factura.setMaximumSize(new java.awt.Dimension(180, 35));
        Btn_Factura.setMinimumSize(new java.awt.Dimension(180, 35));

        Txt_Factura.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        Txt_Factura.setForeground(new java.awt.Color(255, 255, 255));
        Txt_Factura.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Txt_Factura.setText("FACTURA");
        Txt_Factura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Txt_FacturaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Txt_FacturaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Txt_FacturaMouseExited(evt);
            }
        });

        javax.swing.GroupLayout Btn_FacturaLayout = new javax.swing.GroupLayout(Btn_Factura);
        Btn_Factura.setLayout(Btn_FacturaLayout);
        Btn_FacturaLayout.setHorizontalGroup(
            Btn_FacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Btn_FacturaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Txt_Factura, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        Btn_FacturaLayout.setVerticalGroup(
            Btn_FacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Txt_Factura, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        Pnl_Opciones.add(Btn_Factura, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 253, 180, 40));

        Txt_Acercade.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        Txt_Acercade.setForeground(new java.awt.Color(255, 255, 255));
        Txt_Acercade.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Txt_Acercade.setText("Acerca de");
        Txt_Acercade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Txt_AcercadeMouseClicked(evt);
            }
        });
        Pnl_Opciones.add(Txt_Acercade, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 180, 40));

        Pnl_CerrarSesion.setBackground(new java.awt.Color(255, 255, 255));

        Txt_CerrarSesion.setBackground(new java.awt.Color(255, 0, 0));
        Txt_CerrarSesion.setFont(new java.awt.Font("Roboto Light", 1, 16)); // NOI18N
        Txt_CerrarSesion.setForeground(new java.awt.Color(255, 0, 0));
        Txt_CerrarSesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Txt_CerrarSesion.setText("Cerrar sesión");
        Txt_CerrarSesion.setToolTipText("");
        Txt_CerrarSesion.setAlignmentX(0.5F);
        Txt_CerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Txt_CerrarSesionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Txt_CerrarSesionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Txt_CerrarSesionMouseExited(evt);
            }
        });

        javax.swing.GroupLayout Pnl_CerrarSesionLayout = new javax.swing.GroupLayout(Pnl_CerrarSesion);
        Pnl_CerrarSesion.setLayout(Pnl_CerrarSesionLayout);
        Pnl_CerrarSesionLayout.setHorizontalGroup(
            Pnl_CerrarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pnl_CerrarSesionLayout.createSequentialGroup()
                .addComponent(Txt_CerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Pnl_CerrarSesionLayout.setVerticalGroup(
            Pnl_CerrarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pnl_CerrarSesionLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Txt_CerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Pnl_Opciones.add(Pnl_CerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 180, 40));

        Pnl_Principal.add(Pnl_Opciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 440));

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
            .addComponent(Txt_Cerrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
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
            .addGroup(Pnl_SuperiorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Pnl_Cerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        Pnl_Principal.add(Pnl_Superior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Pnl_Principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Pnl_Principal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Txt_ProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Txt_ProductosMouseClicked
        Pnl_Producto producto = new Pnl_Producto();
        producto.setSize(720, 650);
        producto.setLocation(5, 5);

        Pnl_Cambiable.removeAll();
        Pnl_Cambiable.add(producto, BorderLayout.CENTER);
        Pnl_Cambiable.revalidate();
        Pnl_Cambiable.repaint();
    }//GEN-LAST:event_Txt_ProductosMouseClicked

    private void Btn_ClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_ClientesMouseClicked
        Pnl_Cliente cliente = new Pnl_Cliente();
        cliente.setSize(720, 650);
        cliente.setLocation(5, 5);

        Pnl_Cambiable.removeAll();
        Pnl_Cambiable.add(cliente, BorderLayout.CENTER);
        Pnl_Cambiable.revalidate();
        Pnl_Cambiable.repaint();
    }//GEN-LAST:event_Btn_ClientesMouseClicked

    private void Txt_EmpleadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Txt_EmpleadosMouseClicked
        Pnl_Empleado_emp empleado = new Pnl_Empleado_emp();
        empleado.setSize(720, 650);
        empleado.setLocation(5, 5);

        Pnl_Cambiable.removeAll();
        Pnl_Cambiable.add(empleado, BorderLayout.CENTER);
        Pnl_Cambiable.revalidate();
        Pnl_Cambiable.repaint();
    }//GEN-LAST:event_Txt_EmpleadosMouseClicked

    private void Txt_ProveedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Txt_ProveedorMouseClicked
        Pnl_Proveedor venta = new Pnl_Proveedor();
        venta.setSize(720, 650);
        venta.setLocation(5, 5);

        Pnl_Cambiable.removeAll();
        Pnl_Cambiable.add(venta, BorderLayout.CENTER);
        Pnl_Cambiable.revalidate();
        Pnl_Cambiable.repaint();
    }//GEN-LAST:event_Txt_ProveedorMouseClicked

    private void Txt_AcercadeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Txt_AcercadeMouseClicked

    }//GEN-LAST:event_Txt_AcercadeMouseClicked

    private void Txt_BoletasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Txt_BoletasMouseClicked
        Pnl_Boleta boleta = new Pnl_Boleta();
        boleta.setSize(720, 650);
        boleta.setLocation(5, 5);

        Pnl_Cambiable.removeAll();
        Pnl_Cambiable.add(boleta, BorderLayout.CENTER);
        Pnl_Cambiable.revalidate();
        Pnl_Cambiable.repaint();
    }//GEN-LAST:event_Txt_BoletasMouseClicked

    private void Txt_CerrarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Txt_CerrarSesionMouseClicked
         
        Login login = new Login();
        this.dispose();
        login.setVisible(true);
    }//GEN-LAST:event_Txt_CerrarSesionMouseClicked

    private void Txt_CerrarSesionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Txt_CerrarSesionMouseEntered
        Pnl_CerrarSesion.setBackground(new Color(255,0,0));
        Txt_CerrarSesion.setForeground(Color.white);
    }//GEN-LAST:event_Txt_CerrarSesionMouseEntered

    private void Txt_CerrarSesionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Txt_CerrarSesionMouseExited
        Pnl_CerrarSesion.setBackground(Color.white);
        Txt_CerrarSesion.setForeground(new Color(255,0,0));
    }//GEN-LAST:event_Txt_CerrarSesionMouseExited

    private void Txt_CerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Txt_CerrarMouseClicked
        this.dispose(); // METODO PARA CERRAR LOS PANELES, SIN CERRAR TODO EL PROGRAMA

    }//GEN-LAST:event_Txt_CerrarMouseClicked

    private void Txt_CerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Txt_CerrarMouseEntered
        Pnl_Cerrar.setBackground(Color.red);
    }//GEN-LAST:event_Txt_CerrarMouseEntered

    private void Txt_CerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Txt_CerrarMouseExited
        Pnl_Cerrar.setBackground(new Color(242,146,69));
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

    private void Txt_Cerrar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Txt_Cerrar1MouseClicked
        this.dispose(); // METODO PARA CERRAR LOS PANELES, SIN CERRAR TODO EL PROGRAMA

    }//GEN-LAST:event_Txt_Cerrar1MouseClicked

    private void Txt_Cerrar1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Txt_Cerrar1MouseEntered
        Pnl_Cerrar.setBackground(Color.red);
    }//GEN-LAST:event_Txt_Cerrar1MouseEntered

    private void Txt_Cerrar1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Txt_Cerrar1MouseExited
        Pnl_Cerrar.setBackground(new Color(242,146,69));
    }//GEN-LAST:event_Txt_Cerrar1MouseExited

    private void Txt_FacturaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Txt_FacturaMouseClicked
        // TODO add your handling code here:
        Pnl_Factura factura = new Pnl_Factura();
        factura.setSize(720, 650);
        factura.setLocation(5, 5);

        Pnl_Cambiable.removeAll();
        Pnl_Cambiable.add(factura, BorderLayout.CENTER);
        Pnl_Cambiable.revalidate();
        Pnl_Cambiable.repaint();
    }//GEN-LAST:event_Txt_FacturaMouseClicked

    private void Btn_ProveedorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_ProveedorMouseEntered
        Btn_Proveedor.setBackground(new Color(242,133,36));
    }//GEN-LAST:event_Btn_ProveedorMouseEntered

    private void Btn_ProveedorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_ProveedorMouseExited
        Btn_Proveedor.setBackground(new Color(242,146,69));
    }//GEN-LAST:event_Btn_ProveedorMouseExited

    private void Txt_ProveedorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Txt_ProveedorMouseEntered
        Btn_Proveedor.setBackground(new Color(242,133,36));
    }//GEN-LAST:event_Txt_ProveedorMouseEntered

    private void Txt_ProveedorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Txt_ProveedorMouseExited
        Btn_Proveedor.setBackground(new Color(242,146,69));
    }//GEN-LAST:event_Txt_ProveedorMouseExited

    private void Txt_EmpleadosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Txt_EmpleadosMouseEntered
        Btn_Empleados.setBackground(new Color(242,133,36));
    }//GEN-LAST:event_Txt_EmpleadosMouseEntered

    private void Txt_EmpleadosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Txt_EmpleadosMouseExited
        Btn_Empleados.setBackground(new Color(242,146,69));
    }//GEN-LAST:event_Txt_EmpleadosMouseExited

    private void Txt_ClientesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Txt_ClientesMouseEntered
        Btn_Clientes.setBackground(new Color(242,133,36));
    }//GEN-LAST:event_Txt_ClientesMouseEntered

    private void Txt_ClientesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Txt_ClientesMouseExited
        Btn_Clientes.setBackground(new Color(242,146,69));
    }//GEN-LAST:event_Txt_ClientesMouseExited

    private void Txt_ProductosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Txt_ProductosMouseEntered
        Btn_Productos.setBackground(new Color(242,133,36));
    }//GEN-LAST:event_Txt_ProductosMouseEntered

    private void Txt_ProductosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Txt_ProductosMouseExited
        Btn_Productos.setBackground(new Color(242,146,69));
    }//GEN-LAST:event_Txt_ProductosMouseExited

    private void Txt_BoletasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Txt_BoletasMouseEntered
        Btn_Boletas.setBackground(new Color(242,133,36));
    }//GEN-LAST:event_Txt_BoletasMouseEntered

    private void Txt_BoletasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Txt_BoletasMouseExited
        Btn_Boletas.setBackground(new Color(242,146,69));
    }//GEN-LAST:event_Txt_BoletasMouseExited

    private void Txt_FacturaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Txt_FacturaMouseEntered
        Btn_Factura.setBackground(new Color(242,133,36));
    }//GEN-LAST:event_Txt_FacturaMouseEntered

    private void Txt_FacturaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Txt_FacturaMouseExited
        Btn_Factura.setBackground(new Color(242,146,69));
    }//GEN-LAST:event_Txt_FacturaMouseExited

    private void Txt_ClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Txt_ClientesMouseClicked
        Pnl_Cliente cliente = new Pnl_Cliente();
        cliente.setSize(720, 650);
        cliente.setLocation(5, 5);

        Pnl_Cambiable.removeAll();
        Pnl_Cambiable.add(cliente, BorderLayout.CENTER);
        Pnl_Cambiable.revalidate();
        Pnl_Cambiable.repaint();
    }//GEN-LAST:event_Txt_ClientesMouseClicked

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
            java.util.logging.Logger.getLogger(Menu_emp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_emp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_emp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_emp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_emp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Btn_Boletas;
    private javax.swing.JPanel Btn_Clientes;
    private javax.swing.JPanel Btn_Empleados;
    private javax.swing.JPanel Btn_Factura;
    private javax.swing.JPanel Btn_Productos;
    private javax.swing.JPanel Btn_Proveedor;
    public static javax.swing.JPanel Pnl_Cambiable;
    private javax.swing.JPanel Pnl_Cerrar;
    private javax.swing.JPanel Pnl_CerrarSesion;
    private javax.swing.JPanel Pnl_Opciones;
    private javax.swing.JPanel Pnl_Principal;
    private javax.swing.JPanel Pnl_Superior;
    private javax.swing.JLabel Txt_Acercade;
    private javax.swing.JLabel Txt_Boletas;
    private javax.swing.JLabel Txt_Cerrar;
    private javax.swing.JLabel Txt_Cerrar1;
    private javax.swing.JLabel Txt_CerrarSesion;
    private javax.swing.JLabel Txt_Clientes;
    private javax.swing.JLabel Txt_Empleados;
    private javax.swing.JLabel Txt_Factura;
    private javax.swing.JLabel Txt_Productos;
    private javax.swing.JLabel Txt_Proveedor;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
