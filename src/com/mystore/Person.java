package com.mystore;

import java.time.LocalDate;


public class Person
{
   private String firstName;
   private String lastName;
   private LocalDate birthday;

   public Person()
   {
      
   }
   public Person(String firstName, String lastName, LocalDate birthday)
   {
      this.firstName = firstName;
      this.lastName = lastName;
      this.birthday = birthday;
   }

   public String getName()
   {
      return firstName + " " + lastName;
   }

   public String getFirstName()
   {
      return firstName;
   }

   public void setFirstName(String firstName)
   {
      this.firstName = firstName;
   }

   public String getLastName()
   {
      return lastName;
   }

   public void setLastName(String lastName)
   {
      this.lastName = lastName;
   }

   public LocalDate getBirthday()
   {
      return birthday;
   }

   public void setBirthday(LocalDate birthday)
   {
      this.birthday = birthday;
   }
   @Override
   public String toString()
   {
      return "Person [firstName=" + firstName + ", lastName=" + lastName + ", birthday=" + birthday + "]";
   }
   
   



}
