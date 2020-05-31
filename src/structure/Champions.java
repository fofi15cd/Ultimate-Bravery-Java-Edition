package structure;

import java.util.HashMap;

public enum Champions
{
	AATROX("Aatrox", RangeType.MELEE),
	AHRI("Ahri", RangeType.RANGED),
	AKALI("Akali", RangeType.MELEE),
	ALISTAR("Alistar", RangeType.MELEE),
	AMUMU("Amumu", RangeType.MELEE),
	ANIVIA("Anivia", RangeType.RANGED),
	ANNIE("Annie", RangeType.RANGED),
	APHELIOS("Aphelios", RangeType.RANGED),
	ASHE("Ashe", RangeType.RANGED),
	AURELION_SOL("Aurelion Sol", RangeType.RANGED),
	AZIR("Azir", RangeType.RANGED),
	BARD("Bard", RangeType.RANGED),
	BLITZCRANK("Blitzcrank", RangeType.MELEE),
	BRAND("Brand", RangeType.RANGED),
	BRAUM("Braum", RangeType.MELEE),
	CAITLYN("Caitlyn", RangeType.RANGED),
	CAMILLE("Camille", RangeType.MELEE),
	CASSIOPEIA("Cassiopeia", RangeType.RANGED),
	CHO_GATH("Cho\'gath", RangeType.MELEE),
	CORKI("Corki", RangeType.RANGED),
	DARIUS("Darius", RangeType.MELEE),
	DIANA("Diana", RangeType.MELEE),
	DRAVEN("Draven", RangeType.RANGED),
	DR_MUNDO("Dr. Mundo", RangeType.MELEE),
	EKKO("Ekko", RangeType.MELEE),
	ELISE("Elise", RangeType.MIXED),
	EVELYNN("Evelynn", RangeType.MELEE),
	EZREAL("Ezreal", RangeType.RANGED),
	FIDDlESTICKS("Fiddlesticks", RangeType.RANGED),
	FIORA("Fiora", RangeType.MELEE),
	FIZZ("Fizz", RangeType.MELEE),
	GALIO("Galio", RangeType.MELEE),
	GANGPLANK("Gangplank", RangeType.MELEE),
	GAREN("Garen", RangeType.MELEE),
	GNAR("Gnar", RangeType.RANGED),
	GRAGAS("Gragas", RangeType.MELEE),
	GRAVES("Graves", RangeType.RANGED),
	HECARIM("Hecarim", RangeType.MELEE),
	HEIMERDINGER("Heimerdinger", RangeType.RANGED),
	ILLAOI("Illaoi", RangeType.MELEE),
	IRELIA("Irelia", RangeType.MELEE),
	IVERN("Ivern", RangeType.RANGED),
	JANNA("Janna", RangeType.RANGED),
	JARVAN_IV("Jarvan IV", RangeType.MELEE),
	JAX("Jax", RangeType.MELEE),
	JAYCE("Jayce", RangeType.MIXED),
	JHIN("Jhin", RangeType.RANGED),
	JINX("Jinx", RangeType.RANGED),
	KAI_SA("Kai'Sa", RangeType.RANGED),
	KALISTA("Kalista", RangeType.RANGED),
	KARMA("Karma", RangeType.RANGED),
	KARTHUS("Karthus", RangeType.RANGED),
	KASSADIN("Kassadin", RangeType.MELEE),
	KATARINA("Katarina", RangeType.MELEE),
	KAYLE("Kayle", RangeType.MIXED),
	KAYN("Kayn", RangeType.MELEE),
	KENNEN("Kennen", RangeType.RANGED),
	KHA_ZIX("Kha'Zix", RangeType.MELEE),
	KINDRED("Kindred", RangeType.RANGED),
	KLED("Kled", RangeType.MELEE),
	KOG_MAW("Kog'Maw", RangeType.RANGED),
	LEBLANC("LeBlanc", RangeType.RANGED),
	LEE_SIN("Lee Sin", RangeType.MELEE),
	LEONA("Leona", RangeType.MELEE),
	LISSANDRA("Lissandra", RangeType.RANGED),
	LUCIAN("Lucian", RangeType.RANGED),
	LULU("Lulu", RangeType.RANGED),
	LUX("Lux", RangeType.RANGED),
	MALPHITE("Malphite", RangeType.MELEE),
	MALZAHAR("Malzahar", RangeType.RANGED),
	MAOKAI("Maokai", RangeType.MELEE),
	MASTER_YI("Master Yi", RangeType.MELEE),
	MISS_FORTUNE("Miss Fortune", RangeType.RANGED),
	WUKONG("Wukong", RangeType.MELEE),
	MORDEKAISER("Mordekaiser", RangeType.MELEE),
	MORGANA("Morgana", RangeType.RANGED),
	NAMI("Nami", RangeType.RANGED),
	NASUS("Nasus", RangeType.MELEE),
	NAUTILUS("Nautilus", RangeType.MELEE),
	NEEKO("Neeko", RangeType.RANGED),
	NIDALEE("Nidalee", RangeType.MIXED),
	NOCTURNE("Nocturne", RangeType.MELEE),
	NUNU("Nunu", RangeType.MELEE),
	OLAF("Olaf", RangeType.MELEE),
	ORIANNA("Orianna", RangeType.RANGED),
	ORNN("Ornn", RangeType.MELEE),
	PANTHEON("Pantheon", RangeType.MELEE),
	POPPY("Poppy", RangeType.MELEE),
	PYKE("Pyke", RangeType.MELEE)

