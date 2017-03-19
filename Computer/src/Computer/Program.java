package Computer;

import java.util.ArrayList;

import Instructions.Instruction;

public abstract class Program extends ArrayList<Instruction>{
	private ProgramCounter pc;
	private StringBuilder sb;
	int index;
	
	public Program(){
		pc = new ProgramCounter();
		sb = new StringBuilder();
		index = 0;
	}
	
	public void run(Memory memory){
		while(pc.getCount() != -1){
			Instruction instruction = get(pc.getCount());
			pc.advance();
			instruction.execute(pc, memory);
		}
	}
	
	public String toString(){
		for(int i = 0; i < this.size(); i++){
			sb.append(index++ + " " + get(i).toString() + System.lineSeparator());
		}
		return sb.toString();
	}
}
