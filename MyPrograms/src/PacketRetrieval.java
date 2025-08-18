import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
			
			Map<String, ArrayList<PacketInfo>> idMap = new HashMap<>();
			for (int i=0; i<n; i++) {
				String[] rawInput  = sc.nextLine().split(" ");
				String messageId = rawInput[0];
				int seq =  Integer.parseInt(rawInput[1]);
				int packetCount = Integer.parseInt(rawInput[2]);
				String message = rawInput[3];
				
				PacketInfo packetInfo = new PacketInfo(seq, packetCount, message);
				
				if (!idMap.containsKey(messageId)) idMap.put(messageId, new ArrayList<PacketInfo>());
				idMap.get(messageId).add(packetInfo);
			}
				
			ArrayList<String> idList = new ArrayList<>();
			idList.addAll(idMap.keySet());
			Collections.sort(idList);
			for (String id : idList) {
				ArrayList<PacketInfo> packetInfoList = idMap.get(id);
				int missingCount = packetInfoList.get(0).packetCount - packetInfoList.size();
				if (missingCount != 0) {
					System.out.println(id + " MISSING " + missingCount);
				} else {
					String reconstructedText = "";
					Collections.sort(packetInfoList);
					for (PacketInfo packetInfo: packetInfoList) {
						reconstructedText += packetInfo.message;
					}
					System.out.println(id + " OK " + reconstructedText);
				}
			}
			
			
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}	
}

class PacketInfo implements Comparable<PacketInfo>{
	int seq;
	int packetCount;
	String message;
	
	public PacketInfo(int seq, int packetCount, String message) {
		this.seq = seq;
		this.packetCount = packetCount;
		this.message = message;
	}
	
	@Override
	public String toString() {
		return "{seq: " + seq + ", packetCount: " + packetCount + ", message: " + message + "}";
	}
	
	@Override
	public int compareTo(PacketInfo other) {
		return Integer.compare(this.seq, other.seq);
	}
}