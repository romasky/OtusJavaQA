package lesson13.driver_names;

public enum DriverName {
    CHROME ("chrome"),
    FIREFOX ("firefox"),
    EDGE ("edge");

    final String name;

    DriverName(String name) {
        this.name = name;
    }
}
