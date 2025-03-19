class emp{

    private int id = 3021;
    private String name = "Ravi";
    private int salary = 150000;
    private String add = "XYZ street";
    private String phone = "9876543210";


    public String getDetails() {
        return "ID: " + id + "\nName: " + name + "\nSalary: " + salary +
                "\nAddress: " + add + "\nPhone: " + phone;
    }





}



public class Emp_details {

    public static void main(String[] args) {

        emp employee = new emp();
        System.out.println(employee.getDetails());


    }




}
