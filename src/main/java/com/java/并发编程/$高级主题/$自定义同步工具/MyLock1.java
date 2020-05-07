package com.java.并发编程.$高级主题.$自定义同步工具;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/**
 * @ClassName:MyLock1
 * @Description:TODO
 * @Author: guoyong
 * @Date:2020/3/24 9:29
 **/
public class MyLock1 implements Lock {

    Sync sync = new Sync();

    private static class Sync extends AbstractQueuedSynchronizer{
        protected boolean tryAcquire(int state){
            if (state != 1){
                return false;
            }
            if (compareAndSetState(0,1)){
                setExclusiveOwnerThread(Thread.currentThread());
                return true;
            }
            return false;
        }

        protected boolean tryRelease(int state){
            if (state !=1){
                return false;
            }
            if (getState()==0){
                throw new IllegalMonitorStateException();
            }
            setState(0);
            setExclusiveOwnerThread(null);
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
        return false;
    }

    @Override
    public boolean tryLock(long time, TimeUnit unit) throws InterruptedException {
        return false;
    }

    @Override
    public void unlock() {
        sync.release(1);
    }

    @Override
    public Condition newCondition() {
        return null;
    }
}
