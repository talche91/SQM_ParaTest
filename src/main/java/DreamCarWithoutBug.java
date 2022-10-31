import static java.lang.Double.NaN;

/**
 * Klasse für die Berechnung des Preises.
 *
 * Der Quelltext wurde angepasst. Die Parameter im Quelltext
 * aus Spillner et. al. auf Seite 46 wurden als Daten in der Klasse
 * realisiert. Die Aufrufliste der Funktion ist jetzt leer.
 *
 */
public class DreamCarWithoutBug {

    private double basePrice;
    private double specialPrice;
    private double extraPrice;
    private int extras;
    private double discount;

    public DreamCarWithoutBug(double basePrice, double specialPrice, double extraPrice, int extras, double discount) {
        this.basePrice = basePrice;
        this.specialPrice = specialPrice;
        this.extraPrice = extraPrice;
        this.extras = extras;
        this.discount = discount;
    }

    public double calculatePrice() {
        double addonDiscount;
        double result;

        if (basePrice >= Double.MAX_VALUE || specialPrice >= Double.MAX_VALUE || extraPrice >= Double.MAX_VALUE || extras >= Integer.MAX_VALUE || discount > Double.MAX_VALUE) {
//            when a value is greater or equals MAX_VALUE, than return MAX_VALUE + 0.01
//            specification
            return Double.MAX_VALUE + 0.01;

        } else if (basePrice > 0 && specialPrice > 0 && extraPrice > 0 && extras > 0 && discount > 0) {
            if (extras >= 3 && extras < 5) {
                addonDiscount = 10;
            } else if (extras >= 5) {
                addonDiscount = 15;
            } else {
                addonDiscount = 0;
            }

            if (discount > 100) {
                return NaN;
            } else if (discount > addonDiscount) {
                addonDiscount = 0;
            }

            result = (basePrice / 100.0) * (100.0 - discount)
                    + specialPrice
                    + extraPrice / 100.0 * (100.0 - addonDiscount);

            return result;

        } else if (basePrice < 0 || specialPrice < 0 || extraPrice < 0 || extras < 0 || discount < 0) {
            return NaN;
        } else {
            return 0.0;
        }


    }
}
