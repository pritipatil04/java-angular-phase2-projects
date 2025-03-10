package com.wipro.service; 

 

import java.util.List; 

 

import com.wipro.bean.Emp; 

import com.wipro.dao.EmpDAO; 

 

public class EmpService { 

EmpDAO dao = new EmpDAO(); 

 

public void createEmp(Emp e) { 

dao.createEmp(e); 

} 

 

public void deleteEmp(int id) { 

dao.deleteEmp(id); 

} 

 

public void updateEmp(int id, Emp newEmp) { 

dao.updateEmp(id, newEmp); 

} 

 

public Emp getEmployeeById(int id) { 

return dao.getEmployeeById(id); 

} 

 

public List<Emp> getEmployees() { 

return dao.getEmployees(); 

} 

} 