	;

	/**
	 * The path for all champion images
	 */
	private static final String PATH = "images\\champions\\";

	/**
	 * The path for the champion's icon
	 */
	private static final String ICON_PATH = PATH + "icon\\";

	/**
	 * The path for the champion's icon
	 */
	private static final String BACKGROUND_PATH = PATH + "background\\";

	/**
	 * The path for the champion's Q spell
	 */
	private static final String Q_SPELL_PATH = PATH + "spells\\Q\\";

	/**
	 * The path for the champion's W spell
	 */
	private static final String W_SPELL_PATH = PATH + "spells\\W\\";

	/**
	 * The path for the champion's E spell
	 */
	private static final String E_SPELL_PATH = PATH + "spells\\E\\";

	/**
	 * The name of the champion
	 */
	private String name;

	/**
	 * The range type of the champion (ranged, melee or mixed)
	 */
	private RangeType rangeType;

	/**
	 * The complete paths for all of the champion's images
	 */
	private HashMap<String, String> imagePaths;

	/**
	 * The name of the champion's images
	 */
	private String imgName;

	/**
	 * Boolean indicating if the champion is selected or not for the random
	 * champion selection
	 */
	private boolean selected;

	/**
	 * Creates a new champion
	 * 
	 * @param name : The name of the champion
	 * @param range : The range type of the champion
	 */
	private Champions(String name, RangeType rangeType)
	{
		this.name = name;
		this.imgName = getName() + ".png";

		this.rangeType = rangeType;

		this.imagePaths = new HashMap<>();
		setImagePaths();
		
		this.selected = true;
		
	}

	/**
	 * Sets the paths of all of the champion's images
	 */
	private void setImagePaths()
	{
		imagePaths.put("icon", ICON_PATH + imgName);
		imagePaths.put("background", BACKGROUND_PATH + imgName);
		imagePaths.put("qSpell", Q_SPELL_PATH + imgName);
		imagePaths.put("wSpell", W_SPELL_PATH + imgName);
		imagePaths.put("eSpell", E_SPELL_PATH + imgName);
	}

	/**
	 * Returns the name of the champion
	 * 
	 * @return the name of the champion
	 */
	public String getName()
	{
		return this.name;
	}

	/**
	 * Returns the range type of the champion (ranged, melee or mixed)
	 * 
	 * @return the range type of the champion
	 */
	public RangeType getRange()
	{
		return rangeType;
	}

	/**
	 * Return a hashmap containing the path of all of the champion's images
	 * 
	 * @return a hashmap containing the path of all of the champion's images
	 */
	public HashMap<String, String> getImagePaths()
	{
		return imagePaths;
	}
	
	/**
	 * Returns if the chmapion is selected or not for the random champion selection
	 * 
	 * @return if the chmapion is selected or not for the random champion selection
	 */
	public boolean getSelected()
	{
		return this.selected;
	}
	
	/**
	 * Changes if the champion is selected or not for the random champion selection
	 * 
	 * @param selected : The new state of the champion's selection
	 */
	public void setSelected(boolean selected)
	{
		this.selected = selected;
	}

	/**
	 * Return the attributes of the champion : name, RangeType, selected 
	 * 
	 * @return the name of the champion
	 */
	@Override
	public String toString()
	{
		return this.name + ", " + this.rangeType + ", " + this.selected;
	}
}
