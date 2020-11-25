package com.example.mbesha.model;

public class Item {
    private  int id;
    private String sendMoney;
    private String  withdraw;
    private String buyAirtime;
    private String myAccount;
    private String changeLanguage;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSendMoney() {
        return sendMoney;
    }

    public void setSendMoney(String sendMoney) {
        this.sendMoney = sendMoney;
    }

    public String getWithdraw() {
        return withdraw;
    }

    public void setWithdraw(String withdraw) {
        this.withdraw = withdraw;
    }

    public String getBuyAirtime() {
        return buyAirtime;
    }

    public void setBuyAirtime(String buyAirtime) {
        this.buyAirtime = buyAirtime;
    }

    public String getMyAccount() {
        return myAccount;
    }

    public void setMyAccount(String myAccount) {
        this.myAccount = myAccount;
    }

    public String getChangeLanguage() {
        return changeLanguage;
    }

    public void setChangeLanguage(String changeLanguage) {
        this.changeLanguage = changeLanguage;
    }

    public Item(int id, String sendMoney, String withdraw, String buyAirtime, String myAccount, String changeLanguage) {
        this.id = id;
        this.sendMoney = sendMoney;
        this.withdraw = withdraw;
        this.buyAirtime = buyAirtime;
        this.myAccount = myAccount;
        this.changeLanguage = changeLanguage;


    }
}
