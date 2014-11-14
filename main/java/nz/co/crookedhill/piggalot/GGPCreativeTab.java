package nz.co.crookedhill.piggalot;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import nz.co.crookedhill.piggalot.item.GGPItem;

public class GGPCreativeTab extends CreativeTabs
{

	public GGPCreativeTab(String label) {
		super(label);
		
	}
	
	@Override
	public Item getTabIconItem() 
	{
		return GGPItem.pigtite;
	}
	//sets the title/name for the creative tab
	@Override
	public String getTranslatedTabLabel()
	{
	return "Syn Tutorial Mod";
	}

}
