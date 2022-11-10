package dsaprograms;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExProgram {
    String fName, fullName, mobNum, date;
    Scanner sc = new Scanner(System.in);
    String msg = """
            Hello <<name>>, We have your full name as <<full name>> in our system.\s
            Your contact number is 91-xxxxxxxxxx.\s
            Please,let us know in case of any clarification.\s
            Thank you BridgeLabz 01/01/2016.""";

    public static void main(String[] args) {
        RegExProgram regex = new RegExProgram();
        regex.getYourDetails();
        regex.updateYourDetails("<<name>>", regex.fName);
        regex.updateYourDetails("<<full name>>", regex.fullName);
        regex.updateYourDetails("xxxxxxxxxx", regex.mobNum);
        regex.updateYourDetails("01/01/2016", regex.date);
        System.out.println(regex.msg);
    }
    public void getYourDetails(){
        System.out.println("Enter your First Name: ");
        fName = sc.next();
        System.out.println("Enter your Last Name: ");
        fullName = sc.next();
        System.out.println("Enter your Mobile Number: ");
        mobNum = sc.next();
        System.out.println("Enter Today's Date: ");
        date = sc.next();
    }
    public void updateYourDetails(String changeDetail, String updateDetail){
        Pattern p = Pattern.compile(changeDetail);
        Matcher m = p.matcher(msg);
        msg = m.replaceFirst(updateDetail);
    }

}
