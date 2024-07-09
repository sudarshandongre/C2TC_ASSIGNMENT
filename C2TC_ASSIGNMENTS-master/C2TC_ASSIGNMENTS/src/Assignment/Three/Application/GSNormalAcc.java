package Assignment.Three.Application;

import Assignment.Three.Framework.NormalAcc;

public class GSNormalAcc extends NormalAcc{

	public GSNormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
		super(accNo, accNm, charges, deliveryCharges);
	}
	
	@Override
	public void bookProduct(float amount) {
		super.bookProduct(amount);
		System.out.println("Normal Account Specific Booking. Amount: " +amount);
	}

	@Override
	public String toString() {
		return "GSNormalAcc [toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}


	
	
}
