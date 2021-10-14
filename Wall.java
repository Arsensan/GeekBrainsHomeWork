package GeekBrainsLessons;

public class Wall implements Tasks {
    private int high ;

    public Wall(int high) {
        this.high = high;
    }

    public int getHigh() {
        return high;
    }

    public boolean taskComplete (Sportsmans sportsmans) {
        System.out.printf("Высота стенки %d м " + "\n", high);
        if (high < sportsmans.Jump()) {
            System.out.println("Участник перепрыгнул стенку");
            return  true;
        }else
            System.out.println("Участник не смог перепрыгнуть стенку");
        return false;
    }
    }

