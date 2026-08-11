public class Target {
    public static void main(String[] args) {
        System.out.println("Hello World");
        int[] arr = {2, 3, 2, 5, 2, 7};
int target = 2;
int count = 0;

for (int i = 0; i < arr.length; i++) {
    if (arr[i] == target) {
        count++;
    }
}

System.out.println(count);
    }
}
