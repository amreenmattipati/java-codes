import java.util.HashSet;

public class CommonElements {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5, 6};
        int[] array2 = {4, 5, 6, 7, 8, 9};


        HashSet<Integer> set = new HashSet<>();
        for (int num : array1) {
            set.add(num);
        }


        System.out.print("Common elements: ");
        for (int num : array2) {
            if (set.contains(num)) {
                System.out.print(num + " ");

                set.remove(num);
            }
        }
    }
}
