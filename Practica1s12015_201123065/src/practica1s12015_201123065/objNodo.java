/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica1s12015_201123065;

import java.io.Serializable;
public class objNodo implements Serializable{
    
    private String prueba,valor,val2;
    public objNodo()
    {
        setPrueba("-");
        setValor("-");
        setVal2("-");
    }
    public  objNodo(String tst,String Val,String Val2){
        setPrueba(tst);
        setValor(Val);
        setVal2(Val2);
    }
    public void setPrueba(String prueba){
        this.prueba=prueba;
    }
    public void setValor(String valor){
        this.valor=valor;
    }   
    public void setVal2(String val2){
        this.val2=val2;
    }
    public String getPrueba(){
        return prueba;
    }
    public String getValor(){
        return valor;
    }
    public String getVal2(){
        return val2;
    }
    
    
}

