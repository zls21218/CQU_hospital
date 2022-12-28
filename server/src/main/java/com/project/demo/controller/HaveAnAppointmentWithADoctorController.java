package com.project.demo.controller;

import com.project.demo.entity.HaveAnAppointmentWithADoctor;
import com.project.demo.service.HaveAnAppointmentWithADoctorService;
import com.project.demo.controller.base.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Query;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 *预约挂号：(HaveAnAppointmentWithADoctor)表控制层
 *
 */
@RestController
@RequestMapping("/have_an_appointment_with_a_doctor")
public class HaveAnAppointmentWithADoctorController extends BaseController<HaveAnAppointmentWithADoctor,HaveAnAppointmentWithADoctorService> {

    /**
     *预约挂号对象
     */
    @Autowired
    public HaveAnAppointmentWithADoctorController(HaveAnAppointmentWithADoctorService service) {
        setService(service);
    }

    @PostMapping("/add")
    @Transactional
    public Map<String, Object> add(HttpServletRequest request) throws IOException {
        Map<String,Object> paramMap = service.readBody(request.getReader());
        this.addMap(paramMap);
        String sql = "SELECT MAX(have_an_appointment_with_a_doctor_id) AS max FROM "+"have_an_appointment_with_a_doctor";
        Query select = service.runCountSql(sql);
        Integer max = (Integer) select.getSingleResult();
        sql = "UPDATE `outpatient_schedule` INNER JOIN `have_an_appointment_with_a_doctor` ON outpatient_schedule.department_number=have_an_appointment_with_a_doctor.department_number SET outpatient_schedule.reservation_number = outpatient_schedule.reservation_number - have_an_appointment_with_a_doctor.reservation_number WHERE have_an_appointment_with_a_doctor.have_an_appointment_with_a_doctor_id="+max;
        select = service.runCountSql(sql);
        select.executeUpdate();
        return success(1);
    }

}
