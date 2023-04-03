/*
 * File:.MainModel.java
 * Author:Szabó Szebasztián
 * Copyright:2023, Szebi:)
 * Group:SZOFT-I-1-N
 * Date:2023-04-03
 * Github: https://github.com/SzaboSzebasztian01
 * Licenc: GNU GPL
 */

 package models;

public class MainModel {
    public double calcArea(double sideUp, double sideDown, double height){
        double area = (sideUp + sideDown) / 2 * height;

        return area;

    }
    
}
