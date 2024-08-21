package wrapper.classes;

public class WrapperTest {
    public static void main(String[] args) {
        // 2.1 Создание переменных для каждого типа данных
        Integer i1 = 10; // Автоупаковка
        Integer i2 = Integer.valueOf(10); // Метод valueOf
        Integer i3 = new Integer(10); // Использование new
        Integer i4 = Integer.parseInt("10"); // Распарсивание из строки

        Double d1 = 10.5; // Автоупаковка
        Double d2 = Double.valueOf(10.5); // Метод valueOf
        Double d3 = new Double(10.5); // Использование new
        Double d4 = Double.parseDouble("10.5"); // Распарсивание из строки

        Boolean b1 = true; // Автоупаковка
        Boolean b2 = Boolean.valueOf(true); // Метод valueOf
        Boolean b3 = new Boolean(true); // Использование new
        Boolean b4 = Boolean.parseBoolean("true"); // Распарсивание из строки

        Character c1 = 'a'; // Автоупаковка
        Character c2 = Character.valueOf('a'); // Метод valueOf
        Character c3 = new Character('a'); // Использование new
        Character c4 = Character.valueOf('a'); // Распарсивание из строки

        // 3. Создание переменной типа Double с дробной частью
        Double doubleValue = 12.34;

        // 3.1 Создание переменных примитивных типов
        byte byteValue;
        short shortValue;
        int intValue;
        float floatValue;
        long longValue;

        // 3.2 Преобразование и присвоение значения Double каждому из примитивов
        byteValue = doubleValue.byteValue();
        shortValue = doubleValue.shortValue();
        intValue = doubleValue.intValue();
        floatValue = doubleValue.floatValue();
        longValue = doubleValue.longValue();

        System.out.println("Byte Value: " + byteValue);
        System.out.println("Short Value: " + shortValue);
        System.out.println("Int Value: " + intValue);
        System.out.println("Float Value: " + floatValue);
        System.out.println("Long Value: " + longValue);

        // 4. Проверка значений NaN и Infinity
        Double d5 = 15.0;
        Double d6 = 0.0;
        Double nanValue = d5 / d6;
        Double infinityValue = d6 / d6;

        System.out.println("NaN Value: " + nanValue);
        System.out.println("Infinity Value: " + infinityValue);

        // 4.5 Проверка с isNaN и isInfinite
        if (nanValue.isNaN()) {
            System.out.println("Переменная nanValue = NaN");
        }
        if (nanValue.isInfinite()) {
            System.out.println("Переменная nanValue = Infinity");
        }

        if (infinityValue.isNaN()) {
            System.out.println("Переменная infinityValue = NaN");
        }
        if (infinityValue.isInfinite()) {
            System.out.println("Переменная infinityValue = Infinity");
        }

        // 5. Работа с Long
        Long l1 = 120L;
        Long l2 = 120L;

        System.out.println("Сравнение Long (120): " + (l1 == l2));

        l1 = 1200L;
        l2 = 1200L;

        System.out.println("Сравнение Long (1200): " + (l1 == l2));
    }
}
