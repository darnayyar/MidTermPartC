/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermexam_versiona_extensioncode;
import java.util.Scanner;

/**
 *
 * @author brinx
 */
public class TestUserProfile {
    public static void Main(String[] args)
    {
        Scanner keyboard=new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name=keyboard.nextLine();
        UserProfile prof=new UserProfile(name, "");
        
        int choice=keyboard.nextInt();
        prof.setGenre(choice);
    }
}
