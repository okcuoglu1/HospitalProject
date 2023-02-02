package entities.concretes;

import entities.abstracts.Users;
import entities.concretes.enums.Gender;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Patient extends Users {

    private String tcNo;
    private LocalDate birthDate;
    private Gender gender;

    private List<Priorities> priorities = new ArrayList<>();











}
