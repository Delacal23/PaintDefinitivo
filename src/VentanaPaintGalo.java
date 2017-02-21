import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.net.URL;
import javax.swing.ImageIcon;

public class VentanaPaintGalo extends javax.swing.JFrame {
    
    BufferedImage buffer = null;
    BufferedImage buffer2 = null;
    Graphics2D bufferGraphics, buffer2Graphics, lienzoGraphics = null;
    int formaSeleccionada = 0;
    Color colorSeleccionado = Color.black;
    Forma miForma;
    AMano miLinea;
    int numLados = 20;
    boolean pintado = false;
    int radioPincel = 1;

    public VentanaPaintGalo() {
        initComponents();
        inicializaBuffers();
        ponImagen(numLados);
        colores.setSize(750, 488);
        guardar.setSize(750, 488);
    }
    
    private void inicializaBuffers(){
    lienzoGraphics = (Graphics2D) lienzo.getGraphics();
    //creo una imagen igual que la del lienzo
    buffer = (BufferedImage) lienzo.createImage(lienzo.getWidth(), lienzo.getHeight());
    //creo una imagen modificable
    bufferGraphics = buffer.createGraphics();
        
    bufferGraphics.setColor(Color.white);
    bufferGraphics.fillRect(0,0,lienzo.getWidth(), lienzo.getHeight());
        
    //2º buffer
    buffer2 = (BufferedImage) lienzo.createImage(lienzo.getWidth(), lienzo.getHeight());
    //creo una imagen modificable
    buffer2Graphics = buffer2.createGraphics();
        
    buffer2Graphics.setColor(Color.white);
    buffer2Graphics.fillRect(0,0,lienzo.getWidth(), lienzo.getHeight());
    }
    
    @Override
    public void paint (Graphics g){
        //haz lo que hacias
        super.paint(g);
        //apuntamos al lienzo
        lienzoGraphics.drawImage(buffer, 0, 0, null);
    }
    
