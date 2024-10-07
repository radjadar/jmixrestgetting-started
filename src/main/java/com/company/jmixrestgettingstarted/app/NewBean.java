package com.company.jmixrestgettingstarted.app;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Service
public class NewBean {
    public String businesslogic(String apidocs) {
        return "Debug";
    }
}