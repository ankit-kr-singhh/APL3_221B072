class Child extends Mother {
    static int x;
    
    Child(){
        x=5;
    }
    
    static void show(){
        System.out.println("Value of x in Child is: " + x);;
    }
}
