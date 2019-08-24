public class Student {
    String name_in;
    double WisdomNew;
    double EnergyNew;
    double Wisdom = 100;
    double Energy = 100;
    double UpWisdom = 5;
    double DownEnergy = 10;
    double Ability = 10;
    public String study(String name){
        System.out.println(name+" 你进行了学习，智慧值 +"+UpWisdom+" 活力值 -"+DownEnergy);
        WisdomNew = Wisdom + UpWisdom;
        EnergyNew = Energy - DownEnergy;
        System.out.println("目前的智力值为："+WisdomNew);
        System.out.println("目前的活力值为："+EnergyNew);
        System.out.println("目前的编程能力为："+Ability);
        return name_in = name;
    }
}