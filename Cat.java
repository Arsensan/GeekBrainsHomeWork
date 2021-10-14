package GeekBrainsLessons;

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
    }

    public String getName() {
        return name;
    }

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
