import java.util.Scanner;

public class Cinema {

    private Movie[] movies;  // 电影
    private Room[] rooms;    // 放映室


    /**
     * 初始化电影院数据
     */
    public void initCinemaData() {
        movies = new Movie[20];
        rooms = new Room[3];

        rooms[0] = new Room(1);
        rooms[0].initSeat(28);
        rooms[1] = new Room(2);
        rooms[1].initSeat(30);
        rooms[2] = new Room(3);
        rooms[2].initSeat(28);
    }



    /**
     * 添加新电影
     */
    public void addNewMovie(Scanner sc) {
        // 计算实际电影数量
        int count = 0;
        for (Movie movie : movies) {
            if (movie != null) {
                count++;
            }
        }


        if (count == movies.length) {
            System.out.println("电影数量达到上限，无法添加新电影！");
            return;

        }


        String name = null;
        while(true) {
            System.out.print("输入电影的名称:");
            name = sc.next();

            // 判断该电影是否已经存在
            for (Movie movie : movies) {
                if (movie != null && movie.getName().equals(name)) {
                    System.out.println("该影片已存在，请重新输入！");
                    name = null;
                    break;
                }
            }

            if (name != null) {
                break;
            }
        }


        System.out.print("输入电影的类型:");
        String type = sc.next();

        System.out.print("输入电影的主演:");
        String starring = sc.next();

        System.out.print("输入电影的价格:");
        double price = sc.nextDouble();

        // 添加电影
        for (int i=0; i<movies.length; i++) {
            if (movies[i] == null) {
                movies[i] = new Movie(name, type, starring, price);
                break;
            }
        }


        while(true) {
            System.out.print("输入r返回主菜单:");
            String ins = sc.next();
            if ("r".equals(ins)) {
                break;
            }
        }

    }



    /**
     * 查询所有电影
     */
    public void queryAllMovies() {
        System.out.printf("%-40s", "电影名称");
        System.out.printf("%-40s", "\t电影类型");
        System.out.printf("%-40s", "\t电影主演");
        System.out.printf("%-40s", "\t电影价格");
        System.out.println();


        for (Movie movie : movies) {
            if (movie != null) {
                movie.displayMovieInfo();
            }
        }
    }



    /**
     * 用电影名称查询电影
     * @param name
     * @return
     */
    public Movie queryMovie(String name) {
        Movie movie = null;

        for (Movie m : movies) {
            if (m != null&& m.getName().equals(name)) {
                movie = m;
                break;
            }
        }

        return movie;
    }



    /**
     * 设置放映室播放影片
     * @param sc
     */
    public void setupPlayMovie(Scanner sc) {

        // 计算正在使用的放映室数量
        int count = 0;
        for (Room room : rooms) {
            if (room.getMovie() != null) {
                count++;
            }
        }


        if (count == rooms.length) {
            System.out.println("放映室正在全部使用，无法使用更多放映室！");
            return;

        }


        System.out.println("放映室设置播放影片");

        // 检索放映室，放映室是否可使用
        int number = 0;
        while (true) {
            System.out.print("请输入放映室编号：");
            number = sc.nextInt();

            // 判断放映室是否存在
            if (number <= 0 || number > rooms.length) {
                System.out.print("该放映室不存在，剩余影院编号：");
                for (int i=0; i<rooms.length; i++) {
                    if (rooms[i].getMovie() == null) {
                        System.out.print(rooms[i].getNumber() + "  ");
                    }
                }
                System.out.println();
                continue;
            }


            // 判断该放映室是否正在使用
            if (rooms[number - 1].getMovie() != null) {
                System.out.print("该放映室正在使用，剩余影院编号：");
                for (int i=0; i<rooms.length; i++) {
                    if (rooms[i].getMovie() == null) {
                        System.out.print(rooms[i].getNumber()  + "  ");
                    }
                }
                System.out.println();
                continue;
            }

            break;
        }


        // 检索影片，影片是否存在
        Movie movie = null;
        while (true) {
            System.out.print("请输入放映影片的名称：");
            String name = sc.next();

            movie = queryMovie(name);
            if (movie == null) {
                // 该电影院没有该影片
                System.out.println("该电影院不能播放  " + name + "，请重新输入！");
                continue;
            }
            break;
        }


        System.out.print("请输入影片放映的时间：");
        String time = sc.next();

        // 设置放映室
        rooms[number - 1].setMovie(movie);
        rooms[number - 1].setTime(time);


        while(true) {
            System.out.print("输入r返回主菜单:");
            String ins = sc.next();
            if ("r".equals(ins)) {
                break;
            }
        }
    }



    /**
     * 统计放映室信息
     */
    public void statisticalRoomInfo() {

        for (Room room : rooms) {
            if (room.getMovie() != null) {
                room.displayRoomInfo();
            }
        }
    }



    /**
     * 卖票
     */
    public void filmSales(Scanner sc) {

        System.out.println("电影院放映信息如下：");
        statisticalRoomInfo();

        int number = 0;
        while(true) {
            System.out.println("请输入要观看的放映室编号：");
            number = sc.nextInt();

            if (rooms[number - 1].seatNumber() == 0) {
                System.out.println("该放映室没有座位了！");
                return;
            }


            if (rooms[number - 1].getMovie() == null) {
                System.out.println("输入有误，请重新输入！");
                continue;
            }
            break;
        }


        System.out.println("号放映室的座位信息如下：");
        rooms[number - 1].displaySeatTable();


        int seatNumber = 0;
        while(true) {
            System.out.println("请选择座位：");
            seatNumber = sc.nextInt();


            // 判断选择的座位是否被卖出
            if (rooms[number - 1].getSeats()[seatNumber - 1] == -1) {
                System.out.println(seatNumber + "号座位已经被卖出，请另选一个！");
                continue;
            }

            // 判断输入是否有误
            if (seatNumber <= 0 || seatNumber > rooms[number - 1].getSeats().length) {
                System.out.println("输入有误，请重新输入！");
                continue;
            }
            break;
        }

        rooms[number - 1].setSeatStatus(seatNumber);

        System.out.println("购票成功！");
        System.out.println("打印小票，信息如下：");

        System.out.println("---------------------------------------------");

        Movie movie = rooms[number - 1].getMovie();
        Room room = rooms[number - 1];

        System.out.println("电影：" + movie.getName());
        System.out.println("价格：" + movie.getPrice());
        System.out.println("放映室编号" + number + "  座位号:" + seatNumber);
        System.out.println("放映时间：" + room.getTime());

        while(true) {
            System.out.print("输入r返回主菜单:");
            String ins = sc.next();
            if ("r".equals(ins)) {
                break;
            }
        }

    }





    public Movie[] getMovies() {
        return movies;
    }
    public Room[] getRoom() {
        return rooms;
    }
}
