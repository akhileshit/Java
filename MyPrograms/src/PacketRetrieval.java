import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class PacketRetrieval {
	public static void main(String[] args) {
		try {
			File file = new File("packetsInput.txt");
			Scanner sc = new Scanner(file);
			
			int n = sc.nextInt();
			sc.nextLine();
			
			Set<Messager> packets = new TreeSet<>();
			for (int i=0; i<n; i++) {
				String[] rawInput  = sc.nextLine().split(" ");
				String messageId = rawInput[0];
				int seq =  Integer.parseInt(rawInput[1]);
				int packetCount = Integer.parseInt(rawInput[2]);
				String message = rawInput[3];
				
				Messager packet = new Messager(messageId, seq, packetCount, message);
				packets.add(packet);
			}
			
			
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}	
}

class Messager implements Comparable<Messager>{
	String messageId;
	int seq;
	int packetCount;
	String message;
	
	public Messager(String messageId, int seq, int packetsCount, String message) {
		this.messageId = messageId;
		this.seq = seq;
		this.packetCount = packetsCount;
		this.message = message;
	}

	@Override
	public int compareTo(Messager other) {
		// TODO Auto-generated method stub
		return messageId.compareTo(other.messageId);
	}
	
}