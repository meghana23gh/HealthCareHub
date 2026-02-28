package nimblix.in.HealthCareHub.serviceImpl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import nimblix.in.HealthCareHub.model.Staff;
import nimblix.in.HealthCareHub.repository.StaffRepository;
import nimblix.in.HealthCareHub.service.StaffService;

@Service
@RequiredArgsConstructor
public class StaffServiceImpl implements StaffService {

    private final StaffRepository staffRepository;

    @Override
    public Staff addStaff(Staff staff) {
        return staffRepository.save(staff);
    }
}