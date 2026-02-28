package nimblix.in.HealthCareHub.controller;

import lombok.RequiredArgsConstructor;
import nimblix.in.HealthCareHub.model.Staff;
import nimblix.in.HealthCareHub.request.HospitalRegistrationRequest;
import nimblix.in.HealthCareHub.service.HospitalService;
import nimblix.in.HealthCareHub.service.StaffService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hospital")
@RequiredArgsConstructor
public class HospitalController {

    private final StaffService staffService;
    private final HospitalService hospitalService;

    @PostMapping("/register")
    public String registerHospital(@RequestBody HospitalRegistrationRequest request) {
        return hospitalService.registerHospital(request);
    }
    @PostMapping("/staff")
    public ResponseEntity<Staff> addStaff(@RequestBody Staff staff) {
        return ResponseEntity.ok(staffService.addStaff(staff));
    }
    
}
