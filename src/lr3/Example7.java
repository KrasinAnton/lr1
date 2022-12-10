package lr3;

import java.util.Arrays;

public class Example7 {

    public static void main(String[] args) {
        int Size = 10;
        char chars[] = new char[Size]; // Создание массива с размером 10
        char i = 's';
        for (int x = 0; x < Size; i--) {
            if (i % 2 == 1) {
                chars[x] = i; // Присвоение x-тому элементу массива значения i
                System.out.println("Элемент массива [" + x + "] = " + chars[x]);
                x++;
            }
        }
        System.out.println("конец массива\n");
        Arrays.sort(chars); // Сортировка массива по возрастанию его элементов
        System.out.println("Произведена сортировка массива");
        for (int x = 0; x < chars.length; x++) {
            System.out.println("Элемент массива [" + x + "] после сортировки = " + chars[x]);
        }
        System.out.println("конец массива");
    }
}
/*Напишите программу, в которой создается одномерный
символьный массив из 10 элементов. Массив заполняется буквами «через
одну», начиная с буквы ' а ': то есть массив заполняется буквами ' а ' , ' с ' , ' е ' ,
' д ' и так далее. Отобразите массив в консольном окне в прямом и обратном
порядке. Размер массива задается переменной.*/