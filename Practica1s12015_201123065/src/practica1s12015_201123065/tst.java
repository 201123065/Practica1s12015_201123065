/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica1s12015_201123065;

import java.awt.Color;
import java.awt.Image;
import java.util.Random;
import java.util.Stack;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author marcosmayen
 */
public class tst extends javax.swing.JFrame {

    /**
     * Creates new form tst
     */
    
    public tst() {
        initComponents();
    }

    ListaEnlazada[][] Posicion;
    public void matriz(int x,int y)
    {
        Posicion = new ListaEnlazada[x][y];
        int i,j=0;
        JButton[][] matlbl= new JButton[x][y];
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
        fondo(i,j);
        paneles(i,j);
    }
    public void fondo(int x, int y)
    {
        ImageIcon icono = new ImageIcon("/imagenes/bg.jpg");
        JLabel fondo = new JLabel();
        fondo.setIcon(icono);
        fondo.setBounds(10, 10, 100, 100);
        add(fondo);
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
     
     
     JLabel RestantesJ1, RestantesJ2;
    public void paneles(int i, int j)
    {
        
        ObJugador aux1 =(ObJugador)JPlanta.obtener(0);
        JLabel J1 = new JLabel(aux1.getNombre());
        J1.setBounds(5, 30, 55, 20);
        add(J1);
        
        JLabel Personaje1 = new JLabel("restantes: ");
        Personaje1.setBounds(5, 10, 355, 40);
        add(Personaje1); 
        RestantesJ1 = new JLabel(aux1.getCantidad()+"");
        RestantesJ1.setBounds(70, 10, 355, 40);
        add(RestantesJ1);
        
        JPanel PanelP = new JPanel();
        PanelP.setBounds(5, 50, 55, j*50);
        PanelP.setBackground(Color.green);
        add(PanelP);
        
        ObJugador aux2 =(ObJugador)JZombi.obtener(0);
        JLabel J2 = new JLabel(aux2.getNombre());
        J2.setBounds(i*50+65, 30, 55, 20);
        add(J2);
        
        JLabel Personaje2 = new JLabel("restantes: ");
        Personaje2.setBounds(i*50+65, 10, 355, 40);
        add(Personaje2); 
        RestantesJ2 = new JLabel(aux2.getCantidad()+"");
        RestantesJ2.setBounds(i*50+130, 10, 355, 40);
        add(RestantesJ2);
        
        
        JPanel PanelZ = new JPanel();
        PanelZ.setBounds(i*50+85, 50, 55, j*50);
        PanelZ.setBackground(Color.BLACK);
        add(PanelZ); 
        
        pzInicial();
        //randomJ1();
        
        
    }
    public void pzInicial()
    {
        Random Aleatorio = new Random();
        int valor = Aleatorio.nextInt(Planta.size());
        ObJugado Ob = (ObJugado)Planta.obtener(valor);
        
        String file = Ob.getImagen();
        ImageIcon icon = new ImageIcon(file);
        Image img = icon.getImage();
        Image nuevaImg = img.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
        ImageIcon newicon = new ImageIcon(nuevaImg);
        
        JButton JL = new JButton(Ob.getNombre());
        JL.setIcon(newicon);
        JL.setSize(50,50);
        JL.setBounds(5, 50, 50, 50);
        add(JL);
        PilaPlanta pp= new PilaPlanta();
        pp.push(Ob);
        ListaEnlazada JP=Planta;
        
        
    }
    
    public void randomJ1()
    {
        ObJugador J1 = (ObJugador)JPlanta.obtener(0);
        Random Aleatorio = new Random();
        int valor = Aleatorio.nextInt(J1.getCantidad());
        RestantesJ1 = new JLabel(""+valor);
        RestantesJ1.setBounds(70, 10, 355, 40);
        add(RestantesJ1);
    }
    public void randomJ2()
    {
        
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
        jMenu1.add(jMenu3);

        jMenu4.setText("Menu principal");
        jMenu1.add(jMenu4);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("salir");
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
