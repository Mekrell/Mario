/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

/**
 *
 * @author Rasmus
 */
public class Pizza {
    public int menuNumber;
    public String name;
    public int price;

    public Pizza(int menuNumber, String name, int price) {
        this.menuNumber = menuNumber;
        this.name = name;
        this.price = price;
    }

    public int getMenuNumber() {
        return menuNumber;
    }

    public void setMenuNumber(int menuNr) {
        this.menuNumber = menuNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Nr " + menuNumber + ", name " + name + ", price " + price;
    }
}
