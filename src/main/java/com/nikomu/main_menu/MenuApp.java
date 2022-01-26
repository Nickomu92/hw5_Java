package com.nikomu.main_menu;

import java.util.Scanner;
import com.nikomu.exercise1.Exercise1App;
import com.nikomu.exercise2.Exercise2App;
import com.nikomu.exercise3.Exercise3App;

public class MenuApp
{
    public static void main( String[] args ) {
        Scanner input = new Scanner(System.in);
        String symbol;
        String menu = "[1] - Задание №1 (активация JetBrains IntelliJ IDEA);\n" +
                "[2] - Задание №2 (создание bean'а String[]);\n" +
                "[3] - Задание №3 (создание User и Address);\n" +
                "[q] - Выход из приложения.";

        do {
            Message.headerMessage("\n\tДомашнее задание №5");
            Message.errorMessage("\n\tМулина Николая\n");
            Message.warningMessage("\n\tГлавное меню\n");
            System.out.println(menu);
            Message.primaryMessage("Ваш выбор: ");
            symbol = input.nextLine();

            switch(symbol) {
                case "1":
                    Exercise1App.main(null);
                    break;
                case "2":
                    Exercise2App.main(null);
                    break;
                case "3":
                    Exercise3App.main(null);
                    break;
                case "q": case "Q": case "й": case "Й":
                    break;
                default:
                    Message.errorMessage("\n\t[message] Нет такого пункта меню!\n");
            }
        } while(!symbol.equals("q") && !symbol.equals("Q") && !symbol.equals("й") && !symbol.equals("Й"));
    }
}
