package inheritance.polimorphism.secondTaskThree;

class Info {
    int id;
    String text;

    public Info(int id, String text) {
        this.id = id;
        this.text = text;
    }

    public boolean textContains (String word){
        return text.contains(word);
    }

    public int getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return "Info{" +
                "id=" + id +
                ", text='" + text + '\'' +
                '}';
    }
}
