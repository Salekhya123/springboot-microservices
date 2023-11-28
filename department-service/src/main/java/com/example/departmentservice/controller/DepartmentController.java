package com.example.departmentservice.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.departmentservice.dto.DepartmentDto;
import com.example.departmentservice.service.DepartmentService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("api/departments")
@AllArgsConstructor
@Tag(
        name = "Department_Controller",
        description = "Department_controller Exposes REST API"
)
public class DepartmentController {
	@Autowired
    private DepartmentService departmentService;

    @Operation(
            summary = "Save Department REST API",
            description = "Save is used to save department"
    )
    @ApiResponse(
            responseCode = "201",
            description = "CREATED"
    )
    @PostMapping
    public ResponseEntity<DepartmentDto> saveDepartment(@RequestBody DepartmentDto departmentDto){
        DepartmentDto savedDepartment = departmentService.saveDepartment(departmentDto);
        return  new ResponseEntity<>(savedDepartment, HttpStatus.CREATED);
    }

    @Operation(
            summary = "Get Department REST API",
            description = "Get is used to get department"
    )
    @ApiResponse(
            responseCode = "20",
            description = "OK"
    )
    @GetMapping("{code}")
    public ResponseEntity<DepartmentDto> getDepartment(@PathVariable("code") String departmentCode){
        DepartmentDto departmentDto = departmentService.getDepartmentByCode(departmentCode);
        return new ResponseEntity<>(departmentDto, HttpStatus.OK);
    }
}
