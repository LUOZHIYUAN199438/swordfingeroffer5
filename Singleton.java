package swordfingeroffer;

/**
 * create by
 *
 * @Author 罗志远
 * @on 2020-03-25.
 * @time 0:56
 */
// 通过静态内部类实现单例模式
public class Singleton {

    // 私有无参构造函数，防止该类以外直接通过new创建该单例对象
    private Singleton(){}

    // 静态内部类
    private static class SingletonHolder{
        // 静态变量
        public static Singleton instance = new Singleton();
    }

    // 为外部提供获取单例的公共方法
    public static Singleton getInstance(){
        return SingletonHolder.instance;
    }
}
