import java.util.Scanner;

public class Test {
    static String NameTemp;

    public static void main(String[] args) {
        Student s1 = new Student();
        Computer c1 = new Computer();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的名字：");
        String name = sc.nextLine();
        NameTemp = name;
        s1.study(name);
        c1.JavaProgram();
    }
}
