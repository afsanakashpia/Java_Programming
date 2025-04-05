public class PrintingNumbers {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        for(int i=4;i>=0;i--){
            for(int j=0;j<=i;j++){
                System.out.print(arr[j]);
            }
            System.out.println();
        }
        for(int i=1;i<=4;i++){
            for(int j=0;j<=i;j++){
                System.out.print(arr[j]);
            }
            System.out.println();
        }
    }
}
