package abstractClasses;

public class Student extends Person
{
   private String major;

   /**
    * @param nama the student's name
    * @param major the student's major
    */
   public Student(String name, String major)
   {
      // pass n to superclass constructor
      super(name);//调用超类的构造器
      this.major = major;
   }

   /**
    * 
    * @return the descrition in String
    */

   public String getDescription()//定义了超类的抽象方法
   {
      return "a student majoring in " + major;
   }
}
