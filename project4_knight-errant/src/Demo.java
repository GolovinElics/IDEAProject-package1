import java.util.Scanner;
//后续可以添加体力值不足的判断提醒
//添加打怪时候的图标或动态图形显示
public class Demo {
    static Scanner sc = new Scanner(System.in);

    // 先定义侠客的若干属性（攻击力、生命值、活力）
    static int attack = 5;
    static int hp = 50;
    static int energy = 100;

    public static void main(String[] args) {
        while(true) {
            // 开始游戏主体流程
            int choice = makeChoice();

            switch (choice) {
                case 1:
                    Demo.Sleep();
                    break;
                case 2:
                    Demo.popo();
                    break;
                case 3:
                    Demo.sword();
                    break;
                case 4:
                    Demo.qiaqia();
                    break;
                case 5:
                    Demo.bobo();
                    break;
                case 6:
                    Demo.dongdong();
                    break;
                default:
                    System.out.println("输入有误，请重新选择");
                    break;
            }
            System.out.println("目前属性：");
            System.out.println("攻击力："+attack);
            System.out.println("生命值："+hp);
            System.out.println("体力："+energy);
            if(energy<=0){
                Demo.Sleep();
            }else { }
        }
    }

    public static int makeChoice() {
        System.out.println("可以做这些事情：");
        System.out.println("1.睡觉");
        System.out.println("2.练拳");
        System.out.println("3.练剑");
        System.out.println("4.劈叉");
        System.out.println("5.打怪");
        System.out.println("6.打boss");
        System.out.println("请输入要选择的序号：");
        int choice = sc.nextInt();
        return choice;
    }
    //睡觉
    public static void Sleep(){
        energy = 100;
        System.out.println("睡觉中...体力恢复");
    }
    //练拳
    public static void popo(){
        attack = attack + 5;
        energy = energy - 10;
        System.out.println("练拳中...攻击力+5");
    }
    //练剑
    public static void sword(){
        attack = attack + 10;
        energy = energy - 20;
        System.out.println("练剑中...攻击力+10");
    }
    //劈叉
    public static void qiaqia(){
        hp = hp + 15;
        energy = energy - 30;
        System.out.println("劈叉中...生命值+15");
    }
    //打怪
    public static void bobo(){
        int hp3=hp;
        int attack1 = 45;
        int hp1 = 500;
        Scanner bb=new Scanner(System.in);
        System.out.println("当前也怪生命值为：500 攻击力为：45 是否攻打？【y/n】");
        String yn=bb.nextLine();
        if(yn.equals("y")) {
            energy = energy - 35;
            for (int i = 0; i < 30; i++) {
                hp3 = hp3 - 45;
                hp1 = hp1-attack;
                if(hp3<=0){
                    System.out.println("你被打死了，多训练提升你的能力吧！");
                    break;
                }
                else if(hp1<=0){
                    attack=attack+25;
                    hp=hp+30;
                    System.out.println("恭喜您打怪成功！");
                    break;
                }
                else{
                    hp3 = hp3 - 45;
                    hp1 = hp1-attack;
                }
            }

        }
        else{
            System.out.println("嘤嘤嘤，我要变强大！");
        }
    }

    //打boss
    public static void dongdong(){
        int hp3=hp;
        int attack2 = 120;
        int hp2 = 3000;
        Scanner bb=new Scanner(System.in);
        System.out.println("当前也怪生命值为：3000 攻击力为：120 是否攻打？【y/n】");
        String yn=bb.nextLine();
        if(yn.equals("y")) {
            energy = energy - 35;
            for (int i = 0; i < 30; i++) {
                hp3 = hp3 - 120;
                hp2 = hp2-attack;
                if(hp3<=0){
                    System.out.println("你被打死了，多训练提升你的能力吧！");
                    break;
                }
                else if(hp2<=0){
                    attack=attack+35;
                    hp3=hp3+50;
                    System.out.println("恭喜您打怪成功！");
                    break;
                }
                else{
                    hp3 = hp3 - 45;
                    hp2 = hp2-attack;
                }
            }

        }
        else{
            System.out.println("嘤嘤嘤，我要变强大！");
        }
    }
}