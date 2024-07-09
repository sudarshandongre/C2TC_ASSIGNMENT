package Assignment.Three.Framework;

public abstract class PrimeAcc extends ShopAcc{

	private final boolean isPrime;
	private static final float deliveryCharges = 0.0f;
	
	public PrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
		super(accNo, accNm, charges);
		this.isPrime = isPrime;
	}
	
	@Override
	public void bookProduct(float amount) {
		System.out.println("Product booked with amount: "+amount+" No delivery charges for Prime Account.");
	}

	@Override
	public String toString() {
		return super.toString()+", isPrime=" + isPrime + "]";
	}
	
	
	
	


	
}
