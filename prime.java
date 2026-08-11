import java.util.Scanner;
public class prime{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        boolean isPrime = true;

        for(int i=2;i<=input ;i++){
            if(input % i == 0){
                isPrime = false;
                break;

            }
        }
        if(isPrime){
            System.out.println(input + " is prime");
        }else{
            System.out.println(input + " is not a prime");
        }
    }
}