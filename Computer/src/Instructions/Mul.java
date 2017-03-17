package Instructions;

import Computer.Address;
import Computer.Operand;
import Computer.Word;

public class Mul extends Calc{
	
	public Mul(Operand operand1, Operand operand2, Address address){
		super(operand1,operand2,address);
	}


	@Override
	public void action(Word word, Word word1, Word word2) {
		word.mul(word1, word2);
	}

	@Override
	public String actionString() {
		return "MUL " ;
	}
}
