package nimblix.in.HealthCareHub.controller;

import lombok.RequiredArgsConstructor;
import nimblix.in.HealthCareHub.model.staff;
import nimblix.in.HealthCareHub.request.DoctorRegistrationRequest;
import nimblix.in.HealthCareHub.service.DoctorService;
import nimblix.in.HealthCareHub.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("api/doctors")
@RequiredArgsConstructor
public class DoctorController {
    private final StaffService staffService;
    private final DoctorService doctorService;

    @PostMapping("/register")
    public String registerDoctor(@RequestBody DoctorRegistrationRequest request) {
        return doctorService.registerDoctor(request);

    }

    @GetMapping("/getDoctorDetails")
    public ResponseEntity<?> getDoctorDetails(@RequestParam Long  doctorId,@RequestParam Long  hospitalId){
        return  doctorService.getDoctorDetails(doctorId,hospitalId);

    }

    @PostMapping("/staff")
    public ResponseEntity<staff> addStaff(@RequestBody staff staff) {
        return ResponseEntity.ok(staffService.addStaff(staff));
    }





}
