/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica1s12015_201123065;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.Stack;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.event.AncestorListener;

/**
 *
 * @author marcosmayen
 */
public class tst extends javax.swing.JFrame implements ActionListener{

    /**
     * Creates new form tst
     */
    
    public tst() {
        initComponents();
    }

    ListaEnlazada[][] Posicion;
    int fila;
    int columna;
    JButton[][] matlbl;
    public void matriz(int x,int y)
    {
        Posicion = new ListaEnlazada[x][y];
        int i,j=0;
        matlbl= new JButton[x][y];
        for(i=0;i<x;i++)
        {
            for(j=0;j<y;j++)
            {
                matlbl[i][j]= new JButton(i+","+j);
                matlbl[i][j].setBounds(i*50+70, j*50+50, 50, 50);
                matlbl[i][j].setEnabled(false);
                add(matlbl[i][j]);
                
            }
        }
        fila=x;
        columna=y;
        paneles();
    }
    ListaEnlazada JPlanta = new ListaEnlazada();
    ListaEnlazada JZombi = new ListaEnlazada();
    ListaEnlazada Planta = new ListaEnlazada();
    ListaEnlazada Zombi = new ListaEnlazada();
    
    public void setTipo(
            ListaEnlazada JugadorP,
            ListaEnlazada JugadorZ,
            ListaEnlazada LPlanta,
            ListaEnlazada LZombi)
    {
        JPlanta= JugadorP;
        JZombi = JugadorZ;
        Planta = LPlanta;
        Zombi=LZombi;
    }
     
     
       JButton[] imagen = new JButton[10];
     JLabel RestantesJ1, RestantesJ2;
    public void paneles()
    {
        Random aleatorio = new Random();
       int i;
       for(i=0;i<5;i++)
        {
            
            imagen[i]= new JButton();
            imagen[i].setBounds(10, 50+50*i, 50, 50);
            int valor = aleatorio.nextInt(Planta.size()-1);
            ObJugado aux2 =(ObJugado)Planta.obtener(valor);
            
            String file = aux2.getImagen();
            System.out.println(file);
            ImageIcon icon = new ImageIcon(file);
            Image img = icon.getImage();
            
            Image nuevaImg = img.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH);
            ImageIcon newicon = new ImageIcon(nuevaImg);
            imagen[i].setIcon(newicon);
            imagen[i].setSize(50, 50);
            imagen[i].addActionListener(this);
            add(imagen[i]);
            
        }
        
    }
    
    int toca=0;
    JButton JL;
     public void actionPerformed(ActionEvent e){
        if(e.getSource()==imagen[0])
        {
            for(int x=0;x<fila;x++)
            {
                for(int y=0;y<columna;y++){
                    if(toca%2==0){
                    matlbl[x][y].setEnabled(true);
                    }
                    else{
                        matlbl[x][y].setEnabled(false);
                    }
                   
                }
            } 
            toca++;
        }
        else 
        {
            
        }
    }
    
     JButton Lista1[]=new JButton[10];
    
   
    
    public void randomJ1()
    {
        ObJugador J1 = (ObJugador)JPlanta.obtener(0);
        Random Aleatorio = new Random();
        int valor = Aleatorio.nextInt(J1.getCantidad());
        RestantesJ1 = new JLabel(""+valor);
        RestantesJ1.setBounds(70, 10, 355, 40);
        add(RestantesJ1);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        jToolBar1.setRollover(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Archivo");

        jMenu3.setText("Ver Grafos");
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenu1.add(jMenu3);

        jMenu4.setText("Menu principal");
        jMenu1.add(jMenu4);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("salir");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 725, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 354, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        Graphviz Op = new Graphviz();
        Op.generaTXT(JPlanta, JZombi, Planta, Zombi);
        
    }//GEN-LAST:event_jMenu3MouseClicked

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
            java.util.logging.Logger.getLogger(tst.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tst.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tst.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tst.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tst().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
