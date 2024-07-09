package Assignment.Three;

import Assignment.Three.Application.GSShopFactory;
import Assignment.Three.Framework.NormalAcc;
import Assignment.Three.Framework.PrimeAcc;
import Assignment.Three.Framework.ShopFactory;

public class GoShoppingMain {
	public static void main(String[] args) {
		
		ShopFactory sf = new GSShopFactory();
		
		PrimeAcc pa = sf.getNewPrimeAcc(121, "Soham", 10, true);
		
		NormalAcc na = sf.getNewNormalAcc(51, "Arya", 20, 50);
		
		pa.bookProduct(100.0f);
		
		na.bookProduct(200.0f);
		
//		System.out.println(pa.toString());
//		System.out.println(na.toString());
	}
}
