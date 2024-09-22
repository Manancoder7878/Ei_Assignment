
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WeatherStation station = new WeatherStation();
        PhoneApp phoneApp = new PhoneApp();

        station.addObserver(phoneApp);
        station.setTemperature(26);
	}

}
