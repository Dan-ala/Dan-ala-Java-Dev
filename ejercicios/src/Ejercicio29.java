import java.util.*;
public class Ejercicio29 {
    public static void main(String[] args) {
        System.out.println("El programa le indica si es apto para ser partícpe en las elecciones presidenciales de este año");
        System.out.print("Digite su edad: ");
        int age;
        Scanner edad=new Scanner(System.in);
        age=edad .nextInt();
        if (age<=17) {
            System.out.println("Lo sentimos mucho, pero aún no puede participar");
        }else{
            System.out.println("Puede votar por su candidato");
        }
        edad.close();
    }
}
