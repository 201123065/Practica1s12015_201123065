/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica1s12015_201123065;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.regex.*;
import javax.swing.JLabel;

/**
 *
 * @author marcosmayen
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
    }
    Toolkit kit = Toolkit.getDefaultToolkit();
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jButton1 = new javax.swing.JButton();
        Columnas = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Error = new javax.swing.JLabel();
        btnPlanta = new javax.swing.JButton();
        Filas = new javax.swing.JTextField();
        btnZombi = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 126, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 19, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Iniciar Juego");
        jButton1.setEnabled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Columnas.setText("2");
        Columnas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ColumnasActionPerformed(evt);
            }
        });
        Columnas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ColumnasKeyTyped(evt);
            }
        });

        jLabel1.setText("Columnas");

        jLabel2.setText("Filas");

        btnPlanta.setText("Jugador Plantas");
        btnPlanta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlantaActionPerformed(evt);
            }
        });
        btnPlanta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnPlantaKeyPressed(evt);
            }
        });

        Filas.setText("2");
        Filas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FilasActionPerformed(evt);
            }
        });
        Filas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                FilasKeyTyped(evt);
            }
        });

        btnZombi.setText("Jugador Zombis");
        btnZombi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZombiActionPerformed(evt);
            }
        });
        btnZombi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnZombiKeyPressed(evt);
            }
        });

        jButton2.setText("ez");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("ep");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Plantas");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Zombis");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel3.setText("Catalogo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnZombi, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton5))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnPlanta, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jButton4)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Error)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButton1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addGap(21, 21, 21))
                                        .addComponent(Filas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jButton2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(Columnas, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPlanta)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnZombi)
                    .addComponent(jButton5))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(Columnas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Filas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Error)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
    
    int fila=0;
    int columna =0;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        boton();
    }//GEN-LAST:event_jButton1ActionPerformed
    
    
    
    
    
    
    
    public void boton()
    {
        fila = Integer.parseInt(Filas.getText());
        columna = Integer.parseInt(Columnas.getText());

        tst mat = new tst();
        int posX0=0;
        int posX1=0;

        mat.matriz(columna, fila);
        Dimension tam = kit.getScreenSize();
        posX0=(int) (tam.getWidth()/2)-((columna+350)/2);
        posX1=(int) (tam.getHeight()/2)-((fila+350)/2);;
        mat.setBounds(posX0,posX1 , columna*50+150, fila*50+150);
        mat.setVisible(true);
        this.setVisible(false);
    }
    
    
    public void creacion(String tipo){
        int posX0=0;

        Dimension tam = kit.getScreenSize();
        posX0=(int) (tam.getWidth()/2)-((columna+350)/2);
        
        catalogo open = new catalogo();
        open.setBounds(posX0,100 , 500, 700);
        open.crearJugador(tipo);
        open.setVisible(true);
        
    }
   
    ListaEnlazada JPlantas;
    ListaEnlazada JZombi;
    ListaEnlazada Planta;
    ListaEnlazada Zombi;
    
    public void DetectordeListas(ListaEnlazada J1, ListaEnlazada J2,ListaEnlazada P, ListaEnlazada Z)
    {
        JPlantas=J1;
        JZombi=J2;
        Planta=P;
        Zombi=Z;
        if(JZombi.estaVacia()==false)
        {
            
            if(JPlantas.estaVacia()==false)
            {
                if(Planta.estaVacia()==false)
                {
                    if(Zombi.estaVacia()==false)
                    {
                        jButton1.setEnabled(true);
                    }
                }
            }
            
        }
        else
        {
            System.out.println("D");
        }
        
        
    }
    
    public void CrearListas()
    {
        JPlantas = new ListaEnlazada();
        JZombi = new ListaEnlazada();
        Planta = new ListaEnlazada();
        Zombi = new ListaEnlazada();
    }
    
    
    private void ColumnasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ColumnasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ColumnasActionPerformed

    
    private void btnPlantaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlantaActionPerformed
        Jugadores op = new Jugadores();
        op.setTipo("planta",JPlantas,JZombi,Planta,Zombi);
        op.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnPlantaActionPerformed

    
  
    
    
    
    private void btnPlantaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnPlantaKeyPressed
        
        
    }//GEN-LAST:event_btnPlantaKeyPressed

    private void FilasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FilasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FilasActionPerformed

    private void FilasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FilasKeyTyped
        typeClass(evt);
    }//GEN-LAST:event_FilasKeyTyped

    public void typeClass(java.awt.event.KeyEvent evt)
    {
        char Ingresado = evt.getKeyChar();
        if((Ingresado<'0' || Ingresado>'9'))
        {
            evt.consume();
            Error.setText("Las letras no son validas");
        }
        else
        {
            Error.setText("");
        }
    }
    private void ColumnasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ColumnasKeyTyped
        typeClass(evt);

    }//GEN-LAST:event_ColumnasKeyTyped

    
    
    
    
    private void btnZombiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZombiActionPerformed
        Jugadores op = new Jugadores();
        op.setTipo("zombi",JPlantas,JZombi,Planta,Zombi);
        op.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnZombiActionPerformed

    
    
    
    private void btnZombiKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnZombiKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnZombiKeyPressed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        ListaEnlazada aux = JPlantas;
        for(int i=0;i<JPlantas.size();i++){
            ObJugador aux2 =(ObJugador)aux.obtener(i);
            System.out.println(aux2.getNombre());
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    
    
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(JZombi.estaVacia()==false)
        {
            ListaEnlazada aux = JZombi;
            for(int i=0;i<JZombi.size();i++)
            {
                ObJugador aux2 =(ObJugador)aux.obtener(i);
                System.out.println(aux2.getNombre());
            }
        
        }
        else
        {
            System.out.println("D");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
     
        catalogo cat = new catalogo();
        cat.setTipo("planta",JPlantas,JZombi,Planta,Zombi);
        cat.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
     catalogo cat = new catalogo();
        cat.setTipo("zombi",JPlantas,JZombi,Planta,Zombi);
        cat.setVisible(true);
        this.dispose();   // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Columnas;
    private javax.swing.JLabel Error;
    private javax.swing.JTextField Filas;
    private javax.swing.JButton btnPlanta;
    private javax.swing.JButton btnZombi;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
