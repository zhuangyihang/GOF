/**
 * Product: Pugongying meeting service solution<br/>
 * Module : FIXME: <should be your maven project name><br/>
 * Date: 2018Äê7ÔÂ4ÈÕ<br/>
 * Author: zhuang<br/>
 * (C) Copyright 2018,Pugongying Meeting Service Company, All Rights Reserved. This software is the
 * proprietary information of Pugongying Meeting Service, Inc. Use is subject to license terms.
 */
package p2.factoryMethod.entity;

import java.util.ArrayList;
import java.util.List;

import p2.factoryMethod.framework.Factory;
import p2.factoryMethod.framework.Product;

public class IdCardFactory extends Factory {
  private List<IdCard> list = new ArrayList<>();

  /**
   * @return the list
   */
  public List<IdCard> getList() {
    return list;
  }

  /**
   * @param list
   *          the list to set
   */
  public void setList(List<IdCard> list) {
    this.list = list;
  }

  /**
   * @see p2.factoryMethod.framework.Factory#createProduct(java.lang.String)
   */
  @Override
  protected Product createProduct(String owner) {
    return new IdCard(owner);
  }

  /**
   * @see p2.factoryMethod.framework.Factory#registerProduct(p2.factoryMethod.framework.Product)
   */
  @Override
  protected void registerProduct(Product product) {
    this.list.add((IdCard) product);
  }

}
