public interface Vehicle {

    /**
     * 启动
     */
    void start();

    /**
     * 停车
     */
    void stop();

    /**
     * 加速
     * @param speed
     */
    void speedUp(int speed);

    /**
     * 获取当前速度
     * @return
     */
    int getSpeed();
}