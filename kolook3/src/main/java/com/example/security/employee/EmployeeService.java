package com.example.security.employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(rollbackFor = Exception.class)
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	public List<Employee> searchAll() {
		return employeeRepository.findAll();
	}

	public void create(EmployeeRequest employeeRequest) {
	    Employee employee = new Employee();
	    employee.setMember_id(employeeRequest.getMember_id());
	    employee.setLast_name(employeeRequest.getLast_name());
	    employee.setFirst_name(employeeRequest.getFirst_name());
	    employee.setLast_name_Kana(employeeRequest.getLast_name_Kana());
	    employee.setFirst_name_Kana(employeeRequest.getFirst_name_Kana());
	    employee.setGender(employeeRequest.getGender());
	    employee.setBirthday(employeeRequest.getBirthday());
	    employee.setTel_no(employeeRequest.getTel_no());
	    employee.setEmail(employeeRequest.getEmail());
	    employee.setPost_no(employeeRequest.getPost_no());
	    employee.setKen_code(employeeRequest.getKen_code());
	    employee.setAddress(employeeRequest.getAddress());
	    employee.setAddress_detail(employeeRequest.getAddress_detail());
	    //employee.setRemarks(employeeRequest.getRemarks());
	    //employee.setContract_flg(employeeRequest.getContract_flg());
	    employeeRepository.save(employee);
	}
}
