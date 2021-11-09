package GeekBrainsLessons;

public class Robot implements Sportsmans {
    private String name;
    private int jumpDistance ;
    private int RunDistance ;
    private String participant = Participant.ROBOT.toString();

    public Robot(String name, int jumpDistance, int runDistance) {
        this.name = name;
        this.jumpDistance = jumpDistance;
        RunDistance = runDistance;
    }

    public int getJumpDistance() {
        return jumpDistance;
    }

    public int getRunDistance() {
        return RunDistance;
    }

    public String getName() {
        return name;
    }

    public int Run (){
        System.out.printf("%s %s может пробежать %s km" + "\n",participant, name, RunDistance);
        return RunDistance;
    }
    public int Jump(){
        System.out.printf("%s %s может подпрыгнуть на %s m" +"\n",participant, name, jumpDistance);
        return jumpDistance;
    }
}
