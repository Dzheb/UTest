package seminar1;

import static org.assertj.core.api.Assertions.assertThat;

public class TestDiscount {
    public static void main(String[] args) {
        testDiscount();
}
    public static void testDiscount() {
        Calculator calculator = new Calculator(20, 0.6);
        assertThat(calculator.calculateDiscount()).isEqualTo(8);
    }
}
