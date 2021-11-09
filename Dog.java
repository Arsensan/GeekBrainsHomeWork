package GeekBrainsLessons;

public class Dog extends Animals {
    public Dog(int runDistance,int swimDistance, String name) {
        super(runDistance, swimDistance, name);
    }
    @Override
    public void run() {
        if (runDistance <= 500) {
            System.out.println(name + " пробежал " + runDistance + " м.");
        } else
            System.out.println("Шарик не может пробежать больше 500м");
    }
    @Override
    public void swim() {
        if (swimDistance <= 10) {
            System.out.println(name + " проплыл " +swimDistance + " м.");
        }else
            System.out.println("Шарик не может проплыть больше 10м");
        }
}
