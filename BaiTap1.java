public class BaiTap1 {
    public static void main(String[] args) {
        int i1 = 2;
        int i2 = 5;
        int i3 = -3;
        double d1 = 2.0;
        double d2 = 5.0;
        double d3 = -0.5;
        System.out.println("i1 + (i2*i3) = " +(i1+(i2*i3)));
        System.out.println("i1 * (i2+i3) = " +(i1*(i2+i3)));
        System.out.println("i1 / (i2+i3) = " +((double)i1/(i2+i3)));
        System.out.println("i1 / i2+i3 = " +((double)i1/i2+i3));
        System.out.println("3+4+5/3 = " +((double)3+4+5/3));
        System.out.println("(3+4+5)/3 = " +((double)(3+4+5/3)));
        System.out.println("d1+(d2*d3) = " +(float)d1+(d2*d3));
        System.out.println("d1+d2*d3 = " +(float)(d1+d2*d3));
        System.out.println("d1/d2-d3 = " +(float)(d1/d2-d3));
        System.out.println("d1/(d2-d3) = " +(float)(d1/(d2-d3)));
        System.out.println("(d1+d2+d3)/3 = " +(float)(d1+d2+d3)/3);
        System.out.println("d1+d2+d3/3 = " +(float)d1+d2+d3/3);
        System.out.println("d1+d2+(d3/3) = " +(float)d1+d2+(d3/3));
        System.out.println("3*(d1+d2)*(d1-d3) = " +(float)3*(d1+d2)*(d1-d3));

    }
}
