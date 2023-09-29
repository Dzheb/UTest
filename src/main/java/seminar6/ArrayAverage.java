package seminar6;

public class ArrayAverage {
    private int[]  array;
      public ArrayAverage(int[] array) {
        this.array = array;
      }
      public double arrayAverage (){
          int sum = 0;
          for (int i = 0; i < array.length; i++) {
              sum = sum+this.array[i];
          }
          return (double) sum / array.length;
      }
}
