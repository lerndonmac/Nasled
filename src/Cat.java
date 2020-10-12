public class Cat extends Animal{
    String colorFur;

    public Cat(){}
    public Cat(int age, int weight, String name, String colorFur) {
        super(age, weight, name);
        this.colorFur = colorFur;
    }
    public String getColorFur() {
        return colorFur;
    }
    public void setColorFur(String colorFur) {this.colorFur = colorFur;}
    @Override
    public String drive() {return " move by running ";}
    @Override
    public String eat() {return " eat a meat ";}
    @Override
    public String voice() {return " voice is meow ";}
    public String toString(){
        return "Cat name:"+ super.getName()+
                " Color of Fur:" + colorFur +
                " weight :"+ super.getWeight()+
                " age:"+super.getAge()
                +drive()+eat()+voice();
    }
}
