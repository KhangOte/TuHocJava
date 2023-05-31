import java.util.Scanner;

public class While {
    public static void main(String[] args) {
//        int x=0;
//        while (x<=5){
//            System.out.println("x = "+x);
//            x++;
//        }
        Scanner sc=new Scanner(System.in);
        System.out.println("Mời nhập vào số n trong khoảng từ 1 đến 99");
        double n=sc.nextDouble();
        while(n<1||n>99){
            System.out.println("Sai yêu cầu xin mời nhập lại");
            n=sc.nextDouble();
        }
        System.out.println("Đúng yêu cầu, số n bạn vừa nhập là: "+n);
    }
}
