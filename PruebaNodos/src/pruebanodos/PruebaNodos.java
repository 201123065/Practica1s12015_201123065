
package pruebanodos;


public class PruebaNodos {

    public static void main(String[] args) {
        
        ListaEnlazada Lista = new ListaEnlazada();
        System.out.println("esta vacia:"+Lista.estaVacia());
        
        Lista.addPrimero("Marcos");
        Lista.addPrimero("Daniel");
        Lista.addPrimero("Mayen");
        Lista.addPrimero("de");
        Lista.addPrimero("Leon");
        
        System.out.println(Lista.obtener(2));
        
    }
    
}
