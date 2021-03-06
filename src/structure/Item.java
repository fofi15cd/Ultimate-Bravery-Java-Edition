package structure;

public class Item
{
	/**
	 * Path of the items' images
	 */
	private String PATH = "images\\items\\";

	/**
	 * Name of the item
	 */
	private String name;

	/**
	 * Name of the image of the item
	 */
	private String imgName;

	/**
	 * Path of the image of the item
	 */
	private String imgPath;

	/**
	 * Creates a new item
	 * 
	 * @param name : name of the item
	 * @param rangeType : range type of the item
	 */
	public Item(String name)
	{
		
		this.name = name;
		this.imgName = name + ".png";
		setPath(PATH);
	}

	/**
	 * Sets the path of the item's image
	 */
	protected void setPath(String path)
	{
		this.imgPath = path + imgName;
	}

	/**
	 * Returns the path of the item's image
	 * 
	 * @return the path of the item's image
	 */
	public String getImgPath()
	{
		return this.imgPath;
	}

	/**
	 * Returns the name of the item
	 * 
	 * @return the name of the item
	 */
	public String getName()
	{
		return this.name;
	}
	
	/**
	 * Returns the name of the image of the item
	 * 
	 * @return the name of the image of the item
	 */
	public String getImgName()
	{
		return this.imgName;
	}

	/**
	 * Returns the name of the item
	 * 
	 * @return the name of the item
	 */
	@Override
	public String toString()
	{
		return getName();
	}
}
