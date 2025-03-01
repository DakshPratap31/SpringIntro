package com.example.SpringIntro.Components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@Component
public class EmployeeBean {
    private int eid;
    private String ename;
    @Autowired
    private DepartmentBean deptbean;
    public static final Logger logger=LoggerFactory.getLogger(EmployeeBean.class);
    public EmployeeBean(){}

    @Autowired
    public EmployeeBean(DepartmentBean deptBean){
        logger.trace("*** Autowiring by using @Autowired annotation on constructo ***");
        this.deptbean=deptBean;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public DepartmentBean getDeptbean() {
        return deptbean;
    }

    @Autowired
    public void setDeptBean(DepartmentBean deptBean){
        logger.trace("Autowriting by using @Autowire");
        this.deptbean=deptBean;
    }
    public void showEmployeeDetails(){
        logger.debug("Employee Id:{}",eid);
        logger.debug("Employee Name:{}",eid);
        deptbean.setDeptName("Information Tecnology");
        logger.debug("Department : {}",deptbean.getDeptName());
    }
}
