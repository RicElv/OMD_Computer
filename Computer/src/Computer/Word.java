package Computer;

public interface Word extends Operand{
	
public void add(Word word1, Word word2);
public void mul(Word word1, Word word2);
public void copy(Word word);
public boolean equals(Word word);
public long getValue();
}
