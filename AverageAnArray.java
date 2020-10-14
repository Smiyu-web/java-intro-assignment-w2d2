public class AverageAnArray {
    
    public static void main(String[] args) {
        int iarray[] = {3, 4, 5, 6, 7};
        double darray[] = {3.5, 3.6, 7.4};
        System.out.println(average(iarray));
        System.out.println(average(darray));
    }

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

}
