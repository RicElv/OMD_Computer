package Instructions;

import Computer.Memory;
import Computer.Operand;
import Computer.ProgramCounter;

public class Print implements Command{
	
	Operand operand;
	
	public Print(Operand operand){
		this.operand = operand;
	}

	public void execute(ProgramCounter pc, Memory memory) {
		System.out.println("\n" + operand.getWord(memory).toString());
	}
	
	public String toString(){
		return "PRT " + operand.toString() + " ";
	}
}
