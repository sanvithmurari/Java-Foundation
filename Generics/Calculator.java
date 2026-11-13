class Calculator<T extends Number> {
    double add(T a, T b) {
        return a.doubleValue() + b.doubleValue();
    }

    public static void main(String[] args) {
        Calculator<Integer> c1 = new Calculator<>();
        System.out.println(c1.add(10, 20));
        Calculator<Double> c2 = new Calculator<>();
        System.out.println(c2.add(2.5, 3.5));

    }
}
