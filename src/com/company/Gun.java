package com.company;

public class Gun {
    public String G_Name;
    public int DMG;
    public int Cost;
    public int NLvl;

    public int getNLvl(){
        return NLvl;
    }

    public Gun(String name, int dmg, int cost, int nlvl){
        this.G_Name = name;
        this.DMG = dmg;
        this.Cost = cost;
        this.NLvl = nlvl;
    }
    public void ShowStats(){
        System.out.println("\u001b[38;5;30m" + "Орудие: " + G_Name + " || Урон: " + DMG + " || Цена: " + Cost + " || Уровень предмета: " + NLvl);
    }
}
