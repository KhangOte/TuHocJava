public class BaiTap2_ToanTuGan {
    public static void main(String[] args) {
        //gán cộng
        int x=8;
         x+=5;
        System.out.println("x = " +x);

        //gán trừ
        int x2=8;
         x2 -= 5;
        System.out.println("x2 = " +x2);

        //gán nhân
        int x3=8;
         x3*=5;
        System.out.println("x3 = " +x3);

        //gán chia
        float x4=3;
        x4 /=9;
        System.out.println("x4 = " + x4);

        // So sánh
//        int a = 5;
//        int b = 7;
//        System.out.println("a = b ?");
//        System.out.println(a==b);
//        System.out.println(a!=b);
//        System.out.println(a>b);
//        System.out.println(a<b);
//        System.out.println(a<=b);
//        System.out.println(a>=b);

        // Bài Tập Vận Dụng
        int a = 6;
        int a1 = 6;
        int a2 = 6;
        int a3 = 6;
        int a4 = 6;
        System.out.println("a + 3 = " +(a += 3));

        System.out.println("a - 5 = " +(a1 -= 5));

        System.out.println("a * 2 = " +(a2*= 2));

        System.out.println("a % 5 = " +(a3%=5));

        int b=2;
        int c=b+7;
        System.out.println("a-(b+7) = " +(a4-=c));

    }
}
