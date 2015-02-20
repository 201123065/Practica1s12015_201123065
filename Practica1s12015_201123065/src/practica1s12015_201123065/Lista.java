/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica1s12015_201123065;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author marcosmayen
 */
public class Lista {
    ArrayList<Integer> entero= new ArrayList();
    public Lista(){
        
    }
    public void agregarDatos(int a){
        entero.add(a);
    }
    public void mostrarArreglo(){
        for(int i=0;i<entero.size();i++)
        {
            JOptionPane.showMessageDialog(null, "Numero de posicion "+i +" es igual "+entero.get(i));
        }
    }
}
