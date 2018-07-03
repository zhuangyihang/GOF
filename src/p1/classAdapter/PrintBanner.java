/**
 * Product: Pugongying meeting service solution<br/>
 * Module : FIXME: <should be your maven project name><br/>
 * Date: 2018Äê7ÔÂ3ÈÕ<br/>
 * Author: zhuang<br/>
 * (C) Copyright 2018,Pugongying Meeting Service Company, All Rights Reserved. This software is the
 * proprietary information of Pugongying Meeting Service, Inc. Use is subject to license terms.
 */
package p1.classAdapter;

public class PrintBanner extends Banner implements Print {
  /**
   * @param name
   */
  public PrintBanner(String name) {
    super(name);
    // TODO Auto-generated constructor stub
  }

  /**
   * @see p1.classAdapter.Print#printStrong()
   */
  @Override
  public void printStrong() {
    showWithAster();

  }

  /**
   * @see p1.classAdapter.Print#printWeak()
   */
  @Override
  public void printWeak() {
    showWithParen();
  }

}
