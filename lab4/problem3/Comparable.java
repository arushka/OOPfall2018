interface Comparable{
	public default int CompareEmployee(Employee e){
		return 0;
	}
	public default int CompareManager(Manager m){
		return 0;
	}
}