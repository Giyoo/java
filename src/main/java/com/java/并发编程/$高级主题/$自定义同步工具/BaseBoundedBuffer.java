package com.java.并发编程.$高级主题.$自定义同步工具;

/**
 * @ClassName:BaseBoundedBuffer
 * @Description:基础类
 * @Author: guoyong
 * @Date:2020/1/8 14:08
 **/
public class BaseBoundedBuffer<V> {
    //缓存的数组
    private  final V[] buf;
    private int tail;
    private int head;
    private int count;

    /*
     * 通过构造函数,设置缓存数据的长度
     * */
    protected BaseBoundedBuffer(int capacity) {
        this.buf = (V[]) new Object[capacity];
    }

    /*
     * 线程安全的put方法,同时因为是final的不能被子类重写
     * */
    protected synchronized final void doPut(V v){
        //将v 放到缓存的 tail位置,从0开始赋值
        buf[tail]  = v;
        // 自增tail,同时与缓存的长度相比较,如果等于缓存的长度
        // 把tail置为0,也就是说下次会从0开始覆盖.
        if(++tail == buf.length){
            tail = 0;
        }
        // 统计的数组容量+1
        ++count;
    }

    /*
     * 同上
     * */
    protected  synchronized  final V doTake(){
        /*从head拿取数据*/
        V v = buf[head];
        /*拿出去的数据置为0*/
        buf[head] = null;
        if (++head == buf.length){
            head = 0;
        }
        -- count;
        return v;
    }

    //判断是否满了,注意前验条件必须被锁保护,保证不会看到过期数据
    public synchronized  final boolean isFull(){
        //如果当前的容量count == 缓存的长度,那就是满了,返回true
        return count == buf.length;
    }

    //判断是否为空
    public synchronized  final boolean isEmpty(){
        return count == 0 ;
    }

    public static void main(String[] args) {
        BaseBoundedBuffer<String> baseBoundedBuffer = new BaseBoundedBuffer<>(5);
        for (int i = 0;i<10;i++){
            int finalI = i;
            new Thread(new Runnable() {
                @Override
                public void run() {
                    baseBoundedBuffer.doPut("a"+ finalI);
                }
            }).start();
        }
        System.out.println(baseBoundedBuffer.buf);

    }
}
