class Test1 {
    static <T> void swap(T[] arr, int i, int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        Integer[] a = {1, 2, 3};
        String[] b = {"A", "B", "C"};
        swap(a, 0, 2);
        swap(b, 0, 1);
        System.out.println(java.util.Arrays.toString(a));
        System.out.println(java.util.Arrays.toString(b));
    }
}
