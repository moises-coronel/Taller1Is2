package vacation;
import java.util.ArrayList;
import java.util.List;

public class Packagevacaction {

    String destination;
    int numTravelers;
    int durationVac;
    int baseCost = 1000;
    double penalty;
    double discount;
    List<String> addons = new ArrayList<String>();
    /**
     * constructor de paquete de vacaciones.
     */
    
    public Packagevacaction(String destination, int numTravelers, int durationVac) {
        super();
        this.destination = destination;
        this.numTravelers = numTravelers;
        this.durationVac = durationVac;
    }

    /**
     * Método para deterimnar si es uno de los lugares populares.
     */
    public void isPopular() {
        if ("Paris".equals(this.destination)) {
            this.baseCost = this.baseCost + 500;
            //System.out.println("Paris");
        }
        if ("New York City".equals(this.destination)) {
            this.baseCost = this.baseCost + 600;
        }
    }

    /**
     * Método para calcular el descuento.
     */
    public void isDiscount() {
        if (this.numTravelers > 4 && this.numTravelers < 10) {
            this.discount = 0.1;
        }else if (this.numTravelers > 10) {
            this.discount = 0.2;
        }
    }

    /**
     * Método para calcular penalidad
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
     * Método para validarsi paquete excede 80 personas.
     */
    public boolean validatePack() {
        if (this.numTravelers > 80) {
            System.out.println("Excede 80 personas, no aplica paquete");
            return false;
        }
        return true;
    }

    /**
     * Método para calcular costo
     */
    public double calCost() {
        double cost = (this.baseCost + this.penalty) * (1 - this.discount);
        return cost;
    }

    /**
     * Método para añadir los paquetes adicionales.
     */
    public void addAddon(String addon) {
        addons.add(addon);
    }

  
    

    public List<String> getAddons() {
        return addons;
    }

}
