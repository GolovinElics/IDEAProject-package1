public class Car extends AbstractVehicle{

    private int speed;

    public void start(){
        System.out.println("启动 汽车...");
    }

    @Override
    public void stop() {
        System.out.println("停止 汽车...");
    }

    @Override
    public void speedUp(int speed) {
        this.speed=speed;
        System.out.println("汽车的速度是:"+this.speed);

    }

    @Override
    public int getSpeed() {
        return this.speed;
    }
}