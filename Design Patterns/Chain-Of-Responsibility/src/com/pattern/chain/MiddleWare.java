package com.pattern.chain; /**
 * creating abstract class, to avoid the duplicate code in each handler
 * such as link and checkNext methods are common.
 * so, adding boilerplate code in the abstract class.
 */

/**
 * open-closed principle: we can introduce new handlers into the app without
 * breaking the existing client code.
 */
public abstract class MiddleWare {
    private MiddleWare next;

    public static MiddleWare link(MiddleWare... chain){
        MiddleWare head = null,tail=null;
        for (MiddleWare nextInChain:chain){
            if (head==null){
                head= nextInChain;
            }
            else {
                tail.next=nextInChain;
            }
            tail=nextInChain;
        }
        return head;
    }

    public abstract boolean check(String email, String password);

    /**
     * Runs check on the next object in chain or ends traversing if we're in
     * last object in chain.
     */
    protected boolean checkNext(String email, String password){
        if (next==null){
            return true;
        }
        return next.check(email,password);
    }
}
