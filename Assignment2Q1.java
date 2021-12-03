import java.util.*;

class Assignment2Q1 {
    
    public static ArrayList<Integer> Sieve(int n) {
        ArrayList<Integer> all = new ArrayList<Integer>(n-1);
        for(int i = 2; i<=n; i++){
            all.add(i);
        }
        for(int i = 0; i< all.size(); i++){
            for(int p = i+1; p<all.size(); p++){
                if(all.get(p)%all.get(i) ==0) all.remove(p); 
            }
        }
        return all;
    }
    
    public static void Goldbach(int n) {
        
        ArrayList<Integer> primes = Sieve(n);
        for(int i = 0; i<primes.size(); i++){
            if(primes.contains(n-primes.get(i))){
                System.out.print(primes.get(i)+ " ");
                System.out.println(primes.get(primes.indexOf(n-primes.get(i))));
                break;
            }
        }
    }
    
    public static ArrayList<Integer> add(ArrayList<Integer> a, ArrayList<Integer> b){
        
        ArrayList<Integer> larger; 
        ArrayList<Integer> smaller; 
        
        if(a.size()>b.size()) {
            smaller= b;
            larger = a;
        }
        else {
            smaller= a;
            larger = b;
        }
        Collections.reverse(smaller);
        Collections.reverse(larger);
        ArrayList<Integer> n = new ArrayList<Integer>(larger); 
        for(int i = 0; i<smaller.size(); i++){
            n.add(larger.get(i));
        }
        for(int i = 0; i<smaller.size(); i++){
            l =(larger.get(i+larger.size()-smaller.size())+smaller.get(i));
            if(l>=10){
                l-=10;
                
            }
        }
        return n;
    }
    
    public static void main (String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        ArrayList<Integer> b = new ArrayList<Integer>();
        a.add(9);
        a.add(8);
        a.add(0);
        a.add(1);
        b.add(3);
        b.add(4);
        b.add(5);
        
        
        Sytem.out.println(add(a,b));
    }
}