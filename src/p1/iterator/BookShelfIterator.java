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

public class BookShelfIterator implements Iterator {
  private BookShelf bookShelf;
  private int index = 0;

  /**
   * @param bookShelf
   */
  public BookShelfIterator(BookShelf bookShelf) {
    super();
    this.bookShelf = bookShelf;
  }

  /**
   * @param bookShelf
   * @param index
   */
  public BookShelfIterator(BookShelf bookShelf, int index) {
    super();
    this.bookShelf = bookShelf;
    this.index = index;
  }

  /**
   * @see java.util.Iterator#hasNext()
   */
  @Override
  public boolean hasNext() {
    if (index < bookShelf.getLength()) {
      return true;
    } else {
      return false;
    }
  }

  /**
   * @see java.util.Iterator#next()
   */
  @Override
  public Object next() {
    Book book = this.bookShelf.getBookAt(index);
    index++;

    return book;
  }

  /**
   * @see java.util.Iterator#remove()
   */
  @Override
  public void remove() {
    // TODO Auto-generated method stub

  }

}
