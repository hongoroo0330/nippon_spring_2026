public class main {
    public static void main(String[] args) {
        product p1 = new product("Dewter", 2500, 100);
        product p2 = new product("Харандаа", 800, 50);
        product p3 = new product("Ном", 15000, 20);

        p1.showInfo();
        p1.sell(30);
        p1.sell(80);  
        p2.restock(100);
        p3.showInfo();

        System.out.println("\np1 p2-оос үнэтэй үү? " + p1.isExpensive(p2));
        System.out.println("p3 p1-ээс үнэтэй үү? " + p3.isExpensive(p1));

        
        product expensive = p1;
        if (p2.isExpensive(expensive)) expensive = p2;
        if (p3.isExpensive(expensive)) expensive = p3;
        System.out.println("Хамгийн үнэтэй: " + expensive.name);
    }
    
}
