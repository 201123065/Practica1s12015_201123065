/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica1s12015_201123065;

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