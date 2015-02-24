
package pruebanodos;
import java.io.Serializable;
public class objPersona implements Serializable{
    
    private String tipo, nombre, extra;
    private int cantidad;
    
    public objPersona(){
        setTipo("-");
        setNombre("-");
        setCant(0);
        setExtra("-");
    }
    public objPersona(String Tipo,String nombre,int cant,String extra){
        setTipo(Tipo);
        setNombre(nombre);
        setCant(cant);
        setExtra(extra);
    }
    public String getTipo(){
        return tipo;
    }
    public void setTipo(String tipo){
        this.tipo=tipo;
    }   
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public int getCant(){
        return cantidad;
    }
    public void setCant(int cantidad){
        this.cantidad=cantidad;
    }
    public String getExtra(){
        return extra;
    }
    public void setExtra(String extra){
        this.extra = extra;
    }
}
