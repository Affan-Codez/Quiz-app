import java.util.Scanner;
import java.io.FileWriter;
import java.io.File;

class User{
   Scanner scn = new Scanner(System.in);


   void Student_login(){
       int length = 0;
       try{
           System.out.println("enter your roll number :");
           String roll_no = scn.nextLine();

           System.out.println("enter your password :"); 
           String password = scn.nextLine();
           scn.close();
           
           File newfile = new File(roll_no+".txt");
           if (newfile.exists()) 
           {
                Scanner data = new Scanner(newfile);
                String data_raw = data.nextLine();
                String[] newdata = data_raw.split(",");
                for(String datalocal : newdata){
                    length+=1;
                }
                data.close();

                for(int i = 0 ; i < length ; i++){
                    if ((roll_no.equals(newdata[i])) && (password.equals(newdata[i+1]))) {
                        System.out.println("Welcome "+newdata[i + 2]);   
                        break;
                    }
                    else{
                        System.out.println("Input Valid Information");
                        break;
                    }
                }
            }
           else{
            System.out.println("please input correct roll number or password");
           }
       }
       catch(Exception e){
           System.out.println("error occured");
       }

   }
   void Student_SignUp(){
        try{
            System.out.println("input your roll number :");
            String roll_no = scn.nextLine();
            System.out.println("Enter a strong password");
            String password = scn.nextLine();
            File newfile = new File(roll_no+".txt");
            if (!newfile.exists()) {
                System.out.println("enter your name :");
                String name = scn.nextLine();
                System.out.println("enter your favourite food to eat :");
                String food_name = scn.nextLine();
                newfile.createNewFile();
                FileWriter updatedFile = new FileWriter(newfile);
                updatedFile.write(roll_no+","+password+","+name+","+food_name);
                updatedFile.close();
                System.out.println("you have been registered successfully");
                //System.out.println(newfile.getName());03   
            }
            else{
                System.out.println("You are already registered");
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
   }

   void forget_password(){
        int length=0;

        System.out.println("Do you want to reset your password?");
        String answer = scn.nextLine();
        try{
            if (answer.equals("yes")) {
                System.out.println("enter your roll number :");
                String roll_no = scn.nextLine();
                System.out.println("enter your favourite food to eat :");
                String food_name = scn.nextLine();
                File newFile = new File(roll_no+".txt");
                Scanner updatedFile = new Scanner(newFile);
                String data_raw = updatedFile.nextLine();
                updatedFile.close();
                String[] newdata = data_raw.split(",");

                for(String datalocal : newdata){
                    length+=1;
                }

                for(int i = 0 ; i < length ; i++){
                    if ((roll_no.equals(newdata[i])) && (food_name.equals(newdata[i+3]))) {
                        System.out.println("Welcome "+newdata[i + 2]);
                        System.out.println("Enter a new password :");
                        String password = scn.nextLine();
                        System.out.println("Confirm your new password :");
                        String Confirm_password = scn.nextLine();

                        while(password.equals(Confirm_password)){
                            if (!password.equals(Confirm_password)) {
                                System.out.println("reenter your password");
                                System.out.println("Confirm your new password :");
                                String Confirm_password1 = scn.nextLine();
                                Confirm_password = Confirm_password1;
                            }
                            else{
                                newdata[i + 1] = password;
                                String name = newdata[i + 2];
                                File newFile2 = new File(roll_no+".txt");
                                FileWriter updatedFile2 = new FileWriter(newFile2);
                                updatedFile2.write(roll_no+","+password+","+name+","+food_name);
                                updatedFile2.close();
                
                                System.out.println("your password has been changed");
                                break;
                            
                            }
                        }
                        break;
                    }
                    else{
                        System.out.println("Input Valid Information");
                        break;
                    }
                }
                
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
   }
}
public class project{
   public static void main(String[] args) {
       User s1 = new User();
       s1.forget_password();
       
   }
}