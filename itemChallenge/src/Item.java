public class Item {
    static int numItems = 0;
    final int ID;

    Item(int id) {
        this.ID = id;
    }

    static int getNextId() {
        return Item.numItems++;
    }

    static Item getItem(){
        return new Item(Item.getNextId());
    }

    static void printNumsItems() {
        System.out.println("Num items:" + Item.numItems);
    }

    public void printId() {
        System.out.println("Item id:" + this.ID);
    }
}
