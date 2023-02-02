package entities.concretes;

import entities.abstracts.Users;
import entities.concretes.enums.Gender;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Patients extends Users {

    private String tcNo;
    private LocalDate birthDate;
    private Gender gender;

    private List<Priorities> priorities = new ArrayList<>();
    private List<Complaints> complaints = new ArrayList<>();
    private List<LastStatus> lastStatuses = new ArrayList<>();


    public Patients(String tcNo, LocalDate birthDate, Gender gender, List<Priorities> priorities, List<Complaints> complaints, List<LastStatus> lastStatuses) {
        this.tcNo = tcNo;
        this.birthDate = birthDate;
        this.gender = gender;
        this.priorities = priorities;
        this.complaints = complaints;
        this.lastStatuses = lastStatuses;
    }

    public Patients(String id, String firstName, String lastName, String tcNo, LocalDate birthDate, Gender gender, List<Priorities> priorities, List<Complaints> complaints, List<LastStatus> lastStatuses) {
        super(id, firstName, lastName);
        this.tcNo = tcNo;
        this.birthDate = birthDate;
        this.gender = gender;
        this.priorities = priorities;
        this.complaints = complaints;
        this.lastStatuses = lastStatuses;
    }
}
