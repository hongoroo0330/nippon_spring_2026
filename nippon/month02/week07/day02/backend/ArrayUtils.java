public class ArrayUtils {
    static int sum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum = sum + num;
        }
        return sum;

    }

    static int max(int[] arr) {
        int max = 0;
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    static int min(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    static double averege(int[] arr) {
        return (double) sum(arr) / arr.length;
    }

    static int count(int[] arr, int target) {
        int count = 0;
        for (int num : arr) {
            if (num == target) {
                count++;
            }
        }
        return count;
    }

    static void printArray(int[] arr) {
        System.out.println("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            if (i < arr.length - 1) {
                System.out.println(", ");

            }

        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        int [] arr = {3, 7, 2, 9, 1};
        System.out.println(" Массив: " );
        printArray(arr);
        System.out.println(" Sum " + sum(arr) + " Max: " + max(arr) + "  Min: " + min(arr) + " Averege: " + averege(arr));
        System.out.println("Count of 3: " + count(arr, 3));
        
        
    }
}