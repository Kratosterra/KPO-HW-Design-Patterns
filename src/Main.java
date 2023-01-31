import AbstractFactory.Car;
import Observer.StateTrafficInspectorate;
import Observer.TrafficPolicePost;

import java.util.ArrayList;
import java.util.Scanner;


// Вариант 29
// -------------------------------------------------------------------------------------------
// Шаблон “Абстрактная фабрика”. Проект “Заводы по производству автомобилей”. В проекте должно
// быть реализована возможность создавать автомобили различных типов на разных заводах. Пример
// использования шаблона в главе 4.
//
// Вариант 2
// -------------------------------------------------------------------------------------------
// Шаблон “Наблюдатель”. Проект “Оповещение постов ГАИ”. В проекте должна быть реализована
// отправка сообщений всем постам ГАИ. Пример использования шаблона в главе 2.


public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        while (true) {
            printMenu();
            try {
                num = in.nextInt();
            } catch (Exception e) {
                in.next();
                num = 0;
            }
            if (num == 1) {
                testAbstractFactory();
            } else if (num == 2) {
                testObserver();
            } else {
                num = 0;
            }
        }
    }

    private static void testObserver() {
        StateTrafficInspectorate stateTrafficInspectorate = new StateTrafficInspectorate();
        ArrayList<TrafficPolicePost> posts = new ArrayList<>();

        for (int i = 0; i < 13; i++) {
            posts.add(new TrafficPolicePost(String.valueOf(i+1)));
            stateTrafficInspectorate.registerObserver(posts.get(i));
        }

        stateTrafficInspectorate.setViolation("Нарушение скоростного режима", "Страна Чудес", 777);

        stateTrafficInspectorate.removeObserver(posts.get(3));
        stateTrafficInspectorate.removeObserver(posts.get(0));

        stateTrafficInspectorate.setViolation("Нарушение законов физики", "Москва", 100);
    }

    private static void printMenu() {
        System.out.println("""
                -------------------------------------------------------
                                      𝙼𝙴𝙽𝚄
                -------------------------------------------------------
                                
                [1] [29 Вариант] Протестить Абстрактную фабрику “Заводы по производству автомобилей”
                [2] [02 Вариант] Протестить Наблюдателя “Оповещение постов ГАИ”
                                
                Введите число:\s""");
    }

    private static void testAbstractFactory() {
        Car lightCar = new Car("light");
        System.out.println(lightCar);
        Car heavyCar = new Car("heavy");
        System.out.println(heavyCar);
    }
}