/**
 * Product: Pugongying meeting service solution<br/>
 * Module : FIXME: <should be your maven project name><br/>
 * Date: 2018Äê7ÔÂ3ÈÕ<br/>
 * Author: zhuang<br/>
 * (C) Copyright 2018,Pugongying Meeting Service Company, All Rights Reserved. This software is the
 * proprietary information of Pugongying Meeting Service, Inc. Use is subject to license terms.
 */
package p2.templateMethod;

public abstract class AbstractDisplay {

  public abstract void close();

  public final void display() {
    open();
    print();
    print();
    close();
  }

  public abstract void open();

  public abstract void print();
}
