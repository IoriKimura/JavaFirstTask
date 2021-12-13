package com.company;

public class Character {
    public String Name;
    public int HP;
    public int Exp;
    public int Lvl = 4;
    public int AtP;
    public int Arm;

    public void Access(int Need) {
        if (Lvl >= Need)
            System.out.println("\u001b[38;5;28m" + "Экипируй!\n");
        else
            System.out.println("\u001b[38;5;28m" + "Пришло время гринда!\n");
    }

    public Character(String name, int hp, int exp, int lvl, int atp, int arm){
        this.Name = name;
        this.HP = hp;
        this.Exp = exp;
        this.Lvl = lvl;
        this.AtP = atp;
        this.Arm = arm;
    }
}
