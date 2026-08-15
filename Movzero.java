public class Movzero{
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        int target = 0;

        for(int i =0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[target]=arr[i];
                target++;

            }
        }
        while (target<arr.length){
            arr[target]=0;
            target++;

        }
        for(int i =0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

}