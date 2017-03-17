package Computer;



public class Computer {
private Program program;
private Memory memory;

public Computer (Memory memory){
	this.memory = memory;
}

public void load(Program program){
	this.program = program;
}

public void run(){
	program.run(memory);
}
}
