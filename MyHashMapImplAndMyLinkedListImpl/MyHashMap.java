package Patterns.MyHashMapImpl;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class MyHashMap <K,V>{
    private LinkedList<HMNode>[] buckets;
    private int size;
    public MyHashMap(){
        implement(4);
        size=0;
    }
    public void implement(int N){
        buckets=new LinkedList[N];
        for(int bi=0;bi< buckets.length;bi++){
            buckets[bi]=new LinkedList<>();
        }
    }
    public class HMNode{
        K key;
        V value;
        public HMNode(K key,V value){
            this.key=key;
            this.value=value;
        }
    }
    public void put(K key,V value) throws Exception{
        int bi=hashFunction(key);
        int di=getIndexOfNode(key,bi);
        if(di!=-1){
            buckets[bi].get(di).value=value;
        }else{
            HMNode node=new HMNode(key,value);
            buckets[bi].add(node);
            size++;
        }
        double lamdaValue= (size*1d)/buckets.length;
        if(lamdaValue>=2){
            reHashing();
        }
    }
    public void reHashing() throws Exception{
        LinkedList<HMNode>[] oba=buckets;
        implement(oba.length*2);
        size=0;
        for(int i=0;i< buckets.length;i++){
            for(HMNode node : buckets[i]){
                put(node.key, node.value);
            }
        }
    }
    public boolean hasContainKey(K key) throws Exception{
        int bi=hashFunction(key);
        int di=getIndexOfNode(key,bi);
        if(di!=-1){
            return true;
        }else{
            return false;
        }
    }
    public int  size() throws Exception{
        return size;
    }
    public V get(K key) throws Exception{
        int bi=hashFunction(key);
        int di=getIndexOfNode(key,bi);
        if(di!=-1){
            return buckets[bi].get(di).value;
        }else{
            System.out.println("Key is not Present !!");
            return null;
        }
    }
    public V remove(K key) throws Exception{
        int bi=hashFunction(key);
        int di=getIndexOfNode(key,bi);
        if(di!=-1){
            size-=1;
            return buckets[bi].remove(di).value;
        }else{
            System.out.println("Key is not Present !!");
            return null;
        }
    }
    public List<K> keySet(){
        List<K> keySetList=new ArrayList<>();
        for(int i=0;i< buckets.length;i++){
            for(HMNode node : buckets[i] ){
                    keySetList.add(node.key);
            }
        }
        return keySetList;
    }
    public int hashFunction(K key){
        int abs=Math.abs(key.hashCode());
        return abs% buckets.length;
    }
    public int getIndexOfNode(K key, int bi){
        int idx=0;
        for(HMNode node : buckets[bi]){
            if(key.equals(node.key)){
                return idx;
            }
            idx++;
        }
        return -1;
    }
}
