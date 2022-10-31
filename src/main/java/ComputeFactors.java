import java.util.ArrayList;

/**
 * Berechnung aller Teiler einer ganzen Zahl. 
 *
 * Aufgabenstellung
 */

/**
 * Mathematische Definition:
 * Eine natürliche Zahl a
 * ist genau dann ein Teiler einer natürlichen Zahl n,
 * wenn es eine natürliche Zahl b gibt,
 * für die a * b = n gilt.
 */
public class ComputeFactors {

    private Long number;
    private ArrayList<Long> factors;

    /**
     * standard constructor with number 2
     * */
    public ComputeFactors() {
        this.number = (long) 2;
        this.factors = new ArrayList<Long>();
    }

    /**
     * constructor with given number
     * */
    public ComputeFactors(Long number) {
        this.number = number;
        this.factors = new ArrayList<Long>();
    }

    /**
     * gets the arraylist of factors
     * @return factors
     */
    public ArrayList<Long> getFactors() {
        return factors;
    }

    public void computeFactor() {
        Long factor = (long) 2;

        if (this.number > 0) {
            this.factors.add((long) 1);
            int count = 0;

            while (factor <= this.number - 1) {
                if (this.number % factor == 0) {
                    // the value is a factor
                    this.factors.add(factor);
                }
                factor++;
                count++;
            }

            if (this.number != 1) {
                this.factors.add(this.number);
            }
            System.out.println("Schleifendurchläufe computeFactor: " + count);
        }


    }

    /**
     * optimize the method:
     * less looping
     */
    public void computeFactorOptimize() {
        int count = 0;

        if (this.number > 0) {
            this.factors.add((long) 1);

            for (int i = 2; i <= this.number / 2; i++) {
                if (this.number % (i) == 0) {
                    this.factors.add((long) i);
                }
                count++;
            }

            if (this.number != 1) {
                this.factors.add(this.number);
            }
        }

        System.out.println("Schleifendurchläufe computeFactorOptimize: " + count);
    }

    @Override
    public String toString() {
        String text = "";
        text = "Die Teiler der Zahl " + this.number + ":\n";
        text += this.factors.toString();
        return text;
    }
}
