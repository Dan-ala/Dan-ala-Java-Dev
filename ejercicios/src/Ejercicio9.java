import java.util.Scanner;
public class Ejercicio9 {
public static void main(String[] args) {

    int piedra=1, papel=2, tijeras=3, valJug;

    System.out.print("¡Hola jugador! Jugará, piedra, papel o tijeras; con el valor 1 es para piedra, 2 para papel y 3 para tijeras: ");

    Scanner valJugador=new Scanner(System.in);
    valJug=valJugador .nextInt();

    int valMaq=(int) Math.floor(Math.random()*3+1);

   
    if (valJug==valMaq) {

        System.out.print("Empate, la máquina optó por: " + valMaq);
    } 

    if (valJug==1 && valMaq==3 || valJug==2 && valMaq==1 || valJug==3 && valMaq==2) {

        System.out.print("Ha ganado! la máquina optó por: " + valMaq);
    }else{if (valMaq==1 && valJug==3 || valMaq==2 && valJug==1 || valMaq==3 && valJug==2) {

        System.out.print("La máquina le ganó ya que optó por: " + valMaq);
        
    }}
    

    valJugador.close();
}
}


