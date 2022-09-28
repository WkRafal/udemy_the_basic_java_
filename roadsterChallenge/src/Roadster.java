public class Roadster {
    float topSpeed;
    float acceleration;
    float crazyTopSpeed;
    float crazyAcceleration;

    Roadster(float topSpeed, float acceleration) {
        this.topSpeed = topSpeed;
        this.acceleration = acceleration;
    }

    Roadster(float topSpeed, float acceleration, float crazyAcceleration, float crazyTopSpeed) {
        this.topSpeed = topSpeed;
        this.acceleration = acceleration;
        this.crazyTopSpeed = crazyTopSpeed;
        this.crazyAcceleration = crazyAcceleration;
    }

    public float getTopSpeed() {
        return topSpeed;
    }

    public float getAcceleration() {
        return acceleration;
    }

    public float getTopSpeed(boolean crazyMode) {
        return (crazyMode) ? crazyTopSpeed : topSpeed;
    }

    public float getAcceleration(boolean crazyMode) {
        return (crazyMode) ? crazyAcceleration : acceleration;
    }

}
