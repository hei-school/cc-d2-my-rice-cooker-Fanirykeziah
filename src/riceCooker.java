public class riceCooker {
    private boolean powerOn;
    private boolean cooking;
    private boolean warmMode;
    private boolean steamMode;
    private int cookingTime;
    private int warmTime;
    private int steamTime;
    private boolean socketStatus;

    public riceCooker(boolean powerOn, boolean cooking, boolean warmMode, boolean steamMode, int cookingTime, int warmTime, int steamTime, boolean socketStatus) {
        this.powerOn = powerOn;
        this.cooking = cooking;
        this.warmMode = warmMode;
        this.steamMode = steamMode;
        this.cookingTime = cookingTime;
        this.warmTime = warmTime;
        this.steamTime = steamTime;
        this.socketStatus = socketStatus;
    }

    public boolean isPowerOn() {
        return powerOn;
    }

    public void setPowerOn(boolean powerOn) {
        this.powerOn = powerOn;
    }

    public boolean isCooking() {
        return cooking;
    }

    public void setCooking(boolean cooking) {
        this.cooking = cooking;
    }

    public boolean isWarmMode() {
        return warmMode;
    }

    public void setWarmMode(boolean warmMode) {
        this.warmMode = warmMode;
    }

    public boolean isSteamMode() {
        return steamMode;
    }

    public void setSteamMode(boolean steamMode) {
        this.steamMode = steamMode;
    }

    public int getCookingTime() {
        return cookingTime;
    }

    public void setCookingTime(int cookingTime) {
        this.cookingTime = cookingTime;
    }

    public int getWarmTime() {
        return warmTime;
    }

    public void setWarmTime(int warmTime) {
        this.warmTime = warmTime;
    }

    public int getSteamTime() {
        return steamTime;
    }

    public void setSteamTime(int steamTime) {
        this.steamTime = steamTime;
    }

    public boolean isSocketStatus() {
        return socketStatus;
    }

    public void setSocketStatus(boolean socketStatus) {
        this.socketStatus = socketStatus;
    }
}
