package com.example.myspringbootapp.model;

    import javax.persistence.Entity;
    import javax.persistence.Id;

    @Entity
    public class Employee {
        @Id
        private Long id;
        private String name;
        private String role;

        // Getters and Setters
    }