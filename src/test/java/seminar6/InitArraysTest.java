package seminar6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InitArraysTest {
    /***
     * проверка правильности генерации массивов для сравнения
     * сравниваются массивы фактически сгенерированные с тестовыми
     */
    @Test
    void getList1() {
        int[] list1 = new int[]{6, 7, 81};
        assertArrayEquals(list1,new InitArrays().getList1());
    }

    @Test
    void getList2() {
        int[] list2 = new int[]{6, 7, 82};
        assertArrayEquals(list2,new InitArrays().getList2());
    }
}