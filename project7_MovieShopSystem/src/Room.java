public class Room {

    private int number;  // 放映室编号
    private Movie movie; // 放映的电影
    private String time; // 电影放映时间
    private int[] seats; // 座位


    public Room() {

    }

    public Room(int number) {
        this.number = number;
    }

    public Room(Movie movie, String time) {
        this.movie = movie;
        this.time = time;
    }



    /**
     * 初始化座位
     * @param seatNumber
     */
    public void initSeat(int seatNumber) {
        seats = new int[seatNumber];
        for (int i=0; i<seats.length; i++) {
            seats[i] = i+1;
        }
    }



    /**
     * 显示座位表
     */
    public void displaySeatTable() {
        for (int i : seats) {

            if (i == -1) {
                System.out.print("无\t");

            }else {
                System.out.print(i + "\t");

            }

            if (i%7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }



    /**
     *  设置座位状态
     * @param seatNumber 座位号
     */
    public void setSeatStatus(int seatNumber) {
        seats[seatNumber - 1] = -1;
    }



    /**
     * 统计剩余座位数量
     * @return
     */
    public int seatNumber() {
        int count = 0;

        for (int seat : seats) {
            if (seat != -1) {
                count++;
            }
        }

        return count;
    }


    /**
     * 显示放映室信息
     */
    public void displayRoomInfo() {
        System.out.printf("%-20s", number);
        System.out.printf("%-20s", movie.getName());
        System.out.printf("%-20s", time);
        System.out.printf("%-20s", seats.length);
        System.out.println();
    }




    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public Movie getMovie() {
        return movie;
    }
    public void setMovie(Movie movie) {
        this.movie = movie;
    }
    public String getTime() {
        return time;
    }
    public void setTime(String time) {
        this.time = time;
    }
    public int[] getSeats() {
        return seats;
    }
}
