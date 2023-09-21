package seminar3;

import org.junit.jupiter.api.Test;
/***
 * . Напишите тесты, покрывающие на 100% метод evenOddNumber, который проверяет, является ли
 * переданное число четным или нечетным
 * @param n
 * @return
 */
class EvenOddNumberTest {
    @Test
    void evenOddNumber() {
        assert new EvenOddNumber().evenOddNumber(2);
        assert !new EvenOddNumber().evenOddNumber(3);
    }
}