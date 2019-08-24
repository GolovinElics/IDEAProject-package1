//import java.util.Scanner;
//
//public class Operation {
//    static Operation ooSlectFunction = new Operation();
//    static int addNum = 0;         //add次数标记
//
//    /**
//     * 密码修改权限判断块
//     * @param TempPassW
//     * @return
//     */
//    public static int checkPassW(String TempPassW){
//        int i;
//        if(TempPassW.equals(ShowInformation.PassW)){
//            i =1 ;
//        }else{
//            i = 0;
//        }
//        return i;
//    }
//
//    /**
//     * 密码修改条件判断块
//     * @return
//     */
//    static public int CheckPassWCond(){
//        String TempPassW;
//        int Con;
//        Scanner aa = new Scanner(System.in);
//        System.out.print("请输入你的原始密码：");
//        TempPassW = aa.nextLine();
//        //修改权限确认
//        int i = Operation.checkPassW(TempPassW);
//        if(i == 1){
//            //允许修改密码
//            System.out.println("你的密码验证成功！");
//            Operation.UpdatePassW();
//            return Con = 1;
//        }else{
//            System.out.println("您的密码输入有误，请重新输入:");
//            BackToFunction();
//            return Con = 1;
//        }
//    }
//
//
//    /**
//     * 修改密码
//     * @return
//     */
//    static public  String UpdatePassW(){
//        String NewPassW1;
//        String NewPassW2;
//        int x = 0;
//        Scanner PP = new Scanner(System.in);
//        System.out.println("请输入你的新密码：");
//        NewPassW1 = PP.nextLine();
//        System.out.println("确认修改的新密码：");
//        NewPassW2 = PP.nextLine();
//
//        if(NewPassW1.equals(NewPassW2)){
//            ShowInformation.PassW = NewPassW1;
//        }else{
//            System.out.println("您前后两次的密码输入错误，请重新输入!");
//            BackToFunction();
//        }
//        return ShowInformation.PassW;
//    }
//
//    /**
//     * 登录系统：
//     */
//    static public void Login(){
//        int sum = 1;
//        int x = 5;
//        while(sum != 0 && sum < 6){
//            //字符输入：
//            Scanner sc = new Scanner(System.in);
//            System.out.print("请输入你的用户名：");
//            String username_in = sc.next();
//            System.out.print("请输入你的密码：");
//            String password_in = sc.next();
//            //判断用户名与密码的正误：
//            if(username_in.equals(ShowInformation.UserName)&&password_in.equals(ShowInformation.PassW)){
//                System.out.println("登陆成功！");
//                //进入ATM系统
//                ShowInformation.Show_Function();
//                return;
//            }else{
//                x--;
//                System.out.println("账户名称或密码错误，请重新输入，您还剩余："+x+" 次登录机会：");
//                sum++;
//            }
//        }
//        System.out.println("密码已经错误 5 次，请工作人员！");
//        Operation.Exist();
//    }
//
//    /**
//     * 系统功能选择
//     */
//    public static void SelectFunction(){
//        Cinema cinema = new Cinema();
//        int flag = 1;                     //结束判定
//        while(flag != 0 ) {
//            Scanner sc = new Scanner(System.in);
//            System.out.println("请选择服务项目：");
//            int order = sc.nextInt();
//            switch (order) {
//                case 1:                 //新增电影
//                    ShowInformation.SelectFunctionName = "新增电影";
//                    System.out.println("您好，你选择的服务项目是："+ShowInformation.SelectFunctionName);
//                    cinema.addNewMovie(sc);
//                    addNum++;
//                    break;
//                case 2:                 //查看电影
//                    cinema.queryAllMovies();
//                    break;
//                case 3:                 //放映设置
//                    cinema.setupPlayMovie(sc);
//                    break;
//                case 4:                 //影票销售
//                    cinema.filmSales(sc);
//                    break;
//                case 5:                 //修改密码
//                    ShowInformation.SelectFunctionName = "修改密码";
//                    System.out.println("您好，你选择的服务项目是："+ShowInformation.SelectFunctionName);
//        //这里隐藏了一个初始值为0的情况
//        // 其意义在于，若判断一次通过，则直接返回修改后的密码，却没有返回Condition成功标志
//        // 因此默认是不成功的情况，只有成功了才进入Condition=1的情况
//                    int Condition;
//                    Condition = Operation.CheckPassWCond();
//                    if(Condition == 1){
//                        System.out.println("您的新密码为："+ShowInformation.PassW+" 请妥善保管！");
//                        ShowInformation.Show_ReloadLogin();
//                        ShowInformation.Show_Welc();
//                        Operation.Login();
//                    }
//                    break;
//                case 0:
//                    //退出
//                    System.out.println("谢谢使用，再见！");
//                    Operation.Exist();
//                    break;
//                default:
//                    System.out.println("输入错误！");
//            }
//            System.out.println("是否继续操作？ 1、继续；0、退出");
//            flag = sc.nextInt();
//        }
//        Operation.Exist();
//    }
//
//    /**
//     * 返回判断
//     */
//    public static void BackToFunction() {
//        System.out.println("继续输入请按1；任意键返回主菜单。");
//        Scanner saa = new Scanner(System.in);
//        int orderTemp = saa.nextInt();
//        if(orderTemp == 1){
//            Operation.CheckPassWCond();
//        }else{
//            ShowInformation.Show_Function();
//            ooSlectFunction.SelectFunction();
//        }
//    }
//
//    /**
//     * 仅返回主菜单
//     */
//    public static void OnlyBackToFunction(){
//        System.out.print("输入 r 返回主菜单：");
//        Scanner o1 = new Scanner(System.in);
//        String OrderBack = o1.nextLine();
//        if(OrderBack.equals("r")){
//            ShowInformation.Show_Function();
//            ooSlectFunction.SelectFunction();
//        }else{
//            System.out.println("输入错误，请输入 r 退出！");
//            Operation.OnlyBackToFunction();
//        }
//    }
//
//    /**
//     * 判断座位是否有人
//     */
////    static public int checkSeatEmpty(){
////        if(){
////            return 1;
////        }
////        return 0;
////    }
//    /**
//     * 数组输入测试
//     */
//
//
//    /**
//     * 退出系统
//     */
//    static public void Exist(){
//        System.out.println("您已安全退出系统！");
//        System.exit(0);
//    }
//}
