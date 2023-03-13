import java.util.*;
public class Ejercicio27 {
    public static void main(String[] args) {
        System.out.println("Se determinará si el nombre de una persona ingresado es corto o largo");
        System.out.print("Ingrese su nombre: ");
        String nombre;
        int medida;
        Scanner ingresedata=new Scanner(System.in);
        nombre=ingresedata .nextLine();

        System.out.print("Ingrese la cantidad de caracteres que tiene el nombre: ");
        medida=ingresedata .nextInt();

        if (nombre.length()>=medida) {
            System.out.println("El nombre es largo, el nombre ingresado es: " + nombre);
        }else{
            System.out.println("El nombre es corto, el nombre ingresado es: " + nombre);
        }
        ingresedata.close();
    }
}
