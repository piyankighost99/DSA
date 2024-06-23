public class removeEvenIntegersFromArray {
    int[] RemoveEvenIntegers (int[] array) {
        int oddCount = 0;
        for (int i=0; i<array.length; i++) {
            if (array[i]%2 != 0) oddCount++;
        }

        int[] newOddArray = new int[oddCount];
        int index = 0;
        for (int i=0; i<array.length; i++){
            if (array[i]%2 != 0){
                newOddArray[index] = array[i];
                index++;
            }
        }
        System.out.println("Removing Even Integers...");
        return newOddArray;
    }

    void display (int[]array){
        if (array.length == 0){
            System.out.println("Array is Empty");
            return;
        }
        for (int i=0; i<array.length; i++){
            System.out.print(array[i]+ " ");
        }
        System.out.println("\n");
    }

    public static void main (String[] args) {
        int [] array ={1,2,3,4,5,6,7,8,9};
        removeEvenIntegersFromArray eir = new removeEvenIntegersFromArray();
        eir.display(array);
        int[] newOddArray = eir.RemoveEvenIntegers(array);
        eir.display(newOddArray);
    }
}
