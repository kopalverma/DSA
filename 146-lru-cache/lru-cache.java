class LRUCache {
    public static class Node{
        int key;
        int value;
        Node prev;
        Node next;
        Node(int key , int value){
            this.key = key;
            this.value = value;
        }
    }
    public final int cap;
    public final Map<Integer , Node> cache;
    public final Node head;
    public final Node tail;
    public LRUCache(int capacity) {
        this.cap = capacity;
        this.cache = new HashMap<>();
        this.head = new Node(0,0);
        this.tail = new Node(0,0);
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        if(!cache.containsKey(key)){
            return -1;
        }
        Node node = cache.get(key);
        moveToHead(node);
        return node.value;
    }
    
    public void put(int key, int value) {
        if(cache.containsKey(key)){
            Node node = cache.get(key);
            node.value = value;
            moveToHead(node);
        }
        else{
            if(cache.size()>=cap){
                Node lrucache = tail.prev;
                removeHead(lrucache);
                cache.remove(lrucache.key);
            }
            Node newNode = new Node(key , value);
            addNextToHead(newNode);
            cache.put(key , newNode);  
        }
        
    }

    public void moveToHead(Node node){
        removeHead(node);
        addNextToHead(node);
    }

    public void removeHead(Node node){
        Node previous = node.prev;
        Node nextNode = node.next;
        previous.next = nextNode;
        nextNode.prev = previous;
    }

    public void addNextToHead(Node node){
        node.next = head.next;
        node.prev = head;
        head.next.prev = node;
        head.next = node;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */