public class Main {

    public static void main(String[] args) {

        Robot[] robots = {new Robot(), new CoffeeRobot(), new RobotDancer(), new RobotCooker()};

        for (Robot robot : robots) {
            robot.work();
        }

    }
}

