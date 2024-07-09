package Assignment.Three.Application;

import Assignment.Three.Framework.PrimeAcc;

public class GSPrimeAcc extends PrimeAcc{
	private static final float Charges = 0.0f;

	public GSPrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
		super(accNo, accNm, charges, isPrime);
	}
	
	@Override
	public void bookProduct(float amount) {
		super.bookProduct(amount);
		System.out.println("Prime Account specific booking. Ammount: "+amount);
	}

	@Override
	public String toString() {
		return "GSPrimeAcc [toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
	
	
	
	
}
