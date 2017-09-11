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
import java.util.*;
import javax.swing.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author DIEGO SANTANA
 */
public class Formulario_TIPO_CATEGORIA_BD extends javax.swing.JFrame {

    String url="jdbc:oracle:thin:@192.168.5.2:1521:XE";
        String usuario="system";
        String contraseña="12345";
        Connection con=null;
        Statement stmt=null;
        ResultSet rs=null;
    /**
     * Creates new form Formulario_TIPO_CATEGORIA_BD
     */
    public Formulario_TIPO_CATEGORIA_BD() {
        initComponents();
        setTitle("Registro el tipo de categoria");
        setLocationRelativeTo(null);
        consultaDB();
    }

    public void CargarRegistro(){
        DefaultTableModel modelo = (DefaultTableModel) consulta_tabla.getModel();
        modelo.setRowCount(0);
        try{
            rs = stmt.executeQuery("Select * from tipo_categoria where id_tipo_categoria='"+CARGAR_ID.getText()+"'");
            while(rs.next()){
                Vector v = new Vector();
                v.add(rs.getInt(1));
                v.add(rs.getString(2));
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

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BTNinsercionpostgresql = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        BTNconsultar = new javax.swing.JButton();
        CARGAR_ID = new javax.swing.JTextField();
        Regresar_Menu = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        consulta_tabla = new javax.swing.JTable();
        TXTid_tipo_categoria = new javax.swing.JTextField();
        TXTdescripcion = new javax.swing.JTextField();
        BTNnuevoregistro = new javax.swing.JButton();
        BTNmostrarRegistrosTota = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(102, 255, 204));

        jLabel1.setText("ID TIPO CATEGORIA");

        BTNinsercionpostgresql.setBackground(new java.awt.Color(204, 204, 204));
        BTNinsercionpostgresql.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        BTNinsercionpostgresql.setForeground(new java.awt.Color(0, 51, 204));
        BTNinsercionpostgresql.setText("Insertar a Oracle");
        BTNinsercionpostgresql.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNinsercionpostgresqlActionPerformed(evt);
            }
        });

        jLabel2.setText("DESCRIPCION");

        BTNconsultar.setBackground(new java.awt.Color(204, 204, 204));
        BTNconsultar.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        BTNconsultar.setForeground(new java.awt.Color(0, 51, 204));
        BTNconsultar.setText("Consultar a Oracle");
        BTNconsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNconsultarActionPerformed(evt);
            }
        });

        Regresar_Menu.setBackground(new java.awt.Color(204, 204, 204));
        Regresar_Menu.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        Regresar_Menu.setForeground(new java.awt.Color(0, 51, 255));
        Regresar_Menu.setText("Regresar al Menu");
        Regresar_Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Regresar_MenuActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Lucida Calligraphy", 0, 12)); // NOI18N
        jLabel7.setText("Busqueda por Id:");

        jLabel13.setFont(new java.awt.Font("Harlow Solid Italic", 0, 36)); // NOI18N
        jLabel13.setText("Ingrese el Tipo de Categoria");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/tipo_categoria.png"))); // NOI18N

        consulta_tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID TIPO CATEGORIA", "DESCRIPCION"
            }
        ));
        jScrollPane1.setViewportView(consulta_tabla);

        BTNnuevoregistro.setBackground(new java.awt.Color(204, 204, 204));
        BTNnuevoregistro.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        BTNnuevoregistro.setForeground(new java.awt.Color(0, 51, 204));
        BTNnuevoregistro.setText("Nuevo Registro");
        BTNnuevoregistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNnuevoregistroActionPerformed(evt);
            }
        });

        BTNmostrarRegistrosTota.setBackground(new java.awt.Color(204, 204, 204));
        BTNmostrarRegistrosTota.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        BTNmostrarRegistrosTota.setForeground(new java.awt.Color(0, 51, 255));
        BTNmostrarRegistrosTota.setText("Mostrar registros Guardados");
        BTNmostrarRegistrosTota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNmostrarRegistrosTotaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(TXTid_tipo_categoria, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TXTdescripcion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(BTNinsercionpostgresql, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BTNnuevoregistro, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(69, 69, 69))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CARGAR_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BTNconsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BTNmostrarRegistrosTota)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Regresar_Menu)
                .addGap(63, 63, 63))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(26, 26, 26)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(TXTid_tipo_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(BTNnuevoregistro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TXTdescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BTNinsercionpostgresql))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Regresar_Menu)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CARGAR_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTNconsultar)
                    .addComponent(BTNmostrarRegistrosTota))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 449, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTNinsercionpostgresqlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNinsercionpostgresqlActionPerformed
        // TODO add your handling code here:
        ConexionOracle c=new ConexionOracle().conectar();

        c.ejecutar("insert into tipo_categoria values("+Integer.parseInt(TXTid_tipo_categoria.getText())
            +",'"+TXTdescripcion.getText()+"')"); //SENTENCIA SQL
        /*System.out.println("hora: "+hora+
            " minuto: "+minuto+
            " segundo: "+segundo+"\n");*/

        JOptionPane.showMessageDialog(null, "Inserciones ejecutadas en Oracle11g  ");
        TXTid_tipo_categoria.setText("");
        TXTdescripcion.setText("");
        

        System.out.println("Se agrego el registro de manera exitosa");
    }//GEN-LAST:event_BTNinsercionpostgresqlActionPerformed

    private void BTNconsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNconsultarActionPerformed
        // TODO add your handling code here:
        CargarRegistro();
        try{
            rs = stmt.executeQuery("Select * from tipo_categoria where id_tipo_categoria='"+CARGAR_ID.getText()+"'");
            while (rs.next()){
                TXTid_tipo_categoria.setText(rs.getString("id_tipo_categoria"));
                TXTdescripcion.setText(rs.getString("descripcion"));
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "ERROR AL CONSULTAR");

        }
    }//GEN-LAST:event_BTNconsultarActionPerformed

    private void Regresar_MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Regresar_MenuActionPerformed
        // TODO add your handling code here:
        MenuPrincipal_Gestion_Hotel_BD Menu = new MenuPrincipal_Gestion_Hotel_BD();
        Menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_Regresar_MenuActionPerformed

    private void BTNnuevoregistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNnuevoregistroActionPerformed
        // TODO add your handling code here:
        TXTid_tipo_categoria.setText("");
        TXTdescripcion.setText("");
    }//GEN-LAST:event_BTNnuevoregistroActionPerformed

    private void BTNmostrarRegistrosTotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNmostrarRegistrosTotaActionPerformed
        // TODO add your handling code here:
        registroGuardados();
    }//GEN-LAST:event_BTNmostrarRegistrosTotaActionPerformed

    public void registroGuardados(){
        DefaultTableModel modelo = (DefaultTableModel) consulta_tabla.getModel();
        modelo.setRowCount(0);
        try{
            rs = stmt.executeQuery("Select * from tipo_categoria ");
            while(rs.next()){
                Vector v = new Vector();
                v.add(rs.getInt(1));
                v.add(rs.getString(2));
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
            java.util.logging.Logger.getLogger(Formulario_TIPO_CATEGORIA_BD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulario_TIPO_CATEGORIA_BD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulario_TIPO_CATEGORIA_BD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulario_TIPO_CATEGORIA_BD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formulario_TIPO_CATEGORIA_BD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNconsultar;
    private javax.swing.JButton BTNinsercionpostgresql;
    private javax.swing.JButton BTNmostrarRegistrosTota;
    private javax.swing.JButton BTNnuevoregistro;
    private javax.swing.JTextField CARGAR_ID;
    private javax.swing.JButton Regresar_Menu;
    private javax.swing.JTextField TXTdescripcion;
    private javax.swing.JTextField TXTid_tipo_categoria;
    private javax.swing.JTable consulta_tabla;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}