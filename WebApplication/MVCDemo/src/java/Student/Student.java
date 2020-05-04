/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student;
/**
 *
 * @author Sotherny
 */
public class Student {
    private int id;
    private String name;
   
    public Student(int id, String name){
        this.id = id;
        this.name = name;
    }

    public Student() {
        
    }
    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
}
