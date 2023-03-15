import java.util.*;

public class LinkedHashMap<K, V> {

    private HashMap<K, Node> map;
    private Node head;
    private Node tail;

    private class Node {
        K key;
        V value;
        Node next;
        Node prev;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    public LinkedHashMap() {
        this.map = new HashMap<K, Node>();
    }

    public void put(K key, V value) {
        Node node = new Node(key, value);
        map.put(key, node);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
    }

    public V get(K key) {
        Node node = map.get(key);
        if (node == null) {
            return null;
        }
        if (node != tail) {
            if (node == head) {
                head = node.next;
            } else {
                node.prev.next = node.next;
            }
            node.next.prev = node.prev;
            tail.next = node;
            node.prev = tail;
            node.next = null;
            tail = node;
        }
        return node.value;
    }

    public void remove(K key) {
        Node node = map.remove(key);
        if (node == null) {
            return;
        }
        if (node == head && node == tail) {
            head = null;
            tail = null;
        } else if (node == head) {
            head = node.next;
            head.prev = null;
        } else if (node == tail) {
            tail = node.prev;
            tail.next = null;
        } else {
            node.prev.next = node.next;
            node.next.prev = node.prev;
        }
    }

    public Set<K> keySet() {
        return map.keySet();
    }

    public Collection<V> values() {
        List<V> values = new ArrayList<V>();
        Node curr = head;
        while (curr != null) {
            values.add(curr.value);
            curr = curr.next;
        }
        return values;
    }
}
