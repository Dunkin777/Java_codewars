public class recurtion {
//факториал через рекурсию
    public static int factorial(int n){

if(n >= 1){
    return n * factorial(n - 1);
} else return 1;
    }
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
