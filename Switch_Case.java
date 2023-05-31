import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Switch_Case {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Nhập vào số cần kiểm tra: ");
//        int a=sc.nextInt();
//        //Kiểm tra số dư của a
//        int div =a%2;
//        switch (div){
//            case 0:
//                System.out.println("số "+a+" là số chẵn");
//                break;
//            default:
//                System.out.println("số "+a+" là số lẻ");
//                break;
//        }
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Nhập vào tháng bạn muốn kiểm tra: ");
//        int t= sc.nextInt();
//        System.out.println("Nhập vào năm của tháng bạn muốn kiểm tra: ");
//        int n=sc.nextInt();
//        switch (t){
//            case 1:
//            case 3:
//            case 5:
//            case 7:
//            case 8:
//            case 10:
//            case 12:
//                System.out.println("Tháng "+t+" có 31 ngày");
//                break;
//            case 4:
//            case 6:
//            case 9:
//            case 11:
//                System.out.println("Tháng "+t+" có 30 ngày");
//                break;
//            case 2:
//                String traloi=((n%4==0&&n%100!=0)||(n%400==0))?
//                        "Tháng 2 năm "+n+" là năm nhuần nên có 29 ngày":
//                        "Tháng 2 năm "+n+" không nhuần nên có 28 ngày";
//                System.out.println(traloi);
//                break;
//            default:
//                System.out.println("Số bạn nhập không nằm trong 12 tháng xin mời nhập lại");
//        }
        Scanner sc=new Scanner(System.in);
        System.out.println("Mời bấm số để chọn chức năng: ");
        System.out.println("Phím 1: Tìm theo tên");
        System.out.println("Phím 2: Tìm theo tác giả");
        System.out.println("Phím 3: Tìm theo NXB");
        System.out.println("Phím 4: Tìm theo tiêu đề");
        int p=sc.nextInt();
        switch (p){
            case 1:
                System.out.println("Bạn muốn tìm theo tên");
                break;
            case 2:
                System.out.println("Bạn muốn tìm theo tác giả");
                break;
            case 3:
                System.out.println("Bạn muốn tìm theo NXB");
                break;
            case 4:
                System.out.println("Bạn muốn tìm theo tiêu đề");
                break;
            default:
                System.out.println("Phím nhập không hợp lệ");
                break;
        }
    }
}
