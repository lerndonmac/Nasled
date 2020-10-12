public class Bird extends Animal{
    String season;

    public Bird(){}
    public Bird(int age, int weight, String name,String season) {
        super(age, weight, name);
        this.season = season;
    }
    public String getSeason() {return season;}
    public void setSeason(String season) {this.season = season;}
    @Override
    public String drive() {return " by Fly ";}
    @Override
    public String eat() {return " eat seeds ";}
    @Override
    public String voice() {return " voice is surfin' bird ";}
    @Override
    public String toString() {
        return "Bird name:"+ super.getName()+
                " Season:" + season +
                " weight :"+ super.getWeight()+
                " age:"+super.getAge()
                +drive()+eat()+voice();
    }
}
