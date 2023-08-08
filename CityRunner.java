class CityRunner{
	public static void main(String[] args)
	{
		System.out.println("invoking main in city ");
		City c1=new City();
		
		City c2=new City("Shivamogga","Shivamogga","Karnataka");
		
		System.out.println("City name : "+c2.name);
		System.out.println("District : "+c2.district);
		System.out.println("State : "+c2.state);
	}
}