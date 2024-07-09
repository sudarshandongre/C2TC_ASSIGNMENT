package Assignment.Three.Framework;

public abstract class NormalAcc extends ShopAcc{
	private final float deliveryCharges;

	public NormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
		super(accNo, accNm, charges);
		this.deliveryCharges = deliveryCharges;
	}
	
	@Override
	public void bookProduct(float amount) {
		System.out.println("Product Booked with amount: "+amount+ ". Delivery Charges: "+deliveryCharges);
	}

	@Override
	public String toString() {
		return super.toString()+",deliveryCharges=" + deliveryCharges + "]";
	}
	
	
	
}
