package com.java.并发编程.$高级主题.$自定义同步工具;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.AbstractQueuedLongSynchronizer;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/**
 * @ClassName:MyLock
 * @Description:自定义互斥锁
 * @Author: guoyong
 * @Date:2020/1/10 15:19
 **/
public class MyLock implements Lock {

    Sync sync = new Sync();

    private static class Sync extends AbstractQueuedLongSynchronizer{
        //判断是是否已经锁定
        protected boolean isHeldExclusively(){
            return getState() == 1;
        }

        //获取资源
        public boolean tryAcquire(int acquires){
            assert acquires == 1;
            if (compareAndSetState(0,1)){
                setExclusiveOwnerThread(Thread.currentThread());
                return true;
            }
            return false;
        }

        //释放资源
        public boolean tryRelease(int releases){
            assert releases == 1;
            if (getState() == 0){
                throw new IllegalMonitorStateException();
            }
            setExclusiveOwnerThread(null);
            setState(0);
            return true;
        }
    }

    @Override
    public void lock() {
        sync.acquire(1);
    }

    @Override
    public void lockInterruptibly() throws InterruptedException {

    }

    @Override
    public boolean tryLock() {
        return sync.tryAcquire(1);
    }
    @Override
    public boolean tryLock(long time, TimeUnit unit) throws InterruptedException {
        return false;
    }

    @Override
    public void unlock() {
        sync.tryRelease(1);
    }

    @Override
    public Condition newCondition() {
        return null;
    }
}
