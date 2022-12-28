import if_tool.Toll;

public class Drum implements Toll{
    double size = 14;
    String name ;

    public Drum(String name,double size ) {
        this.name = name;
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.printf(KEY +"\nИнструмент: %s\nДиаметр: %s\n",name,size);

    }
}
