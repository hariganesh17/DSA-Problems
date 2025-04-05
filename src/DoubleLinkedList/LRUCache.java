package DoubleLinkedList;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {
    class Node{
        int key,value;
        Node prev,next;
        Node(int k,int v){
            key = k;
            value = v;
        }
    }
    private final int capacity;
    private final Map<Integer,Node> map;
    private final Node head,tail;

    public LRUCache(int capacity){
        this.capacity = capacity;
        map = new HashMap<>();
        head = new Node(0,0);
        tail = new Node(0,0);
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key){
        if(!map.containsKey(key)) return -1;
        Node node = map.get(key);
        remove(node);
        insert(node);

        return node.value;
    }

    public void put(int key,int value){
        if(map.containsKey(key)){
            remove(map.get(key));
        }
        if(map.size() == capacity){
            remove(tail.prev);
        }
        insert(new Node(key,value));
    }
    private void remove(Node node){
        map.remove(node.key);
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }
    private void insert(Node node){
        map.put(node.key,node);
        node.next = head.next;
        node.prev = head;
        node.next.prev = node;
        head.next = node;

    }
    public static void main(String[] args) {
        LRUCache cache = new LRUCache(2);
        System.out.println(cache.get(2)); // -1
        cache.put(2, 6);
        System.out.println(cache.get(1)); // -1
        cache.put(1, 5);
        cache.put(1, 2);
        System.out.println(cache.get(1)); // 2
        System.out.println(cache.get(2)); // 6
    }
}
