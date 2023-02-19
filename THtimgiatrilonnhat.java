import java.util.Scanner;

public class THtimgiatrilonnhat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] array ;
        int size ;
        int i ;
        System.out.print("Nhập độ dài mảng ");
        size = input.nextInt();
        array = new int [size] ;
        System.out.print("Nhập dữ liệu " + "\n");
        for (i=0 ; i < array.length ; i ++) {
            System.out.print("Dữ liệu mảng array" + (i+1) + " : " );
            array[i] = input.nextInt();
        }
        int max = array[0] ;
        int index = 1 ;
        for (i=0 ; i < array.length ; i ++) {
            if (array[i] > array[0]){
             max = array[i];
             index = i + 1 ;
         }

        }
        System.out.println("Số lớn nhất là : " + max + " tại vị trí " + index);
    }
}
