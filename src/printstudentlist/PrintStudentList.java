/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package printstudentlist;

/**
 *
 * @author ggg
 */
public class PrintStudentList {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Peter");
        s1.setId(1);
        
        Student s2 = new Student();
        s2.setName("John");
        s2.setId(2);
        
        Student s3 = new Student();
        s3.setName("Jess");
        s3.setId(3);
        
        Student [] list = new Student [2];
        list[0]=s1;
        list[1]=s2;
        //list[2]=s3;
        
        for(int i=0;i<list.length;i++){
            System.out.println(list[i].getName() + " " + list[i].getId());
        }
    }
    
}
