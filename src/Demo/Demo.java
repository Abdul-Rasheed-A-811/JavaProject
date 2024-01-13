package Demo;

public class Demo {

 static boolean checkCircularSorted(int[] arr) {
        int cnt = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i]) {
                cnt++;
            }
        }
        if (cnt == 1) {
            return arr[0] > arr[arr.length - 1];
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int[] arr = {9, 5, 3, 35, 26, 11};
        if (checkCircularSorted(arr)) {
            System.out.println("Array is circularly sorted");
        } else {
            System.out.println("Array is not circularly sorted");
        }
    }


}
