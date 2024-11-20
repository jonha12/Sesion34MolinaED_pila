package vista;

import java.util.ArrayList;
import poo.Cliente;
import poo.Proveedor;
import poo.Producto;
import conexion.ConectarBD;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import oracle.jdbc.driver.OracleDriver;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSetMetaData;
import java.sql.PreparedStatement;
import com.lowagie.text.Document;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Sistema extends javax.swing.JFrame {

    ArrayList<Cliente> listaCliente = new ArrayList<>();
    ArrayList<Proveedor> listaProvedor = new ArrayList<>();
    ArrayList<Producto> listaProducto = new ArrayList<>();
    Cliente ingresoCliente;
    Proveedor ingresoProvedor;
    Producto ingresaProducto;
    ConectarBD con = new ConectarBD();
    DefaultTableModel tablacliente = new DefaultTableModel();
    DefaultTableModel tablaproveedor = new DefaultTableModel();
    DefaultTableModel tablaproducto = new DefaultTableModel();
    DefaultTableModel tablaventa = new DefaultTableModel();

    int item;
    double totalpagar = 0.0;

    public Sistema() {
        initComponents();
        this.setLocationRelativeTo(null);
        tablacliente.addColumn("folio");
        tablacliente.addColumn("nombre");
        tablacliente.addColumn("telefono");
        tablacliente.addColumn("direccion");
        TableCliente.setModel(tablacliente);
        this.setLocationRelativeTo(null);
        tablaproveedor.addColumn("folio");
        tablaproveedor.addColumn("nombre");
        tablaproveedor.addColumn("telefono");
        tablaproveedor.addColumn("direccion");
        TableProveedor.setModel(tablaproveedor);
        this.setLocationRelativeTo(null);
        tablaproducto.addColumn("codigo");
        tablaproducto.addColumn("descripcion");
        tablaproducto.addColumn("cantidad");
        tablaproducto.addColumn("precio");;
        TableProducto.setModel(tablaproducto);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtFolioCliente = new javax.swing.JTextField();
        txtNombreClientes = new javax.swing.JTextField();
        txtTelefonoCliente = new javax.swing.JTextField();
        txtDireccionCliente = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        TableCliente = new javax.swing.JTable();
        btnGuardarCliente = new javax.swing.JButton();
        btnEditarCliente = new javax.swing.JButton();
        btnEliminarCliente = new javax.swing.JButton();
        btnNuevoCliente = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        txtCodigoProducto = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        txtDescripcionProducto = new javax.swing.JTextField();
        txtCantidadProducto = new javax.swing.JTextField();
        txtPrecioProducto = new javax.swing.JTextField();
        btnGuardarProducto = new javax.swing.JButton();
        btnElimnarProducto = new javax.swing.JButton();
        btnNuevoProducto = new javax.swing.JButton();
        btnActualizarProducto = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        TableProducto = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        TableVentas = new javax.swing.JTable();
        btnPdfVentas = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jTextField22 = new javax.swing.JTextField();
        jTextField23 = new javax.swing.JTextField();
        jTextField24 = new javax.swing.JTextField();
        jTextField25 = new javax.swing.JTextField();
        jTextField26 = new javax.swing.JTextField();
        jButton22 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        txtFolioProveedor = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtNombreProveedor = new javax.swing.JTextField();
        txtTelefonoProveedor = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtDireccionProvedor = new javax.swing.JTextField();
        btnEliminarProvedor = new javax.swing.JButton();
        btnGuardarProveedor = new javax.swing.JButton();
        btnActualizarProvedor = new javax.swing.JButton();
        btnNuevoProvedor = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        TableProveedor = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnEliminarVenta = new javax.swing.JButton();
        txtCodigoVenta = new javax.swing.JTextField();
        txtDescripcionVenta = new javax.swing.JTextField();
        txtCantidadVenta = new javax.swing.JTextField();
        txtPrecioVenta = new javax.swing.JTextField();
        txtDisponible = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableVenta = new javax.swing.JTable();
        txtNombreCliente = new javax.swing.JTextField();
        txtFolioVenta = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnGenerarVenta = new javax.swing.JButton();
        LabelTotal = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtTefono = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Nventa.png"))); // NOI18N
        jButton1.setText("SISTEMA VENTA");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/producto.png"))); // NOI18N
        jButton2.setText("ALTA PRODUCTO");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Clientes.png"))); // NOI18N
        jButton3.setText("CLIENTES");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/proveedor.png"))); // NOI18N
        jButton4.setText("PROVEDORES");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Carrito-de-compras.png"))); // NOI18N
        jButton5.setText("VENTAS TOTALES");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/config.png"))); // NOI18N
        jButton6.setText("CONFG");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(10, 10, 10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addGap(18, 18, 18)
                .addComponent(jButton5)
                .addGap(18, 18, 18)
                .addComponent(jButton6)
                .addGap(47, 47, 47))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 540));

        jPanel8.setBackground(new java.awt.Color(102, 255, 153));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("SISTEMA VENTAS");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(83, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 660, 130));

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 153));
        jTabbedPane1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setText("FOLIO");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setText("NOMBRE");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setText("TELEFONO");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel15.setText("DIRECCION");

        txtFolioCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFolioClienteActionPerformed(evt);
            }
        });

        TableCliente.setBackground(new java.awt.Color(255, 255, 153));
        TableCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "FOLIO", "NOMBRE", "TELEFONO", "DIRECCION"
            }
        ));
        TableCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableClienteMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TableCliente);

        btnGuardarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/GuardarTodo.png"))); // NOI18N
        btnGuardarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.N_RESIZE_CURSOR));
        btnGuardarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarClienteActionPerformed(evt);
            }
        });

        btnEditarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Actualizar (2).png"))); // NOI18N
        btnEditarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.N_RESIZE_CURSOR));
        btnEditarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarClienteActionPerformed(evt);
            }
        });

        btnEliminarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminar.png"))); // NOI18N
        btnEliminarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.N_RESIZE_CURSOR));
        btnEliminarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarClienteActionPerformed(evt);
            }
        });

        btnNuevoCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nuevo.png"))); // NOI18N
        btnNuevoCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.N_RESIZE_CURSOR));
        btnNuevoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoClienteActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setText("Sistema Ventas");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtDireccionCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                            .addComponent(txtTelefonoCliente, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombreClientes, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFolioCliente, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnGuardarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                            .addComponent(btnEliminarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEditarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNuevoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtFolioCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtNombreClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtTelefonoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtDireccionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGuardarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(btnEditarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEliminarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNuevoCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE))
                .addGap(97, 97, 97))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab2", jPanel3);

        txtCodigoProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoProductoActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel22.setText("CODIGO");

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel23.setText("DESCRIPCION");

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel24.setText("CANTIDAD");

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel25.setText("PRECIO");

        btnGuardarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/GuardarTodo.png"))); // NOI18N
        btnGuardarProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.N_RESIZE_CURSOR));
        btnGuardarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarProductoActionPerformed(evt);
            }
        });

        btnElimnarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminar.png"))); // NOI18N
        btnElimnarProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.N_RESIZE_CURSOR));
        btnElimnarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElimnarProductoActionPerformed(evt);
            }
        });

        btnNuevoProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nuevo.png"))); // NOI18N
        btnNuevoProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.N_RESIZE_CURSOR));
        btnNuevoProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoProductoActionPerformed(evt);
            }
        });

        btnActualizarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Actualizar (2).png"))); // NOI18N
        btnActualizarProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.N_RESIZE_CURSOR));
        btnActualizarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarProductoActionPerformed(evt);
            }
        });

        TableProducto.setBackground(new java.awt.Color(255, 255, 153));
        TableProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "DESCRIPCION", "CANTIDAD", "PRECIO"
            }
        ));
        TableProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableProductoMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(TableProducto);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnGuardarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnElimnarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnActualizarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNuevoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22)
                            .addComponent(jLabel23)
                            .addComponent(jLabel24)
                            .addComponent(jLabel25))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCodigoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDescripcionProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCantidadProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPrecioProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(txtCodigoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23)
                            .addComponent(txtDescripcionProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24)
                            .addComponent(txtCantidadProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25)
                            .addComponent(txtPrecioProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(62, 62, 62)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnGuardarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnActualizarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnElimnarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnNuevoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab4", jPanel5);

        TableVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "CLIENTE", "VENDEDOR", "TOTAL"
            }
        ));
        jScrollPane5.setViewportView(TableVentas);

        btnPdfVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/compras.png"))); // NOI18N
        btnPdfVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPdfVentasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 619, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnPdfVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(292, 292, 292))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(btnPdfVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        jTabbedPane1.addTab("tab5", jPanel6);

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel27.setText("N°  TIENDA");

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel28.setText("NOMBRE");

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel29.setText("TELEFONO");

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel30.setText("DIRECCION");

        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel31.setText("RFC");

        jTextField22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField22ActionPerformed(evt);
            }
        });

        jTextField23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField23ActionPerformed(evt);
            }
        });

        jButton22.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton22.setText("ACTUALIZAR");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addGap(177, 177, 177)
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 147, Short.MAX_VALUE)
                        .addComponent(jLabel29)
                        .addGap(142, 142, 142))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(94, 94, 94)
                                .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(125, 125, 125)
                                .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(81, 81, 81)
                                .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addComponent(jLabel30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31))
                .addGap(101, 101, 101))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(267, 267, 267)
                .addComponent(jButton22)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(jLabel28)
                    .addComponent(jLabel29))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(jLabel30))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(jButton22)
                .addGap(108, 108, 108))
        );

        jTabbedPane1.addTab("tab6", jPanel7);

        txtFolioProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFolioProveedorActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel17.setText("FOLIO");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel18.setText("NOMBRE");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel19.setText("TELEFONO");

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel20.setText("DIRECCION");

        btnEliminarProvedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminar.png"))); // NOI18N
        btnEliminarProvedor.setCursor(new java.awt.Cursor(java.awt.Cursor.N_RESIZE_CURSOR));
        btnEliminarProvedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarProvedorActionPerformed(evt);
            }
        });

        btnGuardarProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/GuardarTodo.png"))); // NOI18N
        btnGuardarProveedor.setCursor(new java.awt.Cursor(java.awt.Cursor.N_RESIZE_CURSOR));
        btnGuardarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarProveedorActionPerformed(evt);
            }
        });

        btnActualizarProvedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Actualizar (2).png"))); // NOI18N
        btnActualizarProvedor.setCursor(new java.awt.Cursor(java.awt.Cursor.N_RESIZE_CURSOR));
        btnActualizarProvedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarProvedorActionPerformed(evt);
            }
        });

        btnNuevoProvedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nuevo.png"))); // NOI18N
        btnNuevoProvedor.setCursor(new java.awt.Cursor(java.awt.Cursor.N_RESIZE_CURSOR));
        btnNuevoProvedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoProvedorActionPerformed(evt);
            }
        });

        TableProveedor.setBackground(new java.awt.Color(255, 255, 153));
        TableProveedor.setForeground(new java.awt.Color(0, 0, 0));
        TableProveedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "FOLIO", "NOMBRE", "TELEFONO", "DIRECCION"
            }
        ));
        TableProveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableProveedorMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(TableProveedor);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnGuardarProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEliminarProvedor, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnActualizarProvedor, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNuevoProvedor, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19)
                            .addComponent(jLabel20)
                            .addComponent(jLabel17))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtDireccionProvedor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                            .addComponent(txtTelefonoProveedor, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombreProveedor, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFolioProveedor, javax.swing.GroupLayout.Alignment.LEADING))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(txtFolioProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(txtNombreProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(txtTelefonoProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(txtDireccionProvedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(58, 58, 58)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnGuardarProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnActualizarProvedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnEliminarProvedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnNuevoProvedor, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(63, 63, 63))
        );

        jTabbedPane1.addTab("tab3", jPanel4);

        jLabel3.setText("Codigo");

        jLabel4.setText("Descripcion");

        jLabel5.setText("Cantidad");

        jLabel6.setText("Precio");

        jLabel7.setText("Disponibles");

        btnEliminarVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminar.png"))); // NOI18N
        btnEliminarVenta.setText("Eliminar");
        btnEliminarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarVentaActionPerformed(evt);
            }
        });

        txtCodigoVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoVentaActionPerformed(evt);
            }
        });
        txtCodigoVenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodigoVentaKeyPressed(evt);
            }
        });

        txtDescripcionVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescripcionVentaActionPerformed(evt);
            }
        });

        txtCantidadVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadVentaActionPerformed(evt);
            }
        });
        txtCantidadVenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCantidadVentaKeyPressed(evt);
            }
        });

        txtPrecioVenta.setEditable(false);

        txtDisponible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDisponibleActionPerformed(evt);
            }
        });

        TableVenta.setBackground(new java.awt.Color(255, 255, 153));
        TableVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "DESCRIPCION", "CANTIDAD", "PRECIO", "TOTAL"
            }
        ));
        jScrollPane1.setViewportView(TableVenta);

        txtNombreCliente.setEditable(false);

        txtFolioVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFolioVentaActionPerformed(evt);
            }
        });
        txtFolioVenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtFolioVentaKeyPressed(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Carrito-de-compras.png"))); // NOI18N
        jLabel10.setText("TOTAL A PAGAR");

        jLabel8.setText("FOLIO");

        btnGenerarVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/print.png"))); // NOI18N
        btnGenerarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarVentaActionPerformed(evt);
            }
        });

        LabelTotal.setText("------");

        jLabel9.setText("NOMBRE");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel3))
                    .addComponent(txtCodigoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(54, 54, 54)
                        .addComponent(jLabel6)
                        .addGap(58, 58, 58))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtDescripcionVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtCantidadVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtPrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(43, 43, 43)
                        .addComponent(btnEliminarVenta))
                    .addComponent(txtDisponible, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jLabel8))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(txtFolioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel9))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(76, 76, 76)
                        .addComponent(btnGenerarVenta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTefono, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10)
                        .addGap(28, 28, 28)
                        .addComponent(LabelTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 43, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(btnEliminarVenta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDescripcionVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCantidadVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDisponible, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtFolioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(14, 14, 14)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTefono, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnGenerarVenta)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(LabelTotal)
                                .addComponent(jLabel10)))))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab1", jPanel2);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 660, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cargarProveedoresEnComboBox() {

    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jTabbedPane1.setSelectedIndex(5);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtDescripcionVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescripcionVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescripcionVentaActionPerformed

    private void txtCantidadVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadVentaActionPerformed

    private void txtDisponibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDisponibleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDisponibleActionPerformed

    private void btnEliminarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarVentaActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) TableVenta.getModel();
        modelo.removeRow(TableVenta.getSelectedRow());
        TotalPagar();
        txtCodigoVenta.requestFocus();;
    }//GEN-LAST:event_btnEliminarVentaActionPerformed

    private void txtFolioClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFolioClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFolioClienteActionPerformed

    private void btnGenerarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarVentaActionPerformed
        // Ruta donde se generará el PDF
        String filePath = "venta.pdf";

        // Obtener la fecha y hora actuales
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String fechaHoraActual = now.format(formatter);
        // Validar si la tabla está vacía o el folio de venta está vacío
        if (txtFolioVenta.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "El folio de venta está vacío. No se puede generar el PDF.");
            return;  // Salir del método si el folio está vacío
        }

        if (TableVenta.getRowCount() == 0) {
            JOptionPane.showMessageDialog(this, "No hay productos en la venta. No se puede generar el PDF.");
            return;  // Salir del método si la tabla está vacía
        }

        // Crear el documento PDF
        Document document = new Document();

        try {
            // Crear un escritor para generar el PDF
            PdfWriter.getInstance(document, new java.io.FileOutputStream(filePath));
            document.open();

            // Agregar un título al PDF
            document.add(new Paragraph("Detalles de la Venta\n\n"));

            document.add(new Paragraph("Fecha y Hora: " + fechaHoraActual + "\n\n"));

            // Agregar los detalles del cliente y la venta
            String folioVenta = txtFolioVenta.getText();
            String nombreCliente = txtNombreCliente.getText();
            String total = LabelTotal.getText();

            document.add(new Paragraph("Folio de Venta: " + folioVenta));
            document.add(new Paragraph("Cliente: " + nombreCliente));
            document.add(new Paragraph("Total: " + total + "\n\n"));

            // Agregar la tabla de ventas al PDF
            PdfPTable pdfTable = new PdfPTable(TableVenta.getColumnCount());

            // Agregar encabezados de la tabla
            for (int i = 0; i < TableVenta.getColumnCount(); i++) {
                pdfTable.addCell(TableVenta.getColumnName(i));
            }

            // Agregar las filas de la tabla
            for (int rows = 0; rows < TableVenta.getRowCount(); rows++) {
                for (int cols = 0; cols < TableVenta.getColumnCount(); cols++) {
                    Object value = TableVenta.getValueAt(rows, cols);
                    pdfTable.addCell(value != null ? value.toString() : "");
                }
            }

            // Agregar la tabla al documento
            document.add(pdfTable);

            // Mostrar un mensaje de éxito
            javax.swing.JOptionPane.showMessageDialog(this, "PDF generado exitosamente en: " + filePath);

        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Error al generar el PDF: " + e.getMessage());
        } finally {
            document.close();
        }
        // Abrir el PDF al instante
        try {
            java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
            java.io.File pdfFile = new java.io.File(filePath);
            if (pdfFile.exists()) {
                desktop.open(pdfFile);
            } else {
                javax.swing.JOptionPane.showMessageDialog(this, "El archivo no existe.");
            }
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Error al abrir el PDF: " + e.getMessage());
        }
    }//GEN-LAST:event_btnGenerarVentaActionPerformed

    private void txtFolioProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFolioProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFolioProveedorActionPerformed

    private void txtCodigoProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoProductoActionPerformed

    private void btnPdfVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPdfVentasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPdfVentasActionPerformed

    private void jTextField22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField22ActionPerformed

    private void btnNuevoProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoProductoActionPerformed
        TableProducto.setModel(tablaproducto);  // jTable1 es tu componente JTable

