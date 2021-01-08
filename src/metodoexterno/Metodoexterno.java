/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodoexterno;


public class Metodoexterno {

  
    public static void main(String[] args) {
      Ordenamiento_intercalacion ordenacion =new Ordenamiento_intercalacion(); // se instancia para poder  mostrar los datos
    //se declaran los vectores
    int vector1[] ={6,15,12,8,11,1,16}; // se inserta los valores que va tener el vector 
    int vector2[]={3,0,17,5,3,9,22};
    System.out.println("arreglo vector 1 original: ");
    ordenacion.mostrarArreglo(vector1);// se solicita el metodo desde la subclase para que nos muestre el vector 
     
    System.out.println("arreglo vector 2 original: ");//se envia un mensaje 
    ordenacion.mostrarArreglo(vector2); // solicitamos que nos muestre el vector 3 
   ordenacion.burbuja1(vector1);// metodo burbuja
    ordenacion.burbuja1(vector2);
    ordenacion.intercalacion(vector1,vector2);// se inserta el metodo para ordenar los numeros previamente ordenados
    
    }
       
        
}
    
