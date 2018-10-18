package methodReferenceExistingObject;

public class RepairStore {
	   public void fix(Computer c) {
			System.out.println("Repairing Computer for BrandName:" + c.getBrandName() + " and SerialNumber:" + c.getSerialNumber());
		} 
	}