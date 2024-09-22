
public class GamingComputerBuilder implements ComputerBuilder {
	private Computer computer;
	
	public GamingComputerBuilder(Computer computer) {
		super();
		this.computer = computer;
	}

	public GamingComputerBuilder() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void buildCPU() {
		// TODO Auto-generated method stub
		computer.setCpu("Intel Core i9");
	}

	@Override
	public void buildRAM() {
		// TODO Auto-generated method stub
		computer.setRam("32GB DDR4");
	}

	@Override
	public void buildStorage() {
		// TODO Auto-generated method stub
		computer.setStorage("1TB SSD");
	}

	@Override
	public void buildGPU() {
		// TODO Auto-generated method stub
		computer.setGpu("NVIDIA RTX 3080");
	}

	@Override
	public Computer getComputer() {
		// TODO Auto-generated method stub
		return null;
	}

}
