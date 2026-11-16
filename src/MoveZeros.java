import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int[] numbers = {0, 1, 0, 3, 12};


        int insertPosition = 0;


        for (int num : numbers) {
            if (num != 0) {
                numbers[insertPosition] = num;
                insertPosition++;
            }
        }


        while (insertPosition < numbers.length) {
            numbers[insertPosition] = 0;
            insertPosition++;
        }

        System.out.println("Updated array: " + Arrays.toString(numbers));
    }
}
