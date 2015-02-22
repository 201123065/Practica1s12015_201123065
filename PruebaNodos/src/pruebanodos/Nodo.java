
package pruebanodos;

public class Nodo {
   Object valor;
   Nodo Siguiente;
   
   public Nodo(Object valor)
   {
       this.valor=valor;
       this.Siguiente=null;
   }
   public Object getValor(){
       return valor;
   }
   
   public void setSiguiente(Nodo n){
       Siguiente=n;
   }
   public Nodo getSiguiente(){
       return Siguiente;
   }
}
