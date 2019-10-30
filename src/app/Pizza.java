
package app;

/**
 * @author Rasmus
 * @author Mia
 * @author Andreas
 * @author Emilie
 */

// Klassen der indeholder pizzaernes egenskaber
public class Pizza {
    // Atributter:
    public int menuNumber;
    public String name;
    public int price;

    // Kontruktor
    public Pizza(int menuNumber, String name, int price) {
        this.menuNumber = menuNumber;
        this.name = name;
        this.price = price;
    }
// Getter og setter for MenuNumber
    public int getMenuNumber() {
        return menuNumber;
    }

    public void setMenuNumber(int menuNr) {
        this.menuNumber = menuNumber;
    }
// Getter og setter for Name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
// Getter og setter for Price
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

// toString bruges når ordrene skal vises i terminalen    
    @Override
    public String toString() {
        return "No." + menuNumber + ", " + name + ", " + price + " kr.";
    }
}
