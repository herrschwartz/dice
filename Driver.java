import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Driver {

	public static void main(String[] args){

		
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						MainFrame frame = new MainFrame();
						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});


		
		Dice die = new Dice();
		int arr[] = new int[10];
		int i=0;
		while(i<10)
		{
			arr[i] = die.d6(1);
			i++;
		}
		
		Dice die2 = new Dice();
		int arr2[] = new int[10];
		int a=0;
		while(a<10)
		{
			arr2[a] = die2.d8(0);
			a++;
		}

		printAr(arr2);
		System.out.println(" \n");
		printAr(arr);
		System.out.println("the D6+1 average is: " + average(arr));
		System.out.println("the D8 average it: " +average(arr2));
	}
	
	public static void printAr(int arr[]){
		int i=0;
		while (i<arr.length){
			System.out.println(arr[i]);
			i++;
		}
		
	}
	
	public static double average(int arr[]){
		int i = 0;
		double sum=0;
		while(i<arr.length){
			sum += arr[i];
			i++;
		}
		return sum/arr.length;
	}
	
	public static void GenRolls (int amount, int type, int mod){
		
	}
	


}