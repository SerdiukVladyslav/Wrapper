package wrapper.classes;

import java.util.Scanner;

public class StringTest {
    public static void main(String[] args) {
        // 2. Создание строк разными способами
        String literalString = "Hello";
        String newString = new String("World");
        char[] charArray = {'J', 'a', 'v', 'a'};
        String charArrayString = new String(charArray);
        byte[] byteArray = {104, 101, 108, 108, 111};
        String byteString = new String(byteArray);
        StringBuilder stringBuilder = new StringBuilder("StringBuilder");
        String sbString = stringBuilder.toString();

        // 3.1 Работа со строкой
        String fruits = "Апельсин,Яблоко,Гранат,Груша";
        String[] fruitArray = fruits.split(",");

        String longestFruit = "";
        for (String fruit : fruitArray) {
            if (fruit.length() > longestFruit.length()) {
                longestFruit = fruit.toLowerCase();
            }
        }
        System.out.println("Самое длинное название фрукта: " + longestFruit);

        for (String fruit : fruitArray) {
            String shortName = fruit.substring(0, 3);
            System.out.println("Сокращенное название: " + shortName);
        }

        // 3.5 Работа со строкой “   Я_новая_строка      ”
        String newStringWithSpaces = "   Я_новая_строка      ";
        String trimmedString = newStringWithSpaces.trim();
        String replacedString = trimmedString.replace('_', ' ');

        System.out.println("Окончательный вариант строки: " + replacedString);

        // 3.9 Работа со Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст: ");
        String inputText = scanner.nextLine();
        System.out.println("Вы ввели: " + inputText);

        // 3.10 Проверки ввода
        if (inputText.startsWith("Запуск")) {
            System.out.println("Запускаем процесс");
        }
        if (inputText.endsWith("завершен")) {
            System.out.println("Процесс завершен");
        }
        if (inputText.toLowerCase().contains("ошибка")) {
            System.out.println("Произошла ошибка");
        }

        // 4. Работа с StringBuilder
        StringBuilder combinedBuilder = new StringBuilder();
        combinedBuilder.append(literalString).append("\n")
                .append(newString).append("\n")
                .append(charArrayString).append("\n")
                .append(byteString).append("\n")
                .append(sbString).append("\n");

        combinedBuilder.reverse();
        String reversedString = combinedBuilder.toString();
        System.out.println("Результат работы с StringBuilder:\n" + reversedString);
    }
}
