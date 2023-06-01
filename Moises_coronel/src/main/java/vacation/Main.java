package vacation;

import java.util.Scanner;

public class Main {
    //CHECKSTYLE:OFF
    /**
     * este es el main.
     *
     */
    public static void main(String[] args) {
        // main
        //CHECKSTYLE:ON
        // TODO Auto-generated method stub
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Ingrese Destino:");
        String destino = myObj.nextLine();
        System.out.println("Ingrese Pasajeros:");
        int pasajeros = myObj.nextInt();
        System.out.println("Ingrese Duracion:");
        int duracion = myObj.nextInt();

        if (destino.equals("") || pasajeros < 1 || duracion < 0) {
            System.out.println("Error: -1 ; valores ingresados invalidos");
            return;
        }
        
        Packagevacaction paquete = new Packagevacaction(destino, pasajeros, duracion);
        paquete.isPopular();
        paquete.isDiscount();
        paquete.isPenalty();
        paquete.validatePack();
        double costo = paquete.calCost();
        System.out.println("El costo es: " + costo);
    }
}
