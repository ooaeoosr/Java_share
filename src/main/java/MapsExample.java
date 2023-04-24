import java.util.HashMap;

public class MapsExample {
    
    public static void main(String[] args){
        
        //Map
        // 키-값 쌍을 요소로 가지는 데이터의 모음, 순서 구분 없음
        // 키는 중복 불가, 값은 중복 허용
        //HashMap

        HashMap map = new HashMap(); //<> 안에 타입을 정해주지 않으면 전부 가능
        map.put("age",30); //데이터가 쌍으로 존재
        map.put("mbti", "INFP"); //mbti 키 - INFP 값

        System.out.println(map.get("age"));
    }
}
