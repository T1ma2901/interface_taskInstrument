import if_tool.Toll;

public class Pipe implements Toll{
    double diameter ;
    String name;


    public Pipe(String name,double diameter) {
        this.diameter = diameter;
        this.name = name;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.printf(KEY +"\nИнструмент: %s\nДиаметр: %s\n",name,diameter);

    }
}
