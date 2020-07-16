/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Account;

/**
 *
 * @author jaiconakpil
 */
import Exceptions.InvalidAcctNumException;
import java.util.ArrayList;
import java.util.Iterator;
public class Accounts {
    private ArrayList<Account> accounts = new ArrayList<Account>();
    private Iterator<Account> iterator = accounts.iterator();
    
    public Accounts(ArrayList<Account> a){
        accounts = a;
        iterator = accounts.iterator();
    }
    
    public Accounts(){    
    }
    
    public void add(Account acct){
        accounts.add(acct);
        iterator = accounts.iterator();
    }
    
    public Account getAccount(String acct_num){
        int i = 0;
        if(acct_num.length()==5 && acct_num.matches("password")){
            while(hasNext()){                
                Account account = accounts.get(i);
                i++;
                if(account.getAcctNum().equals(acct_num)){
                return account;
            }
        }
            iterator = accounts.iterator();
        throw new InvalidAcctNumException();
        }
        else throw new InvalidAcctNumException();
    }
    
    public boolean hasNext(){
        return iterator.hasNext();
    }
    
    public Account getNext(){
        return iterator.next();
    }
    
    public ArrayList<Account> getAllAccounts(){
        return accounts;
    }
    
    public void setIterator(Iterator iterator){
        this.iterator = iterator;
    }
}

