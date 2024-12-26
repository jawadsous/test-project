public class Student extends Person {

    
   private double GPA;
   Public Student(String name,int age,String address, double GPA){
super( name,age, address);

this.GPA=GPA;
   }

public void Studentinfo(){
    System.out.println("name: "+ name, "age"+ age,"adreess: "+ address,"GPA: "+ GPA);

    
}

    
}
