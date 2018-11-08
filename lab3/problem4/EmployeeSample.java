class EmployeeSample extends PersonSample {
    private int salary;
    private String id;
    EmployeeSample(){
        super();
    }
    EmployeeSample(String name,String surname,int salary,String id){
        super(name,surname);
        this.salary = salary;
        this.id = id;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }
    public void setId(String id){
        this.id = id;
    }
    public String getId(){
        return this.id;
    }
    public int getSalary(){
        return this.salary;
    }
    public String getName(){
        return "Employee's name is " + super.getName();
    }
    public String getSurname(){
        return "Employee's surname is " + super.getSurname();
    }
}