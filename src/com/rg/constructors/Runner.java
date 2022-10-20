package com.rg.constructors;

public class Runner {

  public static void main(String[] args) {
    // DataType variableName = value
    Person reuben = new Person("Reuben", 43, 13); // new person object

    Person sophie = new Person("Sophie", 37, 6); // new person object

    Person leon = new Person("Leon", 43, 9);

    System.out.println(reuben.name);
    System.out.println(reuben.age);
    System.out.println(reuben.shoeSize);
    System.out.println();
    System.out.println(sophie.name);
    System.out.println(sophie.age);
    System.out.println(sophie.shoeSize);
    System.out.println(leon.name);
    System.out.println(leon.age);
    System.out.println(leon.shoeSize);

  }

}
