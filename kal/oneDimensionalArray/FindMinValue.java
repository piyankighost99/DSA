public class FindMinValue {
    void findMinValue (int[] array) {
        if (array.length == 0)
            throw new IllegalArgumentException("Invalid Array Argument");
        int minValue = array[0];

        for (int i=1; i<array.length; i++){
            if (array[i] < minValue)
                minValue = array[i];
        }
        System.out.println("The minimum Value is: " + minValue);
    }

    void display (int[] array) {
        if (array.length == 0){
            System.out.println("Array is Empty");
            return;
        }
        for (int i=0; i<array.length; i++) {
            System.out.print(array[1] + " ");
        }
        System.out.println("\n");
    }

    public static void main (String[] args) {
        int[] array = {6, 2, 7, 9, 1, 4, 6, 18};
        FindMinValue FMV = new FindMinValue();

        FMV.display(array);
        FMV.findMinValue(array);
    }
}
