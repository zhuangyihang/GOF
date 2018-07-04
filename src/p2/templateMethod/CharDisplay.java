/**
 * Product: Pugongying meeting service solution<br/>
 * Module : FIXME: <should be your maven project name><br/>
 * Date: 2018Äê7ÔÂ3ÈÕ<br/>
 * Author: zhuang<br/>
 * (C) Copyright 2018,Pugongying Meeting Service Company, All Rights Reserved. This software is the
 * proprietary information of Pugongying Meeting Service, Inc. Use is subject to license terms.
 */
package p2.templateMethod;

public class CharDisplay extends AbstractDisplay {

  public static void main(String[] args) {
    AbstractDisplay cd = new CharDisplay("*");
    cd.display();
  }

  private String ch;

  /**
   * @param ch
   */
  public CharDisplay(String ch) {
    super();
    this.ch = ch;
  }

  /**
   * @see p2.templateMethod.AbstractDisplay#close()
   */
  @Override
  public void close() {
    System.out.println("2");

  }

  /**
   * @see p2.templateMethod.AbstractDisplay#open()
   */
  @Override
  public void open() {
    System.out.println("1");
  }

  /**
   * @see p2.templateMethod.AbstractDisplay#print()
   */
  @Override
  public void print() {
    System.out.println(ch);

  }

}
