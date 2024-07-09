package Assignment.Three.Application;

import Assignment.Three.Framework.ShopFactory;

public class GSShopFactory extends ShopFactory{
	public GSPrimeAcc getNewPrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
		return new GSPrimeAcc(accNo, accNm, charges, isPrime);
	}
	
	public GSNormalAcc getNewNormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
		return new GSNormalAcc(accNo, accNm, charges, deliveryCharges);
	}
}
