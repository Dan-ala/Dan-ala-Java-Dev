import java.util.*;
public class Ejercicio1 {
    public static void main(String[] args){
    

        Scanner meineObj = new Scanner(System.in);
        int anoNaci;
        System.out.print("Ingrese año de nacimiento: ");

        anoNaci=meineObj .nextInt();

        System.out.println("El año de nacimiento es: " + anoNaci);
        
        //Ahora vamos a ingresar la fecha actual para poder calcular la edad de la persona

        Scanner meineObj2 = new Scanner(System.in);
        int date;
        System.out.print("Ingrese fecha actual: ");

        date=meineObj2 .nextInt();

        System.out.println("La fecha actual es: " + date);

        //Ahora se mostrará en pantalla la edad de la persona

        Scanner meineObj3 = new Scanner(System.in);
        int resta = date-anoNaci;
        System.out.print("La edad actual es: " + resta);

        meineObj.close();
        meineObj2.close();
        meineObj3.close();
    }

}