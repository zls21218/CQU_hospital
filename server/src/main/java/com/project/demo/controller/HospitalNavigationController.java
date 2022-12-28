package com.project.demo.controller;

import com.project.demo.entity.HospitalNavigation;
import com.project.demo.service.HospitalNavigationService;
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
 *医院导航：(HospitalNavigation)表控制层
 *
 */
@RestController
@RequestMapping("/hospital_navigation")
public class HospitalNavigationController extends BaseController<HospitalNavigation,HospitalNavigationService> {

    /**
     *医院导航对象
     */
    @Autowired
    public HospitalNavigationController(HospitalNavigationService service) {
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
