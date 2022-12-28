package com.project.demo.controller;

import com.project.demo.entity.OutpatientSchedule;
import com.project.demo.service.OutpatientScheduleService;
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
 *门诊时间表：(OutpatientSchedule)表控制层
 *
 */
@RestController
@RequestMapping("/outpatient_schedule")
public class OutpatientScheduleController extends BaseController<OutpatientSchedule,OutpatientScheduleService> {

    /**
     *门诊时间表对象
     */
    @Autowired
    public OutpatientScheduleController(OutpatientScheduleService service) {
        setService(service);
    }

    @PostMapping("/add")
    @Transactional
    public Map<String, Object> add(HttpServletRequest request) throws IOException {
        Map<String,Object> paramMap = service.readBody(request.getReader());
        this.addMap(paramMap);
        return success(1);
    }

}
