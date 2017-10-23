import java.util.*;
import javax.swing.*;  
import java.io.*;

interface Command {
    void runCommand();
}

public class GuessGame {
    public static String saveFileName = "score.dat";
    public static void play(int max) throws Exception {  
        JFrame f = new JFrame();   

        Map<Integer, Command> methodMap = new HashMap<Integer, Command>();

        methodMap.put(0, new Command() {
            public void runCommand() { JOptionPane.showMessageDialog(f, "yeeeee u win");   };
        });

        methodMap.put(1, new Command() {
            public void runCommand() { JOptionPane.showMessageDialog(f, "Smaller");   };
        });

        methodMap.put(-1, new Command() {
            public void runCommand() { JOptionPane.showMessageDialog(f, "Bigger");   };
        });

        Random rand = new Random();
        //max is the maximum and the 1 is our minimum 
        int rand_generated = rand.nextInt(max) + 1;
        
        JOptionPane.showMessageDialog(f, "Hello, to guess game.");  
        JOptionPane.showMessageDialog(f, "Guess a number beetwin 1 and " + Integer.toString(max));  
        int userNumber = -1;
        int trials = 0;
        do {
            String numberStr = JOptionPane.showInputDialog(f, "Enter your guess");
            try { 
                userNumber = Integer.parseInt(numberStr);
            } catch(Exception e) { 
                JOptionPane.showMessageDialog(f, "Please enter integer value"); 
                continue;
            }
            
            int cmp = Integer.compare(userNumber, rand_generated);
            methodMap.get(cmp).runCommand();
            ++trials;
        } while (userNumber != rand_generated);

        double score = max/trials;
        File saveFile = new File(saveFileName); 
        if (!saveFile.exists())
        { 
            FileOutputStream fout = new FileOutputStream(saveFileName, false);
            ObjectOutputStream oos = new ObjectOutputStream(fout);
            oos.writeObject(0.0);         
        }
        
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(saveFileName));
        Double bestScore = (Double)ois.readObject();
        if (score >bestScore)
        {
            FileOutputStream fout = new FileOutputStream(saveFileName, false);
            ObjectOutputStream oos = new ObjectOutputStream(fout);
        
            oos.writeObject(score);
        }       
        return;

    }

    public static void printBestScore() throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(saveFileName));
        JFrame f = new JFrame();   
        JOptionPane.showMessageDialog(f, "Best Score " + Double.toString((Double)ois.readObject()));  
        return;
    }

    
    public static void main(String[] args) throws Exception {
        play(2);
        printBestScore();   
        System.exit(0);
    }
}