import java.util.Scanner;

public class FinalTheSmallestElement {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Please enter 10 numbers: ");
        double list[] = new double[10];
        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextDouble();
        }

        System.out.println(min(list));
    }

    public static double min(double[] arr) {

        double min = arr[0];
        for (double i: arr) {
            if (i < min) {
                min = i;
            }
            return i;
        }
        return min;
    }
}
