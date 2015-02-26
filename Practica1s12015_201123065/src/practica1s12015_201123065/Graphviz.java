/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica1s12015_201123065;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author marcosmayen
 */
public class Graphviz {
   /**
     * @param args the command line arguments
     */
    
    public void generaTXT(ListaEnlazada L1, ListaEnlazada Li, ListaEnlazada Planta, ListaEnlazada Zombi)
    {
        
        ObJugador Ob = (ObJugador)L1.obtener(0);    
        ObJugador Ob2=(ObJugador)Li.obtener(0);
        String val;
        if(Ob.getExtra().equals("")){
            val="vacio";
        }else{
            val=Ob.getExtra();
        }
        String val2;
        if(Ob2.getExtra().equals("")){
            val2="vacio";
        }else{
            val2=Ob.getExtra();
        }
        
        String imprime;
        imprime="digraph G\n" +
                "{ Jugador->Plantas; Plantas->"+Ob.getNombre()+"->"+
                Ob.getTipo()+"->"+val+"; Plantas->Zombis;"+
                "Zombis->"+Ob2.getNombre()+"->"+Ob2.getTipo()+"->"+val2+";}";
       
        File f ;
        FileWriter fw;
        try{
            f= new File("/Users/marcosmayen/Desktop/a.dot");
            fw = new FileWriter(f);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            
            pw.write(imprime);
            pw.close();
            bw.close();
            
        }catch(IOException e){
            System.out.println("errorosoo");
        } 
        
       
        OpenGraph();
        
    }
    
    public void OpenGraph(){
        try {
            

          String dotPath = "/Applications/Graphviz.app/Contents/MacOS/Graphviz";

          String fileInputPath = "/Applications/Graphviz.app/a.dot";
          String fileOutputPath = "/Users/marcosmayen/grafo1.jpg";

          String tParam = "-Tjpg";
          String tOParam = "-o";

          String[] cmd = new String[5];
          cmd[0] = dotPath;
          cmd[1] = tParam;
          cmd[2] = fileInputPath;
          cmd[3] = tOParam;
          cmd[4] = fileOutputPath;

          Runtime rt = Runtime.getRuntime();

          rt.exec( cmd );

        } catch (Exception ex) {
          ex.printStackTrace();
        } finally {
        }

    }
    
}
