/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookstore;

/**
 *
 * @author ali05
 */
public abstract class User {
    String username;
    String password;
    int points;
    
    
    public String getUsername(){
        return this.username;
    }
    
    public boolean verifyPassword(String pass){
        return false;
    }
    
}
