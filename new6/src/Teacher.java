
import java.util.Scanner;

public class Teacher {
    private int age;
private String name;
private String address;
int x;
String S[];
Scanner input= new scanner(System.in);

public Teacher(String name, int age, String address,int x){
   S =new String[x];
   this.age=age;
   this.name=name;
   this.address=address;
   

}
public Void addSubject(String newSubject){
    for(int i=0;i<x;i++){
        if(S[i]==null){
            S[i]=newSubject;
            break;
        }
    }
    
    
}

public void TeacherInfo(){
    System.out.println("name: "+ name +" age " + age +"adress: "+address );
 for(int i=0;i<S.length;i++){
System.out.println("subjects are:"+ S[i]);

 }
}
}
