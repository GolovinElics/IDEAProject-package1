
public class Movie {

    private String name;      // 电影名称
    private String type;      // 电影类型
    private String starring;  // 主演
    private double price;     // 价格


    public Movie(){

    }

    public Movie(String name, String type, String starring, double price) {
        this.name = name;
        this.type = type;
        this.starring = starring;
        this.price = price;
    }


    /**
     * 显示电影信息
     */
    public void displayMovieInfo() {
        System.out.printf("%-40s", name);
        System.out.printf("%-40s", "\t" + type);
        System.out.printf("%-40s", "\t" + starring);
        System.out.printf("%-40s", "\t" + price);
        System.out.println();

    }



    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getStarring() {
        return starring;
    }
    public void setStarring(String starring) {
        this.starring = starring;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }


}
