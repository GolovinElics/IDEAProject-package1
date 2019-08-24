import java.util.Scanner;

public class MovieShopSystemTest {

    private static Scanner sc = new Scanner(System.in);

    // 菜单项
    private static String[] menus = {"新增电影", "查看电影", "放映设置", "影票销售", "退出系统"};



    public static void main(String[] args) {

        Cinema cinema = new Cinema();

        // 初始化电影院数据
        cinema.initCinemaData();

        System.out.println("欢迎进入影院售票系统！");


        while(true) {
            int ins = displayMenu();
            switch(ins) {
                case 1:  // 新增电影
                    cinema.addNewMovie(sc);
                    break;

                case 2:  // 查看电影
                    cinema.queryAllMovies();
                    break;

                case 3:  // 放映设置
                    cinema.setupPlayMovie(sc);
                    break;

                case 4:  // 影票销售
                    cinema.filmSales(sc);
                    break;

                case 5:  // 退出系统
                    System.out.println("谢谢使用！再见！");
                    System.exit(0);
                    break;

                default:
                    break;
            }
        }

    }




    /**
     * 显示菜单
     * @return
     */
    private static int displayMenu() {

        System.out.println("---------------------------------------------");

        for (int i=0; i<menus.length; i++) {
            System.out.println((i+1) + "." + menus[i]);
        }

        System.out.println("---------------------------------------------");

        System.out.print("请选择输入：");
        int ins = sc.nextInt();

        return ins;
    }

}
