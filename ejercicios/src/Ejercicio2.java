import java.util.*;
public class Ejercicio2 {
    public static void main(String[] args) {

        System.out.println("Hi there! Este programa tiene la funcionalidad de saber si el número que digita un usuario es par o es impar, so... Let's Go!!!");

        Scanner meineObj = new Scanner (System.in);
        int userNum;
        System.out.print("Digite un número: ");

        userNum=meineObj .nextInt();

        if (userNum%2==0) {
    
            System.out.print("El número ingresado es par");
        }else if (userNum>10) {
            System.out.println();
            System.out.println("el num es mayor a 10 ");
            
            
    
    }else{

            System.out.print("El número ingresado es impar" );
        } if (10>userNum) {
            System.out.println("El num es menor que 10");
        }

        meineObj.close();
    }
    
}
