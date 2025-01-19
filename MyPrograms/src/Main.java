class Parent {
    static void show() {
        System.out.println("Parent show");
    }
}

class Child extends Parent {
	//@Override    // Error
    static void show() {
        System.out.println("Child show");
    }
}

class Main {
    public static void main(String[] args) {
        Parent parent = new Child() ;
        parent.show();
    }
}