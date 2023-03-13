import java.util.Scanner;
public class Ejercicio12 {
    public static void main(String[] args) {
        int eadadPersona, edadPeli=18, peli;
        System.out.print("¿De qué género quiere ver la película? 1 para terror y 2 familiar: ");

        Scanner pelicula=new Scanner(System.in);
        peli=pelicula .nextInt();

        switch (peli) {
            case 1:
            System.out.print("Ingrese su edad: ");

            Scanner edad=new Scanner(System.in);
            eadadPersona=edad .nextInt();

            if (eadadPersona>=edadPeli) {

                System.out.println("Puede ver la película");
            }else{
                System.out.println("Tiene que estar acompañado");
            }
                break;

                case 2:

                System.out.print("Ingrese su edad: ");

                Scanner edad2=new Scanner(System.in);
                eadadPersona=edad2 .nextInt();

            if (eadadPersona>=10) {
                System.out.println("Puede ver la película");
            }else{
                System.out.println("Tranquilo puede verla en familia");
            }
            break;
        
            default:
                break;
        }
        pelicula.close();
    }
}
