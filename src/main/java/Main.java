import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    static short MAX = 0;

    static void init(Short[][] A) {
        for (int i = 0; i < A.length; ++i) {
            for (int j = 0; j < A[i].length; ++j) {
                A[i][j] = A[i][j] = (short) ((int) (Math.random() * 100));
            }
        }
    }


    static void Search(Short[][] A) {
        short max = 0;

        for (Short[] shorts : A) {
            for (int j = 0; j < A.length; ++j) {
                if (shorts[j] > max) {
                    max = shorts[j];
                }
            }
        }
        MAX = max;
        System.out.println("Максимальний елемент в матриці: " + max + "\n");
        System.out.println("***********************************\n");
        System.out.println("Виведення оновленої матриці з видаленням елемента " + max + ":\n");

    }

    public static <T> T[] deleteElement(T[] src, int idx) {
        if (idx > src.length - 1)
            throw new RuntimeException("idx > src length");
        @SuppressWarnings("unchecked")
        T[] dest = (T[]) Array.newInstance(src[0].getClass(), src.length - 1);
        for (int i = 0; i < src.length; i++) {
            if (i < idx) {
                dest[i] = src[i];
            } else if (i > idx) {
                dest[i - 1] = src[i];
            }
        }
        return dest;
    }

    public static <T> void deleteRow(T[][] src, int idx) {
        if (idx > src.length - 1)
            throw new RuntimeException("idx > src length");
        for (int i = 0; i < src.length; i++) {
            src[i] = deleteElement(src[i], idx);
        }
    }

    static <T> void print2DArray(T[][] src) {
        for (T[] ts : src) {
            System.out.println(Arrays.toString(ts));
        }
    }


    public static void main(String[] args) {

        System.out.println("Виконав студент групи ПІ-325 Яксун І.Ю.\n");

        int N = 7;

        Short[][] array = new Short[N][N];
        init(array);
        print2DArray(array);
        System.out.println();
        Search(array);

        int max;
        ArrayList<Integer> rowsIndex = new ArrayList<>();

        max = array[0][0];
        for (Short[] shorts : array) {
            for (int c = 0; c < array.length; c++) {
                if (shorts[c] > max) {
                    max = shorts[c];
                }
            }
        }

        for (Short[] shorts : array) {
            for (int c = 0; c < array.length; c++) {
                if (shorts[c] == max)
                    rowsIndex.add(c);
            }
        }

        int iter = 0;
        for (Integer c1 : rowsIndex) {
            deleteRow(array, c1 - iter);
            iter++;
        }

        print2DArray(array);

    }
}
