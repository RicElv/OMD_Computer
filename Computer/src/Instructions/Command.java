package Instructions;

public interface Command {
	
public void execute(ProgramCounter pc, Memory memory);
public String toString();

}
