public class Bus extends AbstractVehicle{

    private int speed;

    public void start(){
        System.out.println("启动公交车...");
    }

    @Override
    public void stop() {
        System.out.println("停止公交车...");
    }

    @Override
    public void speedUp(int speed) {
        this.speed=speed;
        System.out.println("公交车的速度是:"+this.speed);

    }

    @Override
    public int getSpeed() {
        return this.speed;
    }
}