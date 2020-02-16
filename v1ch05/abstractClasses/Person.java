package abstractClasses;

public abstract class Person//声明一个抽象类
{
   public abstract String getDescription();//抽象方法
   private String name;

   public Person(String name)//普通方法
   {
      this.name = name;
   }

   public String getName()
   {
      return name;
   }
}
