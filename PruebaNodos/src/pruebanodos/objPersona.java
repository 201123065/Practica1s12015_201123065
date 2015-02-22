
package pruebanodos;
import java.io.Serializable;
public class objPersona implements Serializable{
    
    private String nombre, direccion, tel;
    
    public objPersona(){
        setNombre("-");
        setDir("-");
        setTel("-");
    }
    public objPersona(String nombre,String Dir,String tel){
        setNombre(nombre);
        setDir(Dir);
        setTel(tel);
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getDir(){
        return direccion;
    }
    public void setDir(String dir){
        this.direccion = dir;
    }
    public String getTel(){
        return tel;
    }
    public void setTel(String tel){
        this.tel=tel;
    }
}
