import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {
private static final Task1 TASK_1 = new Task1();
private static int a = 10;
private static int b = 8;
private static int d = 4;
private static int c = 2;
private static int one = 1;
private static int zero = 0;
    @org.junit.jupiter.api.Test
    void devTest() {
        Assertions.assertEquals(a, TASK_1.dev(b, c));
    }

    @org.junit.jupiter.api.Test
    void substractTest() {
        Assertions.assertEquals(c, TASK_1.substract(d, c));
    }

    @Test
    void multiplyTest() {
        Assertions.assertEquals(d, TASK_1.multiply(c, c));
    }

    @Test
    void PositivedivideTest() {
        Assertions.assertEquals(c, TASK_1.divide(d,c));
        Assertions.assertEquals(-2, TASK_1.divide(d,-2));
    }
    @Test
    void NegativedivideTest() {
        Assertions.assertThrows(ArithmeticException.class, () -> TASK_1.divide(d, 0));
    }

    @Test
    void powerTest() {
        Assertions.assertEquals(zero, TASK_1.power(zero, d));
        Assertions.assertEquals(d, TASK_1.power(c,c));
        Assertions.assertEquals(0.25, TASK_1.power(c,-2));
        Assertions.assertEquals(one, TASK_1.power(c,zero));
    }

    @Test
    void factorial() {
        Assertions.assertEquals(one, TASK_1.factorial(zero));
        Assertions.assertEquals(one, TASK_1.factorial(one));
        Assertions.assertEquals(24, TASK_1.factorial(d));
    }
    @Test
    void factorialArithmaticExeption() {
        Assertions.assertThrows(ArithmeticException.class,() -> TASK_1.factorial(-2));
    }

    @Test
    void absolut() {
        Assertions.assertEquals(c, TASK_1.absolut(c));
        Assertions.assertEquals(c, TASK_1.absolut(-2));
    }

    @Test
    void sqrt() {
        Assertions.assertEquals(1, TASK_1.sqrt(0));
        Assertions.assertEquals(2, TASK_1.sqrt(4));
    }
    @Test
    void sqrtArithmeticExeption() {
        Assertions.assertThrows(ArithmeticException.class, () -> TASK_1.sqrt(-2));
    }

    @Test
    void logarithm() {
        Assertions.assertEquals(c, TASK_1.logarithm(d));
    }
    @Test
    void logarithmArithmaticExeption() {
        Assertions.assertThrows(ArithmeticException.class, () -> TASK_1.logarithm(-2));
        Assertions.assertThrows(ArithmeticException.class, () -> TASK_1.logarithm(zero));
    }

    @Test
    void sin() {
        Assertions.assertEquals(0.49999999999999994, Task1.sin(Math.toRadians(30)));
        //тут я сделал ожидание таковым , так как принято что син 30 = 1/2, но копьютер ситает более точно.
    }

    @Test
    void  sinArithmaticExeption(){
        Assertions.assertThrows(ArithmeticException.class, () -> Task1.sin(-2));
        Assertions.assertThrows(ArithmeticException.class, () -> Task1.sin(zero));
    }
}