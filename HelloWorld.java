import java.util.Scanner;
public class HelloWorld {
 public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
  int n = scanner.nextInt();
  int m = scanner.nextInt();
  int x=1;
  int[][] v = new int[n][m];
  for (int i = 0; i < n; i++) {
   for (int j = 0; j < m; j++) {
   v[i][j]=x*x; x+=2;
   }
  }
  
   for (int i = 0; i < n; i++) {
   for (int j = 0; j < m; j++) {
   System.out.print(v[i][j]+" ");
  }
    System.out.println("");   
   }

 }
}
