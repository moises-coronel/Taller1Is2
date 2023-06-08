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

        if ("".equals(destino) || pasajeros < 1 || duracion < 0) {
            System.out.println("Error: -1 ; valores ingresados invalidos");
            return;
        }
        
        Packagevacaction paquete = new Packagevacaction(destino, pasajeros, duracion);
        paquete.isPopular();
        paquete.isDiscount();
        paquete.isPenalty();
        paquete.validatePack();
        double costo = paquete.calCost();
        
        System.out.println("El costo base del paquete es: $" + paquete.baseCost);
        System.out.println("El descuento aplicado es: " + (paquete.discount * 100) + "%");
        System.out.println("La penalidad aplicada es: $" + paquete.penalty);
        System.out.println("El costo total del paquete es: $" + costo);
        
        // Mostrar los complementos disponibles
        System.out.println("Complementos disponibles:");
        System.out.println("1. All-Inclusive Package - $200 por viajero");
        System.out.println("2. Adventure Activities Package - $150 por viajero");
        System.out.println("3. Spa and Wellness Package - $100 por viajero");
        
        // Pedir al usuario que seleccione los complementos
        System.out.println("Ingrese el número de complementos deseados:");
        int numComplementos = myObj.nextInt();
        myObj.nextLine(); // Consumir el salto de línea
        
        double costoComplementos = 0;
        
        for (int i = 0; i < numComplementos; i++) {
            System.out.println("Ingrese el código del complemento #" + (i + 1) + ":");
            int codigoComplemento = myObj.nextInt();
            myObj.nextLine(); // Consumir el salto de línea
            
            if (codigoComplemento == 1) {
                costoComplementos += 200 * pasajeros;
            } else if (codigoComplemento == 2) {
                costoComplementos += 150 * pasajeros;
            } else if (codigoComplemento == 3) {
                costoComplementos += 100 * pasajeros;
            } else {
                System.out.println("Código de complemento inválido. No se agregará al costo total.");
            }
        }
        
        // Calcular el costo total incluyendo los complementos
        double costoTotal = costo + costoComplementos;
        System.out.println("El costo total del paquete incluyendo los complementos es: $" + costoTotal);
    }
}
