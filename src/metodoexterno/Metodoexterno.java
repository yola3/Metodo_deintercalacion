/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodoexterno;


public class Metodoexterno {

  
    public static void main(String[] args) {
      Ordenamiento_intercalacion ordenacion =new Ordenamiento_intercalacion(); // se instancia para poder  mostrar los datos
    //se declaran los tipos de vectores
    int vector1[] ={5,13,15,8,7,1}; // se inserta los valores que va tener el vector 
    
    int vector2[]={4,10,12,15,3,56,22};
    System.out.println("arreglo vector 1 original: ");
    ordenacion.mostrarArreglo(vector1);// se solicita el metodo desde la subclase para que nos muestre el vector 
     
    System.out.println("arreglo vector 2 original: ");//se envia un mensaje 
    ordenacion.mostrarArreglo(vector2); // solicitamos que nos muestre el vector 3 
   ordenacion.burbuja1(vector1);// se ocupa el metodo burbuja para poder los numeros 
    ordenacion.burbuja1(vector2);
    ordenacion.intercalacion(vector1,vector2);// se inserta el metodo para ordenar los numeros previamente ordenados
    
    }
       
        
}
    
