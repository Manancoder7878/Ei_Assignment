
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PaymentContext paymentContext = new PaymentContext();

        // Customer selects PayPal payment method
        paymentContext.setPaymentStrategy(new PayPalPayment());
        paymentContext.processPayment(100);  // Outputs: "Paid 100 using PayPal."

        // Customer selects Credit Card payment method
        paymentContext.setPaymentStrategy(new CreditCardPayment());
        paymentContext.processPayment(200);  // Outputs: "Paid 200 using Credit Card."
	}

}
