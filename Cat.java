package GeekBrainsLessons;

public class Cat {
    private String name;
    private int appetite;
    private int hungry;

    public Cat(String name, int appetite, int hungry) {
        this.name = name;
        this.appetite = appetite;
        this.hungry = hungry;
    }

    public String getName() {
        return name;
    }

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
    }
}

