import java.util.ArrayList;
import java.util.Scanner;
public abstract class Furniture {
    String material;
    int price;

    public abstract String toString();
}
class Table extends Furniture{
    int height=8;
    public String toString() {
        return "Furniture{" +
                "material='" + material + '\'' +
                ", price=" + price +
                ", height="+height+
                '}';
    }
}
class Sofa extends Furniture{
    String color= "green";
    public String toString() {
        return "Furniture{" +
                "material='" + material + '\'' +
                ", price=" + price +
                ", color="+color+
                '}';
    }
}
class Cupboard extends Furniture{
    int weight=5;
    public String toString() {
        return "Furniture{" +
                "material='" + material + '\'' +
                ", price=" + price +
                ", weight="+weight+
                '}';
    }
}
class FurnitureShop{
    FurnitureShop(Furniture model){
        System.out.println(PriceAndInfo(model));
    }
    String PriceAndInfo(Furniture model){
        return model.toString();
    }
}
class Person{
    Furniture model(){
        Scanner in=new Scanner(System.in);
        int n= in.nextInt();
        return mod.get(n);
    }
    void add(Furniture M){
        mod.add(M);
    }
    ArrayList <Furniture> mod=new ArrayList<Furniture>();
}
class Main{
    public static void main(String[] args) {
        Person human=new Person();
        Furniture mod=new Cupboard();
        mod.price=100;
        mod.material="stone";
        Furniture mod2=new Table();
        mod2.price=1000;
        mod2.material="eko";
        human.add(mod);
        human.add(mod2);
        FurnitureShop big=new FurnitureShop(human.model());
        FurnitureShop big2=new FurnitureShop(human.model());
    }
}