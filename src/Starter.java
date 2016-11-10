
import java.io.*;
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class Starter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        
        File f = new File("pets.txt"); //Leer la lista de clientes
        //System.out.println(f.length());
        Scanner leer= new Scanner(new File("pets.txt"));
              
        Vet v=new Vet();
        
        //java.util.Scanner teclado=new java.util.Scanner(System.in);
        //System.out.println("Ingrese su id para remover mascota: ");
        //int id=teclado.nextInt(); 
        
        //v.removePet(id); //removerMascota(id);12                
        //lectu(leer);
        while(leer.hasNextLine()){
            String texto= leer.nextLine();
            System.out.println(texto);
        }
        
    }
    public static void lectu (Scanner leer){
        
        while (leer.hasNext()){
            String lectura= leer.next();       
            System.out.println(lectura);
            ArrayList<String> Datos= new ArrayList<String>();
            Datos.add(lectura);
        }
    }
    
}
        
        
    
    

