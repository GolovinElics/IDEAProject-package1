import java.util.Scanner;

public class Test {
    static String  Order;

    public static void main(String[] args) {
     Phone.show_Welcom();
     People people1 = new People("张三","男",10000);
     Phone p1 = new Phone("华为P20",2000,20);

     Scanner sc = new Scanner(System.in);
     System.out.println("请问是否需要购买【Y/N】");
     Order = sc.nextLine();
     if(Order.equals("Y")){

         System.out.println("购买成功，你的信息如下");
         System.out.println(people1.getCash()- p1.getPrice());

     }
    }
}
