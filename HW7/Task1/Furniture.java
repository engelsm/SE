package sedemo;

public class Furniture implements HouseholdItem{
	
	String name;
	String type;


	int length;
	int width;
	int height;
	int weight;

	
	public Furniture(String name, String type, int length, int width, int height, int weight) {
		this.name = name;
		this.type = type;
		this.length = length;
		this.width = width;
		this.height = height;
		this.weight = weight;
	}


	

//Getters and Setters



	public int getHeight() {
		return height;}

	public void setHeight(Integer height) {
		this.height = height;}

	public int getLenght() {
		return length;}

	public void setLenght(Integer length) {
		this.length = length;}

	public int getWidth() {
		return width;	}

	public void setWidth(Integer width) {
		this.width = width;}

	public int getWeight() {
		return weight;}

	public void setWeight(Integer weight) {
		this.weight = weight;}

	public String getType() {
		return type;}

	public void setType(String type) {
		this.type = type;}

	@Override
	public String getName() {
		return name;}

	public void setName(String name) {
		this.name = name;}




	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return weight*0.25;
	}




	@Override
	public String getText() {
		// TODO Auto-generated method stub
		return "should be covered with waterproof covers with area of: " + length + "x" + width;
	}

}
