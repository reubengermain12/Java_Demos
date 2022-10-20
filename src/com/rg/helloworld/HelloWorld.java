package com.rg.helloworld;

public class HelloWorld {

  public static void main(String[] args) {

    String result = returnString("Original Value");
    System.out.println(result);
  }

  public static void printMessage(String myMessage) {

    System.out.println(myMessage);
  }

  public static String returnString(String myMessage) {
    return myMessage + " I've added something to this!!!";
  }

}
