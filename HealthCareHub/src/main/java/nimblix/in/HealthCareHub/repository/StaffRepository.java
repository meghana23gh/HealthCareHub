package nimblix.in.HealthCareHub.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import nimblix.in.HealthCareHub.model.staff;

public interface StaffRepository extends JpaRepository<staff, Long> {
}