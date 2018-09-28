import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
        int op;
        int a;
        int b;
        int t;      
        Scanner sc = new Scanner(System.in);
        System.out.println("introduzca la opcion");
        op= sc.nextInt();
        switch (op){
        case(1):System.out.println("introduzca el primer numero");
        a= sc.nextInt();
        System.out.println("introduzca el segundo numero");
        b = sc.nextInt();
        t=a+b;
        System.out.println("Suma = " + t);
        break;
        case(2):System.out.println("introduzca el primer numero");
        a= sc.nextInt();
        System.out.println("introduzca el segundo numero");
        b = sc.nextInt();
        t=a-b;
        System.out.println("resta = " + t);
        case(3):System.out.println("introduzca el primer numero");
        a= sc.nextInt();
        System.out.println("introduzca el segundo numero");
        b = sc.nextInt();
        t=a*b;
        System.out.println("multiplicacion = " + t);
        break;
        case(4):System.out.println("introduzca el primer numero");
        a= sc.nextInt();
        System.out.println("introduzca el segundo numero");
        b = sc.nextInt();
        t=a/b;
        System.out.println("Division = " + t);
        break;
        }
       
    }
}