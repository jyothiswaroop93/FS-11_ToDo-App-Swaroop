package com.To_Do_App.To_Do_App;


import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
@Configuration
public class BangBag {

    @Bean
    public List<ToDo> getDataSource() {
        return new ArrayList<>();
    }


}
