package GeekBrainsLessons;

public class RunRoad implements Tasks {
    private int roadDistance;

    public RunRoad(int roadDistance) {
        this.roadDistance = roadDistance;
    }

    public int getRoadDistance() {
        return roadDistance;
    }

    public boolean taskComplete (Sportsmans sportsmans) {
        System.out.printf("Длина дорожки %d км " + "\n", roadDistance);
        if (roadDistance < sportsmans.Run()) {
            System.out.println("Участник пробежал дитанцию");
            return  true;
        }else
            System.out.println("Участник не смог пробежать дистанцию");
        return false;
    }
}
