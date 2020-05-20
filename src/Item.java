public class Item {
    String name;
    int price;

    public static void main(String[] args) {
        Item xueping = new Item();
        xueping.name = "血瓶";
        xueping.price = 50;
        System.out.println("名称" + " " + xueping.name);

        Item caoxie = new Item();
        caoxie.name = "草鞋";
        caoxie.price = 100;
        System.out.println("名称" + " " + caoxie.name);

        Item changjian = new Item();
        changjian.name = "长剑";
        changjian.price = 350;
        System.out.println("名称" + " " + changjian.name);
    }
}
