/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica1s12015_201123065;
import java.io.Serializable;
/**
 *
 * @author marcosmayen
 */
public class ObJugado implements Serializable{
    
     private String Tipo,nombre, Extra;
    private int cantidad;
    String tipodefinido="";
    
   /* public ObJugador(){
        setTipo("");
        setNombre("");
        setCant(5);
        setExtra("");
    } 
    /**/
    public ObJugado(String Imagen,String nom,int puntos,String tipo){
        setImagen(Imagen);
        setNombre(nom);
        setPuntos(puntos);
        setTipo(tipo);
    }
    public void setImagen(String extra){
        this.Extra=extra;
    }
    public String getImagen(){
        return Extra;
    }
    
    public void setNombre(String planta){
        this.nombre=planta;
    }
    public String getNombre(){
        return nombre;
    }
    
    public void setPuntos(int cantidad){
        this.cantidad=cantidad;
    }
    public int getPuntos(){
        return cantidad;
    }
    
    public void setTipo(String Tipo){
        this.Tipo=Tipo;
    }
    public String getTipo(){
        return Tipo;
    }
    
}
