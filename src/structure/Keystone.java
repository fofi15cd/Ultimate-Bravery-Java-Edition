package structure;

public class Keystone extends Rune
{

	
	private static final String PATH = "image\\runes\\keystones\\";
	
	public Keystone(String name)
	{
		super(name);
		super.setPath(PATH);
	}
	
	
	@Override
	public String toString()
	{
		return this.getName();
	}

}
