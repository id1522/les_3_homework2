package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n У радуги 6 цветов.Нажми цифру от 1 до 6 и узнай цвет. \n !!!  7-последовательность цветов 0-выход  !!!");
        while (true) {

            int i = scan.nextInt();
            if (i ==0) {
                System.out.println("Досвидания");
            }else if (i == 7){
                System.out.println("Красный,Оранжевый,Желтый,Зеленый,Синий,Фиолетовый");
               return;
            }
            switch (i) {
                case 1 -> System.out.println("Красный");
                case 2 -> System.out.println("Оранжевый");
                case 3 -> System.out.println("Желтый");
                case 4 -> System.out.println("Зеленый");
                case 5 -> System.out.println("Синий");
                case 6 -> System.out.println("Фиолетовый");

            }
        }
    }
}

//       if (i % 2 == 0) {
//        System.out.println(i+"-четное");
//       }
//       if (i % 2 != 0) {
//       System.out.println(i+"-нечетное");
//       }
//       if (i == 103) {
//       System.out.println("Досвидания!");
//       return;
//      }

//      int b = -5;
//      int c = -20;
//      if (i > b) {
//      System.out.println(" Тепло ");
//      }
//      if (b > i && i > c) {
//      System.out.println(" Нормально ");
//      }
//      if (c >= i) {
//      System.out.println(" холодно ");
//      }