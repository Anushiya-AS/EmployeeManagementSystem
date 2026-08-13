package com.ems;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeDAO {

    // Add Employee
	public void addEmployee(Employee emp) {

	    String query = "INSERT INTO employee(emp_name, department, designation, salary, email) VALUES (?, ?, ?, ?, ?)";

	    try {
	        Connection con = DBConnection.getConnection();
	        PreparedStatement ps = con.prepareStatement(query);

	        ps.setString(1, emp.getEmpName());
	        ps.setString(2, emp.getDepartment());
	        ps.setString(3, emp.getDesignation());
	        ps.setDouble(4, emp.getSalary());
	        ps.setString(5, emp.getEmail());

	        int rows = ps.executeUpdate();

	        if (rows > 0) {
	            System.out.println("Employee Added Successfully!");
	        }

	        ps.close();
	        con.close();

	    } catch (SQLException e) {

	        if (e.getErrorCode() == 1062) {
	            System.out.println("Email already exists!");
	            System.out.println("Please use a different email.");
	        } else {
	            System.out.println("Error while adding employee.");
	            e.printStackTrace();
	        }
	    }
	}
    // View All Employees
    public void viewEmployees() {

        String query = "SELECT * FROM employee";

        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(query);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println("--------------------------------");
                System.out.println("Employee ID : " + rs.getInt("emp_id"));
                System.out.println("Name        : " + rs.getString("emp_name"));
                System.out.println("Department  : " + rs.getString("department"));
                System.out.println("Designation : " + rs.getString("designation"));
                System.out.println("Salary      : " + rs.getDouble("salary"));
                System.out.println("Email       : " + rs.getString("email"));
            }

            rs.close();
            ps.close();
            con.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void searchEmployee(int empId) {

        String query = "SELECT * FROM employee WHERE emp_id = ?";

        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, empId);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                System.out.println("-----------------------------");
                System.out.println("Employee ID : " + rs.getInt("emp_id"));
                System.out.println("Name        : " + rs.getString("emp_name"));
                System.out.println("Department  : " + rs.getString("department"));
                System.out.println("Designation : " + rs.getString("designation"));
                System.out.println("Salary      : " + rs.getDouble("salary"));
                System.out.println("Email       : " + rs.getString("email"));
            } else {
                System.out.println("Employee Not Found!");
            }

            rs.close();
            ps.close();
            con.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void updateEmployee(Employee emp) {

        String query = "UPDATE employee SET emp_name=?, department=?, designation=?, salary=?, email=? WHERE emp_id=?";

        try {

            Connection con = DBConnection.getConnection();

            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, emp.getEmpName());
            ps.setString(2, emp.getDepartment());
            ps.setString(3, emp.getDesignation());
            ps.setDouble(4, emp.getSalary());
            ps.setString(5, emp.getEmail());
            ps.setInt(6, emp.getEmpId());

            int rows = ps.executeUpdate();

            if(rows > 0) {
                System.out.println("Employee Updated Successfully!");
            } else {
                System.out.println("Employee Not Found!");
            }

            ps.close();
            con.close();

        } catch(SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void deleteEmployee(int empId) {

        String query = "DELETE FROM employee WHERE emp_id=?";

        try {

            Connection con = DBConnection.getConnection();

            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, empId);

            int rows = ps.executeUpdate();

            if(rows > 0) {
                System.out.println("Employee Deleted Successfully!");
            } else {
                System.out.println("Employee Not Found!");
            }

            ps.close();
            con.close();

        } catch(SQLException e) {
            e.printStackTrace();
        }
    }
}