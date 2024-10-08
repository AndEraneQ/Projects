package com.troja.GradeBook.controllers;

import com.troja.GradeBook.dto.requests.AddSubjectRequest;
import com.troja.GradeBook.dto.requests.EditSubjectRequest;
import com.troja.GradeBook.dto.SubjectDto;
import com.troja.GradeBook.entity.Subject;
import com.troja.GradeBook.services.SubjectService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@AllArgsConstructor
@RequestMapping("/api")
public class SubjectController {

    private SubjectService subjectService;

    @GetMapping("/subjects")
    public List<SubjectDto> getAllSubjects(){
        return subjectService.getAllSubjects();
    }

    @PostMapping("/add/subject")
    public ResponseEntity<?> addSubject(@RequestBody @Valid AddSubjectRequest addSubjectRequest){
        return subjectService.addSubject(addSubjectRequest);
    }

    @PutMapping("/edit/subjectData")
    public ResponseEntity<?> editSubjectData(@RequestBody @Valid EditSubjectRequest editSubjectRequest){
        return subjectService.editSubjectData(editSubjectRequest);
    }

    @DeleteMapping("/remove/subject/{id}")
    public ResponseEntity<?> deleteSubject(@PathVariable("id") Long subjectId){
        return subjectService.deleteSubject(subjectId);
    }
}
