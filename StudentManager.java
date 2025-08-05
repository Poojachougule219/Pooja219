package calculator;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
	
	private ArrayList<Student> students;
	private Scanner sc;
	
	public StudentManager()
	{
		students=new ArrayList<Student>();
		sc=new Scanner(System.in);
	}
	
		//	Add Students
	public void addStudent()
	{
		System.out.println("Enter Student ID : ");
		int id=sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Enter Student Name : ");
		String name=sc.nextLine();
		
		System.out.println("Enter Student Marks : ");
		double marks=sc.nextDouble();
		
		sc.nextLine();
		
		students.add(new Student(id, name, marks));
		System.out.println("Student added successfully.");
		
	}
			// view Students
		public void viewStudents()
		{
			if(students.isEmpty())
			{
				System.out.println("No students to display");
				return;
			}
			
			for(Student student:students)
			{
				System.out.println(student);
			}
		
	}
		
			//Update Students
		public void updateStudent()
		{
			System.out.println("Enter id of student to update :");
			int idToUpdate=sc.nextInt();
			
			sc.nextLine();
			
			for(Student student:students)
			{
				if(student.getId() == idToUpdate)
				{
					System.out.println("Enter new name(current :" +student.getName()+"):");
					
					String newName=sc.nextLine();
					student.setName(newName);
					System.out.println("Enter new Marks(current:" +student.getMarks()+")");
					
					double newMarks=sc.nextDouble();
					sc.nextLine();
					
					student.setMarks(newMarks);
					System.out.println("Student updated successfully.");
					return;
				}
			}
			System.out.println("Student with ID " +idToUpdate + "not found");
		}
		
		
			//delete Students
		public void deleteStudent()
		{
			System.out.println("Enter ID of student to delete");
			int idToDelete=sc.nextInt();
			
			sc.nextLine();
			
			if(students.removeIf(s -> s.getId() == idToDelete))
			{
				System.out.println("Student deleted successfully.");
			}
			else {
				System.out.println("Student with ID " +idToDelete + "not found.");
			}
		}
		
		
			//		main loop
		public void run()
		{
			int choice;
			do {
				System.out.println("\n--- Student Management System ---");
				System.out.println("1. Add Student");
				System.out.println("2. View Students.");
				System.out.println("3. Update Students.");
				System.out.println("4. Delete Student");
				System.out.println("5. Exit");
				
				System.out.println("Enter your choice : ");
				choice=sc.nextInt();
				
				sc.nextLine();
				
				switch(choice)
				{
					case 1:
						addStudent();
						break;
					
					case 2:
						viewStudents();
						break;
						
					case 3:
						updateStudent();
						break;
						
					case 4:
						deleteStudent();
						break;
						
					case 5:
						System.out.println("Exiting program");
						break;
						
					default:
						System.out.println("Invalid choice. Please try again");
				}
			}while(choice!=5);
		}
		
		public static void main(String[] args) {
			StudentManager manager=new StudentManager();
			manager.run();
		}

}
