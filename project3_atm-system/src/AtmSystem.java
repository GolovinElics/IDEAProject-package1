import java.util.Scanner;

public class AtmSystem {
    static String UserName = "Hello";
    static String PassW = "123456";

    static String SelectFunctionName;        //选择功能的名字
    public static double money = 934;

    //展示函数1———欢迎
    public static void Show_welcome(){
        System.out.println("---------------------欢迎进入实训银行----------------------");
        System.out.println("**********        请按照功能菜单进行操作         **********");
        System.out.println("----------------------------------------------------------");
    }
    //判断存款金额函数
    public static int checkDMoney(double DepsiteMoney){
        int i;
        //判断主体
        if(DepsiteMoney > 0 && DepsiteMoney%100 == 0){
            i = 1;
            return i;
        }else{
            i = 0;
            return i;
        }
    }
    //判断取款金额函数
    public static int checkWMoney(double WithdrawMoney){
        //满足的标志
        int i = 0;
        //判断主体
        if(WithdrawMoney > 0 && WithdrawMoney%100 == 0){
            i = 1;
            return i;
        }else{
            return i;
        }
    }
    //密码修改判断块
    public static int checkPassW(String TempPassW){
        int i;
        if(TempPassW.equals(PassW)){
            i =1 ;
        }else{
            i = 0;
        }
        return i;
    }
    //修改密码
    public static String UpdatePassW(){
        String NewPassW1;
        String NewPassW2;
        int x = 0;
        Scanner PP = new Scanner(System.in);
        System.out.println("请输入你的新密码：");
        NewPassW1 = PP.nextLine();
        System.out.println("确认修改的新密码：");
        NewPassW2 = PP.nextLine();

        if(NewPassW1.equals(NewPassW2)){
            PassW = NewPassW1;
        }else{
            System.out.println("您前后两次的密码输入错误，请重新输入!");
        }
        return PassW;
    }
    //余额查询
    public static void InquireMoney(){
        System.out.println(money);
    }
    //存款
    public static double Deposit(){
        double DepositMoney;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你想要存入的金额：");
        DepositMoney = sc.nextDouble();

        int i = AtmSystem.checkDMoney(DepositMoney);
        //检查结果处理
        if(i == 1){
            money = money + DepositMoney;
            return money;
        }else{
            System.out.println("存款金额必须为 100元 的整数倍");
            return money;
        }
    }
    //取款
    public static double Withdraw(){
        double WithDrawMoney;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你想要取出的金额：");
        WithDrawMoney = sc.nextDouble();
//学到了：函数返回值该如何调用
        int i = AtmSystem.checkWMoney(WithDrawMoney);
        //检查结果处理
        if(i == 1){
            money = money - WithDrawMoney;
            return money;
        }else{
            System.out.println("取款金额必须为 100元 的整数倍，且不能超过1000 ");
            return money;
        }
    }
    //转账
    public static void TransAccount(){
        System.out.println("抱歉，暂未开通转账功能。");
    }
    //展示函数2-----功能清单
    public static void Show_Function(){
        //菜单种类初始化
        String []FunctionName = new String[6];
        FunctionName[0] = "1、余额查询";
        FunctionName[1] = "2、存款";
        FunctionName[2] = "3、取款";
        FunctionName[3] = "4、转账";
        FunctionName[4] = "5、修改密码";
        FunctionName[5] = "0、退出";

        System.out.println("------------------------功能清单--------------------------");
        //遍历功能清单
        for(int i=0;i<FunctionName.length;i++){
            System.out.println(FunctionName[i]);
        }
        //功能选择
        int flag = 1;                     //结束判定
        //double total = 0;               //结果初始化
        while(flag != 0 ) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请选择服务项目：");
            int order = sc.nextInt();
            switch (order) {
                case 1:
                    //余额查询函数
                    SelectFunctionName = "余额查询";
                    System.out.println("您好，你选择的服务项目是："+SelectFunctionName);
                    AtmSystem.InquireMoney();
                    break;
                case 2:
                    //存款功能
                    SelectFunctionName = "存款";
                    System.out.println("您好，你选择的服务项目是："+SelectFunctionName);
                    System.out.println("您的余额现在为："+AtmSystem.Deposit());
                    break;
                case 3:
                    //取款功能
                    SelectFunctionName = "取款";
                    System.out.println("您好，你选择的服务项目是："+SelectFunctionName);
                    money = AtmSystem.Withdraw();
                    System.out.println("您的余额现在为："+money);
                    break;
                case 4:
                    //转账功能
                    SelectFunctionName = "转账";
                    System.out.println("您好，你选择的服务项目是："+SelectFunctionName);
                    AtmSystem.TransAccount();
                    break;
                case 5:
                    SelectFunctionName = "修改密码";
                    System.out.println("您好，你选择的服务项目是："+SelectFunctionName);
                    String TempPassW;
                    Scanner aa = new Scanner(System.in);
                    System.out.print("请输入你的原始密码：");
                    TempPassW = aa.nextLine();
                    //修改权限确认
        //函数返回值的调用
                    int i = AtmSystem.checkPassW(TempPassW);
                    if(i == 1){
                        //修改密码
                        System.out.println("您的新密码为："+AtmSystem.UpdatePassW()+" 请妥善保管！");
                    }else{
                        System.out.println("您的密码输入有误，请重新输入:");
        //此处可以完善一下，作成内循环密码判断检验，
                    }
                    break;
                case 0:
                    //退出
                    break;
                default:
                    System.out.println("输入错误！");
            }
            System.out.println("是否继续操作？ 0、拒绝；任意键继续。");
            flag = sc.nextInt();
        }
        System.out.println("您已安全退出系统");
    }

    public static void Login(){
        int sum = 1;
        int x = 5;
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
                //进入ATM系统
                AtmSystem.Show_Function();
                return;
            }else{
                x--;
                System.out.println("账户名称或密码错误，请重新输入，您还剩余："+x+" 次登录机会：");
                sum++;
            }
        }
        System.out.println("密码已经错误 5 次，请联系银行工作人员！");
    }

    public static void main(String[] args) {
        AtmSystem.Show_welcome();
        AtmSystem.Login();
    }
}