package test;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;
public class exp10_diget_of_sha1 {
	 public static void main(String[] args) {

	        try {
	            Scanner sc = new Scanner(System.in);
	            System.out.print("Enter the message: ");
	            String message = sc.nextLine();

	            MessageDigest sha1 = MessageDigest.getInstance("SHA-1");

	            byte[] messageBytes = message.getBytes();
	            byte[] digestBytes = sha1.digest(messageBytes);

	            StringBuilder hexString = new StringBuilder();
	            for (byte b : digestBytes) {
	                hexString.append(String.format("%02x", b));
	            }

	            System.out.println("Message: " + message);
	            System.out.println("SHA-1 Digest: " + hexString.toString());

	            sc.close();

	        } catch (NoSuchAlgorithmException e) {
	            System.err.println("SHA-1 algorithm not found!");
	        }
	    }

}
