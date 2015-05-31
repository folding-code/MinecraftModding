package craftingPlus.proxy;

import craftingPlus.init.CraftingPlusItems;

public class ClientProxy extends CommonProxy{
	@Override
	public void registerRenders()
	{
		CraftingPlusItems.registerRenders();
	}

}
