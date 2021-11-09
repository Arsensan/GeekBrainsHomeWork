package GeekBrainsLessons;

JavaLeveL2.Homework1
public class Cat implements Sportsmans {
    private String name;
    private int jumpDistance ;
    private int runDistance;
    private String participant = Participant.CAT.toString();

    public Cat(String name, int jumpDistance, int runDistance) {
        this.name = name;
        this.jumpDistance = jumpDistance;
        this.runDistance = runDistance;
    }

    public int getJumpDistance() {
        return jumpDistance;
=======
 СatsAndPlate
public class Cat {
    private String name;
    private int appetite;
    private int hungry;

    public Cat(String name, int appetite, int hungry) {
        this.name = name;
        this.appetite = appetite;
        this.hungry = hungry;
 Lesson-1
    }

    public String getName() {
        return name;
    }

JavaLeveL2.Homework1
    public int getRunDistance() {
        return runDistance;
    }

    public int Run (){
        System.out.printf("%s %s может пробежать %s km" + "\n",participant, name, runDistance);
        return runDistance;
    }
    public int Jump(){
        System.out.printf("%s %s может подпрыгнуть на %s m" + "\n", participant, name, jumpDistance);
        return jumpDistance;
    }
}
=======
    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public int getHungry() {
        return hungry;
    }

    public void setHungry(int hungry) {
        this.hungry = hungry;
    }

    public void eat(Plate p) {
        p.decreaseFood(appetite);
        decreseHunger(appetite);
        isNotHungry();

    }

    public boolean isNotHungry() {
        if (hungry <= 0) {
            System.out.println(
                    String.format("[%s] сытый", name)
            );
            return true;
        }
        return false;
    }
    public void decreseHunger(int n){
       hungry -= n;

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
 Lesson-1
    }
}

Lesson-1
