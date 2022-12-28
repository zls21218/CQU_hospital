package com.project.demo.controller;

import com.project.demo.entity.ScheduledNucleicAcidTest;
import com.project.demo.service.ScheduledNucleicAcidTestService;
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
 *预约核酸检测：(ScheduledNucleicAcidTest)表控制层
 *
 */
@RestController
@RequestMapping("/scheduled_nucleic_acid_test")
public class ScheduledNucleicAcidTestController extends BaseController<ScheduledNucleicAcidTest,ScheduledNucleicAcidTestService> {

    /**
     *预约核酸检测对象
     */
    @Autowired
    public ScheduledNucleicAcidTestController(ScheduledNucleicAcidTestService service) {
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
