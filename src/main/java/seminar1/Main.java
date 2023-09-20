package seminar1;

/***
 *Задание 1. * В классе Calculator создайте метод calculateDiscount,
 *  который принимает сумму покупки и процент скидки и возвращает
 *  сумму с учетом скидки.
 *  Ваша задача - проверить этот метод с использованием библиотеки
 *  AssertJ. Если метод calculateDiscount получает недопустимые
 *  аргументы, он должен выбрасывать исключение ArithmeticException.
 *  Не забудьте написать тесты для проверки этого поведения.
 */
public class Main {
    public static void main(String[] args) {
        Calculator payment = new Calculator(0.1,0.15);
        System.out.println("Сумма покупки: "+payment.calculateDiscount());
    }
}