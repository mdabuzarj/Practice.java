// public class Largest {
//     public static void main(String[] args ){
//         int []arr={2,3,4,5,6,7,77};

//         int max=arr[0];
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]>max){
//                 max=arr[i];
                
//             }
//         }
//         System.out.println(max);
//     }
    
// }
public class SecLargest {
    public static void main(String[] args){
        int [] arr={22,44,55,777,6,67};
        int max =arr[0];
        int max1=arr[1];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max1=max;
                max=arr[i];

            }
        }
        System.out.println(max1);
        System.out.println(max);
    }
}