public class Lab3 {
    public static void main(String[] args) {

        int[] myArray = new int[30];

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = i;
        }
        for (int num : myArray) {
            System.out.println(num);
        }

        // for loop to give even nos in reverse order
        // ==============================================

        //
        // for (int j = myArray.length - 1; j >= 0; j--) {
        //
        // myArray[j] = j*2;
        // }

        // System.out.println("=========");
        // for (int num1 : myArray) {
        // System.out.println(num1);
        // }

        // while loop to give even nos in reverse order
        // ==============================================
        int i = 0;
        int j = myArray.length - 1;
        while (j >= 0) {
            i = i + 2;
            myArray[j] = i;
            j--;
        }
        System.out.println("=========");
        int k = 0;
        while (k < myArray.length) {
            System.out.println(myArray[k]);
            k++;
        }
    }
}