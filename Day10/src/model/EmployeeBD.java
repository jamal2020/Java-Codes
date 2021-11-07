package model;

import java.io.Serializable;
import java.util.*;

public class EmployeeBD implements Serializable {
    ArrayList<Employee> emps = new ArrayList<Employee>();
    public void addEmp(Employee e)
    {
        emps.add(e);
    }
    public void deleteEmp(Employee e)
    {
        emps.remove(e);
    }

}

