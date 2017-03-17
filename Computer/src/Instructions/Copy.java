package Instructions;

import Computer.Address;
import Computer.Memory;
import Computer.Operand;
import Computer.ProgramCounter;
import Computer.Word;

public class Copy implements Command{
	Operand operand1,operand2;
	Address address;
	
	public Copy(Operand operand1, Operand operand2){
		this.operand1 = operand1;
		this.operand2 = operand2;
	}
	
	@Override
	public void execute(ProgramCounter pc, Memory memory){
		operand2.getWord(memory).copy(operand1.getWord(memory));
	}
	
	public String toString(){
		return "CPY " + operand1.toString() + " " + operand2.toString();
	}
}
