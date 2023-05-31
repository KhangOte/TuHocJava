import javax.script.ScriptContext;
import java.util.Scanner;

public class Break_Continue {
    public static void main(String[] args) {
        //tính tổng từ 1-5 bỏ qua số 3
//        int tong=0;
//        for (int i=0;i<=5;i++){
//            if (i==3)
//                continue; //bỏ qua i = 3
//            else
//            tong+=i;
//        }
//        System.out.println("Tong 1 đến 5 bằng: "+tong);

        //break
//        int n=0;
//        while (n<100){
//            System.out.println("n = "+n);
//            n++;
//            if (n==15)
//                break;
//        }

        //BÀI TẬP 1

//        Scanner sc=new Scanner(System.in);
//        System.out.println("Mời nhập vào số nguyên n");
//        int n=sc.nextInt();
        //Sử dụng vòng lặp for
//        int gt=1;
//        for (int i=1; i<=n;i++){
//            gt=gt*i;
//        }
//        System.out.println("Số nguyên n = "+n+" có "+gt+" giai thừa");
        //Sử dụng vòng lặp While
//        int i=1;
//        int gt=1;
//        while (i<=n){
//            gt=gt*i;
//            i++;
//        }
//        System.out.println("Số nguyên n = "+n+" có "+gt+" giai thừa");


        //BÀI TẬP 2
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Nhập số chẵn bạn muốn tính: ");
//        double a=sc.nextDouble();
//        double tong=0;
//        if (a%2==0){
//        for (int i=0; i<=a;i++){
//            tong+=i;
//        }
//            System.out.println("Tổng từ 0 đến "+a+" bằng: "+tong);
//        }
//        else
//            System.out.println("Tôi không tính tổng số lẻ");

        //BÀI TẬP 3
//        Scanner sc=new Scanner(System.in);
//        System.out.println(" Nhập số n bạn muốn tính: ");
//        int n=sc.nextInt();
//        int tong=0;
//        int tong2=0;
//        while (n%2==0){
//            System.out.println("Xin mời nhập lại số lẻ");
//            n=sc.nextInt();
//        }
//        for (int i=1;i<=n;i+=2)//bước lặp i+2
//        {
//            if (i==3)
//                continue;
//            else
//                tong+=i;
//        }
//        System.out.println("Tổng từ 1 đến "+n+" bỏ qua 3 bằng "+tong);
//        //Break khi n=3
//        for (int i=1;i<=n;i++)//bước lặp i+1
//        {
//            if (i==3)
//                break;
//            else
//                tong2+=i;
//        }
//        System.out.println("Tổng từ 1 đến 3 của số "+n+" bằng "+tong2);

        //BÀI TẬP 4: TÌM SỐ CHIA HẾT CHO 3 TỪ 10 ĐẾN 50
//        int tong=0;
//        int n=0;
//        System.out.println("Số chia hết cho 3 gồm: ");
//        for (int i=10;i<=50;i++){
//            if (i%3!=0){
//                continue;
//            }
//            else {
//                n++;
//                System.out.println("Số thứ "+n+" là :" +i);
//                tong+=i;
//
//            }
//
//        }
//        System.out.println("Vậy có tổng cộng "+n+" số từ 10 đến 50 chia hết cho 3");
//        System.out.println("Và tổng những số đó bằng: "+tong);

        //BÀI TẬP 5:
//        int m=1;
//        int tong=0;
//        for (int i=1;i<=10;i++){
//            m=m*i;
//            tong+=m;
//        }
//        System.out.println("Tổng S= 1!+2!+3!+.....+10! là: "+tong);


        //BÀI TẬP 6:
//        int n=n;
//        int tong=0;
//        for (int i=1;i<n;i++){
//            if (n%i==0){
//                tong+=i;
//            }
//        }
//        if (tong==n){
//            System.out.println(n+ " là số hoàn hảo");
//        }
//        else
//            System.out.println(n+" không là số hoàn hảo");
//        int a=0;
//        for (int n=1;n<=1000;n++){
//            int tong=0;
//            for (int i=1;i<n;i++){
//                if (n%i==0){
//                    tong+=i;
//                }
//            }
//            if (n==tong){
//                a++;
//                System.out.println("Số hoàn hảo thứ "+a+" là: "+n);
//            }
//            else
//                continue;
        //BÀI TẬP 7:

        Scanner sc=new Scanner(System.in);
        while (true) {
            System.out.println("Mời nhập vào số nguyên a lớn hơn 0: ");
            int a = sc.nextInt();
            int n = 0;
            if (a == 1)
                System.out.println(a + " là số nguyên tố");
            while (a <= 0) {
                System.out.println("Mời nhập lại số nguyên a theo đúng yêu cầu");
                a = sc.nextInt();
            }
            for (int i = 1; i <= a; i++) {
                if (a % i == 0) {
                    n++;
                }
            }
            if (n >= 3) {
                System.out.println(a + " không phải là số nguyên tố");
            } else if (n == 2) {
                System.out.println(a + " là số nguyên tố");
            }
            System.out.println("Bạn có muốn tiếp tục sử dụng phần mềm không?");
            System.out.println("Bấm phím 1 để thoát chương trình");
            System.out.println("Bấm phím bất kì để tiếp tục sử dụng");
            String traloi=new Scanner(System.in).nextLine();
            if (traloi.equals("1")){
                break;
            }

        }
    }
}

