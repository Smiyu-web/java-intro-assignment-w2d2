

public class BinarySearch {
    
    public static void main(String[] args) {

        System.out.println(search(18));
        System.out.println(search(14));
        System.out.println(search(36));


    }

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
}
