To Compile this code

javac -d mods/com/address src/com/address/module-info.java src/com/address/com/add/AddressUtil.java

javac --module-path mods -d mods/com/employee src/com/employee/module-info.java src/com/employee/com/emp/EmployeeMain.java


Execute
java --module-path mods -m com/employee/com/emp.EmployeeMain 