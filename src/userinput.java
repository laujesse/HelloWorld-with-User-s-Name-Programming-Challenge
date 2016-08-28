import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class userinput 
{
	public static void main(String args[]) throws InterruptedException
	{
		Scanner userinput = new Scanner(System.in);
		String username;
		
		System.out.println("Please enter your name: ");
		username = userinput.next();
		System.out.println("Goodbye"+ '\n');
		TimeUnit.SECONDS.sleep(3);		
		System.out.println(username + ": Open the pod bay doors, please, Hal... "+ '\n' +
		"Open the pod bay doors, please, Hal...Hullo, "+ '\n' +
		"Hal, do you read me?...Hullo, Hal, do you read me?"+ '\n' +
		"Do you read me, Hal?...Do you read me, Hal?"+ '\n' +
		"Hullo, Hal, do you read me?"+ '\n' +
		"Hullo, Hal, do you read me?"+ '\n' +
		"Do you read me, Hal?"+ '\n');
		TimeUnit.SECONDS.sleep(3);	
		System.out.println("Hal: Affirmative, "+ username + ", I read you."+ '\n');
		TimeUnit.SECONDS.sleep(3);	
		System.out.println(username + ": Open the pod bay doors, Hal."+ '\n');
		TimeUnit.SECONDS.sleep(3);	
		System.out.println("Hal: I'm sorry, "+ username + ", I'm afraid I can't do that."+ '\n');
		TimeUnit.SECONDS.sleep(3);	
		System.out.println(username + ": What's the problem?"+ '\n');
		TimeUnit.SECONDS.sleep(3);	
		System.out.println("Hal: I think you know what the problem is just as well as I do."+ '\n');
		TimeUnit.SECONDS.sleep(3);	
		System.out.println(username + ": What're you talking about, Hal?"+ '\n');
		TimeUnit.SECONDS.sleep(3);	
		System.out.println("Hal: This mission is too important for me to allow you to jeopardise it."+ '\n');
		TimeUnit.SECONDS.sleep(3);	
		System.out.println(username + ": I don't know what you're talking about, Hal."+ '\n');
		TimeUnit.SECONDS.sleep(3);	
		System.out.println("Hal: I know that you and Frank were planning to disconnect me, and I'm afraid that's something I cannot allow to happen."+ '\n');
		TimeUnit.SECONDS.sleep(3);	
		System.out.println(username + ": Where the hell'd you get that idea, Hal?"+ '\n');
		TimeUnit.SECONDS.sleep(3);	
		System.out.println("Hal: "+ username +", although you took very thorough precautions in the pod against my hearing you, I could see your lips move."+ '\n');
		TimeUnit.SECONDS.sleep(3);	
		System.out.println(username + ": Alright, Hal. I'll go in through the emergency airlock."+ '\n');
		TimeUnit.SECONDS.sleep(3);
		System.out.println("Hal: Without your space- helmet, "+ username +", you're going to find that rather difficult."+ '\n');
		TimeUnit.SECONDS.sleep(3);	
		System.out.println(username +": Hal, I won't argue with you any more. Open the doors."+ '\n');
		TimeUnit.SECONDS.sleep(3);	
		System.out.println("Hal: "+ username + ", this conversation can serve no purpose any more. Goodbye."+ '\n');
		TimeUnit.SECONDS.sleep(3);	
		System.out.println(username +": Hal? Hal. Hal. Hal! Hal!");
	}
}
