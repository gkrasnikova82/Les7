package com.company;
// ДЗ 7. Static, наследование, приведение типов
//1. Реализовать класс Calculator, который будет содержать статические методы для операций вычитания,
// сложения, умножения, деления и взятия процента от числа. Класс должен работать как с целыми числами,
// так и с дробями.

class Calculator {
    public double Subtraction(double a, double b) {      // вычитание
           return (a-b);
    }

    public double addition(double a, double b) {        // сложение
           return (a+b);
    }


    public double multiplicatior(double a, double b) {   // умножение
        return (a*b);

    }

    public double division(double a, double b) { // деление
        return (a/b);
    }

    public double GetPercentFromNumber(double a, double b) {  // взятия процента от числа
        return (a*b/100);
    }
}


public class Main {

    public static void main(String[] args) {
        double number1 = 13;
        double number2 = 6;
        double percent = 2;
        Calculator Calc = new Calculator ();
        System.out.println( "Вычитание числа "+ number1+ " из " +number2 + " = "+Calc.Subtraction (number1, number2));
        System.out.println("Сложение чисел "+ number1+ " и " +number2 + " = "+Calc.addition (number1, number2));
        System.out.println("Умножение чисел "+ number1+ " и " +number2 + " = "+Calc.multiplicatior (number1, number2));
        System.out.print("Деление числа "+ number1+ " на " +number2 + " = ");
        System.out.printf("%.2f",Calc.division (number1, number2));
        System.out.println();
        System.out.println(percent+"% от числа " +number1 + " = "+Calc.GetPercentFromNumber (number1, percent));




        //2. Реализовать класс в конструкторе которого будет счетчик количества создаваемых объектов.
        // Написать метод для получения информации о количестве.
        //
        //3. Реализовать два класса: договор и акт. В каждом сделать поля: номер, дата, список товаров (массив строк).
        // Написать класс со статическим методом конвертации договора в акт (на вход передавать договор, на выходе получаем акт).
    }
}
