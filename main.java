import java.util.Scanner;
public class main{
public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
int input =sc.nextInt();

 int rev = 0;
 while(input != 0){
    int digit = input % 10;
    rev = rev * 10 +digit ;
    input = input /10;
 }
System.out.println(rev);
 }
}