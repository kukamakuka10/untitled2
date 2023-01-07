package TestClass.test1;

public class Person {
    public Person()
    {
        name="Undefined";
        age=0;
    }
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    private int age;

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
}
