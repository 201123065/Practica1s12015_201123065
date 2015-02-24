/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica1s12015_201123065;


public class ListaEnlazada {
    Nodo cabeza;
    int tam;
    
    public ListaEnlazada(){
        cabeza=null;
        tam=0;
    }
    
    public void addPrimero(Object obj){
        if(cabeza==null){
            cabeza = new Nodo(obj);
        }
        else{
            Nodo temp = cabeza;
            Nodo nuevo = new Nodo(obj);
            nuevo.setSiguiente(temp);
            cabeza = nuevo;
        }
        tam++;
    }
    
    public Object obtener(int indice){
        int contador=0;
        Nodo temporal = cabeza;
        while(contador<indice){
            temporal= temporal.getSiguiente();
            contador++;
        }
        return temporal.getValor();
    }
    
    public void eliminarPrimero(){
        cabeza= cabeza.getSiguiente();
        tam -=1;
    }
    
    public int size(){
        return tam;
    }
    
    public boolean estaVacia(){
        return(cabeza==null)?true:false;
    }
    
}
