package com.app.neeraj.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DepartmentModel {

    private int depId;

    private String name;

    private String location;

    private String code;
}
