package model;
/**
 * @Author: Junze
 * @Date: Create in 15:30 2017/6/2
 * @Description:
 */
public class TeTest2 {

    private Integer id;
    private String name;
    private Integer age;
    private Integer sal;
    private Integer bonus;
    private Integer dept;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setBonus(Integer bonus) {
        this.bonus = bonus;
    }

    public String getName() {
        return name;
    }

    public void setName(String workerName) {
        System.out.println("set");
        this.name = workerName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getSal() {
        return sal;
    }

    public void setSal(Integer sal) {
        this.sal = sal;
    }

    public Integer getBonus() {
        return bonus;
    }

    public Integer getDept() {
        return dept;
    }

    public void setDept(Integer dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "TeTest2{" +
                "workerName='" + name + '\'' +
                ", age=" + age +
                ", sal=" + sal +
                ", bonus=" + bonus +
                ", dept=" + dept +
                '}';
    }
}
