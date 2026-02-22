package stuapp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		System.out.println("Welcome to Kgisl!");
		Scanner sc = new Scanner(System.in);
		int loginCaseId;
		while (true) {
			System.out.println("Login \n1.Student\n2.Staff\n3.Exit");
			loginCaseId = sc.nextInt();
			switch (loginCaseId) {
				case 1:
					boolean studentStatus = Student.studentLogin();
					if (studentStatus == true) {
						System.out.println("Student Login Successful");
						while (true) {
							System.out.println("1.View Profile 2.View Marks 3.Exit");
							int studentChoice = sc.nextInt();
							switch (studentChoice) {
								case 1:
									Student.viewProfile();
									break;
								case 2:
									Student.viewMarks();
									break;
								case 3:
									break;
								default:
									System.out.println("Enter Valid Option");
							}
							if (studentChoice == 3) {
								break;
							}
						}
					} else {
						System.out.println("Invalid User");
					}
					break;
				case 2:
					boolean staffStatus = Staff.staffLogin();
					if (staffStatus == true) {
						System.out.println("Staff Login Successful");
						while (true) {
							System.out.println("1.View Profile 2.View Students 3.Exit");
							int staffChoice = sc.nextInt();
							switch (staffChoice) {
								case 1:
									Staff.viewProfile();
									break;
								case 2:
									Staff.viewStudents();
									break;
								case 3:
									break;
								default:
									System.out.println("Enter Valid Option");
							}
							if (staffChoice == 3) {
								break;
							}
						}
					}
					break;
				case 3:
					return;
				case 20022026:
					boolean loginStatus = Admin.adminLogin();
					if (loginStatus == true) {
						System.out.println("Admin Login Successful");
						while (true) {
							System.out.println("1.DBView 2. 3.Exit");
							int successAdminLoginCaseID = sc.nextInt();
							switch (successAdminLoginCaseID) {
								case 1:
									Admin.viewDB();
									break;
								case 2:
									break;
								case 3:
									break;
								default:
									System.out.println("Enter Valid Option");
							}
							if (successAdminLoginCaseID == 3) {
								break;
							}

						}
					}
					break;
				default:
					System.out.println("Choose Valid User!!!");
			}
		}
	}

}