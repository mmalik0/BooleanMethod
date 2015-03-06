import javax.swing.JOptionPane;
import java.util.Scanner;

public class BooleanComp {

	public static void main(String[] args) {
int numPeople , groupSize, numPlayers;
Scanner keyboard = new Scanner(System.in);
Scanner keyboard1 = new Scanner(System.in);
String ppl = JOptionPane.showInputDialog("Please enter the number of People: ");
numPeople = Integer.parseInt(ppl);
String ppl2 = JOptionPane.showInputDialog("Please enter the number of Players: ");
numPlayers = Integer.parseInt(ppl2); 
	if(numPeople >10 ){
	groupSize = numPeople/2;
	JOptionPane.showMessageDialog(null, "Number of Groups : "+ groupSize);
    }
	else if(numPeople >3 && numPeople<=10){ // && = and
		
		groupSize = numPeople/3;
		JOptionPane.showMessageDialog(null,"Number of Groups : "+ groupSize);

	}
	else if (numPeople <3){
		JOptionPane.showMessageDialog(null,"The number of people has to be at least 3." );
	}
	
	if (numPlayers >11 && numPlayers<55){
	int teamSize = numPlayers/11;
	JOptionPane.showMessageDialog(null,"Number of Teams: " + teamSize);
	}
	
	else if(numPlayers <11 || numPlayers >55){  // ||=or
		JOptionPane.showMessageDialog(null,"Number of Teams : 1");
	}
	keyboard.close();
    keyboard1.close();  
 }

}
