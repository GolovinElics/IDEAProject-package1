import java.util.Scanner;

//学生类
class Student{
    public String name;
    public String gender;
    public int ability = 0;
    public Student(String name,String gender,int ability){
        this.name = name;
        this.gender = gender;
        this.ability = ability;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getGender(){
        return gender;
    }
    public void setGender(){
        this.gender = gender;
    }
    public int getAbility(){
        return ability;
    }
    public void setAbility(){
        this.ability = ability;
    }

    //阅读记录，根据书本价值增加学生能力值
 //   public  void readbook(){
        //能力值多次叠加
  //      ability = ability +  ;
   // }

    //输出学生信息
    public void studentinfo(){
        //先从 Data 类中获取包含着数据的学生数组，赋值给一个新建数组进行保存
        Data xx = new Data();
        Student[] ss = new Student[3];
        ss[0] = xx.s1;
        ss[1] = xx.s2;
        ss[2] = xx.s3;
        int n = 0;
        while(n < 3){
            System.out.print(ss[n].getName()+" ");
            System.out.print(ss[n].getGender()+" ");
            System.out.println(ss[n].getAbility());
            n++;
        }
    }
}

//书籍类
class Book{
    public String BookName;
    public String author;
    public String type;
    public int worth;

    public Book(String BookName, String author, String type, int worth) {
        this.BookName = BookName;
        this.author = author;
        this.type = type;
        this.worth = worth;
    }
    public String getBookName() {
        return BookName;
    }
    public void setBookName(String BookName) {
        this.BookName = BookName;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public int getWorth() {
        return worth;
    }
    public void setWorth(int worth) {
        this.worth = worth;
    }
    public void bookinfo(){
        //先从 Data 类中获取包含着数据的书本数组，赋值给一个新建数组进行保存
        Data xx = new Data();
        Book[] bb = new Book[10];
        bb[0] = xx.b1;
        bb[1] = xx.b2;
        bb[2] = xx.b3;
        bb[3] = xx.b4;
        bb[4] = xx.b5;
        bb[5] = xx.b6;
        bb[6] = xx.b7;
        bb[7] = xx.b8;
        bb[8] = xx.b9;
        bb[9] = xx.b10;
        int i = 0;
        while(i < 10){
            System.out.print(bb[i].getBookName()+" ");
            System.out.print(bb[i].getAuthor()+" ");
            System.out.print(bb[i].getType()+" ");
            System.out.println(bb[i].getWorth());
            i++;
        }
    }
}

//数据类
class Data {
    //学生信息：
    static Student[] student = new Student[3];
    //创建3个学生对象
    Student s1 = new Student("弟弟三          ", "男         ", 0);
    Student s2 = new Student("李倒数          ", "男         ", 0);
    Student s3 = new Student("连连看          ", "女         ", 0);
    //书籍信息：
    Book[] books = new Book[10];
    //创建10本书籍信息：
    Book b1 = new Book("《漂亮》                    ", "拉拉    ", "     文学", 12);
    Book b2 = new Book("《大道朝天》                ", "猫腻    ", "     小说", 17);
    Book b3 = new Book("《龙族》                    ", "江南    ", "     小说", 10);
    Book b4 = new Book("《那些年我们一起追过的女孩》 ", "九把刀  ", "     小说", 15);
    Book b5 = new Book("《人间词话》                ", "周啊啊  ", "     文学", 7);
    Book b6 = new Book("《论语》                    ", "孔子    ", "     文学", 9);
    Book b7 = new Book("《文化苦旅》                ", "余秋雨  ", "     文学", 22);
    Book b8 = new Book("《斗破苍穹》                ", "天蚕土豆", "     小说", 5);
    Book b9 = new Book("《斗罗大陆》                ", "唐家三少", "     小说", 19);
    Book b10 = new Book("《没得了》                 ", " 水水水  ", "     文学", 11);
}

class Test {
    static int Num;
    public static void main(String[] args) {
        //显示学生的信息
        System.out.println("---------------------------------------------------------");
        System.out.println("学生初始信息如下：");
        Student bbb = new Student("","",0);
        bbb.studentinfo();
        //输出所有书本信息
        System.out.println("---------------------------------------------------------");
        System.out.println("书籍初始信息如下：");
        Book aaa = new Book("", "", "", 0);
        aaa.bookinfo();
        System.out.println("--------------------------------------------------------");

        //使用控制台输入来供用户选择想阅读哪本书，调用readbook类函数：
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("请选择你想阅读的书：");
        Num = sc.nextInt();
        switch (Num) {
            case 1:
                System.out.println();
                break;
            case 2:
                System.out.println();
                break;
            case 3:
                System.out.println();
            case 4:
                System.out.println();
            case 5:
                System.out.println();
            case 6:
                System.out.println();
            case 7:
                System.out.println();
            case 8:
                System.out.println();
            case 9:
                System.out.println();
            case 10:
                System.out.println();
                break;
            default:
                System.out.println("请重新选择。");
        }
    }
}