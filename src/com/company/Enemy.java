package com.company;

public class Enemy {
    public String E_Name;
    public int E_HP;
    public int E_AtP;
    public int E_Arm;

    //Метод, возвращающий силу атаки противника
    public int getE_AtP(){
        return E_AtP;
    }

    public Enemy(String name, int hp, int atp, int arm){
        this.E_Name = name;
        this.E_HP = hp;
        this.E_AtP = atp;
        this.E_Arm = arm;
    }

    public void ShowStats(){
        System.out.println("\u001b[38;5;28m" + "Имя противника: " + "\u001b[38;5;32m" + E_Name + "\u001b[38;5;28m" +
                "\u001b[38;5;28m" +  "\u001b[38;5;28m" + " Здоровье: "+ "\u001b[38;5;32m" +  E_HP +"\u001b[38;5;28m" + " Урон с руки: " +
                "\u001b[38;5;32m" + E_AtP + "\u001b[38;5;28m" +" Броня: " + "\u001b[38;5;32m" + E_Arm);
    }
}
