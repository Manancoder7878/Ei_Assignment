
public class PhoneApp implements Observer{
	@Override
	public void update(int temperature) {
        System.out.println("Phone App: The current temperature is " + temperature + " degrees.");
    }
}
