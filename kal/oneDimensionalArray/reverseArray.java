public class reverseArray {
    void reverseArray1(int [] array){
        int length =array.length;
        for (int i=0; i<length; i++){
            if (i<length){
                int temp = array[i];
                array[i] = array[length-1];
                array[length-1] = temp;
                length--;
            }
        }
    }

    void display(int []array){
        if (array.length == 0){
            System.out.println("Array is Empty");
            return;
        }
        for (int i=0; i<array.length; i++){
            System.out.println(array[i]+ "");
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6,7,8,9};
        reverseArray reversHelper = new reverseArray();
        reversHelper.display(array);
        reversHelper.reverseArray1(array);
        reversHelper.display(array);
    }
}
