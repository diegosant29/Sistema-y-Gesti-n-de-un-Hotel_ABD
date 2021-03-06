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
public class Formulario_HABITACION_BD extends javax.swing.JFrame {

    String url="jdbc:oracle:thin:@192.168.5.2:1521:XE";
        String usuario="system";
        String contraseña="12345";
        Connection con=null;
        Statement stmt=null;
        ResultSet rs=null;
    /**
     * Creates new form Formulario_HABITACION_BD
     */
    public Formulario_HABITACION_BD() {
        initComponents();
        setTitle("Registro de Habitacion");
        setLocationRelativeTo(null);
        consultaDB();
    }

    public void CargarRegistro(){
        DefaultTableModel modelo = (DefaultTableModel) consulta_tabla.getModel();
        modelo.setRowCount(0);
        try{
            rs = stmt.executeQuery("Select * from habitacion where id_habitacion='"+CARGAR_ID.getText()+"'");
            while(rs.next()){
                Vector v = new Vector();
                v.add(rs.getInt(1));
                v.add(rs.getInt(2));
                v.add(rs.getInt(3));
                v.add(rs.getString(4));
                v.add(rs.getInt(5));
                v.add(rs.getString(6));
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
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        CARGAR_ID = new javax.swing.JTextField();
        BTNbuscar = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        TXTid_habitacion = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        BTNinserccionSql = new javax.swing.JButton();
        TXTid_hotel = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        consulta_tabla = new javax.swing.JTable();
        TXTtipo_habitacion = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        BTNregresar = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        BTNnuevoregistro = new javax.swing.JButton();
        BTNmostrarRegistrosTota = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        TXTcantidad_habitacion = new javax.swing.JTextField();
        TXTestado = new javax.swing.JTextField();
        TXTid_reservacion1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));

        jLabel17.setText("ID HABITACION");

        jLabel18.setFont(new java.awt.Font("Lucida Calligraphy", 0, 12)); // NOI18N
        jLabel18.setText("Busqueda por Id");

        BTNbuscar.setBackground(new java.awt.Color(204, 204, 204));
        BTNbuscar.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        BTNbuscar.setText("Consultar a Oracle");
        BTNbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNbuscarActionPerformed(evt);
            }
        });

        jLabel19.setText("ID HOTEL");

        TXTid_habitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTid_habitacionActionPerformed(evt);
            }
        });

        jLabel20.setText("ID RESERVACION");

        BTNinserccionSql.setBackground(new java.awt.Color(204, 204, 204));
        BTNinserccionSql.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        BTNinserccionSql.setText("Insertar a Oracle");
        BTNinserccionSql.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNinserccionSqlActionPerformed(evt);
            }
        });

        consulta_tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID HABITACION", "ID HOTEL", "ID RESERVACION", "TIPO HABITACION", "CANTIDAD HABITACION", "ESTADO"
            }
        ));
        jScrollPane2.setViewportView(consulta_tabla);

        TXTtipo_habitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTtipo_habitacionActionPerformed(evt);
            }
        });

        jLabel21.setText("TIPO HABITACION");

        jLabel22.setText("CANTIDAD HABITACION");

        BTNregresar.setBackground(new java.awt.Color(204, 204, 204));
        BTNregresar.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        BTNregresar.setText("Regresar");
        BTNregresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNregresarActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Harlow Solid Italic", 0, 36)); // NOI18N
        jLabel13.setText("Ingrese los Datos de la Habitacion");

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/habitacion.png"))); // NOI18N

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

        jLabel23.setText("ESTADO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(54, 54, 54)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel21)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel22)
                                    .addComponent(jLabel23))
                                .addGap(29, 29, 29)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(TXTtipo_habitacion, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                                    .addComponent(TXTid_hotel, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TXTid_habitacion, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TXTid_reservacion1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TXTcantidad_habitacion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                                    .addComponent(TXTestado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(66, 66, 66)
                                        .addComponent(BTNinserccionSql, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(95, 95, 95)
                                        .addComponent(BTNnuevoregistro, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(77, 77, 77)))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CARGAR_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BTNbuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BTNregresar, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTNmostrarRegistrosTota))
                .addGap(40, 40, 40))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TXTid_habitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(TXTid_hotel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jLabel20)
                                .addGap(24, 24, 24))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TXTid_reservacion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addGap(12, 12, 12))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(TXTtipo_habitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BTNnuevoregistro)
                        .addGap(18, 18, 18)
                        .addComponent(BTNinserccionSql, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BTNregresar)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TXTcantidad_habitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TXTestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(CARGAR_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTNbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTNmostrarRegistrosTota, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTNmostrarRegistrosTotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNmostrarRegistrosTotaActionPerformed
        // TODO add your handling code here:
        registroGuardados();
    }//GEN-LAST:event_BTNmostrarRegistrosTotaActionPerformed

    private void BTNnuevoregistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNnuevoregistroActionPerformed
        // TODO add your handling code here:
        TXTid_habitacion.setText("");
        TXTid_hotel.setText("");
        TXTid_hotel.setText("");
        TXTtipo_habitacion.setText("");
        TXTcantidad_habitacion.setText("");
        TXTestado.setText("");
    }//GEN-LAST:event_BTNnuevoregistroActionPerformed

    private void BTNregresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNregresarActionPerformed
        // TODO add your handling code here:
        MenuPrincipal_Gestion_Hotel_BD tabla_VentanaPrincipal = new MenuPrincipal_Gestion_Hotel_BD();
        tabla_VentanaPrincipal.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BTNregresarActionPerformed

    private void TXTtipo_habitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTtipo_habitacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTtipo_habitacionActionPerformed

    private void BTNinserccionSqlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNinserccionSqlActionPerformed
        // TODO add your handling code here:
        ConexionOracle c=new ConexionOracle().conectar();

        c.ejecutar("insert into habitacion values("+Integer.parseInt(TXTid_habitacion.getText())
            +","+Integer.parseInt(TXTid_hotel.getText())
            +","+Integer.parseInt(TXTid_reservacion1.getText())
            +",'"+TXTtipo_habitacion.getText()
            +"',"+Integer.parseInt(TXTcantidad_habitacion.getText())  //SENTENCIA SQL
            +",'"+TXTestado.getText()+"')");   //SENTENCIA SQL

        JOptionPane.showMessageDialog(null, "Inserciones ejecutadas en Oracle11g ");
        TXTid_habitacion.setText("");
        TXTid_hotel.setText("");
        TXTid_reservacion1.setText("");
        TXTtipo_habitacion.setText("");
        TXTcantidad_habitacion.setText("");
        TXTestado.setText("");
    }//GEN-LAST:event_BTNinserccionSqlActionPerformed

    private void TXTid_habitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTid_habitacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTid_habitacionActionPerformed

    private void BTNbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNbuscarActionPerformed
        // TODO add your handling code here:
        CargarRegistro();
        try{
            rs = stmt.executeQuery("Select * from habitacion where id_habitacion='"+CARGAR_ID.getText()+"'");
            while (rs.next()){
                TXTid_habitacion.setText(rs.getString("id_habitacion"));
                TXTid_hotel.setText(rs.getString("id_hotel"));
                TXTid_reservacion1.setText(rs.getString("id_reservacion"));
                TXTtipo_habitacion.setText(rs.getString("tipo_habitacion"));
                TXTcantidad_habitacion.setText(rs.getString("cantidad_habitacion"));
                TXTestado.setText(rs.getString("estado"));

            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "ERROR AL CONSULTAR");
        }
    }//GEN-LAST:event_BTNbuscarActionPerformed

    public void registroGuardados(){
        DefaultTableModel modelo = (DefaultTableModel) consulta_tabla.getModel();
        modelo.setRowCount(0);
        try{
            rs = stmt.executeQuery("Select * from habitacion");
            while(rs.next()){
                Vector v = new Vector();
                v.add(rs.getInt(1));
                v.add(rs.getInt(2));
                v.add(rs.getInt(3));
                v.add(rs.getString(4));
                v.add(rs.getInt(5));
                v.add(rs.getString(6));
                modelo.addRow(v);
                consulta_tabla.setModel(modelo);
            }
        }catch (SQLException e){
             
        }
    }
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
            java.util.logging.Logger.getLogger(Formulario_HABITACION_BD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulario_HABITACION_BD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulario_HABITACION_BD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulario_HABITACION_BD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formulario_HABITACION_BD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNbuscar;
    private javax.swing.JButton BTNinserccionSql;
    private javax.swing.JButton BTNmostrarRegistrosTota;
    private javax.swing.JButton BTNnuevoregistro;
    private javax.swing.JButton BTNregresar;
    private javax.swing.JTextField CARGAR_ID;
    private javax.swing.JTextField TXTcantidad_habitacion;
    private javax.swing.JTextField TXTestado;
    private javax.swing.JTextField TXTid_habitacion;
    private javax.swing.JTextField TXTid_hotel;
    private javax.swing.JTextField TXTid_reservacion1;
    private javax.swing.JTextField TXTtipo_habitacion;
    private javax.swing.JTable consulta_tabla;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
