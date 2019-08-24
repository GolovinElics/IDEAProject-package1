public class AbstractVehicleTest {

    public static void main(String[] args) {
        // 创建汽车实例对象
        Car car=new Car();
        car.start();
        car.stop();
        car.speedUp(140);
        int carSpeed = car.getSpeed();
        System.out.println("当前汽车的速度是:" + carSpeed);

        //创建公交车实例对象
        Bus bus=new Bus();
        bus.start();
        bus.stop();
        bus.speedUp(100);
        int busSpeed = bus.getSpeed();
        System.out.println("当前的公交车的速度是:" + busSpeed);
    }
}