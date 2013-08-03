package shadowhax.modjam.core.util;

import java.util.logging.Logger;

import cpw.mods.fml.common.FMLLog;

public class Reference {

	public static final String MOD_ID = "ShadowHax_ModJam"; // TODO: Change Later
	public static final String MOD_NAME = "ShadowHax_ModJam"; // TODO: Change Later
	public static final String MOD_VERSION = "v1 indev";
	
	public static final String CLIENT_PROXY = "shadowhax.modjam.core.proxy.ClientProxy";
	public static final String SERVER_PROXY = "shadowhax.modjam.core.proxy.CommonProxy";
    
	public static Logger logger = Logger.getLogger("ShadowHax");
	
	static {
		logger.setParent(FMLLog.getLogger());
	}
}
