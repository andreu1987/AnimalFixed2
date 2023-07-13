package animal;

public abstract class  Animal {
    private String name; // имя
    private int age; //возраст
    private int weight; // вес
    private String color; //цвет


    public void say(){
        System.out.println("Я говорю");

    }
    public void go(){
        System.out.println("Я иду");
    }
    public void drink(){
        System.out.println("Я пью");
    }
    public void eat(){
        System.out.println("Я ем");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {

        return weight;
    }

    public void setWeight(int weight) {

        this.weight = weight;
    }

    public String getColor() {

        return color;
    }

    public void setColor(String color) {

        this.color= color;
    }

    @Override
    public String toString(){
        return String.format("Привет! меня зовут %s, мне %s, я вешу - %d кг, мой цвет - %s.",
                getName(),getAgeLet(), getWeight(),getColor());
    }

    private String getAgeLet (){
        int ostatok = getAge() % 10;

        if (getAge() ==0){
            return "младенец";
        }

        if (ostatok >=5 || getAge() >= 11 && getAge() <=14) {
            return getAge() + " лет";
        }
        if (ostatok == 1){
            return getAge() + " год";
        }
        if (ostatok >=2) {
            return getAge() + " года";
        }
        return " лет";
    }

}


