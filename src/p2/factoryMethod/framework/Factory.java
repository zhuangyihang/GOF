/**
 * Product: Pugongying meeting service solution<br/>
 * Module : FIXME: <should be your maven project name><br/>
 * Date: 2018Äê7ÔÂ4ÈÕ<br/>
 * Author: zhuang<br/>
 * (C) Copyright 2018,Pugongying Meeting Service Company, All Rights Reserved. This software is the
 * proprietary information of Pugongying Meeting Service, Inc. Use is subject to license terms.
 */
package p2.factoryMethod.framework;

public abstract class Factory {

  public final Product create(String owner) {
    Product product = createProduct(owner);
    registerProduct(product);
    return product;
  }

  protected abstract Product createProduct(String owner);

  protected abstract void registerProduct(Product product);
}
