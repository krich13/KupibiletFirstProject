public class Table {
    String name;
    String type;
    long id;
    String colour;
    String material;
    boolean availableForPurchase;
    float width;
    float height;
    float depth;
    float weight;
    boolean guarantee;


    public static void main(String[] args) {
        Table ikeaTable = new Table();
        ikeaTable.name = "LACK ЛАКК";
        ikeaTable.type = "Придиванный столик";
        ikeaTable.id = 10336455;
        ikeaTable.colour = ",белый";
        ikeaTable.material = "ДСП, ДВП, Пластмасса АБС, Акриловая краска, Прозрачный акриловый лак";
        ikeaTable.availableForPurchase = true;
        ikeaTable.width = 55;
        ikeaTable.height = 45;
        ikeaTable.depth = 55;
        ikeaTable.weight = (float) 3.64;
        ikeaTable.guarantee = false;
    }
}