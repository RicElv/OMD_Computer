package Instructions;

import Computer.Memory;
import Computer.ProgramCounter;

public interface Instruction {
	
public void execute(ProgramCounter pc, Memory memory);
public String toString();

}
