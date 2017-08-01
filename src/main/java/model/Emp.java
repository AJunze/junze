package model;

/**
 * @Author: Junze
 * @Date: Create in 14:05 2017/6/5
 * @Description:
 */
public class Emp {
    private Integer id;
    private String name;
    private Integer sal;
    private String sex;

    public Emp() {
    }

    public Emp(Integer id, String name, Integer sal, String sex) {
        this.id = id;
        this.name = name;
        this.sal = sal;
        this.sex = sex;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSal() {
        return sal;
    }

    public void setSal(Integer sal) {
        this.sal = sal;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sal=" + sal +
                ", sex='" + sex + '\'' +
                '}';
    }
}
