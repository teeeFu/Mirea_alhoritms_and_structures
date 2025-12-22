package practice27;


public class Hashtab<V> {
    private class Node<V>{
        Node<V> next;
        String key;
        V value;
        public  Node(String key,V value,Node next){
            this.key=key;
            this.value=value;
            this.next=next;
        }
    }
    Node[]nodes;
    private int SIZE=8;
    private int size;
    public Hashtab(){
        hashtabInit(16);
        this.nodes=new Node[SIZE];
    }
    public int hashtabHash(String k){
        if(k==null) return 0;
        int hash= k.length();
        hash=Math.abs(hash*31+k.hashCode())% nodes.length;
        return hash;
    }
    public void hashtabInit(int size){
        this.size=size;
        this.nodes=new Node[size];
    }
    public void hashtabAdd(String k,V value){
        if(size>= nodes.length*0.75){
            Node[] newNode=nodes;
            nodes=new Node[newNode.length*2];
            size=0;
            for(Node<V> n:newNode){
                while (n!=null){
                    hashtabAdd(n.key,n.value);
                    n=n.next;
                }
            }
        }
        int index=hashtabHash(k);
        for(Node<V>n=nodes[index];n!=null;n=n.next){
            if(n.key.equals(k)){
                n.value=value;
                return;
            }
        }
        nodes[index]=new Node(k,value,nodes[index]);
        size++;
    }
    public V hashtabLookup(String k){
        int index=hashtabHash(k);
        for(Node<V> n = nodes[index]; n!=null; n=n.next){
            if(n.key.equals(k)){
                return n.value;
            }
        }
        return null;
    }
    public V hashtabDelete(String k){
        int index=hashtabHash(k);
        Node<V>prev=null;
        Node<V>current=nodes[index];
        while(current!=null){
            if(current.key.equals(k)){
                if(prev==null){
                    nodes[index]=current.next;
                }
                else{
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
    @Override
    public String toString(){
        StringBuilder str=new StringBuilder();
        str.append("{");
        for(Node<V>n:nodes){
            while (n!=null){
                str.append(n.key+"="+n.value+" ");
                n=n.next;
            }

        }
        str.append("}");
        return str.toString();
    }

}