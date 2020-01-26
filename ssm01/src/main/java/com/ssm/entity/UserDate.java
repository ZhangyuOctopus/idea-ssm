package com.ssm.entity;
import java.io.Serializable;
import java.util.Date;
public class UserDate implements Serializable {
    //在User类的基础上添加一个Date属性来模拟自定义类型转换器
    private String name;
    private  Integer age;
    private Date date;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "UserDate{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", date=" + date +
                '}';
    }
}