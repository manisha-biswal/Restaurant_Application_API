package com.geekster.weeklyTest.project.RestaurantManagementApplication.RestaurantApplicationAPI.BeanManager;


import com.geekster.weeklyTest.project.RestaurantManagementApplication.RestaurantApplicationAPI.Model.Restaurant;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import java.util.ArrayList;
import java.util.List;


@Configuration
public class BeanMaker {

    @Bean
    public List<Restaurant> restaurantList(){
        return new ArrayList<>();
    }
}
