package gr.aueb.cf.ch14Singleton_Reflection;

/**
 * Defines a Singleton that says
 * "Start th mission".
 */
public class SaintGeorgeKnight {
    private static final SaintGeorgeKnight INSTANCE = new SaintGeorgeKnight();

    private SaintGeorgeKnight() {

    }

    public static SaintGeorgeKnight getInstance() { return INSTANCE; }

    public void embarkOnMission() {
        System.out.println("Start the mission");
    }
}

