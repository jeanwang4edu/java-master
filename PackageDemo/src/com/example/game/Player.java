package com.example.game;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jean on 12/7/20.
 */
public class Player implements ISavable{

    private String name;
    private int hitPoints;
    private int strength;
    private String weapon;

    public Player(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
        this.weapon = "Sword";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                ", weapon='" + weapon + '\'' +
                '}';
    }

    @Override
    public List<String> write() {
        List<String> playerInfo = new ArrayList<>();
        playerInfo.add(0,this.name);
        playerInfo.add(1,Integer.toString(this.hitPoints));
        playerInfo.add(2, Integer.toString(this.strength));
        playerInfo.add(3, this.weapon);
        return playerInfo;
    }

    @Override
    public void read(List<String> savedValues) {
        if( savedValues != null && savedValues.size() != 0){
            this.name = savedValues.get(0);
            this.hitPoints = Integer.parseInt( savedValues.get(1) );
            this.strength = Integer.parseInt( savedValues.get(2) );
            this.weapon = savedValues.get(3);
        }
    }
}
