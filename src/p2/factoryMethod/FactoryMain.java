/**
 * Product: Pugongying meeting service solution<br/>
 * Module : FIXME: <should be your maven project name><br/>
 * Date: 2018Äê7ÔÂ4ÈÕ<br/>
 * Author: zhuang<br/>
 * (C) Copyright 2018,Pugongying Meeting Service Company, All Rights Reserved. This software is the
 * proprietary information of Pugongying Meeting Service, Inc. Use is subject to license terms.
 */
package p2.factoryMethod;

import p2.factoryMethod.entity.IdCardFactory;
import p2.factoryMethod.framework.Factory;
import p2.factoryMethod.framework.Product;

public class FactoryMain {

  public static void main(String[] args) {

    Factory factory = new IdCardFactory();
    Product ic = factory.create("a");
    Product id = factory.create("b");

    ic.use();
    id.use();

    IdCardFactory idFa = (IdCardFactory) factory;
    System.out.println(idFa.getList().size());
  }
}
