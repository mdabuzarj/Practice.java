public class Missing{
    public static void main(String [] args){
        int [] arr={1,2,3,4,5,7};
        int  found = 0;
        for(int i=0;i<=7;i++){//overall nnumbers 
            for(int j=0;j<arr.length;j++){//index of arr
                found=0;
                if(arr[j]==i){
                    found=1;
                    break;
                }
            }
            if(found==0){
                System.out.println("Missing number is: "+i);
            }
        }
    }
}