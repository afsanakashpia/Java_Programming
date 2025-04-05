import java.util.Scanner;
public class FindBabysHeight {
    public static void main(String[] args) {
        double[] heights = new double[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter heights of 10 babies: ");
        for (int i=0;i< heights.length;i++){
            heights[i] = sc.nextDouble();
        }
       double min=heights[0], Slowest=Double.MAX_VALUE;
        for (int i=0;i< heights.length;i++){
          if (heights[i]<min){
              Slowest=min;
              min=heights[i];
          } else if (heights[i]<Slowest && heights[i]>min) {
              Slowest=heights[i];

          }
        }
        System.out.println("The 2 lowest height of babies are :"+ min+ " cm and "+Slowest+" cm");
    }
}
