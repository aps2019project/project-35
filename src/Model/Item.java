package Model;

public class Item {
    private int x;
    private int y;
    private boolean passive;
    private int id, price;
    private String name, desc;
    public String getName(){
        return name;
    }
    public  String getDesc(){
        return  desc;
    }
    public int getPrice(){
        return  price;
    }
}
