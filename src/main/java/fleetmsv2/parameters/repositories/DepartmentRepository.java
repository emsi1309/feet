package fleetmsv2.parameters.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fleetmsv2.parameters.models.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer> {
}
