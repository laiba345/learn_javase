StringBuilder
- StringBuilder代表可变字符串对象,相当于一个容器,它里面是装的字符串是可以改变的,就是用来操作字符串的
    - 对于字符串相关的操作,如:频繁的拼接、修改等,建议使用StringBuilder,效率更高;
- 好处: StringBuilder比String更适合做字符串的修改操作,效率会更高,代码也会更简洁;

StringBuilder与StringBuffer
- 用法上它们是一摸一样的;
- 但是StringBuilder是线程不安全的(一伙人调用的时候可能出意外),StringBuffer是线程安全的;





