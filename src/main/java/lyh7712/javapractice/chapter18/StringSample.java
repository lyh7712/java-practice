package lyh7712.javapractice.chapter18;

public class StringSample {

    public static void main(String args[]) {
        StringSample sample = new StringSample();
//        sample.constructors();
//        System.out.println(sample.nullCheck(null));
//        sample.compareCheck();
        sample.equalCheck();

    }

    public void constructors() {
        try {
            String str = "한글";

            byte[] array1 = str.getBytes();
            printByteArray(array1);
            String str1 = new String(array1);
            System.out.println(str1);

            byte[] array2 = str.getBytes();
            printByteArray(array2);
            String str2 = new String(array2);
            System.out.println(str2);

            //매개변수를 캐릭터 셋 이름으로 지정하는 메소드 사용
            byte[] array3 = str.getBytes("UTF-16");
            printByteArray(array3);
            String str3 = new String(array3, "UTF-16");
            System.out.println(str3);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //null 체크
    public boolean nullCheck(String text) {
//        int textLength = text.length();
//        System.out.println(textLength);
        if (text == null) return true;
        else return false;
    }

    //재사용을 위한 메소드
    public void printByteArray(byte[] array) {
        for (byte data : array) {
            System.out.println(data + " ");
        }
        System.out.println();
    }

    //문자열을 확인하는 메소드
    public void compareCheck() {
        String text = "You must know String class.";
        System.out.println("text.length() = " + text.length());
        System.out.println("text.isEmpty() = " + text.isEmpty());
    }

    //문자열을 비교하는 메소드
    public void equalCheck() {
        String text1 = "Check value";
        String text2 = new String("Check value");
        String text3 = "check value";
        if (text1 == text2) {
            System.out.println("text1 == text2 result is same.");
        } else {
            System.out.println("text1 == text2 result is different.");
        }
        if (text1.equals("Check value")) {
            System.out.println("text.equals(text2) result is same.");
        }
        if (text1.equalsIgnoreCase(text3)) {
            System.out.println("text.equalsIgnoreCase(text3) result is same.");
        }
    }
}
