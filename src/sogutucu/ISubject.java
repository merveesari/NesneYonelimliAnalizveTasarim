/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sogutucu;

/**
 *
 * @author MERVE
 */
public interface ISubject {
    
    public void attach(IObserver o);
    public void detach(IObserver o);
    public void notify(String m);
 
}
