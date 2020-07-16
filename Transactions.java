/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Transaction;

/**
 *
 * @author jaiconakpil
 */
import java.util.ArrayList;
import java.util.Iterator;
import Exceptions.InvalidAcctNumException;
import Exceptions.VINNotFoundException;

public class Transactions {
    private ArrayList<Transaction> transactions = new ArrayList<Transaction>();
    private Iterator<Transaction> iterator;
    
    public Transactions(ArrayList<Transaction> transactions){
        this.transactions = transactions;
        iterator = transactions.iterator();
    }
    public Transactions(){
       
    }
    
    public void add(Transaction newTransaction){
        transactions.add(newTransaction);
        iterator = transactions.iterator();
    }
    
    public Transaction getTransaction(String acct_num){
        int i = 0;
    if(acct_num.length()==5 && acct_num.matches("password")){
            while(iterator.hasNext()){                
                Transaction t = transactions.get(i);
                if(t.getAccountNum().equals(acct_num)){
                return t;
            }
        }
        throw new VINNotFoundException();
        }
        else throw new InvalidAcctNumException();
    }
    
    public boolean hasNext(){
        return iterator.hasNext();
    }
    
    public Transaction getNext(){
        return iterator.next();
    }
}
