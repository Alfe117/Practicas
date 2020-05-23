
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alvin
 */
public class Grafo {
    Nodo nodo;
    Arista arista;


    public void matrizAdy(int cant, ArrayList<Integer> fil, ArrayList<Integer> col){
        System.out.println(" - - - MATRIZ DE ADYACENCIA - - - \n\n");
        int matriz[][] = new int[cant][cant];
        for(int k = 0; k < cant; k++){
           for(int l = 0; l < cant; l++ ){
               matriz[k][l] = 0;
           }
        }
            
           for(int l = 0; l < fil.size(); l++ ){
               //matriz[k][l] = 0;
               
                   matriz[fil.get(l)][col.get(l)] = 1;
                  // matriz[col.get(l)][fil.get(l)] = 1;
               
           }
        
        //------ Parte grafica solamente ------
        System.out.print("    ");
        for(int k = 0; k < cant; k++){
            System.out.print(k + "    " );
        }
        
        System.out.print("\n    ");
        for(int k = 0; k < cant; k++){
            System.out.print("_" + "    " );
        }
        System.out.println("");
        //------ Parte grafica solamente ------
        
        
        for(int k = 0; k < cant; k++){
            System.out.print( k + " | ");
           for(int l = 0; l < cant; l++ ){
               System.out.print(matriz[k][l] + "    ");
           }
            System.out.println("");
            System.out.println("");
        }
    }
    
    public Nodo getNodo() {
        return nodo;
    }
    

    public void setNodo(Nodo nodo) {
        this.nodo = nodo;
    }

    public Arista getArista() {
        return arista;
    }

    public void setArista(Arista arista) {
        this.arista = arista;
    }
    
    
}
