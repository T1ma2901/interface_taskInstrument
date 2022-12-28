import if_tool.Toll;

public class Guitar implements Toll{
    int numberStrings = 6;
    String name;

    public Guitar(String name,int numberStrings ) {
        this.name = name;
        this.numberStrings = numberStrings;
    }

    public int getNumberStrings() {
        return numberStrings;
    }

    public void setNumberStrings(int numberStrings) {
        this.numberStrings = numberStrings;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.printf(KEY +"\nИнструмент: %s\nДиаметр: %s\n",name,numberStrings);
    }
}
