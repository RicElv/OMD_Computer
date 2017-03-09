package Computer;

public class LongMemory extends Memory{
	int size;
	
	LongMemory(int size){
		this.size = size;
	}
	
	public Word[] setMemory(){
		return new LongWord[size];
	}

}
