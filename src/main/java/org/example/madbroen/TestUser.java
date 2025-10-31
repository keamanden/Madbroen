package org.example.madbroen;

public class TestUser {

    private String name;
    private String address;
    private String email;
    private int phoneNumber;
    private int CVR;
    private String mainContactName;
    private String userType;
    private int palletCount;
    private boolean statusNeedNotNeed;
    private String input;

    public TestUser() {}

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public int getCVR() {
        return CVR;
    }

    public String getMainContactName() {
        return mainContactName;
    }

    public String getUserType() {
        return userType;
    }

    @Override
    public String toString() {
        return "TestUser{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", CVR=" + CVR +
                ", mainContactName='" + mainContactName + '\'' +
                ", userType='" + userType + '\'' +
                ", palletCount=" + palletCount +
                ", statusNeedNotNeed=" + statusNeedNotNeed +
                ", input='" + input + '\'' +
                '}';
    }

    public int getPalletCount() {
        return palletCount;
    }

    public boolean isStatusNeedNotNeed() {
        return statusNeedNotNeed;
    }

    public String getInput() {
        return input;
    }

    public void setCVR(int CVR) {
        this.CVR = CVR;
    }

    public void setMainContactName(String mainContactName) {
        this.mainContactName = mainContactName;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public void setPalletCount(int palletCount) {
        this.palletCount = palletCount;
    }

    public void setStatusNeedNotNeed(boolean statusNeedNotNeed) {
        this.statusNeedNotNeed = statusNeedNotNeed;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public TestUser(String name, String address, String email, int phoneNumber, int CVR, String mainContactName, String userType, int palletCount, boolean statusNeedNotNeed, String input) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.CVR = CVR;
        this.palletCount = palletCount;
        this.statusNeedNotNeed = statusNeedNotNeed;
        this.mainContactName = mainContactName;
        this.userType = userType;

    }
}


