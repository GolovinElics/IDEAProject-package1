public abstract class AbstractVehicle {

    /**
     * 启动
     */
    void start() {}

    /**
     * 停车
     */
    abstract void stop();

    /**
     * 加速
     * @param speed
     */
    abstract void speedUp(int speed);

    /**
     * 获取当前速度
     * @return
     */
    abstract int getSpeed();

}