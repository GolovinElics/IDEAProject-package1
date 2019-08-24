import sun.security.pkcs11.P11TlsKeyMaterialGenerator;

public class Phone {
    public String model;
    public double price;
    public int count;

    public Phone(String model, double price, int count){
        this.model = model;
        this.price = price;
        this.count = count;
    }
    public static  void show_Welcom(){
        //Phone xx = new Phone("",0,0);
        System.out.println("-------------------------------");
        System.out.println("机型有： "+P1.getModel());
        System.out.println("价格为： "+P1.getPrice());
        System.out.println("数量为： "+P1.getCount());
    }
    Phone[] phones = new Phone[1];
    public static Phone P1 = new Phone("华为P20",2000,20);
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }
}
