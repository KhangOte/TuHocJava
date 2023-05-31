import javax.imageio.ImageTranscoder;
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
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Mời bạn nhập vào năm: ");
//        int n=sc.nextInt();
//        System.out.println("Mời nhập vào tháng bạn muốn kiểm tra: ");
//        int t=sc.nextInt();
//        if ((t==1)||(t==3)||(t==5)||(t==7)||(t==8)||(t==10)||(t==12)){
//            System.out.print("Tháng "+t);
//            System.out.print("năm "+n);
//            System.out.println(" có 31 ngày");
//        }
//        else if (t==2){
//            if ((n%4==0&&(n%100)!=0)||n%400==0){
//                System.out.print("Tháng 2 năm " +n);
//                System.out.println(" có 29 ngày");
//            }
//            else {
//                System.out.print("Tháng 2 năm "+n);
//                System.out.println(" có 28 ngày");
//            }
//        }
//        else {
//            System.out.print("Tháng "+t);
//            System.out.print(" năm "+n);
//            System.out.println(" có 30 ngày");
//        }
        //BÀI TẬP 5
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Nhập vào a: ");
//        double a= sc.nextDouble();
//        System.out.println("Nhập vào b: ");
//        double b= sc.nextDouble();
//        System.out.println("Nhập vào c: ");
//        double c=sc.nextDouble();
//        double del= Math.pow(b,2)-4*a*c;
//        if (del>0){
//            System.out.println("Phương trình có 2 nghiệm phân biệt: ");
//            System.out.println("X1 = " +(((-b+Math.sqrt(del))/(2*a))));
//            System.out.println("X2 = " +(((-b-Math.sqrt(del))/(2*a))));
//        } else if (del==0) {
//            System.out.print("Phương trình có nghiệm kép ");
//            System.out.println("x1 = x2= " +(-b/(2*a)));
//        }
//        else {
//            System.out.println("Phương trình vô nghiệm");
//        }
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập vào tháng bạn muốn kiểm tra: ");
        int t=sc.nextInt();
        if(t>=1&&t<=3){
            System.out.print("Tháng "+t);
            System.out.println(" thuộc quý 1 của năm");
        }
        else if (t>=4&&t<=6){
            System.out.print("Tháng "+t);
            System.out.println(" thuộc quý 2 của năm");
        }
        else if (t>=7&&t<=9){
            System.out.print("Tháng "+t);
            System.out.println(" thuộc quý 3 của năm");
        }
        else if (t>=10&&t<=12){
            System.out.print("Tháng "+t);
            System.out.println(" thuộc quý 4 của năm");
        }
        else {
            System.out.print("Số "+t);
            System.out.println(" sai định dạng hoặc không nằm trong 12 tháng vui lòng nhập lại");
        }


    }
}
