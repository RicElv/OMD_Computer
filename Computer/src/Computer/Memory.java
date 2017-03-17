package Computer;

public abstract class Memory {
	private Word[] memory;

	public abstract Word[] setMemory(int size);
	public abstract Word setWord();
	
	public Memory(int size){
		this.memory =  setMemory(size); 	
	}
	
	public Word getWord(Address adress){
		return memory[adress.getIndex()];
	}
	
	 public Word newWord(Address address) {
	     return memory[address.getIndex()] = setWord();
	}
	
}
