package seminar6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompareResultTest {

    String firstMore = "Первый список имеет большее среднее значение";
    String secondMore = "Второй список имеет большее среднее значение";
    String bothEqual = "Средние значения равны";
    double av1;
    double av2;

    @Test
    /***
     * проверка утверждения что первая средняя величина больше
     */
    void compareResult1() {
        av1 = 234.23;
        av2 = 34.12;
        CompareResult compareResult = new CompareResult(av1,av2);
        assert compareResult.compareResult() == firstMore;
    }
    /***
     * проверка утверждения что вторая средняя величина больше
     */
    void compareResult2() {
        av1 = 34.12;
        av2 = 234.23;
        double av1 = 234.23;
        double av2 = 34.12;
        CompareResult compareResult = new CompareResult(av1,av2);
        assert compareResult.compareResult() == secondMore;
    }
}