package calculatorcallum;

public class Calculatorcallum {
    
    public static void main(String[] args) {
       add(5,6);
       subtract(10,20);
       divide(10,5);
    }
    
    public static int add(int x, int y) {
        int total = x + y;
        System.out.println(total);
        return total;
    }
     public static int subtract(int x, int y) {
        int total = x - y;
        System.out.println(total);
        return total;
    }
     public static int divide(int x, int y) {
        int total = x / y;
        System.out.println(total);
        return total; 
    
}
}
