package com.java.并发编程.$高级主题.$自定义同步工具;

/**
 * @ClassName:BoundedBuffer
 * @Description:使用条件队列的实现方式
 * @Author: guoyong
 * @Date:2020/1/8 15:13
 **/
public class BoundedBuffer<V> extends BaseBoundedBuffer <V> {
    protected BoundedBuffer(int capacity) {
        super(capacity);
    }

    /*
     * 注意这里的synchronized,
     * 是必须的否则运行会报java.lang.IllegalMonitorStateException
     * 作用是检查前验条件时保护状态的一致性.不会读到过期数据
     * */
    public synchronized void put(V v) throws InterruptedException {
        /*注意这里这里是while循环
         * 不是单单一个简单的if,这么做有两个理由
         *1. 因为从notify/notifyAll通知的这段时间
         * 很有可能前验条件条件又由真变为假.所以循环判断一次是有必要的
         * 2. notify/notifyAll的区别,notify是选取一个条件队列中的线程通知,
         * 而notifyAll则是通知所有的条件队列,当有多个前验条件时,可能有一些没有通过前验条件的也会被通知
         * 所以需要再次判断
         * */
        while(isFull()){
            /*挂起当前线程,释放锁,给其他线程一些机会
             * 使前验条件为真
             * */
            wait();
        }
        /*存入数据*/
        doPut(v);
        /*通知,告诉下面的take方法里面已经有数据了*/
        notifyAll();
    }

    public synchronized V take() throws InterruptedException {
        while (isEmpty()){
            wait();
        }
        V v = doTake();
        notifyAll();
        return v;
    }
}
