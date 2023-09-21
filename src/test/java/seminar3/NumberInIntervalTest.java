package seminar3;

import org.junit.jupiter.api.Test;

/***
 *  Разработайте и протестируйте метод numberInInterval, который проверяет, попадает ли
 * переданное число в интервал (25;100)
 * @param n
 * @return
 */
class NumberInIntervalTest {
    @Test
    void numberInIntervalTest (){
        assert new NumberInInterval().numberInInterval(30);
        assert !new NumberInInterval().numberInInterval(3);
    }


}