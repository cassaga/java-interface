public class Eagle extends Bird {

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }

    // quest

    public void takeOff() {
        if (!this.flying && this.altitude == 0) {
            this.flying = true;
            System.out.println(this.getName() + " takes off and starts flying.");
        }
    }

    public void ascend(int meters) {
        if (this.flying) {
            this.altitude += meters;
            System.out.println(this.getName() + " ascends, altitude: " + this.altitude);
        }
    }

    public void glide() {
        if (this.flying) {
            System.out.println(this.getName() + " glides through the air.");
        }
    }

    public void descend(int meters) {
        if (this.flying) {
            this.altitude = Math.max(0, this.altitude - meters);
            System.out.println(this.getName() + " descends, altitude: " + this.altitude);
        }
    }

    public void land() {
        if (this.flying && this.altitude == 0) {
            this.flying = false;
            System.out.println(this.getName() + " lands on the ground.");
        } else if (this.altitude > 0) {
            System.out.println(this.getName() + " is too high, cannot land.");
        }
    }
}

