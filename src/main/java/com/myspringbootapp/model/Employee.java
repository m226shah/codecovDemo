package com.example.myspringbootapp.model;

    import lombok.Getter;
    import lombok.Setter;

    import javax.persistence.Entity;
    import javax.persistence.Id;

    @Getter
    @Setter
    @Entity
    public class Employee {
        @Id
        private Long id;
        private String name;
        private String role;

        
    }
