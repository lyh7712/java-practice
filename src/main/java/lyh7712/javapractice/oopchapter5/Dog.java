package lyh7712.javapractice.oopchapter5;

//단일 책임 원칙을 지키지 않은 if문
//class Dog {
//    final static Boolean Mdog = true;
//    final static Boolean FDog = false;
//    Boolean gender;
//
//    void pee() {
//        if(this.gender == Mdog) {
//            //한쪽 다리를 들고 소변을 본다.
//        } else {
//            //뒷다리 두 개로 앉은 자세로 소변을 본다.
//        }
//    }
//}


//단일 책임 원칙을 적용해 개선한 코드
public abstract class Dog {
    abstract void pee();
}
