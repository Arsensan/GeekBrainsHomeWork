package GeekBrainsLessons;

public enum Participant {
    CAT("Котик"),HUMAN("Человек"),ROBOT("Робот");
   private String translation;

    Participant(String translation) {
        this.translation = translation;
    }

    public String getTranslation() {
        return translation;
    }
    public String toString(){
        return translation;
    }
}
