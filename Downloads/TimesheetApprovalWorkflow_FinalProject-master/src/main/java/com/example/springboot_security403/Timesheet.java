package com.example.springboot_security403;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Timesheet {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private User Employee;

    private String payCode;

    private double regular;

    private double leaveWithoutPay;

    private double annualLeave;

    private double compTimeEarned;

    private double compTimeUsed;

    private double holiday;

    private double holidayWorked;

    private double regularOvertime;

    private double holidayOvertime;

    private Date date;

    public Timesheet(User employee,
                     String payCode,
                     double regular,
                     double leaveWithoutPay,
                     double annualLeave,
                     double compTimeEarned,
                     double compTimeUsed,
                     double holiday,
                     double holidayWorked,
                     double regularOvertime,
                     double holidayOvertime,
                     Date date) {
        Employee = employee;
        this.payCode = payCode;
        this.regular = regular;
        this.leaveWithoutPay = leaveWithoutPay;
        this.annualLeave = annualLeave;
        this.compTimeEarned = compTimeEarned;
        this.compTimeUsed = compTimeUsed;
        this.holiday = holiday;
        this.holidayWorked = holidayWorked;
        this.regularOvertime = regularOvertime;
        this.holidayOvertime = holidayOvertime;
        this.date = date;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public User getEmployee() {
        return Employee;
    }

    public void setEmployee(User employee) {
        Employee = employee;
    }

    public String getPayCode() {
        return payCode;
    }

    public void setPayCode(String payCode) {
        this.payCode = payCode;
    }

    public double getRegular() {
        return regular;
    }

    public void setRegular(double regular) {
        this.regular = regular;
    }

    public double getLeaveWithoutPay() {
        return leaveWithoutPay;
    }

    public void setLeaveWithoutPay(double leaveWithoutPay) {
        this.leaveWithoutPay = leaveWithoutPay;
    }

    public double getAnnualLeave() {
        return annualLeave;
    }

    public void setAnnualLeave(double annualLeave) {
        this.annualLeave = annualLeave;
    }

    public double getCompTimeEarned() {
        return compTimeEarned;
    }

    public void setCompTimeEarned(double compTimeEarned) {
        this.compTimeEarned = compTimeEarned;
    }

    public double getCompTimeUsed() {
        return compTimeUsed;
    }

    public void setCompTimeUsed(double compTimeUsed) {
        this.compTimeUsed = compTimeUsed;
    }

    public double getHoliday() {
        return holiday;
    }

    public void setHoliday(double holiday) {
        this.holiday = holiday;
    }

    public double getHolidayWorked() {
        return holidayWorked;
    }

    public void setHolidayWorked(double holidayWorked) {
        this.holidayWorked = holidayWorked;
    }

    public double getRegularOvertime() {
        return regularOvertime;
    }

    public void setRegularOvertime(double regularOvertime) {
        this.regularOvertime = regularOvertime;
    }

    public double getHolidayOvertime() {
        return holidayOvertime;
    }

    public void setHolidayOvertime(double holidayOvertime) {
        this.holidayOvertime = holidayOvertime;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}


