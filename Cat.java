package GeekBrainsLessons;

public class Cat extends Animals {

    public Cat(int runDistance, int swimDistance, String name) {
        super(runDistance, swimDistance, name);
    }

    @Override
    public void run() {
        if (runDistance <= 200) {
            System.out.println(name + " пробежал " + runDistance + " м.");
        } else
            System.out.println("Барсик не может пробежать больше 200м");
    }

    @Override
    public void swim() {
        if (swimDistance >= 0) {
            System.out.println("Барсик не умеет плавать");
        }
    }
}

