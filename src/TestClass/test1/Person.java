package TestClass.test1;

public class Person extends Human {
    private String name;
    private int age;
    private int id;
    static private int counter=0;
    public Person()
    {
        id=++counter;
        name="Undefined";
        age=0;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setAge(int age) {
        if (age>=0)
        {
            this.age = age;
        }
        else
        {
            System.out.println("Not correct age");
        }
    }
    public int getAge() {
        return age;
    }
    protected void displayInfo(){
        System.out.println("Name - "+name+"    "+"Age - "+age);
    }

    @Override
    public void say(){
        System.out.println("Hello, I`m HUMAN");
    }
}
