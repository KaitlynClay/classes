fun main(args: Array<String>) {
    val employee1 = employeeInfo("Jade",
        "Lennox",
        "(815) 986-2301",
        "1")
    val employee2 = employeeInfo("Rory",
        "McDonald",
        "(608) 652-1894",
        "3")
    val employee3 = employeeInfo("Shantih",
        "Clay",
        "(815) 291-9856",
        "2")
    employee1.displayInfo()
    println("\n")
    employee2.displayInfo()
    println("\n")
    employee3.displayInfo()
}