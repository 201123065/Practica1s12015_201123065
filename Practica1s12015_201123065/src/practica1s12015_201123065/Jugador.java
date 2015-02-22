
package practica1s12015_201123065;

public class Jugador {
    private Jugador Siguiente;
    private Object Contiene;
    public Jugador()
    {
        setSiguiente(null);
        setContiene(null);
    }
    public Jugador(Object o)
    {
        setSiguiente(null);
        setContiene(o);
    }public Jugador(Object o, Jugador s)
    {
        setSiguiente(s);
        setContiene(o);
    }
    
    
    public Jugador getSiguiente()
    {
        return Siguiente;
    }
    public void setSiguiente(Jugador Siguiente)
    {
        this.Siguiente = Siguiente;
    }
    public Object getContiene()
    {
        return Contiene;
    }
    public void setContiene(Object Contiene)
    {
        this.Contiene= Contiene;
    }

}
