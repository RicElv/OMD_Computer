package Instructions;

import Computer.Memory;
import Computer.Operand;
import Computer.ProgramCounter;

public class JumpEq implements Command{
	private Operand operand1, operand2;
	private int index;

	public JumpEq(int index,Operand operand1, Operand operand2){
		this.index = index;
		this.operand1 = operand1;
		this.operand2 = operand2;
	}
	public void execute(ProgramCounter pc, Memory memory){

		if (operand1.getWord(memory).equals(operand2.getWord(memory))) {
			pc.jumpTo(index - 1);
		}
	}

	public String toString(){
		return "JUMPEQ " + String.valueOf(index) + " [" + operand1.toString() + "] "
				+ operand2.toString();
	}

}

