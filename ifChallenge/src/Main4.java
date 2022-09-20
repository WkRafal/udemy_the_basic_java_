public class Main4 {
    public static void main(String[] args) {

        int points = 0;
        boolean driverLicense = true;
        int experienceYears = 12;
        boolean drunkdriving = false;
        boolean cusesAccident = false;
        boolean overSpeeding = true;

        if (driverLicense)
            points += 20;
        if (drunkdriving || cusesAccident)
            points -= 100;
        if (overSpeeding)
            points -= 10;
        if (experienceYears >= 18 && experienceYears < 60)
            points += 20;
        if (experienceYears > 60)
            points -= 20;

        System.out.println(points);

    }
}
