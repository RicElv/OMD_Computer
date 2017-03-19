package Instructions;

import Computer.Address;
import Computer.Memory;
import Computer.Operand;
import Computer.ProgramCounter;
import Computer.Word;

public class Copy implements Instruction{
	Operand operand;
	Address address;
	
	public Copy(Operand operand, Address address){
		this.operand = operand;
		this.address = address;
	}
	
	@Override
	public void execute(ProgramCounter pc, Memory memory){
		Word result = memory.newWord(address);
		result.copy(operand.getWord(memory));
	}
	
	public String toString(){
		return "CPY " + operand.toString() + " " + address.toString();
	}
}
