import java.util.Arrays;
import java.util.Scanner;

public class BTgopmang {
    public static void main(String[] args) {
        int [] array1 ;
        int [] array2 ;
        int i , j ;
        Scanner input = new Scanner(System.in);
        int size1 ;
        int size2 ;
         System.out.print(" Mời nhập độ dài mảng 1 : ");
         size1 = input.nextInt();
         array1 = new int [size1] ;
         System.out.println("Mời nhập dữ liệu mảng 1 :");
         for (i = 0 ; i < array1.length ;i ++) {
             System.out.print("+" + " phần tử  " + (i+1) + " : ");
             array1[i] = input.nextInt();

         }
         System.out.print("Dữ liệu đã được thêm thành công với mảng 1 : ");
         for(i = 0 ; i < array1.length ; i++){
             System.out.print(array1[i] + " " );
         }
         System.out.print("\n");
         System.out.print("Nhập độ dài mảng 2 : ");
         size2 = input.nextInt();
         array2 = new int [size2];
         System.out.println("Mời nhập dữ liệu mảng 2 : ");
         for (j = 0 ; j < array2.length ; j ++){
             System.out.print("+" + " Phần tử " + (j+1) + " : ");
             array2[j] = input.nextInt();
         }
         System.out.print(" Dữ liệu đã được thêm thành công với mảng 2 : ");
         for (j = 0 ; j < array2.length ; j ++) {
             System.out.print(array2[j] + " ");
         }
         System.out.print("\n");
         int [] array3 ;
         array3 = new int [array1.length + array2.length] ;
         int poss = 0 ;
         for (int element : array1 ){
               array3[poss] = element ;
               poss ++ ;
         }
         for (int element : array2){
                 array3[poss] = element ;
                 poss++;
         }

            
        System.out.print("mảng được kế thừa các phần thử là : " );
        System.out.print(Arrays.toString(array3));
    }
}
