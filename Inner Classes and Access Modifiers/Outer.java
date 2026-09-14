class Outer {
    private void display() {
        System.out.println("Display method of Outer");
    }
    class Inner {
        void show() {
            display(); 
        }
    }
    public static void main(String[] args) {
        Outer obj = new Outer();
        Outer.Inner innerObj = obj.new Inner();
        innerObj.show();
    }
}

