/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areapoligono;
import java.util.Scanner;        
/**
 *
 * @author ASUS GAMER
 */
public class LeerDatos {
    
    public static void main(String[] args) {
     
        Scanner leer = new Scanner(System.in); 
        //Inicializamos las variables 
        int miEntero = 0;
        double miDecimal = 0;
        String miCadena = "";
        
        //lectura de Datos
        System.out.println("Ingrese un numero entero");
        miEntero = leer.nextInt();
        
        System.out.println("Ingrese un numero decimal");
        miDecimal = leer.nextDouble();
        
        System.out.println("Ingrese un texto alternativo");
        miCadena = leer.next();
        
        //Salida de Datos
        System.out.println("Mi entero :" +miEntero);
        System.out.println("Mi decimal:" +miDecimal);
        System.out.println("Mi cadena:" +miCadena);
        
        
        
    }
    
}
