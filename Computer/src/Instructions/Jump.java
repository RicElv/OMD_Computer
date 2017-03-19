package Instructions;

import Computer.Memory;
import Computer.ProgramCounter;

public class Jump implements Instruction{
	private int index;
	
	public Jump(int index){
		this.index = index;
	}
	
	public void execute(ProgramCounter pc, Memory memory){
		pc.jumpTo(index);
	}
	
	public String toString(){
		return "JMP " + index;
	}

	
}
