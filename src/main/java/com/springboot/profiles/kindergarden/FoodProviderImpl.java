package com.springboot.profiles.kindergarden;

import com.springboot.profiles.Food;
import com.springboot.profiles.FoodProviderService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("foodProviderService")
@Profile("kindergarden")
public class FoodProviderImpl implements FoodProviderService {
    @Override
    public List<Food> provideLunchSet() {
        return List.of(new Food("Milk"),new Food("Biscuits"));
    }
}
