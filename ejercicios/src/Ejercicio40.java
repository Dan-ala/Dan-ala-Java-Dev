import java.util.Scanner;
public class Ejercicio40 {
    public static void main(String[] args) {
        System.out.println("En esta competencia de natación... Are you ready? So LET'S GO!!");

        System.out.print("Ingrese la cantidad de competidores que participarán: ");

        int numCompetitors;
        Scanner competitors=new Scanner(System.in);
        numCompetitors=competitors .nextInt(); 

        String[] nameOfCompeti=new String[numCompetitors];
        double[] timeOfCompeti=new double[numCompetitors];

        for(int i=0; i<numCompetitors; i++){
            System.out.print("Ingrese el nombre del participante " + (i+1) + ": ");
            nameOfCompeti[i]=competitors .next();

            System.out.print("Ingrese el tiempo que tardó el participante " + (i+1) + ": ");
            timeOfCompeti[i]=competitors .nextDouble();

            System.out.println("");
        }

        //Aquí muestra lo que el usuario ha ingresado, los nombres de los competidores y sus tiempos

        for(int i=0; i<numCompetitors; i++){
            
                  //Ahora se determina el ganador

                  if (timeOfCompeti[1]<timeOfCompeti[2]||timeOfCompeti[1]<timeOfCompeti[3]||timeOfCompeti[1]<timeOfCompeti[4]||timeOfCompeti[1]<timeOfCompeti[5]||timeOfCompeti[1]<timeOfCompeti[6]||timeOfCompeti[1]<timeOfCompeti[7]
                  ||timeOfCompeti[1]<timeOfCompeti[8]||timeOfCompeti[1]<timeOfCompeti[9]||timeOfCompeti[1]<timeOfCompeti[10]||timeOfCompeti[1]<timeOfCompeti[11]||timeOfCompeti[1]<timeOfCompeti[12]) {
                    System.out.println(nameOfCompeti[1] + " Ganó");

                }else if(timeOfCompeti[2]<timeOfCompeti[1]||timeOfCompeti[2]<timeOfCompeti[3]||timeOfCompeti[2]<timeOfCompeti[4]||timeOfCompeti[2]<timeOfCompeti[5]||timeOfCompeti[2]<timeOfCompeti[6]||timeOfCompeti[2]<timeOfCompeti[7]
                ||timeOfCompeti[2]<timeOfCompeti[8]||timeOfCompeti[2]<timeOfCompeti[9]||timeOfCompeti[2]<timeOfCompeti[10]||timeOfCompeti[2]<timeOfCompeti[11]||timeOfCompeti[2]<timeOfCompeti[12]){
                    System.out.println(nameOfCompeti[2] + " Ganó");

                }else if(timeOfCompeti[3]<timeOfCompeti[1]||timeOfCompeti[3]<timeOfCompeti[2]||timeOfCompeti[3]<timeOfCompeti[4]||timeOfCompeti[3]<timeOfCompeti[5]||timeOfCompeti[3]<timeOfCompeti[6]||timeOfCompeti[3]<timeOfCompeti[7]
                ||timeOfCompeti[3]<timeOfCompeti[8]||timeOfCompeti[3]<timeOfCompeti[9]||timeOfCompeti[3]<timeOfCompeti[10]||timeOfCompeti[3]<timeOfCompeti[11]||timeOfCompeti[3]<timeOfCompeti[12]){
                    System.out.println(nameOfCompeti[3] + " Ganó");

                }else if(timeOfCompeti[4]<timeOfCompeti[1]||timeOfCompeti[4]<timeOfCompeti[2]||timeOfCompeti[4]<timeOfCompeti[3]||timeOfCompeti[4]<timeOfCompeti[5]||timeOfCompeti[4]<timeOfCompeti[6]||timeOfCompeti[4]<timeOfCompeti[7]
                ||timeOfCompeti[4]<timeOfCompeti[8]||timeOfCompeti[4]<timeOfCompeti[9]||timeOfCompeti[4]<timeOfCompeti[10]||timeOfCompeti[4]<timeOfCompeti[11]||timeOfCompeti[4]<timeOfCompeti[12]){
                    System.out.println(nameOfCompeti[4] + "Ganó");

                }else if(timeOfCompeti[5]<timeOfCompeti[1]||timeOfCompeti[5]<timeOfCompeti[2]||timeOfCompeti[5]<timeOfCompeti[3]||timeOfCompeti[5]<timeOfCompeti[4]||timeOfCompeti[5]<timeOfCompeti[6]||timeOfCompeti[5]<timeOfCompeti[7]
                ||timeOfCompeti[5]<timeOfCompeti[8]||timeOfCompeti[5]<timeOfCompeti[9]||timeOfCompeti[5]<timeOfCompeti[10]||timeOfCompeti[5]<timeOfCompeti[11]||timeOfCompeti[5]<timeOfCompeti[12]){
                    System.out.println(nameOfCompeti[5] + "Ganó");

                }else if(timeOfCompeti[6]<timeOfCompeti[1]||timeOfCompeti[6]<timeOfCompeti[2]||timeOfCompeti[6]<timeOfCompeti[3]||timeOfCompeti[6]<timeOfCompeti[4]||timeOfCompeti[6]<timeOfCompeti[5]||timeOfCompeti[6]<timeOfCompeti[7]
                ||timeOfCompeti[6]<timeOfCompeti[8]||timeOfCompeti[6]<timeOfCompeti[9]||timeOfCompeti[6]<timeOfCompeti[10]||timeOfCompeti[6]<timeOfCompeti[11]||timeOfCompeti[6]<timeOfCompeti[12]){
                    System.out.println(nameOfCompeti[6] + "Ganó");

                }else if(timeOfCompeti[7]<timeOfCompeti[1]||timeOfCompeti[7]<timeOfCompeti[2]||timeOfCompeti[7]<timeOfCompeti[3]||timeOfCompeti[7]<timeOfCompeti[4]||timeOfCompeti[7]<timeOfCompeti[5]||timeOfCompeti[7]<timeOfCompeti[6]
                ||timeOfCompeti[7]<timeOfCompeti[8]||timeOfCompeti[7]<timeOfCompeti[9]||timeOfCompeti[7]<timeOfCompeti[10]||timeOfCompeti[7]<timeOfCompeti[11]||timeOfCompeti[7]<timeOfCompeti[12]){
                    System.out.println(nameOfCompeti[7] + "Ganó");

                }else if(timeOfCompeti[8]<timeOfCompeti[1]||timeOfCompeti[8]<timeOfCompeti[2]||timeOfCompeti[8]<timeOfCompeti[3]||timeOfCompeti[8]<timeOfCompeti[4]||timeOfCompeti[8]<timeOfCompeti[5]||timeOfCompeti[8]<timeOfCompeti[6]
                ||timeOfCompeti[8]<timeOfCompeti[7]||timeOfCompeti[8]<timeOfCompeti[9]||timeOfCompeti[8]<timeOfCompeti[10]||timeOfCompeti[8]<timeOfCompeti[11]||timeOfCompeti[8]<timeOfCompeti[12]){
                    System.out.println(nameOfCompeti[8] + "Ganó");

                }else if(timeOfCompeti[9]<timeOfCompeti[1]||timeOfCompeti[9]<timeOfCompeti[2]||timeOfCompeti[9]<timeOfCompeti[3]||timeOfCompeti[9]<timeOfCompeti[4]||timeOfCompeti[9]<timeOfCompeti[5]||timeOfCompeti[9]<timeOfCompeti[6]
                ||timeOfCompeti[9]<timeOfCompeti[7]||timeOfCompeti[9]<timeOfCompeti[8]||timeOfCompeti[9]<timeOfCompeti[10]||timeOfCompeti[9]<timeOfCompeti[11]||timeOfCompeti[9]<timeOfCompeti[12]){
                    System.out.println(nameOfCompeti[9] + "Ganó");

                }else if(timeOfCompeti[10]<timeOfCompeti[1]||timeOfCompeti[10]<timeOfCompeti[2]||timeOfCompeti[10]<timeOfCompeti[3]||timeOfCompeti[10]<timeOfCompeti[4]||timeOfCompeti[10]<timeOfCompeti[5]||timeOfCompeti[10]<timeOfCompeti[6]
                ||timeOfCompeti[10]<timeOfCompeti[7]||timeOfCompeti[10]<timeOfCompeti[8]||timeOfCompeti[10]<timeOfCompeti[9]||timeOfCompeti[10]<timeOfCompeti[11]||timeOfCompeti[10]<timeOfCompeti[12]){
                    System.out.println(nameOfCompeti[10] + "Ganó");

                }else if(timeOfCompeti[11]<timeOfCompeti[1]||timeOfCompeti[11]<timeOfCompeti[2]||timeOfCompeti[11]<timeOfCompeti[3]||timeOfCompeti[11]<timeOfCompeti[4]||timeOfCompeti[11]>timeOfCompeti[5]||timeOfCompeti[11]<timeOfCompeti[6]
                ||timeOfCompeti[11]<timeOfCompeti[7]||timeOfCompeti[11]<timeOfCompeti[8]||timeOfCompeti[11]<timeOfCompeti[9]||timeOfCompeti[11]<timeOfCompeti[10]||timeOfCompeti[11]>timeOfCompeti[12]){
                    System.out.println(nameOfCompeti[11] + "Ganó");

                }else if(timeOfCompeti[12]<timeOfCompeti[1]||timeOfCompeti[12]<timeOfCompeti[2]||timeOfCompeti[12]<timeOfCompeti[3]||timeOfCompeti[12]<timeOfCompeti[4]||timeOfCompeti[12]<timeOfCompeti[5]||timeOfCompeti[12]<timeOfCompeti[6]
                ||timeOfCompeti[12]<timeOfCompeti[7]||timeOfCompeti[12]<timeOfCompeti[8]||timeOfCompeti[12]<timeOfCompeti[9]||timeOfCompeti[12]<timeOfCompeti[10]||timeOfCompeti[12]<timeOfCompeti[11]){
                    System.out.println(nameOfCompeti[12] + "Ganó");
                }
                System.out.print("Nombre del competidor:" + nameOfCompeti[i] + " y su tiempo: " + timeOfCompeti[i]); System.out.println("");
        }
        
    }    
}