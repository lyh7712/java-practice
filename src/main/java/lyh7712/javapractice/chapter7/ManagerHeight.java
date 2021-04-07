package lyh7712.javapractice.chapter7;

public class ManagerHeight {
    static int gradeHeights[][] = {{170, 180, 173, 175, 177}, {160, 165, 167, 186}, {158, 177, 187, 176}, {173, 182, 181}, {170, 180, 165, 177, 172}};

    public static void main(String args[]) {
        printHeights(1);
        printAverage(1);
    }


    public static void printHeights(int classNo) {
        for (int i = 0; i < gradeHeights[classNo].length; i++) {
            System.out.println("classNo : " + classNo);

            for (int j = 0; j < gradeHeights[classNo].length; j++) {
                System.out.println(gradeHeights[classNo][j]);
            }
            break;
        }

    }

    public static void printAverage(int classNo) {
        double sum = 0;
        for (int i = 0; i < gradeHeights[classNo].length; i++) {
            for (int j = 0; j < gradeHeights[classNo].length; j++) {
                sum += gradeHeights[classNo][j];
            }
            break;
        }
        System.out.println("평균 : " + sum / gradeHeights[classNo].length);
    }
}
