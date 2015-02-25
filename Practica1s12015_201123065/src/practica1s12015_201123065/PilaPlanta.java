
package practica1s12015_201123065;


public class PilaPlanta {
    
    ObJugado[] Lista;
    int top;
    public PilaPlanta(){
        Lista = new ObJugado[5];
        top =0;
    }
    public boolean vacia()
    {
        if(top==0){return true;}
        else{return false;}
    }
    public void push(ObJugado Enlace){
        if(top<Lista.length){
            Lista[top]=Enlace;
            top++;
        }
        else{
            ObJugado temp[]= new ObJugado[Lista.length+5];
            for(int i=0;i<Lista.length;i++)
            {
                temp[i]=Lista[i];
            }
        }
    }
    
    public ObJugado peek(){
        if(top>0)
            return Lista[top-1];
        else
            return null;
    }
    public ObJugado Pop()
    {
        ObJugado temp=null;
        if(top>0)
        {
            temp=Lista[top-1];
            Lista[top-1]=null;
            top--;
        }
        return temp;
    }
}
