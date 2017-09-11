/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema_hotel_proyecto_bd;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DIEGO SANTANA
 */
public class Formulario_CLIENTE_BD extends javax.swing.JFrame {

    String url="jdbc:oracle:thin:@192.168.5.2:1521:XE";
        String usuario="system";
        String contraseña="12345";
        Connection con=null;
        Statement stmt=null;
        ResultSet rs=null;
    /**
     * Creates new form Formulario_Libro_Oracle11g
     */
    public Formulario_CLIENTE_BD() {
        initComponents();
        setTitle("Registro del Cliente");
        setLocationRelativeTo(null);
        consultaDB();
    }
     public void CargarRegistro(){
        DefaultTableModel modelo = (DefaultTableModel) consulta_tabla.getModel();
        modelo.setRowCount(0);
        try{
            rs = stmt.executeQuery("Select * from cliente where id_cliente='"+CARGAR_ID.getText()+"'");
            while(rs.next()){
                Vector v = new Vector();
                v.add(rs.getInt(1));
                v.add(rs.getString(2));
                v.add(rs.getString(3));
                v.add(rs.getString(4));
                v.add(rs.getString(5));
                v.add(rs.getString(6));
                v.add(rs.getInt(7));
                modelo.addRow(v);
                consulta_tabla.setModel(modelo);
                JOptionPane.showMessageDialog(null, "Consulta realizada con exito  ");
            }
        }catch (SQLException e){
            
        }
    }

    private void consultaDB(){
        try{
            con = (Connection)DriverManager.getConnection(url,usuario,contraseña);
           if(con!=null)
                System.out.println("Conectado a la base de datos");
                stmt=(Statement)con.createStatement();
                
        }catch(Exception e){
        JOptionPane.showMessageDialog(null, "Error al conectar");
    
    }
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
        TXTnombre = new javax.swing.JTextField();
        TXTapellido = new javax.swing.JTextField();
        TXTcedula = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        TXTdireccion = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        TXTedad = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        TXTid_cliente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        BTNinsercionoracle1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        BTNconsultar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        CARGAR_ID = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Regresar_Menu2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        consulta_tabla = new javax.swing.JTable();
        BTNnuevoregistro = new javax.swing.JButton();
        BTNmostrarRegistrosTota = new javax.swing.JButton();
        TXTciudad = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 255, 255));

        TXTapellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTapellidoActionPerformed(evt);
            }
        });

        jLabel1.setText("ID CLIENTE");

        TXTdireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTdireccionActionPerformed(evt);
            }
        });

        jLabel2.setText("NOMBRE");

        jLabel3.setText("APELLIDO");

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cliente.png"))); // NOI18N

        TXTid_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTid_clienteActionPerformed(evt);
            }
        });

        jLabel4.setText("CEDULA");

        BTNinsercionoracle1.setBackground(new java.awt.Color(204, 204, 204));
        BTNinsercionoracle1.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        BTNinsercionoracle1.setText("Insertar a Oracle");
        BTNinsercionoracle1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNinsercionoracle1ActionPerformed(evt);
            }
        });

        jLabel5.setText("DIRECCION");

        BTNconsultar.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        BTNconsultar.setText("Consultar a Oracle");
        BTNconsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNconsultarActionPerformed(evt);
            }
        });

        jLabel6.setText("CIUDAD");

        CARGAR_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CARGAR_IDActionPerformed(evt);
            }
        });

        jLabel7.setText("EDAD");

        Regresar_Menu2.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        Regresar_Menu2.setText("Regresar");
        Regresar_Menu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Regresar_Menu2ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Lucida Calligraphy", 0, 12)); // NOI18N
        jLabel9.setText("Busqueda por Id");

        jLabel13.setFont(new java.awt.Font("Harlow Solid Italic", 0, 36)); // NOI18N
        jLabel13.setText("Ingrese los Datos del Cliente");

        consulta_tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID CLIENTE", "NOMBRE", "APELLIDO", "CEDULA", "DIRECCION", "CIUDAD", "EDAD"
            }
        ));
        jScrollPane1.setViewportView(consulta_tabla);
        if (consulta_tabla.getColumnModel().getColumnCount() > 0) {
            consulta_tabla.getColumnModel().getColumn(0).setPreferredWidth(20);
        }

        BTNnuevoregistro.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        BTNnuevoregistro.setText("Nuevo Registro");
        BTNnuevoregistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNnuevoregistroActionPerformed(evt);
            }
        });

        BTNmostrarRegistrosTota.setBackground(new java.awt.Color(204, 204, 204));
        BTNmostrarRegistrosTota.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        BTNmostrarRegistrosTota.setText("Mostrar registros Guardados");
        BTNmostrarRegistrosTota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNmostrarRegistrosTotaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(126, 126, 126)
                                .addComponent(jLabel13)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(96, 96, 96)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TXTid_cliente, javax.swing.GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE)
                                    .addComponent(TXTnombre)
                                    .addComponent(TXTapellido)
                                    .addComponent(TXTcedula)
                                    .addComponent(TXTdireccion)
                                    .addComponent(TXTciudad)
                                    .addComponent(TXTedad, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(57, 57, 57)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(BTNinsercionoracle1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(BTNnuevoregistro, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(19, 19, 19))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(97, 97, 97)
                                        .addComponent(Regresar_Menu2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CARGAR_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BTNconsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addComponent(BTNmostrarRegistrosTota)
                .addGap(48, 48, 48))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel13))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(TXTid_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TXTnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TXTapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TXTcedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(BTNnuevoregistro)
                        .addGap(38, 38, 38)
                        .addComponent(BTNinsercionoracle1)))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TXTdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(Regresar_Menu2))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(TXTciudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TXTedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(CARGAR_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTNconsultar)
                    .addComponent(BTNmostrarRegistrosTota))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TXTid_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTid_clienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTid_clienteActionPerformed

    private void TXTapellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTapellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTapellidoActionPerformed

    private void TXTdireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTdireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTdireccionActionPerformed

    private void BTNinsercionoracle1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNinsercionoracle1ActionPerformed
        // TODO add your handling code here:
        ConexionOracle c=new ConexionOracle().conectar();

        c.ejecutar("insert into cliente values("+Integer.parseInt(TXTid_cliente.getText())
            +",'"+TXTnombre.getText()
            +"','"+TXTapellido.getText()
            +"',"+Integer.parseInt(TXTcedula.getText())
            +",'"+TXTdireccion.getText()
            +"','"+TXTciudad.getText()
            +"',"+Integer.parseInt(TXTedad.getText())+")"); //SENTENCIA SQL
        /*System.out.println("hora: "+hora+
            " minuto: "+minuto+
            " segundo: "+segundo+"\n");*/
        JOptionPane.showMessageDialog(null, "Inserciones ejecutadas en Oracle11g  ");
        TXTid_cliente.setText("");
        TXTnombre.setText("");
        TXTapellido.setText("");
        TXTcedula.setText("");
        TXTdireccion.setText("");
        TXTciudad.setText("");
        TXTedad.setText("");

        System.out.println("Se agrego el registro de manera exitosa");
    }//GEN-LAST:event_BTNinsercionoracle1ActionPerformed

    private void Regresar_Menu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Regresar_Menu2ActionPerformed
        // TODO add your handling code here:
        MenuPrincipal_Gestion_Hotel_BD Menu = new MenuPrincipal_Gestion_Hotel_BD();
        Menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_Regresar_Menu2ActionPerformed

    private void BTNconsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNconsultarActionPerformed
        // TODO add your handling code here:
        CargarRegistro();
       try{
            rs = stmt.executeQuery("Select * from cliente where id_cliente='"+CARGAR_ID.getText()+"'");
        while (rs.next()){
                        TXTid_cliente.setText(rs.getString("id_cliente"));
                        TXTnombre.setText(rs.getString("nombre"));
                        TXTapellido.setText(rs.getString("apellido"));
                        TXTcedula.setText(rs.getString("cedula"));
                        TXTdireccion.setText(rs.getString("direccion"));
                        TXTciudad.setText(rs.getString("ciudad"));
                        TXTedad.setText(rs.getString("edad"));
       
        }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR AL CONSULTAR");
                TXTid_cliente.setText("");
                TXTnombre.setText("");
                TXTapellido.setText("");
                TXTcedula.setText("");
                TXTdireccion.setText("");
                TXTciudad.setText("");
                TXTedad.setText("");
        }
    }//GEN-LAST:event_BTNconsultarActionPerformed

    private void CARGAR_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CARGAR_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CARGAR_IDActionPerformed

    private void BTNnuevoregistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNnuevoregistroActionPerformed
        // TODO add your handling code here:
                TXTid_cliente.setText("");
                TXTnombre.setText("");
                TXTapellido.setText("");
                TXTcedula.setText("");
                TXTdireccion.setText("");
                TXTciudad.setText("");
                TXTedad.setText("");
    }//GEN-LAST:event_BTNnuevoregistroActionPerformed
