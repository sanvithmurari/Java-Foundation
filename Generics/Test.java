class Test {
    static <T> void printArray(T[] array) {
        for (T x : array)
            System.out.print(x + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        printArray(new Integer[]{1, 2, 3});
        printArray(new String[]{"Hi", "Hello"});
        printArray(new Double[]{1.2, 2.5});
    }
}