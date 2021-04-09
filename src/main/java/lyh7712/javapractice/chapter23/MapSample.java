package lyh7712.javapractice.chapter23;

import java.util.*;

public class MapSample {

    public static void main(String args[]) {
        MapSample sample = new MapSample();
        sample.checkHashMap();
    }

    public void checkHashMap() {
        HashMap<String, String> map = new HashMap<String, String>(); // HashMap 클래스의 객체 생성
        map.put("A", "a"); // 데이터 추가
        System.out.println(map.get("A"));

        map.put("C", "c");
        map.put("D", "d");
//        Collection<String> Values = map.values();
//        for(String tempValue : Values) {
//            System.out.println(map.get(tempValue));
//        }

        Set<String> KeySet = map.keySet();
        for (String tempKey : KeySet) {
            System.out.println(tempKey + " = " + map.values());
        }
    }

    public void checkHashMapEntry() {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("A", "a");
        map.put("B", "b");
        map.put("C", "c");
        map.put("D", "d");

        map.remove("A");

        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> tempEntry : entries) {
            System.out.println(tempEntry.getKey() + " = " + tempEntry.getValue());
        }

        //map에 해당 키,값이 존재 하는지 확인
//        System.out.println(map.containsKey("A"));
//        System.out.println(map.containsKey("Z"));
//        System.out.println(map.containsValue("a"));
//        System.out.println(map.containsValue("z"));

    }

    public void checkTreeMap() {
        TreeMap<String, String> map = new TreeMap<String, String>();
        map.put("A", "a");
        map.put("B", "b");
        map.put("C", "c");
        map.put("D", "d");
        map.put("가", "e");
        map.put("1", "f");
        map.put("a", "g");

        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> tempEntry : entries) {
            System.out.println(tempEntry.getKey() + " = " + tempEntry.getValue());
        }
    }

    public void checkProperties() {
        Properties prop = System.getProperties();
        Set<Object> keySet = prop.keySet();
        for (Object tempObject : keySet) {
            System.out.println(tempObject + " = " + prop.get(tempObject));
        }
    }
}
