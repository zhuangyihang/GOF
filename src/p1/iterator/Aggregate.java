/**
 * Product: Pugongying meeting service solution<br/>
 * Module : FIXME: <should be your maven project name><br/>
 * Date: 2018��7��2��<br/>
 * Author: zhuang<br/>
 * (C) Copyright 2018,Pugongying Meeting Service Company, All Rights Reserved. This software is the
 * proprietary information of Pugongying Meeting Service, Inc. Use is subject to license terms.
 */
package p1.iterator;

import java.util.Iterator;

/**
 * �ۺ�
 */
public interface Aggregate<E> {

  public abstract Iterator<E> iterator();
}
