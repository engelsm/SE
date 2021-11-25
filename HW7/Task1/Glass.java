package sedemo;

public class Glass implements HouseholdItem{
	
	String name;
	int length;
	int width;
	int height;

	int thickness;

	
	public Glass(String name, int length, int width, int height, int thickness) {
		this.name = name;
		this.length = length;
		this.width = width;
		this.height = height;
		this.thickness = thickness;
	
	}



//Getters and Setters =

	public int getHeight() {
		return height;}

	public void setHeight(int height) {
		this.height = height;}

	public int getLenght() {
		return length;}

	public void setLenght(int length) {
		this.length = length;}

	public int getWidth() {
		return width;}

	public void setWidth(int width) {
		this.width = width;}

	public Integer getThickness() {
		return thickness;}

	public void setThickness(int thickness) {
		this.thickness = thickness;}

	@Override
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public double getCost() {
		if(thickness == 1) {
			return length*2;
		}else if(thickness == 2) {
			return length*1.2;
		}else if(thickness == 3) {
			return length*0.7;
		}
		return 0;
	}


	@Override
	public String getText() {
		return "should be wrapped with Bubble wraps and packed in a box with dimension: " + length+1 + "x" + width+1 + "x" + height+1;
	}

	
	


}
