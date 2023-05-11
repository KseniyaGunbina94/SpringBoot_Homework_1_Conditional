package netology.ru.SpringBoot_Homework_1_Conditional.Profile;

public class DevProfile implements SystemProfile {
    @Override
    public String getProfile() {
        return "Current profile is dev";
    }
}
