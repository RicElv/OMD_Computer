package Computer;

public class LongMemory extends Memory{
	int size;
	
	LongMemory(int size){
		super(size);
	}
	
	@Override
	public Word[] setMemory(int size){
		return new LongWord[size];
	}
	
	@Override
	public Word setWord() {
    	return new LongWord(0);
    }

}