// Luego en el código para agregar datos al modelo de la tabla (donde se validan los campos)
        int codigo;
        String nombre = txtDescripcionProducto.getText();
        int cantidad;
        double precio;

// Verificar si alguno de los campos está vacío
        if (nombre.isEmpty()) {
            // Si algún campo está vacío, mostrar un mensaje de advertencia
            JOptionPane.showMessageDialog(null, "Campo vacío, favor de llenar todos los campos.");
        } else {
            try {
                // Si los campos están completos, procesar la inserción
                codigo = Integer.parseInt(txtCodigoProducto.getText());
                cantidad = Integer.parseInt(txtCantidadProducto.getText());
                precio = Double.parseDouble(txtPrecioProducto.getText());
                ingresaProducto = new Producto(codigo, nombre, cantidad, precio);

                // Crear la fila de la tabla
                String[] fila = {String.valueOf(codigo), nombre, String.valueOf(cantidad), String.valueOf(precio)};

                // Agregar la fila al modelo de la tabla
                tablaproducto.addRow(fila);

                // Conectar a la base de datos e insertar el registro
                con.conectarBDOracle();
                String altProduc = "INSERT INTO producto VALUES ('" + ingresaProducto.getCodigo() + "','" + ingresaProducto.getNombre() + "','" + ingresaProducto.getCantidad() + "','" + ingresaProducto.getPrecio() + "')";
                con.stmt.executeUpdate(altProduc);

                // Mostrar mensaje de éxito
                JOptionPane.showMessageDialog(null, "Registro insertado con éxito");

                // Limpiar los campos de texto después de la inserción
                this.txtCodigoProducto.setText(null);
                this.txtDescripcionProducto.setText(null);
                this.txtCantidadProducto.setText(null);
                this.txtPrecioProducto.setText(null);

            } catch (SQLException ex) {
                // Manejo de error en caso de que ocurra un problema al insertar en la base de datos
                JOptionPane.showMessageDialog(null, "Error de BD en el alta\n" + ex);
            } catch (NumberFormatException ex) {
                // Manejo de error en caso de que el Folio no sea un número válido
                JOptionPane.showMessageDialog(null, "El folio debe ser un número entero válido.");
            }
        }
    }//GEN-LAST:event_btnNuevoProductoActionPerformed

    private void btnNuevoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoClienteActionPerformed
        TableCliente.setModel(tablacliente);  // jTable1 es tu componente JTable

