package Computer;

public abstract class Memory {
	private Word[] memory;

	public abstract Word[] setMemory();
	
	public Memory(){
		memory = setMemory();
	}
	
	public void getWord(Address adress){
		
	}
}
