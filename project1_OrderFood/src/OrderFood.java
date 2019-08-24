import java.util.Scanner;

public class OrderFood {
    static String UserName = "admin";
    static String PassW = "123456";
    static String Restaurant;

    static int order;                    //点餐次数
    static String SelectFoodName;        //选择菜品的名字
    private static double userTotalPriceSum = 0;             //菜品统计
    static double FoodMoneyResult = 0;  //选择菜品的价格

    static int Foodnum = 0;              //选择菜品的数量

    //展示函数1———欢迎
    public static void Show_welcome(){
        System.out.println("---------------------欢迎进入实训餐厅----------------------");
        System.out.println("尊敬的用户");
        System.out.println("分配给你的账户名为："+UserName);
        System.out.println("分配给你的密码为："+PassW);
        System.out.println("----------------------------------------------------------");
    }

    //展示函数2-----菜品
    public static void Show_food(){
        //菜品种类初始化
        String []FoodNmae = new String[3];
        FoodNmae[0] = "1、鱼香肉丝";
        FoodNmae[1] = "2、青椒肉丝";
        FoodNmae[2] = "3、丝瓜炒蛋";
        //记录点餐内容和价格
        StringBuffer userFoodsMenu = new StringBuffer();
        double userTotalPrice = 0;

        System.out.println("-----------------------本店菜品-------------------------");
        //遍历菜品种类
        for(int i=0;i<FoodNmae.length;i++){
            System.out.println(FoodNmae[i]);
        }
        //菜品选择
        System.out.println("请选择：");
        int flag = 1;                   //结束判定
        //double total = 0;               //结果初始化
        while(flag != 0 ) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入餐品：");
            order = sc.nextInt();
            System.out.println("请输入餐品个数：");
            Foodnum = sc.nextInt();
            switch (order) {
                case 1:
                    SelectFoodName = "鱼香肉丝";
                    FoodMoneyResult = 15;
                    userTotalPrice = FoodMoneyResult * Foodnum ;
                    break;
                case 2:
                    SelectFoodName = "青椒肉丝";
                    FoodMoneyResult = 12;
                    userTotalPrice = FoodMoneyResult * Foodnum ;
                    break;
                case 3:
                    SelectFoodName = "丝瓜炒蛋";
                    FoodMoneyResult = 10;
                    userTotalPrice = FoodMoneyResult * Foodnum ;
                    break;
                default:
                    System.out.println("对不起，您所选择的餐品错误");
            }
            System.out.println("您好，你选择的餐品是："+SelectFoodName);
            System.out.println("菜品单价为："+FoodMoneyResult+" 元");
            userTotalPriceSum = userTotalPriceSum  + userTotalPrice;
            //字符串的拼接，利用flag的判定，循环多次拼接
            userFoodsMenu.append(SelectFoodName+" ");
            System.out.println("继续点餐？ 1、yes ；0、no:");
            flag = sc.nextInt();
        }
        System.out.println("尊敬的顾客，您点的菜品有："+userFoodsMenu);
        System.out.println("您总共花费的金额为："+userTotalPriceSum);
    }

    //登陆判断函数
    public static void Login(){
        int sum = 1;
        while(sum != 0 && sum < 6){
            //字符输入：
            Scanner sc = new Scanner(System.in);
            System.out.println("尊敬的顾客，请输入你的用户名：");
            String username_in = sc.next();
            System.out.println("请输入你的密码：");
            String password_in = sc.next();
            //判断用户名与密码的正误：
            if(username_in.equals(UserName)&&password_in.equals(PassW)){
                System.out.println("登陆成功！");
                OrderFood.Show_food();
                return;
            }else{
                System.out.println("用户名或密码错误，请重新输入：");
                sum++;
            }
        }
        System.out.println("错误次数太多，请稍后重试！");
    }

    //创建用户：
    //static User user_1 = new user_1();
    //创建密码：
    //static Password password_1 = new password_1();

    public static void main(String[] args) {
        //主要代码
        OrderFood.Show_welcome();
        OrderFood.Login();
    }
}