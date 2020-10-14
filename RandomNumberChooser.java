

public class RandomNumberChooser {
    

    public static void main(String[] args) {

        int arr[] = {3, 6, 14, 18, 34, 36, 45, 52};
        System.out.print(getRandom(arr));
    }

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
}
