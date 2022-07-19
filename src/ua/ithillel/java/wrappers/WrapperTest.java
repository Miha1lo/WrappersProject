package ua.ithillel.java.wrappers;

public class WrapperTest {
    public static void main(String[] args) {

        // Задание № 1, пункт № 1-2

        Byte b1 = 10;
        Byte b2 = Byte.valueOf((byte) 10);
        Byte b3 = new Byte((byte) 10);
        Byte b4 = Byte.parseByte("10");

        Short sh1 = 128;
        Short sh2 = Short.valueOf((short) 128);
        Short sh3 = new Short((short) 128);
        Short sh4 = Short.parseShort("128");

        Integer i1 = 10000;
        Integer i2 = Integer.valueOf(10000);
        Integer i3 = new Integer(10000);
        Integer i4 = Integer.parseInt("10000");

        Long l1 = 999_999_999L;
        Long l2 = Long.valueOf(999_999_999);
        Long l3 = new Long(999_999_999);
        Long l4 = Long.parseLong("999999999");

        Float f1 = 11.12f;
        Float f2 = Float.valueOf(11.12f);
        Float f3 = new Float(11.12f);
        Float f4 = Float.parseFloat("11.12");

        Double d1 = 999_999.999;
        Double d2 = Double.valueOf(999_999.999);
        Double d3 = new Double(999_999.999);
        Double d4 = Double.parseDouble("999999.999");

        Character ch1 = 'q';
        Character ch2 = Character.valueOf('q');
        Character ch3 = new Character('q');

        // Задание № 1, пункт №3

        byte num1 = d1.byteValue();
        short num2 = d1.shortValue();
        int num3 = d1.intValue();
        long num4 = d1.longValue();
        float num5 = d1.floatValue();
        double num6 = d1;

        // Задание № 1, пункт №4

        Double numDouble1 = 0.0;
        Double numDouble2 = 2.1;

        Double nanValue = numDouble2 / numDouble1;
        Double infinityValue = numDouble1 / numDouble1;

        System.out.println("nanValue = " + nanValue);
        System.out.println("infinityValue = " + infinityValue);

        if (nanValue.isNaN()) {
            System.out.println("Переменная nanValue = NaN");
        }

        if (infinityValue.isInfinite()) {
            System.out.println("Переменная infinityValue = Infinity");
        }

        //Задание № 1, пункт №5

        Long numLong1 = 120L;
        Long numLong2 = 120L;
        System.out.println(numLong1 == numLong2);

        numLong1 = 1200L;
        numLong2 = 1200L;
        System.out.println(numLong1 == numLong2);
        System.out.println(numLong1.equals(numLong2));
    }
}
