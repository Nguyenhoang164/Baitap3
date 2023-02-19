import java.util.Scanner;

public class THdaonguocphantu {
    public static void main(String[] args) {
        int Size ;
        int [] array ;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println(" Mời nhập độ dài mảng : ");
            Size = input.nextInt();
            if (Size > 20){
                System.out.println(" độ dài không vượt quá 20");
            }
        } while ( Size > 20 );
        array = new int [Size] ;
        int i = 0 ;
        while (i < array.length){
            System.out.println(" Nhập giá trị phần tử " + (i + 1) +" trong mảng ");
            array[i] = input.nextInt();
            i ++ ;
        }
        System.out.println(" các phần tử trong mảng là : " );
        for (int j = 0 ; j < array.length ; j ++){
            System.out.println(array[j]);
        }
        for(int j = 0 ; j < array.length/2 ; j ++){
            int temp = array[j];
            array[j] = array[Size - 1 - j];
            array[Size - 1 - j] = temp ;

        }
        System.out.println("các thành phần mảng sau khi đảo ngược là ");
        for(int j = 0 ; j < array.length ; j ++){
            System.out.println(array[j]);
        }
    }
}
