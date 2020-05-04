/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategydp;

/**
 *
 * @author user
 */

interface strategy{
    public int doOperation(int a, int b);
}
class doOperationAdd implements strategy{

    @Override
    public int doOperation(int a, int b) {
        return a+b;
    }   
}
class doOperationSubstract implements strategy{

    @Override
    public int doOperation(int a, int b) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return a-b;
    }
}
class doOperationMultiply implements strategy{
    @Override
    public int doOperation(int a, int b){
        return a*b;
    }
}
class context{
    strategy strategy;
    public context(strategy strategy){
        this.strategy = strategy;
    }
    public int executeOperation(int a, int b){
        return strategy.doOperation(a, b);
    }
}
public class StrategyDP {

    public static void main(String[] args) {
        context context = new context(new doOperationAdd());
        System.out.println(String.format("10 + 20 = %s",context.executeOperation(10,20)));
        context = new context(new doOperationSubstract());
        System.out.println(String.format("10 - 20 = %s",context.executeOperation(10,20)));
    }
    
}
