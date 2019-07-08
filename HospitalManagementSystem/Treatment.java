package HospitalManagementSystem;

import java.util.Scanner;

public class Treatment {
    String name,problem,doc,cond;
    int id,date,choice;
    float fee,total_fee,med;
    Scanner sc=new Scanner(System.in);
    public void PatientInfo()
    {
        System.out.println("enter patient name,id,date,problem:");
        name=sc.next();
        id=sc.nextInt();
        date=sc.nextInt();
        problem=sc.next();
        System.out.println("the patient information :");
        System.out.println("Name:"+name);
        System.out.println("id:"+id);
        System.out.println("date"+date);
        System.out.println("problem"+problem);
    }
    public void Info()
    {
        System.out.println("Enter fee,doc,cond,med:");
        fee = sc.nextInt();
        doc = sc.next();
        cond = sc.next();
        med = sc.nextInt();
        System.out.println("fee:" +fee);
        System.out.println("doc:" +doc);
        System.out.println("cond:" +cond);
        System.out.println("med:" +med);
        total_fee=med+fee;
    }
    public void show()
    {
        System.out.println("the patient information :");
        System.out.println("Name:"+name);
        System.out.println("id:"+id);
        System.out.println("date"+date);
        System.out.println("problem"+problem);
        System.out.println("fee:" +fee);
        System.out.println("doc:" +doc);
        System.out.println("cond:" +cond);
        System.out.println("med:" +med);
        System.out.println("Total fee::"+total_fee);
    }
    public void menu() {
        System.out.println("1.PatientInfo 2.Info 3.show 4.exit");
        System.out.println("Enter your choice");
        choice = sc.nextInt();
        switch (choice) {
            case 1:
                PatientInfo();
                break;
            case 2:
                Info();
                break;
            case 3:
                show();
                break;
            case 4:
                break;
        }
    }

        }



