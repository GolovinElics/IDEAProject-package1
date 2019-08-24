import java.util.Scanner;
public class Computer {
    String Model = "HP1";
    double Electric = 100;
    double AbilityChange;
    double EnergyChange;
    double UpAbility = 5;
    double DownEnergy = 5;
    double DownElictric = 10;

    public void JavaProgram(){
        Student s1 = new Student();
        //累加累键的动态变量
        AbilityChange = s1.Ability;
        EnergyChange = s1.Energy;
        double ElectricChange = Electric;

        int x = 10;
        while(true){
            Scanner sc = new Scanner(System.in);
            System.out.println("需要继续你的编程学习吗【Y/N】? 你现在还有有"+x+"次机会，请合理使用！");

            String order = sc.next();
            if(order.equals("Y")){
                ElectricChange = ElectricChange - DownElictric;
                AbilityChange = AbilityChange + UpAbility;
                EnergyChange = EnergyChange - DownEnergy;
                System.out.println("在电脑 "+Model+" 号上进行了编程，编程能力值 +"+UpAbility+",活力值 -"+DownEnergy+" 电脑电量 -"+DownElictric);
                System.out.println("目前的编程能力为："+AbilityChange);
                System.out.println("目前的精力值为："+EnergyChange);
                System.out.println("电脑 "+Model+" 号剩余电量为："+ElectricChange);
                x--;
                System.out.println(Test.NameTemp+" 你完成了一次学习，请继续努力！");
            }
            if(order.equals("N")){
                System.out.println("学海无涯苦作舟，请继续努力！");
                break;
            }
        }
    }

}
