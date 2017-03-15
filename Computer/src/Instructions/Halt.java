package Instructions;

import Computer.Memory;

public class Halt implements Command{

	
	public void execute(ProgramCounter pc, Memory memory) {
	
		pc.halt();

	}
	
	public String toString(){
		
		return "HALT";
		
	}

}
