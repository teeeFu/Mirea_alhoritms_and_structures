package practice28;

public class MyHashMap<V> {
    private class Node<V>{
        Node next;
        V value;
        double key;
        public Node(double key,V value,Node next){
            this.key = key;
            this.value = value;
            this.next = next;

        }
        @Override
        public final String toString(){
            return key+"="+value;
        }
    }
    private int size;
    private Node<V>[] nodes;
    public MyHashMap(int size){
        this.size=size;
        this.nodes=new Node[size];
    }
    public int hash(Double k){
        double A=0.6180339;
        double temp=k*A;
        temp=temp-Math.floor(temp);
        return (int)(nodes.length*temp);
    }
    public void put(Double k,V value){
        if(size>=nodes.length*0.75){
            Node<V>[] newNodes=nodes;
            nodes=new Node[newNodes.length*2];
            size=0;
            for(Node<V> n:newNodes){
                while(n!=null){
                    put(n.key,n.value);
                    n=n.next;
                }
            }
        }
        int index=hash(k);
        for(Node<V> n=nodes[index];n!=null;n=n.next){
            if(n.key==k){
                n.value=value;
                return;
            }
        }
        nodes[index]=new Node<>(k,value,nodes[index]);
        size++;
    }
    public V remove(Double k){
        int index=hash(k);
        Node<V> prev=null;
        Node<V> current=nodes[index];
        while(current!=null){
            if (current.key==k){
                if(prev==null){
                    nodes[index]=current.next;
                }else{
                    prev.next=current.next;

                }
                size--;
                return current.value;
            }
            prev=current;
            current=current.next;
        }
        return null;
    }
    public V get(Double k){
        int index=hash(k);
        for(Node<V>n=nodes[index];n!=null;n=n.next){
            if(n.key==k){
                return n.value;
            }
        }
        return null;
    }
    @Override
    public String toString(){
        StringBuilder str=new StringBuilder();
        for(Node n:nodes){
            str.append(n+" ");
        }
        return str.toString();
    }
}