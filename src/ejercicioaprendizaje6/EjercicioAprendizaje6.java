/*
Crear un programa que dado un numero determine si es par o impar.
 */
package ejercicioaprendizaje6;

import java.util.Scanner;

public class EjercicioAprendizaje6 {
    public static void main(String[] args) {
        int num;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingresa un número: ");
        num = entrada.nextInt();
        
        if(num%2==0){
            System.out.println("El número es par");
        }else{
            System.out.println("El número es impar");
        }
    }
    
}
