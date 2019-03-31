package org.phan.hr.repository;

import org.phan.hr.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

/**
 * Created by tcp on 03/31/2019.
 */
@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "departments",
                        path = "departments")
public interface DepartmentRepository extends JpaRepository<Department, String> {
}