package inheritance;

public class Manager extends Employee//extends关键字，java默认public
{
   private double bonus;

   /**
    * @param name the employee's name
    * @param salary the salary
    * @param year the hire year
    * @param month the hire month
    * @param day the hire day
    */
   public Manager(String name, double salary, int year, int month, int day)
   {
      super(name, salary, year, month, day);//super关键字，调用父类的constructor
      bonus = 0;
   }

   public double getSalary()//方法覆盖
   {
      double baseSalary = super.getSalary();///super关键字，调用父类的getSalary
      bonus = 0;
      return baseSalary + bonus;
   }

   public void setBonus(double b)
   {
      bonus = b;
   }
}