// Luego en el código para agregar datos al modelo de la tabla (donde se validan los campos)
        int folio;
        String nombre = txtNombreClientes.getText();
        String telefono = txtTelefonoCliente.getText();
        String direccion = txtDireccionCliente.getText();

// Verificar si alguno de los campos está vacío
        if (nombre.isEmpty() || telefono.isEmpty() || direccion.isEmpty()) {
            // Si algún campo está vacío, mostrar un mensaje de advertencia
            JOptionPane.showMessageDialog(null, "Campo vacío, favor de llenar todos los campos.");
        } else {
            try {
                // Si los campos están completos, procesar la inserción
                folio = Integer.parseInt(txtFolioCliente.getText());
                ingresoCliente = new Cliente(folio, nombre, telefono, direccion);

                // Crear la fila de la tabla
                String[] fila = {String.valueOf(folio), nombre, telefono, direccion};

                // Agregar la fila al modelo de la tabla
                tablacliente.addRow(fila);

                // Conectar a la base de datos e insertar el registro
                con.conectarBDOracle();
                String altCliente = "INSERT INTO clientes VALUES ('" + ingresoCliente.getFolio() + "','" + ingresoCliente.getNombre() + "','" + ingresoCliente.getTelefono() + "','" + ingresoCliente.getDireccion() + "')";
                con.stmt.executeUpdate(altCliente);

                // Mostrar mensaje de éxito
                JOptionPane.showMessageDialog(null, "Registro insertado con éxito");

                // Limpiar los campos de texto después de la inserción
                this.txtFolioCliente.setText(null);
                this.txtNombreClientes.setText(null);
                this.txtTelefonoCliente.setText(null);
                this.txtDireccionCliente.setText(null);

            } catch (SQLException ex) {
                // Manejo de error en caso de que ocurra un problema al insertar en la base de datos
                JOptionPane.showMessageDialog(null, "Error de BD en el alta\n" + ex);
            } catch (NumberFormatException ex) {
                // Manejo de error en caso de que el Folio no sea un número válido
                JOptionPane.showMessageDialog(null, "El folio debe ser un número entero válido.");
            }
        }

    }//GEN-LAST:event_btnNuevoClienteActionPerformed

    private void btnEliminarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarClienteActionPerformed
        int confirmaBaja;
        try {
            con.conectarBDOracle();
            int bajaCliente = Integer.parseInt(txtFolioCliente.getText());
            confirmaBaja = con.stmt.executeUpdate("DELETE FROM clientes WHERE folio ='" + bajaCliente + "'");

            if (this.TableCliente.getSelectedRow() >= 0) {
                tablacliente = (DefaultTableModel) TableCliente.getModel();
                int r = JOptionPane.showConfirmDialog(this, "¿Deseas emilinar?", "Mensaje importante", JOptionPane.YES_NO_OPTION);
                if (r == JOptionPane.YES_OPTION) {
                    tablacliente.removeRow(TableCliente.getSelectedRow());
                    if (confirmaBaja == 1) {

                        this.txtFolioCliente.setText(null);
                        this.txtNombreClientes.setText(null);
                        this.txtTelefonoCliente.setText(null);
                        this.txtFolioCliente.setText(null);
                        this.txtDireccionCliente.setText(null);
                    }
                } else {

                }

            } else {
                JOptionPane.showMessageDialog(null, "Error  de sistema  no se encontro \n"
                        + "El Folio De cliente" + bajaCliente);

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error 3 de BD baja\n" + e);

        }
    }//GEN-LAST:event_btnEliminarClienteActionPerformed

    private void TableClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableClienteMouseClicked
        int seleccion = TableCliente.getSelectedRow();
        this.txtFolioCliente.setText(TableCliente.getValueAt(seleccion, 0).toString());
        this.txtNombreClientes.setText(TableCliente.getValueAt(seleccion, 1).toString());
        this.txtTelefonoCliente.setText(TableCliente.getValueAt(seleccion, 2).toString());
        this.txtDireccionCliente.setText(TableCliente.getValueAt(seleccion, 3).toString());
        int fila = seleccion;
    }//GEN-LAST:event_TableClienteMouseClicked

    private void btnEditarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarClienteActionPerformed
        try {
            con.conectarBDOracle();
            DefaultTableModel modeloUsuario = new DefaultTableModel();

            this.TableCliente.setModel(modeloUsuario);

            con.rs = con.stmt.executeQuery("select * from clientes");

            ResultSetMetaData rsmd = con.rs.getMetaData();
            int cantidadColumnas = rsmd.getColumnCount();

            modeloUsuario.addColumn("folio");
            modeloUsuario.addColumn("nombre");
            modeloUsuario.addColumn("telefono");
            modeloUsuario.addColumn("direccion");

            while (con.rs.next()) {
                Object[] fila = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    fila[i] = con.rs.getObject(i + 1);
                }
                modeloUsuario.addRow(fila);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error 2. de BD Consultas\n" + e);
        }


    }//GEN-LAST:event_btnEditarClienteActionPerformed

    private void btnGuardarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarClienteActionPerformed
        try {
            // Conectar a la base de datos
            con.conectarBDOracle();

            // Verificar que el campo de folio no esté vacío antes de convertirlo
            if (txtFolioCliente.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "El campo de folio no puede estar vacío.");
                return;
            }

            // Obtener los valores actualizados desde los campos de texto
            int folioCliente = Integer.parseInt(txtFolioCliente.getText().trim());
            String nuevoNombre = txtNombreClientes.getText().trim();
            String nuevoTelefono = txtTelefonoCliente.getText().trim();
            String nuevaDireccion = txtDireccionCliente.getText().trim();

            // Validar que los campos no estén vacíos
            if (nuevoNombre.isEmpty() || nuevoTelefono.isEmpty() || nuevaDireccion.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Todos los campos deben ser completados.");
                return;
            }

            // Crear la consulta SQL de actualización
            String sqlUpdate = "UPDATE clientes SET nombre = ?, telefono = ?, direccion = ? WHERE folio = ?";
            PreparedStatement ps = con.getConnection().prepareStatement(sqlUpdate);
            ps.setString(1, nuevoNombre);
            ps.setString(2, nuevoTelefono);
            ps.setString(3, nuevaDireccion);
            ps.setInt(4, folioCliente);

            // Ejecutar la actualización en la base de datos
            int confirmaEdicion = ps.executeUpdate();

            // Si la edición fue exitosa en la base de datos
            if (confirmaEdicion == 1) {
                if (this.TableCliente.getSelectedRow() >= 0) {
                    tablacliente = (DefaultTableModel) TableCliente.getModel();
                    int filaSeleccionada = TableCliente.getSelectedRow();

                    // Confirmar la edición en la tabla
                    int r = JOptionPane.showConfirmDialog(this, "¿Deseas editar el registro?", "Mensaje importante", JOptionPane.YES_NO_OPTION);
                    if (r == JOptionPane.YES_OPTION) {
                        // Actualizar los valores en la tabla
                        tablacliente.setValueAt(nuevoNombre, filaSeleccionada, 1); // Suponiendo que la columna 1 es nombre
                        tablacliente.setValueAt(nuevoTelefono, filaSeleccionada, 2); // Suponiendo que la columna 2 es teléfono
                        tablacliente.setValueAt(nuevaDireccion, filaSeleccionada, 3); // Suponiendo que la columna 3 es dirección

                        // Limpiar los campos de texto
                        this.txtFolioCliente.setText(null);
                        this.txtNombreClientes.setText(null);
                        this.txtTelefonoCliente.setText(null);
                        this.txtDireccionCliente.setText(null);

                        JOptionPane.showMessageDialog(this, "El cliente fue editado correctamente.");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Error de sistema: no se encontró el folio de cliente " + folioCliente);
                }
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró el cliente en la base de datos con el folio proporcionado.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de base de datos: " + e.getMessage());
        }


    }//GEN-LAST:event_btnGuardarClienteActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        jTabbedPane1.setSelectedIndex(3);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jTabbedPane1.setSelectedIndex(4);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnGuardarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarProveedorActionPerformed
        try {
            // Conectar a la base de datos
            con.conectarBDOracle();

            // Verificar que el campo de folio no esté vacío antes de convertirlo
            if (txtFolioProveedor.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "El campo de folio no puede estar vacío.");
                return;
            }

            // Obtener los valores actualizados desde los campos de texto
            int folioCliente = Integer.parseInt(txtFolioProveedor.getText().trim());
            String nuevoNombre = txtNombreProveedor.getText().trim();
            String nuevoTelefono = txtTelefonoProveedor.getText().trim();
            String nuevaDireccion = txtDireccionProvedor.getText().trim();

            // Validar que los campos no estén vacíos
            if (nuevoNombre.isEmpty() || nuevoTelefono.isEmpty() || nuevaDireccion.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Todos los campos deben ser completados.");
                return;
            }

            // Crear la consulta SQL de actualización
            String sqlUpdate = "UPDATE proveedores SET nombre = ?, telefono = ?, direccion = ? WHERE folio = ?";
            PreparedStatement ps = con.getConnection().prepareStatement(sqlUpdate);
            ps.setString(1, nuevoNombre);
            ps.setString(2, nuevoTelefono);
            ps.setString(3, nuevaDireccion);
            ps.setInt(4, folioCliente);

            // Ejecutar la actualización en la base de datos
            int confirmaEdicion = ps.executeUpdate();

            // Si la edición fue exitosa en la base de datos
            if (confirmaEdicion == 1) {
                if (this.TableProveedor.getSelectedRow() >= 0) {
                    tablaproveedor = (DefaultTableModel) TableProveedor.getModel();
                    int filaSeleccionada = TableProveedor.getSelectedRow();

                    // Confirmar la edición en la tabla
                    int r = JOptionPane.showConfirmDialog(this, "¿Deseas editar el registro?", "Mensaje importante", JOptionPane.YES_NO_OPTION);
                    if (r == JOptionPane.YES_OPTION) {
                        // Actualizar los valores en la tabla
                        tablaproveedor.setValueAt(nuevoNombre, filaSeleccionada, 1); // Suponiendo que la columna 1 es nombre
                        tablaproveedor.setValueAt(nuevoTelefono, filaSeleccionada, 2); // Suponiendo que la columna 2 es teléfono
                        tablaproveedor.setValueAt(nuevaDireccion, filaSeleccionada, 3); // Suponiendo que la columna 3 es dirección

                        // Limpiar los campos de texto
                        this.txtFolioProveedor.setText(null);
                        this.txtNombreProveedor.setText(null);
                        this.txtTelefonoProveedor.setText(null);
                        this.txtDireccionProvedor.setText(null);

                        JOptionPane.showMessageDialog(this, "El cliente fue editado correctamente.");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Error de sistema: no se encontró el folio de cliente " + folioCliente);
                }
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró el cliente en la base de datos con el folio proporcionado.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de base de datos: " + e.getMessage());
        }

    }//GEN-LAST:event_btnGuardarProveedorActionPerformed

    private void btnNuevoProvedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoProvedorActionPerformed
        TableProveedor.setModel(tablaproveedor);  // jTable1 es tu componente JTable

