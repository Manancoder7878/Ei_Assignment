
public class OfficeComputerBuilder implements ComputerBuilder {
	
	private Computer computer;
	
	public OfficeComputerBuilder(Computer computer) {
		super();
		this.computer = computer;
	}

	public OfficeComputerBuilder() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void buildCPU() {
		// TODO Auto-generated method stub
		computer.setCpu("Intel Core i5");

	}

	@Override
	public void buildRAM() {
		// TODO Auto-generated method stub
		computer.setRam("16GB DDR4");
	}

	@Override
	public void buildStorage() {
		// TODO Auto-generated method stub
		computer.setStorage("512GB SSD");
	}

	@Override
	public void buildGPU() {
		// TODO Auto-generated method stub
		computer.setGpu("Integrated Graphics");
	}

	@Override
	public Computer getComputer() {
		// TODO Auto-generated method stub
		return null;
	}

}
