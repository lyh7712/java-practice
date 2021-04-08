package lyh7712.javapractice.chapter21;

import java.util.ArrayList;
import java.util.Stack;

public class ListSample {
    public static void main(String args[]) {
        ListSample sample = new ListSample();
        sample.checkArrayList4();
    }

    public void checkArrayList1() {
        ArrayList<String> list1 = new ArrayList<String>(); // ArrayList 생성자
        ArrayList<String> list2 = new ArrayList<String>(100); //크기를 지정한 ArrayList 생성자
    }

    public void checkArrayList2() {
        ArrayList<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add(1, "A1");

        /*for(String tempData : list) {
            System.out.println(tempData);
        }*/

        ArrayList<String> list2 = list; // 치환 수행
        list.add("Oooops");

//        ArrayList<String> list2 = new ArrayList<String>();
        ArrayList<String> list3 = new ArrayList<String>(list); //list의 값들을 복사할 경우 list3 생성과 동시에 할당
        list2.add("0 ");
        list2.addAll(list); //list 객체의 값들을 list2에 추가
        for (String tempData : list2) {
            System.out.println(tempData);
        }

    }

    public void checkArrayList3() {
        ArrayList<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        int listSize = list.size();
        for (int loop = 0; loop < listSize; loop++) {
            System.out.println("list.get(" + loop + ") = " + list.get(loop));
        }
    }

    public void checkArrayList4() {
        ArrayList<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("A");
//        System.out.println("Removed" + list.remove(0));
//        System.out.println(list.remove("A"));
        ArrayList<String> temp = new ArrayList<String>();
        temp.add("A");
        list.removeAll(temp);
        for (int loop = 0; loop < list.size(); loop++) {
            System.out.println(list.get(loop));
        }
    }

    public void checkStack() {
        Stack<Integer> intStack = new Stack<Integer>();
        for (int loop = 0; loop < 5; loop++) {
            intStack.push(loop);
            System.out.println(intStack.peek());
        }
        while (!intStack.empty()) {
            System.out.println(intStack.pop());
        }
    }
}
