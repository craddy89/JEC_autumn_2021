package lesson04;

public class ProgramSwap {
//    public static void swap(Integer x, Integer y) {
//        Integer z = x;
//        System.out.println("x = " + x);
//        System.out.println("y = " + y);
//        x = y;
//        y = z;
//        System.out.println("x = " + x);
//        System.out.println("y = " + y);
//    }

    public static void swap(int[] arr) {
        int z = arr[0];
        System.out.println("x = " + arr[0]);
        System.out.println("y = " + arr[1]);
        arr[0] = arr[1];
        arr[1] = z;
        System.out.println("x = " + arr[0]);
        System.out.println("y = " + arr[1]);
    }

    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int[] mass = {a, b};
        swap(mass);
        System.out.println("a = " + mass[0]);
        System.out.println("b = " + mass[1]);
    }
}
