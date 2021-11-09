package GeekBrainsLessons;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int n) {
        food -= n;
    }


    public void info() {
        if (food > 0)
            System.out.println("plate: " + food);
        else {
            System.out.println("В миске мало еды для котов.");
        }
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

        }


