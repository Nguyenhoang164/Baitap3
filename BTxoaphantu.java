import java.util.Scanner;

class Xoaphantu {
    public static void main(String[] args) {
     int n , i , c ;
     Scanner input = new Scanner(System.in);
     do {
         System.out.println("Nhập số phần tử mảng");
         n = input.nextInt();
     } while (n<=0);
     int array[] = new int [n] ;
     System.out.println(" Nhập các phần tử trong mảng ");
     for (i = 0 ; i < n ; i ++) {
         System.out.print(" Nhập các phần tử " + i + " : ");
         array[i] = input.nextInt();
     }
     System.out.println(" Trước khi bị xóa : ");
     for (int x = 0 ; x < n ; x ++ ){
         System.out.println(" Phần tử " + x + " la " + array[x]);
     }
     System.out.println("Nhập số bạn muốn xóa khỏi mảng ");
     int k = input.nextInt();
     for(c = i = 0 ; i < n ; i ++){
         if (array[i] !=k ) {
             array[c] = array[i];
             c ++ ;
         }
     }
     n = c ;
     System.out.println("mảng còn lại sau khi xóa " + k + " là : ");
     for (i = 0 ; i < n ; i ++){
         System.out.println( "Phần tử " + i + " là " +  array[i]);
     }
    }
}