import java.util.ArrayList;

public class LIstsExample {

    public static void main(String[] args){

        //Lists
        // 순서 구분, 중복 허용
        // Vector, ArrayList, LinkedList

        ArrayList<Integer> list = new ArrayList(10);
        // <> 사이에 자료형 넣으면 제한 가능
        list.add(100);
        list.add("INFP");

        for(int i = 0; i < list.size(); i++ ){
            System.out.println(list.get(i));
        }
        //배열과 유사하나 확장된 버전
    }
}
