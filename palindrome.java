public class palindrome{
    public static void main(String[] args) {
        int num = 12321;
        int original=num;
        int revnum =0;
         
        while(num!=0){
            int digit = num % 10 ;
            revnum = revnum * 10 + digit ;
            num = num / 10;

        }
        if(original == revnum){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }
        }
    }
