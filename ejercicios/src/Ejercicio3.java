import java.util.*;
public class Ejercicio3 {
    public static void main(String[] args) {
        
        System.out.println("¡La abuela tiene horno nuevo! y ha planeado hacer una deliciosa torta de vainilla con relleno de crema y fresas. La receta dice que debe precalentar el horno a 350°F (grados Fahrenheit), pero su horno muestra la temperatura en°C (grados Centígrados). Ayúdale a la abuela a colocar la temperatura correcta.");
        
        System.out.println("Vamos a crear un programa que convierta grados F° a grados C°");
    
        


        Scanner meineObj1stinput = new Scanner(System.in);
        double Fahrenheit = (0);

        System.out.print("Ingrese grados en Fahrenheit: ");

        Fahrenheit=meineObj1stinput .nextDouble();


        Scanner meineObjParentesis = new Scanner(System.in);
        double Parentesis = Fahrenheit - 32;


        System.out.println(Parentesis);

        Scanner meineObjDiv = new Scanner(System.in);
        double div = Parentesis / 1.8;

        System.out.print("El resultado es: " + div);


    meineObj1stinput.close();
    meineObjParentesis.close();
    meineObjDiv.close();

    }
}
