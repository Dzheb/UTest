package seminar6;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArrayAverageTest {
    /***
     * проверка правильного расчёта среднего значения массива с погрешностью
     * до второго знака после запятой
     */
    @Test
    void arrayAverage() {
        int[] list = {6,7,81};
        double av = 31.33;
        assertEquals(new ArrayAverage(list).arrayAverage(),av,0.01d);
    }
}
