import java.util.Scanner;

public class BaiTapScanner {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("mời nhập vào bán kính: ");
//        double bk= sc.nextDouble();
//        double cv= 2* Math.PI* bk;
//        double dt= Math.PI *Math.pow(bk,2);
//        // xuất kết quả
//        System.out.println("Chu vi là: "+cv);
//        System.out.println("Diện tích là: "+dt);
        Scanner dr=new Scanner(System.in);
        System.out.println("Mời Khai báo chiều dài: ");
        double d= dr.nextDouble();
        System.out.println("Mời khai báo chiều rộng: ");
        double r=dr.nextDouble();
        double dt=d*r;
        double cv=(d+r)*2;
        System.out.println("Diện tích hình chữ nhật là: "+dt);
        System.out.println("Chu vi hình chữ nhật là: "+cv);

    }
}
