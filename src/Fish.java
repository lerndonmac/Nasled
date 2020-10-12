public class Fish extends Animal {
    String arial;

    public Fish(){}
    public Fish(int age ,int weight ,String name ,String arial){
        super(age, weight, name);
        this.arial = arial;
    }
    public void setArial(String arial){ this.arial = arial;}
    public String getArial (){return arial;}
    @Override
    public String voice (){return " haven't voice ";}
    @Override
    public String eat (){return " eat whats eat fish ";}
    @Override
    public String drive(){return " move by swiming ";}

    @Override
    public String toString() {
        return "Fish name:"+ super.getName()+
                " arial=" + arial +
                " weight: "+ super.getWeight()+
                " age:"+super.getAge()
                +drive()+eat()+voice();
    }
}