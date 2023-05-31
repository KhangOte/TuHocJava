import java.util.Scanner;

public class ToanTu3Ngoi {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Hãy nhập vào số nguyên n: ");
//        int n=sc.nextInt();
//        String traloi=(n%2==0)?"chẵn":"Lẻ";
//        System.out.println("Số " +n+ " vừa nhập vào là số "+traloi);
        Scanner sc=new Scanner(System.in);
        System.out.println("Mời nhập vào điểm của bạn: ");
        double n=sc.nextDouble();
        String traloi=(n>10)?" bạn thì kinh dồi ":
                (n>=8&&n<10)?" Bạn đc xếp loại Giỏi":
                        (n>=6.5&&n<8)?" Bạn đc xếp loại Khá":
                                (n>=5&&n<6.5)?" Bạn đc xếp loại Trung bình":
                                        (n>0&&n<5)?" Bạn bị xếp loại yếu":" Bạn học ngu tới nổi âm điểm sao?";
        System.out.println("Với "+n+" điểm" +traloi);

    }
}
