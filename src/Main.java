import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("\nЗадание 1");
        // Создаю массив с зарплатами
        int[] salary = {65_500, 55_000, 70_000, 50_500, 60_000};
        // Создаю счётчик суммирования
        int sum = 0;
        // Запускаю цикл for each с подсчётом всех сумм на затраты за месяц
        for (int element : salary) {
            // Подсчёт элементов всех сумм
            sum += element;
        }
        // Вывожу результат в консоль
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");


        System.out.println("\nЗадание 2");
        // Ввожу минимальное и максимальное значения
        int minSalary = salary[0];
        int maxSalary = salary[0];
        // Запускаю цикл for each с подсчётом минимальной и максимальной величин за неделю
        for (int salarys : salary) {
            // Запускаю условный оператор для подсчёта минимальной суммы за месяц
            if (salarys < minSalary) {
                minSalary = salarys;
            }
            // Запускаю условный оператор для подсчёта максимальной суммы за месяц
            if (salarys > maxSalary) {
                maxSalary = salarys;
            }
        }
        // Вывожу получившееся минимальное (нулевое) значение поделённое на количество недель в месяце
        System.out.println("Минимальная сумма трат за неделю составила " + minSalary / 4 + " рублей");
        // Вывожу получившееся максимальное (length - 1) значение поделённое на количество недель в месяце
        System.out.println("Максимальная сумма трат за неделю составила " + maxSalary / 4 + " рублей");


        System.out.println("\nЗадание 3");
        // Ввожу новое значение weeklySum с типом данных double (если получится остаток), применяя старое значение sum из первой задачи, поделив на длину массива
        double weeklySum = (double) sum / salary.length;
        // Вывожу в консоль среднее значение еженедельных трат за месяц
        System.out.println("Средняя сумма трат за месяц составила " + weeklySum + " рублей");


        System.out.println("\nЗадание 4");
        // Создаю массив бага с перевёрнутым именем
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        // Создаю цикл обратного отсчёта элементов массива
        for (int letter = reverseFullName.length - 1; letter >= 0; letter--) {
            // Вывожу в консоль полученный результат
            System.out.print(reverseFullName[letter]);
        }
    }
}