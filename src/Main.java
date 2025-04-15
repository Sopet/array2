import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("\nЗадание 1");
        // Создаю массив с зарплатами
        int[] salary = {65_500, 55_000, 70_000, 50_500, 60_000};
        // Создаю счётчик суммирования
        int sum = 0;
        // Запускаю цикл for each с подсчётом всех сумм на затраты
        for (int element : salary) {
            // Подсчёт элементов всех сумм
            sum += element;
        }
        // Вывожу результат в консоль
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");


        System.out.println("\nЗадание 2");
        // Создаю метод сортировки всех сумм - Arrays.sort
        Arrays.sort(salary);
        // Вывожу получившееся минимальное (нулевое) значение поделённое на количество недель в месяце
        System.out.println("Минимальная сумма трат за неделю составила " + salary[0] / 4 + " рублей");
        // Вывожу получившееся максимальное (length - 1) значение поделённое на количество недель в месяце
        System.out.println("Максимальная сумма трат за неделю составила " + salary[salary.length - 1] / 4 + " рублей");


        System.out.println("\nЗадание 3");
        // Ввожу новое значение weeklySum с типом данных double (если получится остаток), применяя старое значение sum из первой задачи, поделив на количество недель
        double weeklySum = sum / 4.0;
        // Вывожу в консоль среднее значение еженедельных трат за месяц
        System.out.println("Средняя сумма трат за месяц составила " + weeklySum + " рублей");


        System.out.println("\nЗадание 4");
        // Создаю массив бага с перевёрнутым именем
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        // Создаю цикл обратного отсчёта элементов массива
        for (int letter = reverseFullName.length; letter > 0; letter--) {
            // Вывожу в консоль полученный результат
            System.out.print(reverseFullName[letter - 1]);
        }
    }
}