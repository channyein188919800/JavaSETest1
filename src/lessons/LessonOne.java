package lessons;

public class LessonOne {
    public static void main(String[] args) {
//        int[][] Fpv = {{23, 45, 67, 90, 34}, {34, 56, 78, 89}};
//
//
//        for (int i = 0; i < Fpv.length; i++) {
//            for (int j = 0; j < Fpv[i].length; j++) {
//                System.out.println(Fpv[i][j]);
//
//            }
//        }
        int[] Test = {34, 67, 78, 90, 21, 56,95};
        int x = 0;

        for (int i = 0; i < Test.length; i++) {
      for (int j= i + 1;j <Test.length;j++){
          if(Test[i]<Test[j]){
          x=Test[i];
          Test[i] = Test[j];
          Test[j] =x;
      }
    }
            System.out.println(Test[i]);
}}}
