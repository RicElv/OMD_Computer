package Instructions;

import Computer.Memory;
import Computer.ProgramCounter;

public class Halt implements Command{

	
	public void execute(ProgramCounter pc, Memory memory) {
		pc.finish();
	}
	
	public String toString(){
		return "HLT";
	}

}
