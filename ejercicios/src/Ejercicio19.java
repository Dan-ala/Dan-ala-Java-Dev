import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        int saludo=10, salUsu;

        System.out.print("Ingrese un número del 1-10; el programa lo puede saludar o se despide: ");

        Scanner saludoss=new Scanner(System.in);
        salUsu=saludoss .nextInt();

        if (salUsu==10) {
            System.out.println("Hi there!");
        }else if(salUsu<10){
            System.out.println("How are u?");
        }else if(salUsu>10){
            System.out.println("See ya!");
        }

        saludoss.close();
    }
}
