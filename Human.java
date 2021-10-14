package GeekBrainsLessons;

public class Human implements Sportsmans {
    private String name;
    private int jumpDistance;
    private int runDistance;
    private String participant = Participant.HUMAN.toString();

    public Human(String name, int jumpDistance, int runDistance) {
        this.name = name;
        this.jumpDistance = jumpDistance;
        this.runDistance = runDistance;
    }

    public int getJumpDistance() {
        return jumpDistance;
    }

    public int getRunDistance() {
        return runDistance;
    }

    public String getName() {
        return name;
    }

    public int Run (){
        System.out.printf("%s %s может пробежать %s km" + "\n",participant, name, runDistance);
        return runDistance;
    }
    public int Jump(){
        System.out.printf("%s %s может подпрыгнуть на %s m" + "\n",participant, name, jumpDistance);
        return jumpDistance;
    }
}

