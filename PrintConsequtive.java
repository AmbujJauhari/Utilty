import java.io.*;
import java.util.*;
import java.lang.*;

class ConsequetiveString {

    public void printCons(String str) {
        System.out.print(str.charAt(0));
        for(int i=1;i<str.length();i++) {
            
           
            if(str.charAt(i) == (str.charAt(i-1) + 1) || str.charAt(i) == (str.charAt(i-1) - 1)) {
                System.out.print(str.charAt(i));
            } else {
                
                System.out.print("\n"+ str.charAt(i));
            }
        }
    }
    
    public static void main(String[] args) {
        ConsequetiveString ct = new ConsequetiveString();
        ct.printCons("ABCZYXACCD");
    }
}

