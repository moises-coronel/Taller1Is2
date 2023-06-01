package vacation;
import java.util.ArrayList;

public class Packagevacation {

    String destination;
    int numTravelers;
    int durationVac;
    int baseCost = 1000;
    double penalty = 0;
    double discount = 0;

    /**
     * Este es el constructor.
     */
    public Packagevacation(String destination, int numTravelers, int durationVac) {
        super();
        this.destination = destination;
        this.numTravelers = numTravelers;
        this.durationVac = durationVac;
    }

    /**
     * Método para verificar si es popular.
     */
    public void isPopular() {
        if (this.destination.equals("Paris")) {
            this.baseCost = this.baseCost + 500;
            //System.out.println("Paris");
        }
        if (this.destination.equals("New York City")) {
            this.baseCost = this.baseCost + 600;
        }
    }

    /**
     * Método para calcular el descuento.
     */
    public void isDiscount() {
        if (this.numTravelers > 4 && this.numTravelers < 10) {
            this.discount = 0.1;
        }
        if (this.numTravelers > 10) {
            this.discount = 0.2;
        }
    }

    /**
     * Método para calcular la penalidad.
     */
    public void isPenalty() {
        if (this.durationVac < 7) {
            this.penalty = this.penalty + 200;
        }
        if (this.durationVac > 30 || this.numTravelers == 2) {
            this.penalty = this.penalty - 200;
        }
    }

    /**
     * Método para validar el número de pasajeros.
     */
    public boolean validatePack() {
        if (this.numTravelers > 80) {
            System.out.println("Excede 80 personas, no aplica paquete");
            return false;
        }
        return true;
    }

    /**
     * Método para calcular el costo.
     */
    public double calCost() {
        double cost = (this.baseCost + this.penalty) * (1 - this.discount);
        return cost;
    }
}
