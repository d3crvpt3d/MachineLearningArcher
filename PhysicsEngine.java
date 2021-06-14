import java.io.PrintStream;
import java.io.IOException;
import java.io.File;

import java.util.Random;

public class PhysicsEngine
{
	/**
	 * Variable Initializing
	 */
	private int anzahl = 10; //Anzahl der 'archers' pro Generation
	private float wind = 0f; //Wind m/s (height == 20m)
	private float g = 9.81f; //EngineBeschleunigung m/s^2



	/**
	 * Variable Declaration
	 */
	private Archer[] archer = new Archer[anzahl];



	/**
	 * Main
	 * @param args
	 */
	public static void main(String[] args)
	{	
		new Archer();
		new PhysicsEngine();
	}



	/**
	 * Constructor
	 */
	public PhysicsEngine()
	{
		for(int i = anzahl; i < archer.length; i++)
		{
			archer[i] = new Archer(); //Instanzen der Klasse erstellen
			archer[i].setG(g); //Einsetzen der EngineBeschleunigung

			System.out.println("archers loadet: "+ i); //DEBUG
		}


	}

	
	
	/**
	 * Output
	 */
	public void OutputMethod()
	{
		try
		{	PrintStream writer = new PrintStream( new File("output.txt"));
			writer.println("test123");
			writer.close();
		
		}
		catch(IOException e)
		{
			System.out.println("An error occured while trying to write to the file");
		}
	}
}