package GeekBrainsLessons;

public class Animals {
int runDistance;
int swimDistance;
String name;

    public Animals (int runDistance, int swimDistance, String name){
      this.runDistance=runDistance;
      this.name = name;
      this.swimDistance = swimDistance;
    }

    public void run (){
        System.out.println(name + " пробежал " +runDistance + " м.");
    }
    public void swim(){
        System.out.println(name + " проплыл " +swimDistance + " м.");
    }

}
