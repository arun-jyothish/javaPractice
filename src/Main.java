import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.print("Enter a number : ");
        Scanner sc = new Scanner(System.in);    // instantiate Scanner
        int num = sc.nextInt();
        long result = fact (num);
        System.out.println("fact of 8")
        System.out.println(result);
    }
    static long fact(int num){
        if ( num == 1){
            return 1;       // factorial of 1 is 1
        }
        return num*fact(num-1); // recursive call to factorial
    }
}
class Other{
static void hi(){
    System.out.print("Enter two numbers: ");
    Main ins = new Main();
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int num2 = sc.nextInt();
    long result = ins.fact(num);
    System.out.print(" result from other class: ");
    System.out.println(result);
    result = ins.fact(num2);
    System.out.print(" result from other class: ");
    System.out.println(result);
}
public static void main(String args[]){
    hi();
    }
}
