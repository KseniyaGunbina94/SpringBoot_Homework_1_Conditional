package netology.ru.SpringBoot_Homework_1_Conditional.Profile;

public class ProductionProfile implements SystemProfile {
    @Override
    public String getProfile() {
        return "Current profile is production";
    }
}
