import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WeatherSummary {
    /**
     * Reads newline-delimited temperatures from System.in and prints summary
     * statistics to System.out.
     * 
     * Example input:
     * 66.4
     * 77.1
     * 72.6
     * 
     * Example output:
     * Max: 66.4
     * Min: 77.1
     * Average: 72.03333333333333
     * 
     * @param args command line arguments (ignored)
     */
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        ArrayList<Double> temperatures = new ArrayList<>();
        
        while (console.hasNextDouble()) {
            double temperature = console.nextDouble();
            temperatures.add(temperature);
        }

        Collections.sort(temperatures);
        double min = temperatures.getFirst();
        double max = temperatures.getLast();
        double sum = 0.0;

        for (double t : temperatures) {
            sum += t;
        }

        double average = sum / temperatures.size();

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Average: " + average);
    }
}
