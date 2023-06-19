class MyLinkedList {
    // Instantiating Linked List
    private static LinkedList<Integer> list ;
    
    public MyLinkedList() {
        // Declaring empty Linked List
        list = new LinkedList<>();
    }
    
    public int get(int index) {
        //Get the value of the indexth node in the linked list. If the index is invalid, return -1.
        if(index>=list.size()) return -1;
        return list.get(index);
    }
    
    public void addAtHead(int val) {
        //void addAtHead(int val) Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list.
        list.addFirst(val);
    }
    
    public void addAtTail(int val) {
        list.addLast(val);
    }
    
    public void addAtIndex(int index, int val) {
        // Checks if there is space and adds at tail if no space
        if(index<list.size()) list.add(index,val);
        else if(index==list.size()) addAtTail(val);
    }
    
    public void deleteAtIndex(int index) {
        if(index<list.size()) list.remove(index);
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */