//public class ShowInformation {
//    static String UserName = "lf";
//    static String PassW = "123";
//    static String SelectFunctionName;        //选择功能的名字
//
//    /**
//     * 欢迎函数
//     */
//    public static void Show_Welc() {
//        System.out.println("-------------------------------------");
//        System.out.println("-----    欢迎进入影院售票系统    -----");
//        System.out.println("-------------------------------------");
//    }
//
//    /**
//     * 重新登录界面
//     */
//    public static void Show_ReloadLogin() {
//        System.out.println("-------------------------------------");
//        System.out.println("............重新登录系统中............");
//        System.out.println("....................................||");
//        System.out.println();
//    }
//
//    /**
//     * 展示功能清单
//     */
//    public static void Show_Function() {
//        //功能种类初始化
//        String[] FunctionName = new String[6];
//        FunctionName[0] = "1、新增电影";
//        FunctionName[1] = "2、查看电影";
//        FunctionName[2] = "3、放映设置";
//        FunctionName[3] = "4、影票销售";
//        FunctionName[4] = "5、修改密码";
//        FunctionName[5] = "0、退出系统";
//        System.out.println("--------------功能清单----------------");
//        //遍历功能清单
//        for (int i = 0; i < FunctionName.length; i++) {
//            System.out.println(FunctionName[i]);
//        }
//        Operation oo2 = new Operation();
//        oo2.SelectFunction();
//    }
//
////    /**
////     * 信息反馈_新增电影
////     */
////    public static void Show_FeedbackAddMovie() {
////        Cinema cc2 = new Cinema("", "", "", 0);
////        //需要修改为调用Data区的数据，存入Data才表示真的录入成功
////    }
////
////    /**
////     * 打印小票
////     */
////    public static void Show_TicketPrint() {
////        Cinema m1 = new Cinema("", "", "", 0);
//        //返回主菜单
////        System.out.println("电影："+m1.arrRoom[1]);
////        System.out.println("价格："+m1.arrMovie[3]);
////        System.out.println("放映室编号："+m1.arrRoom[0]+"    座位号"+m1.arrRoom[3]);
////        System.out.println("播放时间："+m1.arrRoom[2]);
////        Operation.OnlyBackToFunction();
////    }
//
//    /**
//     * 座位信息
//     */
//    public static void Show_EmptySeats() {
//        //获取座位信息
//        //反应剩余座位的信息：1、直接返回剩余信息（待完善）；2、选取后查询位置是否有人（简单，但不合常理）。
//        for (int i = 0; i < Data.arr.length; i++) {
//            for (int j = 0; j < Data.arr[i].length; j++) {
//                System.out.print(Data.arr[i][j] + "  ");
//            }
//            System.out.println();
//        }
//    }
//
//}
////
////    /**
////     * 电影信息
////     */
////    public static void Show_MovieInformOld(){
////        Cinema mm = new Cinema("","","",0);
////        //获取Data区的数据，装入数组
////        Data xx = new Data();
////        Cinema[] TempOld = new Cinema[10];
////        TempOld[0] = xx.m1;
////        TempOld[1] = xx.m2;
////        TempOld[2] = xx.m3;
////        TempOld[3] = xx.m4;
////        TempOld[4] = xx.m5;
////
////        System.out.println("电影名称               电影类型               电影主演               电影价格   ");
////        //以下获取内容要修改为Data数据区的，才算完善(已完善)
////        int i = 0;
////        while(i < 5){
////            System.out.print(TempOld[i].getMovieName());
////            System.out.print("            "+TempOld[i].getType());
////            System.out.print("             "+TempOld[i].getStarring());
////            System.out.println("                  "+TempOld[i].getPrice());
////            i++;
////        }
////        //返回主菜单
////        Operation.OnlyBackToFunction();
////    }
