package com.rg.constructors;

public class Person {

  public String name;
  public int age;
  public int shoeSize;

  public Person(String name, int age, int shoeSize) {
    this.name = name;
    this.age = age;
    this.shoeSize = shoeSize;
  }

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }
//Explain - Overload
}
