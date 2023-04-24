public class ArraysExample {

    public static void main(String[] args) {

        //배열(Arrays)

        // int[] == 뒤에 나오게 될 변수는 int를 모아놓은 배열의 변수이다.
        int[] price = {10000,9000,40000,7000};
        String[] mbti = {"INFP", "ENFP","ENTJ", "ESFP"};

        System.out.println(mbti.length);  //mbti 배열 길이 구하기

        for (int i = 0; i < mbti.length; i++){
            System.out.println(mbti[i]);
        }



//        System.out.println(price[0]);
//        System.out.println(mbti[0]);

//        price[1] = 8000;  //특정 인덱스 값 변경
//        System.out.println(price[1]);

//        System.out.println(price); //주소값이 나옴


    }
}
