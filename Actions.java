package GeekBrainsLessons;

public enum Actions {
    RUN("Пробежал"),JUMP("Перепрыгнул");
    private String translation;

    Actions(String translation) {
        this.translation = translation;
    }

    public String getTranslation() {
        return translation;
    }
    public String toString(){
        return translation;
    }
}
