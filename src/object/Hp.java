/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package object;

/**
 *
 * @author Navneet
 */
public class Hp {
    public double getMAX_HP() {
        return MAX_HP;
    }

    public void setMAX_HP(double MAX_HP) {
        this.MAX_HP = MAX_HP;
    }

    public double getCurrentHp() {
        return currentHp;
    }

    public void setCurrentHp(double currentHp) {
        this.currentHp = currentHp;
    }

    public Hp(double MAX_HP, double currentHp) {
        this.MAX_HP = MAX_HP;
        this.currentHp = currentHp;
    }

    public Hp() {
    }

    private double MAX_HP;
    private double currentHp;
}
