package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    //Третье задание
    public static void Creation(){
        //Массивы с именами противников и оружия
        String[] ENames = new String[] {"Мамоэ","Сахароза","Розария","Пантеон","Пайк","Люкса","Крот","Лелуш","Аска","Мисато"};
        String[] GNames = new String[] {"Копьё", "Сасай-кудосай", "Нож ацкого пламени",
                "Рыба", "Карась", "Церемониальная булава", "Дубина переговоров", "Лук Амуса", "AK-47", "Банкай"};

        ArrayList<Enemy> Enemies = new ArrayList<Enemy>();
        ArrayList<Gun> Guns = new ArrayList<Gun>();
        Random rnd = new Random();

        for (int i = 0; i < 10; i++){
            Enemy _Enmtemp = new Enemy(ENames[rnd.nextInt(ENames.length)],rnd.nextInt(100),rnd.nextInt(100),rnd.nextInt(100));
            Enemies.add(_Enmtemp);
            Gun _Guntemp = new Gun(GNames[rnd.nextInt(GNames.length)],rnd.nextInt(100),rnd.nextInt(100),rnd.nextInt(100));
            Guns.add(_Guntemp);
        }

        for (Enemy i : Enemies) {
            i.ShowStats();
        }
        for (Gun j : Guns) {
            j.ShowStats();
        }
    }
    public static void main(String[] args) {
        System.out.println("Введите имя персонажа:");
        Scanner Scn = new Scanner(System.in);
        String Name = Scn.nextLine();
        System.out.println("~Вы вспоминаете своё имя!~");
        System.out.println("Возле вас лежит ваше первое оружие. Вы пробуете его поднять.~");

        Character Chr = new Character(Name, 10, 20, 4, 10, 7);
        Gun FirstGun = new Gun("Великая палка", 1,1000,30);

        int Need = FirstGun.getNLvl();
        Chr.Access(Need);
        Creation();
    }
}
