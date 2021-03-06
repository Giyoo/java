package com.java.面向对象.$9集合;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by banma on 2018/12/8.
 */
public class LRULinkedHashMap<K,V> extends LinkedHashMap<K,V> {
    private int lruCapacity; // LRU缓存容量

    public LRULinkedHashMap() {
        this(1024, 0.75f);
    }

    public LRULinkedHashMap(int initialCapacity, float loadFactor) {
        super(initialCapacity, loadFactor, true); // accessOrder始终为true
        this.lruCapacity = (int) (initialCapacity * loadFactor) - 1; // lruCapacity小于阈值，哈希表不会进行重哈希操作
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > lruCapacity; // 当哈希表中节点（键值对）数量超出缓存容量，返回true，删除双向链表头结点
    }

    public static void main(String[] args) {
        Map<Integer, String> map = new LRULinkedHashMap<>(8, 0.75f);
        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");
        map.put(4, "d");
        map.put(5, "e");
        map.put(6, "f");
        System.out.println(map); // {1=a, 2=b, 3=c, 4=d, 5=e, 6=f} // 默认按照put顺序
        System.out.println(map.get(3)); // c
        System.out.println(map); // {1=a, 2=b, 4=d, 5=e, 6=f, 3=c} // 访问key=3节点后，该节点被移动到链表尾
        map.put(1, "x");
        System.out.println(map); // {2=b, 4=d, 5=e, 6=f, 3=c, 1=x} // 更新key=1节点后，该节点被移动到链表尾
        map.put(7, "g");
        System.out.println(map); // {4=d, 5=e, 6=f, 3=c, 1=x, 7=g} // 添加key=7节点后，缓存容量超出限制（8*0.75=6），表头节点(key=2)被删除
    }

}
