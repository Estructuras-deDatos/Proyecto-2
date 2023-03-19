/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

/**
 * 
 * @author andre
 */
public class Hash {
    
    
    private final int capacity;
    private int size;
    private final Object[] val;

    public Hash(int capacity) {
        this.capacity = capacity;
        this.size=0;
        this.val = new Object[capacity];
    }
    /**
     * Buscar el indice de un elemento en la hash table de los resumenes;
     * @param key
     * @param hash
     * @return 
     */
    public int search_in(String key, Hash hash){
        int found = -1;
        if(!hash.isEmpty()){
            int in = hash.sfold(key.toLowerCase(), hash.getCapacity());
            Summary aux = (Summary) hash.getVal()[in];
            if(aux!=null){
            if(aux.getTitle().equalsIgnoreCase(key.toLowerCase())){
                found = in;
            }
            else{
                int i =1;
                int k=in;
                while(i<hash.getCapacity()){
                    k = (in + (i*i)) % hash.getCapacity();
                    i++;
                    aux=(Summary) hash.getVal()[k];
                    if(aux!=null){
                        if(aux.getTitle().equalsIgnoreCase(key.toLowerCase())){
                            found =k;
                        }
                }
            }
        }
 
    }}
    return found;
    }
    
    public void insert(String key, Object value){
        int in = sfold(key, getCapacity());
        if (getVal()[in]==null){
            getVal()[in]=value;
        }else{
            int i =1;
            int k=in;
            while(getVal()[k]!=null){
                k = (in + (i*i)) % getCapacity();
                i++;
            }
            if(getVal()[k]==null){
               getVal()[k]=value;
            }
        }
        size++;
    }
    
    public int sfold(String s, int M){
        long sum = 0, mul = 1;
        for (int i = 0; i < s.length(); i++) {
          mul = (i % 4 == 0) ? 1 : mul * 256;
          sum += s.charAt(i) * mul;
        }
        return (int)(Math.abs(sum) % M);
    }

    /**
     * @return the capacity
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * @return the val
     */
    public Object[] getVal() {
        return val;
    }
    
    public boolean isEmpty(){
        return size==0;
    }
    
}
