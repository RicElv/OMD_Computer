package Instructions;

public class JumpEq implements Command{
private Operand operand1, operand2;
private int index;
	
	public JumpEq(int index,Operand operand1, Operand operand2){
		this.index = index;
	}
	public void execute(ProgramCounter pc, Memory memory){
		
	}
	
	public String toString(){
		
	}
}
