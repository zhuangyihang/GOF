/**
 * Product: Pugongying meeting service solution<br/>
 * Module : FIXME: <should be your maven project name><br/>
 * Date: 2018Äê7ÔÂ2ÈÕ<br/>
 * Author: zhuang<br/>
 * (C) Copyright 2018,Pugongying Meeting Service Company, All Rights Reserved. This software is the
 * proprietary information of Pugongying Meeting Service, Inc. Use is subject to license terms.
 */
package p1.iterator;

import java.util.Iterator;

public class tre {
  /**
   *
   */
  public static void main(String[] args) {
    BookShelf a = new BookShelf(5);
    a.appendBook(new Book("a"));
    a.appendBook(new Book("b"));
    a.appendBook(new Book("c"));
    a.appendBook(new Book("e"));
    a.appendBook(new Book("f"));

    Iterator test = a.iterator();

    while (test.hasNext()) {
      Book book = (Book) test.next();
      System.out.println(book.getName());
    }
  }

}
