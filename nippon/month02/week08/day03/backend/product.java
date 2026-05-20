public class product {
    String name;
    double price;
    int stock;
    product(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }
    public void sell(int qty) {
        if (qty > stock) {
        System.out.println(name + "noots hureltsehgui" + stock);
    }
       else {
        stock-=qty;
        System.out.println(name + " : " + qty +" zaragdlaa. Uldegdel: " + stock);
       }
    }
    void restock(int qty) {
        stock += qty;
        System.out.println(name + ": " + qty + "Nemegdlee. Niit: " + stock);
    }
    double totalValue() {
        return price * stock;
    }
    boolean isExpensive(product other) {
        return this.price > other.price;
    }
    void showInfo() {
        System.out.printf("%s: %.0f, noots: %d, Niit une: %.0f%n", name, price, stock, totalValue());
    }
}