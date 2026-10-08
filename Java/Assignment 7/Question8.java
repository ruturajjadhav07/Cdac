// 8. Create a class with a generic method to find the largest element in an array and its position.
class Main {
    static <T extends Number> void findLargest(T[] arr) {
        T largest = arr[0];
        int position = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i].doubleValue() > largest.doubleValue()) {
                largest = arr[i];
                position = i;
            }
        }

        System.out.println("Largest element: " + largest);
        System.out.println("Position: " + position);
    }

    public static void main(String[] args) {
        Integer[] numbers = { 10, 15, 9, 20, 22, 35, 11 };

        findLargest(numbers);
    }
}