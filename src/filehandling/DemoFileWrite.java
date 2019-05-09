/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package filehandling;

/**
 *
 * @author Nikhil
 */
import java.io.FileOutputStream;
import java.io.IOException;
public class DemoFileWrite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FileOutputStream fout=null;
        int ch=0;
        
        try{
            fout=new FileOutputStream("f:\\program java\\DFW.txt");
            System.out.println("enter some text (press '*' to end)");
            for(; ch!='*';){
               ch= System.in.read();
                fout.write(ch);
                
                    
            } 
            fout.close();
            System.out.println("file created successfully");
        }
        catch(IOException ex){
            
        }
    }
}
