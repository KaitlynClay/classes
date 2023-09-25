class employeeInfo constructor(var nameEmployeeFirst: String,
                               var nameEmployeeLast: String,
                               var numEmployee: String,
                               var shiftEmployee: String){

    fun displayInfo(){
        println("Employee Information " + "\n" +
                "============================" + "\n" +
                "Name: $nameEmployeeFirst $nameEmployeeLast" + "\n" +
                "Phone number: $numEmployee" + "\n" +
                "Shift number: $shiftEmployee")
    }
}