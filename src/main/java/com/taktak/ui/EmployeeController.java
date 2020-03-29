package com.taktak.ui;

import com.taktak.persistence.Employee;
import javax.faces.bean.RequestScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@RequestScoped
@Named
public class EmployeeController {

    @PersistenceContext
    EntityManager em;

    public List<Employee> getEmployees() {
        TypedQuery<Employee> query = em.createQuery("select e from Employee e", Employee.class);
        return query.getResultList();
    }
}
