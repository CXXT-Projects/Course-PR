package YajianWang;

public class Sort {
    public Sort() {
    }

    public static void main(String[] args) {
        int[] a = new int[]{10, 3, 2, 33, 6, 8, 9, 7};
        bubble_sort(a);
        int[] var2 = a;
        int var3 = a.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            int i = var2[var4];
            System.out.print(i);
        }

    }

    public static void bubble_sort(int[] a) {
        for(int i = 0; i < a.length; ++i) {
            for(int j = 0; j < a.length - i - 1; ++j) {
                if (a[j] < a[j + 1]) {
                    int temp = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = temp;
                }
            }
        }

    }
}
