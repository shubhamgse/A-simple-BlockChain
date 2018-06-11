package easyChain;
import java.util.Date;

/*This is class Block made for basic block implementation and is used by
 *other classes to use get and set methods for block data and to calculate hash*/ 

public class Block {
	
	public String hash;			//Stores hash of current block
	public String previousHash;	//Stores hash of previous block
	public String data;			//data will be simple message
	public long timeStamp;		//Stores time stamp of the block 
	
	
	public Block(String data, String previousHash){ //Per block method
		
		this.data = data;
		this.previousHash = previousHash;
		this.timeStamp = new Date().getTime();
		this.hash = calculateHash();
		
		
	}
	
	public String calculateHash(){	//Per block method which calculates hash by making use of StringUtil class and its method
		
		String calculatedHash = StringUtil.applySha256(
				previousHash + data + Long.toString(timeStamp));
		
		return calculatedHash;
	}
	
	

}
