package easyChain;
import java.util.Date;

public class Block {
	
	public String hash;
	public String previousHash;
	public String data;	//data will be simple message
	public long timeStamp;
	
	
	public Block(String data, String previousHash){
		
		this.data = data;
		this.previousHash = previousHash;
		this.timeStamp = new Date().getTime();
		this.hash = calculateHash();
		
		
	}
	
	public String calculateHash(){
		
		String calculatedHash = StringUtil.applySha256(
				previousHash + data + Long.toString(timeStamp));
		
		return calculatedHash;
	}
	
	

}
