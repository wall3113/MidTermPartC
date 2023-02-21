/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;

/**
 *
 * @author walla
 */
import java.util.Scanner;

public class TestUserprofile {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        System.out.println("Choose your favourite genre from the following options:");
        String[] genres = {"Comedy", "Drama", "Action", "Mystery"};
        for (int i = 0; i < genres.length; i++) {
            System.out.println((i+1) + ". " + genres[i]);
        }
        
        System.out.print("Enter the number corresponding to your favourite genre: ");
        int genreIndex = scanner.nextInt();
        String genre = genres[genreIndex-1];
        
        UserProfile userProfile = new UserProfile(name, genre);
        
        System.out.println("User profile created for " + userProfile.getUserID() + " with favourite genre " + userProfile.getGenre() + ".");
    }

}