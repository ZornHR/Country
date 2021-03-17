package com.company;

import java.util.Scanner;

public class Main {

    public static void main(final String[] args) {
        for (Countrys x : Countrys.values()) {
            System.out.println(x);
        }
        Scanner input = new Scanner(System.in);
        System.out.println("Введите название страны из списка");
        String countryName = input.next();
        Countrys thisCountry;
        try {
            thisCountry = Countrys.valueOf(countryName);
            System.out.println("Возможность полета: " + thisCountry.isOpen());
        } catch (IllegalArgumentException e) {
            System.out.println(e + " Нет такой страны " + countryName);
        } catch (NullPointerException e) {
            System.out.println(e + " Пусто ");
        }

    }
}
