public class TypeCasting {

    public static void main(String[] args){

        //형변환
        //byte < short < int < long   <<<  float < double

//        int a = 128;
//        short b = a;
        // 에러

//        short x = 10;
//        int y = x;
        // 에러 X
        //  short는 int보다 작은 단위여서 여유 공간이 있기에 int형으로 변환하고 대입 가능
//        System.out.println(x);
//        System.out.println(y);

//        // 강제 형변환
//        int a = 128;
//        short b = (short)a; //명시적 형변환
//        byte c = (byte) a; // -128 ~ 127
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c); // 커서 다시 돌아감 -128로

        //자동 형변환
//        int m = 80;
//        double n = m;
//        System.out.println(m);
//        System.out.println(n);

//        double c = 10.33124546435;
////        float d = c;
//        // 더 작은 범위에 넣으려니 불가능
//        float d = (float) c;
//        System.out.println(c);
//        System.out.println(d);

        //계산할 때 형변환
        int e = 10;
        short f = 20;

//        Short g = e + f;
        //호환되지 않는 타입이라 에러
        short g = (short)(e + f);
        //연산이 일어날 때도 형변환 필요
        System.out.println(g);


    }
}
