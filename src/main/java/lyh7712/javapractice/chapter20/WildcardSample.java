package lyh7712.javapractice.chapter20;

public class WildcardSample {

    public static void main(String args[]) {
        WildcardSample sample = new WildcardSample();

    }

    public void callWildcardMethod() {
        WildcardGeneric<String> wildcard = new WildcardGeneric<String>();
        wildcard.setWildcard("A");
        wildcardMethod(wildcard);
    }

    public void wildcardMethod(WildcardGeneric<String> c) {
        Object value = c.getWildcard();
        System.out.println(value);
    }
}