    public void ponImagen (int numLados){
        ImageIcon miImagen = null;
        URL nombreImagen = null;
        int ancho = figuraActual.getWidth();
        int alto = figuraActual.getHeight();
        
        switch(numLados){
            case 1000: nombreImagen = getClass().getResource("/imagenes/1487544969_Circle.png"); break;
            case 3: nombreImagen = getClass().getResource("/imagenes/1487544904_Triangle.png"); break;
            case 4: nombreImagen = getClass().getResource("/imagenes/1487544841_Square.png"); break;
            case 5: nombreImagen = getClass().getResource("/imagenes/1487544676_pentagon.png"); break;
            case 6: nombreImagen = getClass().getResource("/imagenes/1487544747_Hexagon.png"); break;
            case 20 : nombreImagen = getClass().getResource("/imagenes/1487545738_15.Pencil.png");break;
            case 21 : nombreImagen = getClass().getResource("/imagenes/1487546577_office-46.png");break;
        }
            
        miImagen = new ImageIcon (new ImageIcon(nombreImagen).getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));
        figuraActual.setIcon(miImagen);
    }

    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        colores = new javax.swing.JDialog();
        jColorChooser1 = new javax.swing.JColorChooser();
        aceptarColor = new javax.swing.JButton();
        cancelarColor = new javax.swing.JButton();
        guardar = new javax.swing.JDialog();
        jFileChooser1 = new javax.swing.JFileChooser();
        grosor = new javax.swing.JSpinner();
        lienzo = new javax.swing.JPanel();
        dibujar = new javax.swing.JButton();
        goma = new javax.swing.JButton();
        color = new javax.swing.JButton();
        relleno = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        figuraActual = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();

        aceptarColor.setText("Acaptar");
        aceptarColor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                aceptarColorMousePressed(evt);
            }
        });

        cancelarColor.setText("Cancelar");
        cancelarColor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cancelarColorMousePressed(evt);
            }
        });

        javax.swing.GroupLayout coloresLayout = new javax.swing.GroupLayout(colores.getContentPane());
        colores.getContentPane().setLayout(coloresLayout);
        coloresLayout.setHorizontalGroup(
            coloresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jColorChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 716, Short.MAX_VALUE)
            .addGroup(coloresLayout.createSequentialGroup()
                .addGap(182, 182, 182)
                .addComponent(aceptarColor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cancelarColor)
                .addGap(184, 184, 184))
        );
        coloresLayout.setVerticalGroup(
            coloresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(coloresLayout.createSequentialGroup()
                .addComponent(jColorChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(coloresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aceptarColor)
                    .addComponent(cancelarColor))
                .addGap(0, 10, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout guardarLayout = new javax.swing.GroupLayout(guardar.getContentPane());
        guardar.getContentPane().setLayout(guardarLayout);
        guardarLayout.setHorizontalGroup(
            guardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(guardarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jFileChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        guardarLayout.setVerticalGroup(
            guardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(guardarLayout.createSequentialGroup()
                .addComponent(jFileChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        grosor.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                grosorStateChanged(evt);
            }
        });

        lienzo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                lienzoMouseDragged(evt);
            }
        });
        lienzo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lienzoMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lienzoMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout lienzoLayout = new javax.swing.GroupLayout(lienzo);
        lienzo.setLayout(lienzoLayout);
        lienzoLayout.setHorizontalGroup(
            lienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 766, Short.MAX_VALUE)
        );
        lienzoLayout.setVerticalGroup(
            lienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 414, Short.MAX_VALUE)
        );

        dibujar.setText("Dibujar");
        dibujar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                dibujarMousePressed(evt);
            }
        });

        goma.setText("Goma");
        goma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                gomaMousePressed(evt);
            }
        });

        color.setText("Color");
        color.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                colorMousePressed(evt);
            }
        });

        relleno.setText("Relleno");
        relleno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                rellenoMousePressed(evt);
            }
        });

        jButton1.setText("No Relleno");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1MousePressed(evt);
            }
        });

        jMenu1.setText("Archivo");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem1.setText("Nuevo");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem7.setText("Abrir");
        jMenu1.add(jMenuItem7);

        jMenuItem8.setText("Guardar");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem8);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Formas");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem2.setText("Circulo");
        jMenuItem2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuItem2MousePressed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem3.setText("Triangulo");
        jMenuItem3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuItem3MousePressed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem4.setText("Cuadrado");
        jMenuItem4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuItem4MousePressed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem5.setText("Pentagono");
        jMenuItem5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuItem5MousePressed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem6.setText("Hexagono");
        jMenuItem6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuItem6MousePressed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lienzo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 196, Short.MAX_VALUE)
                        .addComponent(goma)
                        .addGap(18, 18, 18)
                        .addComponent(dibujar)
                        .addGap(18, 18, 18)
                        .addComponent(grosor, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(relleno)
                        .addGap(18, 18, 18)
                        .addComponent(color)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(figuraActual, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(color, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(figuraActual, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(goma)
                        .addComponent(dibujar)
                        .addComponent(grosor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1)
                        .addComponent(relleno)))
                .addGap(19, 19, 19)
                .addComponent(lienzo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lienzoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lienzoMousePressed
        switch (numLados){
            case 1000: miForma = new Circulo(evt.getX(), evt.getY(), colorSeleccionado, pintado); break;
            case 3: miForma = new Triangulo(evt.getX(), evt.getY(), colorSeleccionado, pintado); break;
            case 4: miForma = new Cuadrado(evt.getX(), evt.getY(), colorSeleccionado, pintado); break;
            case 5: miForma = new Pentagono(evt.getX(), evt.getY(), colorSeleccionado, pintado); break;
            case 6: miForma = new Hexagono(evt.getX(), evt.getY(), colorSeleccionado, pintado); break;
            }
        if (numLados == 20){
            miLinea = new AMano(evt.getX(), evt.getY(), radioPincel, colorSeleccionado, true);
        }
        if (numLados == 21){
            miLinea = new AMano(evt.getX(), evt.getY(), radioPincel, Color.WHITE, true);
        }
            repaint(0,0,1,1);
    }//GEN-LAST:event_lienzoMousePressed

    private void lienzoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lienzoMouseDragged
        if (numLados == 20 || numLados == 21){
            bufferGraphics.drawImage(buffer, 0, 0, null);
            miLinea.dibujate(bufferGraphics,evt.getX(), evt.getY(), radioPincel);
            miLinea.dibujate(buffer2Graphics,evt.getX(), evt.getY(), radioPincel);
            lienzoGraphics.drawImage(buffer, 0, 0, null);
        }
        else{
            bufferGraphics.drawImage(buffer2, 0, 0, null);
            miForma.dibujate(bufferGraphics,evt.getX(), evt.getY());
            lienzoGraphics.drawImage(buffer, 0, 0, null);
        }
    }//GEN-LAST:event_lienzoMouseDragged

    private void lienzoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lienzoMouseReleased
        if (numLados == 20 || numLados == 21){
            miLinea.dibujate(buffer2Graphics,evt.getX(), evt.getY(), radioPincel);
        }
        else{
        miForma.dibujate(buffer2Graphics,evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_lienzoMouseReleased

    private void jMenuItem2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem2MousePressed
        numLados = 1000;
        ponImagen(numLados);
    }//GEN-LAST:event_jMenuItem2MousePressed

    private void rellenoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rellenoMousePressed
        pintado = true;
        ponImagen(numLados);
    }//GEN-LAST:event_rellenoMousePressed

    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed
        pintado = false;
    }//GEN-LAST:event_jButton1MousePressed

    private void dibujarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dibujarMousePressed
        numLados = 20;
        ponImagen(numLados);
    }//GEN-LAST:event_dibujarMousePressed

    private void jMenuItem3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem3MousePressed
        numLados = 3;
        ponImagen(numLados);
    }//GEN-LAST:event_jMenuItem3MousePressed

    private void jMenuItem4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem4MousePressed
        numLados = 4;
        ponImagen(numLados);
    }//GEN-LAST:event_jMenuItem4MousePressed

    private void jMenuItem5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem5MousePressed
        numLados = 5;
        ponImagen(numLados);
    }//GEN-LAST:event_jMenuItem5MousePressed

    private void jMenuItem6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem6MousePressed
        numLados = 6;
        ponImagen(numLados);
    }//GEN-LAST:event_jMenuItem6MousePressed

    private void gomaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gomaMousePressed
        numLados = 21;
        ponImagen(numLados);
    }//GEN-LAST:event_gomaMousePressed

    private void grosorStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_grosorStateChanged
        radioPincel = (int) grosor.getValue();
    }//GEN-LAST:event_grosorStateChanged

    private void colorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_colorMousePressed
        colores.setVisible(true);
    }//GEN-LAST:event_colorMousePressed

    private void aceptarColorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aceptarColorMousePressed
        colorSeleccionado = jColorChooser1.getColor();
        colores.setVisible(false);
    }//GEN-LAST:event_aceptarColorMousePressed

    private void cancelarColorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarColorMousePressed
        colores.setVisible(false);
    }//GEN-LAST:event_cancelarColorMousePressed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        guardar.setVisible(true);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPaintGalo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPaintGalo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPaintGalo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPaintGalo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPaintGalo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptarColor;
    private javax.swing.JButton cancelarColor;
    private javax.swing.JButton color;
    private javax.swing.JDialog colores;
    private javax.swing.JButton dibujar;
    private javax.swing.JLabel figuraActual;
    private javax.swing.JButton goma;
    private javax.swing.JSpinner grosor;
    private javax.swing.JDialog guardar;
    private javax.swing.JButton jButton1;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JPanel lienzo;
    private javax.swing.JButton relleno;
    // End of variables declaration//GEN-END:variables
}
