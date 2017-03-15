package Instructions;

import Computer.Memory;
import Computer.ProgramCounter;

public class Jump implements Command{
	private int index;
	
	public Jump(int index){
		this.index = index;
	}
	
	public void execute(ProgramCounter pc, Memory memory){
		pc.jumpTo(index - 1);
	}
	
	public String toString(){
		return "JUMP " + String.valueOf(index);
	}

	
}
