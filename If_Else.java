import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class If_Else {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Mời bạn nhập vào điểm tb: ");
//        double tb= sc.nextDouble();
//        // câu lệnh điều kiện
//        if (tb>=5.0) {
//            System.out.println("Bạn đỗ");
//        }
//
//        else
//            System.out.println("Chúc bạn may mắn lần sau");

//        Scanner sc=new Scanner(System.in);
//        System.out.println("Nhập điểm đêiii: ");
//        double dtb= sc.nextDouble();
//        if (dtb>=8 && dtb<10)
//        {
//            System.out.print(dtb);
//            System.out.println(" Uầy ui cũng khá phết nhợ");
//
//        } else if (dtb>=7 && dtb <8) {
//            System.out.print(dtb);
//            System.out.println(" Cũng tạm tạm cố gắng hơn đêiii");
//
//        }
//        else if (dtb>=5 && dtb <7) {
//            System.out.print(dtb);
//            System.out.println(" Hơi kém nhưng còn cứu được");
//        }
//        else if (dtb>=1&& dtb<5){
//            System.out.print(dtb);
//            System.out.println(" Ăn vs chả học nghỉ mọe đi ");
//        }
//        else {
//            System.out.println(" Biết nhập điểm ko :))))");
//        }
        //BÀI TẬP 1
//        Scanner th=new Scanner(System.in);
//        System.out.println("Mời nhập vào tổng: ");
//        double t=th.nextDouble();
//        System.out.println("Mời nhập vào hiệu: ");
//        double h=th.nextDouble();
//        double x=(t+h)/2;
//        double y=x-h;
//        System.out.println(" X cần tìm là: " +(x));
//        System.out.println(" Y cần tìm là: " +(y));
        //BÀI TẬP 2
//         Scanner cc=new Scanner(System.in);
//        System.out.println("Mời nhập vào chiều cao (m): ");
//        double c1=cc.nextDouble();
//        System.out.println("Mời nhập vào cân nặng (kg): ");
//        double c2=cc.nextDouble();
//        double BMI=c2/Math.pow(c1,2);
//        if (BMI<15){
//            System.out.println(" Thân hình quá gầy");
//        }
//        else if (BMI>=15&&BMI<16){
//            System.out.println("Thân hình gầy");
//        }
//        else if (BMI>=16&&BMI<18.5){
//            System.out.println("Thân hình hơi gầy");
//        } else if (BMI>=18.5&&BMI<25) {
//            System.out.println("Thân hình bình thường");
//        }
//        else if (BMI>=25&&BMI<30){
//            System.out.println("Thân hình hơi béo");
//        }
//        else if(BMI>=30&&BMI<35){
//            System.out.println("Thân hình béo");
//        }
//        else if(BMI>=35){
//            System.out.println("Thân hình quá béo");
//        }
        //BÀI TẬP 3
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Nhập năm bạn muốn kiểm tra: ");
//        int nn=sc.nextInt();
//        if ((nn%4==0&&nn%100!=0)||(nn%400==0)){
//            System.out.print("Năm " +nn);
//            System.out.println(" là năm nhuần");
//
//        }
//        else {
//            System.out.print("Năm " +nn);
//            System.out.println(" không phải năm nhuần");
//        }
        //BÀI TẬP 4
        Scanner sc=new Scanner(System.in);
        System.out.println("Mời bạn nhập vào năm: ");
        int n=sc.nextInt();
        System.out.println("Mời nhập vào tháng bạn muốn kiểm tra: ");
        int t=sc.nextInt();
        if ((t==1)||(t==3)||(t==5)||(t==7)||(t==8)||(t==10)||(t==12)){
            System.out.print("Tháng "+t);
            System.out.print("năm "+n);
            System.out.println(" có 31 ngày");
        }
        else if (t==2){
            if ((n%4==0&&(n&100)!=0)||n%400==0){
                System.out.print("Tháng 2 năm " +n);
                System.out.println(" có 29 ngày");
            }
            else {
                System.out.print("Tháng 2 năm "+n);
                System.out.println(" có 28 ngày");
            }
        }
        else {
            System.out.print("Tháng "+t);
            System.out.print(" năm "+n);
            System.out.println(" có 30 ngày");
        }

    }
}
