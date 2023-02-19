import java.util.Scanner;

public class THtimgiatritrongmang {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner input = new Scanner(System.in);
        System.out.print(" Mời nhập tên học viên :" );
        String name = input.nextLine();
        boolean isExit = false;
   for (int j = 0 ; j < students.length ; j ++){
       if (students[j].equals(name)){
           System.out.println("Học viên " + name + " mà bạn đang tìm kiếm nằm ở vị trí số " + j);
           isExit = true ;

       }
   }
      if (!isExit){
          System.out.println("Không tìm thấy ");
      }

    }
}
