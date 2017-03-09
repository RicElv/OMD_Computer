package Instructions;

public abstract class Calc implements Command{
	private Operand operand1, operand2;
	private Address address;
	
Calc(Operand operand1, Operand operand2, Address address){
	this.operand1 = operand1;
	this.operand2 = operand2;
	this.address = address;
}

public abstract void action(Word word, Word word1, Word word2);
public abstract String actionString();

public void execute(ProgramCounter pc, Memory memory){
	
}

public String toString(){
	
}
	
}
