import java.util.Scanner;
public class Ejercicio16 {
    public static void main(String[] args) {

        int num=4;

        System.out.print("Digite un número, intente adivinarlo, (del 1-4): ");

        Scanner numIngresado=new Scanner(System.in);
        num=numIngresado .nextInt();

        switch (num) {
            case 1:
            System.out.println("No lo adivinó");
                break;

                case 2:
                System.out.println("No lo adivinó");
                break;

                case 3:
                System.out.println("No lo adivinó");
                break;

                case 4:
                System.out.println("Lo adivinó");
                break;
        
            default:
            System.out.println("No lo adivinó");
                break;
        
        }
        numIngresado.close();
    }
}
