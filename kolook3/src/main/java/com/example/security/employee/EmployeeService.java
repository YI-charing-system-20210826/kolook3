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

	public void delete(Long id) {
		Employee employee = findById(id);
		employeeRepository.delete(employee);
	}

	public Employee findById(Long id) {
		return employeeRepository.findById(id).get();
	}

	public void create(EmployeeRequest employeeRequest) {
	    Employee employee = new Employee();
	    employee.setMember_id(employeeRequest.getMember_id());
	    employee.setLast_name(employeeRequest.getLast_name());
	    employee.setFirst_name(employeeRequest.getFirst_name());
	    employee.setLast_name_Kana(employeeRequest.getLast_name_Kana());
	    employee.setFirst_name_Kana(employeeRequest.getFirst_name_Kana());
	    employee.setEmp_status(employeeRequest.getEmp_status());
	    employee.setSection(employeeRequest.getSection());
	    employee.setPosition(employeeRequest.getPosition());
	    employee.setTel_no(employeeRequest.getTel_no());
	    employee.setEmail(employeeRequest.getEmail());
	    employee.setPost_no(employeeRequest.getPost_no());
	    employee.setKen_code(employeeRequest.getKen_code());
	    employee.setAddress(employeeRequest.getAddress());
	    employee.setAddress_detail(employeeRequest.getAddress_detail());
	    employee.setBirthday(employeeRequest.getBirthday());
	    employee.setGender(employeeRequest.getGender());
	    employee.setJoin_at(employeeRequest.getJoin_at());
	    employee.setLeave_at(employeeRequest.getLeave_at());
	    employee.setRole(employeeRequest.getRole());
	    employee.setPassword(employeeRequest.getPassword());
	    employee.setMember_img(employeeRequest.getMember_img());
	    employee.setCreated_at(employeeRequest.getCreated_at());
	    employee.setUpdated_at(employeeRequest.getUpdated_at());
	    employee.setLast_login(employeeRequest.getLast_login());
	    employeeRepository.save(employee);
	}

	public void update(EmployeeUpdateRequest employeeUpdateRequest) {
		Employee employee = findById(employeeUpdateRequest.getMember_id());
		employee.setAddress(employeeUpdateRequest.getAddress());
		employee.setLast_name(employeeUpdateRequest.getLast_name());
		employee.setTel_no(employeeUpdateRequest.getTel_no());
		employeeRepository.save(employee);
	}
}
