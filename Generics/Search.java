class Search {
    static <T> int search(T[] arr, T key) {
        for (int i = 0; i < arr.length; i++)
            if (arr[i].equals(key))
                return i;
        return -1;
    }

    public static void main(String[] args) {
        Integer[] a = {10, 20, 30};
        String[] b = {"Java", "Python", "C"};
        System.out.println(search(a, 20));
        System.out.println(search(b, "C"));
        System.out.println(search(b, "HTML"));
    }
}