package com.example.myapplicationuserlist.util;

import com.example.myapplicationuserlist.R;
import com.example.myapplicationuserlist.model.UserModel;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class UserGenerator {
    private static final String[] FIRST_NAMES = {
            "Олексій", "Марія", "Іван", "Анна", "Дмитро",
            "Олена", "Микола", "Юлія", "Андрій", "Вікторія"
    };

    private static final String[] LAST_NAMES = {
            "Коваленко", "Шевченко", "Бондаренко", "Ткаченко", "Кравченко",
            "Олійник", "Мельник", "Лисенко", "Гриценко", "Савченко"
    };
    private static final String[] COUNTRIES = {"Україна", "Польща", "Німеччина"};

    private static final String[][] CITIES = {
            {"Київ", "Харків", "Одеса", "Дніпро", "Львів"},
            {"Варшава", "Краків", "Вроцлав", "Гданськ", "Лодзь"},
            {"Берлін", "Мюнхен", "Гамбург", "Кельн", "Франкфурт"}
    };
    private static final int[] AVATARS = {
            R.drawable.avatar1,
            R.drawable.avatar2,
            R.drawable.avatar3,
            R.drawable.avatar4,
            R.drawable.avatar5
    };

    public static List<UserModel> generate(int count) {
        List<UserModel> users = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < count; i++) {
            int avatar = AVATARS[random.nextInt(AVATARS.length)];
            String firstName = FIRST_NAMES[random.nextInt(FIRST_NAMES.length)];
            String lastName  = LAST_NAMES[random.nextInt(LAST_NAMES.length)];

            int age = 14 + random.nextInt(86);

            int countryIndex = random.nextInt(COUNTRIES.length);
            String country = COUNTRIES[countryIndex];

            String city = CITIES[countryIndex][random.nextInt(CITIES[countryIndex].length)];

            users.add(new UserModel(avatar, firstName, lastName, age, country, city));
        }

        return users;
    }
}
