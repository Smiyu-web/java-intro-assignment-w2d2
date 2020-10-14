import java.util.Scanner;

public class assignment {
    public static void main(String[] args) {
        // problem 1
        System.out.println("P1 - binary serch: " + search(18));
        System.out.println("P1 - binary serch: " + search(14));
        System.out.println("P1 - binary serch: " + search(36));

        // problem 2
        int arr[] = {3, 6, 14, 18, 34, 36, 45, 52};
        System.out.println("P2 - random num: " + getRandom(arr));

        // problem 3
        int iarray[] = {3, 4, 5, 6, 7};
        double darray[] = {3.5, 3.6, 7.4};
        System.out.println("P3 - this is int average: " + average(iarray));
        System.out.println("P3 - this is double average: " + average(darray));

        // problem 4
        Scanner input = new Scanner(System.in);


        System.out.print("Please enter 10 numbers: ");
        double list[] = new double[10];
        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextDouble();
        }

        System.out.println("P4 - minimun num; " + min(list));
    }

    // problem 1
    public static int search(int n) {

        int arr[] = {2, 4, 5, 7, 9, 11, 14, 16, 18, 24, 26, 28, 29, 36, 57};

        int left = 0;
        int right = arr.length -1;
        int mid = (left + right) / 2;

        while (arr[mid] != n) {
            if (arr[mid] < n) {
                left = mid;
            } else if (arr[mid] > n) {
                right = mid;
            } else {
                return mid;
            }

            mid = (left + right) / 2; 
        }
        return mid;
    }

    // problem 2
    public static int getRandom(int numbers[]) {

        int list = (int)(Math.random() * 54 + 1);
        boolean value;

        do {
            value = false;
            for (int i : numbers) {
                if(i == list) {
                    value = true;
                }
            }
        } while (value); 
            return list;
    
        }

    // problem 3
    public static int average(int[] arr) {

        int sum = 0;
        for  (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        // for (int i: array) {
        //     sum += i;
        // }
        return sum / arr.length;
    }
    public static double average(double[] arr) {
        double sum = 0.0;
        // for (double i = 0; i < array.length; i++) {
        //     sum += arr[i];
        // }
        for (double i: arr) {
            sum += i;
        }
        return sum / arr.length;
    }

    // problem 4

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
