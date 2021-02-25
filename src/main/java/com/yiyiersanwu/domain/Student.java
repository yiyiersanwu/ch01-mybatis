package com.yiyiersanwu.domain;

/**
 * @author 何心想
 * @Description: 作用： 测试mybatis  推荐和表一致容易记忆
 * @Date 2021/2/22 18:18
 */
public class Student {
    //定义属性 目前是属性名和列名一致
    private  Integer id;
    private String name;
    private String eamil;
    private Integer age;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + eamil + '\'' +
                ", age=" + age +
                '}';
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

    public String getEamil() {
        return eamil;
    }

    public void setEamil(String eamil) {
        this.eamil = eamil;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
