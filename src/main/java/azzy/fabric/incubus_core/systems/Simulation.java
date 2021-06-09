package azzy.fabric.incubus_core.systems;

public enum Simulation {
    SIMULATE,
    ACT;

    public boolean isSimulating() {
        return this == SIMULATE;
    }

    public boolean isActing() {
        return this == ACT;
    }
}
