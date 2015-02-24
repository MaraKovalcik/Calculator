/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUI;

/**
 *
 * @author student
 */
import java.util.Arrays;

public class Prevody {
    static char[] n = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F',};
    public static String decToBin(int decNumber){
        String result="";
        while(decNumber > 0){
         result = String.valueOf(decNumber % 2) + result;
         decNumber = decNumber/2;
            
        }
        
        return result;
    } 

public static int binToDec(String binNumber){
    int num;
    int result = 0;
    for(int i = 0;i < binNumber.length();i++) {
        num = binNumber.charAt(binNumber.length()-i-1)-48;
     result += num * Math.pow(2, i);
             }
    return result;
}
    public static String decToOther(int decNumber, int base){
        String result="";
        int number;
        while(decNumber > 0){
         number = decNumber % base;
         result = n[number] + result;
         decNumber = decNumber/base;          
        }
        
        return result;
    } 

public static int otherToDec(String otherNumber,int base){
    int num;
    int result = 0;
    otherNumber = otherNumber.toUpperCase();
    for(int i = 0;i < otherNumber.length();i++) {
        num = Arrays.binarySearch(n,0,n.length,otherNumber.charAt(otherNumber.length()-i-1));
     result += num * Math.pow(base, i);
             }
    return result;
    

}

public static String convertNumber(String number,int inputBase,int outputBase){
    int num = Prevody.otherToDec(number, inputBase);
    return Prevody.decToOther(num, outputBase);
    
    
}

    public static boolean isValidNumber(String number,int base){
        for(int i = 0;i < number.length();i++) {
        if(Arrays.binarySearch(n,0,base,number.toUpperCase().charAt(i))<0)
            return false;
             }
        return true;
    }





}
