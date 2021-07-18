package Fox;

public class Proma {
    String name;
    Float weight;
    Float height;

    public Proma(Float weight , Float height ){
        this.weight = weight;
        this.height = height;
    }
    public Proma(String name , Float weight , Float height ){
        this(weight,height);
        this.name = name;
    }
    public Float bmi(){
        Float bmi = weight / (height*height);
        return bmi;

    }

    public void Hello(){
        System.out.println("Hello World");


    }
}

