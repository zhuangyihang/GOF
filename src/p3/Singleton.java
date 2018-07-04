/**
 * Product: Pugongying meeting service solution<br/>
 * Module : FIXME: <should be your maven project name><br/>
 * Date: 2018Äê7ÔÂ4ÈÕ<br/>
 * Author: zhuang<br/>
 * (C) Copyright 2018,Pugongying Meeting Service Company, All Rights Reserved. This software is the
 * proprietary information of Pugongying Meeting Service, Inc. Use is subject to license terms.
 */
package p3;

public class Singleton {

  private static Singleton singleton = new Singleton();

  public static Singleton getInstance() {
    if (singleton == null) {
      singleton = new Singleton();
    }
    return singleton;
  }

  public static void main(String[] args) {
    Singleton sg = Singleton.getInstance();
    System.out.println(sg.hashCode());

    Singleton sg2 = Singleton.getInstance();
    System.out.println(sg2.hashCode());
  }

  private Singleton() {
    System.out.println("new instance");
  }
}
