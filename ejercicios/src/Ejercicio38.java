import java.util.Scanner;
public class Ejercicio38{
    public static void main(String[] args) {
        System.out.println("El número promedio de asientos para una sala de cine está alrededor de 177 personas");

        int personasVerPeli;
        int edad;

        Scanner numPer=new Scanner(System.in);
        System.out.print("Ingrese la cantidad de personas con las cuales desea asistir: ");
        personasVerPeli=numPer .nextInt();

        String[] namePer=new String[personasVerPeli];
        int[] agePer=new int[personasVerPeli];

        int capacidadSala=0;

        for(int i=0; i<personasVerPeli; i++){
            System.out.print("Se solicita el nombre de la persona "  + (i+1) + ": ");
            namePer[i]=numPer .next();

            System.out.print("Ingrese la edad de la persona " + (i+1) + ": ");
            agePer[i]=numPer .nextInt();
            edad=numPer .nextInt();


            capacidadSala +=personasVerPeli;

            
        

        switch (edad) {
            case 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40
            ,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80:
                    if (edad>18) {
                        System.out.println("Puede ver la pe8lícula");
                    }else{
                        System.out.println("Por favor, retírese de la sala");
                    }
                break;
        
            default:
            System.out.println("Edad no válida");
                break;
    }

        System.out.println("La sala está con " + capacidadSala);
    }

    if (capacidadSala>personasVerPeli) {
        System.out.println("Sala saturada, NO SE PERMITEN TANTA GENTE DEBIDO A EL COVID-19");
    }
    numPer.close();
    }
}