public void registroGuardados(){
        DefaultTableModel modelo = (DefaultTableModel) consulta_tabla.getModel();
        modelo.setRowCount(0);
        try{
            rs = stmt.executeQuery("Select * from cliente ");
            while(rs.next()){
                Vector v = new Vector();
                v.add(rs.getInt(1));
                v.add(rs.getString(2));
                v.add(rs.getString(3));
                v.add(rs.getString(4));
                v.add(rs.getString(5));
                v.add(rs.getString(6));
                v.add(rs.getInt(7));
                modelo.addRow(v);
                consulta_tabla.setModel(modelo);
            }
        }catch (SQLException e){
             
        }
    }
    private void BTNmostrarRegistrosTotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNmostrarRegistrosTotaActionPerformed
        // TODO add your handling code here:
        registroGuardados();
    }//GEN-LAST:event_BTNmostrarRegistrosTotaActionPerformed

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
            java.util.logging.Logger.getLogger(Formulario_CLIENTE_BD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulario_CLIENTE_BD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulario_CLIENTE_BD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulario_CLIENTE_BD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formulario_CLIENTE_BD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNconsultar;
    private javax.swing.JButton BTNinsercionoracle1;
    private javax.swing.JButton BTNmostrarRegistrosTota;
    private javax.swing.JButton BTNnuevoregistro;
    private javax.swing.JTextField CARGAR_ID;
    private javax.swing.JButton Regresar_Menu2;
    private javax.swing.JTextField TXTapellido;
    private javax.swing.JTextField TXTcedula;
    private javax.swing.JTextField TXTciudad;
    private javax.swing.JTextField TXTdireccion;
    private javax.swing.JTextField TXTedad;
    private javax.swing.JTextField TXTid_cliente;
    private javax.swing.JTextField TXTnombre;
    private javax.swing.JTable consulta_tabla;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}