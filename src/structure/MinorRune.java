package structure;

public class MinorRune extends Rune
{
	private static final String PATH = "images\\runes\\minor runes\\";

	public MinorRune(String name)
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
