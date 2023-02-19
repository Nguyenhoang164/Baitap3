import java.util.Scanner;

class BTtimgiatrinhonhat {
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
            int min = array[0] ;
            int index = 1 ;
            for (i=0 ; i < array.length ; i ++) {
                if (array[i] < array[0]){
                    min = array[i];
                    index = i + 1 ;
                }

            }
            System.out.println("Số nhỏ nhất là : " + min + " tại vị trí " + index);
        }
    }

