package Instructions;

import Computer.Address;
import Computer.Memory;
import Computer.Operand;
import Computer.ProgramCounter;
import Computer.Word;

public abstract class Operation implements Instruction{
	private Operand operand1, operand2;
	private Address address;
	
Operation(Operand operand1, Operand operand2, Address address){
	this.operand1 = operand1;
	this.operand2 = operand2;
	this.address = address;
}

public abstract void operate(Word word, Word word1, Word word2);
public abstract String operationString();

@Override
public void execute(ProgramCounter pc, Memory memory){
	Word result = memory.getWord(address); 
	operate(result,operand1.getWord(memory),operand2.getWord(memory));
}

@Override
public String toString(){
	return operationString() + operand1.toString() +" " + operand2.toString() + " "
		   + address.toString();
}
	
}
