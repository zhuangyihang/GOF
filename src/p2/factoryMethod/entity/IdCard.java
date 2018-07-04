/**
 * Product: Pugongying meeting service solution<br/>
 * Module : FIXME: <should be your maven project name><br/>
 * Date: 2018年7月4日<br/>
 * Author: zhuang<br/>
 * (C) Copyright 2018,Pugongying Meeting Service Company, All Rights Reserved. This software is the
 * proprietary information of Pugongying Meeting Service, Inc. Use is subject to license terms.
 */
package p2.factoryMethod.entity;

import p2.factoryMethod.framework.Product;

public class IdCard extends Product {

  private String owner;

  /**
   * @param owner
   */
  public IdCard(String owner) {
    super();
    System.out.println("初始化" + owner);
    this.owner = owner;
  }

  /**
   * @return the owner
   */
  public String getOwner() {
    return owner;
  }

  /**
   * @param owner
   *          the owner to set
   */
  public void setOwner(String owner) {
    this.owner = owner;
  }

  /**
   * @see p2.factoryMethod.framework.Product#use()
   */
  @Override
  public void use() {
    System.out.println("制作" + owner);

  }

}
