/**
 * Product: Pugongying meeting service solution<br/>
 * Module : FIXME: <should be your maven project name><br/>
 * Date: 2018Äê7ÔÂ3ÈÕ<br/>
 * Author: zhuang<br/>
 * (C) Copyright 2018,Pugongying Meeting Service Company, All Rights Reserved. This software is the
 * proprietary information of Pugongying Meeting Service, Inc. Use is subject to license terms.
 */
package p1.entrustAdapter;

public class PrintBanner extends Print {

  private Banner banner;

  /**
   *
   */
  public PrintBanner(String name) {
    this.banner = new Banner(name);
  }

  /**
   * @see p1.entrustAdapter.Print#printStrong()
   */
  @Override
  public void printStrong() {
    banner.showWithAster();

  }

  /**
   * @see p1.entrustAdapter.Print#printWeak()
   */
  @Override
  public void printWeak() {
    banner.showWithParen();
  }

}
