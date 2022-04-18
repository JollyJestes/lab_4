package com.company;

public class Main {

    public static void main(String[] args) {
//task1();
task2();
    }



    /**
     * Определить товар, количество которого больше всего
     * на складе, и напечатать все сведения о нем.
     *
     * Количество
     * Цена
     * Год изготовления
     * Производитель
     */

    private static void task1() {
     Tovar tovar = new Tovar();
     tovar.function();
        System.out.println(tovar);
    }

    /**Вывести все сведения о сотрудниках, стаж которых
     превышает 10 лет.
     *
     *Фамилия
     * Имя
     * Отчество
     * Должность
     * Пол
     * Дата приёма на работу
     */
    private static void task2() {
        Worker worker = new Worker();
        worker.function();
        System.out.println(worker);
    }
}
