package lyh7712.javapractice.chapter30;


import java.util.Optional;

public class OptionalSample {
    public static void main(String args[]) {
        OptionalSample sample = new OptionalSample();
        sample.testOptionaldifforElseGet_orElse();

    }
    public void testOptionalCheckNull() {
        String str = "test";
        Optional<String> optStr = Optional.empty(); // null인 객체 생
        Optional<String> optStr1 = Optional.of(str); //null이 아닌 객체 생성
        Optional<String> optStr2 = Optional.ofNullable(str); //null인지 아닌지 확신할 수 없는 객체를 담고자 할떄
    }

    public void testOptionalifPresent() {
        String str = "test";
        Optional<String> optStr1 = Optional.ofNullable(str);
        optStr1.ifPresent(s->System.out.println(s.charAt(0))); // t 호출

        Optional<String> optStr2 = Optional.of(null);
        optStr2.ifPresent(s->System.out.println(s.charAt(0))); // 에러
    }

    public void testOptionalorElse() {
        Optional<String> optStr = Optional.ofNullable(null);
        String result = optStr.orElse("test"); //null이면 test 반환
        System.out.println(result);
    }

    public void testOptionalorElseGet() {
        Optional<String> optStr = Optional.ofNullable(null);
        String result = optStr.orElseGet(this::getDefalutValue);
    }

    public void testOptionaldifforElseGet_orElse() {
        String str = "test";
        String result1 = Optional.ofNullable(str).orElse(getDefalutValue()); // null이 아니어도 메소드 실행
        System.out.println("orElse result : {} " + result1);
        String result2 = Optional.ofNullable(str).orElseGet(this::getDefalutValue); // null이 아니면 메소드 실행(x)
        System.out.println("orElseGet result : {} " + result2);
    }

    public String getDefalutValue() {
        System.out.println("calling getDefalutValue");
        return "default";
    }
}
