package shadowhax.modjam.energy;

public interface IEnergyStorageBlock {

	// Possibly Use A Custom Enum for sharing tile entity classes
	
	int getMaxEnergyStored();
	
	int getCurrentEnergyStored();
	
	void modifyEnergy(double amount);
}
