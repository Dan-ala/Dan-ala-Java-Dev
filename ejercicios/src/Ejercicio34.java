import java.util.Scanner;
public class Ejercicio34 {
    public static void main(String[] args) {
        System.out.println("El programa identifica los nùmero que ingresa un usuario, el nùmero mayor, el del medio y el menor");
        int primerNum,segundoNum,tercerNum3;

        System.out.print("Ingrese el primer número: ");

        Scanner usuNumbers=new Scanner(System.in);
        primerNum=usuNumbers .nextInt();

        System.out.print("Ingrese el segundo número: ");
        segundoNum=usuNumbers .nextInt();

        System.out.print("Ingrese el tercer número: ");
        tercerNum3=usuNumbers .nextInt();

        if (primerNum>segundoNum&&primerNum>tercerNum3) {
            System.out.println(primerNum + " Es el numero mayor");
        }else if(segundoNum>primerNum&&segundoNum>tercerNum3) {
                    System.out.println(segundoNum + " Es el número mayor");
                 }else if (tercerNum3>primerNum&&tercerNum3>segundoNum) {
                            System.out.println(tercerNum3 + " Es el número mayor");

                            

                            //10 5 3

                            }if (segundoNum<primerNum&&segundoNum>tercerNum3) {
                                System.out.println(segundoNum + " Es el del medio");
                            }

                            

                            //3 10 5

                            else if (tercerNum3<segundoNum&&tercerNum3>primerNum) {
                                System.out.println(tercerNum3 + " Es el del medio");
                            }

                            //5 3 10

                            else if (primerNum>segundoNum&&primerNum<tercerNum3) {
                                System.out.println(primerNum + " Es el del medio");
                            }else{
                                System.out.println(primerNum + " Es el del medio");
                            }

                            if(primerNum<segundoNum&&primerNum<tercerNum3) {
                                System.out.println(primerNum + " Es el número menor");
                            }else if(segundoNum<primerNum&&segundoNum<tercerNum3){
                                System.out.println(segundoNum + " Es el número menor");
                            }else{
                                System.out.println(tercerNum3 + " Es el número menor");
                            }
                            usuNumbers.close();
                    }
    }