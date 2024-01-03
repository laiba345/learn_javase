package com.jdbc.datasource;

import java.util.Date;

/**
 * ClassName: Actor
 * Package: com.jdbc.datasource
 * Description:
 *
 * @Author Null_jun
 * @Create 2024/1/3 10:48
 * @Version 1.0
 * Actor 对象与 actor表的记录进行对应;
 */
public class Actor { // JavaBean
    private Integer id;
    private String name;
    private String sex;
    private Date borndate;
    private String phone;

    public Actor() { // 一定要给一个无参构造器,反射需要

    }

    public Actor(Integer id, String name, String sex, Date borndate, String phone) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.borndate = borndate;
        this.phone = phone;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBorndate() {
        return borndate;
    }

    public void setBorndate(Date borndate) {
        this.borndate = borndate;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", borndate=" + borndate +
                ", phone='" + phone + '\'' +
                '}';
    }
}
