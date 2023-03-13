import java.util.Scanner;
public class Ejercicio30 {
    public static void main(String[] args) {
        System.out.println("Este programa identifica la estación en la que se encuentra, teniendo en cuenta que se está en el bus de Transmilenio B27, su destino es el SENA de la 52 con AV. Caracas, y se baja en la estación Marly");
        System.out.println("Por favor, digite la estación en la que se encuentra (de la estación 1-4): ");

        int station;

        Scanner numEstacion=new Scanner(System.in);
        station=numEstacion .nextInt();

        switch (station) {
            case 1:
                System.out.println("Usted está en el Portal Tunal, le hacen falta 3 estaciones");
                break;
            
            case 2:
            System.out.println("Usted está en la Calle 40 Sur, le hacen falta 2 estaciones");
                break;

            case 3:
            System.out.println("Usted está en AV. Jiménez (AV. Caracas), le hace falta una estación para llegar a su destino! Esté atento!!");
                break;

            case 4:
            System.out.println("Usted está en la estación Marly. Ya puede bajarse del bus, le deseamos un buen día");
                break;
        
            default:
                System.out.println("No ingrese letras, ingrese el número de las estaciones, del 1-4");
                break;
        }
        numEstacion.close();
    }
}
