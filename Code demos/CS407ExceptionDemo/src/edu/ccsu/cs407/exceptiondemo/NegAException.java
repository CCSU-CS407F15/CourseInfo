package edu.ccsu.cs407.exceptiondemo;

/**
 * Exception representing that A should never be negative
 * @author Chad Williams
 */
public class NegAException extends Exception{
    public NegAException(String msg){
        super(msg);
    }
}
