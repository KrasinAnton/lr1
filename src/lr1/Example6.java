package lr1;

import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input surname: ");
        String surname = in.nextLine();

        System.out.println("Input name: ");
        String name = in.nextLine();

        System.out.println("Input patronymic: ");
        String patronymic = in.nextLine();

        System.out.printf("Hello " +surname+" " +name+" " +patronymic);
        in.close();
    }
}
/*Напишите программу, в которой Пользователь вводит сначала фамилию, затем имя, затем отчество.
После ввода программа выводит сообщение «Hello <фамилия, имя, отчество>».*/