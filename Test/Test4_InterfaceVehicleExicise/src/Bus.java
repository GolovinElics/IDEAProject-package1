public class Bus implements Vehicle {

    // 当前速度
    private int speed = 0;

    @Override
    public void start() {
        System.out.println("启动 公交车...");
    }

    @Override
    public void stop() {
        System.out.println("停止 公交车...");
    }

    @Override
    public void speedUp(int inputSpeed) {
        System.out.println("公交车的速度是:" + inputSpeed);
        this.speed = inputSpeed;
    }

    @Override
    public int getSpeed() {
        return this.speed;
    }

}