// Luego en el código para agregar datos al modelo de la tabla (donde se validan los campos)
        int folio;
        String nombre = txtNombreProveedor.getText();
        String telefono = txtTelefonoProveedor.getText();
        String direccion = txtDireccionProvedor.getText();

// Verifica si los campos no están vacíos
        if (nombre.isEmpty() || telefono.isEmpty() || direccion.isEmpty()) {
            // Si algún campo está vacío, muestra un mensaje de advertencia
            JOptionPane.showMessageDialog(null, "Campo vacío, favor de llenar todos los campos.");
        } else {
            try {
                // Crea un objeto Proveedor con los datos ingresados
                folio = Integer.parseInt(txtFolioProveedor.getText());  // Solo si Folio no es autoincremental
                ingresoProvedor = new Proveedor(folio, nombre, telefono, direccion);

                // Crea la fila en la tabla
                String[] fila = {String.valueOf(folio), nombre, telefono, direccion};
                tablaproveedor.addRow(fila);  // Agrega la fila al modelo de la tabla

                // Conectar a la base de datos
                con.conectarBDOracle();

                // Si Folio es autoincremental, omítelo del INSERT
                String altProveedor = "INSERT INTO proveedores (folio,nombre, telefono, direccion) VALUES ('"
                        + ingresoProvedor.getFolio() + "', '"
                        + ingresoProvedor.getNombre() + "', '"
                        + ingresoProvedor.getTelefono() + "', '"
                        + ingresoProvedor.getDireccion() + "')";

                // Usar Statement para ejecutar la consulta
                con.stmt.executeUpdate(altProveedor);

                // Mostrar mensaje de éxito
                JOptionPane.showMessageDialog(null, "Registro insertado con éxito");

                // Limpiar los campos de texto después de la inserción
                this.txtFolioProveedor.setText(null);
                this.txtNombreProveedor.setText(null);
                this.txtTelefonoProveedor.setText(null);
                this.txtDireccionProvedor.setText(null);

            } catch (SQLException ex) {
                // Manejo de error si ocurre un problema al insertar en la base de datos
                JOptionPane.showMessageDialog(null, "Error de BD en el alta\n" + ex);
            } catch (NumberFormatException ex) {
                // Manejo de error si el Folio no es un número válido
                JOptionPane.showMessageDialog(null, "El folio debe ser un número entero válido.");
            }
        }
    }//GEN-LAST:event_btnNuevoProvedorActionPerformed

    private void btnEliminarProvedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProvedorActionPerformed
        int confirmaBaja;
        try {
            // Conectar a la base de datos
            con.conectarBDOracle();

            // Obtener el Folio del proveedor desde el campo de texto
            int bajaProveedor = Integer.parseInt(txtFolioProveedor.getText());

            // Confirmación antes de proceder con la eliminación
            int r = JOptionPane.showConfirmDialog(this, "¿Deseas eliminar este proveedor?",
                    "Mensaje importante", JOptionPane.YES_NO_OPTION);

            if (r == JOptionPane.YES_OPTION) {
                // Ejecutar la consulta DELETE para eliminar el proveedor con el Folio proporcionado
                confirmaBaja = con.stmt.executeUpdate("DELETE FROM proveedores WHERE folio ='" + bajaProveedor + "'");

                // Verificar si la eliminación fue exitosa
                if (confirmaBaja == 1) {
                    // Si se eliminó correctamente, eliminar también la fila en la tabla de la interfaz gráfica
                    if (this.TableProveedor.getSelectedRow() >= 0) {
                        tablaproveedor = (DefaultTableModel) TableProveedor.getModel();
                        tablaproveedor.removeRow(TableProveedor.getSelectedRow());

                        // Limpiar los campos de texto después de la eliminación
                        this.txtFolioProveedor.setText(null);
                        this.txtNombreProveedor.setText(null);
                        this.txtTelefonoProveedor.setText(null);
                        this.txtDireccionProvedor.setText(null);

                        // Mostrar mensaje de éxito
                        JOptionPane.showMessageDialog(null, "Proveedor eliminado con éxito.");
                    }
                } else {
                    // Si no se pudo eliminar (ningún registro afectado), mostrar mensaje de error
                    JOptionPane.showMessageDialog(null, "No se pudo eliminar el proveedor con Folio: " + bajaProveedor);
                }
            } else {
                // Si el usuario cancela la eliminación
                JOptionPane.showMessageDialog(null, "Eliminación cancelada.");
            }

        } catch (SQLException e) {
            // Manejo de errores relacionados con la base de datos
            JOptionPane.showMessageDialog(null, "Error de BD al intentar eliminar el proveedor.\n" + e);
        } catch (NumberFormatException e) {
            // Manejo de errores en caso de que el folio no sea un número válido
            JOptionPane.showMessageDialog(null, "El folio debe ser un número entero válido.");
        }
    }//GEN-LAST:event_btnEliminarProvedorActionPerformed

    private void TableProveedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableProveedorMouseClicked
        int seleccion = TableProveedor.getSelectedRow();
        this.txtFolioProveedor.setText(TableProveedor.getValueAt(seleccion, 0).toString());
        this.txtNombreProveedor.setText(TableProveedor.getValueAt(seleccion, 1).toString());
        this.txtTelefonoProveedor.setText(TableProveedor.getValueAt(seleccion, 2).toString());
        this.txtDireccionProvedor.setText(TableProveedor.getValueAt(seleccion, 3).toString());
        int fila = seleccion;
    }//GEN-LAST:event_TableProveedorMouseClicked

    private void btnActualizarProvedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarProvedorActionPerformed
        try {
            con.conectarBDOracle();
            DefaultTableModel modeloProveedor = new DefaultTableModel();

            this.TableProveedor.setModel(modeloProveedor);

            con.rs = con.stmt.executeQuery("select * from proveedores");

            ResultSetMetaData rsmd = con.rs.getMetaData();
            int cantidadColumnas = rsmd.getColumnCount();

            modeloProveedor.addColumn("folio");
            modeloProveedor.addColumn("nombre");
            modeloProveedor.addColumn("telefono");
            modeloProveedor.addColumn("direccion");

            while (con.rs.next()) {
                Object[] fila = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    fila[i] = con.rs.getObject(i + 1);
                }
                modeloProveedor.addRow(fila);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error 2. de BD Consultas\n" + e);
        }

    }//GEN-LAST:event_btnActualizarProvedorActionPerformed

    private void btnActualizarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarProductoActionPerformed
        try {
            con.conectarBDOracle();
            DefaultTableModel modeloProducto = new DefaultTableModel();

            this.TableProducto.setModel(modeloProducto);

            con.rs = con.stmt.executeQuery("select * from producto");

            ResultSetMetaData rsmd = con.rs.getMetaData();
            int cantidadColumnas = rsmd.getColumnCount();

            modeloProducto.addColumn("CODIGO");
            modeloProducto.addColumn("DESCRIPCION");
            modeloProducto.addColumn("CANTIDAD");
            modeloProducto.addColumn("PRECIO");

            while (con.rs.next()) {
                Object[] fila = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    fila[i] = con.rs.getObject(i + 1);
                }
                modeloProducto.addRow(fila);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error 2. de BD Consultas\n" + e);
        }
    }//GEN-LAST:event_btnActualizarProductoActionPerformed

    private void TableProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableProductoMouseClicked
        int seleccion = TableProducto.getSelectedRow();
        this.txtCodigoProducto.setText(TableProducto.getValueAt(seleccion, 0).toString());
        this.txtDescripcionProducto.setText(TableProducto.getValueAt(seleccion, 1).toString());
        this.txtCantidadProducto.setText(TableProducto.getValueAt(seleccion, 2).toString());
        this.txtPrecioProducto.setText(TableProducto.getValueAt(seleccion, 3).toString());
        int fila = seleccion;
    }//GEN-LAST:event_TableProductoMouseClicked

    private void btnGuardarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarProductoActionPerformed
        try {
            // Conectar a la base de datos
            con.conectarBDOracle();

            // Verificar que el campo de folio no esté vacío antes de convertirlo
            if (txtCodigoProducto.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "El campo de folio no puede estar vacío.");
                return;
            }

            // Obtener los valores actualizados desde los campos de texto
            int codigoproducto = Integer.parseInt(txtCodigoProducto.getText().trim());
            String nuevoNombre = txtDescripcionProducto.getText().trim();
            int cantidad = Integer.parseInt(txtCantidadProducto.getText().trim());
            double precio = Double.parseDouble(txtPrecioProducto.getText().trim());

            // Validar que los campos no estén vacíos
            if (nuevoNombre.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Todos los campos deben ser completados.");
                return;
            }

            // Crear la consulta SQL de actualización
            String sqlUpdate = "UPDATE producto SET nombre = ?, disponible = ?, precio = ? WHERE codigo = ?";
            PreparedStatement ps = con.getConnection().prepareStatement(sqlUpdate);
            ps.setString(1, nuevoNombre);
            ps.setInt(2, cantidad);
            ps.setDouble(3, precio);
            ps.setInt(4, codigoproducto);

            // Ejecutar la actualización en la base de datos
            int confirmaEdicion = ps.executeUpdate();

            // Si la edición fue exitosa en la base de datos
            if (confirmaEdicion == 1) {
                if (this.TableProducto.getSelectedRow() >= 0) {
                    tablaproducto = (DefaultTableModel) TableProducto.getModel();
                    int filaSeleccionada = TableProducto.getSelectedRow();

                    // Confirmar la edición en la tabla
                    int r = JOptionPane.showConfirmDialog(this, "¿Deseas editar el registro?", "Mensaje importante", JOptionPane.YES_NO_OPTION);
                    if (r == JOptionPane.YES_OPTION) {
                        // Actualizar los valores en la tabla
                        tablaproducto.setValueAt(nuevoNombre, filaSeleccionada, 1); // Suponiendo que la columna 1 es nombre
                        tablaproducto.setValueAt(cantidad, filaSeleccionada, 2); // Suponiendo que la columna 2 es teléfono
                        tablaproducto.setValueAt(precio, filaSeleccionada, 3); // Suponiendo que la columna 3 es dirección

                        // Limpiar los campos de texto
                        this.txtCodigoProducto.setText(null);
                        this.txtDescripcionProducto.setText(null);
                        this.txtCantidadProducto.setText(null);
                        this.txtPrecioProducto.setText(null);

                        JOptionPane.showMessageDialog(this, "El cliente fue editado correctamente.");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Error de sistema: no se encontró el cdigo del producto " + codigoproducto);
                }
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró el cliente en la base de datos con el folio proporcionado.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de base de datos: " + e.getMessage());
        }

    }//GEN-LAST:event_btnGuardarProductoActionPerformed

    private void btnElimnarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElimnarProductoActionPerformed
        int confirmaBaja;
        try {
            // Conectar a la base de datos
            con.conectarBDOracle();

            // Obtener el Folio del proveedor desde el campo de texto
            int bajaProdcuto = Integer.parseInt(txtCodigoProducto.getText());

            // Confirmación antes de proceder con la eliminación
            int r = JOptionPane.showConfirmDialog(this, "¿Deseas eliminar este producto?",
                    "Mensaje importante", JOptionPane.YES_NO_OPTION);

            if (r == JOptionPane.YES_OPTION) {
                // Ejecutar la consulta DELETE para eliminar el proveedor con el Folio proporcionado
                confirmaBaja = con.stmt.executeUpdate("DELETE FROM producto WHERE codigo ='" + bajaProdcuto + "'");

                // Verificar si la eliminación fue exitosa
                if (confirmaBaja == 1) {
                    // Si se eliminó correctamente, eliminar también la fila en la tabla de la interfaz gráfica
                    if (this.TableProducto.getSelectedRow() >= 0) {
                        tablaproducto = (DefaultTableModel) TableProducto.getModel();
                        tablaproducto.removeRow(TableProducto.getSelectedRow());

                        // Limpiar los campos de texto después de la eliminación
                        this.txtCodigoProducto.setText(null);
                        this.txtDescripcionProducto.setText(null);
                        this.txtCantidadProducto.setText(null);
                        this.txtPrecioProducto.setText(null);

                        // Mostrar mensaje de éxito
                        JOptionPane.showMessageDialog(null, "Producto eliminado con éxito.");
                    }
                } else {
                    // Si no se pudo eliminar (ningún registro afectado), mostrar mensaje de error
                    JOptionPane.showMessageDialog(null, "No se pudo eliminar el Producto con Codigo: " + bajaProdcuto);
                }
            } else {
                // Si el usuario cancela la eliminación
                JOptionPane.showMessageDialog(null, "Eliminación cancelada.");
            }

        } catch (SQLException e) {
            // Manejo de errores relacionados con la base de datos
            JOptionPane.showMessageDialog(null, "Error de BD al intentar eliminar el producto.\n" + e);
        } catch (NumberFormatException e) {
            // Manejo de errores en caso de que el folio no sea un número válido
            JOptionPane.showMessageDialog(null, "El codigo debe ser un número entero válido.");
        }
    }//GEN-LAST:event_btnElimnarProductoActionPerformed

    private void txtCodigoVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoVentaActionPerformed

    }//GEN-LAST:event_txtCodigoVentaActionPerformed

    private void txtCodigoVentaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoVentaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                // Conectar a la base de datos
                con.conectarBDOracle();

                // Verificar que el campo de código no esté vacío
                if (txtCodigoVenta.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "El código de producto no puede estar vacío.");
                    return;
                }

                // Obtener el código ingresado
                int codigoProducto = Integer.parseInt(txtCodigoVenta.getText().trim());

                // Crear la consulta SQL para obtener los detalles del producto
                String sqlQuery = "SELECT nombre, disponible, precio FROM producto WHERE codigo = ?";
                PreparedStatement ps = con.getConnection().prepareStatement(sqlQuery);
                ps.setInt(1, codigoProducto);  // Establecer el código del producto en la consulta

                // Ejecutar la consulta
                con.rs = ps.executeQuery();

                // Verificar si se encontró el producto
                if (con.rs.next()) {
                    // Si se encuentra el producto, obtener los valores y asignarlos a los campos de texto
                    String nombreProducto = con.rs.getString("nombre");
                    int cantidadDisponible = con.rs.getInt("disponible");
                    double precioProducto = con.rs.getDouble("precio");

                    // Asignar los valores a los campos de texto
                    txtDescripcionVenta.setText(nombreProducto);
                    txtDisponible.setText(String.valueOf(cantidadDisponible));
                    txtPrecioVenta.setText(String.valueOf(precioProducto));

                    // Opcionalmente, puedes asignar la cantidad de venta a un valor predeterminado, por ejemplo:
                } else {
                    // Si no se encuentra el producto con ese código, mostrar un mensaje
                    JOptionPane.showMessageDialog(this, "Producto no encontrado con el código proporcionado.");
                    txtDescripcionVenta.setText("");
                    txtDisponible.setText("");
                    txtPrecioVenta.setText("");
                    txtCantidadVenta.setText("");  // Limpiar el campo de cantidad
                }

            } catch (SQLException ex) {
                // Manejo de error en caso de que haya problemas con la base de datos
                JOptionPane.showMessageDialog(this, "Error al consultar la base de datos: " + ex.getMessage());
            } catch (NumberFormatException ex) {
                // Manejo de error si el código no es un número válido
                JOptionPane.showMessageDialog(this, "El código de producto debe ser un número válido.");
            }
        }
    }//GEN-LAST:event_txtCodigoVentaKeyPressed

    private void txtCantidadVentaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadVentaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            // Verificar si el campo de cantidad no está vacío
            if (!txtCantidadVenta.getText().trim().isEmpty()) {
                try {
                    // Obtener los valores de los campos
                    String cod = txtCodigoVenta.getText();
                    String Descripcion = txtDescripcionVenta.getText();
                    int cant = Integer.parseInt(txtCantidadVenta.getText());  // Cambié a txtCantidadVenta para la cantidad
                    double precio = Double.parseDouble(txtPrecioVenta.getText());
                    double total = cant * precio;
                    int disponible = Integer.parseInt(txtDisponible.getText());

                    // Validar que la cantidad no sea mayor que la cantidad disponible
                    if (disponible >= cant) {
                        item = item + 1;

                        // Crear el modelo de la tabla y agregar la venta
                        DefaultTableModel modelo = (DefaultTableModel) TableVenta.getModel();

                        for (int i = 0; i < TableVenta.getRowCount(); i++) {
                            if (TableVenta.getValueAt(i, 1).equals(txtDescripcionVenta.getText())) {
                                JOptionPane.showMessageDialog(null, "el producto ya esta registrado");
                                return;
                            }

                        }
                        ArrayList<Object> lista = new ArrayList<>();
                        lista.add(item);
                        lista.add(cod);
                        lista.add(Descripcion);
                        lista.add(cant);
                        lista.add(precio);
                        lista.add(total);

                        // Crear la fila de la tabla
                        Object[] a = new Object[5];  // Asegúrate de que el array tiene el número correcto de elementos

                        a[0] = lista.get(1);  // codigo
                        a[1] = lista.get(2);  // descripcion
                        a[2] = lista.get(3);  // cantidad
                        a[3] = lista.get(4);  // precio
                        a[4] = lista.get(5);  // total

                        // Agregar la fila al modelo de la tabla
                        modelo.addRow(a);
                        TableVenta.setModel(modelo);
                        TotalPagar();
                        Pantalla();
                    } else {
                        // Si la cantidad excede lo disponible, mostrar un mensaje
                        JOptionPane.showMessageDialog(null, "La cantidad ingresada no puede ser mayor a la cantidad disponible.");
                    }
                } catch (NumberFormatException ex) {
                    // Si el formato de cantidad o precio es incorrecto, mostrar un mensaje
                    JOptionPane.showMessageDialog(null, "Por favor ingrese un número válido en los campos de cantidad y precio.");
                }
            } else {
                // Si el campo cantidad está vacío
                JOptionPane.showMessageDialog(null, "Por favor ingrese una cantidad.");
            }
        }
    }//GEN-LAST:event_txtCantidadVentaKeyPressed

    private void txtFolioVentaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFolioVentaKeyPressed

        // Comprobar si se presionó la tecla ENTER
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                // Verificar si el campo de folio no está vacío
                String folioClienteStr = txtFolioVenta.getText().trim();
                if (folioClienteStr.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Por favor, ingrese un folio de cliente.");
                    return; // Si el campo está vacío, salimos del método
                }

                // Convertir el folio a un entero
                int folioCliente = Integer.parseInt(folioClienteStr);

                // Conectar a la base de datos
                con.conectarBDOracle();

                // Consultar la base de datos para obtener los detalles del cliente por folio
                String sqlQuery = "SELECT nombre FROM clientes WHERE folio = ?";
                PreparedStatement ps = con.getConnection().prepareStatement(sqlQuery);
                ps.setInt(1, folioCliente);  // Establecer el folio del cliente en la consulta

                // Ejecutar la consulta
                con.rs = ps.executeQuery();

                // Verificar si se encontró el cliente
                if (con.rs.next()) {
                    // Si se encuentra el cliente, obtener el nombre
                    String nombreCliente = con.rs.getString("nombre");

                    // Asignar el nombre al campo txtNombreCliente
                    txtNombreCliente.setText(nombreCliente);
                } else {
                    // Si no se encuentra el cliente con ese folio, mostrar mensaje
                    JOptionPane.showMessageDialog(this, "No se encontró un cliente con el folio proporcionado.");
                    txtNombreCliente.setText("");  // Limpiar el campo de nombre si no se encuentra
                }
            } catch (SQLException ex) {
                // Manejo de errores si hay problemas con la consulta SQL
                JOptionPane.showMessageDialog(this, "Error de base de datos: " + ex.getMessage());
            } catch (NumberFormatException ex) {
                // Manejo de errores si el folio no es un número válido
                JOptionPane.showMessageDialog(this, "El folio debe ser un número válido.");
            }
        }


    }//GEN-LAST:event_txtFolioVentaKeyPressed

    private void txtFolioVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFolioVentaActionPerformed

    }//GEN-LAST:event_txtFolioVentaActionPerformed

    private void jTextField23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField23ActionPerformed

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
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sistema().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelTotal;
    private javax.swing.JTable TableCliente;
    private javax.swing.JTable TableProducto;
    private javax.swing.JTable TableProveedor;
    private javax.swing.JTable TableVenta;
    private javax.swing.JTable TableVentas;
    private javax.swing.JButton btnActualizarProducto;
    private javax.swing.JButton btnActualizarProvedor;
    private javax.swing.JButton btnEditarCliente;
    private javax.swing.JButton btnEliminarCliente;
    private javax.swing.JButton btnEliminarProvedor;
    private javax.swing.JButton btnEliminarVenta;
    private javax.swing.JButton btnElimnarProducto;
    private javax.swing.JButton btnGenerarVenta;
    private javax.swing.JButton btnGuardarCliente;
    private javax.swing.JButton btnGuardarProducto;
    private javax.swing.JButton btnGuardarProveedor;
    private javax.swing.JButton btnNuevoCliente;
    private javax.swing.JButton btnNuevoProducto;
    private javax.swing.JButton btnNuevoProvedor;
    private javax.swing.JButton btnPdfVentas;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField txtCantidadProducto;
    private javax.swing.JTextField txtCantidadVenta;
    private javax.swing.JTextField txtCodigoProducto;
    private javax.swing.JTextField txtCodigoVenta;
    private javax.swing.JTextField txtDescripcionProducto;
    private javax.swing.JTextField txtDescripcionVenta;
    private javax.swing.JTextField txtDireccionCliente;
    private javax.swing.JTextField txtDireccionProvedor;
    private javax.swing.JTextField txtDisponible;
    private javax.swing.JTextField txtFolioCliente;
    private javax.swing.JTextField txtFolioProveedor;
    private javax.swing.JTextField txtFolioVenta;
    private javax.swing.JTextField txtNombreCliente;
    private javax.swing.JTextField txtNombreClientes;
    private javax.swing.JTextField txtNombreProveedor;
    private javax.swing.JTextField txtPrecioProducto;
    private javax.swing.JTextField txtPrecioVenta;
    private javax.swing.JLabel txtTefono;
    private javax.swing.JTextField txtTelefonoCliente;
    private javax.swing.JTextField txtTelefonoProveedor;
    // End of variables declaration//GEN-END:variables
private void TotalPagar() {

        totalpagar = 0.00;
        int numfila = TableVenta.getRowCount();
        for (int i = 0; i < numfila; i++) {
            double cal = Double.parseDouble(String.valueOf(TableVenta.getModel().getValueAt(i, 4)));
            totalpagar = totalpagar + cal;
        }
        LabelTotal.setText(String.format("%.2f", totalpagar));
    }

    private DefaultTableModel addRow(Object[] a) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void Pantalla() {
        txtCodigoVenta.setText("");
        txtDescripcionVenta.setText("");
        txtCantidadVenta.setText("");
        txtDisponible.setText("");
        txtPrecioVenta.setText("");
    }
}
