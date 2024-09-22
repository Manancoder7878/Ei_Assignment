
public class GiftCardPayment implements PaymentStrategy{

	@Override
	public void pay(int amount) {
		// TODO Auto-generated method stub
		 System.out.println("Paid " + amount + " using Gift Card.");
	}

}
