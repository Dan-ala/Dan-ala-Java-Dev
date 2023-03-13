import java.util.*;
public class Ejercicio44 {
    public static void main(String[] args) {
        System.out.println("¡Bienvenido a nuestra tienda!");
        String nClothes,respuAfirma="Yes";
        long price,totalCompra1=0,paga;
        int cantidad,i=0;

        System.out.println("¿Desea comprar algún artículo? (Sí es así, escriba Yes, sino No)");
        Scanner aboutMyStore=new Scanner(System.in);
        respuAfirma=aboutMyStore .next();


        while (respuAfirma.equals("Yes")) {
            
            System.out.print("Digite la cantidad de los artículos que va a comprar: ");
            cantidad=aboutMyStore .nextInt();

                while(i<cantidad){

                        System.out.print("¿Qué artículo desea comprar?, Ingrese el nombre: ");
                        nClothes=aboutMyStore .next();
                            System.out.print("Por favor digite el precio de " + nClothes + ": ");
                            price=aboutMyStore .nextLong();

                            totalCompra1=totalCompra1+price;
                            i++;
                        }

                        System.out.println("¿Desea comprar algo más? (Sí es así, escriba Yes, sino No)");
                        respuAfirma=aboutMyStore .next();

                        System.out.println("La compra tiene un total de: " + totalCompra1);

                    
             

                            System.out.print("¿Con cuánto paga?, ingrese la cantidad con la que paga: ");
                            paga=aboutMyStore .nextLong();

                            if (paga==totalCompra1) {
                                System.out.println("No hay cambio");
                            } else if(paga>totalCompra1){

                                long cambio=paga-totalCompra1;
                                System.out.println("Su cambio es de: " + cambio);
                            }else{
                                long noAlcanza=totalCompra1-paga;
                                System.out.println("No le alacanza, le hace falta un valor de: " + noAlcanza);
                            } 

                    }       System.out.println("La compra fue de: " + totalCompra1);
                            System.out.println("Gracias por visitarnos");

                            aboutMyStore.close();
          }
    }