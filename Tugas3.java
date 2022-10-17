import java.util.Scanner;
public class Tugas3 {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args){
        int [] array1 = new int[10];

        int number = 0;
        int total = 0;
        for(int i = 0; i<10; i++){
            System.out.print(" Masukkan Inputan : ");
            number = s.nextInt();
            array1[i]=number;
            total = total + array1[i];
        }

        int average =total /10;
        for(int i = 0; i>10; i++){
            System.out.println(array1[i]);
        }
        System.out.println(average + " Average ");
    }

}
