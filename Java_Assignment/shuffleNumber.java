import java.util.Random;
class shuffleNumber {
    public static void shuffleNum(int[] arr){
        Random a = new Random();
        for(int i=0;i<arr.length;i++){
            int rand = a.nextInt(arr.length);
            int temp = arr[i];
            arr[i] =arr[rand];
            arr[rand]=temp;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        shuffleNum(arr);
    }
}