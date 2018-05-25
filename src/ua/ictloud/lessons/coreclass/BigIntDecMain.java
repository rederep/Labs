package ua.ictloud.lessons.coreclass;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;

/** размер ограниечен оперативной памятью  xD
 * Created by student on 25-May-18.
 */
public class BigIntDecMain {
    public static void main(String[] args) {
        BigInteger bi = new BigInteger("9999999999999999999999999999999999999999999");
        System.out.println(bi);
        System.out.println(bi.add(new BigInteger("1"))); // +

        BigDecimal bd1 = new BigDecimal("9.999999999999999999999");
        BigDecimal bd2 = new BigDecimal("9.999999999999999999999");
        double d1 = 9.999999999999999999999;
        double d2 = 9.999999999999999999999;
        System.out.println(bd1.multiply(bd2));   //* высокая точность
        System.out.println(bd1.multiply(bd2, MathContext.DECIMAL128));   //* MathContext  - константы, указуют размер вывода

        System.out.println(d1*d2);               //получаем погрешность


    }


}
