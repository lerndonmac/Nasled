public abstract class Animal implements Voice,Eat,Drive {
    private int age;
    private int weight;
    private String name;

    public Animal(){}
    public Animal(int age, int weight, String name){
        this.age = age;
        this.weight = weight;
        this.name = name;
    }
    public int getAge() {return age;}
    public void setAge(int age) {this.age = age;}
    public int getWeight() {return weight;}
    public void setWeight(int weight) {this.weight = weight;}
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
}
