package practice06;

public class Teacher extends Person {

  private String name;
  private int age;
  private int klass;

  public Teacher(String name, int age) {
    super(name, age);
    this.name = name;
    this.age = age;
    this.klass = -1;
  }

  public Teacher(String name, int age, int klass) {
    super(name, age);
    this.name = name;
    this.age = age;
    this.klass = klass;
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

  public int getKlass() {
    return klass;
  }

  public void setKlass(int klass) {
    this.klass = klass;
  }

  public String introduce() {
    return super.introduce() + " I am a Teacher. I teach" +
        (this.klass == -1 ? " No Class" : " Class " + this.klass)
        + ".";
  }
}
