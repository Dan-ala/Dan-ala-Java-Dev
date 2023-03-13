import java.util.Scanner;
public class Ejercicio42 {
    public static void main(String[] args) {
        System.out.println("Este es el juego de... Minesweeper, Buscaminas");

        int[][] matriz=new int[8][3];  

        //el primer [] son las filas
        //el sefundo [] son las columnas
        
        Scanner inputs=new Scanner(System.in);

        String bomb="¡BOOM!";


        for(int i=0; i<8; i++){
            for(int j=0; j<3; j++){
                System.out.println("Ingrese el valor para las filas: " + i + "Ingrese el valor para las columnas: " + j);
                matriz[i][j]=inputs .nextInt();
            }
            System.out.println();
        }

        for(int i=0; i<matriz.length; i++){  
            for(int j=0; j<matriz[i].length; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        

    }   
}