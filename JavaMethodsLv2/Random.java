package JavaMethodsLv2;
public class Random {
    //method to generate a 4-digit random number
    public int[] generate4DigitRandomArray(int size) {
        int[] randomNumbers = new int[size];
        for (int i = 0; i < size; i++) {
            randomNumbers[i] = (int) (Math.random() * 9000) + 1000; // Generates a 4-digit random number
        }
        return randomNumbers;
    }
// method to find the average, minimum, and maximum of an array of integers
    public double[] findAverageMinMax(int[] numbers) {
        int min = numbers[0];
        int max = numbers[0];
        int sum = 0;

        for (int num : numbers) {
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        double average = (double) sum / numbers.length;
        return new double[]{average, min, max};
    }

    public static void main(String[] args) {
        Random random = new Random();
        int[] randomNumbers = random.generate4DigitRandomArray(5);
        double[] results = random.findAverageMinMax(randomNumbers);

        System.out.println("Generated Numbers: ");
        for (int num : randomNumbers) {
            System.out.print(num + " ");
        }
        System.out.println("\nAverage: " + results[0]);
        System.out.println("Minimum: " + results[1]);
        System.out.println("Maximum: " + results[2]);
    }
}
