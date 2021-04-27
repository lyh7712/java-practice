package lyh7712.javapractice.oopchapter6.strategyPattern;

public class Client {
    public static void main(String args[]) {
//        Strategy strategy = null;
        Solier rambo = new Solier();

        //익명 내부 전략을 사용하는 템플릿 콜백 리턴관

//        rambo.runContext(new Strategy() {
//            public void runStrategy() {
//                System.out.println("총! 총초종총 총! 총!");
//            }
//        }) ;
//
//        System.out.println();
//
//        rambo.runContext(new Strategy() {
//            public void runStrategy() {
//                System.out.println("칼! 카가갈 칼! 칼!");
//            }
//        });
//
//        System.out.println();
        //위의 중복되는 부분을 컨텍스트로 이관
        rambo.runContext("총");

        System.out.println();

        rambo.runContext("칼");

        System.out.println();


        //전략 패턴
        //총을 람보에게 전달해서 전투를 수행하게 한다.
//        strategy = new StrategyGun();
//        rambo.runContext(strategy);
//
//        System.out.println();
//
//        //활을 람보에게 전달해서 전투를 수행하게 한다.
//        strategy = new StrategyBow();
//        rambo.runContext(strategy);
    }
}
