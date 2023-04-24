import java.util.Scanner;

public class MethodsExample2 {
    //평수구하기
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("구하고자 하는 숫자를 입력하세요 :");
        double input = scanner.nextDouble();

        double result_1 = pyong(input);

        System.out.println(Math.round(result_1) + "평 입니다.");

//        double pyong_result = pyong(106);
//        System.out.println(Math.round(pyong_result)+"평");

    }

    static double pyong(double a) {
        double result = a/3.3;
        return result;
    }

}

