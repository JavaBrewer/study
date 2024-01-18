import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        // HashMap 생성
        HashMap<String, Object> dataMap = new HashMap<>();

        // 데이터 추가
        dataMap.put("name", "John");
        dataMap.put("age", 25);
        dataMap.put("city", "New York");

        // 데이터 가져오기
        String name = (String) dataMap.get("name");
        int age = (int) dataMap.get("age");
        String city = (String) dataMap.get("city");

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("City: " + city);
    }
}
