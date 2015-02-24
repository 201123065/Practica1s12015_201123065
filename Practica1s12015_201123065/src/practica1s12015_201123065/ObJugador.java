
package practica1s12015_201123065;

import java.io.Serializable;
public class ObJugador implements Serializable{
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
    public ObJugador(String tipo,String nom,String extra, int cant){
        setTipo(tipo);
        setNombre(nom);
        setCant(cant);
        setExtra(extra);
    }
    
    public void setNombre(String planta){
        this.nombre=planta;
    }
    public String getNombre(){
        return nombre;
    }
    
    public void setTipo(String Tipo){
        this.Tipo=Tipo;
    }
    public String getTipo(){
        return Tipo;
    }
    
    public void setCant(int cantidad){
        this.cantidad=cantidad;
    }
    public int getCantidad(){
        return cantidad;
    }
    
    public void setExtra(String extra){
        this.Extra=extra;
    }
    public String getExtra(){
        return Extra;
    }
    
    
}
