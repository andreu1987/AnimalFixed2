package check;

import java.util.Scanner;

public class CheckString {
    //private static Scanner scanner = new Scanner(System.in);
    //Integer number = 0;
            //1. передать сканер
            //2. передать сообщение

    public static Integer checkIntString(Scanner scanner,String message){
        do {
            System.out.println(message);
            Integer number = CheckAgeWeightString.convertWeightIntString(scanner.next());

            if (number != null) {
                return number;
            }
            System.out.println("Вы ввели не тот вес что мы ожидаем!");
        } while (true);
    }
}
