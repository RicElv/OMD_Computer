package Instructions;

import Computer.Address;
import Computer.Operand;
import Computer.Word;

public class Add extends Operation{
	public Add(Operand operand1, Operand operand2, Address address){
		super(operand1,operand2,address);
	}


	@Override
	public void operate(Word word, Word word1, Word word2) {
		word.add(word1, word2);
	}

	@Override
	public String operationString() {
		return "ADD " ;
	}


	
}
