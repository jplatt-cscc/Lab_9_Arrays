import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] dataPoints = new int[100];
        Random rand = new Random();
        double sum = 0;
        double average = 0;
        Scanner pipe = new Scanner(System.in);;
        String prompt = "";
        int low = 0;
        int high = 0;
        int input = 0;
        int howMany = 0;
        int min = 0;
        int max =0;

        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = rand.nextInt(100) + 1;
            //System.out.println(dataPoints[i]);
        }

        for (int i = 0; i < dataPoints.length; i++) {
            System.out.print(dataPoints[i] + " | ");
        }

        for (int i = 0; i < dataPoints.length; i++) {
            sum += dataPoints[i];

            if (i == dataPoints.length - 1) {
                average = sum / dataPoints.length;

                System.out.println("\nThe Sum of the array is: " + sum);
                System.out.println("The Average of the array is: " + average);
            }
        }

        prompt = "Input an int value between 1 & 100 (inclusive): ";
        low = 1;
        high = 100;
        input = SafeInput.getRangedInt(pipe, prompt, low, high);
        //System.out.println(input);
        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == input) {
                howMany++;
            }

            if (i == dataPoints.length - 1) {
                System.out.println("\nYour input showed up " + howMany + " times in the random array.");
            }
        }

        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == input) {
                System.out.println("\nYour input first showed up at position " + i + " in the random array.");
                break;
            } else if (i == dataPoints.length - 1) {
                System.out.println("\nYour input didn't show up in the random array.");
            }
        }

        min = high;
        max = low;
        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] < min) {
                min = dataPoints[i];
            }
            if (dataPoints[i] > max) {
                max = dataPoints[i];
            }

            if (i == dataPoints.length - 1) {
                System.out.println("\nThe minimum value in the array is: " + min);
                System.out.println("\nThe maximum value in the array is: " + max);
            }
        }

    }
}