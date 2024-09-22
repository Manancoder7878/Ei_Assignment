
public class Computer {
	private String cpu;
    private String ram;
    private String storage;
    private String gpu;
    
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
	public void setStorage(String storage) {
		this.storage = storage;
	}
	public void setGpu(String gpu) {
		this.gpu = gpu;
	}
	
	@Override
	public String toString() {
		return "Computer [cpu=" + cpu + ", ram=" + ram + ", storage=" + storage + ", gpu=" + gpu + "]";
	}  
}
