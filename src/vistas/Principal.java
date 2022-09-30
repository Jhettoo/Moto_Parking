package vistas;

import java.awt.Dimension;
import javax.swing.JInternalFrame;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        VentanaPrincipal = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        menuRegistro = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        MenuIngreso = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        MenuSalida = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        MenuInforme = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout VentanaPrincipalLayout = new javax.swing.GroupLayout(VentanaPrincipal);
        VentanaPrincipal.setLayout(VentanaPrincipalLayout);
        VentanaPrincipalLayout.setHorizontalGroup(
            VentanaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 890, Short.MAX_VALUE)
        );
        VentanaPrincipalLayout.setVerticalGroup(
            VentanaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 506, Short.MAX_VALUE)
        );

        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/menu.png"))); // NOI18N
        jMenu1.setText("Menú            ");

        jMenuItem1.setText("Ayuda");
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Salir");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        menuRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/bienvenido.png"))); // NOI18N
        menuRegistro.setText("Registro Cliente          ");
        menuRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRegistroActionPerformed(evt);
            }
        });

        jMenuItem3.setText("Registro cliente");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        menuRegistro.add(jMenuItem3);

        jMenuBar1.add(menuRegistro);

        MenuIngreso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Ticket.png"))); // NOI18N
        MenuIngreso.setText("Ingreso         ");

        jMenuItem4.setText("Ingreso vehículo");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        MenuIngreso.add(jMenuItem4);

        jMenuBar1.add(MenuIngreso);

        MenuSalida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Salida.png"))); // NOI18N
        MenuSalida.setText("Salida           ");

        jMenuItem5.setText("Salida vehículo");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        MenuSalida.add(jMenuItem5);

        jMenuBar1.add(MenuSalida);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Informe.png"))); // NOI18N
        jMenu5.setText("Informes");

        MenuInforme.setText("Informe diario");
        MenuInforme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuInformeActionPerformed(evt);
            }
        });
        jMenu5.add(MenuInforme);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(VentanaPrincipal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(VentanaPrincipal)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void menuRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRegistroActionPerformed
     
        
    }//GEN-LAST:event_menuRegistroActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        RegistroForm rf=new RegistroForm();
        CentrarVentana(rf);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        IngresoForm Ingreso=new IngresoForm();
        CentrarVentana(Ingreso);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        SalidaForm Salida=new SalidaForm();
        CentrarVentana(Salida);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void MenuInformeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuInformeActionPerformed
        InformeForm InformeF=new InformeForm();
        CentrarVentana(InformeF);
    }//GEN-LAST:event_MenuInformeActionPerformed
    void CentrarVentana(JInternalFrame frame){
        VentanaPrincipal.add(frame);
        Dimension dimension=VentanaPrincipal.getSize();
        Dimension Dframe=frame.getSize();
        frame.setLocation((dimension.width-Dframe.width)/2, (dimension.height-Dframe.height)/2);
        frame.show();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenuInforme;
    private javax.swing.JMenu MenuIngreso;
    private javax.swing.JMenu MenuSalida;
    public static javax.swing.JDesktopPane VentanaPrincipal;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenu menuRegistro;
    // End of variables declaration//GEN-END:variables
}
