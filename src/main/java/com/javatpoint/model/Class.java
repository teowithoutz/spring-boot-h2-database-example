package com.javatpoint.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
//mark class as an Entity
@Entity
//defining class name as Table name
@Table
public class Class
{
    //mark id as primary key
    @Id
//defining id as column name
    @Column
    private int id;
    //defining name as column name
    @Column
    private String className;
    //defining age as column name

    public void setId(int id)
    {
        this.id = id;
    }
    public String getClassName()
    {
        return className;
    }
    public void setClassName(String className)
    {
        this.className = className;
    }

}