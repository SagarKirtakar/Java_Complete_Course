package in.sagarkirtakar;

public class Array {

    public static void main(String[] args) {

        int [] arr = new int [5];

//        System.out.println(arr.length);

        arr[4] = 0;
        arr[3] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[0] = 4;

//        System.out.println(arr[0]);
//        System.out.println(arr[1]);
//        System.out.println(arr[2]);
//        System.out.println(arr[3]);
//        System.out.println(arr[4]);

        // Array traversal
//        int index = 0;
//        while(index < arr.length) {
//            System.out.println(arr[index]);
//            index++;
//        }

//        for(int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }

//        int index = 0;
//        do {
//            System.out.println(arr[index]);
//            index++;
//        } while(index < arr.length);

        int [] array = {10,20,30,40,50};

        System.out.println(array[array.length-1]);

        System.out.println(array.length);
    }
}
