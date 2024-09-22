
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComputerBuilder gamingBuilder = new GamingComputerBuilder();
        ComputerDirector director = new ComputerDirector(gamingBuilder);
        Computer gamingComputer = director.buildComputer();
        System.out.println(gamingComputer);  
        // Output: Computer [CPU=Intel Core i9, RAM=32GB DDR4, Storage=1TB SSD, GPU=NVIDIA RTX 3080]

        // Building an office computer
        ComputerBuilder officeBuilder = new OfficeComputerBuilder();
        director = new ComputerDirector(officeBuilder);
        Computer officeComputer = director.buildComputer();
        System.out.println(officeComputer);  
	}

}
