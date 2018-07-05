# GOF
一．迭代器模式介绍
迭代器模式（Iterator Pattern）又称为游标（Cursor）模式，是行为型设计模式之一。

源于对容器的访问，比如java中的list，Map，数组等，我们知道对容器对象的访问必然是多种多样的，所以我们把遍历的方法封装在容器中，或者不提供遍历方法。

 

1.如果我们将遍历的方法封装到容器中，那么对于容器类来说就承担了过多的功能，容器类不仅要维护自身内部的数据元素而且还要对外提供遍历的接口方法.

2.如果我们不提供遍历方法而让使用者自己去实现，又会让容器的内部袭击暴露无遗

所以迭代器模式应运而生，在客户访问类与容器体之间插入一个第三者（迭代器）


二.类适配器模式：

　　原理：通过继承来实现适配器功能。

　　当我们要访问的接口A中没有我们想要的方法 ，却在另一个接口B中发现了合适的方法，我们又不能改变访问接口A，在这种情况下，我们可以定义一个适配器p来进行中转，这个适配器p要实现我们访问的接口A，这样我们就能继续访问当前接口A中的方法（虽然它目前不是我们的菜），然后再继承接口B的实现类BB，这样我们可以在适配器P中访问接口B的方法了，这时我们在适配器P中的接口A方法中直接引用BB中的合适方法，这样就完成了一个简单的类适配器。
  
三.接口适配器模式

　　原理：通过抽象类来实现适配，这种适配稍别于上面所述的适配。

　　当存在这样一个接口，其中定义了N多的方法，而我们现在却只想使用其中的一个到几个方法，如果我们直接实现接口，那么我们要对所有的方法进行实现，哪怕我们仅仅是对不需要的方法进行置空（只写一对大括号，不做具体方法实现）也会导致这个类变得臃肿，调用也不方便，这时我们可以使用一个抽象类作为中间件，即适配器，用这个抽象类实现接口，而在抽象类中所有的方法都进行置空，那么我们在创建抽象类的继承类，而且重写我们需要使用的那几个方法即可。