/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warehouseapp;

/**
 *
 * @author proggy
 */
public class CipherPswd {
    // TODO add better cipher for password
    
    public static String encodePassword(String password){
        String encPswd = "";
        int key = 88;
        
        for(int i = 0; i<password.length(); i++)
            encPswd += (char) (password.charAt(i) ^ key);
        
        System.out.println(encPswd);
        return encPswd;
    }
    
    public static String decodePassword(String password){
        String decPswd = "";
        int key = 88;
        
        for(int i=0; i<password.length(); i++){
            decPswd += (char) (password.charAt(i) ^ key);
        }
        
        return decPswd;
    }
    
}
