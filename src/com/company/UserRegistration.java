package com.company;

public class UserRegistration {

    private static int id;
    private String Name;
    private String email;
    private String Username;
    private String Password;


    public  UserRegistration(String name, String email, String username, String password)
    {
        this.id += 1;
        this.Name = name;
        this.email = email;
        this.Username = username;
        this.Password = password;
    }

    public static int getId() {
        return id;
    }

    public String getName() {
        return Name;
    }

    public String getEmail() {
        return email;
    }

    public String getUsername() {
        return Username;
    }

    public String getPassword() {
        return Password;
    }
    public void passwordLengthChecker(String Password)
    {
        if(Password.length() < 8 || Password.length() > 16)
        {
            System.out.println("Your password is incorrect");
        }
        else
        {
            System.out.println("Successfully Logged In");
        }
//        static boolean email(String email) {
//        return email.matches("[A-Z0-9._%+-][A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{3}");
//    }
        }
    public void showinfo()
    {
        System.out.println(Name);
        System.out.println(email);
        System.out.println(Username);
        System.out.println(Password);

    }
}
