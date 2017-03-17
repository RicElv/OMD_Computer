package Computer;

import java.util.ArrayList;

import Instructions.Command;

public abstract class Program extends ArrayList<Command>{
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
			Command command = get(pc.getCount());
			pc.advance();
			command.execute(pc, memory);
		}
	}
	
	public String toString(){
		for(int i = 0; i < this.size(); i++){
			sb.append(System.lineSeparator() + index++ + " " + get(i).toString());
		}
		return sb.toString();
	}
}
