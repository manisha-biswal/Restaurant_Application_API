package com.geekster.weeklyTest.project.RestaurantManagementApplication.RestaurantApplicationAPI.Repository;


import com.geekster.weeklyTest.project.RestaurantManagementApplication.RestaurantApplicationAPI.Model.Restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RestaurantRepo {

    @Autowired
    List<Restaurant> restaurantList;

    public List<Restaurant> getRestaurants(){
        return restaurantList;
    }

    public void addRestaurant(Restaurant r){
        List<Restaurant>listOfRestaurant = getRestaurants();
        listOfRestaurant.add(r);
    }
}