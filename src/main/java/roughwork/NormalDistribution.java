package main.java.roughwork;
import org.apache.commons.math4.legacy.analysis.function.Gaussian;


public class NormalDistribution {

    public static void main(String[] args) {

//        System.out.println(normalPDF(2.0658, 2, 0.05));
        System.out.println(findX(0.6557, 2, 0.05));
    }

    public static double normalPDF(double x, double mu, double sigma) {
        return (1 / (Math.sqrt(2 * Math.PI) * sigma)) * Math.exp(-Math.pow((x - mu)/sigma, 2) / 2);
    }

    public static double findX(double fx, double mu, double sigma) {
        return (mu + sigma * Math.sqrt((-2) * Math.log( sigma * Math.sqrt(2*Math.PI) * fx )));
    }



    public static double findX2(double targetPDF, double mu, double sigma) {
        double tolerance = 0.0001; // Tolerance for the approximation
        double xGuess = mu; // Initial guess for x
        double stepSize = sigma; // Initial step size for searching

        // Use numerical approximation to find x
        while (true) {
            double pdf = new Gaussian(mu, sigma).value(xGuess); // Calculate PDF at current xGuess
            if (Math.abs(pdf - targetPDF) < tolerance) {
                break; // If close enough to the target PDF, stop
            } else {
                // Update xGuess based on the direction of the difference between the current PDF and target PDF
                if (pdf < targetPDF) {
                    xGuess += stepSize;
                } else {
                    xGuess -= stepSize;
                }
                stepSize /= 2; // Reduce step size for next iteration
            }
        }
        return xGuess;
    }
}
