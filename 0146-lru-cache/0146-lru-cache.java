class LRUCache {
    class Node{
        Node next;
        Node prev;
        int data;
        int val;
        Node(int data,int val){
            this.data=data;
            this.val=val;
        }
    }
    Node head=new Node(-1,-1);
    Node tail=new Node(-1,-1);
    Map<Integer,Node>map=new HashMap<>(); 
    int size=0;
    int capacity=0;
    public LRUCache(int capacity) {
        this.capacity=capacity;
        head.next=tail;
        tail.prev=head;
    }
    public void insert(Node node){
        Node prev=tail.prev;
        prev.next=node;
        node.prev=prev;
        node.next=tail;
        tail.prev=node;
        size++;
    }
    public void delete(Node node){
        node.prev.next=node.next;
        node.next.prev=node.prev;
        size--;
    }
    public int get(int key) {
        if(!map.containsKey(key)){
            return -1;
        }
      
        Node node=map.get(key);
        delete(node);
        insert(node);
        return node.val;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            delete(map.get(key));
            map.remove(key);
           
        }
        if(size==capacity){
            Node node1=head.next;
            map.remove(node1.data);
            delete(node1);
        }
        Node node=new Node(key,value);
        map.put(key,node);
        insert(node);

    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */