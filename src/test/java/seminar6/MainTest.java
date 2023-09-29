package seminar6;

import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    void main() {
        /***
         * проверка основного метода на возврат правильного результата
         */
        int[] list1 = new int[]{6, 7, 81};
        int[] list2 = new int[]{6, 7, 82};
        String result = new Main().printResult(list1,list2);
        assert result.equals("Второй список имеет большее среднее значение");
    }
}