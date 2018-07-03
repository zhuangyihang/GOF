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

public class BookShelf implements Aggregate<Book> {

  private Book[] books;
  private int last = 0;

  public BookShelf(int max) {
    this.books = new Book[max];
  }

  public void appendBook(Book book) {
    this.books[last] = book;
    last++;
  }

  public Book getBookAt(int index) {
    return books[index];
  }

  public int getLength() {
    return last;
  }

  /**
   * @see p1.iterator.Aggregate#iterator()
   */
  @Override
  public Iterator<Book> iterator() {
    return new BookShelfIterator(this);
  }

}
