package abstractClasses;

import java.time.*;

public class Employee extends Person
{
   private double salary;
   private LocalDate hireDay;

   /**
    * 
    * @param name employee's name
    * @param salary employee's salary
    * @param year hired's year
    * @param month hired's mnoth
    * @param day hired's day
    */
   public Employee(String name, double salary, int year, int month, int day)
   {
      super(name);
      this.salary = salary;
      hireDay = LocalDate.of(year, month, day);
   }

   public double getSalary()
   {
      return salary;
   }

   public LocalDate getHireDay()
   {
      return hireDay;
   }

   public String getDescription()
   {
      return String.format("an employee with a salary of $%.2f", salary);
   }

   public void raiseSalary(double byPercent)
   {
      double raise = salary * byPercent / 100;
      salary += raise;
   }
}
