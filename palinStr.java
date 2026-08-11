public class palinStr {
    public static void main(String[] args){
        String str ="madam";
        String revstr="";

        for(int i=str.length()-1;i>=0;i--){
            revstr=revstr+str.charAt(i);

           
        }
 System.out.println(revstr);
if (str.equals(revstr)){
    System.out.println("palindrome");
}else{
    System.out.println("not palindrome");
} 

    }
    
}
