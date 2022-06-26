package com.springboot.profiles.highschool;

import com.springboot.injection.Foo;
import com.springboot.profiles.Food;
import com.springboot.profiles.FoodProviderService;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("foodProviderService")
@Profile("highschool")
public class FoodProviderServiceImpl implements FoodProviderService {
    @Override
    public List<Food> provideLunchSet() {
        return List.of(new Food("Coke"),new Food("Hamburger"),new Food("French Fries"));
    }
}
