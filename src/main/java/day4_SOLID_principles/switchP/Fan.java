package day4_SOLID_principles.switchP;

public class Fan implements Device {
    private boolean mode = false;

    @Override
    public void toggleMode() {
        mode = !mode;
    }
}
