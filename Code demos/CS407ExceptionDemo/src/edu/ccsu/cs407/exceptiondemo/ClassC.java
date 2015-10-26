package edu.ccsu.cs407.exceptiondemo;

/**
 * Class C from exception demo triggers overall call .
 *
 * @author Chad Williams
 */
public class ClassC {
    public ClassC(){}
    
    public void doSomething(){
        ClassB classB = new ClassB();
        try{
            classB.operationB(2, 4);
        }catch(BZeroException bze){
            bze.printStackTrace();
        }
    }
}
