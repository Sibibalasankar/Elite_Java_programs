package app;


import java.util.Scanner;

public class Student {
   private String name;
   private int regno;
   private String rollno;
   private int year;
   private String dept;
   private double cgpa;
   private int m1;
   private int m2;
   private int m3;
   private char sec;

   Student(String var1) throws DepartmentInvalidException {
      this.AddEntry(var1);
      this.createRollno();
      this.calculatecgpa(this.m1, this.m2, this.m3);
   }

   private void AddEntry(String var1) throws DepartmentInvalidException {
      String[] var2 = var1.split(",");
      this.name = var2[0];
      this.regno = Integer.parseInt(var2[1]);
      this.year = Integer.parseInt(var2[2]);
      this.validateDepartment(var2[3]);
      this.dept = var2[3];
      this.sec = var2[4].charAt(0);
      this.m1 = Integer.parseInt(var2[5]);
      this.m2 = Integer.parseInt(var2[6]);
      this.m3 = Integer.parseInt(var2[7]);
   }

   private void validateDepartment(String var1) throws DepartmentInvalidException {
      String[] var2 = new String[]{"CSE", "ECE", "EEE", "MECH", "CIVIL"};
      boolean var3 = false;
      String[] var4 = var2;
      int var5 = var2.length;

      for(int var6 = 0; var6 < var5; ++var6) {
         String var7 = var4[var6];
         if (var7.equalsIgnoreCase(var1)) {
            var3 = true;
            break;
         }
      }

      if (!var3) {
         throw new DepartmentInvalidException(var1);
      }
   }

   private void createRollno() {
      int var1 = this.year - 4;
      String var2 = Integer.toString(var1);
      String var10001 = var2.substring(2, 4);
      this.rollno = var10001 + this.dept.substring(0, 2) + this.sec + this.validatereg(this.regno);
   }

   private String validatereg(int var1) {
      return var1 > 0 && var1 < 9 ? "0" + var1 : Integer.toString(var1);
   }

   private void calculatecgpa(int var1, int var2, int var3) {
      this.cgpa = (double)(var1 + var2 + var3) / 3.0;
   }

   void displaydetails() {
      System.out.println("-----Student Details-----");
      System.out.println("Name: " + this.name);
      System.out.println("Reg No: " + this.regno);
      System.out.println("Year: " + this.year);
      System.out.println("Department: " + this.dept);
      System.out.println("Section: " + this.sec);
      System.out.println("Roll No: " + this.rollno);
      System.out.println("CGPA: " + this.cgpa);
   }

   String getrollno() {
      return this.rollno;
   }

   static void searchStudent(Scanner var0, Student[] var1, int var2, int var3) {
      boolean var4;
      var4 = false;
      int var8;
      label63:
      switch (var3) {
         case 1:
            System.out.println("Enter Year:");
            int var5 = var0.nextInt();
            int var10 = 0;

            while(true) {
               if (var10 >= var2) {
                  break label63;
               }

               if (var1[var10].year == var5) {
                  var1[var10].displaydetails();
                  var4 = true;
               }

               ++var10;
            }
         case 2:
            System.out.println("Enter Roll No:");
            String var6 = var0.next();
            int var11 = 0;

            while(true) {
               if (var11 >= var2) {
                  break label63;
               }

               if (var1[var11].rollno.equals(var6)) {
                  var1[var11].displaydetails();
                  var4 = true;
                  break label63;
               }

               ++var11;
            }
         case 3:
            System.out.println("Enter Department:");
            String var7 = var0.next();
            var8 = 0;

            while(true) {
               if (var8 >= var2) {
                  break label63;
               }

               if (var1[var8].dept.equalsIgnoreCase(var7)) {
                  var1[var8].displaydetails();
                  var4 = true;
               }

               ++var8;
            }
         case 4:
            System.out.println("Enter Section:");
            var8 = var0.next().charAt(0);
            int var9 = 0;

            while(true) {
               if (var9 >= var2) {
                  break label63;
               }

               if (var1[var9].sec == var8) {
                  var1[var9].displaydetails();
                  var4 = true;
               }

               ++var9;
            }
         default:
            System.out.println("Invalid Search Option");
            return;
      }

      if (!var4) {
         System.out.println("No matching student found.");
      }

   }
}

