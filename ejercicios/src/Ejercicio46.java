import java.util.*;
public class Ejercicio46 {
    public static void main(String[] args){

        /* 
        int[] edad;
        String[] nombres;
        Boolean[] estado;

        edad=new int[4];
        nombres=new String[2];
        estado=new Boolean[4];

        */

        int[] edad=new int[4];
        String[] nombres=new String[3];
        Boolean[] estado=new Boolean[4];

        /*edad[0]=17;
        edad[1]=20;
        edad[2]=38;
        edad[3]=40;

        nombres[0]="Tatiana";
        nombres[1]="Laura";
        nombres[2]="Juan";

        estado[0]=true;
        estado[1]=false;
        estado[2]=true;
        estado[3]=false;*/

        /*System.out.println(edad[0]+edad[1]+edad[2]+edad[3]);System.out.println("");
        System.out.println(edad[0]);
        System.out.println(edad[1]);
        System.out.println(edad[2]);
        System.out.println(edad[3]);*/

        /*
        System.out.println(nombres[0]);
        System.out.println(nombres[1]);
        System.out.println(nombres[2]);*/

        /* 
        System.out.println(estado[0]);
        System.out.println(estado[1]);
        System.out.println(estado[2]);
        System.out.println(estado[3]);*/

        /*for(int i=0;i<4;i++){
            System.out.println(edad[i]);
        }

        for(int i=0;i<3;i++){
            System.out.println(nombres[i]);
        }

        for(int i=0;i<4;i++){
            System.out.println(estado[i]);
        }*/

        Scanner input=new Scanner(System.in);

        for(int i=0;i<4;i++){
            System.out.print("Digite su edad en la posiciión " + i + ": ");
            edad[i]=input.nextInt();
        }

        for(int j=0;j<4;j++){
            System.out.println(edad[j]);
        }


        for(int i=0;i<3;i++){
            System.out.println("Digite su nombre en la posición " + i + ": ");
            nombres[i]=input.next();
        }

        for(int j=0;j<3;j++){
            System.out.println(nombres[j]);
        }

        for(int i=0;i<4;i++){
            System.out.println("Digite su estado en la posición " + i + ": ");
            estado[i]=input.nextBoolean();
        }
        
        for(int j=0;j<3;j++){
            System.out.println(estado[j]);
        }

    }
}