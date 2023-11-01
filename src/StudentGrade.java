import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        System.out.println("Nakhon Pathom Vocational College");
        System.out.println("Name : Mr.Kritsanachai Ubonthip");
        System.out.println("Nickname : Phet");
        System.out.println("Student ID : 65309010001");
        System.out.println("----------------------------------");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your GAP : ");
        Integer gpa = sc.nextInt();

        sc.close();
        System.out.println("Result GPA : " + gpa);
        if(gpa >= 80 )
            System.out.println("Grade : A");
        else if(gpa >= 70 && gpa <= 79  )
            System.out.println("Grade : B");
        else if(gpa >= 60 && gpa <= 69  )
            System.out.println("Grade : C");
        else if(gpa >= 50 && gpa <= 59  )
            System.out.println("Grade : D");
        else
            System.out.println("Grade : F");
        

    }
}
