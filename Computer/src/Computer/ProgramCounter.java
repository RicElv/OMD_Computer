package Computer;

public class ProgramCounter {
	int index;

	ProgramCounter(){
		index = 0;
	}
	
	public void jumpTo(int index){
		this.index = index;
	}
	
	public void advance(){
		index++;
	}
	
	public void finish(){
		index = -1;
	}
	
	public int getCount(){
		return index;
	}
}
