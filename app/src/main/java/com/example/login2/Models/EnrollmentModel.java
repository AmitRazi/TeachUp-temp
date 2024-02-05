package com.example.login2.Models;

import com.example.login2.Utils.CustomUtils;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class EnrollmentModel {
    private String studentId;
    private String courseId;
    private boolean isActive;
    private String enrolledSince;

    public EnrollmentModel() {
    }

    public EnrollmentModel(String courseId, String studentId, boolean isActive) {
        this.studentId = studentId;
        this.courseId = courseId;
        this.isActive = isActive;
        this.enrolledSince = CustomUtils.getLocalDateTime();
    }

    public String getStudentId() {
        return studentId;
    }

    public String getEnrolledSince() {
        return enrolledSince;
    }

    public void setEnrolledSince(String enrolledSince) {
        this.enrolledSince = enrolledSince;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
