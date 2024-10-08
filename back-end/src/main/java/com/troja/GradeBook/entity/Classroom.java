package com.troja.GradeBook.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "classroom")
public class Classroom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @OneToMany(mappedBy = "classroom")
    private List<User> membersOfClass;

    @OneToMany(mappedBy = "classroom", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<TeacherSubjectClass> teacherSubjectClasses = new HashSet<>();

    @PreRemove
    public void preRemove() {
        if (membersOfClass != null) {
            for (User user : membersOfClass) {
                user.setClassroom(null);
            }
        }
    }
}